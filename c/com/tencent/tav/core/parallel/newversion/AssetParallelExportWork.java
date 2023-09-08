package com.tencent.tav.core.parallel.newversion;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.lifecycle.C0120a0;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.codec.IMediaFactory;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.AssetParallelSegmentStatus;
import com.tencent.tav.core.AudioMix;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.parallel.FixedParallelStrategy;
import com.tencent.tav.core.parallel.IParallelStrategy;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.tav.decoder.muxer.MediaMuxerFactory;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001iB/\u0012\u0006\u0010L\u001a\u00020K\u0012\b\u0010S\u001a\u0004\u0018\u00010R\u0012\f\u0010Z\u001a\b\u0012\u0002\b\u0003\u0018\u00010Y\u0012\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bg\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J&\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010 J\u0016\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eJ\u0006\u0010&\u001a\u00020\u0003J\u0012\u0010'\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u000bR\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000200j\b\u0012\u0004\u0012\u00020\u0002`18\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u000500j\b\u0012\u0004\u0012\u00020\u0005`18\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010>R\u0016\u0010@\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u00109R\u0016\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010>R\u0016\u0010B\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010;R\u0016\u0010C\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010;R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010F\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010Z\u001a\b\u0012\u0002\b\u0003\u0018\u00010Y8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006j"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/newversion/AssetParallelExportWork;", "Landroidx/lifecycle/a0;", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "Lrx3/b0;", "startAudioWork", "Lcom/tencent/tav/core/parallel/newversion/AssetSingleExportThread;", "work", "addWork", "startVideoWork", "findUnStartedIndicator", "triggerLoadBalance", "", "currentFrameRate", "currentVideoRunSize", "", "allWorkFinish", "hasUnknownWork", "mediaMux", "Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "status", "Lcom/tencent/tav/core/ExportErrorStatus;", "error", "handleResult", "release", "info", "remove", "Ljava/lang/Runnable;", "runnable", "releaseSingleWork", "Lcom/tencent/tav/decoder/RenderContextParams;", "renderContextParams", "setRenderContextParams", "Lcom/tencent/tav/codec/IMediaFactory;", "mediaFactory", "setMediaFactory", "check", "interrupt", "setTimeoutParameter", "startExport", "onChanged", "cancel", "getParallelCount", "Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "Lcom/tencent/tav/core/parallel/IParallelStrategy;", "strategy", "Lcom/tencent/tav/core/parallel/IParallelStrategy;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "segmentIndicators", "Ljava/util/ArrayList;", "workList", "Lcom/tencent/tav/decoder/RenderContextParams;", "Lcom/tencent/tav/codec/IMediaFactory;", "", "lastProgressCallbackTimeStamp", "J", "hardwareLimit", "Z", "parallelStartTimeMs", "totalFrame", "I", "lastFrameRate", "lastBalanceTimestampMs", "maxParallelCount", "isNeedCheckFrameProcessTimeout", "timeoutInterruptWork", "resulted", "Landroid/os/HandlerThread;", "callbackHandleThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "callbackControlHandle", "Landroid/os/Handler;", "Lcom/tencent/tav/core/AssetParallelExportSession;", "exportSession", "Lcom/tencent/tav/core/AssetParallelExportSession;", "getExportSession", "()Lcom/tencent/tav/core/AssetParallelExportSession;", "setExportSession", "(Lcom/tencent/tav/core/AssetParallelExportSession;)V", "Lcom/tencent/tav/core/AssetParallelExportSession$ExportCallbackHandler;", "callbackHandler", "Lcom/tencent/tav/core/AssetParallelExportSession$ExportCallbackHandler;", "getCallbackHandler", "()Lcom/tencent/tav/core/AssetParallelExportSession$ExportCallbackHandler;", "setCallbackHandler", "(Lcom/tencent/tav/core/AssetParallelExportSession$ExportCallbackHandler;)V", "Lcom/tencent/tav/core/AudioMix;", "audioMix", "Lcom/tencent/tav/core/AudioMix;", "getAudioMix", "()Lcom/tencent/tav/core/AudioMix;", "setAudioMix", "(Lcom/tencent/tav/core/AudioMix;)V", "Lcom/tencent/tav/core/ExportConfig;", "encodeOption", "Lcom/tencent/tav/core/ExportConfig;", "getEncodeOption", "()Lcom/tencent/tav/core/ExportConfig;", "setEncodeOption", "(Lcom/tencent/tav/core/ExportConfig;)V", "<init>", "(Lcom/tencent/tav/core/AssetParallelExportSession;Lcom/tencent/tav/core/AssetParallelExportSession$ExportCallbackHandler;Lcom/tencent/tav/core/AudioMix;Lcom/tencent/tav/core/ExportConfig;)V", "Companion", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class AssetParallelExportWork implements C0120a0<PipelineIndicatorInfo> {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final int DEFAULT_FRAME = 20;
    private static final int FRAME_BUFF = 10;
    private static final int MAX_WORK_COUNT = 5;
    private static final int PROGRESS_CALLBACK_INTERVAL = 10;
    private static final String TAG = "AssetParallelExportWork";
    private static final int TIME_INTERVAL = 2000;
    private AudioMix<?> audioMix;
    private final Handler callbackControlHandle;
    private final HandlerThread callbackHandleThread;
    private AssetParallelExportSession.ExportCallbackHandler callbackHandler;
    private int currentFrameRate;
    private ExportConfig encodeOption;
    private AssetParallelExportSession exportSession;
    private boolean hardwareLimit;
    private volatile boolean isNeedCheckFrameProcessTimeout;
    private long lastBalanceTimestampMs;
    private int lastFrameRate;
    /* access modifiers changed from: private */
    public long lastProgressCallbackTimeStamp;
    private final Object lock = new Object();
    private int maxParallelCount;
    private IMediaFactory mediaFactory;
    private long parallelStartTimeMs;
    private RenderContextParams renderContextParams;
    private volatile boolean resulted;
    /* access modifiers changed from: private */
    public final ArrayList<PipelineIndicatorInfo> segmentIndicators;
    private final IParallelStrategy strategy;
    private volatile boolean timeoutInterruptWork;
    private int totalFrame;
    private final ArrayList<AssetSingleExportThread> workList;

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/newversion/AssetParallelExportWork$Companion;", "", "()V", "DEFAULT_FRAME", "", "FRAME_BUFF", "MAX_WORK_COUNT", "PROGRESS_CALLBACK_INTERVAL", "TAG", "", "TIME_INTERVAL", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public AssetParallelExportWork(AssetParallelExportSession assetParallelExportSession, AssetParallelExportSession.ExportCallbackHandler exportCallbackHandler, AudioMix<?> audioMix2, ExportConfig exportConfig) {
        C87412m.m108595h(assetParallelExportSession, "exportSession");
        C87412m.m108595h(exportConfig, "encodeOption");
        this.exportSession = assetParallelExportSession;
        this.callbackHandler = exportCallbackHandler;
        this.audioMix = audioMix2;
        this.encodeOption = exportConfig;
        FixedParallelStrategy fixedParallelStrategy = new FixedParallelStrategy(this.exportSession);
        this.strategy = fixedParallelStrategy;
        ArrayList<PipelineIndicatorInfo> arrayList = new ArrayList<>();
        this.segmentIndicators = arrayList;
        this.workList = new ArrayList<>();
        this.totalFrame = 30;
        this.lastFrameRate = 20;
        this.currentFrameRate = 20;
        this.isNeedCheckFrameProcessTimeout = true;
        HandlerThread handlerThread = new HandlerThread("parallel-callback");
        this.callbackHandleThread = handlerThread;
        fixedParallelStrategy.calculateSubsection(this.exportSession, arrayList);
        this.exportSession.setIndicatorInfo(arrayList);
        handlerThread.start();
        this.callbackControlHandle = new Handler(handlerThread.getLooper());
    }

    private final void addWork(AssetSingleExportThread assetSingleExportThread) {
        synchronized (this.lock) {
            this.workList.add(assetSingleExportThread);
        }
    }

    private final boolean allWorkFinish() {
        T t;
        boolean z;
        Iterator<T> it = this.segmentIndicators.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((PipelineIndicatorInfo) t).getSegmentStatus() != AssetParallelSegmentStatus.AssetExportStatusCompleted) {
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
        return t == null;
    }

    private final int currentFrameRate() {
        return (this.currentFrameRate * 1000) / 2000;
    }

    /* access modifiers changed from: private */
    public final int currentVideoRunSize() {
        int size;
        PipelineIndicatorInfo pipelineIndicatorInfo;
        synchronized (this.lock) {
            ArrayList<AssetSingleExportThread> arrayList = this.workList;
            ArrayList arrayList2 = new ArrayList();
            for (T next : arrayList) {
                AssetSingleExportThread assetSingleExportThread = (AssetSingleExportThread) next;
                PipelineIndicatorInfo pipelineIndicatorInfo2 = assetSingleExportThread.indicatorInfo;
                boolean z = true;
                if ((pipelineIndicatorInfo2 != null ? pipelineIndicatorInfo2.getSegmentStatus() : null) != AssetParallelSegmentStatus.AssetParallelStatusStarted || (pipelineIndicatorInfo = assetSingleExportThread.indicatorInfo) == null || pipelineIndicatorInfo.type != 1) {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            size = arrayList2.size();
        }
        return size;
    }

    private final PipelineIndicatorInfo findUnStartedIndicator() {
        T t;
        boolean z;
        Iterator<T> it = this.segmentIndicators.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((PipelineIndicatorInfo) t).getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusUnknown) {
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
        return (PipelineIndicatorInfo) t;
    }

    private final synchronized void handleResult(AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, ExportErrorStatus exportErrorStatus) {
        Logger.m144646i(TAG, "handleResult " + assetExportSessionStatus + " error:" + exportErrorStatus);
        this.callbackControlHandle.removeCallbacksAndMessages((Object) null);
        this.callbackControlHandle.post(new AssetParallelExportWork$handleResult$1(this, assetExportSessionStatus, exportErrorStatus));
    }

    private final boolean hasUnknownWork() {
        T t;
        boolean z;
        Iterator<T> it = this.segmentIndicators.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((PipelineIndicatorInfo) t).getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusUnknown) {
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
        return t != null;
    }

    private final int mediaMux() {
        int parallelMux;
        Logger.m144646i(TAG, "mediaMux:" + this.workList.size());
        synchronized (this.lock) {
            ArrayList<AssetSingleExportThread> arrayList = this.workList;
            ArrayList arrayList2 = new ArrayList();
            for (AssetSingleExportThread assetSingleExportThread : arrayList) {
                assetSingleExportThread.getMuxer().stop(false);
                IMediaMuxer muxer = assetSingleExportThread.getMuxer();
                if (muxer != null) {
                    arrayList2.add(muxer);
                }
            }
            parallelMux = MediaMuxerFactory.parallelMux(arrayList2);
        }
        return parallelMux;
    }

    /* access modifiers changed from: private */
    public final void release() {
        this.callbackHandleThread.quitSafely();
        synchronized (this.lock) {
            for (AssetSingleExportThread assetSingleExportThread : this.workList) {
                assetSingleExportThread.observe((C0120a0<PipelineIndicatorInfo>) null);
                assetSingleExportThread.release((Runnable) null);
                assetSingleExportThread.clearResource();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    private final void releaseSingleWork(PipelineIndicatorInfo pipelineIndicatorInfo, boolean z, Runnable runnable) {
        T t;
        Logger.m144646i(TAG, "releaseSingleWork:" + pipelineIndicatorInfo + " remove:" + z);
        synchronized (this.lock) {
            Iterator<T> it = this.workList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((AssetSingleExportThread) t).indicatorInfo, pipelineIndicatorInfo)) {
                    break;
                }
            }
            AssetSingleExportThread assetSingleExportThread = (AssetSingleExportThread) t;
            if (assetSingleExportThread != null) {
                assetSingleExportThread.observe((C0120a0<PipelineIndicatorInfo>) null);
                assetSingleExportThread.release(runnable);
                if (z) {
                    assetSingleExportThread.clearResource();
                    this.workList.remove(assetSingleExportThread);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public static /* synthetic */ void releaseSingleWork$default(AssetParallelExportWork assetParallelExportWork, PipelineIndicatorInfo pipelineIndicatorInfo, boolean z, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            runnable = null;
        }
        assetParallelExportWork.releaseSingleWork(pipelineIndicatorInfo, z, runnable);
    }

    private final void startAudioWork() {
        List<AssetTrack> tracksWithMediaType = this.exportSession.asset.tracksWithMediaType(2);
        if ((tracksWithMediaType != null ? tracksWithMediaType.size() : 0) > 0) {
            PipelineIndicatorInfo audioPipelineIndicatorInfo = PipelineIndicatorInfo.getAudioPipelineIndicatorInfo(this.exportSession.timeRange);
            this.segmentIndicators.add(audioPipelineIndicatorInfo);
            if (audioPipelineIndicatorInfo != null) {
                Logger.m144646i(TAG, "startAudioWork " + audioPipelineIndicatorInfo);
                AssetSingleExportThread assetSingleExportThread = new AssetSingleExportThread(audioPipelineIndicatorInfo, this.exportSession, this.audioMix, this.encodeOption);
                assetSingleExportThread.setMediaFactory(this.mediaFactory);
                assetSingleExportThread.observe(this);
                assetSingleExportThread.setTimeoutParameter(this.isNeedCheckFrameProcessTimeout, this.timeoutInterruptWork);
                assetSingleExportThread.startExport();
                addWork(assetSingleExportThread);
            }
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void startVideoWork() {
        PipelineIndicatorInfo findUnStartedIndicator = findUnStartedIndicator();
        if (findUnStartedIndicator != null) {
            Logger.m144646i(TAG, "startVideoWork " + findUnStartedIndicator);
            findUnStartedIndicator.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusPrepared);
            AssetSingleExportThread assetSingleExportThread = new AssetSingleExportThread(findUnStartedIndicator, this.exportSession, this.audioMix, this.encodeOption);
            assetSingleExportThread.setMediaFactory(this.mediaFactory);
            assetSingleExportThread.observe(this);
            assetSingleExportThread.setTimeoutParameter(this.isNeedCheckFrameProcessTimeout, this.timeoutInterruptWork);
            assetSingleExportThread.startExport();
            addWork(assetSingleExportThread);
        }
    }

    private final void triggerLoadBalance() {
        this.currentFrameRate++;
        this.totalFrame++;
        int currentVideoRunSize = currentVideoRunSize();
        if (System.currentTimeMillis() - this.lastBalanceTimestampMs >= ((long) 2000)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.lastBalanceTimestampMs = currentTimeMillis;
            long j = ((long) (this.totalFrame * 1000)) / (currentTimeMillis - this.parallelStartTimeMs);
            if (currentFrameRate() - this.lastFrameRate >= 10 && !this.hardwareLimit) {
                startVideoWork();
            }
            Logger.m144646i(TAG, "current video work size:" + currentVideoRunSize + ' ' + "frameRate:" + j + ' ' + "currentRate:" + currentFrameRate() + ' ' + "lastFrameRate:" + this.lastFrameRate + ' ' + "maxParallelCount:" + this.maxParallelCount + ' ' + "mediaCodec count:" + MediaCodecAnalyse.Companion.instanceCount());
            int currentFrameRate2 = currentFrameRate();
            int i = this.lastFrameRate;
            if (currentFrameRate2 < i) {
                currentFrameRate2 = i;
            }
            this.lastFrameRate = currentFrameRate2;
            this.currentFrameRate = 0;
        }
        int i2 = this.maxParallelCount;
        if (i2 >= currentVideoRunSize) {
            currentVideoRunSize = i2;
        }
        this.maxParallelCount = currentVideoRunSize;
    }

    public final void cancel() {
        Logger.m144646i(TAG, "cancel");
        handleResult(AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled, new ExportErrorStatus(-11));
    }

    public final AudioMix<?> getAudioMix() {
        return this.audioMix;
    }

    public final AssetParallelExportSession.ExportCallbackHandler getCallbackHandler() {
        return this.callbackHandler;
    }

    public final ExportConfig getEncodeOption() {
        return this.encodeOption;
    }

    public final AssetParallelExportSession getExportSession() {
        return this.exportSession;
    }

    public final int getParallelCount() {
        return this.maxParallelCount;
    }

    public final void setAudioMix(AudioMix<?> audioMix2) {
        this.audioMix = audioMix2;
    }

    public final void setCallbackHandler(AssetParallelExportSession.ExportCallbackHandler exportCallbackHandler) {
        this.callbackHandler = exportCallbackHandler;
    }

    public final void setEncodeOption(ExportConfig exportConfig) {
        C87412m.m108595h(exportConfig, "<set-?>");
        this.encodeOption = exportConfig;
    }

    public final void setExportSession(AssetParallelExportSession assetParallelExportSession) {
        C87412m.m108595h(assetParallelExportSession, "<set-?>");
        this.exportSession = assetParallelExportSession;
    }

    public final void setMediaFactory(IMediaFactory iMediaFactory) {
        this.mediaFactory = iMediaFactory;
    }

    public final void setRenderContextParams(RenderContextParams renderContextParams2) {
        this.renderContextParams = renderContextParams2;
    }

    public final void setTimeoutParameter(boolean z, boolean z2) {
        this.isNeedCheckFrameProcessTimeout = z;
        this.timeoutInterruptWork = z2;
        Logger.m144647i(TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b", Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public final void startExport() {
        Logger.m144646i(TAG, "start work,print indicator info");
        for (PipelineIndicatorInfo valueOf : this.segmentIndicators) {
            Logger.m144646i(TAG, String.valueOf(valueOf));
        }
        this.exportSession.status = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting;
        long currentTimeMillis = System.currentTimeMillis();
        this.parallelStartTimeMs = currentTimeMillis;
        this.lastBalanceTimestampMs = currentTimeMillis;
        startAudioWork();
        startVideoWork();
    }

    public void onChanged(PipelineIndicatorInfo pipelineIndicatorInfo) {
        if (pipelineIndicatorInfo != null) {
            if (pipelineIndicatorInfo.type == 1) {
                triggerLoadBalance();
            }
            if (pipelineIndicatorInfo.getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusStarted) {
                this.callbackControlHandle.post(new AssetParallelExportWork$onChanged$$inlined$let$lambda$1(this));
            } else if (pipelineIndicatorInfo.getSegmentStatus() == AssetParallelSegmentStatus.AssetExportStatusCompleted) {
                Logger.m144646i(TAG, "PipelineIndicatorInfo finish:" + pipelineIndicatorInfo);
                if (hasUnknownWork()) {
                    releaseSingleWork(pipelineIndicatorInfo, false, new AssetParallelExportWork$onChanged$$inlined$let$lambda$2(this));
                } else if (allWorkFinish() && !this.resulted) {
                    this.resulted = true;
                    int mediaMux = mediaMux();
                    Logger.m144646i(TAG, "mediaMux ret:" + mediaMux);
                    if (mediaMux != 0) {
                        handleResult(AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed, new ExportErrorStatus((int) ExportErrorStatus.VIDEO_MUXER_ERROR));
                        return;
                    }
                    handleResult(AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted, new ExportErrorStatus(0));
                }
            } else if (pipelineIndicatorInfo.getSegmentStatus() == AssetParallelSegmentStatus.AssetParallelStatusFailed) {
                this.hardwareLimit = true;
                Logger.m144643e(TAG, "exportError index:" + pipelineIndicatorInfo.getIndex() + " parallel:" + getParallelCount() + " :" + pipelineIndicatorInfo.errorStatus + " retry count:" + pipelineIndicatorInfo.getRetryCount() + " mediaCodec count:" + MediaCodecAnalyse.Companion.instanceCount());
                if (pipelineIndicatorInfo.getRetryCount() <= 0) {
                    pipelineIndicatorInfo.retry();
                    releaseSingleWork(pipelineIndicatorInfo, true, new AssetParallelExportWork$onChanged$$inlined$let$lambda$3(this));
                    return;
                }
                AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed;
                ExportErrorStatus exportErrorStatus = pipelineIndicatorInfo.errorStatus;
                C87412m.m108590c(exportErrorStatus, "it.errorStatus");
                handleResult(assetExportSessionStatus, exportErrorStatus);
            }
        }
    }
}
