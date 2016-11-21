package com.example.exterra.project_1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    int deviceWidth, deviceHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        deviceWidth = displayMetrics.widthPixels;
        deviceHeight = displayMetrics.heightPixels;

        //리니어 레이아웃
        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundColor(Color.YELLOW);
        layout.setOrientation(LinearLayout.VERTICAL); // 세로로

        setContentView(layout);
        textView01(layout);
    }

    public void textView01(LinearLayout layout){
        //텍스트뷰 추가
        TextView tv1 = new TextView(this);
        tv1.setText(deviceWidth + " X " + deviceHeight);
        tv1.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL); // 중앙 정렬
        tv1.setTextSize(24.0f);
        tv1.setLayoutParams(new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 0.0f));
        // 부모의 객체와 가로와 세로의 크기를 같게 만든다 ->
        // 중앙 정렬의 의미를 부모 화면에서의 실행을 위해 MATCH_PARENT로 지정하였다.

        layout.addView(tv1); // 찍어준다.
    }
}
