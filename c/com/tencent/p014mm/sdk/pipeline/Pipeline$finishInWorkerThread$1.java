package com.tencent.p014mm.sdk.pipeline;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.pipeline.Pipeline$finishInWorkerThread$1", mo125469f = "Pipeline.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$finishInWorkerThread$1 */
public final class Pipeline$finishInWorkerThread$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public int label;
    public final /* synthetic */ Pipeline this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pipeline$finishInWorkerThread$1(Pipeline pipeline, C15601d<? super Pipeline$finishInWorkerThread$1> dVar) {
        super(2, dVar);
        this.this$0 = pipeline;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new Pipeline$finishInWorkerThread$1(this.this$0, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((Pipeline$finishInWorkerThread$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.onDestroy();
            return C13598b0.f38549a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
