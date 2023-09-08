package com.tencent.tav.core.parallel.newversion;

import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.ExportErrorStatus;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 0})
public final class AssetParallelExportWork$handleResult$1 implements Runnable {
    public final /* synthetic */ ExportErrorStatus $error;
    public final /* synthetic */ AssetExportSession.AssetExportSessionStatus $status;
    public final /* synthetic */ AssetParallelExportWork this$0;

    public AssetParallelExportWork$handleResult$1(AssetParallelExportWork assetParallelExportWork, AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus) {
        this.this$0 = assetParallelExportWork;
        this.$status = assetExportSessionStatus;
        this.$error = exportErrorStatus;
    }

    public final void run() {
        this.this$0.getExportSession().status = this.$status;
        this.this$0.getExportSession().exportErrorStatus = this.$error;
        AssetParallelExportSession.ExportCallbackHandler callbackHandler = this.this$0.getCallbackHandler();
        if (callbackHandler != null) {
            callbackHandler.handlerCallback(this.this$0.getExportSession());
        }
        this.this$0.setCallbackHandler((AssetParallelExportSession.ExportCallbackHandler) null);
        this.this$0.release();
    }
}
