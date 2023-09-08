package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81334h;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81340p;
import hi0.C87492c;
import hi0.C87507t;
import java.util.Iterator;
import kr0.C88262c1;
import p170ic.C87688b;
import te3.ke4;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.p$a$$a */
public final /* synthetic */ class p$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81340p.C81341a f238807d;

    public /* synthetic */ p$a$$a(C81340p.C81341a aVar) {
        this.f238807d = aVar;
    }

    public final void run() {
        C81334h.C81335a aVar;
        C81340p.C81341a aVar2 = this.f238807d;
        Iterator<ke4> it = aVar2.f238804a.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            ke4 next = it.next();
            if (new C87492c(aVar2.f238805b, aVar2.f238806c).mo58858b(next.f136723d, next.f136725f, next.f136724e.f133908e).booleanValue()) {
                i++;
            }
        }
        if (i > 0) {
            C81334h hVar = C81334h.f238795a;
            String str = aVar2.f238806c;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z && (aVar = C81334h.f238796b.get(str)) != null) {
                aVar.f238799c = new C87688b(new C81333g(aVar), i);
            }
            C87507t.m108819a().mo121960b();
            return;
        }
        C81334h.f238795a.mo113610a(aVar2.f238806c, C88262c1.C88265c.Success_NoNeedGetCode);
    }
}
