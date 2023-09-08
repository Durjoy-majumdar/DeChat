package mf1;

import android.view.View;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import rf1.C12992d;
import rx3.C13598b0;

/* renamed from: mf1.x0 */
public final class C10881x0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12982a f32487d;

    /* renamed from: e */
    public final /* synthetic */ C10846o0 f32488e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f32489f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10881x0(C12982a aVar, C10846o0 o0Var, C60905o oVar) {
        super(0);
        this.f32487d = aVar;
        this.f32488e = o0Var;
        this.f32489f = oVar;
    }

    public Object invoke() {
        C60905o oVar;
        C11920q qVar;
        View view;
        C12982a aVar = this.f32487d;
        if (!(aVar == null || (oVar = aVar.f37016e) == null || (qVar = aVar.f37015d) == null || (view = aVar.f37012a) == null)) {
            C12992d.C12993a.m12459b(aVar, oVar, view, qVar, true, (C32224a) null, 16, (Object) null);
            C32226l<? super C60905o, C13598b0> lVar = this.f32488e.f32397n;
            if (lVar != null) {
                lVar.invoke(this.f32489f);
            }
        }
        return C13598b0.f38549a;
    }
}
