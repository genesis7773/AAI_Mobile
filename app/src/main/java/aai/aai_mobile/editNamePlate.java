package aai.aai_mobile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringWriter;




/**
 * Created by Aladdin on 1/19/2016.
 */
public class editNamePlate extends AppCompatActivity {


    private EditText namePlateMotor, namePlateHP, namePlateBrakeHP, namePlateFrameSize, namePlatePhase, namePlateVolt, namePlateAmp, namePlateMotorRPM, namePlateService, namePlateMasterSheave, namePlateFanSheave, namePlateBelt, namePlateFilter;
    private Button btnSave;
    private Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_nameplate);
        namePlateMotor = (EditText) findViewById(R.id.namePlateMotor);
        namePlateHP = (EditText) findViewById(R.id.namePlateHP);
        namePlateBrakeHP = (EditText) findViewById(R.id.namePlateBrakeHP);
        namePlateFrameSize = (EditText) findViewById(R.id.namePlateFrameSize);
        namePlatePhase = (EditText) findViewById(R.id.namePlatePhase);
        namePlateVolt = (EditText) findViewById(R.id.namePlateVoltage);
        namePlateAmp = (EditText) findViewById(R.id.namePlateAmperage);
        namePlateMotorRPM = (EditText) findViewById(R.id.namePlateMotorRPM);
        namePlateService = (EditText) findViewById(R.id.namePlateService);
        namePlateMasterSheave = (EditText) findViewById(R.id.mTRShaft);
        namePlateFanSheave = (EditText) findViewById(R.id.fanShaft);
        namePlateBelt = (EditText) findViewById(R.id.beltQuant);
        namePlateFilter = (EditText) findViewById(R.id.filterQuant);

        btnSave = (Button) findViewById(R.id.btnSaveNamePlate);

        context = this.getApplicationContext();
        addListenerOnButton();
    }

    //Functions
    private String getNamePlateMotor(){

        return namePlateMotor.getText().toString();

    }

    private String getNamePlateHP(){

        return namePlateHP.getText().toString();

    }

    private String getNamePlateBrakeHP(){


        return namePlateBrakeHP.getText().toString();

    }

    private String getNamePlateFrameSize(){

        return namePlateFrameSize.getText().toString();
    }

    private String getNamePlatePhase(){

        return namePlatePhase.getText().toString();
    }

    private String getNamePlateVolt(){

        return namePlateVolt.getText().toString();
    }

    private String getNamePlateAMP(){

        return namePlateAmp.getText().toString();
    }

    private String getNamePlateMotorRPM(){

        return namePlateMotorRPM.getText().toString();
    }

    private  String getNamePlateService(){

        return namePlateService.getText().toString();
    }


    private String getNamePlateMasterSheave(){

        return namePlateMasterSheave.getText().toString();
    }

    private String getNamePlateFanSheave(){

        return namePlateFanSheave.getText().toString();

    }

    private String getNamePlateBelt(){

        return namePlateBelt.getText().toString();

    }

    private String getNamePlateFilter(){

        return namePlateFilter.getText().toString();

    }







    //Method to grab and write data
    private void grabAllData(String sFile, String sFile2){

        Intent i = getIntent();
        ahuData current = i.getParcelableExtra("ahuData");

        String namePlateMotor = getNamePlateMotor();
        String namePlateHP = getNamePlateHP();
        String namePlateBrake = getNamePlateBrakeHP();
        String namePlateFrameSize = getNamePlateFrameSize();
        String namePlatePhase = getNamePlatePhase();
        String namePlateVolt = getNamePlateVolt();
        String namePlateAMP = getNamePlateAMP();
        String namePlateMotorRPM = getNamePlateMotorRPM();
        String namePlateService = getNamePlateService();
        String namePlateMasterSheave = getNamePlateMasterSheave();
        String namePlateFanSheave = getNamePlateFanSheave();
        String namePlateBelt = getNamePlateBelt();
        String namePlateFilter = getNamePlateFilter();
        XmlSerializer serializer = Xml.newSerializer();
        StringWriter sWriter = new StringWriter();
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "AAI_Mobile" + "/" + sFile);
            FileOutputStream fos = new FileOutputStream(file, true);
            serializer.setOutput(sWriter);
            serializer.startDocument("UTF-8", true);
            serializer.startTag(null, "NamePlateData");
            serializer.startTag(null, "namePlateMotor");
            serializer.text(namePlateMotor);
            serializer.endTag(null, "namePlateMotor");
            serializer.startTag(null, "namePlateHP");
            serializer.text(namePlateHP);
            serializer.endTag(null, "namePlateHP");
            serializer.startTag(null, "namePlateBrake");
            serializer.text(namePlateBrake);
            serializer.endTag(null, "namePlateBrake");
            serializer.startTag(null, "namePlateFrameSize");
            serializer.text(namePlateFrameSize);
            serializer.endTag(null, "namePlateFrameSize");
            serializer.startTag(null, "namePlatePhase");
            serializer.text(namePlatePhase);
            serializer.endTag(null, "namePlatePhase");
            serializer.startTag(null, "namePlateVolt");
            serializer.text(namePlateVolt);
            serializer.endTag(null, "namePlateVolt");
            serializer.startTag(null, "namePlateAMP");
            serializer.text(namePlateAMP);
            serializer.endTag(null, "namePlateAMP");
            serializer.startTag(null, "namePlateMotorRPM");
            serializer.text(namePlateMotorRPM);
            serializer.endTag(null, "namePlateMotorRPM");
            serializer.startTag(null, "namePlateService");
            serializer.text(namePlateService);
            serializer.endTag(null, "namePlateService");
            serializer.startTag(null, "namePlateMasterSheave");
            serializer.text(namePlateMasterSheave);
            serializer.endTag(null, "namePlateMasterSheave");
            serializer.startTag(null, "namePlateFanSheave");
            serializer.text(namePlateFanSheave);
            serializer.endTag(null, "namePlateFanSheave");
            serializer.startTag(null, "namePlateBelt");
            serializer.text(namePlateBelt);
            serializer.endTag(null, "namePlateBelt");
            serializer.startTag(null, "namePlateFilter");
            serializer.text(namePlateFilter);
            serializer.endTag(null, "namePlateFilter");
            serializer.endTag(null, "NamePlateData");
            serializer.endDocument();
            serializer.flush();
            String dataWrite = sWriter.toString();
            fos.write(dataWrite.getBytes());
            fos.close();
            Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();
        } catch ( Exception e) {
            Log.e("AAI_Mobile", "exception", e);
            Toast.makeText(getBaseContext(), "Error, check log!", Toast.LENGTH_SHORT).show();
        }

        try {

            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet spreadsheet = wb.createSheet("AIRHAND");
            //insert logo image into cell
            InputStream input = new FileInputStream(String.valueOf((getResources().openRawResource(R.raw.aaispreadsheetlogo))));

            byte[] imageBytes = IOUtils.toByteArray(input);
            int pictureIDx = wb.addPicture(imageBytes, Workbook.PICTURE_TYPE_PNG);
            input.close();

            CreationHelper helper = wb.getCreationHelper();
            Drawing logo = spreadsheet.createDrawingPatriarch();
            ClientAnchor anchor = helper.createClientAnchor();

            anchor.setCol1(1);
            anchor.setRow1(3);

            logo.createPicture(anchor, pictureIDx);
            //Begin rest of sheet here
            HSSFRow row = spreadsheet.createRow(4);
            HSSFCell cell = row.createCell(5);
            cell.setCellValue("Date:");
            HSSFRow row1 = spreadsheet.createRow(5);
            cell = row1.createCell(5);
            cell.setCellValue("Rev.Date:");
            HSSFRow row2 = spreadsheet.createRow(6);
            cell = row2.createCell(5);
            cell.setCellValue("Project#:");
            HSSFRow row3 = spreadsheet.createRow(7);
            cell = row3.createCell(5);
            cell.setCellValue("Page:");

            //Default font
            HSSFFont defaultFont = wb.createFont();
            defaultFont.setFontHeightInPoints((short) 10);
            defaultFont.setFontName("Arial");
            defaultFont.setColor(IndexedColors.BLACK.getIndex());
            defaultFont.setBold(false);
            defaultFont.setItalic(false);
            //Bold font
            HSSFFont boldDefaultFont = wb.createFont();
            boldDefaultFont.setFontHeightInPoints((short) 10);
            boldDefaultFont.setFontName("Arial");
            boldDefaultFont.setColor(IndexedColors.BLACK.getIndex());
            boldDefaultFont.setBold(true);
            boldDefaultFont.setItalic(false);
            //Cell Style for banner
            HSSFCellStyle cellStyle = wb.createCellStyle();
            cellStyle.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            cellStyle.setFont(boldDefaultFont);
            //Cell Styles for charts
            HSSFCellStyle cellStyle2 = wb.createCellStyle();
            cellStyle2.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle2.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle2.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            cellStyle2.setAlignment(HSSFCellStyle.ALIGN_LEFT);
            HSSFCellStyle cellStyle3 = wb.createCellStyle();
            cellStyle3.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle3.setBorderTop(HSSFCellStyle.BORDER_THIN);
            cellStyle3.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle3.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            cellStyle3.setAlignment(HSSFCellStyle.ALIGN_LEFT);
            HSSFCellStyle cellStyle4 = wb.createCellStyle();
            cellStyle4.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle4.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle4.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle4.setBorderTop(HSSFCellStyle.BORDER_THIN);
            cellStyle4.setAlignment(HSSFCellStyle.ALIGN_LEFT);
            HSSFCellStyle cellStyle5 = wb.createCellStyle(); //For chart box left
            cellStyle5.setFillBackgroundColor((short) Color.GRAY);
            cellStyle5.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle5.setBorderRight(HSSFCellStyle.BORDER_THIN);
            cellStyle5.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            cellStyle5.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle5.setFont(boldDefaultFont);
            HSSFCellStyle cellStyle6 = wb.createCellStyle(); //For chart box right
            cellStyle6.setFillBackgroundColor((short)Color.GRAY);
            cellStyle6.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            cellStyle6.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle6.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            cellStyle6.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
            cellStyle6.setFont(boldDefaultFont);

          //Header
            HSSFRow row4 = spreadsheet.createRow(10);
            cell = row4.createCell(1);
            cell.setCellStyle(cellStyle);
            spreadsheet.addMergedRegion(new CellRangeAddress(
                    10,
                    10,
                    1,
                    6
            ));
            cell.setCellValue("Air Moving Equipment Test Sheet");
            //new cell starts here. This is a huge pain in the ass.
            HSSFRow row5 = spreadsheet.createRow(12);
            cell = row5.createCell(1);
            //Back to the chart, start AHU chart



            cell.setCellValue("Fan System");
            cell.setCellStyle(cellStyle2);
            cell = row5.createCell(2);
            cell.setCellValue(current.getahuNameData());
            cell.setCellStyle(cellStyle2);
            cell = row5.createCell(3);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("Comments");
            HSSFRow row6 = spreadsheet.createRow(13);
            cell = row6.createCell(1);
            cell.setCellStyle(cellStyle3);
            cell.setCellValue("Equipment Location");
            cell = row6.createCell(2);
            cell.setCellStyle(cellStyle3);
            cell.setCellValue(current.getAhuLocationData());
            HSSFRow row7 = spreadsheet.createRow(14);
            cell = row7.createCell(1);
            cell.setCellStyle(cellStyle3);
            cell.setCellValue("Area Served");
            cell = row7.createCell(2);
            cell.setCellValue(current.getAreaServedData());
            cell.setCellStyle(cellStyle3);
            HSSFRow row8 = spreadsheet.createRow(15);
            cell = row8.createCell(1);
            cell.setCellStyle(cellStyle3);
            cell.setCellValue("Equipment Manufacturer");
            cell = row8.createCell(2);
            cell.setCellValue(current.getEquipManuData());
            cell.setCellStyle(cellStyle3);
            HSSFRow row9 = spreadsheet.createRow(16);
            cell = row9.createCell(1);
            cell.setCellStyle(cellStyle3);
            cell.setCellValue("Model");
            cell = row9.createCell(2);
            cell.setCellStyle(cellStyle3);
            cell.setCellValue(current.getAhuModelData());
            HSSFRow row10 = spreadsheet.createRow(17);
            cell = row10.createCell(1);
            cell.setCellValue("Serial Number");
            cell.setCellStyle(cellStyle4);
            cell = row10.createCell(2);
            cell.setCellStyle(cellStyle4);
            cell.setCellValue(current.getAhuSerialData());
            //End of AHU chart, beginning of CFM chart
            HSSFRow cfm1 = spreadsheet.createRow(19);
            cell = cfm1.createCell(2);

        } catch (Exception e) {
            Log.e("AAI_mobile", "Exception", e);
        }




    }

    //loads listener onto button, executes grab method to write report
    private void addListenerOnButton(){

        btnSave.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, editComments.class);
                Intent i = getIntent();
                ahuData ahuData = i.getParcelableExtra("ahuData");
                ahuData.setMotorManu(getNamePlateMotor());
                ahuData.setNameplateHP(getNamePlateHP());
                ahuData.setBrakeHP(getNamePlateBrakeHP());
                ahuData.setFrameSize(getNamePlateFrameSize());
                ahuData.setPhase(getNamePlatePhase());
                ahuData.setVoltage(getNamePlateVolt());
                ahuData.setAmperage(getNamePlateAMP());
                ahuData.setMotorRPM(getNamePlateMotorRPM());
                ahuData.setServiceFactor(getNamePlateService());
                ahuData.setMasterSheave(getNamePlateMasterSheave());
                ahuData.setFanSheave(getNamePlateFanSheave());
                ahuData.setBeltSize(getNamePlateBelt());
                ahuData.setFilter(getNamePlateFilter());
                intent.putExtra("ahuData", ahuData);
                grabAllData("SampleReport.xml", "SampleReport.xls");
                startActivity(intent);
            }
        }));
    }


}