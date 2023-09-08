package p1064xf;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import lu3.C109426i;
import p761yd.C91440a;

/* renamed from: xf.a */
public class C91192a implements C109426i {
    public String getKey() {
        return "SyncBarrierWatchDogPlus";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        if (C91194c.f261458g) {
            try {
                if (!C91440a.INSTANCE.mo125375b()) {
                    C91194c.f261458g = true;
                    return;
                }
                Log.m105924i("SyncBarrierWatchDogPlus", "check Sync Barrier");
                MessageQueue queue = Looper.getMainLooper().getQueue();
                Field declaredField = queue.getClass().getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                Message message = (Message) declaredField.get(queue);
                if (message != null) {
                    try {
                        String message2 = message.toString();
                        C91194c.f261455d = message2;
                        Log.m105925i("SyncBarrierWatchDogPlus", "mMessage = %s", message2);
                    } catch (Exception e) {
                        C91194c.f261455d = "";
                        Log.m105920e("SyncBarrierWatchDogPlus", "mMessage Exception e : " + e.getMessage());
                    }
                    if (message.getWhen() - SystemClock.uptimeMillis() < -3000) {
                        if (message.getTarget() == null) {
                            int i = message.arg1;
                            if (i == C91194c.f261457f) {
                                C91194c.f261458g = true;
                                return;
                            }
                            String str = C91194c.f261455d;
                            if (str != null && str.contains("barrier=")) {
                                C91194c.m114456a(i);
                                C91194c.f261457f = i;
                            }
                        } else {
                            Log.m105924i("SyncBarrierWatchDogPlus", "Maybe Happens Lag");
                        }
                    }
                }
                C91194c.f261458g = true;
            } catch (Exception e2) {
                Log.m105920e("timerTask run error, message : %s", e2.getMessage());
            } catch (Throwable th) {
                C91194c.f261458g = true;
                throw th;
            }
        }
    }
}
