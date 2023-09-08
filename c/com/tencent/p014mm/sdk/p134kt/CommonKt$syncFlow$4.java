package com.tencent.p014mm.sdk.p134kt;

import a14.C0000n0;
import a14.C53921m;
import a14.C53934p0;
import a14.C53973z1;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo182094d2 = {"T", "La14/n0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.kt.CommonKt$syncFlow$4", mo125469f = "Common.kt", mo125470l = {244}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.kt.CommonKt$syncFlow$4 */
public final class CommonKt$syncFlow$4 extends C91594j implements C32227p<C0000n0, C15601d<? super T>, Object> {
    public final /* synthetic */ C8479f0<C53973z1> $job;
    public final /* synthetic */ LifecycleScope $scope;
    public final /* synthetic */ C45252f<T> $this_syncFlow;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonKt$syncFlow$4(C8479f0<C53973z1> f0Var, LifecycleScope lifecycleScope, C45252f<? extends T> fVar, C15601d<? super CommonKt$syncFlow$4> dVar) {
        super(2, dVar);
        this.$job = f0Var;
        this.$scope = lifecycleScope;
        this.$this_syncFlow = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new CommonKt$syncFlow$4(this.$job, this.$scope, this.$this_syncFlow, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super T> dVar) {
        return ((CommonKt$syncFlow$4) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C8479f0<C53973z1> f0Var = this.$job;
            LifecycleScope lifecycleScope = this.$scope;
            C45252f<T> fVar = this.$this_syncFlow;
            this.L$0 = f0Var;
            this.L$1 = lifecycleScope;
            this.L$2 = fVar;
            this.label = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            f0Var.f27484d = LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new CommonKt$syncFlow$4$1$1(fVar, mVar, f0Var, (C15601d<? super CommonKt$syncFlow$4$1$1>) null), 1, (Object) null);
            mVar.mo74599v(new CommonKt$syncFlow$4$1$2(f0Var));
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C45252f fVar2 = (C45252f) this.L$2;
            LifecycleScope lifecycleScope2 = (LifecycleScope) this.L$1;
            C8479f0 f0Var2 = (C8479f0) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
