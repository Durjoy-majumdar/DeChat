package com.tencent.p014mm.plugin.appbrand.utils;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jp3.C46566c;
import jp3.C9486a;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.j2 */
public final class C40568j2 implements C0125s, C9486a {

    /* renamed from: d */
    public final String f108963d;

    /* renamed from: e */
    public final C103766u f108964e;

    public C40568j2(int i, C46566c<C9486a> cVar) {
        C87412m.m108594g(cVar, "lifecycleKeeper");
        this.f108963d = "MicroMsg.VendingLifecycleAdapter#" + i;
        C103766u uVar = new C103766u(this);
        this.f108964e = uVar;
        cVar.keep(this);
        uVar.mo145138f(C39623j.C39626c.CREATED);
    }

    public void dead() {
        Log.m105924i(this.f108963d, "dead");
        this.f108964e.mo145138f(C39623j.C39626c.DESTROYED);
    }

    public C39623j getLifecycle() {
        return this.f108964e;
    }
}
