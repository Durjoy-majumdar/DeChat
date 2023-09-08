package p152f0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p009c2.C104269s;
import p009c2.C28482z;
import p1166z0.C112541g;
import p463c0.C104193e;
import p560i2.C33181m;
import p735w1.C111703v;
import p735w1.C38006x;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", mo125469f = "CoreTextField.kt", mo125470l = {297}, mo125471m = "invokeSuspend")
/* renamed from: f0.u */
public final class C107420u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f321421d;

    /* renamed from: e */
    public final /* synthetic */ C104193e f321422e;

    /* renamed from: f */
    public final /* synthetic */ C28482z f321423f;

    /* renamed from: g */
    public final /* synthetic */ C107394p2 f321424g;

    /* renamed from: h */
    public final /* synthetic */ C107401q2 f321425h;

    /* renamed from: i */
    public final /* synthetic */ C104269s f321426i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107420u(C104193e eVar, C28482z zVar, C107394p2 p2Var, C107401q2 q2Var, C104269s sVar, C15601d<? super C107420u> dVar) {
        super(2, dVar);
        this.f321422e = eVar;
        this.f321423f = zVar;
        this.f321424g = p2Var;
        this.f321425h = q2Var;
        this.f321426i = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C107420u(this.f321422e, this.f321423f, this.f321424g, this.f321425h, this.f321426i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107420u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f321421d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C104193e eVar = this.f321422e;
            C28482z zVar = this.f321423f;
            C107347h1 h1Var = this.f321424g.f321313a;
            C111703v vVar = this.f321425h.f321339a;
            C104269s sVar = this.f321426i;
            this.f321421d = 1;
            int b = sVar.mo145897b(C38006x.m41697e(zVar.f78286b));
            Object a = eVar.mo145810a(b < vVar.f334371a.f334361a.length() ? vVar.mo163364b(b) : b != 0 ? vVar.mo163364b(b - 1) : new C112541g(0.0f, 0.0f, 1.0f, (float) C33181m.m39966b(C107393p1.m145499a(h1Var.f321169b, h1Var.f321173f, h1Var.f321174g, C107393p1.f321312a, 1))), this);
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
