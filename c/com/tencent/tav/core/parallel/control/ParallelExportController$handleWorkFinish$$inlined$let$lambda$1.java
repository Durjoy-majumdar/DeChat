package com.tencent.tav.core.parallel.control;

import com.tencent.tav.core.parallel.info.PipelineWorkInfo;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "com/tencent/tav/core/parallel/control/ParallelExportController$handleWorkFinish$1$1", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 0})
public final class ParallelExportController$handleWorkFinish$$inlined$let$lambda$1 implements Runnable {
    public final /* synthetic */ PipelineWorkInfo $info$inlined;
    public final /* synthetic */ ParallelExportController this$0;

    public ParallelExportController$handleWorkFinish$$inlined$let$lambda$1(ParallelExportController parallelExportController, PipelineWorkInfo pipelineWorkInfo) {
        this.this$0 = parallelExportController;
        this.$info$inlined = pipelineWorkInfo;
    }

    public final void run() {
        this.this$0.tryStartOneMoreWork();
    }
}
