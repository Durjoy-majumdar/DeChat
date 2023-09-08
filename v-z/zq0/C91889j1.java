package zq0;

import android.app.ProgressDialog;
import te3.C90427mv;

/* renamed from: zq0.j1 */
public final class C91889j1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90427mv f263085d;

    /* renamed from: e */
    public final /* synthetic */ C91861e1 f263086e;

    /* renamed from: f */
    public final /* synthetic */ ProgressDialog f263087f;

    public C91889j1(C90427mv mvVar, C91861e1 e1Var, ProgressDialog progressDialog) {
        this.f263085d = mvVar;
        this.f263086e = e1Var;
        this.f263087f = progressDialog;
    }

    public final void run() {
        C90427mv mvVar = this.f263085d;
        if (mvVar == null) {
            C91861e1.m115363c(this.f263086e, -1, "", "", "", "");
        } else {
            C91861e1.m115363c(this.f263086e, mvVar.f259700d, mvVar.f259701e, mvVar.f259702f, mvVar.f259704h, mvVar.f259705i);
        }
        this.f263087f.dismiss();
    }
}
