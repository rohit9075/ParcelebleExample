package rohit.com.parcelableecample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        List<DataModel> list;
        DataModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        // Adding the data to the array list
        list.add(new DataModel(1,"rohit kumar", "Chhapra", "Bihar"));
        list.add(new DataModel(2,"Mohit kumar", "saran", "Bihar"));
        list.add(new DataModel(3,"Suresh kumar", "Bangalore", "Karnatka"));
        list.add(new DataModel(4,"Dhawan kumar", "Bhopal", "M.P"));

        // getting the position of the object in the arrayList
        model = list.get(1);

        // Registering the button click listner
        Button mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Initializing the intent object
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                // putExtra method call for sending the complex object one activity to another activity
                intent.putExtra("item_key", model);
                // Starting the activity
                startActivity(intent);
            }
        });
    }
}
