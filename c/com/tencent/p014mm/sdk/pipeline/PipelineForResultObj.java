package com.tencent.p014mm.sdk.pipeline;

import d14.C45252f;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineForResultObj;", "", "Lcom/tencent/mm/sdk/pipeline/PipelineController;", "controller", "Lcom/tencent/mm/sdk/pipeline/PipelineController;", "getController", "()Lcom/tencent/mm/sdk/pipeline/PipelineController;", "Ld14/f;", "Lcom/tencent/mm/sdk/pipeline/PipelineResult;", "resultFlow", "Ld14/f;", "getResultFlow", "()Ld14/f;", "<init>", "(Lcom/tencent/mm/sdk/pipeline/PipelineController;Ld14/f;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineForResultObj */
public final class PipelineForResultObj {
    private final PipelineController controller;
    private final C45252f<PipelineResult> resultFlow;

    public PipelineForResultObj(PipelineController pipelineController, C45252f<PipelineResult> fVar) {
        C87412m.m108594g(pipelineController, "controller");
        C87412m.m108594g(fVar, "resultFlow");
        this.controller = pipelineController;
        this.resultFlow = fVar;
    }

    public final PipelineController getController() {
        return this.controller;
    }

    public final C45252f<PipelineResult> getResultFlow() {
        return this.resultFlow;
    }
}
