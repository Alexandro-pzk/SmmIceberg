import java.text.DecimalFormat;
import java.util.SortedSet;
import java.util.TreeSet;

public class Book {
    private static final DecimalFormat formatter = new DecimalFormat();
    private static final String LINE = "+-----------------------------------------------------------------+";
    private static final String SPACE = " ";
    private static final char LINE_SEPARATOR = '\n';
    private static final char CELL_SEPARATOR = '|';
    private static final int TOP_LABEL_LENGTH = 32;
    private static final int ID_LENGTH = 10;
    private static final int VOLUME_LENGTH = 13;
    private static final int PRICE_LENGTH = 7;

    private final SortedSet<SellOrder> sellOrders = new TreeSet<>();
    private final SortedSet<BuyOrder> buyOrders = new TreeSet<>();

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(LINE).append(LINE_SEPARATOR);
        out.append(CELL_SEPARATOR).append(getCellLabel("BUY", TOP_LABEL_LENGTH)).append(CELL_SEPARATOR).append(getCellLabel("SELL", TOP_LABEL_LENGTH)).append(CELL_SEPARATOR).append(LINE_SEPARATOR);
        out.append(CELL_SEPARATOR).append(getCellLabel("Id", ID_LENGTH)).append(CELL_SEPARATOR).append(getCellLabel("Volume", VOLUME_LENGTH)).append(CELL_SEPARATOR).append(getCellLabel("Price", PRICE_LENGTH)).append(CELL_SEPARATOR).append(getCellLabel("Price", PRICE_LENGTH)).append(CELL_SEPARATOR).append(getCellLabel("Volume", VOLUME_LENGTH)).append(CELL_SEPARATOR).append(getCellLabel("Id", ID_LENGTH)).append(CELL_SEPARATOR).append(LINE_SEPARATOR);
        out.append(LINE).append(LINE_SEPARATOR);

        out.append("test").append(LINE_SEPARATOR);

        out.append(LINE);
        return out.toString();
    }

    private String getFormattedCellNumber(int number, int length) {
        String formatted = (number == 0) ? "" : formatter.format(number);
        return getCellNumber(formatted, length);
    }

    private String getCellNumber(int number, int length) {
        String num = (number == 0) ? "" : Integer.toString(number);
        return getCellNumber(num, length);
    }

    private String getCellNumber(String number, int length) {
        if (length <= number.length()) {
            return number;
        }

        StringBuilder sb = new StringBuilder(length);
        String spaces = SPACE.repeat(length - number.length());
        return sb.append(spaces).append(number).toString();
    }

    private String getCellLabel(String label, int length) {
        if (length <= label.length() + 1) {
            return SPACE + label;
        }

        StringBuilder sb = new StringBuilder(length);
        String spaces = SPACE.repeat(length - label.length() - 1);
        return sb.append(SPACE).append(label).append(spaces).toString();
    }
}
