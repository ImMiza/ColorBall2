package fr.miza.colorball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.List;

import fr.miza.utils.Level;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        GridLayout levels_box = (GridLayout) findViewById(R.id.levels_box);
        levels_box.setColumnCount(4);
        initializeButton(levels_box);
    }

    private void initializeButton(GridLayout layout) {
        DisplayMetrics display = getApplicationContext().getResources().getDisplayMetrics();
        List<Level> levels = MainActivity.getLevelManager().getLevels();
        if(levels == null) return;
        int i = 1;
        int width = display.widthPixels / 4;
        for(Level l : levels) {
            Button b = new Button(this);
            b.setText(String.valueOf(i));
            b.setTextSize(18.0f);
            b.setWidth(width);
            b.setHeight(width);
            layout.addView(b);
            i++;
        }
    }

    public void returnToMainMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
