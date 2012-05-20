package net.simonvt.datepicker.samples;

import net.simonvt.widget.DatePicker;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class LayoutSample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);

        boolean showCalendar = false;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            showCalendar = getResources().getConfiguration().smallestScreenWidthDp >= 600;
        } else {
            showCalendar =
                    (getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_XLARGE;
        }

        datePicker.setCalendarViewShown(showCalendar);
    }
}
