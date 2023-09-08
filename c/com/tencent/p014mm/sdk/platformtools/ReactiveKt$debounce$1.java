package com.tencent.p014mm.sdk.platformtools;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"T", "param", "Lrx3/b0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.ReactiveKt$debounce$1 */
public final class ReactiveKt$debounce$1 extends C87413o implements C32226l<T, C13598b0> {
    public final /* synthetic */ C0000n0 $coroutineScope;
    public final /* synthetic */ C8479f0<C53973z1> $debounceJob;
    public final /* synthetic */ C32226l<T, C13598b0> $destinationFunction;
    public final /* synthetic */ long $waitMs;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo182094d2 = {"T", "La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    @C91590f(mo125468c = "com.tencent.mm.sdk.platformtools.ReactiveKt$debounce$1$1", mo125469f = "Reactive.kt", mo125470l = {54}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.sdk.platformtools.ReactiveKt$debounce$1$1 */
    public static final class C446441 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
        public int label;

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C446441(j, lVar, t2, dVar);
        }

        public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
            return ((C446441) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = j;
                this.label = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar.invoke(t2);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactiveKt$debounce$1(C8479f0<C53973z1> f0Var, C0000n0 n0Var, long j, C32226l<? super T, C13598b0> lVar) {
        super(1);
        this.$debounceJob = f0Var;
        this.$coroutineScope = n0Var;
        this.$waitMs = j;
        this.$destinationFunction = lVar;
    }

    public final void invoke(T t) {
        C53973z1 z1Var = (C53973z1) this.$debounceJob.f27484d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C8479f0<C53973z1> f0Var = this.$debounceJob;
        C0000n0 n0Var = this.$coroutineScope;
        final long j = this.$waitMs;
        final C32226l<T, C13598b0> lVar = this.$destinationFunction;
        final T t2 = t;
        f0Var.f27484d = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C446441((C15601d<? super C446441>) null), 3, (Object) null);
    }
}
