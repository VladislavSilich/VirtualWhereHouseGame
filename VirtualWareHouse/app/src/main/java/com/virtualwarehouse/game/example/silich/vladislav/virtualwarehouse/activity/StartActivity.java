package com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.activity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.R;
import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.game.GameView;


public class StartActivity extends Activity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //application have not title
       // requestWindowFeature(Window.FEATURE_NO_TITLE);

        //always landscape orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //full screen
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        gameView = new GameView(this);

        //set view
        setContentView(gameView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.menu_start:
                gameView.setDraw();
                break;

            case R.id.menu_log:
                break;

            case R.id.menu_settings:
                break;

            case R.id.menu_exit:
                finish();
                break;

            default:
                return false;
        }

        return true;
    }

}
