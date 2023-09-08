package com.tencent.p014mm.plugin.game.luggage.page;

import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.m */
public class C41970m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PBool f113059d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f113060e;

    /* renamed from: f */
    public final /* synthetic */ GameWebPage f113061f;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.m$a */
    public class C41971a implements Runnable {
        public C41971a() {
        }

        public void run() {
            C41970m.this.f113060e.run();
        }
    }

    public C41970m(GameWebPage gameWebPage, PBool pBool, Runnable runnable) {
        this.f113061f = gameWebPage;
        this.f113059d = pBool;
        this.f113060e = runnable;
    }

    public void run() {
        synchronized (this.f113059d) {
            if (!this.f113059d.value) {
                Log.m105924i("MicroMsg.GameWebPage", "activeIpcTask, time out, callback");
                this.f113059d.value = true;
                this.f113061f.mo67933N(new C41971a());
            }
        }
    }
}
