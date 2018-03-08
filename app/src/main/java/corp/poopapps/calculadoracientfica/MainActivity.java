package corp.poopapps.calculadoracientfica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resul;
    Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, Bplus, Bminus, Btimes, Bdivided, Bpoint, Bequals, Bborrar;
    double aux=0, aux2=0, res=0;
    int paso=0;
    String result;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resul = (TextView)findViewById(R.id.TResultado);
        B0 = (Button)findViewById(R.id.B0);
        B1 = (Button)findViewById(R.id.B1);
        B2 = (Button)findViewById(R.id.B2);
        B3 = (Button)findViewById(R.id.B3);
        B4 = (Button)findViewById(R.id.B4);
        B5 = (Button)findViewById(R.id.B5);
        B6 = (Button)findViewById(R.id.B6);
        B7 = (Button)findViewById(R.id.B7);
        B8 = (Button)findViewById(R.id.B8);
        B9 = (Button)findViewById(R.id.B9);
        Bplus = (Button)findViewById(R.id.Bplus);
        Bminus = (Button)findViewById(R.id.Bminus);
        Btimes = (Button)findViewById(R.id.Btimes);
        Bdivided = (Button)findViewById(R.id.Bdivided);
        Bpoint = (Button)findViewById(R.id.Bpoint);
        Bequals = (Button)findViewById(R.id.Bequals);
        Bborrar = (Button)findViewById(R.id.Bborrar);
    }

    public void boton1 (View v){
        String cap = resul.getText().toString();
        cap = cap+"1";
        resul.setText(cap);
    }

    public void boton2 (View v){
        String cap = resul.getText().toString();
        cap = cap+"2";
        resul.setText(cap);
    }

    public void boton3 (View v){
        String cap = resul.getText().toString();
        cap = cap+"3";
        resul.setText(cap);
    }

    public void boton4 (View v){
        String cap = resul.getText().toString();
        cap = cap+"4";
        resul.setText(cap);
    }

    public void boton5 (View v){
        String cap = resul.getText().toString();
        cap = cap+"5";
        resul.setText(cap);
    }

    public void boton6 (View v){
        String cap = resul.getText().toString();
        cap = cap+"6";
        resul.setText(cap);
    }

    public void boton7 (View v){
        String cap = resul.getText().toString();
        cap = cap+"7";
        resul.setText(cap);
    }

    public void boton8 (View v){
        String cap = resul.getText().toString();
        cap = cap+"8";
        resul.setText(cap);
    }

    public void boton9 (View v){
        String cap = resul.getText().toString();
        cap = cap+"9";
        resul.setText(cap);
    }

    public void boton0 (View v){
        String cap = resul.getText().toString();
        cap = cap+"0";
        resul.setText(cap);
    }

    public void botonplus (View v){

        if(!resul.getText().toString().matches(""))
        {
            // not null not empty
            String cap = resul.getText().toString();
            aux = Double.parseDouble(cap);
            Bplus.setBackgroundColor(getResources().getColor(R.color.red));
            paso = 1; //SUMA 1
            resul.setText("");
        }
    }

    public void botonminus (View v){

        if(!resul.getText().toString().matches(""))
        {
            String cap = resul.getText().toString();
            aux = Double.parseDouble(cap);
            Bminus.setBackgroundColor(getResources().getColor(R.color.red));
            paso = 2; //RESTA 2
            resul.setText("");
        }
    }

    public void botontimes (View v){

        if(!resul.getText().toString().matches(""))
        {
            String cap = resul.getText().toString();
            aux = Double.parseDouble(cap);
            Btimes.setBackgroundColor(getResources().getColor(R.color.red));
            paso = 3; //MULTIPLICACION 3
            resul.setText("");
        }
    }

    public void botondivid (View v){

        if(!resul.getText().toString().matches(""))
        {
            String cap = resul.getText().toString();
            aux = Double.parseDouble(cap);
            Bdivided.setBackgroundColor(getResources().getColor(R.color.red));
            paso = 4; //DIVISION 4
            resul.setText("");
        }

    }

    public void botonpoint (View v){
        String cap = resul.getText().toString();
        cap = cap+".";
        resul.setText(cap);
    }

    public void botonequals (View v){

        if(!resul.getText().toString().matches(""))
        {
            String cap = resul.getText().toString();
            aux2 = Double.parseDouble(cap);
            resul.setText("");

            switch (paso){
                case 1:
                    res = aux + aux2;
                    String suma = String.valueOf(res);
                    resul.setText(String.format("%.7f",res));
                    Bplus.setBackgroundColor(getResources().getColor(R.color.darkcyan));
                    break;
                case 2:
                    res = aux - aux2;
                    String resta = String.valueOf(res);
                    resul.setText(String.format("%.7f",res));
                    Bminus.setBackgroundColor(getResources().getColor(R.color.darkcyan));
                    break;

                case 3:
                    res = aux * aux2;
                    String producto = String.valueOf(res);
                    resul.setText(String.format("%.7f",res));
                    Btimes.setBackgroundColor(getResources().getColor(R.color.darkcyan));
                    break;
                case 4:
                    res = aux / aux2;
                    String division = String.valueOf(res);
                    resul.setText(String.format("%.7f",res));
                    Bdivided.setBackgroundColor(getResources().getColor(R.color.darkcyan));
                    break;
            }
        }

    }

    public void BotonBorrar(View view){
        resul.setText("");
        aux=0; aux2=0; res=0; paso=0;
        Bborrar.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void onButtonClicked(View view) {

       switch(view.getId()){
            case R.id.B0:

                //resul.setText("0");
                boton0(resul);
                break;
            case R.id.B1:

                //resul.setText("1");
                boton1(resul);
                break;
            case R.id.B2:

                //resul.setText("2");
                boton2(resul);
                break;
            case R.id.B3:

                //resul.setText("3");
                boton3(resul);
                break;
            case R.id.B4:

                //resul.setText("4");
                boton4(resul);
                break;
            case R.id.B5:

                //resul.setText("5");
                boton5(resul);
                break;
            case R.id.B6:

                //resul.setText("6");
                boton6(resul);
                break;
            case R.id.B7:

                //resul.setText("7");
                boton7(resul);
                break;
            case R.id.B8:

                //resul.setText("8");
                boton8(resul);
                break;
            case R.id.B9:

                //resul.setText("9");
                boton9(resul);
                break;
            case R.id.Bplus:
                //resul.setText("+");
                botonplus(resul);
                break;
            case R.id.Bminus:
                //resul.setText("-");
                botonminus(resul);
                break;
            case R.id.Btimes:
                //resul.setText("x");
                botontimes(resul);
                break;
            case R.id.Bdivided:
                //resul.setText("/");
                botondivid(resul);
                break;
            case R.id.Bpoint:
                //resul.setText("/");
                botonpoint(resul);
                break;
            case R.id.Bequals:
                //resul.setText("/");
                botonequals(resul);
                break;
        }


    }
}
