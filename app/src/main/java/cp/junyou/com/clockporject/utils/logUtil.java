package cp.junyou.com.clockporject.utils;

import android.util.Log;

/**
 * Created by Administrator on 2017/2/15.
 */
public class logUtil {
        public static final String TAG = "TAG";
        public static final boolean DEBUG = true;

        public static void i(String tag, String msg) {
            if (DEBUG) {
                Log.i(tag, msg);
            }
        }

        public static void i(String msg) {
            if (DEBUG) {
                Log.i(TAG, msg);
            }
        }
}
