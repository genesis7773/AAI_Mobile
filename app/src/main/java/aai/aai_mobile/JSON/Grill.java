package aai.aai_mobile.JSON;

/**
 * Created by Aladdin on 2/22/2016.
 */
public class Grill {


    private int Grill_id;

    private String systemName;
    private int outletNumber;
    private String type;
    private String size;
    private String factor;
    private double designFPM;
    private double designCFM;
    private double initialCFM;
    private double initialCFM2;
    private double finalFPM;
    private double finalCFM;
    private String[] notes;

    public int getGrill_id() {
        return Grill_id;
    }

    public void setChiller_id(int grill_id) {
        this.Grill_id = grill_id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getOutletNumber() {
        return outletNumber;
    }

    public void setOutletNumber(int outletNumber) {
        this.outletNumber = outletNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public double getDesignFPM() {
        return designFPM;
    }

    public void setDesignFPM(double designFPM) {
        this.designFPM = designFPM;
    }

    public double getDesignCFM() {
        return designCFM;
    }

    public void setDesignCFM(double designCFM) {
        this.designCFM = designCFM;
    }

    public double getInitialCFM() {
        return initialCFM;
    }

    public void setInitialCFM(double initialCFM) {
        this.initialCFM = initialCFM;
    }

    public double getInitialCFM2() {
        return initialCFM2;
    }

    public void setInitialCFM2(double initialCFM2) {
        this.initialCFM2 = initialCFM2;
    }

    public double getFinalFPM() {
        return finalFPM;
    }

    public void setFinalFPM(double finalFPM) {
        this.finalFPM = finalFPM;
    }

    public double getFinalCFM() {
        return finalCFM;
    }

    public void setFinalCFM(double finalCFM) {
        this.finalCFM = finalCFM;
    }

    public String[] getNotes() {
        return notes;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }


}
