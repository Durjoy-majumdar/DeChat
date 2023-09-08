package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineSuccessAction;", "Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "pipelineState", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "(Lcom/tencent/mm/sdk/pipeline/PipelineState;)V", "getPipelineState", "()Lcom/tencent/mm/sdk/pipeline/PipelineState;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineSuccessAction */
public final class PipelineSuccessAction extends BaseStateAction {
    private final PipelineState pipelineState;

    public PipelineSuccessAction() {
        this((PipelineState) null, 1, (C8480h) null);
    }

    public PipelineSuccessAction(PipelineState pipelineState2) {
        C87412m.m108594g(pipelineState2, "pipelineState");
        this.pipelineState = pipelineState2;
    }

    public final PipelineState getPipelineState() {
        return this.pipelineState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PipelineSuccessAction(PipelineState pipelineState2, int i, C8480h hVar) {
        this((i & 1) != 0 ? new PipelineState() : pipelineState2);
    }
}
