import java.text.NumberFormat;
import java.text.ParseException;

public class chequedUnchequedExceptions {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);

        try {
            Number num = NumberFormat.getInstance().parse("a1.75");
            System.out.println(num);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
