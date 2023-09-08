package com.tencent.p014mm.plugin.game.luggage.page;

import com.tencent.p014mm.plugin.webview.luggage.ipc.ActiveMainProcessTask;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import k00.C46633d;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.l */
public class C41969l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f113054d;

    /* renamed from: e */
    public final /* synthetic */ ActiveMainProcessTask f113055e;

    /* renamed from: f */
    public final /* synthetic */ PBool f113056f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f113057g;

    /* renamed from: h */
    public final /* synthetic */ String f113058h;

    public C41969l(GameWebPage gameWebPage, long j, ActiveMainProcessTask activeMainProcessTask, PBool pBool, Runnable runnable, String str) {
        this.f113054d = j;
        this.f113055e = activeMainProcessTask;
        this.f113056f = pBool;
        this.f113057g = runnable;
        this.f113058h = str;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis() - this.f113054d;
        Log.m105924i("MicroMsg.GameWebPage", "activeIpcTask, callback");
        this.f113055e.mo114397h();
        synchronized (this.f113056f) {
            PBool pBool = this.f113056f;
            if (!pBool.value) {
                pBool.value = true;
                this.f113057g.run();
                String str = this.f113058h;
                Object obj = C44536d.f120770a;
                C44532a.m48912c("ipcServiceStartTime", str, C46633d.m51936a(str), (String) null, 0, currentTimeMillis, (String) null);
            }
        }
    }
}
