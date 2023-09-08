package com.tencent.p014mm.recoveryv2;

import com.tencent.p014mm.recoveryv2.C85678f;
import com.tencent.p014mm.recoveryv2.C85692k;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.recoveryv2.h */
public class C85687h implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ C85678f.C85681c f249685d;

    public C85687h(C85678f.C85681c cVar) {
        this.f249685d = cVar;
    }

    public Object call() {
        this.f249685d.mo119265c();
        C85678f.C85681c cVar = this.f249685d;
        long j = cVar.f249667f - cVar.f249670i.f249626a;
        long j2 = cVar.f249671j.f249650e;
        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePointLazy", "recovery interval = " + j + ", min = " + j2);
        if (j2 <= 0 || j >= j2) {
            this.f249685d.mo119267e();
            this.f249685d.mo119271i(true);
            C85678f.C85681c cVar2 = this.f249685d;
            cVar2.f249663b.postDelayed(new C85688i(cVar2), cVar2.f249671j.f249651f);
            return null;
        }
        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePointLazy", "too fast, skip and do nothing");
        this.f249685d.f249675k.set(false);
        return null;
    }
}
