package com.tencent.p014mm.plugin.appbrand.widget.input;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.q0 */
public final class C104917q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104912p0 f311529d;

    /* renamed from: e */
    public final /* synthetic */ int f311530e;

    /* renamed from: f */
    public final /* synthetic */ int f311531f;

    public C104917q0(C104912p0 p0Var, int i, int i2) {
        this.f311529d = p0Var;
        this.f311530e = i;
        this.f311531f = i2;
    }

    public final void run() {
        C104912p0 p0Var = this.f311529d;
        int i = this.f311530e;
        int i2 = this.f311531f;
        p0Var.getClass();
        if (i >= 0 && i2 >= 0 && i <= i2) {
            try {
                p0Var.f311525w.setSelection(i, i2);
            } catch (Exception unused) {
            }
        }
    }
}
