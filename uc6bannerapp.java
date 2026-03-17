public class uc6bannerapp {


    public static String line1() {
        return String.join("   ", " ***** ", " ***** ", " ******", " ***** ");
    }

    public static String line2() {
        return String.join("   ", "*     *", "*     *", "*     *", "*     ");
    }

    public static String line3() {
        return String.join("   ", "*     *", "*     *", "*     *", "*     ");
    }

    public static String line4() {
        return String.join("   ", "*     *", "*     *", " ******", " ***** ");
    }

    public static String line5() {
        return String.join("   ", "*     *", "*     *", "*      ", "      *");
    }

    public static String line6() {
        return String.join("   ", "*     *", "*     *", "*      ", "      *");
    }

    public static String line7() {
        return String.join("   ", " ***** ", " ***** ", "*      ", " ***** ");
    }

    public static void main(String[] args) {

        String[] banner = {
            line1(),
            line2(),
            line3(),
            line4(),
            line5(),
            line6(),
            line7()
        };

        for (String line : banner) {
            System.out.println(line);
        }
    
}
}
