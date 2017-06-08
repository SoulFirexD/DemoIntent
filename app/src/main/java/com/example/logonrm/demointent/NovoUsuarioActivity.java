package com.example.logonrm.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NovoUsuarioActivity extends AppCompatActivity {

    @BindView(R.id.etLoginNovo) EditText edtLoginNovo;
    @BindView(R.id.etNomeNovo) EditText edtNomeNovo;
    @BindView(R.id.etSenhaNovo) EditText edtSenhaNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btCadastrar)
    public void cadastrarClick(){
        Intent loginIntent = new Intent();
        loginIntent.putExtra("USERNAME",edtLoginNovo.getText().toString());
        setResult(RESULT_OK,loginIntent);
        finish();
    }
}
