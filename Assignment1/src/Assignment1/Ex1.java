package Assignment1;
public class Ex1 {
    public static double CalculatePriceNetto(double priceBrutto, double vatValue) {
        double result = priceBrutto / (1 + (vatValue / 100));
        return result;
    }
}