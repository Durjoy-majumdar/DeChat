package zq0;

import android.app.ProgressDialog;
import te3.C51625v04;

/* renamed from: zq0.f1 */
public final class C91873f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51625v04 f263037d;

    /* renamed from: e */
    public final /* synthetic */ C91861e1 f263038e;

    /* renamed from: f */
    public final /* synthetic */ ProgressDialog f263039f;

    public C91873f1(C51625v04 v042, C91861e1 e1Var, ProgressDialog progressDialog) {
        this.f263037d = v042;
        this.f263038e = e1Var;
        this.f263039f = progressDialog;
    }

    public final void run() {
        C51625v04 v042 = this.f263037d;
        if (v042 == null) {
            C91861e1.m115362a(this.f263038e, -1);
        } else {
            C91861e1.m115362a(this.f263038e, v042.f143227d);
        }
        this.f263038e.f263017r.mo94537b();
        this.f263039f.dismiss();
    }
}
