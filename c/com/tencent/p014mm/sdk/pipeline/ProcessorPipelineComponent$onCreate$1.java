package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.statecenter.IStateAction;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "InAction", "OutAction", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "state", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/sdk/pipeline/PipelineState;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent$onCreate$1 */
public final class ProcessorPipelineComponent$onCreate$1 extends C87413o implements C32226l<PipelineState, C13598b0> {
    public final /* synthetic */ ProcessorPipelineComponent<InAction, OutAction> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessorPipelineComponent$onCreate$1(ProcessorPipelineComponent<InAction, OutAction> processorPipelineComponent) {
        super(1);
        this.this$0 = processorPipelineComponent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PipelineState) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "state");
        ProcessorPipelineComponent<InAction, OutAction> processorPipelineComponent = this.this$0;
        IStateAction action = pipelineState.getAction();
        if (action != null && (action instanceof PipelineInitAction)) {
            PipelineInitAction pipelineInitAction = (PipelineInitAction) action;
            processorPipelineComponent.initAttachClazz();
        }
    }
}
