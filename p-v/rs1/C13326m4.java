package rs1;

import as1.C0201a;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.m4 */
public final class C13326m4 extends C87413o implements C32226l<VASActivity, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13338n4 f37800d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13326m4(C13338n4 n4Var) {
        super(1);
        this.f37800d = n4Var;
    }

    public Object invoke(Object obj) {
        VASActivity vASActivity = (VASActivity) obj;
        C0201a aVar = this.f37800d.f37833d;
        if (aVar != null) {
            aVar.mo4919k(-aVar.f18132i, false);
        }
        if (vASActivity != null) {
            vASActivity.setVasFinishInterceptor(new C13314l4(this.f37800d));
        }
        return C13598b0.f38549a;
    }
}
