package me.didik.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // Contoh deklarasi edit text. Butterknife otomatis mengenali tipe komponen yang kita buat.
    @Bind(R.id.my_edit_text)
    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Jangan lupa memanggil method ini agar komponen yang kita buat bisa dikenali
        ButterKnife.bind(this);
    }

    /**
     * Untuk menghandel onClick sebuah button tinggal gunakan anotasi @OnClick(id button) dan diikuti sebuah fungsi
     * Button tidak perlu dideklarasikan terlebih dahulu seperti edit text di atas.
     */
    @OnClick(R.id.my_button)
    void buttonClicked() {
        String name = myEditText.getText().toString();
        Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_SHORT).show();
    }
}
