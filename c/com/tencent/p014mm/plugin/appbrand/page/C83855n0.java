package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;
import sq0.C13773f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.n0 */
public class C83855n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83820i0 f244835d;

    /* renamed from: e */
    public final /* synthetic */ String f244836e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f244837f;

    public C83855n0(C83849m0 m0Var, C83820i0 i0Var, String str) {
        this.f244837f = m0Var;
        this.f244835d = i0Var;
        this.f244836e = str;
    }

    public void run() {
        int indexOf;
        C83849m0 m0Var = this.f244837f;
        C83820i0 i0Var = this.f244835d;
        synchronized (m0Var.f244744o) {
            indexOf = m0Var.f244745p.indexOf(i0Var);
        }
        C83849m0.m103129f(this.f244837f, indexOf, this.f244836e, (JSONObject) null, (C13773f) null);
    }
}
