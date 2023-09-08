package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "InAction", "Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "OutAction", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent$scope$2 */
public final class ProcessorPipelineComponent$scope$2 extends C87413o implements C32224a<LifecycleScope> {
    public final /* synthetic */ Pipeline $pipeline;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessorPipelineComponent$scope$2(Pipeline pipeline) {
        super(0);
        this.$pipeline = pipeline;
    }

    public final LifecycleScope invoke() {
        return new LifecycleScope("Pipeline_" + this.$pipeline.getBizName().hashCode() + "_Processor", this.$pipeline, 0, 4, (C8480h) null);
    }
}
