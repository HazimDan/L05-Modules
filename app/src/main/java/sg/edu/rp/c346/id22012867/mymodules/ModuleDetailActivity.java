package sg.edu.rp.c346.id22012867.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView module;
    TextView name;
    TextView year;
    TextView sem;
    TextView modC;
    TextView venue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        module = findViewById(R.id.module);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        sem = findViewById(R.id.sem);
        modC = findViewById(R.id.modC);
        venue = findViewById(R.id.venue);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String mod = intentReceived.getStringExtra("title");
        String moduleName = intentReceived.getStringExtra("name");
        int modYear = intentReceived.getIntExtra("year", 0);
        int modSem = intentReceived.getIntExtra("sem",0);
        int modCred = intentReceived.getIntExtra("modC",0);
        String modClass = intentReceived.getStringExtra("venue");

        module.setText(mod);
        name.setText(moduleName);
        year.setText("Academic Year: " + modYear);
        sem.setText("Semester: " + modSem);
        modC.setText("Module Credit: " + modCred);
        venue.setText("Venue: " + modClass);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}