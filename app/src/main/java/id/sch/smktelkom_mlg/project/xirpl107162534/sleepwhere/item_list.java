package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Yess on 14/11/2016.
 */

public class item_list extends DetailActivity {
    TextView tvrating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate rating bar and a button
        final RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.ratingbar1);
        final TextView tvrating = (TextView) findViewById(R.id.textview3);

    }
}