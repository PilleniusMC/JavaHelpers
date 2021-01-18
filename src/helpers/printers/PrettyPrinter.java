package helpers.printers;

public class PrettyPrinter {

    /**
     *
     * @param mode The border mode as a numeric value
     * @param stringToPrint The string, that is going to be printed prettily
     */
    public static void boxedPrint(int mode, String stringToPrint) {
        char[] borderElements = modeSelector(mode);
        String fullString = borderElements[2] + String.valueOf(borderElements[0]).repeat(stringToPrint.length()) + borderElements[3] +
                "\n" + borderElements[1] + stringToPrint + borderElements[1] + "\n" +
                borderElements[4] + String.valueOf(borderElements[0]).repeat(stringToPrint.length()) + borderElements[5];

        System.out.println(fullString);

    }

    /** A method to give access to different border modes. Defaults to light lines.
     *
     * @param mode The border mode as a numeric value
     * @return The border elements for the selected mode.
     */
    private static char[] modeSelector(int mode) {
        char[] borderElements = new char[6];
        switch (mode) {
            default:
            case 1:
                borderElements[0] = '─';
                borderElements[1] = '│';
                borderElements[2] = '┌';
                borderElements[3] = '┐';
                borderElements[4] = '└';
                borderElements[5] = '┘';
                break;
            case 2:
                borderElements[0] = '━';
                borderElements[1] = '┃';
                borderElements[2] = '┏';
                borderElements[3] = '┓';
                borderElements[4] = '┗';
                borderElements[5] = '┛';
                break;
            case 3:
                borderElements[0] = '═';
                borderElements[1] = '║';
                borderElements[2] = '╔';
                borderElements[3] = '╗';
                borderElements[4] = '╚';
                borderElements[5] = '╝';
                break;
        }
        return borderElements;
    }
}
