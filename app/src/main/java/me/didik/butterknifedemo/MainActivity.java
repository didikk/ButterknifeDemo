package me.didik.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();

    @BindView(R.id.et_name) EditText etName;
    @BindView(R.id.et_email) EditText etEmail;
    @BindView(R.id.et_password) EditText etPassword;
    @BindView(R.id.et_confirm_password) EditText etConfirmPassword;
    @BindView(R.id.et_address) EditText etAddress;
    @BindView(R.id.et_phone) EditText etPhone;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @OnClick(R.id.btn_submit)
    public void onClick() {
        String name = etName.getText().toString();
        String mail = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        String confirmPassword = etConfirmPassword.getText().toString();
        String address = etAddress.getText().toString();
        String phone = etPhone.getText().toString();

        String form = name + "\n" + mail + "\n" + password + "\n" + confirmPassword + "\n" +
                address + "\n" + phone;
        Log.d(TAG, form);

        Toast.makeText(this, "Registration success.", Toast.LENGTH_SHORT).show();
    }
}
