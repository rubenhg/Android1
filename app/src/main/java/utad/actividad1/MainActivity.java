package utad.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
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
        btnVolver = (Button) this.findViewById(R.id.btnEdit);
        btnVolver.setOnClickListener(mainActivityController);
       


    }



}
