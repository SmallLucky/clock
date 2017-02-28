package cp.junyou.com.clockporject;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by Administrator on 2017/2/17.
 */
public class PlayAlarmAty extends Activity {
    private MediaPlayer mp;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       setContentView(R.layout.alarm_player_aty);

        // 使用一个资源文件对其进行实例化
        mp = MediaPlayer.create(this, R.raw.alarm);

        mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("调用了onPause方法");
        // 结束
        finish();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("调用了onDestroy方法");
        // 释放资源
        mp.stop();
        mp.release();
    }

}
