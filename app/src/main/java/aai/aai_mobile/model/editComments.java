package aai.aai_mobile.model;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import aai.aai_mobile.R;

/**
 * Created by Aladdin on 1/27/2016.
 */
public class editComments extends AppCompatActivity {



    private EditText commentSection;
    private Button saveComments;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_comments);
        context = this.getApplicationContext();
        commentSection = (EditText) findViewById(R.id.commentSection);
        saveComments = (Button) findViewById(R.id.btnEditComments);
        addListenerToButton();
    }

    private String getCommentSection() {
        return commentSection.getText().toString();
    }

  private void addListenerToButton(){

    saveComments.setOnClickListener((new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, editNotes.class);
            Intent i = getIntent();
            //ahuData current = i.getParcelableExtra("ahuData");
            //current.setComments(getCommentSection());
            //intent.putExtra("ahuData", current);
            startActivity(intent);
        }
    }));
  }



}
