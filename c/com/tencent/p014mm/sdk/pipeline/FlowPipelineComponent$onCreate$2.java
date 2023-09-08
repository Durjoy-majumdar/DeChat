package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Method;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineState;", "state", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/sdk/pipeline/PipelineState;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.FlowPipelineComponent$onCreate$2 */
public final class FlowPipelineComponent$onCreate$2 extends C87413o implements C32226l<PipelineState, C13598b0> {
    public final /* synthetic */ FlowPipelineComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowPipelineComponent$onCreate$2(FlowPipelineComponent flowPipelineComponent) {
        super(1);
        this.this$0 = flowPipelineComponent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PipelineState) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "state");
        FlowPipelineComponent flowPipelineComponent = this.this$0;
        IStateAction action = pipelineState.getAction();
        if (action != null && (action instanceof PipelineInitAction)) {
            flowPipelineComponent.handleReturnAction(((PipelineInitAction) action).getStartAction());
        }
        IStateAction action2 = pipelineState.getAction();
        if (action2 != null) {
            FlowPipelineComponent flowPipelineComponent2 = this.this$0;
            Method method = (Method) flowPipelineComponent2.getActionMethodMap().get(action2.getClass().getName());
            if (method != null) {
                Object invoke = method.invoke(flowPipelineComponent2, new Object[]{pipelineState, action2});
                C87412m.m108592e(invoke, "null cannot be cast to non-null type com.tencent.mm.sdk.statecenter.BaseStateAction");
                flowPipelineComponent2.handleReturnAction((BaseStateAction) invoke);
            }
        }
    }
}
