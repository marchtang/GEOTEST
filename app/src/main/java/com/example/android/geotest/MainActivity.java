        package com.example.android.geotest;

        import android.graphics.Color;
        import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.CheckBox;
    import android.widget.EditText;
    import android.widget.RadioButton;
    import android.widget.Toast;

        public class MainActivity extends AppCompatActivity {
            CheckBox Q1_ans[] = new CheckBox[4];
            CheckBox Q2_ans[] = new CheckBox[4];
            RadioButton Q3_ans =null;
            RadioButton Q4_ans = null;
            EditText Q5_ans = null;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
            }
            public void CreateScore(View view) {
                int count = 0;
                int score = 0;
                Q1_ans[0] = (CheckBox) findViewById(R.id.HK);
                Q1_ans[1] = (CheckBox) findViewById(R.id.BJ);
                Q1_ans[2] = (CheckBox) findViewById(R.id.NY);
                Q1_ans[3] = (CheckBox) findViewById(R.id.TK);
                boolean Q1hasCheck0=Q1_ans[0].isChecked();
                boolean Q1hasCheck1=Q1_ans[1].isChecked();
                boolean Q1hasCheck2=Q1_ans[2].isChecked();
                boolean Q1hasCheck3=Q1_ans[3].isChecked();
                Q2_ans[0] = (CheckBox) findViewById(R.id.HST);
                Q2_ans[1] = (CheckBox) findViewById(R.id.LD);
                Q2_ans[2] = (CheckBox) findViewById(R.id.LA);
                Q2_ans[3] = (CheckBox) findViewById(R.id.PH);
                boolean Q2_ansCheck0=Q2_ans[0].isChecked();
                boolean Q2_ansCheck1=Q2_ans[1].isChecked();
                boolean Q2_ansCheck2=Q2_ans[2].isChecked();
                boolean Q2_ansCheck3=Q2_ans[3].isChecked();
                Q3_ans = (RadioButton) findViewById(R.id.yazhou);
                boolean Q3_ansCheck = Q3_ans.isChecked();
                Q4_ans = (RadioButton)findViewById(R.id.japan);
                boolean Q4_ansCheck = Q4_ans.isChecked();
                Q5_ans = (EditText)findViewById(R.id.nation_text);
                boolean  Q5_ansCheck = Q5_ans.getText().toString().equals("美国");
                if(Q1hasCheck1&&Q1hasCheck3){
                    count+=1;
                }
                if(Q2_ansCheck0&&Q2_ansCheck2&&Q2_ansCheck3){
                    count+=1;
                }
                if(Q3_ansCheck){
                    count+=1;
                }
                if(Q4_ansCheck){
                    count+=1;
                }
                if(Q5_ansCheck){
                    count+=1;
                }
                score=count*20;
                display(count,score);
            }
            public void display(int count,int score) {
                if (count == 5) {
                    Toast.makeText(MainActivity.this,"恭喜全对！good job",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,"答对"+count+"题"+"获得"+score+"分  加油！",Toast.LENGTH_LONG).show();
                }
                Button showAns=(Button)findViewById(R.id.answer_button);
                showAns.setVisibility(View.VISIBLE);
            }
           public void showAnswers(View view){
               displayans();
           }
           public void displayans(){
               Q1_ans[1].setTextColor(Color.parseColor("#f44336"));
               Q1_ans[3].setTextColor(Color.parseColor("#f44336"));
               Q2_ans[0].setTextColor(Color.parseColor("#f44336"));
               Q2_ans[2].setTextColor(Color.parseColor("#f44336"));
               Q2_ans[3].setTextColor(Color.parseColor("#f44336"));
               Q3_ans.setTextColor(Color.parseColor("#f44336"));
               Q4_ans.setTextColor(Color.parseColor("#f44336"));
               Q5_ans.setText("美国");
           }
        }