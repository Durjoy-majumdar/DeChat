package com.tencent.p014mm.sdk.p134kt;

import a14.C0000n0;
import a14.C53916l;
import a14.C53973z1;
import d14.C45252f;
import d14.C58042h;
import fy3.C32227p;
import gy3.C8479f0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo182094d2 = {"T", "La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.kt.CommonKt$syncFlow$4$1$1", mo125469f = "Common.kt", mo125470l = {229}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.kt.CommonKt$syncFlow$4$1$1 */
public final class CommonKt$syncFlow$4$1$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ C53916l<T> $cont;
    public final /* synthetic */ C8479f0<C53973z1> $job;
    public final /* synthetic */ C45252f<T> $this_syncFlow;
    public int label;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, mo182094d2 = {"T", "it", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    @C91590f(mo125468c = "com.tencent.mm.sdk.kt.CommonKt$syncFlow$4$1$1$1", mo125469f = "Common.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.sdk.kt.CommonKt$syncFlow$4$1$1$1 */
    public static final class C575501 extends C91594j implements C32227p<T, C15601d<? super C13598b0>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C575501 r0 = new C575501(lVar, f0Var, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(T t, C15601d<? super C13598b0> dVar) {
            return ((C575501) create(t, dVar)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                lVar.resumeWith(Result.m168114constructorimpl(this.L$0));
                C53973z1 z1Var = (C53973z1) f0Var.f27484d;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                return C13598b0.f38549a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonKt$syncFlow$4$1$1(C45252f<? extends T> fVar, C53916l<? super T> lVar, C8479f0<C53973z1> f0Var, C15601d<? super CommonKt$syncFlow$4$1$1> dVar) {
        super(2, dVar);
        this.$this_syncFlow = fVar;
        this.$cont = lVar;
        this.$job = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new CommonKt$syncFlow$4$1$1(this.$this_syncFlow, this.$cont, this.$job, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((CommonKt$syncFlow$4$1$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<T> fVar = this.$this_syncFlow;
            final C53916l<T> lVar = this.$cont;
            final C8479f0<C53973z1> f0Var = this.$job;
            C575501 r1 = new C575501((C15601d<? super C575501>) null);
            this.label = 1;
            if (C58042h.m67194c(fVar, r1, this) == aVar) {
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
