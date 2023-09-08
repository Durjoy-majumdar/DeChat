package qj1;

import android.content.Context;
import di0.C86299o;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C51203s61;
import te3.C64370fp1;

/* renamed from: qj1.le */
public final class C62872le extends C87413o implements C32227p<Boolean, C51203s61, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62850ke f178406d;

    /* renamed from: e */
    public final /* synthetic */ C86299o f178407e;

    /* renamed from: f */
    public final /* synthetic */ C64370fp1 f178408f;

    /* renamed from: g */
    public final /* synthetic */ C63965x f178409g;

    /* renamed from: h */
    public final /* synthetic */ boolean f178410h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62872le(C62850ke keVar, C86299o oVar, C64370fp1 fp12, C63965x xVar, boolean z) {
        super(2);
        this.f178406d = keVar;
        this.f178407e = oVar;
        this.f178408f = fp12;
        this.f178409g = xVar;
        this.f178410h = z;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        C51203s61 s612 = (C51203s61) obj2;
        C62042e eVar = C62042e.f176370a;
        Context context = this.f178406d.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        eVar.mo87047U1(context, false);
        C62850ke.m73956Z0(this.f178406d, this.f178409g, this.f178410h, this.f178407e, this.f178408f);
        return C13598b0.f38549a;
    }
}
