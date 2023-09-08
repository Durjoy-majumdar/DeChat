package com.tencent.p014mm.sdk.pipeline;

import a14.C0000n0;
import a14.C53921m;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "Lcom/tencent/mm/sdk/pipeline/PipelineResult;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$2", mo125469f = "Pipeline.kt", mo125470l = {238}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$2 */
public final class Pipeline$Companion$startSyncPipelineForResult$2 extends C91594j implements C32227p<C0000n0, C15601d<? super PipelineResult>, Object> {
    public final /* synthetic */ String $bizName;
    public final /* synthetic */ List<Class<? extends PipelineComponent>> $componentList;
    public final /* synthetic */ C8479f0<Pipeline> $pipeline;
    public final /* synthetic */ PipelineState $state;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pipeline$Companion$startSyncPipelineForResult$2(C8479f0<Pipeline> f0Var, List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str, C15601d<? super Pipeline$Companion$startSyncPipelineForResult$2> dVar) {
        super(2, dVar);
        this.$pipeline = f0Var;
        this.$componentList = list;
        this.$state = pipelineState;
        this.$bizName = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new Pipeline$Companion$startSyncPipelineForResult$2(this.$pipeline, this.$componentList, this.$state, this.$bizName, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super PipelineResult> dVar) {
        return ((Pipeline$Companion$startSyncPipelineForResult$2) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C8479f0<Pipeline> f0Var = this.$pipeline;
            List<Class<? extends PipelineComponent>> list = this.$componentList;
            PipelineState pipelineState = this.$state;
            String str = this.$bizName;
            this.L$0 = f0Var;
            this.L$1 = list;
            this.L$2 = pipelineState;
            this.L$3 = str;
            this.label = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            f0Var.f27484d = new Pipeline(C110818d0.m150904D0(list), pipelineState, str, new Pipeline$Companion$startSyncPipelineForResult$2$1$1(f0Var, new SafeResume(mVar)), false, 16, (C8480h) null).run$wechat_sdk_release();
            mVar.mo74599v(new Pipeline$Companion$startSyncPipelineForResult$2$1$2(f0Var));
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            String str2 = (String) this.L$3;
            PipelineState pipelineState2 = (PipelineState) this.L$2;
            List list2 = (List) this.L$1;
            C8479f0 f0Var2 = (C8479f0) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
