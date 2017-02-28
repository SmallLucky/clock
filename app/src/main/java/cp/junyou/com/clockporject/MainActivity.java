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
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

import cp.junyou.com.clockporject.utils.logUtil;

public class MainActivity extends Activity {

    private TabHost tabHoat;
    private StopWatchView stopWatchView;

    protected Button btneditAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tabHoat = (TabHost) findViewById(android.R.id.tabhost);
//        tabHoat.setup();

//        tabHoat.addTab(tabHoat.newTabSpec("tabTime").setIndicator("Ê±ÖÓ").setContent(R.id.tabTime));
 //       tabHoat.addTab(tabHoat.newTabSpec("tabAlarm").setIndicator("alorm").setContent(R.id.tabAlorm));
//        tabHoat.addTab(tabHoat.newTabSpec("tabTimer").setIndicator("¼ÆÊ±Æ÷").setContent(R.id.tabtimer));
//        tabHoat.addTab(tabHoat.newTabSpec("tabStopWatch").setIndicator("Ãë±í").setContent(R.id.tabStopMatch));

//        stopWatchView = (StopWatchView) findViewById(R.id.tabStopMatch);
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

    }




