package aai.aai_mobile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Aladdin on 1/27/2016.
 */
public class editNotes extends Activity implements OnItemSelectedListener{

    private Spinner preNotesSpinner;
    private EditText otherNotes;
    private String notes, preNotes;
    private Button saveNotesButton;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_notes);
        preNotesSpinner = (Spinner) findViewById(R.id.preNoteSpinner);
        otherNotes = (EditText) findViewById(R.id.otherNotes);
        saveNotesButton = (Button) findViewById(R.id.btnSaveNotes);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.predetermined_Notes, R.layout.activity_edit_notes);
        adapter.setDropDownViewResource(R.layout.activity_edit_notes);
        preNotesSpinner.setAdapter(adapter);
        preNotesSpinner.setOnItemSelectedListener(this);
        context = this.getApplicationContext();
        addListenerToButton();
    }


    public void setNotes(String note){
        notes = note;

    }

    public void setPreNotes(String note){
        preNotes = note;
    }

    public String getNotes(){
        return notes;
    }

    public String getPreNotes(){
        return preNotes;
    }

    public void onItemSelected(AdapterView<?> parent, View view,
    int pos, long id) {
        /* An item was selected. You can retrieve the selected item using
        parent.getItemAtPosition(pos)
       Only adds one note
        TODO: Make into String Array to add multiple notes as needed
        */
        setPreNotes(parent.getItemAtPosition(pos).toString());
    }

    public void onNothingSelected(AdapterView<?> parent){
        //Sets preset note variable to null and returns user written notes
        setNotes(otherNotes.getText().toString());
        setPreNotes(null);
    }


    private String grabNotes(){

        if(preNotes.isEmpty()){
            return getNotes();
        } else if(preNotes.length() > 0 && notes.length() > 0) {
           return getPreNotes() + "/n" + getNotes();
        } else {
            return getPreNotes();
        }
    }

    public void addListenerToButton(){
        saveNotesButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, createReport.class);
                Intent i = getIntent();
                ahuData current = i.getParcelableExtra("ahuData");
               current.setNoteData(grabNotes());
                intent.putExtra("ahuData", current);
                startActivity(intent);
            }
        }));
    }

}
