package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.n0 */
public class C68604n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68600m0 f197066d;

    public C68604n0(C68600m0 m0Var) {
        this.f197066d = m0Var;
    }

    public void run() {
        boolean z;
        C81743t tVar = this.f197066d.f197046d;
        synchronized (tVar) {
            z = tVar.f239893o;
        }
        if (z) {
            this.f197066d.f197058s.setImageResource(C0966R.C0969drawable.f4467dc);
            C68600m0 m0Var = this.f197066d;
            m0Var.f197051i.setText(m0Var.getContext().getString(C0966R.string.f7847tn));
        } else if (this.f197066d.f197046d.mo114112d()) {
            this.f197066d.f197058s.setImageResource(C0966R.C0969drawable.f4467dc);
            C68600m0 m0Var2 = this.f197066d;
            m0Var2.f197051i.setText(m0Var2.getContext().getString(C0966R.string.f7849tp));
        } else {
            this.f197066d.f197058s.setImageResource(C0966R.C0969drawable.f4466db);
            C68600m0 m0Var3 = this.f197066d;
            m0Var3.f197051i.setText(m0Var3.getContext().getString(C0966R.string.f7846tm));
        }
        C68600m0.m80857b(this.f197066d);
    }
}
