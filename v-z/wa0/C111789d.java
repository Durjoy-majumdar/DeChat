package wa0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p257w.C37901h;
import p267x.C111932l2;
import p759y.C112273p0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.ScrollableTabData$onLaidOut$1$1", mo125469f = "TabRowWithoutMinWidth.kt", mo125470l = {233}, mo125471m = "invokeSuspend")
/* renamed from: wa0.d */
public final class C111789d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f334749d;

    /* renamed from: e */
    public final /* synthetic */ C111790e f334750e;

    /* renamed from: f */
    public final /* synthetic */ int f334751f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111789d(C111790e eVar, int i, C15601d<? super C111789d> dVar) {
        super(2, dVar);
        this.f334750e = eVar;
        this.f334751f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111789d(this.f334750e, this.f334751f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111789d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f334749d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C111932l2 l2Var = this.f334750e.f334752a;
            int i2 = this.f334751f;
            C37901h<Float> hVar = C111794j.f334775a;
            this.f334749d = 1;
            Object a = C112273p0.m153168a(l2Var, (float) (i2 - l2Var.mo163632d()), hVar, this);
            if (a != aVar) {
                a = C13598b0.f38549a;
            }
            if (a == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
