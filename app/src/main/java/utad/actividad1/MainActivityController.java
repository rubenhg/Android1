package utad.actividad1;

import android.app.Activity;
import android.content.Intent;
import android.provider.CalendarContract;
import android.provider.Settings;
import android.view.View;

/**
 * Created by ruben.higuera on 08/11/2016.
 */
public class MainActivityController implements View.OnClickListener,View.OnFocusChangeListener{
    MainActivity vista; //MainActivity
    public MainActivityController(MainActivity vista){
        this.vista=vista;
    }

    @Override
    public void onClick(View btnSelected) {
         if(btnSelected.getId()==R.id.btnEdit){
             vista.btnEdit.setText("Guardar");
             vista.name.setEnabled(true);
             vista.dirtxt.setEnabled(true);
             vista.mailtxt.setEnabled(true);
             vista.tlftxt.setEnabled(true);
             }
        if (btnSelected.getId()==R.id.btnVolver){
            Intent Pantalla2 = new Intent(vista,Activity2.class);
            vista.startActivity(Pantalla2);

        }
    }
    public void guardarDatos(){
       //DataHolder.email = vista.mailtxt.getText();
    }


    @Override
    public void onFocusChange(View view, boolean b) {

    }

}
