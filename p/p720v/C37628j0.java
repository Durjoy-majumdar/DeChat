package p720v;

import a14.C0000n0;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import p257w.C111626b;
import p257w.C111654m;
import p257w.C37897e;
import p257w.C37899f;
import p257w.C37901h;
import p560i2.C33181m;
import p720v.C111261i0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", mo125469f = "AnimationModifier.kt", mo125470l = {121}, mo125471m = "invokeSuspend")
/* renamed from: v.j0 */
public final class C37628j0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f99764d;

    /* renamed from: e */
    public final /* synthetic */ C111261i0.C37627a f99765e;

    /* renamed from: f */
    public final /* synthetic */ long f99766f;

    /* renamed from: g */
    public final /* synthetic */ C111261i0 f99767g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37628j0(C111261i0.C37627a aVar, long j, C111261i0 i0Var, C15601d<? super C37628j0> dVar) {
        super(2, dVar);
        this.f99765e = aVar;
        this.f99766f = j;
        this.f99767g = i0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C37628j0(this.f99765e, this.f99766f, this.f99767g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C37628j0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C32227p<? super C33181m, ? super C33181m, C13598b0> pVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f99764d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C111626b<C33181m, C111654m> bVar = this.f99765e.f99762a;
            C33181m mVar = new C33181m(this.f99766f);
            C37901h<C33181m> hVar = this.f99767g.f333142d;
            this.f99764d = 1;
            obj = C111626b.m152137b(bVar, mVar, hVar, (Object) null, (C32226l) null, this, 12, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C37899f fVar = (C37899f) obj;
        if (fVar.f100310b == C37897e.Finished && (pVar = this.f99767g.f333144f) != null) {
            pVar.invoke(new C33181m(this.f99765e.f99763b), fVar.f100309a.getValue());
        }
        return C13598b0.f38549a;
    }
}
