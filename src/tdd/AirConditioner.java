package tdd;

public class AirConditioner {
    private boolean  acSwitch;
    private int acTemperature;

    public  boolean getAcSwitch () {
        return acSwitch;
    }

    public void setAcSwitchOn (boolean on) {
        acSwitch = true;
    }

    public void setAcSwitchOff (boolean off) {
        acSwitch = true;
    }

    public void setAcTemperature (int degree) {
        acTemperature = degree;
    }

    public void increaseTemperature () {

    }

    public int getAcTemperature () {
        return acTemperature;

    }

}
