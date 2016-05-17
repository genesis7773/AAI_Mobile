package aai.aai_mobile.JSON;



/**
 * Created by John on 1/26/2016.
 */

public class AHU {


    public final int AHU_ID;

    /*basic AHU info*/
    public final String name;
    public final String location;
    public final String areaServed;
    public final String manufacturer;
    public final String model;
    public final String serialNumber;

    /*cfm and static pressure info with motor rpm*/
    public final int cfmFan;
    public final int cfmOutlet;
    public final int returnCFM;
    public final int outsideAir;
    public final double staticP;
    public final double inletP;
    public final double dischargeP;
    public final int rpm1;

    /*Motor section taken from pictures*/
    public final String MotorManufacturer;
    public final double hp;
    public final String frame;
    public final int voltage;
    public final int phase;
    public final double amps;


    public AHU(int AHU_ID, String name, String location, String areaServed, String manufacturer, String model,
               String serialNumber, int cfmFan, int cfmOutlet, int returnCFM, int outsideAir, double staticP,
               double inletP, double dischargeP, int rpm1, String motorManufacturer, double hp, String frame,
               int voltage, int phase, double amps) {
        this.AHU_ID = AHU_ID;
        this.name = name;
        this.location = location;
        this.areaServed = areaServed;
        this.manufacturer = manufacturer;
        this.model = model;
        this.serialNumber = serialNumber;
        this.cfmFan = cfmFan;
        this.cfmOutlet = cfmOutlet;
        this.returnCFM = returnCFM;
        this.outsideAir = outsideAir;
        this.staticP = staticP;
        this.inletP = inletP;
        this.dischargeP = dischargeP;
        this.rpm1 = rpm1;
        this.MotorManufacturer = motorManufacturer;
        this.hp = hp;
        this.frame = frame;
        this.voltage = voltage;
        this.phase = phase;
        this.amps = amps;
    }



    @Override public String toString(){
        return "AHU ID: " + String.valueOf(AHU_ID) + ", Name: " + name + ", Serial: " +serialNumber + " .";
    }
}



