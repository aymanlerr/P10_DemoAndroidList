package sg.edu.rp.c346.id22015131.p10_demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAPI;
    ArrayList<AndroidVersion> alAndroidVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAPI = findViewById(R.id.lvAPI);
        alAndroidVersion = new ArrayList<>();

        alAndroidVersion.add(new AndroidVersion("Pie", "9.0"));
        alAndroidVersion.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAndroidVersion.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersion);
        lvAPI.setAdapter(adapter);
    }
}