package com.tencent.tav.core.parallel.control;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.core.parallel.info.PipelineWorkInfo;
import com.tencent.tav.coremedia.CMPerformance;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse;", "", "Lcom/tencent/tav/coremedia/CMPerformance;", "performanceData", "Lrx3/b0;", "analyseSingleStage", "", "analyseToString", "Lcom/tencent/tav/coremedia/CMSampleBuffer;", "sample", "analyseGetSampleBuffer", "analyseAppendSampleBuffer", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$StageAnalyse;", "Lkotlin/collections/ArrayList;", "stageAnalysis", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "info", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "getInfo", "()Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "setInfo", "(Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;)V", "<init>", "Companion", "StageAnalyse", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class ParallelExportAnalyse {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.ParallelExportAnalyse";
    private PipelineWorkInfo info;
    private final ArrayList<StageAnalyse> stageAnalysis = new ArrayList<>();

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$Companion;", "", "()V", "TAG", "", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$StageAnalyse;", "", "stage", "Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;", "count", "", "totalCostMs", "", "(Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;IJ)V", "getCount", "()I", "setCount", "(I)V", "getStage", "()Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;", "setStage", "(Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;)V", "getTotalCostMs", "()J", "setTotalCostMs", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
    public static final class StageAnalyse {
        private int count;
        private CMPerformance.CMPerformanceStage stage;
        private long totalCostMs;

        public StageAnalyse(CMPerformance.CMPerformanceStage cMPerformanceStage, int i, long j) {
            C87412m.m108595h(cMPerformanceStage, IXWebBroadcastListener.STAGE_TAG);
            this.stage = cMPerformanceStage;
            this.count = i;
            this.totalCostMs = j;
        }

        public static /* synthetic */ StageAnalyse copy$default(StageAnalyse stageAnalyse, CMPerformance.CMPerformanceStage cMPerformanceStage, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cMPerformanceStage = stageAnalyse.stage;
            }
            if ((i2 & 2) != 0) {
                i = stageAnalyse.count;
            }
            if ((i2 & 4) != 0) {
                j = stageAnalyse.totalCostMs;
            }
            return stageAnalyse.copy(cMPerformanceStage, i, j);
        }

        public final CMPerformance.CMPerformanceStage component1() {
            return this.stage;
        }

        public final int component2() {
            return this.count;
        }

        public final long component3() {
            return this.totalCostMs;
        }

        public final StageAnalyse copy(CMPerformance.CMPerformanceStage cMPerformanceStage, int i, long j) {
            C87412m.m108595h(cMPerformanceStage, IXWebBroadcastListener.STAGE_TAG);
            return new StageAnalyse(cMPerformanceStage, i, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StageAnalyse) {
                    StageAnalyse stageAnalyse = (StageAnalyse) obj;
                    if (C87412m.m108589b(this.stage, stageAnalyse.stage)) {
                        if (this.count == stageAnalyse.count) {
                            if (this.totalCostMs == stageAnalyse.totalCostMs) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int getCount() {
            return this.count;
        }

        public final CMPerformance.CMPerformanceStage getStage() {
            return this.stage;
        }

        public final long getTotalCostMs() {
            return this.totalCostMs;
        }

        public int hashCode() {
            CMPerformance.CMPerformanceStage cMPerformanceStage = this.stage;
            int hashCode = cMPerformanceStage != null ? cMPerformanceStage.hashCode() : 0;
            long j = this.totalCostMs;
            return (((hashCode * 31) + this.count) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void setStage(CMPerformance.CMPerformanceStage cMPerformanceStage) {
            C87412m.m108595h(cMPerformanceStage, "<set-?>");
            this.stage = cMPerformanceStage;
        }

        public final void setTotalCostMs(long j) {
            this.totalCostMs = j;
        }

        public String toString() {
            return "StageAnalyse(stage=" + this.stage + ", count=" + this.count + ", totalCostMs=" + this.totalCostMs + ")";
        }
    }

    public ParallelExportAnalyse(PipelineWorkInfo pipelineWorkInfo) {
        C87412m.m108595h(pipelineWorkInfo, "info");
        this.info = pipelineWorkInfo;
    }

    private final void analyseSingleStage(CMPerformance cMPerformance) {
        T t;
        boolean z;
        Iterator<T> it = this.stageAnalysis.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((StageAnalyse) t).getStage() == cMPerformance.stage) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        StageAnalyse stageAnalyse = (StageAnalyse) t;
        if (stageAnalyse == null) {
            CMPerformance.CMPerformanceStage cMPerformanceStage = cMPerformance.stage;
            C87412m.m108590c(cMPerformanceStage, "performanceData.stage");
            this.stageAnalysis.add(new StageAnalyse(cMPerformanceStage, 1, cMPerformance.costMs()));
        } else {
            stageAnalyse.setCount(stageAnalyse.getCount() + 1);
            stageAnalyse.setTotalCostMs(stageAnalyse.getTotalCostMs() + cMPerformance.costMs());
        }
        ArrayList<CMPerformance> arrayList = cMPerformance.preNodes;
        C87412m.m108590c(arrayList, "performanceData.preNodes");
        for (CMPerformance cMPerformance2 : arrayList) {
            C87412m.m108590c(cMPerformance2, LocaleUtil.ITALIAN);
            analyseSingleStage(cMPerformance2);
        }
    }

    private final String analyseToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n");
        for (StageAnalyse stageAnalyse : this.stageAnalysis) {
            stringBuffer.append('[' + stageAnalyse.getStage() + XVFSFile.PATH_SEPARATOR_CHAR + (stageAnalyse.getTotalCostMs() / ((long) stageAnalyse.getCount())) + "]\n");
        }
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108590c(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public final void analyseAppendSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        C87412m.m108595h(cMSampleBuffer, "sample");
        CMPerformance cMPerformance = cMSampleBuffer.getState().performance;
        C87412m.m108590c(cMPerformance, "performanceData");
        analyseSingleStage(cMPerformance);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        PipelineIndicatorInfo indicator = this.info.getIndicator();
        C87412m.m108590c(indicator, "info.indicator");
        sb.append(indicator.getIndex());
        sb.append("]analyse output buffer: ");
        sb.append(analyseToString());
        Logger.m144641d(TAG, sb.toString());
    }

    public final void analyseGetSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        T t;
        boolean z;
        C87412m.m108595h(cMSampleBuffer, "sample");
        CMPerformance cMPerformance = cMSampleBuffer.getState().performance;
        C87412m.m108590c(cMPerformance, "performanceData");
        analyseSingleStage(cMPerformance);
        Iterator<T> it = this.stageAnalysis.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            StageAnalyse stageAnalyse = (StageAnalyse) t;
            if (stageAnalyse.getStage() == CMPerformance.CMPerformanceStage.RENDER && stageAnalyse.getCount() % 30 == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((StageAnalyse) t) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            PipelineIndicatorInfo indicator = this.info.getIndicator();
            C87412m.m108590c(indicator, "info.indicator");
            sb.append(indicator.getIndex());
            sb.append("]analyse input buffer: ");
            sb.append(analyseToString());
            Logger.m144641d(TAG, sb.toString());
        }
    }

    public final PipelineWorkInfo getInfo() {
        return this.info;
    }

    public final void setInfo(PipelineWorkInfo pipelineWorkInfo) {
        C87412m.m108595h(pipelineWorkInfo, "<set-?>");
        this.info = pipelineWorkInfo;
    }
}
