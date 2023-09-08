package zq0;

import android.app.ProgressDialog;
import te3.C51625v04;

/* renamed from: zq0.g1 */
public final class C91876g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51625v04 f263043d;

    /* renamed from: e */
    public final /* synthetic */ C91861e1 f263044e;

    /* renamed from: f */
    public final /* synthetic */ ProgressDialog f263045f;

    public C91876g1(C51625v04 v042, C91861e1 e1Var, ProgressDialog progressDialog) {
        this.f263043d = v042;
        this.f263044e = e1Var;
        this.f263045f = progressDialog;
    }

    public final void run() {
        C51625v04 v042 = this.f263043d;
        if (v042 == null) {
            C91861e1.m115362a(this.f263044e, -1);
        } else {
            C91861e1.m115362a(this.f263044e, v042.f143227d);
        }
        this.f263044e.f263017r.mo94537b();
        this.f263045f.dismiss();
    }
}
