package com.example.logonrm.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    public static final int REQUEST_NOVO_USUARIO = 1;

    @BindView(R.id.etLogin) EditText edtLogin;
    @BindView(R.id.etSenha) EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tvNovoUsuario)
    public void novoUsuarioClick(){
        Intent novoUsuario = new Intent(this,NovoUsuarioActivity.class);
        startActivityForResult(novoUsuario,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQUEST_NOVO_USUARIO:
                edtLogin.setText(data.getStringExtra("USERNAME"));
                break;
        }

    }
}
