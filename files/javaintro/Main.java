public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 85;
        float height = 1.75f;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
