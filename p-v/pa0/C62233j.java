package pa0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$initComposeView$1$2", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: pa0.j */
public final class C62233j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Boolean> f176917d;

    /* renamed from: e */
    public final /* synthetic */ C62211a f176918e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62233j(C60690y0<Boolean> y0Var, C62211a aVar, C15601d<? super C62233j> dVar) {
        super(2, dVar);
        this.f176917d = y0Var;
        this.f176918e = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62233j(this.f176917d, this.f176918e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62233j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (this.f176917d.getValue().booleanValue()) {
            C62211a.m73133d3(this.f176918e);
        } else {
            this.f176918e.mo87298i3();
        }
        return C13598b0.f38549a;
    }
}
