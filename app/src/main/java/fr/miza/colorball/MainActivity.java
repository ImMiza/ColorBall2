package fr.miza.colorball;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;

import fr.miza.utils.managers.LevelManager;

public class MainActivity extends AppCompatActivity {

    private static LevelManager levelManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize() {
        levelManager = new LevelManager();
    }

    public void openLevelMenu(View view) {
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
    }

    public void onQuit(View view) {
        new AlertDialog.Builder(this)
                .setTitle(R.string.quit_title)
                .setMessage(R.string.confirm_quit)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        System.exit(0);
                    }})
                .setNegativeButton(android.R.string.no, null)
                .show();
    }

    public static LevelManager getLevelManager() {
        return levelManager;
    }
}
