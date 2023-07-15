import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.team.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button menuselect;
    private Button menuselect2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        menuselect = findViewById(R.id.menuselect);
        menuselect2 = findViewById(R.id.menuselect2);

        menuselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });

        menuselect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // menuselect2 버튼이 클릭되었을 때 실행되는 코드
                // TODO: 원하는 동작 구현
            }
        });
    }
}
