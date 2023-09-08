package com.tencent.p014mm.recoveryv2;

import com.tencent.p014mm.recoveryv2.C85678f;
import com.tencent.p014mm.recoveryv2.C85692k;

/* renamed from: com.tencent.mm.recoveryv2.i */
public class C85688i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85678f.C85682d f249686d;

    public C85688i(C85678f.C85682d dVar) {
        this.f249686d = dVar;
    }

    public void run() {
        if (this.f249686d.f249676l.get()) {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "auto clear task has been canceled, skip");
            return;
        }
        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "auto clear point");
        this.f249686d.mo119275k();
    }
}
