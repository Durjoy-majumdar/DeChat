package p155g0;

import a14.C0000n0;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p257w.C111626b;
import p257w.C111654m;
import p257w.C37944w0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", mo125469f = "SelectionMagnifier.kt", mo125470l = {102}, mo125471m = "invokeSuspend")
/* renamed from: g0.u */
public final class C32248u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f85670d;

    /* renamed from: e */
    public final /* synthetic */ C111626b<C112539e, C111654m> f85671e;

    /* renamed from: f */
    public final /* synthetic */ long f85672f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32248u(C111626b<C112539e, C111654m> bVar, long j, C15601d<? super C32248u> dVar) {
        super(2, dVar);
        this.f85671e = bVar;
        this.f85672f = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C32248u(this.f85671e, this.f85672f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C32248u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f85670d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C111626b<C112539e, C111654m> bVar = this.f85671e;
            C112539e eVar = new C112539e(this.f85672f);
            C37944w0<C112539e> w0Var = C107641q.f322035d;
            this.f85670d = 1;
            if (C111626b.m152137b(bVar, eVar, w0Var, (Object) null, (C32226l) null, this, 12, (Object) null) == aVar) {
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
