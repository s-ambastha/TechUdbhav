package inc.iris.techudbhav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import inc.iris.techudbhav.logic.RegistrationHelper;

public class EKryptics extends AppCompatActivity {
    private static final String TAG = "EKryptics";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekryptics);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void getDetails(View view) {
        Intent intent=new Intent(this,PdfViewer.class);
        String detailURL = "https://drive.google.com/file/d/1Ta9ldjnRMFdceyiuteYYv0vj7B5KVi3U/view?usp=sharing";
        intent.putExtra("url", detailURL);
        startActivity(intent);

    }


}
