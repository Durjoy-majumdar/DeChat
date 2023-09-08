package androidx.compose.p002ui.platform;

import fy3.C32226l;
import kotlin.ResultKt;
import p175j0.C60685u0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", mo125469f = "InfiniteAnimationPolicy.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.a1 */
public final class C54159a1 extends C91594j implements C32226l<C15601d<Object>, Object> {

    /* renamed from: d */
    public int f152098d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Long, Object> f152099e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54159a1(C32226l<? super Long, Object> lVar, C15601d<? super C54159a1> dVar) {
        super(1, dVar);
        this.f152099e = lVar;
    }

    public final C15601d<C13598b0> create(C15601d<?> dVar) {
        return new C54159a1(this.f152099e, dVar);
    }

    public Object invoke(Object obj) {
        return ((C54159a1) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152098d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C32226l<Long, Object> lVar = this.f152099e;
            this.f152098d = 1;
            obj = C60685u0.m70964b(lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
