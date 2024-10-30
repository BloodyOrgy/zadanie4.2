import BmiService.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();


        int weighInKg = 98;
        double heigtInMeters = 1.87;
        int index = service.calculate(weighInKg, heigtInMeters);
        System.out.println(index);
    }
}