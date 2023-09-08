package com.tencent.tav.core.parallel.viewmodel;

import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "", "indicatorInfo", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "status", "Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "exportErrorStatus", "Lcom/tencent/tav/core/ExportErrorStatus;", "(Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;Lcom/tencent/tav/core/ExportErrorStatus;)V", "getExportErrorStatus", "()Lcom/tencent/tav/core/ExportErrorStatus;", "setExportErrorStatus", "(Lcom/tencent/tav/core/ExportErrorStatus;)V", "getIndicatorInfo", "()Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "setIndicatorInfo", "(Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;)V", "getStatus", "()Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "setStatus", "(Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
public final class ParallelWorkResult {
    public static final Companion Companion = new Companion((C8480h) null);
    private ExportErrorStatus exportErrorStatus;
    private PipelineIndicatorInfo indicatorInfo;
    private AssetExportSession.AssetExportSessionStatus status;

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult$Companion;", "", "()V", "getSuccessResult", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "indicatorInfo", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final ParallelWorkResult getSuccessResult(PipelineIndicatorInfo pipelineIndicatorInfo) {
            C87412m.m108595h(pipelineIndicatorInfo, "indicatorInfo");
            return new ParallelWorkResult(pipelineIndicatorInfo, AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted, new ExportErrorStatus(0));
        }
    }

    public ParallelWorkResult(PipelineIndicatorInfo pipelineIndicatorInfo, AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus2) {
        C87412m.m108595h(pipelineIndicatorInfo, "indicatorInfo");
        C87412m.m108595h(assetExportSessionStatus, "status");
        this.indicatorInfo = pipelineIndicatorInfo;
        this.status = assetExportSessionStatus;
        this.exportErrorStatus = exportErrorStatus2;
    }

    public static /* synthetic */ ParallelWorkResult copy$default(ParallelWorkResult parallelWorkResult, PipelineIndicatorInfo pipelineIndicatorInfo, AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus2, int i, Object obj) {
        if ((i & 1) != 0) {
            pipelineIndicatorInfo = parallelWorkResult.indicatorInfo;
        }
        if ((i & 2) != 0) {
            assetExportSessionStatus = parallelWorkResult.status;
        }
        if ((i & 4) != 0) {
            exportErrorStatus2 = parallelWorkResult.exportErrorStatus;
        }
        return parallelWorkResult.copy(pipelineIndicatorInfo, assetExportSessionStatus, exportErrorStatus2);
    }

    public final PipelineIndicatorInfo component1() {
        return this.indicatorInfo;
    }

    public final AssetExportSession.AssetExportSessionStatus component2() {
        return this.status;
    }

    public final ExportErrorStatus component3() {
        return this.exportErrorStatus;
    }

    public final ParallelWorkResult copy(PipelineIndicatorInfo pipelineIndicatorInfo, AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus2) {
        C87412m.m108595h(pipelineIndicatorInfo, "indicatorInfo");
        C87412m.m108595h(assetExportSessionStatus, "status");
        return new ParallelWorkResult(pipelineIndicatorInfo, assetExportSessionStatus, exportErrorStatus2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParallelWorkResult)) {
            return false;
        }
        ParallelWorkResult parallelWorkResult = (ParallelWorkResult) obj;
        return C87412m.m108589b(this.indicatorInfo, parallelWorkResult.indicatorInfo) && C87412m.m108589b(this.status, parallelWorkResult.status) && C87412m.m108589b(this.exportErrorStatus, parallelWorkResult.exportErrorStatus);
    }

    public final ExportErrorStatus getExportErrorStatus() {
        return this.exportErrorStatus;
    }

    public final PipelineIndicatorInfo getIndicatorInfo() {
        return this.indicatorInfo;
    }

    public final AssetExportSession.AssetExportSessionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        PipelineIndicatorInfo pipelineIndicatorInfo = this.indicatorInfo;
        int i = 0;
        int hashCode = (pipelineIndicatorInfo != null ? pipelineIndicatorInfo.hashCode() : 0) * 31;
        AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = this.status;
        int hashCode2 = (hashCode + (assetExportSessionStatus != null ? assetExportSessionStatus.hashCode() : 0)) * 31;
        ExportErrorStatus exportErrorStatus2 = this.exportErrorStatus;
        if (exportErrorStatus2 != null) {
            i = exportErrorStatus2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setExportErrorStatus(ExportErrorStatus exportErrorStatus2) {
        this.exportErrorStatus = exportErrorStatus2;
    }

    public final void setIndicatorInfo(PipelineIndicatorInfo pipelineIndicatorInfo) {
        C87412m.m108595h(pipelineIndicatorInfo, "<set-?>");
        this.indicatorInfo = pipelineIndicatorInfo;
    }

    public final void setStatus(AssetExportSession.AssetExportSessionStatus assetExportSessionStatus) {
        C87412m.m108595h(assetExportSessionStatus, "<set-?>");
        this.status = assetExportSessionStatus;
    }

    public String toString() {
        return "ParallelWorkResult(indicatorInfo=" + this.indicatorInfo + ", status=" + this.status + ", exportErrorStatus=" + this.exportErrorStatus + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParallelWorkResult(PipelineIndicatorInfo pipelineIndicatorInfo, AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus2, int i, C8480h hVar) {
        this(pipelineIndicatorInfo, assetExportSessionStatus, (i & 4) != 0 ? null : exportErrorStatus2);
    }
}
