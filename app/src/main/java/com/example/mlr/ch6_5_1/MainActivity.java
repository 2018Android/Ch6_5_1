package com.example.mlr.ch6_5_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找出Button元件
        Button btn = (Button) findViewById(R.id.btn_order);
        //註冊傾聽者事件
        btn.setOnClickListener(listener);
    }
    //建立傾聽者物件
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int amount = 0, quantity = 1;
            //取得輸入的數量
            EditText txtQuantity = (EditText) findViewById(R.id.edt_number);
            quantity = Integer.parseInt(txtQuantity.getText().toString());
            //檢查勾選哪些披薩
            CheckBox original = (CheckBox) findViewById(R.id.ckb_1);
            if (original.isChecked())
                amount += 250 * quantity;
            CheckBox beef = (CheckBox) findViewById(R.id.ckb_2);
            if (beef.isChecked())
                amount += 275 * quantity;
            CheckBox seafood = (CheckBox) findViewById(R.id.ckb_3);
            if (seafood.isChecked())
                amount += 350 * quantity;
            //顯示訂購金額
            TextView output = (TextView) findViewById(R.id.txv_show);
            output.setText(Integer.toString(amount));
        }
    };

}
