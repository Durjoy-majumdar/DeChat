package com.tencent.p014mm.sdk.pipeline;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineResult;", "", "bizName", "", "resultCode", "", "data", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "(Ljava/lang/String;ILcom/tencent/mm/sdk/pipeline/PipelineState;)V", "getBizName", "()Ljava/lang/String;", "getData", "()Lcom/tencent/mm/sdk/pipeline/PipelineState;", "getResultCode", "()I", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineResult */
public final class PipelineResult {
    private final String bizName;
    private final PipelineState data;
    private final int resultCode;

    public PipelineResult(String str, int i, PipelineState pipelineState) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(pipelineState, "data");
        this.bizName = str;
        this.resultCode = i;
        this.data = pipelineState;
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final PipelineState getData() {
        return this.data;
    }

    public final int getResultCode() {
        return this.resultCode;
    }
}
