package com.example.exterra.project1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final int _Width = 300;
    private static final int _Height = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int deviceWidth = displayMetrics.widthPixels;
        int deviceHeight = displayMetrics.heightPixels;

        //리니어 레이아웃
        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundColor(Color.YELLOW);
        layout.setOrientation(LinearLayout.VERTICAL); // 세로로
        layout.setGravity(Gravity.CENTER);

        layout.setPadding(
                (deviceWidth - _Width) /2,
                (deviceHeight - _Height) /2,
                (deviceWidth - _Width) /2,
                (deviceHeight - _Height) /2
        ); // 가운데 정렬 설정

        setContentView(layout);

        //텍스트뷰 추가
        TextView tv1 = new TextView(this);
        tv1.setText(deviceWidth + " X " + deviceHeight);
        layout.addView(tv1);
    }
}
