package com.tencent.tav.core.parallel.viewmodel;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.core.parallel.info.PipelineWorkInfo;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R<\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0013j\b\u0012\u0004\u0012\u00020\r`\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelResultViewModel;", "Landroidx/lifecycle/i0;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "work", "Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "status", "Lcom/tencent/tav/core/ExportErrorStatus;", "errorCode", "Lrx3/b0;", "updateWorkResult", "updateWorkResultSuccess", "Landroidx/lifecycle/z;", "", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "<set-?>", "resultLiveData", "Landroidx/lifecycle/z;", "getResultLiveData", "()Landroidx/lifecycle/z;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "resultList", "Ljava/util/ArrayList;", "<init>", "()V", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class ParallelResultViewModel extends C39622i0 {
    private final ArrayList<ParallelWorkResult> resultList = new ArrayList<>();
    private C54219z<List<ParallelWorkResult>> resultLiveData = new C54219z<>();

    public final C54219z<List<ParallelWorkResult>> getResultLiveData() {
        return this.resultLiveData;
    }

    public final void updateWorkResult(PipelineWorkInfo pipelineWorkInfo, AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus) {
        T t;
        C87412m.m108595h(pipelineWorkInfo, ScopedStorageUtil.WorkProfiles.PROFILE_WORK);
        C87412m.m108595h(assetExportSessionStatus, "status");
        C87412m.m108595h(exportErrorStatus, OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        Iterator<T> it = this.resultList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((ParallelWorkResult) t).getIndicatorInfo(), pipelineWorkInfo.getIndicator())) {
                break;
            }
        }
        ParallelWorkResult parallelWorkResult = (ParallelWorkResult) t;
        if (parallelWorkResult != null) {
            parallelWorkResult.setStatus(assetExportSessionStatus);
            parallelWorkResult.setExportErrorStatus(exportErrorStatus);
        } else {
            ArrayList<ParallelWorkResult> arrayList = this.resultList;
            PipelineIndicatorInfo indicator = pipelineWorkInfo.getIndicator();
            C87412m.m108590c(indicator, "work.indicator");
            arrayList.add(new ParallelWorkResult(indicator, assetExportSessionStatus, exportErrorStatus));
        }
        this.resultLiveData.postValue(this.resultList);
    }

    public final void updateWorkResultSuccess(PipelineWorkInfo pipelineWorkInfo) {
        C87412m.m108595h(pipelineWorkInfo, ScopedStorageUtil.WorkProfiles.PROFILE_WORK);
        updateWorkResult(pipelineWorkInfo, AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted, new ExportErrorStatus(0));
    }
}
