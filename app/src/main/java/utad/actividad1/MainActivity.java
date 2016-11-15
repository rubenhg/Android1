package utad.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btnEdit ;
    public Button btnVolver ;
    public ImageView imgPerfil;
    public EditText name;
    public TextView Email;
    public EditText mailtxt;
    public TextView Telefono;
    public EditText tlftxt;
    public TextView Dirección;
    public EditText dirtxt;
    public TextView calendariolbl;
    MainActivityController mainActivityController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityController = new MainActivityController(this);

        btnEdit = (Button) this.findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(mainActivityController);
        btnVolver = (Button) this.findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(mainActivityController);

        mailtxt = (EditText) this.findViewById(R.id.mailtxt);
        name = (EditText) this.findViewById(R.id.nametxt);
        tlftxt = (EditText) this.findViewById(R.id.tlftxt);
        dirtxt = (EditText) this.findViewById(R.id.dirtxt);

        mailtxt.setText(DataHolder.email);
        name.setText(DataHolder.name);
        tlftxt.setText(DataHolder.tlf);
        dirtxt.setText(DataHolder.dir);
    }





    protected void onPause(){
       super.onPause();
   }
    protected void onResume(){
        super.onResume();
    }
    protected void onDestroy(){
        super.onDestroy();
    }
}
