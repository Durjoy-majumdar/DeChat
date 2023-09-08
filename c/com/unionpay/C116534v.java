package com.unionpay;

/* renamed from: com.unionpay.v */
public final class C116534v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C116515a0 f349501d;

    /* renamed from: e */
    public final /* synthetic */ String f349502e;

    /* renamed from: f */
    public final /* synthetic */ C116517b0 f349503f;

    public C116534v(C116516b bVar, C116515a0 a0Var, String str, C116517b0 b0Var) {
        this.f349501d = a0Var;
        this.f349502e = str;
        this.f349503f = b0Var;
    }

    public final void run() {
        C116515a0 a0Var = this.f349501d;
        if (a0Var != null) {
            a0Var.mo180512a(this.f349502e, this.f349503f);
        }
    }
}
