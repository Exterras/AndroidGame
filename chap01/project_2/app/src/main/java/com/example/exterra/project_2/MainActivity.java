package com.example.exterra.project_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  버튼의 리스너 할당
        findViewById(R.id.Button01).setOnClickListener(myButtonClick);
        findViewById(R.id.Button02).setOnClickListener(myButtonClick);
        findViewById(R.id.Button03).setOnClickListener(myButtonClick);
        findViewById(R.id.Button04).setOnClickListener(myButtonClick);

    } // end of onCreate

    Button.OnClickListener myButtonClick = new Button.OnClickListener(){
    // 버튼 클릭시 이벤트 발생

        @Override
        public void onClick(View v) {
            // 버튼을 클릭한다면, View 형태로 버튼의 아이디를 받아낸다.
            int num = 0; // 각 버튼을 숫자로 만들기 위해 int 형으로 선언
            String str; // 게임 결과를 알려주는 문자열 선언
            int ranNum = new Random().nextInt(4)+1;
            // 1부터 4까지 랜덤숫자 만들어서 int형 변수에 넣기
            // 매번 버튼을 클릭시 랜덤으로 넣어지며 이 숫자와 버튼의 숫자와 비교한다.

            switch (v.getId()){
                case R.id.Button01:
                    num = 1;
                    break;
                case R.id.Button02:
                    num = 2;
                    break;
                case R.id.Button03:
                    num = 3;
                    break;
                case R.id.Button04:
                    num = 4;
                    break;
                default:
                    break;
            }
            // 각 버튼의 아이디를 받아서 switch 문으로 번호를 넣어주고 있다.

            if (num == ranNum){
                str = "축하합니다. 당첨되셨습니다.";
            } else {
                str = "안타깝습니다. 다음 기회에 다시 도전하세요.";
            }
            // 각 버튼의 번호와 랜덤 숫자가 같은 경우와 다른 경우에 문자열을 출력하는 조건문

            ((TextView) findViewById(R.id.TextView01)).setText(str);
            // 실제로 TextView01 의 곳에 해당 문자열을 출력하는 메서드
        }
    };
}
