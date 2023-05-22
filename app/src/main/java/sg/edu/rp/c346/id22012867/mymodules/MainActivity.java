package sg.edu.rp.c346.id22012867.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView firstMod;
    TextView secMod;
    TextView thirdMod;
    TextView fourthMod;
    TextView fifthMod;
    TextView sixthMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstMod = findViewById(R.id.c203);
        secMod = findViewById(R.id.c206);
        thirdMod = findViewById(R.id.c218);
        fourthMod = findViewById(R.id.c235);
        fifthMod = findViewById(R.id.c346);
        sixthMod = findViewById(R.id.g953);



        firstMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("title", "C203");
                intent.putExtra("name", "Web AppIn Development");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modC", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);

            }
        });
        secMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("title", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modC", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);

            }
        });
        thirdMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("title", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modC", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);

            }
        });
        fourthMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("title", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modC", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);

            }
        });
        fifthMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("title", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modC", 4);
                intent.putExtra("venue", "E63A");
                startActivity(intent);

            }
        });
        sixthMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("title", "G953");
                intent.putExtra("name", "Life Skills III");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("modC", 1);
                intent.putExtra("venue", "HB02");
                startActivity(intent);

            }
        });

    }
}