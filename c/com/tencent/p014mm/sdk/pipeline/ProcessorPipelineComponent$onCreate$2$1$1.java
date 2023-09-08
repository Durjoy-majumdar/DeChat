package com.tencent.p014mm.sdk.pipeline;

import a14.C0000n0;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "InAction", "OutAction", "La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent$onCreate$2$1$1", mo125469f = "ProcessorPipelineComponent.kt", mo125470l = {31}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent$onCreate$2$1$1 */
public final class ProcessorPipelineComponent$onCreate$2$1$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ IStateAction $action;
    public final /* synthetic */ PipelineState $state;
    public Object L$0;
    public int label;
    public final /* synthetic */ ProcessorPipelineComponent<InAction, OutAction> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessorPipelineComponent$onCreate$2$1$1(ProcessorPipelineComponent<InAction, OutAction> processorPipelineComponent, PipelineState pipelineState, IStateAction iStateAction, C15601d<? super ProcessorPipelineComponent$onCreate$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = processorPipelineComponent;
        this.$state = pipelineState;
        this.$action = iStateAction;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new ProcessorPipelineComponent$onCreate$2$1$1(this.this$0, this.$state, this.$action, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((ProcessorPipelineComponent$onCreate$2$1$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ProcessorPipelineComponent<InAction, OutAction> processorPipelineComponent;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProcessorPipelineComponent<InAction, OutAction> processorPipelineComponent2 = this.this$0;
            PipelineState pipelineState = this.$state;
            IStateAction iStateAction = this.$action;
            C87412m.m108592e(iStateAction, "null cannot be cast to non-null type InAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent.onCreate.<no name provided>.invoke$lambda-0");
            this.L$0 = processorPipelineComponent2;
            this.label = 1;
            Object processAction = processorPipelineComponent2.processAction(pipelineState, (BaseStateAction) iStateAction, this);
            if (processAction == aVar) {
                return aVar;
            }
            processorPipelineComponent = processorPipelineComponent2;
            obj = processAction;
        } else if (i == 1) {
            processorPipelineComponent = (ProcessorPipelineComponent) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        processorPipelineComponent.dispatch((IStateAction) obj);
        return C13598b0.f38549a;
    }
}
