package BmiService;

public class BmiService {

    public int calculate(int weighInKg, double heigtInMeters) {
        double bmi = weighInKg / heigtInMeters / heigtInMeters;
        return (int) bmi;
    }

}
