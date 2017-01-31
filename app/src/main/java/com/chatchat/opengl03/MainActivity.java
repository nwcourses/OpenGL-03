package com.chatchat.opengl03;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //OpenGLView view = new OpenGLView(this);
        //setContentView(view);
        setContentView(R.layout.activity_main);


        Button[] buttons = new Button[]{
                (Button) findViewById(R.id.mx),
                (Button) findViewById(R.id.px),
                (Button) findViewById(R.id.my),
                (Button) findViewById(R.id.py),
                (Button) findViewById(R.id.mz),
                (Button) findViewById(R.id.pz),
                (Button) findViewById(R.id.ac),
                (Button) findViewById(R.id.cw),
                (Button) findViewById(R.id.fw),
                (Button) findViewById(R.id.bk)
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(this);
        }
    }

    public void onClick(View v) {
        OpenGLView glView = (OpenGLView) findViewById(R.id.openglview);
        switch(v.getId()) {
            case R.id.mx:
                glView.moveX(-0.1f);
                break;
            case R.id.px:
                glView.moveX(0.1f);
                break;
            case R.id.my:
                glView.moveY(-0.1f);
                break;
            case R.id.py:
                glView.moveY(0.1f);
                break;
            case R.id.mz:
                glView.moveZ(-0.1f);
                break;
            case R.id.pz:
                glView.moveZ(0.1f);
                break;
            case R.id.ac:
                glView.rotateAnticlockwise();
                break;
            case R.id.cw:
                glView.rotateClockwise();
                break;
            case R.id.fw:
                glView.forward();
                break;
            case R.id.bk:
                glView.back();
                break;
        }
    }
}
