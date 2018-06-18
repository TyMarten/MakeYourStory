package comtymarten.httpsgithub.makeyourstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static void checkButtonPress()
    {

    }



    public void changeStory(View view)
    {
        String story;

        int stage = 0;
        int truePass = 0;
        int noPass = 0;
        int sloppyPass = 0;
        boolean endPass = false;

        mBtn1 = (Button) findViewById (R.id.btn_1);
        mBtn2 = (Button) findViewById (R.id.btn_2);
        mBtn3 = (Button) findViewById (R.id.btn_3);

        if( stage == 0 )
        {
            story = "Welcome to the game";

            if(mBtn1.isPressed())
            {
                stage = stage + 1;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 3;
            }
        }

        if( stage == 1 )
        {
            truePass = truePass + 2;
            story = "stage 1 in story PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 4;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 5;
            }
        }
        if( stage == 2)
        {
            truePass = truePass + 1;
            sloppyPass = sloppyPass + 2;
            story = "stage 1 in story FAIL";

            if(mBtn1.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 4;
            }
        }
        if( stage  == 3)
        {
            sloppyPass = sloppyPass + 1;
            noPass = noPass  + 2;
            story = "stage 2 i story true";

            if(mBtn1.isPressed())
            {
                stage = stage + 1;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 3;
            }
        }

        if( stage  == 4 )
        {
            truePass = truePass + 1;
            sloppyPass = sloppyPass + 2;
            story = "stage 2 i story FAIL      SLOPPY PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 4;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 5;
            }
        }
        if( stage  == 5 )
        {
            sloppyPass = sloppyPass + 1;
            noPass = noPass  + 2;
            story = "stage 2 i story FAIL      FAIL";

            if(mBtn1.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 4;
            }
        }
        if( stage  == 6 )
        {
            truePass = truePass + 2;
            story = "stage 2 i story FAIL       TRUE PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 1;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 3;
            }
        }

        if( stage  == 7 )
        {
            truePass = truePass + 2;
            story = "stage 3 in story            TRUE PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 4;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 5;
            }

        }
        if( stage  == 8 )
        {
            sloppyPass = sloppyPass + 1;
            noPass = noPass  + 2;
            story = "stage 3 in story             FAIL";

            if(mBtn1.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 4;
            }

        }
        if( stage == 9 )
        {
            truePass = truePass + 1;
            sloppyPass = sloppyPass + 2;
            story = "stage 3 in story             SLOPPY PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 1;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 3;
            }

        }

        if( stage  == 10 )
        {
            sloppyPass = sloppyPass + 1;
            noPass = noPass  + 2;
            story = "stage 3 in story             FAIL";

            if(mBtn1.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 4;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 5;
            }

        }
        if( stage  == 11 )
        {
            truePass = truePass + 1;
            sloppyPass = sloppyPass + 2;
            story = "stage 2 i story FAIL      SLOPPY PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 4;
            }

        }
        if( stage  == 12 )
        {
            truePass = truePass + 2;
            story = "stage 2 i story FAIL       TRUE PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 1;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 3;
            }

        }

        if( stage  == 13 )
        {
            sloppyPass = sloppyPass + 1;
            noPass = noPass  + 2;
            endPass = true;
            story = "stage 3 in story             FAIL";

            if(mBtn1.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 4;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 5;
            }

        }
        if( stage  == 14 )
        {
            truePass = truePass + 2;
            endPass = true;
            story = "stage 2 i story FAIL       TRUE PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 3;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 4;
            }

        }
        if( stage  == 15 )
        {
            endPass = true;
            truePass = truePass + 1;
            sloppyPass = sloppyPass + 2;
            story = "stage 2 i story FAIL      SLOPPY PASS";

            if(mBtn1.isPressed())
            {
                stage = stage + 1;
            }
            if(mBtn2.isPressed())
            {
                stage = stage + 2;
            }
            if(mBtn3.isPressed())
            {
                stage = stage + 3;
            }

        }

        if( truePass > sloppyPass && truePass > noPass )
        {
            story = "stage 3 in story        Good End";
        }
        if( sloppyPass >= truePass && sloppyPass > noPass )
        {
            story = "stage 2 i story FAIL       Meh End";
        }
        if( noPass >= sloppyPass && noPass >= truePass)
        {
            story = "stage 2 i story FAIL      SLOPPY PASS";
        }

    }

}

