package p1064xf;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xf.b */
public class C91193b extends Handler {
    public C91193b(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        Log.m105925i("SyncBarrierWatchDogPlus", "mainHandler handleMessage, msg = %s", message.toString());
        int i = message.arg1;
        if (i == 0) {
            C91194c.f261453b++;
        } else if (i == 1) {
            C91194c.f261453b = 0;
        }
    }
}
