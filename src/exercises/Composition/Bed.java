package exercises.Composition;

public class Bed {
    private final String style;
    private final int pillows;
    private final int height;
    private final int sheets;
    private final int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("the bed is being made");
    }

    public String getStyle() {
        return this.style;
    }

    public int getPillows() {
        return this.pillows;
    }

    public int getHeight() {
        return this.height;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getQuilt() {
        return this.quilt;
    }
}
