package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem1;
public class Box {

    private double length;
    private double width;
    private double height;
    private Double surfaceArea;
    private Double lateralSurfaceArea;
    private Double volume;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            //pole koeto e nevaliden parameter - IllegalArgument!
            throw  new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth (double width) {
        if (width <= 0) {
            //pole koeto e nevaliden parameter - IllegalArgument!
            throw  new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            //pole koeto e nevaliden parameter - IllegalArgument!
            throw  new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }


    public double calculateSurfaceArea() {
        //LAZY LOADING
        if (this.surfaceArea == null) {
            // tejkata rabota q vyrshim samo i edinstveno togava kogato nqkoi q potyrsi inache ne q vyrsha NIKOGA
            // t.e. kogato veche sme presmetnali "surfaceArea"...si go pazim - I NE GO SMQTAME VSEKI PYT
            // ne go smqtame vseki pyt s metoda "calculateSurfaceArea"!!!
            // ako ne sme go izhislqvali do sega, izchisli go i go vyrni!
            return this.surfaceArea = (2 * this.length * this.width) + (this.calculateLateralSurfaceArea());
        }
        //ako veche sme go izchislqvali i ne e ravno na null, to vyrni veche nashiqt rezultat;
        // gospodi boje, nqma vseki pyt da go smqtame q!!!!
        return this.surfaceArea;
    }


    public double calculateLateralSurfaceArea() {
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }


    public double calculateVolume() {
        return this.length * this.width * this.height;
    }



    @Override
    public String toString() {
        return String.format("Surface Area - %.2f\n" +
                "Lateral Surface Area - %.2f\n" +
                "Volume – %.2f",
                calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }

}
