package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import java.util.List;
import kotlin.Metadata;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
@C91590f(mo125468c = "com.tencent.mm.sdk.pipeline.Pipeline$Companion", mo125469f = "Pipeline.kt", mo125470l = {54}, mo125471m = "startSyncPipelineForResult")
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$1 */
public final class Pipeline$Companion$startSyncPipelineForResult$1 extends C66704d {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Pipeline.Companion this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pipeline$Companion$startSyncPipelineForResult$1(Pipeline.Companion companion, C15601d<? super Pipeline$Companion$startSyncPipelineForResult$1> dVar) {
        super(dVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startSyncPipelineForResult((List<? extends Class<? extends PipelineComponent>>) null, (PipelineState) null, (String) null, 0, this);
    }
}
