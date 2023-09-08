package qj1;

import android.view.View;
import cj1.C0581o5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9507n;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: qj1.q5 */
public final class C12609q5 extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f36143d;

    /* renamed from: e */
    public final /* synthetic */ String f36144e;

    /* renamed from: f */
    public final /* synthetic */ boolean f36145f;

    /* renamed from: g */
    public final /* synthetic */ boolean f36146g;

    /* renamed from: h */
    public final /* synthetic */ View f36147h;

    /* renamed from: i */
    public final /* synthetic */ C0581o5 f36148i;

    /* renamed from: j */
    public final /* synthetic */ C9507n f36149j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12609q5(C12322e5 e5Var, String str, boolean z, boolean z2, View view, C0581o5 o5Var, C9507n nVar) {
        super(2);
        this.f36143d = e5Var;
        this.f36144e = str;
        this.f36145f = z;
        this.f36146g = z2;
        this.f36147h = view;
        this.f36148i = o5Var;
        this.f36149j = nVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C49765hx0 hx02 = (C49765hx0) obj2;
        Class cls = C54991o.class;
        if (((Boolean) obj).booleanValue() && ((!C87412m.m108589b(((C54991o) this.f36143d.mo87696x0(cls)).f154262U0.get(this.f36144e), Boolean.valueOf(this.f36145f)) || !C87412m.m108589b(Boolean.valueOf(this.f36146g), ((C54991o) this.f36143d.mo87696x0(cls)).f154267V0.get(this.f36144e))) && C41573e3.f111902a.mo64659b())) {
            this.f36147h.setTag(C0966R.C0970id.f358125n91, Boolean.TRUE);
            C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> qVar = this.f36143d.f35506C.f36655h;
            if (qVar != null) {
                qVar.invoke(this.f36148i, this.f36147h, this.f36149j);
            }
        }
        return C13598b0.f38549a;
    }
}
