package com.exam.sky.buterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.textView)
//    TextView textView;
//    @BindView(R.id.button)
//    Button btn;

    @BindViews({ R.id.textView, R.id.button})
    List<View> nameViews;


    @BindString(R.string.app_name)
    String name;

    @BindView(R.id.checkBox)
    CheckBox checkBox;


    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.layout,new ContentFragment()).commit();
    }

    @OnClick(R.id.button)
    public void updateTextView(View view) {
        TextView textView1  = (TextView) nameViews.get(0);
                textView1.setText("=========" + name);
        Button btn  = (Button) nameViews.get(1);
        btn.setText("====哈哈哈=====" + name);
    }

    @OnCheckedChanged(R.id.checkBox)
    public void checked(android.widget.CompoundButton comp, boolean isChecked) {
        Log.e("======","======="+isChecked);
        if (isChecked){
          imageView.setImageResource(android.R.drawable.ic_menu_delete);
        }else{
            imageView.setImageResource(android.R.drawable.ic_menu_share);
        }
    }


}
