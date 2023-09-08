package com.tencent.tav.core.parallel.newversion;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "com/tencent/tav/core/parallel/newversion/AssetParallelExportWork$onChanged$1$3", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 0})
public final class AssetParallelExportWork$onChanged$$inlined$let$lambda$3 implements Runnable {
    public final /* synthetic */ AssetParallelExportWork this$0;

    public AssetParallelExportWork$onChanged$$inlined$let$lambda$3(AssetParallelExportWork assetParallelExportWork) {
        this.this$0 = assetParallelExportWork;
    }

    public final void run() {
        if (this.this$0.currentVideoRunSize() <= 0) {
            this.this$0.startVideoWork();
        }
    }
}
