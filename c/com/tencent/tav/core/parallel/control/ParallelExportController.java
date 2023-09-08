package com.tencent.tav.core.parallel.control;

import android.os.HandlerThread;
import com.tencent.tav.core.AssetParallelSegmentStatus;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.core.parallel.info.PipelineWorkInfo;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.decoder.logger.Logger;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J \u0010\f\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002JB\u0010\u0015\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\"\u0010\u0014\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020\u0011J\u0010\u0010\"\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010!R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0%j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&`'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R&\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R2\u0010\u0014\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u00104\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00100R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006="}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportController;", "", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "Lkotlin/collections/ArrayList;", "info", "Lrx3/b0;", "setupWorkInfo", "", "currentFrameRate", "Lkotlin/Function1;", "startWork", "reuseWork", "Ljava/lang/Runnable;", "callback", "releaseWorkResource", "createNewWork", "", "hasPreparedWork", "Lkotlin/Function3;", "releaseWork", "registerFunction", "Lcom/tencent/tav/coremedia/CMSampleBuffer;", "buffer", "analyseGetSampleBuffer", "analyseAppendSampleBuffer", "startExport", "tryStartOneMoreWork", "handleWorkFinish", "currentRunSize", "canWorkReuse", "allWorkFinish", "allSuccess", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "markHardwareLimit", "hardwareLimit", "Z", "Ljava/util/HashMap;", "Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse;", "Lkotlin/collections/HashMap;", "performanceMap", "Ljava/util/HashMap;", "exportWork", "Ljava/util/ArrayList;", "Lfy3/l;", "Lfy3/q;", "", "startTimeMs", "J", "totalFrame", "I", "lastFrameRate", "lastTimestampMs", "maxParallelCount", "getMaxParallelCount", "()I", "setMaxParallelCount", "(I)V", "<init>", "()V", "Companion", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class ParallelExportController {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final int DEFAULT_FRAME = 20;
    private static final int FRAME_BUFF = 10;
    private static final int MAX_WORK_COUNT = 5;
    private static final String TAG = "ParallelExportController";
    private static final int TIME_INTERVAL = 3000;
    private int currentFrameRate = 20;
    private ArrayList<PipelineWorkInfo> exportWork;
    private boolean hardwareLimit;
    private int lastFrameRate = 20;
    private long lastTimestampMs;
    private int maxParallelCount;
    private final HashMap<PipelineWorkInfo, ParallelExportAnalyse> performanceMap = new HashMap<>();
    private C32228q<? super PipelineWorkInfo, ? super Runnable, ? super Boolean, C13598b0> releaseWork;
    private long startTimeMs;
    private C32226l<? super PipelineWorkInfo, C13598b0> startWork;
    private int totalFrame = 30;

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportController$Companion;", "", "()V", "DEFAULT_FRAME", "", "FRAME_BUFF", "MAX_WORK_COUNT", "TAG", "", "TIME_INTERVAL", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    private final void createNewWork(C32226l<? super PipelineWorkInfo, C13598b0> lVar) {
        PipelineWorkInfo pipelineWorkInfo;
        PipelineIndicatorInfo indicator;
        T t;
        if (lVar != null) {
            ArrayList<PipelineWorkInfo> arrayList = this.exportWork;
            Integer num = null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    PipelineWorkInfo pipelineWorkInfo2 = (PipelineWorkInfo) t;
                    PipelineIndicatorInfo indicator2 = pipelineWorkInfo2.getIndicator();
                    C87412m.m108590c(indicator2, "it.indicator");
                    boolean z = true;
                    if (indicator2.getSegmentStatus() != AssetParallelSegmentStatus.AssetParallelStatusPrepared || pipelineWorkInfo2.getIndicator().type != 1) {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                pipelineWorkInfo = (PipelineWorkInfo) t;
            } else {
                pipelineWorkInfo = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tryStartOneMoreWork index:");
            if (!(pipelineWorkInfo == null || (indicator = pipelineWorkInfo.getIndicator()) == null)) {
                num = Integer.valueOf(indicator.getIndex());
            }
            sb.append(num);
            Logger.m144646i(TAG, sb.toString());
            lVar.invoke(pipelineWorkInfo);
        }
    }

    private final int currentFrameRate() {
        return (this.currentFrameRate * 1000) / 3000;
    }

    private final boolean hasPreparedWork() {
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
                PipelineWorkInfo pipelineWorkInfo = (PipelineWorkInfo) next;
                PipelineIndicatorInfo indicator = pipelineWorkInfo.getIndicator();
                C87412m.m108590c(indicator, "it.indicator");
                if (indicator.getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusPrepared && pipelineWorkInfo.getIndicator().type == 1) {
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
        return t != null;
    }

    private final void releaseWorkResource(Runnable runnable) {
        T t;
        HandlerThread handlerThread;
        ArrayList<PipelineWorkInfo> arrayList = this.exportWork;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                PipelineWorkInfo pipelineWorkInfo = (PipelineWorkInfo) t;
                PipelineIndicatorInfo indicator = pipelineWorkInfo.getIndicator();
                C87412m.m108590c(indicator, "it.indicator");
                boolean z = true;
                if (indicator.getSegmentStatus() != AssetParallelSegmentStatus.AssetReaderStatusWriteFinish || pipelineWorkInfo.getIndicator().type != 1 || (handlerThread = pipelineWorkInfo.thread) == null || !handlerThread.isAlive()) {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            PipelineWorkInfo pipelineWorkInfo2 = (PipelineWorkInfo) t;
            if (pipelineWorkInfo2 != null) {
                C32228q<? super PipelineWorkInfo, ? super Runnable, ? super Boolean, C13598b0> qVar = this.releaseWork;
                if (qVar != null) {
                    qVar.invoke(pipelineWorkInfo2, runnable, Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        runnable.run();
    }

    private final void reuseWork(C32226l<? super PipelineWorkInfo, C13598b0> lVar) {
        T t;
        T t2;
        ArrayList<PipelineWorkInfo> arrayList;
        boolean z;
        boolean z2;
        ArrayList<PipelineWorkInfo> arrayList2 = this.exportWork;
        if (arrayList2 != null) {
            Iterator<T> it = arrayList2.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                PipelineWorkInfo pipelineWorkInfo = (PipelineWorkInfo) t2;
                PipelineIndicatorInfo indicator = pipelineWorkInfo.getIndicator();
                C87412m.m108590c(indicator, "it.indicator");
                if (indicator.getSegmentStatus() == AssetParallelSegmentStatus.AssetReaderStatusWriteFinish && pipelineWorkInfo.getIndicator().type == 1) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            PipelineWorkInfo pipelineWorkInfo2 = (PipelineWorkInfo) t2;
            if (pipelineWorkInfo2 != null && (arrayList = this.exportWork) != null) {
                Iterator<T> it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    PipelineWorkInfo pipelineWorkInfo3 = (PipelineWorkInfo) next;
                    PipelineIndicatorInfo indicator2 = pipelineWorkInfo3.getIndicator();
                    C87412m.m108590c(indicator2, "todoWork.indicator");
                    if (indicator2.getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusPrepared && pipelineWorkInfo3.getIndicator().type == 1) {
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
                PipelineWorkInfo pipelineWorkInfo4 = (PipelineWorkInfo) t;
                if (pipelineWorkInfo4 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("try reuse Work from:");
                    PipelineIndicatorInfo indicator3 = pipelineWorkInfo2.getIndicator();
                    C87412m.m108590c(indicator3, "reuseWork.indicator");
                    sb.append(indicator3.getIndex());
                    sb.append(" to:");
                    PipelineIndicatorInfo indicator4 = pipelineWorkInfo4.getIndicator();
                    C87412m.m108590c(indicator4, "work.indicator");
                    sb.append(indicator4.getIndex());
                    Logger.m144646i(TAG, sb.toString());
                    pipelineWorkInfo2.reuseWork(pipelineWorkInfo4);
                    if (lVar != null) {
                        C13598b0 invoke = lVar.invoke(pipelineWorkInfo2);
                    }
                }
            }
        }
    }

    private final void setupWorkInfo(ArrayList<PipelineWorkInfo> arrayList) {
        boolean z;
        this.exportWork = arrayList;
        int i = 1;
        T t = null;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((PipelineWorkInfo) next).type == 2) {
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
        if (t == null) {
            i = 0;
        }
        Logger.m144646i(TAG, "exportWork video count:" + (arrayList.size() - i) + " audio count:" + i);
        for (PipelineWorkInfo pipelineWorkInfo : arrayList) {
            this.performanceMap.put(pipelineWorkInfo, new ParallelExportAnalyse(pipelineWorkInfo));
        }
    }

    public final boolean allSuccess() {
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

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean allWorkFinish() {
        /*
            r9 = this;
            java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> r0 = r9.exportWork
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0041
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.tencent.tav.core.parallel.info.PipelineWorkInfo r5 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) r5
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r6 = r5.getIndicator()
            java.lang.String r7 = "it.indicator"
            gy3.C87412m.m108590c(r6, r7)
            com.tencent.tav.core.AssetParallelSegmentStatus r6 = r6.getSegmentStatus()
            com.tencent.tav.core.AssetParallelSegmentStatus r8 = com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish
            if (r6 != r8) goto L_0x003b
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r5 = r5.getIndicator()
            gy3.C87412m.m108590c(r5, r7)
            com.tencent.tav.core.AssetParallelSegmentStatus r5 = r5.getSegmentStatus()
            com.tencent.tav.core.AssetParallelSegmentStatus r6 = com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusFailed
            if (r5 == r6) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r5 = 0
            goto L_0x003c
        L_0x003b:
            r5 = 1
        L_0x003c:
            if (r5 == 0) goto L_0x000b
            r3 = r4
        L_0x003f:
            com.tencent.tav.core.parallel.info.PipelineWorkInfo r3 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) r3
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.parallel.control.ParallelExportController.allWorkFinish():boolean");
    }

    public final void analyseAppendSampleBuffer(PipelineWorkInfo pipelineWorkInfo, CMSampleBuffer cMSampleBuffer) {
        C87412m.m108595h(pipelineWorkInfo, "info");
        C87412m.m108595h(cMSampleBuffer, "buffer");
        ParallelExportAnalyse parallelExportAnalyse = this.performanceMap.get(pipelineWorkInfo);
        if (parallelExportAnalyse != null) {
            parallelExportAnalyse.analyseAppendSampleBuffer(cMSampleBuffer);
        }
    }

    public final void analyseGetSampleBuffer(PipelineWorkInfo pipelineWorkInfo, CMSampleBuffer cMSampleBuffer) {
        C87412m.m108595h(pipelineWorkInfo, "info");
        C87412m.m108595h(cMSampleBuffer, "buffer");
        ParallelExportAnalyse parallelExportAnalyse = this.performanceMap.get(pipelineWorkInfo);
        if (parallelExportAnalyse != null) {
            parallelExportAnalyse.analyseGetSampleBuffer(cMSampleBuffer);
        }
        this.totalFrame++;
        this.currentFrameRate++;
        if (System.currentTimeMillis() - this.lastTimestampMs >= ((long) 3000)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.lastTimestampMs = currentTimeMillis;
            long j = ((long) (this.totalFrame * 1000)) / (currentTimeMillis - this.startTimeMs);
            if (currentFrameRate() - this.lastFrameRate >= 10 && !this.hardwareLimit) {
                tryStartOneMoreWork();
            }
            Logger.m144646i(TAG, "current work size:" + currentRunSize() + " frameRate:" + j + " currentRate:" + currentFrameRate() + " lastFrameRate:" + this.lastFrameRate);
            int currentFrameRate2 = currentFrameRate();
            int i = this.lastFrameRate;
            if (currentFrameRate2 < i) {
                currentFrameRate2 = i;
            }
            this.lastFrameRate = currentFrameRate2;
            this.currentFrameRate = 0;
        }
        int i2 = this.maxParallelCount;
        int currentRunSize = currentRunSize();
        if (i2 < currentRunSize) {
            i2 = currentRunSize;
        }
        this.maxParallelCount = i2;
    }

    public final boolean canWorkReuse() {
        return false;
    }

    public final int currentRunSize() {
        ArrayList<PipelineWorkInfo> arrayList = this.exportWork;
        if (arrayList == null) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            PipelineWorkInfo pipelineWorkInfo = (PipelineWorkInfo) next;
            PipelineIndicatorInfo indicator = pipelineWorkInfo.getIndicator();
            C87412m.m108590c(indicator, "it.indicator");
            boolean z = true;
            if (!(indicator.getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusStarted && pipelineWorkInfo.getIndicator().type == 1)) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        return arrayList2.size();
    }

    public final int getMaxParallelCount() {
        return this.maxParallelCount;
    }

    public final void handleWorkFinish(PipelineWorkInfo pipelineWorkInfo, Runnable runnable) {
        C87412m.m108595h(pipelineWorkInfo, "info");
        C87412m.m108595h(runnable, "callback");
        if (!hasPreparedWork()) {
            C32228q<? super PipelineWorkInfo, ? super Runnable, ? super Boolean, C13598b0> qVar = this.releaseWork;
            if (qVar != null) {
                qVar.invoke(pipelineWorkInfo, runnable, Boolean.FALSE);
            }
        } else if (canWorkReuse()) {
            reuseWork(this.startWork);
        } else {
            C32228q<? super PipelineWorkInfo, ? super Runnable, ? super Boolean, C13598b0> qVar2 = this.releaseWork;
            if (qVar2 != null) {
                qVar2.invoke(pipelineWorkInfo, new ParallelExportController$handleWorkFinish$$inlined$let$lambda$1(this, pipelineWorkInfo), Boolean.FALSE);
            }
        }
    }

    public final void markHardwareLimit(PipelineIndicatorInfo pipelineIndicatorInfo) {
        Logger.m144646i(TAG, "markHardwareLimit:" + pipelineIndicatorInfo);
        this.hardwareLimit = true;
    }

    public final void registerFunction(C32226l<? super PipelineWorkInfo, C13598b0> lVar, C32228q<? super PipelineWorkInfo, ? super Runnable, ? super Boolean, C13598b0> qVar) {
        this.startWork = lVar;
        this.releaseWork = qVar;
    }

    public final void setMaxParallelCount(int i) {
        this.maxParallelCount = i;
    }

    public final void startExport(ArrayList<PipelineWorkInfo> arrayList) {
        boolean z;
        C87412m.m108595h(arrayList, "info");
        setupWorkInfo(arrayList);
        long currentTimeMillis = System.currentTimeMillis();
        this.lastTimestampMs = currentTimeMillis;
        this.startTimeMs = currentTimeMillis;
        C32226l<? super PipelineWorkInfo, C13598b0> lVar = this.startWork;
        if (lVar != null) {
            ArrayList<PipelineWorkInfo> arrayList2 = this.exportWork;
            T t = null;
            if (arrayList2 != null) {
                Iterator<T> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    PipelineWorkInfo pipelineWorkInfo = (PipelineWorkInfo) next;
                    PipelineIndicatorInfo indicator = pipelineWorkInfo.getIndicator();
                    C87412m.m108590c(indicator, "it.indicator");
                    if (indicator.getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusPrepared && pipelineWorkInfo.getIndicator().type == 2) {
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
            lVar.invoke(t);
        }
        tryStartOneMoreWork();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void tryStartOneMoreWork() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "ParallelExportController"
            java.lang.String r1 = "tryStartOneMoreWork currentRunSize:%d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x002c }
            r3 = 0
            int r4 = r5.currentRunSize()     // Catch:{ all -> 0x002c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002c }
            r2[r3] = r4     // Catch:{ all -> 0x002c }
            com.tencent.tav.decoder.logger.Logger.m144647i(r0, r1, r2)     // Catch:{ all -> 0x002c }
            int r0 = r5.currentRunSize()     // Catch:{ all -> 0x002c }
            r1 = 5
            if (r0 < r1) goto L_0x001f
            monitor-exit(r5)
            return
        L_0x001f:
            boolean r0 = r5.hasPreparedWork()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x002a
            fy3.l<? super com.tencent.tav.core.parallel.info.PipelineWorkInfo, rx3.b0> r0 = r5.startWork     // Catch:{ all -> 0x002c }
            r5.createNewWork(r0)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r5)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.parallel.control.ParallelExportController.tryStartOneMoreWork():void");
    }
}
