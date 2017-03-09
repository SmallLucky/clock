package cp.junyou.com.clockporject;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
import android.widget.FrameLayout;
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

    private FrameLayout ly_content;
//
//    private FirstFragment f1,f2;
//    private FragmentManager fragmentManager;

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
        selected();
    }

    private void bindView(){
        tabDeal = (TextView)this.findViewById(R.id.tab_deal);
        tabPoi = (TextView)this.findViewById(R.id.tab_poi);
        ly_content = (FrameLayout) findViewById(R.id.fragment_container);

        tabDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tabDeal.setSelected(true)
                if (false){
                    Intent i = new Intent(MainActivity.this, PlayAlarmAty.class);
                    // 设置启动的模式，创建一个新的任务
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                }
            }
        });
        tabPoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (false){
                    Intent i = new Intent(MainActivity.this, PlayAlarmAty.class);
                    // 设置启动的模式，创建一个新的任务
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                }
            }
        });
    }

    //重置所有文本的选中状态
    public void selected(){
        tabDeal.setSelected(true);
        tabPoi.setSelected(false);
    }

//    //隐藏所有Fragment
//    public void hideAllFragment(FragmentTransaction transaction){
//        if(f1!=null){
//            transaction.hide(f1);
//        }
//        if(f2!=null){
//            transaction.hide(f2);
//        }
//    }
//
//    @Override
//    public void onClick(View v) {
//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
//        hideAllFragment(transaction);
//        switch(v.getId()){
//            case R.id.tab_deal:
//                selected();
//                tabDeal.setSelected(true);
//                if(f1==null){
//                    f1 = new FirstFragment("第一个Fragment");
//                    transaction.add(R.id.fragment_container,f1);
//                }else{
//                    transaction.show(f1);
//                }
//                break;
//
//            case R.id.tab_poi:
//                selected();
//                tabPoi.setSelected(true);
//                if(f2==null){
//                    f2 = new FirstFragment("第er个Fragment");
//                    transaction.add(R.id.fragment_container,f2);
//                }else{
//                    transaction.show(f2);
//                }
//                break;
//        }
//
//        transaction.commit();
//    }
    @Override
    protected void onDestroy() {
//        stopWatchView.onDestory();
        super.onDestroy();
    }

}




