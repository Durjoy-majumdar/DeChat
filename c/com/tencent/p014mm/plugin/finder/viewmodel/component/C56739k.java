package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.sdk.platformtools.InetUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fj0.C86898q;
import o40.C61926c;
import p225rc.C89921j;
import rs1.C63579n8;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.k */
public final class C56739k implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C56711j f162643d;

    public C56739k(C56711j jVar) {
        this.f162643d = jVar;
    }

    public final boolean onTimerExpired() {
        Log.m105924i("FinderProjectionScreenUIC", "search device times:" + this.f162643d.f162587K);
        C56711j jVar = this.f162643d;
        int i = jVar.f162587K;
        boolean z = false;
        if (i >= jVar.f162586J) {
            jVar.f162587K = 0;
            jVar.getClass();
            C61926c.m72668M(new C63579n8(jVar));
            return false;
        }
        jVar.f162587K = i + 1;
        String a = C89921j.m112462a();
        String b = C89921j.m112463b(MMApplicationContext.getContext());
        int i2 = C86898q.f252215h;
        C86898q qVar = C86898q.C59104e.f169066a;
        if (InetUtil.isIPv6Address(a) && InetUtil.isIPv6Address(b)) {
            z = true;
        }
        qVar.mo121350f(z);
        return true;
    }
}
