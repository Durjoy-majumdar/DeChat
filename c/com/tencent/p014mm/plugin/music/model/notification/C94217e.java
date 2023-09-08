package com.tencent.p014mm.plugin.music.model.notification;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.p014mm.plugin.music.model.notification.MMMusicPlayerService;
import com.tencent.p014mm.sdk.platformtools.Log;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.music.model.notification.e */
public class C94217e implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ MMMusicNotificationHelper f272179d;

    public C94217e(MMMusicNotificationHelper mMMusicNotificationHelper) {
        this.f272179d = mMMusicNotificationHelper;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.m105924i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceConnected");
        if (!(iBinder instanceof MMMusicPlayerService.C94211b)) {
            Log.m105921e("MicroMsg.Music.MMMusicNotificationHelper", "service %s isn't MMMusicPlayerService, err, return", iBinder.getClass().getName());
            Assert.assertTrue(false);
            return;
        }
        boolean unused = this.f272179d.f272159b = false;
        MMMusicPlayerService unused2 = this.f272179d.f272158a = ((MMMusicPlayerService.C94211b) iBinder).mo129514a();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.m105924i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceDisconnected");
        this.f272179d.f272159b = false;
        this.f272179d.f272158a = null;
    }
}
