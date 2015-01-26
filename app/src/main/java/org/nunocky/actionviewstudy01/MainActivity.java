package org.nunocky.actionviewstudy01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // getSupportActionBar().setDisplayShowHomeEnabled(true);
        // getSupportActionBar().setIcon(R.drawable.ic_launcher);
        getSupportActionBar().setHomeButtonEnabled(true);
        ButterKnife.inject(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.button)
    public void buttonClicked() {
        Intent intent = new Intent(this, ActionViewActivity1.class);
        startActivity(intent);
    }

    @OnClick(R.id.button2)
    public void button2Clicked() {
        Intent intent = new Intent(this, ActionViewActivity2.class);
        startActivity(intent);
    }
}
