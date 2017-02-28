package cp.junyou.com.clockporject;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class StopWatchView extends LinearLayout {

	public StopWatchView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
//
//	@Override
//	protected void onFinishInflate() {
//		// TODO Auto-generated method stub
//		super.onFinishInflate();
//
//		tvHour = (TextView) findViewById(R.id.timeHour);
//		tvHour.setText("0");
//		tvMin = (TextView) findViewById(R.id.timeMin);
//		tvMin.setText("0");
//		tvSec = (TextView) findViewById(R.id.timeSec);
//		tvSec.setText("0");
//		tvMSec = (TextView) findViewById(R.id.timeMSec);
//		tvMSec.setText("0");
//
//		btnStart = (Button) findViewById(R.id.btnSWStart);
//		btnResume = (Button) findViewById(R.id.btnSwResume);
//		btnPause = (Button) findViewById(R.id.btnSWPause);
//		btnReset = (Button) findViewById(R.id.btnSWReset);
//		btnLop = (Button) findViewById(R.id.btnSWLop);
//
//		btnStart.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				startTimer();
//
//				btnStart.setVisibility(View.GONE);
//				btnPause.setVisibility(View.VISIBLE);
//				btnLop.setVisibility(View.VISIBLE);
//			}
//		});
//
//		btnPause.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//
//				stopTimer();
//
//				btnPause.setVisibility(View.GONE);
//				btnResume.setVisibility(View.VISIBLE);
//				btnLop.setVisibility(View.GONE);
//				btnReset.setVisibility(View.VISIBLE);
//
//			}
//		});
//
//		btnResume.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//
//				startTimer();
//
//				btnResume.setVisibility(View.GONE);
//				btnPause.setVisibility(View.VISIBLE);
//				btnReset.setVisibility(View.GONE);
//				btnLop.setVisibility(View.VISIBLE);
//
//			}
//		});
//		btnReset.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				stopTimer();
//				tenMSecs = 0;
//				adapter.clear();
//
//				btnResume.setVisibility(View.GONE);
//				btnPause.setVisibility(View.GONE);
//				btnReset.setVisibility(View.GONE);
//				btnLop.setVisibility(View.GONE);
//
//				btnStart.setVisibility(View.VISIBLE);
//			}
//		});
//		btnLop.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				adapter.insert(String.format("%d:%d:%d:%d", tenMSecs/100/60/60, tenMSecs/100/60%60, tenMSecs/100%60, tenMSecs%100), 0);
//			}
//		});
//
//		btnResume.setVisibility(View.GONE);
//		btnPause.setVisibility(View.GONE);
//		btnReset.setVisibility(View.GONE);
//		btnLop.setVisibility(View.GONE);
//
//		lvTimeList = (ListView) findViewById(R.id.lvWatchTime);
//		adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1);
//		lvTimeList.setAdapter(adapter);
//
//		showTimeTask = new TimerTask(){
//			@Override
//			public void run() {
//				hander.sendEmptyMessage(MSG_WHAT_SHOW_TIME);
//			}
//		};
//		timer.schedule(showTimeTask, 200, 200);
//	}
//
//	private void startTimer(){
//		if(timerTask == null){
//			timerTask  = new TimerTask(){
//				@Override
//				public void run() {
//					tenMSecs++;
//				}
//			};
//			timer.schedule(timerTask, 10, 10);
//		}
//	}
//
//	private void stopTimer(){
//		if(timerTask != null){
//			timerTask.cancel();
//			timerTask = null;
//		}
//	}
//
//	private int tenMSecs = 0;
//	private Timer timer = new Timer();
//	private TimerTask timerTask = null;
//	private TimerTask showTimeTask = null;
//
//	private TextView tvHour,tvMin,tvSec,tvMSec;
//	private Button btnStart,btnResume,btnPause,btnReset,btnLop;
//	private ListView lvTimeList;
//	private ArrayAdapter<String> adapter;
//
//	private Handler hander = new Handler(){
//		public void handleMessage(android.os.Message msg) {
//			switch (msg.what) {
//			case MSG_WHAT_SHOW_TIME:
//				tvHour.setText(tenMSecs/100/60/60+"");
//				tvMin.setText(tenMSecs/100/60%60+"");
//				tvSec.setText(tenMSecs/100%60+"");
//				tvMSec.setText(tenMSecs%100+"");
//				break;
//
//			default:
//				break;
//			}
//		};
//	};
//	private static final int MSG_WHAT_SHOW_TIME = 1;
//	public void onDestory(){
//		timer.cancel();
//	}
}
