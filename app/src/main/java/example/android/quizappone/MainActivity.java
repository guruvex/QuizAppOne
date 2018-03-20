package example.android.quizappone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ScrollView introPage;
    EditText editUserInput;

    RadioGroup radioGroupBox2;
    RadioGroup radioGroupBox4;
    RadioGroup radioGroupBox5;
    RadioGroup radioGroupBox7;
    RadioGroup radioGroupBox8;
    RadioGroup radioGroupBox10;

    RadioButton radioAnswer21;
    RadioButton radioAnswer22;
    RadioButton radioAnswer23;
    RadioButton radioAnswer24;
    RadioButton radioAnswer41;
    RadioButton radioAnswer42;
    RadioButton radioAnswer43;
    RadioButton radioAnswer44;
    RadioButton radioAnswer51;
    RadioButton radioAnswer52;
    RadioButton radioAnswer53;
    RadioButton radioAnswer54;
    RadioButton radioAnswer71;
    RadioButton radioAnswer72;
    RadioButton radioAnswer73;
    RadioButton radioAnswer74;
    RadioButton radioAnswer81;
    RadioButton radioAnswer82;
    RadioButton radioAnswer83;
    RadioButton radioAnswer84;
    RadioButton radioAnswer101;
    RadioButton radioAnswer102;
    RadioButton radioAnswer103;
    RadioButton radioAnswer104;

    CheckBox checkAnswer31;
    CheckBox checkAnswer32;
    CheckBox checkAnswer33;
    CheckBox checkAnswer34;
    CheckBox checkAnswer61;
    CheckBox checkAnswer62;
    CheckBox checkAnswer63;
    CheckBox checkAnswer64;
    CheckBox checkAnswer91;
    CheckBox checkAnswer92;
    CheckBox checkAnswer93;
    CheckBox checkAnswer94;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        introPage = findViewById(R.id.introPage);
        editUserInput = findViewById(R.id.editUserInput);

        radioGroupBox2 = findViewById(R.id.radioGroupBox2);
        radioGroupBox4 = findViewById(R.id.radioGroupBox4);
        radioGroupBox5 = findViewById(R.id.radioGroupBox5);
        radioGroupBox7 = findViewById(R.id.radioGroupBox7);
        radioGroupBox8 = findViewById(R.id.radioGroupBox8);
        radioGroupBox10 = findViewById(R.id.radioGroupBox10);

        radioAnswer21 = findViewById(R.id.radioAnswer21);
        radioAnswer22 = findViewById(R.id.radioAnswer22);
        radioAnswer23 = findViewById(R.id.radioAnswer23);
        radioAnswer24 = findViewById(R.id.radioAnswer24);
        radioAnswer41 = findViewById(R.id.radioAnswer41);
        radioAnswer42 = findViewById(R.id.radioAnswer42);
        radioAnswer43 = findViewById(R.id.radioAnswer43);
        radioAnswer44 = findViewById(R.id.radioAnswer44);
        radioAnswer51 = findViewById(R.id.radioAnswer51);
        radioAnswer52 = findViewById(R.id.radioAnswer52);
        radioAnswer53 = findViewById(R.id.radioAnswer53);
        radioAnswer54 = findViewById(R.id.radioAnswer54);
        radioAnswer71 = findViewById(R.id.radioAnswer71);
        radioAnswer72 = findViewById(R.id.radioAnswer72);
        radioAnswer73 = findViewById(R.id.radioAnswer73);
        radioAnswer74 = findViewById(R.id.radioAnswer74);
        radioAnswer81 = findViewById(R.id.radioAnswer81);
        radioAnswer82 = findViewById(R.id.radioAnswer82);
        radioAnswer83 = findViewById(R.id.radioAnswer83);
        radioAnswer84 = findViewById(R.id.radioAnswer84);
        radioAnswer101 = findViewById(R.id.radioAnswer101);
        radioAnswer102 = findViewById(R.id.radioAnswer102);
        radioAnswer103 = findViewById(R.id.radioAnswer103);
        radioAnswer104 = findViewById(R.id.radioAnswer104);
        checkAnswer31 = findViewById(R.id.checkAnswer31);
        checkAnswer32 = findViewById(R.id.checkAnswer32);
        checkAnswer33 = findViewById(R.id.checkAnswer33);
        checkAnswer34 = findViewById(R.id.checkAnswer34);
        checkAnswer61 = findViewById(R.id.checkAnswer61);
        checkAnswer62 = findViewById(R.id.checkAnswer62);
        checkAnswer63 = findViewById(R.id.checkAnswer63);
        checkAnswer64 = findViewById(R.id.checkAnswer64);
        checkAnswer91 = findViewById(R.id.checkAnswer91);
        checkAnswer92 = findViewById(R.id.checkAnswer92);
        checkAnswer93 = findViewById(R.id.checkAnswer93);
        checkAnswer94 = findViewById(R.id.checkAnswer94);
    }


    public void checkAnswers(View view) {
        // check if the answers are correct
        boolean done = true;
        int score = 0;
        String userField;

        // check if all answers are filled in.
        // check radio buttons
        if (radioAnswer21.isChecked() || radioAnswer22.isChecked() || radioAnswer23.isChecked() || radioAnswer24.isChecked()) {
            if (radioAnswer41.isChecked() || radioAnswer42.isChecked() || radioAnswer43.isChecked() || radioAnswer44.isChecked()) {
                if (radioAnswer51.isChecked() || radioAnswer52.isChecked() || radioAnswer53.isChecked() || radioAnswer54.isChecked()) {
                    if (radioAnswer71.isChecked() || radioAnswer72.isChecked() || radioAnswer73.isChecked() || radioAnswer74.isChecked()) {
                        if (radioAnswer81.isChecked() || radioAnswer82.isChecked() || radioAnswer83.isChecked() || radioAnswer84.isChecked()) {
                            if (radioAnswer101.isChecked() || radioAnswer102.isChecked() || radioAnswer103.isChecked() || radioAnswer104.isChecked()) {
                                done = true;
                            } else {
                                done = false;
                            }
                        } else {
                            done = false;
                        }
                    } else {
                        done = false;
                    }
                } else {
                    done = false;
                }
            } else {
                done = false;
            }
        } else {
            done = false;
        }
        // check if any radio button answers are left blank
        if (!done) {
            Toast.makeText(this, "You didn't fill in all the questions", Toast.LENGTH_SHORT).show();
            return;
        }
        //check check box's
        if (checkAnswer31.isChecked() || checkAnswer32.isChecked() || checkAnswer33.isChecked() || checkAnswer34.isChecked()) {
            if (checkAnswer61.isChecked() || checkAnswer62.isChecked() || checkAnswer63.isChecked() || checkAnswer64.isChecked()) {
                if (checkAnswer91.isChecked() || checkAnswer92.isChecked() || checkAnswer93.isChecked() || checkAnswer94.isChecked()) {
                    done = true;
                } else {
                    done = false;
                }
            } else {
                done = false;
            }
        } else {
            done = false;
        }
        // check if any are left blank
        if (!done) {
            Toast.makeText(this, "You didn't fill in all the questions", Toast.LENGTH_SHORT).show();
            return;
        }
        // check typed answer
        userField = editUserInput.getText().toString();
        if (userField.matches("")) {
            done = false;
        } else {
            done = true;
        }
        // check if its blank
        if (!done) {
            Toast.makeText(this, "You didn't fill in all the questions", Toast.LENGTH_SHORT).show();
            return;
        }

        // if it's made it here every answer has been filled.
        // checking correct answers.

        // question 1
        if (userField.matches("THRALL")) {
            score = score + 10;
        }
        if (userField.matches("Thrall")) {
            score = score + 10;
        }
        if (userField.matches("thrall")) {
            score = score + 10;
        }
        // question 2
        if (radioAnswer23.isChecked()) {
            score = score + 10;
        }
        // question 3
        if (checkAnswer31.isChecked() && checkAnswer33.isChecked()) {
            if (!checkAnswer32.isChecked()  && !checkAnswer34.isChecked()) {
                score = score + 10;
            }
        }
        // question 4
        if (radioAnswer42.isChecked()) {
            score = score + 10;
        }
        // question 5
        if (radioAnswer54.isChecked()) {
            score = score + 10;
        }
        // question 6
        if (checkAnswer61.isChecked() && checkAnswer64.isChecked()) {
            if (!checkAnswer62.isChecked() && !checkAnswer63.isChecked()) {
                score = score + 10;
            }
        }
        // question 7
        if (radioAnswer74.isChecked()) {
            score = score + 10;
        }
        // question 8
        if (radioAnswer82.isChecked()) {
            score = score + 10;
        }
        // question 9
        if (checkAnswer91.isChecked() || checkAnswer93.isChecked()) {
            if (!checkAnswer92.isChecked() && !checkAnswer94.isChecked()) {
                score = score + 10;
            }
        }
        // question 10
        if (radioAnswer102.isChecked()) {
            score = score + 10;
        }

        Toast.makeText(this, "Well done your score is " + score + " out of 100", Toast.LENGTH_SHORT).show();

    }

    public void resetAnswers(View view) {
        // reset quiz
        radioGroupBox2.clearCheck();
        radioGroupBox4.clearCheck();
        radioGroupBox5.clearCheck();
        radioGroupBox7.clearCheck();
        radioGroupBox8.clearCheck();
        radioGroupBox10.clearCheck();

        checkAnswer31.setChecked(false);
        checkAnswer32.setChecked(false);
        checkAnswer33.setChecked(false);
        checkAnswer34.setChecked(false);
        checkAnswer61.setChecked(false);
        checkAnswer62.setChecked(false);
        checkAnswer63.setChecked(false);
        checkAnswer64.setChecked(false);
        checkAnswer91.setChecked(false);
        checkAnswer92.setChecked(false);
        checkAnswer93.setChecked(false);
        checkAnswer94.setChecked(false);

        editUserInput.setText("");

    }
}
