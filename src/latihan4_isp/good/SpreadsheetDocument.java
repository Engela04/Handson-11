package latihan4_isp.good;

// SpreadsheetDocument adalah full-featured document
// Implement semua capability kecuali Resizable
public class SpreadsheetDocument implements Readable, Editable, Printable, Calculable {
    private String filename;

    // Constructor
    public SpreadsheetDocument(String filename) {
        this.filename = filename;
    }

    @Override
    public void read() {
        System.out.println("[SpreadsheetDocument] Reading Spreadsheet: " + filename);
    }

    @Override
    public void edit(String content) {
        System.out.println("[SpreadsheetDocument] Editing Spreadsheet: " + filename + " with content: " + content);
    }

    @Override
    public void print() {
        System.out.println("[SpreadsheetDocument] Printing Spreadsheet: " + filename);
    }

    @Override
    public void calculate(String formula) {
        // Contoh output dummy
        System.out.println("[SpreadsheetDocument] Calculating formula: " + formula + " = 5500");
    }
}
