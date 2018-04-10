package personas.ivaangb.com.personas_i;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    private EditText txtCedula, txtNombre, txtApellido;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        recursos = getResources();
        txtCedula = findViewById(R.id.txtCedula);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
    }

    public void guardar(View v){
        String ced, nomb, apell;
        ced = txtCedula.getText().toString();
        nomb = txtNombre.getText().toString();
        apell = txtApellido.getText().toString();

        Persona p = new Persona(ced, nomb, apell);
        p.guardar();
        Toast.makeText(this, recursos.getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
        borrar();
    }

    public void limpiar(View v){
        borrar();
    }

    public void borrar(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
    }
}
