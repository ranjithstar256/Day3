package ran.am.day3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b; // Dec
    Button c; // Dec
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        c=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alrt = new AlertDialog.Builder(MainActivity.this);

                alrt.setTitle("Vpxistyaosani");
                alrt.setMessage("Good Book!");
                alrt.setIcon(android.R.drawable.ic_media_play);
                alrt.setPositiveButton("Buy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "go buy online", Toast.LENGTH_SHORT).show();
                    }
                });

                alrt.setNegativeButton("Sell",null);
                alrt.setNeutralButton("Exit",null);
                alrt.show();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.diaogdesign);
                TextView text = dialog.findViewById(R.id.textView);
                text.setText("Custom dialog Android example by AndroidManifester");

                dialog.show();

                Button declineButton = dialog.findViewById(R.id.button3);
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.abc,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void helpoption(MenuItem item) {
        Toast.makeText(this, "help got clicked!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this,MainActivity2.class));
    }

    public void datep(View view) {
        DatePickerDialog dp = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(MainActivity.this, "You have selected "
                                +dayOfMonth+"/"+(month+1)+"/"+year, Toast.LENGTH_SHORT).show();
                    }
                }, 1999, 0, 2);
        dp.show();

    }

    //ctrl+shift+ -
    //ctrl+shift+ +
}