package com.tencent.p014mm.plugin.ball.service;

import android.os.ResultReceiver;
import com.tencent.p014mm.plugin.ball.p1099ui.C105068d0;
import com.tencent.p014mm.plugin.ball.p1099ui.C105085q;
import com.tencent.p014mm.plugin.ball.p1099ui.C105091v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.ball.service.c$$g */
public class c$$g implements C105068d0 {

    /* renamed from: a */
    public final /* synthetic */ C105035c f311782a;

    public c$$g(C105035c cVar) {
        this.f311782a = cVar;
    }

    /* renamed from: a */
    public void mo137111a(int i, int i2) {
        Log.m105925i("MicroMsg.FloatBallService", "addBallInfo, show reach count limit callback:%s, proxyMode: %d", Integer.valueOf(i2), Integer.valueOf(i));
        if (i2 == 1) {
            Log.m105924i("MicroMsg.FloatBallService", "addBallInfo, show float menu view");
            this.f311782a.getClass();
            C105085q d = C105085q.m141018d();
            d.getClass();
            MMHandlerThread.postToMainThread(new C105091v(d, false, (ResultReceiver) null));
        }
    }
}
