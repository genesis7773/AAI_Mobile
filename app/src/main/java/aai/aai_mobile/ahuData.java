package aai.aai_mobile;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Aladdin on 1/25/2016.
 */
public class ahuData implements Parcelable {
    //AHU
    private String ahuNameData;
    private String ahuLocationData;
    private String areaServedData;
    private String equipManuData;
    private String ahuModelData;
    private String ahuSerialData;


    //CFM
    private String totalCFMFanSpecified;
    private String totalCFMFanActual;
    private String totalCFMOutletSpecified;
    private String totalCFMOutletActual;
    private String returnAirSpecified;
    private String returnAirActual;
    private String outsideAirSpecified;
    private String outsideAirActual;
    private String staticPressureSpecified;
    private String staticPressureActual;
    private String inletActual;
    private String dischActual;
    private String FanRPMSpecified;
    private String FanRPMActual;


    //Nameplate
    private String MotorManu;
    private String nameplateHP;
    private String BrakeHP;
    private String frameSize;
    private String voltage;
    private String phase;
    private String amperage;
    private String motorRPM;
    private String serviceFactor;
    private String masterSheave;
    private String fanSheave;
    private String beltSize;
    private String filter;

    //Comments
    private String comments;

    //Notes
    private String noteData;
    //Setters


    public void setAhuNameData(String name){
        ahuNameData = name;
    }

    public void setAhuLocationData(String location){
        ahuLocationData = location;
    }

    public void setAreaServedData(String area){
        areaServedData = area;
    }

    public void setEquipManuData(String equipment){
        equipManuData = equipment;
    }

    public void setAhuModelData(String model){
        ahuModelData = model;
    }

    public void setAhuSerialData(String serial){
        ahuSerialData = serial;
    }

    public void setTotalCFMFanSpecified(String tcfnfs){
        totalCFMFanSpecified = tcfnfs;
    }

    public void setTotalCFMFanActual(String tcfmfa){
        totalCFMFanActual = tcfmfa;
    }

    public void setTotalCFMOutletSpecified(String tcfmos){
        totalCFMOutletSpecified = tcfmos;
    }

    public void setTotalCFMOutletActual(String tcfmoa){
        totalCFMOutletActual = tcfmoa;
    }

    public void setReturnAirSpecified(String returnS){
        returnAirSpecified = returnS;
    }

    public void setReturnAirActual(String returnA){
        returnAirActual = returnA;
    }

    public void setOutsideAirSpecified(String outsideS){
        outsideAirSpecified = outsideS;
    }

    public void setOutsideAirActual(String outsideA){
        outsideAirActual = outsideA;
    }

    public void setStaticPressureSpecified(String staticSpec){
        staticPressureSpecified = staticSpec;

    }
    public void setStaticPressureActual(String staticActual){
        staticPressureActual = staticActual;
    }

    public void setInletActual(String inlet){
        inletActual = inlet;
    }

    public void setDischActual(String disch){
        dischActual = disch;
    }

    public void setFanRPMSpecified(String fanSpec){
        FanRPMSpecified = fanSpec;
    }

    public void setFanRPMActual(String fanActual){
        FanRPMActual = fanActual;
    }

    public void setMotorManu(String motor){
        MotorManu = motor;
    }

    public void setNameplateHP(String nameplate){
        nameplateHP = nameplate;
    }

    public void setBrakeHP(String brake){
        BrakeHP = brake;
    }

    public void setFrameSize(String frame){
        frameSize = frame;
    }

    public void setVoltage(String volt){
        voltage = volt;
    }

    public void setPhase(String ph){
        phase = ph;
    }

    public void setAmperage(String amp){
        amperage = amp;
    }

    public void setMotorRPM(String mrpm){
        motorRPM = mrpm;
    }

    public void setServiceFactor(String service){
        serviceFactor = service;
    }

    public void setMasterSheave(String ms){
        masterSheave = ms;
    }

    public void setFanSheave(String fs){
        fanSheave = fs;
    }

    public void setBeltSize(String bs){
        beltSize = bs;
    }

    public void setFilter(String fit){
        filter = fit;
    }

    public void setComments(String com) { comments = com; }

    public void setNoteData(String notes) { noteData = notes; }

    //Getters


    public String getahuNameData(){ return ahuNameData; }

    public String getAhuLocationData(){
        return ahuLocationData;
    }

    public String getAreaServedData(){
        return areaServedData;
    }

    public String getEquipManuData(){
        return equipManuData;
    }

    public String getAhuModelData(){
        return ahuModelData;
    }

    public String getAhuSerialData(){
        return ahuSerialData;
    }

    public String getTotalCFMFanSpecified() {
        return totalCFMFanSpecified;
    }

    public String getTotalCFMFanActual() {
        return totalCFMFanActual;
    }

    public String getTotalCFMOutletSpecified() {
        return totalCFMOutletSpecified;
    }

    public String getTotalCFMOutletActual() {
        return totalCFMOutletActual;
    }

    public String getReturnAirSpecified() {
        return returnAirSpecified;
    }

    public String getReturnAirActual() {
        return returnAirActual;
    }

    public String getOutsideAirSpecified() {
        return outsideAirSpecified;
    }

    public String getOutsideAirActual() {
        return outsideAirActual;
    }

    public String getStaticPressureSpecified() {
        return staticPressureSpecified;
    }

    public String getStaticPressureActual() {
        return staticPressureActual;
    }

    public String getInletActual() {
        return inletActual;
    }

    public String getDischActual() {
        return dischActual;
    }

    public String getFanRPMSpecified() {
        return FanRPMSpecified;
    }

    public String getFanRPMActual() {
        return FanRPMActual;
    }

    public String getMotorManu() {
        return MotorManu;
    }

    public String getNameplateHP() {
        return nameplateHP;
    }

    public String getBrakeHP() {
        return BrakeHP;
    }

    public String getFrameSize() {
        return frameSize;
    }

    public String getVoltage() {
        return voltage;
    }

    public String getPhase() {
        return phase;
    }

    public String getAmperage() {
        return amperage;
    }

    public String getMotorRPM() {
        return motorRPM;
    }

    public String getServiceFactor() {
        return serviceFactor;
    }

    public String getMasterSheave() {
        return masterSheave;
    }

    public String getFanSheave() {
        return fanSheave;
    }

    public String getBeltSize() {
        return beltSize;
    }

    public String getFilter() {
        return filter;
    }

    public String getComments(){ return comments;}

    public String getNoteData(){ return noteData;}
    @Override
    public int describeContents(){
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(ahuNameData);
        dest.writeString(ahuLocationData);
        dest.writeString(areaServedData);
        dest.writeString(equipManuData);
        dest.writeString(ahuModelData);
        dest.writeString(ahuSerialData);
        dest.writeString(totalCFMFanSpecified);
        dest.writeString(totalCFMFanActual);
        dest.writeString(totalCFMOutletSpecified);
        dest.writeString(totalCFMOutletActual);
        dest.writeString(returnAirSpecified);
        dest.writeString(returnAirActual);
        dest.writeString(outsideAirSpecified);
        dest.writeString(outsideAirActual);
        dest.writeString(staticPressureSpecified);
        dest.writeString(staticPressureActual);
        dest.writeString(inletActual);
        dest.writeString(dischActual);
        dest.writeString(FanRPMSpecified);
        dest.writeString(FanRPMActual);
        dest.writeString(MotorManu);
        dest.writeString(nameplateHP);
        dest.writeString(BrakeHP);
        dest.writeString(frameSize);
        dest.writeString(voltage);
        dest.writeString(phase);
        dest.writeString(amperage);
        dest.writeString(motorRPM);
        dest.writeString(serviceFactor);
        dest.writeString(masterSheave);
        dest.writeString(fanSheave);
        dest.writeString(beltSize);
        dest.writeString(filter);
        dest.writeString(comments);
        dest.writeString(noteData);
    }

    public ahuData(Parcel p){
        ahuNameData = p.readString();
        ahuLocationData = p.readString();
        areaServedData = p.readString();
        equipManuData = p.readString();
        ahuModelData = p.readString();
        ahuSerialData = p.readString();
        totalCFMFanSpecified = p.readString();
        totalCFMFanActual = p.readString();
        totalCFMOutletSpecified = p.readString();
        totalCFMOutletActual = p.readString();
        returnAirSpecified = p.readString();
        returnAirActual = p.readString();
        outsideAirSpecified = p.readString();
        outsideAirActual = p.readString();
        staticPressureSpecified = p.readString();
        staticPressureActual = p.readString();
        inletActual = p.readString();
        dischActual = p.readString();
        FanRPMSpecified = p.readString();
        FanRPMActual = p.readString();
        MotorManu = p.readString();
        nameplateHP = p.readString();
        BrakeHP = p.readString();
        frameSize = p.readString();
        voltage = p.readString();
        phase = p.readString();
        amperage = p.readString();
        motorRPM = p.readString();
        serviceFactor = p.readString();
        masterSheave = p.readString();
        fanSheave = p.readString();
        beltSize = p.readString();
        filter = p.readString();
        comments = p.readString();
        noteData = p.readString();
    }

    public ahuData(){}

    public static final Parcelable.Creator<ahuData> CREATOR = new Parcelable.ClassLoaderCreator<ahuData>(){


        @Override
        public ahuData createFromParcel(Parcel parcel, ClassLoader loader){
            return new ahuData(parcel);
        }

        @Override
        public ahuData createFromParcel(Parcel source) {
            return new ahuData(source);
        }

        @Override
        public ahuData[] newArray(int size){
            return new ahuData[size];
        }
    };


}