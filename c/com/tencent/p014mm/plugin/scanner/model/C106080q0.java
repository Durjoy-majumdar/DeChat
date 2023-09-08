package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.scanner.model.C106076p0;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.scanner.model.q0 */
public final class C106080q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106076p0.C106077a f315837d;

    public C106080q0(C106076p0.C106077a aVar) {
        this.f315837d = aVar;
    }

    public final void run() {
        C106076p0 p0Var = C106076p0.f315823a;
        C106076p0.C106077a aVar = this.f315837d;
        long j = aVar.f315828a;
        int i = aVar.f315830c;
        String str = aVar.f315831d;
        HashMap<Long, C106075o0> hashMap = C106076p0.f315824b;
        C106075o0 o0Var = hashMap.get(Long.valueOf(j));
        if (o0Var != null) {
            o0Var.mo151631a(i, str);
        }
        hashMap.remove(Long.valueOf(j));
    }
}
