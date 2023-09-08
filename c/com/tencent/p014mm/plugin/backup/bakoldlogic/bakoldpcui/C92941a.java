package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import com.tencent.p014mm.autogen.events.MainUIShowListviewEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import mv0.C99980a;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.a */
public class C92941a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BakChatBanner$1 f267695d;

    public C92941a(BakChatBanner$1 bakChatBanner$1) {
        this.f267695d = bakChatBanner$1;
    }

    public void run() {
        C92943c cVar = this.f267695d.f267648d;
        cVar.getClass();
        cVar.f267698i = C99980a.m130643h().mo139322k().mo139331d();
        Log.m105919d("MicroMsg.BakChatBanner", "refreshForBakpc PCBannerStatus:%d, percent:%d", Integer.valueOf(C99980a.m130643h().mo139322k().f292969q), Integer.valueOf(cVar.f267698i));
        if (cVar.mo127358h(false)) {
            new MainUIShowListviewEvent().publish();
        }
    }
}
