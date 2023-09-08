package zq0;

import android.app.ProgressDialog;
import te3.C90427mv;

/* renamed from: zq0.h1 */
public final class C91880h1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90427mv f263058d;

    /* renamed from: e */
    public final /* synthetic */ C91861e1 f263059e;

    /* renamed from: f */
    public final /* synthetic */ ProgressDialog f263060f;

    public C91880h1(C90427mv mvVar, C91861e1 e1Var, ProgressDialog progressDialog) {
        this.f263058d = mvVar;
        this.f263059e = e1Var;
        this.f263060f = progressDialog;
    }

    public final void run() {
        C90427mv mvVar = this.f263058d;
        if (mvVar == null) {
            C91861e1.m115363c(this.f263059e, -1, "", "", "", "");
        } else {
            C91861e1.m115363c(this.f263059e, mvVar.f259700d, mvVar.f259701e, mvVar.f259702f, mvVar.f259704h, mvVar.f259705i);
        }
        this.f263060f.dismiss();
    }
}
