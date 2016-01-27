package aai.aai_mobile;


/**
 * Created by John on 1/26/2016.
 */
public class AHU {
    /*basic AHU info*/
    private String name = "";
    private String location = "";
    private String areaServed = "";
    private String manufacturer2 = "";
    private String model = "";
    private String serialNumber = "";

    /*cfm and static pressure info with motor rpm*/
    private int cfmFan = 0;
    private int cmfOutlet = 0;
    private int returnCFM = 0;
    private int outsideAir = 0;
    private double staticP = 0.0;
    private double inletP = 0.0;
    private double dischargeP = 0.0;
    private int rpm1 = 0;

    /*Motor section taken from pictures*/
    private String manufacturer = "";
    private double hp = 0.0;
    private String frame = "";
    private int voltage = 0;
    private int phase = 0;
    private double amps = 0;


}
