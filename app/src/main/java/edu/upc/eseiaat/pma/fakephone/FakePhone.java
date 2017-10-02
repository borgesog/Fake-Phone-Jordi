package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhone extends AppCompatActivity {

    TextView phonenumber;
    private String aux;
    private Button borrado;
    private Button llamando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);
        phonenumber = (TextView) findViewById(R.id.number);
        aux= "";
    }

    public void click(View v){

        Button boto = (Button) v;
        String text_boto = boto.getText().toString();
        aux = aux + text_boto;
        /*phonenumber.getText(text_boto);*/
        phonenumber.setText(aux);

    }
    public void borrar (View v){
        borrado = (Button) v;
        aux= "";
        phonenumber.setText(aux);
    }
    public void Llamar (View v){
        llamando = (Button) v;
        aux= "llamando al "+ aux;
        Toast.makeText(FakePhone.this, aux, Toast.LENGTH_SHORT).show();
        aux= "";

    }
}
