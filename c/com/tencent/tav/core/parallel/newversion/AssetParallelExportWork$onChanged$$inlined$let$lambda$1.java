package com.tencent.tav.core.parallel.newversion;

import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.decoder.logger.Logger;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "com/tencent/tav/core/parallel/newversion/AssetParallelExportWork$onChanged$1$1", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 0})
public final class AssetParallelExportWork$onChanged$$inlined$let$lambda$1 implements Runnable {
    public final /* synthetic */ AssetParallelExportWork this$0;

    public AssetParallelExportWork$onChanged$$inlined$let$lambda$1(AssetParallelExportWork assetParallelExportWork) {
        this.this$0 = assetParallelExportWork;
    }

    public final void run() {
        if (System.currentTimeMillis() - this.this$0.lastProgressCallbackTimeStamp >= ((long) 10)) {
            double d = 0.0d;
            for (PipelineIndicatorInfo progress : this.this$0.segmentIndicators) {
                d += (double) progress.getProgress();
            }
            this.this$0.getExportSession().progress = (float) (d / ((double) this.this$0.segmentIndicators.size()));
            AssetParallelExportSession.ExportCallbackHandler callbackHandler = this.this$0.getCallbackHandler();
            if (callbackHandler != null) {
                callbackHandler.handlerCallback(this.this$0.getExportSession());
            }
            this.this$0.lastProgressCallbackTimeStamp = System.currentTimeMillis();
            Logger.m144641d("AssetParallelExportWork", "handle progress:" + this.this$0.getExportSession().progress);
        }
    }
}
