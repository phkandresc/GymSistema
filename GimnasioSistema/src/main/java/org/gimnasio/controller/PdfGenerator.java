package org.gimnasio.controller;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.gimnasio.model.Factura;
import org.gimnasio.model.Pago;
import org.gimnasio.model.Socio;
import org.gimnasio.model.Membresia;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;

public class PdfGenerator {

    public static void generatePdf(Factura factura, String outputPath) throws IOException {
        // Leer la plantilla HTML
        String htmlTemplate = new String(Files.readAllBytes(Paths.get("src/main/resources/templates/PlantillaFactura.html")));

        // Reemplazar los marcadores de posición con los datos de la factura
        htmlTemplate = htmlTemplate.replace("{nombre_cliente}", factura.getPago().getSocio().getNombre());
        htmlTemplate = htmlTemplate.replace("{direccion_cliente}", factura.getPago().getSocio().getDireccion());
        htmlTemplate = htmlTemplate.replace("{telefono_cliente}", factura.getPago().getSocio().getNumeroTelefono());
        htmlTemplate = htmlTemplate.replace("{email_cliente}", factura.getPago().getSocio().getEmail());

        htmlTemplate = htmlTemplate.replace("{numero_factura}", factura.getNumeroFactura());
        htmlTemplate = htmlTemplate.replace("{fecha_factura}", factura.getFechaEmision().toString());

        htmlTemplate = htmlTemplate.replace("{descripcion_1}", factura.getDetalle());
        htmlTemplate = htmlTemplate.replace("{cantidad_1}", "1");
        htmlTemplate = htmlTemplate.replace("{precio_unitario_1}", String.valueOf(factura.getSubtotal()));
        htmlTemplate = htmlTemplate.replace("{total_1}", String.valueOf(factura.getTotal()));

        htmlTemplate = htmlTemplate.replace("{subtotal}", String.valueOf(factura.getSubtotal()));
        htmlTemplate = htmlTemplate.replace("{iva}", String.valueOf(factura.getIva()));
        htmlTemplate = htmlTemplate.replace("{monto_iva}", String.valueOf(factura.getSubtotal() * (factura.getIva() / 100)));
        htmlTemplate = htmlTemplate.replace("{total}", String.valueOf(factura.getTotal()));

        // Configurar el convertidor de HTML a PDF
        ConverterProperties converterProperties = new ConverterProperties();

        // Configurar el proveedor de fuentes
        DefaultFontProvider defaultFontProvider = new DefaultFontProvider(true, true, true);
        converterProperties.setFontProvider(defaultFontProvider);

        // Crear el documento PDF
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            PdfWriter writer = new PdfWriter(baos);
            PdfDocument pdfDocument = new PdfDocument(writer);

            pdfDocument.setDefaultPageSize(PageSize.A4);

            // Convertir HTML a PDF
            HtmlConverter.convertToPdf(htmlTemplate, pdfDocument, converterProperties);
            pdfDocument.close();

            // Escribir el contenido a un archivo
            try (FileOutputStream fos = new FileOutputStream(outputPath)) {
                fos.write(baos.toByteArray());
            }
        }
    }

    public static void main(String[] args) {
        // Crear una factura de ejemplo
        Socio socio = new Socio();
        socio.setNombre("John Doe");
        socio.setDireccion("123 Main St");
        socio.setNumeroTelefono("123-456-7890");
        socio.setEmail("fsadfdsa@fafdsa.com");
        socio.setApellido("fssssss");

        Membresia membresia = new Membresia(socio, null, 1, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));

        Pago pago = new Pago.Builder()
                .id(1)
                .socio(socio)
                .membresia(membresia)
                .monto(100.0)
                .fechaPago(new Date(System.currentTimeMillis()))
                .metodoPago("Tarjeta de crédito")
                .tipoPago("Mensual")
                .build();

        Factura factura = new Factura.Builder()
                .id(1)
                .pago(pago)
                .numeroFactura("0001")
                .fechaEmision(new Date(System.currentTimeMillis()))
                .detalle("Pago de membresia")
                .subtotal(100.0)
                .iva(12.0)
                .total(112.0)
                .build();

        try {
            generatePdf(factura, "factura.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


