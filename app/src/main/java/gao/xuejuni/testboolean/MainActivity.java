package gao.xuejuni.testboolean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "boolean";


    boolean isFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    // 测试boolean
    public void  test(){


        Log.d(TAG,isFirst+"这是一个测试的apk");

        if (!isFirst){

            isFirst = true;

            Log.d(TAG,isFirst+"--");

        }else {


        }


    }
}
