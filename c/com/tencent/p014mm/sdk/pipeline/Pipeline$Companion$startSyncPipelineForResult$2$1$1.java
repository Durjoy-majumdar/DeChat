package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.coroutines.SafeResume;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/sdk/pipeline/Pipeline$Companion$startSyncPipelineForResult$2$1$1", "Lcom/tencent/mm/sdk/pipeline/PipelineCallback;", "Lcom/tencent/mm/sdk/pipeline/PipelineResult;", "result", "Lrx3/b0;", "onResult", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$2$1$1 */
public final class Pipeline$Companion$startSyncPipelineForResult$2$1$1 implements PipelineCallback {
    public final /* synthetic */ C8479f0<Pipeline> $pipeline;
    public final /* synthetic */ SafeResume<PipelineResult> $safeResume;

    public Pipeline$Companion$startSyncPipelineForResult$2$1$1(C8479f0<Pipeline> f0Var, SafeResume<PipelineResult> safeResume) {
        this.$pipeline = f0Var;
        this.$safeResume = safeResume;
    }

    public void onResult(PipelineResult pipelineResult) {
        C87412m.m108594g(pipelineResult, "result");
        Pipeline pipeline = (Pipeline) this.$pipeline.f27484d;
        if (pipeline != null) {
            pipeline.setCallback((PipelineCallback) null);
        }
        this.$safeResume.resume(pipelineResult);
    }
}
