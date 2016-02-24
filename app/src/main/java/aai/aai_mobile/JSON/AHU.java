package aai.aai_mobile.JSON;


/**
 * Created by John on 1/26/2016.
 */

public class AHU {


    private int AHU_ID;

    /*basic AHU info*/
    private String name;
    private String location;
    private String areaServed;
    private String manufacturer;
    private String model;
    private String serialNumber;

    /*cfm and static pressure info with motor rpm*/
    private int cfmFan;
    private int cfmOutlet;
    private int returnCFM;
    private int outsideAir;
    private double staticP;
    private double inletP;
    private double dischargeP;
    private int rpm1;

    /*Motor section taken from pictures*/
    private String MotorManufacturer;
    private double hp;
    private String frame;
    private int voltage;
    private int phase;
    private double amps;


}
