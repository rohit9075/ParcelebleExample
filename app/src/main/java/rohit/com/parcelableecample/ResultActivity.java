package rohit.com.parcelableecample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Creating and getting the dataModel pacelebale object

        DataModel dataModel = getIntent().getExtras().getParcelable("item_key");
        if (dataModel == null) {
            throw new AssertionError("Null data item received!");
        }
// Printing the toast message according to id nummber parcel in the getExtras.

        Toast.makeText(this, dataModel.getName(),Toast.LENGTH_LONG).show();
    }
}
