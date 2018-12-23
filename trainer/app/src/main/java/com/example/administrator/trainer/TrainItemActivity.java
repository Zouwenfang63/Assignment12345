package com.example.administrator.trainer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TrainItemActivity extends AppCompatActivity {
//    private ImageView image;
    private TextView text_name;
    private TextView text_expr;
    private TextView phone_number;
    private Button phone_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_item);
//        ImageView image=(ImageView) findViewById(R.id.image);
        TextView text_name=(TextView) findViewById(R.id.text_name);
        TextView text_expr=(TextView) findViewById(R.id.text_expr);
        TextView phone_number=findViewById(R.id.phone);
        Button phone_call=findViewById(R.id.phone_button);
        String name=getIntent().getStringExtra("NAME");
        String name_expr=getIntent().getStringExtra("NAME_EXPR");
        final String phone=getIntent().getStringExtra("PHONE");
        text_name.setText(name);
        text_expr.setText(name_expr);
        phone_number.setText(phone);
        phone_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callPhone(phone);
            }
        });

    }
   private void callPhone(String phoneNum){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        Uri data= Uri.parse("tel:"+phoneNum);
        intent.setData(data);
        startActivity(intent);
   }
   public static Intent newIntent(Context packageContext,String name,String name_expr,String phone){
        Intent intent=new Intent(packageContext,TrainItemActivity.class);
        intent.putExtra("NAME",name);
        intent.putExtra("NAME_EXPR",name_expr);
        intent.putExtra("PHONE",phone);
        return intent;
   }
}
