package com.tencent.p014mm.plugin.websearch;

import android.widget.Toast;
import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import e00.C7575o0;
import te3.C48884bn2;
import u73.C101987v0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.websearch.k */
public class C5833k implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ int f21996d;

    /* renamed from: e */
    public final /* synthetic */ FTSWebViewLogic f21997e;

    /* renamed from: com.tencent.mm.plugin.websearch.k$a */
    public class C5834a implements Runnable {
        public C5834a(C5833k kVar) {
        }

        public void run() {
            Toast.makeText(MMApplicationContext.getContext(), "getCurrentLocation needUpdate", 0).show();
        }
    }

    public C5833k(FTSWebViewLogic fTSWebViewLogic, int i) {
        this.f21997e = fTSWebViewLogic;
        this.f21996d = i;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        Class cls = C7575o0.class;
        if (WeChatEnvironment.isCoolassistEnv()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C5834a(this));
        }
        C48884bn2 g = C101987v0.m134273g();
        if (g != null) {
            ((C7575o0) C86312j.m106911c(cls)).mo8693vf(this.f21996d, this.f21997e.mo134662g(g).toString());
            return false;
        }
        ((C7575o0) C86312j.m106911c(cls)).mo8693vf(this.f21996d, "");
        return false;
    }
}
