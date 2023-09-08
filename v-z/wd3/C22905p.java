package wd3;

import jc0.C21210b;

/* renamed from: wd3.p */
public class C22905p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21210b f65856d;

    /* renamed from: e */
    public final /* synthetic */ C22906q f65857e;

    public C22905p(C22906q qVar, C21210b bVar) {
        this.f65857e = qVar;
        this.f65856d = bVar;
    }

    public void run() {
        this.f65857e.f65865h = System.currentTimeMillis();
        C22909x0 x0Var = this.f65857e.f65861d;
        if (x0Var != null) {
            x0Var.onFinish();
            this.f65857e.f65861d = null;
        }
        if (C118762j.f355306a.mo183488a(this.f65857e.f65862e) && this.f65856d.f59986b == 2) {
            C22899i iVar = C22899i.f65833a;
            C22906q qVar = this.f65857e;
            iVar.mo36074d(qVar.f65863f, true, qVar.f65865h - qVar.f65864g);
            iVar.mo36073c(this.f65857e.f65863f, true);
        }
    }
}
