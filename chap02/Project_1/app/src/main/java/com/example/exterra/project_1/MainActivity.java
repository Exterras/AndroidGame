package com.example.exterra.project_1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    int deviceWidth, deviceHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 해상도 가로 세로 구하는 코드
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        deviceWidth = displayMetrics.widthPixels;
        deviceHeight = displayMetrics.heightPixels;

        // 리니어 레이아웃
        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundColor(Color.YELLOW);
        layout.setOrientation(LinearLayout.VERTICAL); // 세로로

        // 앞에서 만들었던 리니어 레이아웃 설정하기
        setContentView(layout);

        // textView01 함수로 빼서 사용, layout을 매개변수로 하여
        // 해당 TextView를 이 레이아웃에 추가하는 역할을 하게 함.
//       textView01(layout);
        imageView01(layout);
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
        // 중앙 정렬의 의미를 부모 화면에서의 실행을 위해 MATdCH_PARENT로 지정하였다.

        layout.addView(tv1); // 찍어준다.
    }

    public void imageView01(LinearLayout layout){
        ImageView rabbit = new ImageView(this);

        rabbit.setImageResource(R.drawable.rabbit);
        rabbit.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rabbit.setLayoutParams(new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 0.0f));

        layout.addView(rabbit);
    }
}
