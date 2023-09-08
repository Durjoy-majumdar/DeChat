package com.tencent.p014mm.sdk.p134kt;

import fy3.C32227p;
import gy3.C8479f0;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, mo182094d2 = {"T", "it", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.kt.CommonKt$syncFlow$2", mo125469f = "Common.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.kt.CommonKt$syncFlow$2 */
public final class CommonKt$syncFlow$2 extends C91594j implements C32227p<T, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ C8479f0<T> $result;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonKt$syncFlow$2(C8479f0<T> f0Var, C15601d<? super CommonKt$syncFlow$2> dVar) {
        super(2, dVar);
        this.$result = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        CommonKt$syncFlow$2 commonKt$syncFlow$2 = new CommonKt$syncFlow$2(this.$result, dVar);
        commonKt$syncFlow$2.L$0 = obj;
        return commonKt$syncFlow$2;
    }

    public final Object invoke(T t, C15601d<? super C13598b0> dVar) {
        return ((CommonKt$syncFlow$2) create(t, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$result.f27484d = this.L$0;
            return C13598b0.f38549a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
