public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {

        double maximum = 206.3 - (0.711 * age);
        double result = (maximum - restingHeartRate) * percentageOfMaximum + restingHeartRate;
        return result;
    }
    
}
