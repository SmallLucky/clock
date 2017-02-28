package cp.junyou.com.clockporject;

import java.util.Calendar;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TimeView extends LinearLayout {
//	private TextView tvTime;
//	public TimeView(Context context, AttributeSet attrs, int defStyle) {
//		super(context, attrs, defStyle);
//		// TODO Auto-generated constructor stub
//	}
//
	public TimeView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
//
//	public TimeView(Context context) {
//		super(context);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected void onFinishInflate() {
//		super.onFinishInflate();
//		tvTime = (TextView) findViewById(R.id.tvTime);
//		timerHandler.sendEmptyMessage(0);
//	}
//	@Override
//	protected void onVisibilityChanged(View changedView, int visibility) {
//		super.onVisibilityChanged(changedView, visibility);
//		if(visibility == View.VISIBLE){
//			timerHandler.sendEmptyMessage(0);
//		}else{
//			timerHandler.removeMessages(0);
//		}
//	}
//	private void refreshTime(){
//		Calendar c = Calendar.getInstance();
//		String time = String.format("%d:%d:%d", c.get(Calendar.HOUR),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
//		tvTime.setText(time);
//	}
//
//	private Handler timerHandler = new Handler(){
//
//		public void handleMessage(android.os.Message msg) {
//			refreshTime();
//			if(getVisibility() == View.VISIBLE){
//				timerHandler.sendEmptyMessageDelayed(0, 1000);
//			}
//		};
//	};
}
