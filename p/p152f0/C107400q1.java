package p152f0;

import fy3.C32227p;
import kotlin.ResultKt;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", mo125469f = "TextFieldGestureModifiers.kt", mo125470l = {35}, mo125471m = "invokeSuspend")
/* renamed from: f0.q1 */
public final class C107400q1 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f321336d;

    /* renamed from: e */
    public /* synthetic */ Object f321337e;

    /* renamed from: f */
    public final /* synthetic */ C107351i1 f321338f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107400q1(C107351i1 i1Var, C15601d<? super C107400q1> dVar) {
        super(2, dVar);
        this.f321338f = i1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C107400q1 q1Var = new C107400q1(this.f321338f, dVar);
        q1Var.f321337e = obj;
        return q1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107400q1) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f321336d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C107351i1 i1Var = this.f321338f;
            this.f321336d = 1;
            if (C107421u0.m145521a((C109119z) this.f321337e, i1Var, this) == aVar) {
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
