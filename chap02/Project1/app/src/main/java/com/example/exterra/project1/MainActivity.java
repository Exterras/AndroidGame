package com.example.exterra.project1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(new MyView(this));
    }

    class MyView extends View{

        int width, height;
        Point size = new Point();

        public MyView(Context context) {
            super(context);
            Display display = ((WindowManager) context.getSystemService
                    (Context.WINDOW_SERVICE)).getDefaultDisplay();
            display.getSize(size);
            width = size.x;
            height = size.y;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }
    }

}
