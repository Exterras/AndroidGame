/*
* 스무고개 게임입니다.
* annotated by Exterra
*
* */

package com.example.exterra.project_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int count;
    int randomNum;
    EditText inputNum;
    TextView textResult;
    // count = 몇번째로 맞췃는지에 대한 변수 선언
    // randomNum = 난수를 발생시켜 저장하는 변수 선언
    // inputNum = 내가 실제로 숫자를 입력시키는 변수 선언
    // textResult = 확인을 눌렀을 때 내가 입력한 숫자를 연산하여 결과를 출력하는 변수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 초기화 함수

        count = 0; // 카운트 초기화하고
        randomNum = new Random().nextInt(501) + 500;
        // 랜덤함수 이용해서 0~500까지 랜덤돌리고 그 값을 500 더해 randomNum에 저장
        inputNum = (EditText) findViewById(R.id.editText);
        // activity_main의 id가 editText의 값을 inputNum에 저장
        textResult = (TextView) findViewById(R.id.textView2);
        // activity_main의 id가 textView2의 값을 textResult에 저장
        findViewById(R.id.button1).setOnClickListener(myButtonClick);
        // activity_main의 id가 button1 값을 찾아
        // myButtonClick 이라는 OnClickListener 변수에 이벤트 처리

    }

    // myButtonClick 버튼의 이벤트 객체타입으로 익명객체 생성
    Button.OnClickListener myButtonClick = new Button.OnClickListener(){
        public void onClick(View v){
            String str;
            count++;
            // 버튼이 눌려질 때마다 결과를 출력되는 문자열 선언 및 카운트를 1씩 증가한다.

            int parseNum = Integer.parseInt(inputNum.getText().toString());
            // 사용자가 입력한 값은 String으로 변환 -> int로 변환하여 parseNum에 저장

            if (parseNum < 500 || parseNum > 1000){
                str = "입력된 값이 500 ~ 1000을 벗어났습니다.";
            } else if(parseNum == randomNum){
                str = count + "번째에 맞추셨습니다.";
            } else if(parseNum > randomNum){
                str = "보다 작은 값입니다.";
            } else {
                str = "보다 큰 값입니다.";
            }
            // 사용자 입력값에 따른 제어문

            textResult.setText(str);
            // 결과화면을 textResult에 출력한다.
        }
    };
}
