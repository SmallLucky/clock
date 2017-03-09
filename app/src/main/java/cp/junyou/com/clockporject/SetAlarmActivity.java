package cp.junyou.com.clockporject;

import android.animation.TimeAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import cp.junyou.com.clockporject.utils.logUtil;
//import cp.junyou.com.R;

public class SetAlarmActivity extends AppCompatActivity {

    private TimePicker timePick;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm);

        timePick=(TimePicker)findViewById(R.id.timePicker);

        saveButton=(Button)findViewById(R.id.save_but);

        OnChangeListener  buc=new OnChangeListener();
        saveButton.setOnClickListener(buc);
        //是否使用24小时制
        timePick.setIs24HourView(true);
        TimeListener times=new TimeListener();
        timePick.setOnTimeChangedListener(times);
    }

    class OnChangeListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            int h=timePick.getCurrentHour();
            int m=timePick.getCurrentMinute();
            System.out.println("h:"+h+"   m:"+m);
        }
    }

    class TimeListener implements TimePicker.OnTimeChangedListener {

        /**
         * view 当前选中TimePicker控件
         *  hourOfDay 当前控件选中TimePicker 的小时
         * minute 当前选中控件TimePicker  的分钟
         */
        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            // TODO Auto-generated method stub
            System.out.println("h:"+ hourOfDay +" m:"+minute);
        }

    }

    public void setAlarmBack(View view){
        super.onBackPressed();
    }

    public void moreMusic(View view){
        logUtil.i("TAG","moreMusic!");
    }
}
