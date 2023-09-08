package com.tencent.tav.core.parallel.control;

import android.os.Handler;
import androidx.lifecycle.C0120a0;
import com.tencent.tav.core.AssetParallelSegmentStatus;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.core.parallel.info.PipelineWorkInfo;
import com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B)\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007R2\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelMuxerController;", "Landroidx/lifecycle/a0;", "", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "", "allWorkSuccess", "p0", "Lrx3/b0;", "onChanged", "exportSuccess", "exportFail", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "Lkotlin/collections/ArrayList;", "exportWork", "Ljava/util/ArrayList;", "getExportWork", "()Ljava/util/ArrayList;", "setExportWork", "(Ljava/util/ArrayList;)V", "Landroid/os/Handler;", "exportHandler", "Landroid/os/Handler;", "getExportHandler", "()Landroid/os/Handler;", "setExportHandler", "(Landroid/os/Handler;)V", "<init>", "(Ljava/util/ArrayList;Landroid/os/Handler;)V", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class ParallelMuxerController implements C0120a0<List<? extends ParallelWorkResult>> {
    private Handler exportHandler;
    private ArrayList<PipelineWorkInfo> exportWork;

    public ParallelMuxerController(ArrayList<PipelineWorkInfo> arrayList, Handler handler) {
        C87412m.m108595h(arrayList, "exportWork");
        this.exportWork = arrayList;
        this.exportHandler = handler;
    }

    private final boolean allWorkSuccess() {
        boolean z;
        ArrayList<PipelineWorkInfo> arrayList = this.exportWork;
        T t = null;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                PipelineIndicatorInfo indicator = ((PipelineWorkInfo) next).getIndicator();
                C87412m.m108590c(indicator, "it.indicator");
                if (indicator.getSegmentStatus() != AssetParallelSegmentStatus.AssetReaderStatusWriteFinish) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (PipelineWorkInfo) t;
        }
        return t == null;
    }

    public final void exportFail() {
    }

    public final void exportSuccess() {
        Handler handler = this.exportHandler;
        if (handler != null) {
            handler.post(ParallelMuxerController$exportSuccess$1.INSTANCE);
        }
    }

    public final Handler getExportHandler() {
        return this.exportHandler;
    }

    public final ArrayList<PipelineWorkInfo> getExportWork() {
        return this.exportWork;
    }

    public final void setExportHandler(Handler handler) {
        this.exportHandler = handler;
    }

    public final void setExportWork(ArrayList<PipelineWorkInfo> arrayList) {
        C87412m.m108595h(arrayList, "<set-?>");
        this.exportWork = arrayList;
    }

    public void onChanged(List<ParallelWorkResult> list) {
        if (list != null && list.size() == this.exportWork.size()) {
            if (allWorkSuccess()) {
                exportSuccess();
            } else {
                exportFail();
            }
        }
    }
}
