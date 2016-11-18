package com.example.exterra.project_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    String tYut[] = {"○○○○○", "●●●●●"};
    int imgYut[] = {R.drawable.yutback, R.drawable.yutfront};
    // 윷을 표현해 줄수 있는 문자열 배열(이미지 배열) 만들기

    String Yut[] = {"윷", "도", "개", "걸", "모"};
    // 윷을 던져 (확인 버튼을 눌러서) 결과가 나오는 문자열 배열 만들기

    int[] yutResult = new int[5];
    // 윷의 결과를 카운트하여 누적저장해주는 정수형 배열 만들기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Button01).setOnClickListener(myButtonClick);
        // Button01에 버튼객체 만들기
    }

    Button.OnClickListener myButtonClick = new Button.OnClickListener(){
    // 버튼객체 선언 및 생성
        @Override
        public void onClick(View v) { // 버튼이 클릭되었을 때 실행하는 함수
            Random random = new Random(); // 랜덤만들기
            int num1 = random.nextInt(10) / 6;
            int num2 = random.nextInt(10) / 6;
            int num3 = random.nextInt(10) / 6;
            int num4 = random.nextInt(10) / 6;
            // 0~9까지의 숫자를 랜덤으로 만들어서 그 값에 6을 나눈 몫을 각 변수에 넣는다.
            // 이 변수들은 각각 윳의 상태를 표현한다.
            // 랜덤이 0~5까지는 몫이 0이 나올 것이고 6~9까지는 1이 나올것이다.
            // 결국 이 변수들은 0 혹은 1 이 2개로만 버튼을 누를때마다 랜덤으로 채워질 것이다.

            int num = num1 + num2 + num3 + num4;
            // 0 또는 1로 채워질 4개의 변수들을 더하여 num이라는 변수에 저장한다.

            /* ((TextView) findViewById(R.id.TextView01)).setText(tYut[num1]);
            ((TextView) findViewById(R.id.TextView02)).setText(tYut[num2]);
            ((TextView) findViewById(R.id.TextView03)).setText(tYut[num3]);
            ((TextView) findViewById(R.id.TextView04)).setText(tYut[num4]); */

            ((ImageView) findViewById(R.id.ImageView01)).setImageResource(imgYut[num1]);
            ((ImageView) findViewById(R.id.ImageView02)).setImageResource(imgYut[num2]);
            ((ImageView) findViewById(R.id.ImageView03)).setImageResource(imgYut[num3]);
            ((ImageView) findViewById(R.id.ImageView04)).setImageResource(imgYut[num4]);

            ((TextView) findViewById(R.id.TextView05)).setText(Yut[num]);

            // 앞의 4개의 setText는 0 이면 비어있는 원, 1이면 채워있는 원을 출력할 것이다.
            // 마지막 setText는 num1 부터 num4까지의 합이 들어있는 num 변수를 윷의 결과를 표현하는
            // Yut 배열를 표시할 수 있도록 순서로 작용한다.
            // num의 합이 0이라면 모든 원이 비어있다는 의미이므로 윷을 출력하게 한다. -> num[0]
            // num의 합이 2이라면 2개 원이 비어있다는 의미이므로 개를 출력하게 한다. -> num[2]


            switch (num){
                case 0:
                    yutResult[0]++;
                    break;
                case 1:
                    yutResult[1]++;
                    break;
                case 2:
                    yutResult[2]++;
                    break;
                case 3:
                    yutResult[3]++;
                    break;
                case 4:
                    yutResult[4]++;
                    break;
                default:
                    break;
            }

            ((TextView) findViewById(R.id.TextView07)).setText("도 :" + String.valueOf(yutResult[1]));
            ((TextView) findViewById(R.id.TextView08)).setText("개 :" + String.valueOf(yutResult[2]));
            ((TextView) findViewById(R.id.TextView09)).setText("걸 :" + String.valueOf(yutResult[3]));
            ((TextView) findViewById(R.id.TextView10)).setText("윷 :" + String.valueOf(yutResult[0]));
            ((TextView) findViewById(R.id.TextView11)).setText("모 :" + String.valueOf(yutResult[4]));
        }
    };
}
