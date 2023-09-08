package kd3;

import cc3.C26835d;
import com.tencent.p014mm.sdk.pipeline.FlowPipelineComponent;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineFailAction;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.PipelineSuccessAction;
import com.tencent.p014mm.sdk.pipeline.anno.PipelineFlow;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C8480h;
import gy3.C87412m;
import p455bn.C54501c;
import p455bn.C54502d;

/* renamed from: kd3.a */
public final class C61000a extends FlowPipelineComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61000a(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    @PipelineFlow
    public final BaseStateAction end(PipelineState pipelineState, C54502d dVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(dVar, "action");
        if (dVar.f152781a == null) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        }
        PipelineState pipelineState2 = new PipelineState();
        pipelineState2.put("AppMsgResponse", dVar.f152781a);
        return new PipelineSuccessAction(pipelineState2);
    }

    public BaseStateAction start(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "state");
        return new C54501c((C72963f4) pipelineState.getOrInterrupt("MsgInfo"), (C26835d) pipelineState.getOrInterrupt("AppMsgObj"));
    }
}
