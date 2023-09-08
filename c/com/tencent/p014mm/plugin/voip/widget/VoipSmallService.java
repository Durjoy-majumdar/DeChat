package com.tencent.p014mm.plugin.voip.widget;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoipSmallService */
public class VoipSmallService extends Service {
    public IBinder onBind(Intent intent) {
        Log.m105924i("MicroMsg.VoipSmallService", "VoipSmallService onBind");
        Notification notification = (Notification) intent.getParcelableExtra("notification");
        if (!C11171e.m11046c(26) || notification == null) {
            return null;
        }
        startForeground(40, notification);
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.VoipSmallService", "VoipSmallService onCreate");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.VoipSmallService", "VoipSmallService onDestroy");
    }

    public boolean onUnbind(Intent intent) {
        Log.m105924i("MicroMsg.VoipSmallService", "VoipSmallService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
