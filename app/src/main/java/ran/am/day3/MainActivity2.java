package ran.am.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView=findViewById(R.id.we);
        editText=findViewById(R.id.editTextTextPersonName);
        webView.setWebViewClient(new WebViewClient());
     //   webView.loadUrl("https://www.oracle.com/");
    }

    public void loadur(View view) {
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
        webView.loadUrl("https://www."+editText.getText().toString());

    }
}