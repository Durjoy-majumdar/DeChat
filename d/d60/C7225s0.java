package d60;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87413o;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: d60.s0 */
public final class C7225s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7226t0 f25280d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f25281e;

    /* renamed from: f */
    public final /* synthetic */ String f25282f;

    /* renamed from: g */
    public final /* synthetic */ String f25283g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7225s0(C7226t0 t0Var, ViewGroup viewGroup, String str, String str2) {
        super(0);
        this.f25280d = t0Var;
        this.f25281e = viewGroup;
        this.f25282f = str;
        this.f25283g = str2;
    }

    public Object invoke() {
        Class cls = C76979h.class;
        if (this.f25280d.f25284f.getLiveRole() == 1) {
            this.f25280d.f25285g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f25281e.getContext(), this.f25281e.getContext().getString(C0966R.string.g_b, new Object[]{this.f25282f})));
        } else if (Util.isEqual(this.f25283g, C75592q0.m90789s())) {
            this.f25280d.f25285g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f25281e.getContext(), this.f25281e.getContext().getString(C0966R.string.g_d)));
        } else {
            this.f25280d.f25285g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f25281e.getContext(), this.f25281e.getContext().getString(C0966R.string.g_c, new Object[]{this.f25282f})));
        }
        return C13598b0.f38549a;
    }
}
