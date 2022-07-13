public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 60.312f;
        float heightM = 1.635f;
        float bmi = service.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}