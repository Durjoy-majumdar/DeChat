package zq0;

import android.app.ProgressDialog;
import fy3.C32226l;
import gy3.C87413o;
import js0.C88024r;
import rx3.C13598b0;
import te3.C90427mv;

/* renamed from: zq0.k1 */
public final class C91892k1 extends C87413o implements C32226l<C90427mv, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f263117d;

    /* renamed from: e */
    public final /* synthetic */ C91861e1 f263118e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91892k1(ProgressDialog progressDialog, C91861e1 e1Var) {
        super(1);
        this.f263117d = progressDialog;
        this.f263118e = e1Var;
    }

    public Object invoke(Object obj) {
        C88024r.m109572b(new C91889j1((C90427mv) obj, this.f263118e, this.f263117d));
        this.f263117d.dismiss();
        return C13598b0.f38549a;
    }
}
