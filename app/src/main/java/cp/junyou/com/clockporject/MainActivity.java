package cp.junyou.com.clockporject;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

import cp.junyou.com.clockporject.utils.logUtil;

public class MainActivity extends Activity {

    protected Button btneditAlarm;
    protected Button addBut;

    private TextView tabDeal;
    private TextView tabPoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btneditAlarm = (Button)findViewById(R.id.edit_but);
        btneditAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlayAlarmAty.class);
                // 设置启动的模式，创建一个新的任务
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });
        addBut = (Button)findViewById(R.id.add_but);
        if (addBut != null)
        {

            addBut.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    try {
                        logUtil.i("TAG","add but!");
                        Intent i = new Intent(MainActivity.this, SetAlarmActivity.class);
                        // 添加Alarm
                        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(i);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });

        }

        bindView();
    }

    private void bindView(){
//        tabDeal = (TextView)this.findViewById(R.id.txt_deal);
//        tabPoi = (TextView)this.findViewById(R.id.txt_poi);
//
//        tabDeal.setOnClickListener(this);
//        tabPoi.setOnClickListener(this);
    }

//    btnAddAlarm.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            addAlarm();
//        }
//    });
    @Override
    protected void onDestroy() {
//        stopWatchView.onDestory();
        super.onDestroy();
    }

//    private View.OnClickListener onClickSetting = new View.OnClickListener()
//    {
//        @Override
//        public void onClick(View v)
//        {
////            Log.i("TAG","setting");
//            try {
//                Intent settingAvt = new Intent(MainActivity.this,SetAlarmActivity.class); //PersonalCenterActivity,SettingActivity
//                settingAvt.putExtra("title", "个人中心");
//                settingAvt.putExtra("frag_id", "GeneralSettingsFragment");
//                startActivity(settingAvt);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    };
    }




