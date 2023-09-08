package p257w;

import androidx.compose.p002ui.platform.C54197z0;
import fy3.C32226l;
import kotlin.ResultKt;
import p175j0.C60685u0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: w.g0 */
public final class C65913g0 {

    @C91590f(mo125468c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", mo125469f = "InfiniteAnimationPolicy.kt", mo125470l = {31}, mo125471m = "invokeSuspend")
    /* renamed from: w.g0$a */
    public static final class C65914a extends C91594j implements C32226l<C15601d<? super R>, Object> {

        /* renamed from: d */
        public int f189485d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Long, R> f189486e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65914a(C32226l<? super Long, ? extends R> lVar, C15601d<? super C65914a> dVar) {
            super(1, dVar);
            this.f189486e = lVar;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C65914a(this.f189486e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C65914a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189485d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C32226l<Long, R> lVar = this.f189486e;
                this.f189485d = 1;
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

    /* renamed from: a */
    public static final <R> Object m77652a(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
        C66212f context = dVar.getContext();
        int i = C54197z0.f152158c0;
        C54197z0 z0Var = (C54197z0) context.get(C54197z0.C54198a.f152159d);
        return z0Var == null ? C60685u0.m70964b(lVar, dVar) : z0Var.mo74987L(new C65914a(lVar, (C15601d<? super C65914a>) null), dVar);
    }
}
