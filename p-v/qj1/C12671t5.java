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

/* renamed from: qj1.t5 */
public final class C12671t5 extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f36296d;

    /* renamed from: e */
    public final /* synthetic */ String f36297e;

    /* renamed from: f */
    public final /* synthetic */ boolean f36298f;

    /* renamed from: g */
    public final /* synthetic */ boolean f36299g;

    /* renamed from: h */
    public final /* synthetic */ View f36300h;

    /* renamed from: i */
    public final /* synthetic */ C0581o5 f36301i;

    /* renamed from: j */
    public final /* synthetic */ C9507n f36302j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12671t5(C12322e5 e5Var, String str, boolean z, boolean z2, View view, C0581o5 o5Var, C9507n nVar) {
        super(2);
        this.f36296d = e5Var;
        this.f36297e = str;
        this.f36298f = z;
        this.f36299g = z2;
        this.f36300h = view;
        this.f36301i = o5Var;
        this.f36302j = nVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C49765hx0 hx02 = (C49765hx0) obj2;
        Class cls = C54991o.class;
        if (((Boolean) obj).booleanValue() && ((!C87412m.m108589b(((C54991o) this.f36296d.mo87696x0(cls)).f154262U0.get(this.f36297e), Boolean.valueOf(this.f36298f)) || !C87412m.m108589b(Boolean.valueOf(this.f36299g), ((C54991o) this.f36296d.mo87696x0(cls)).f154267V0.get(this.f36297e))) && C41573e3.f111902a.mo64659b())) {
            this.f36300h.setTag(C0966R.C0970id.f358125n91, Boolean.TRUE);
            C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> qVar = this.f36296d.f35506C.f36655h;
            if (qVar != null) {
                qVar.invoke(this.f36301i, this.f36300h, this.f36302j);
            }
        }
        return C13598b0.f38549a;
    }
}
