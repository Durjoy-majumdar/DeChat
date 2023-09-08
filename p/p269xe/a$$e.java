package p269xe;

import android.os.SystemClock;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p988jj.C87968a;

/* renamed from: xe.a$$e */
public class a$$e implements Runnable {
    public void run() {
        Map<Integer, Pair<String, Long>> map = C91177a.f261418d;
        synchronized (map) {
            for (Pair pair : ((HashMap) map).values()) {
                long uptimeMillis = SystemClock.uptimeMillis() - ((Long) pair.second).longValue();
                if (uptimeMillis >= 60000 && ((String) pair.first).contains("@")) {
                    int indexOf = ((String) pair.first).indexOf("@");
                    String substring = ((String) pair.first).substring(0, indexOf);
                    String substring2 = ((String) pair.first).substring(indexOf + 1);
                    if (substring2.contains("@")) {
                        int indexOf2 = substring2.indexOf("@");
                        String substring3 = substring2.substring(0, indexOf2);
                        String substring4 = substring2.substring(indexOf2 + 1);
                        Log.m105928w("Matrix.battery.AmsInvokeListener", "Long WakeLock: " + substring + "@" + substring3 + ", from=" + substring4 + ", duringMin=" + Math.max(uptimeMillis / 60000, 1) + ", since=" + new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(new Date(System.currentTimeMillis() - uptimeMillis)));
                        C87968a.C87969a.C87970a.m109467a("longWakelock", (Throwable) null, (Map<String, Object>) null, String.valueOf(Math.max(uptimeMillis / 60000, 1)), substring, substring4);
                    }
                }
            }
            ((HashMap) C91177a.f261418d).clear();
        }
    }
}
