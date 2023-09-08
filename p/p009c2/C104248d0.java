package p009c2;

import android.view.inputmethod.BaseInputConnection;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: c2.d0 */
public final class C104248d0 extends C87413o implements C32224a<BaseInputConnection> {

    /* renamed from: d */
    public final /* synthetic */ C104242c0 f308572d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104248d0(C104242c0 c0Var) {
        super(0);
        this.f308572d = c0Var;
    }

    public Object invoke() {
        return new BaseInputConnection(this.f308572d.f308550a, false);
    }
}
