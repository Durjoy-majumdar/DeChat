package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import te3.yu4;

/* renamed from: com.tencent.mm.plugin.voip.model.h0$$f */
public class h0$$f implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C106350h0 f317363d;

    public h0$$f(C106350h0 h0Var) {
        this.f317363d = h0Var;
    }

    public boolean onTimerExpired() {
        Log.m105926v("MicroMsg.Voip.VoipService", "voip repeat check is foreground");
        C106350h0 h0Var = this.f317363d;
        if (h0Var.f317349r == null) {
            h0Var.f317350s = 0;
            h0Var.f317328C.stopTimer();
            return false;
        }
        MMApplicationContext.getContext();
        if (AppForegroundDelegate.INSTANCE.f343454n) {
            C106350h0 h0Var2 = this.f317363d;
            yu4 yu4 = h0Var2.f317349r;
            MMHandlerThread.postToMainThread(new C106351i0(h0Var2, yu4.f145520d, yu4.f145521e, yu4.f145526j == 0));
            Log.m105925i("MicroMsg.Voip.VoipService", "steve:voip callin in mRepeatCheckHandler, roomid:%d, roomkey:%s, time:%d", Integer.valueOf(this.f317363d.f317349r.f145520d), Long.valueOf(this.f317363d.f317349r.f145521e), Integer.valueOf(this.f317363d.f317349r.f145522f));
            C106350h0 h0Var3 = this.f317363d;
            h0Var3.mo152611i(h0Var3.f317349r);
            C106350h0 h0Var4 = this.f317363d;
            h0Var4.f317349r = null;
            h0Var4.f317350s = 0;
            h0Var4.f317328C.stopTimer();
            C115669n.INSTANCE.idkeyStat(500, 5, 1, false);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C106350h0 h0Var5 = this.f317363d;
        if (currentTimeMillis - h0Var5.f317350s < 60000) {
            return true;
        }
        h0Var5.f317349r = null;
        h0Var5.f317350s = 0;
        h0Var5.f317328C.stopTimer();
        return false;
    }
}
