package com.tencent.tav.core;

import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.codec.IMediaFactory;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.AssetWriterInput;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.ExportReportSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssetExportThread extends HandlerThread implements Handler.Callback {
    public static final int FRAME_OPERATE_TIMEOUT = 20000;
    private static final String TAG = "AssetExportThread";
    private static final int msg_done_a = 2;
    private static final int msg_done_v = 1;
    /* access modifiers changed from: private */
    public AssetReader assetReader;
    /* access modifiers changed from: private */
    public AssetWriter assetWriter;
    /* access modifiers changed from: private */
    public HandlerThread audioExportThread;
    private AudioInfo audioInfo;
    private AudioMix audioMix;
    /* access modifiers changed from: private */
    public float audioProgress;
    /* access modifiers changed from: private */
    public boolean audioReadFinish = false;
    /* access modifiers changed from: private */
    public AssetReaderOutput audioReader;
    /* access modifiers changed from: private */
    public long audioTime = 0;
    /* access modifiers changed from: private */
    public volatile boolean audioTimeout = false;
    /* access modifiers changed from: private */
    public AudioFrameOperateTimeoutCallback audioTimeoutCallback = new AudioFrameOperateTimeoutCallback();
    /* access modifiers changed from: private */
    public AssetWriterInput audioWriter;
    /* access modifiers changed from: private */
    public volatile boolean audioWriterDone = false;
    /* access modifiers changed from: private */
    public AssetExportSession.ExportCallbackHandler callbackHandler;
    /* access modifiers changed from: private */
    public volatile boolean cancel = false;
    private int count = 0;
    private final ExportConfig encodeOption;
    /* access modifiers changed from: private */
    public Handler exportHandler;
    /* access modifiers changed from: private */
    public AssetExportSession exportSession;
    private int frameCount = 0;
    private volatile boolean isFinishing;
    /* access modifiers changed from: private */
    public boolean isNeedCheckFrameProcessTimeout = true;
    private long lastFrameTimeStamp = 0;
    /* access modifiers changed from: private */
    public long lastHandleAudioTimeStamp = SystemClock.uptimeMillis();
    /* access modifiers changed from: private */
    public long lastHandleVideoTimeStamp = SystemClock.uptimeMillis();
    private IMediaFactory mediaFactory;
    private RenderContextParams renderContextParams;
    /* access modifiers changed from: private */
    public ExportReportSession reportSession = new ExportReportSession();
    /* access modifiers changed from: private */
    public boolean timeoutInterruptWork = false;
    /* access modifiers changed from: private */
    public HandlerThread videoExportThread;
    /* access modifiers changed from: private */
    public float videoProgress;
    /* access modifiers changed from: private */
    public boolean videoReadFinish = false;
    /* access modifiers changed from: private */
    public AssetReaderOutput videoReader;
    /* access modifiers changed from: private */
    public long videoTime = 0;
    /* access modifiers changed from: private */
    public volatile boolean videoTimeout = false;
    /* access modifiers changed from: private */
    public VideoFrameOperateTimeoutCallback videoTimeoutCallback = new VideoFrameOperateTimeoutCallback();
    /* access modifiers changed from: private */
    public AssetWriterInput videoWriter;
    /* access modifiers changed from: private */
    public volatile boolean videoWriterDone = false;

    public class AudioFrameOperateTimeoutCallback implements Runnable {
        private AudioFrameOperateTimeoutCallback() {
        }

        public void run() {
            if (SystemClock.uptimeMillis() - AssetExportThread.this.lastHandleAudioTimeStamp < 20000) {
                return;
            }
            if (AssetExportThread.this.timeoutInterruptWork) {
                Logger.m144646i(AssetExportThread.TAG, "audioTimeout");
                boolean unused = AssetExportThread.this.audioTimeout = true;
                AssetExportThread.this.finish();
                return;
            }
            AssetExportThread.this.exportSession.processErrorStatus = new ExportErrorStatus((int) ExportErrorStatus.AUDIO_FRAME_HANDLE_TIMEOUT);
        }
    }

    public class AudioRequestMediaDataCallback implements Runnable {
        private AudioRequestMediaDataCallback() {
        }

        private void onAudioRequestMediaData() {
            while (true) {
                if (AssetExportThread.this.audioWriterDone || AssetExportThread.this.cancel || AssetExportThread.this.audioWriter == null) {
                    break;
                }
                long unused = AssetExportThread.this.lastHandleAudioTimeStamp = SystemClock.uptimeMillis();
                if (AssetExportThread.this.isNeedCheckFrameProcessTimeout) {
                    AssetExportThread.this.exportHandler.removeCallbacks(AssetExportThread.this.audioTimeoutCallback);
                    AssetExportThread.this.exportHandler.postDelayed(AssetExportThread.this.audioTimeoutCallback, 20000);
                }
                if (AssetExportThread.this.audioReader != null && AssetExportThread.this.audioWriter.isReadyForMoreMediaData()) {
                    AssetExportThread.this.audioReader.duration();
                    CMSampleBuffer copyNextSampleBuffer = AssetExportThread.this.audioReader.copyNextSampleBuffer(true);
                    CMSampleState state = copyNextSampleBuffer.getState();
                    if (state.getStateCode() >= 0) {
                        ExportErrorStatus appendSampleBuffer = AssetExportThread.this.audioWriter.appendSampleBuffer(copyNextSampleBuffer);
                        if (appendSampleBuffer != null) {
                            AssetExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (copyNextSampleBuffer.getTime().getTimeUs() >= AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs()) {
                            AssetExportThread.this.audioWriter.markAsFinished();
                            break;
                        }
                    } else if (state.getStateCode() == -1) {
                        AssetExportThread.this.audioWriter.markAsFinished();
                        break;
                    } else if (state.getStateCode() != -4) {
                        AssetExportThread.this.exportError(new ExportErrorStatus(state));
                        break;
                    }
                }
            }
            AssetExportThread assetExportThread = AssetExportThread.this;
            boolean unused2 = assetExportThread.audioReadFinish = true ^ assetExportThread.cancel;
            AssetExportThread.this.exportHandler.removeCallbacks(AssetExportThread.this.audioTimeoutCallback);
            AssetExportThread.this.exportHandler.sendEmptyMessage(2);
        }

        public void run() {
            try {
                onAudioRequestMediaData();
            } catch (Throwable th) {
                Logger.m144644e(AssetExportThread.TAG, "AudioRequestMediaDateCallback run: ", th);
                AssetExportThread.this.exportError(-15, th);
            }
        }
    }

    public class AudioWriterProgressListener implements AssetWriterInput.WriterProgressListener {
        private AudioWriterProgressListener() {
        }

        public void onError(ExportErrorStatus exportErrorStatus) {
            Logger.m144644e(AssetExportThread.TAG, "AudioWriterProgressListener onError: ", exportErrorStatus.throwable);
            AssetExportThread.this.exportError(exportErrorStatus);
        }

        public void onProgressChanged(AssetWriterInput assetWriterInput, long j) {
            Logger.m144646i("AssetExportSession", "onProgressChanged: audioWriter " + j + "  / " + AssetExportThread.this.getDuration());
            if (j == -1) {
                AssetExportThread assetExportThread = AssetExportThread.this;
                long unused = assetExportThread.audioTime = assetExportThread.exportSession.timeRange.getDuration().getTimeUs();
                float unused2 = AssetExportThread.this.audioProgress = 1.0f;
                boolean unused3 = AssetExportThread.this.audioWriterDone = true;
                AssetExportThread.this.exportHandler.sendEmptyMessage(2);
                return;
            }
            long unused4 = AssetExportThread.this.audioTime = j;
            long timeUs = AssetExportThread.this.exportSession.timeRange != null ? AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs() : AssetExportThread.this.audioReader != null ? AssetExportThread.this.audioReader.duration() : 0;
            if (timeUs != 0) {
                AssetExportThread assetExportThread2 = AssetExportThread.this;
                float unused5 = assetExportThread2.audioProgress = (((float) assetExportThread2.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                float unused6 = AssetExportThread.this.audioProgress = 1.0f;
            }
            AssetExportThread.this.exportSession.progress = Math.min(AssetExportThread.this.videoProgress, AssetExportThread.this.audioProgress);
            if (AssetExportThread.this.callbackHandler != null) {
                AssetExportThread.this.callbackHandler.handlerCallback(AssetExportThread.this.exportSession);
            }
            if ((AssetExportThread.this.audioTime > AssetExportThread.this.videoTime && AssetExportThread.this.videoWriterDone) || AssetExportThread.this.audioTime >= AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs()) {
                AssetExportThread assetExportThread3 = AssetExportThread.this;
                long unused7 = assetExportThread3.audioTime = assetExportThread3.exportSession.timeRange.getDuration().getTimeUs();
                boolean unused8 = AssetExportThread.this.audioWriterDone = true;
                AssetExportThread.this.exportHandler.sendEmptyMessage(2);
            }
        }
    }

    public class VideoFrameOperateTimeoutCallback implements Runnable {
        private VideoFrameOperateTimeoutCallback() {
        }

        public void run() {
            if (SystemClock.uptimeMillis() - AssetExportThread.this.lastHandleVideoTimeStamp < 20000) {
                return;
            }
            if (AssetExportThread.this.timeoutInterruptWork) {
                boolean unused = AssetExportThread.this.videoTimeout = true;
                Logger.m144646i(AssetExportThread.TAG, "videoTimeout");
                AssetExportThread.this.finish();
                return;
            }
            AssetExportThread.this.exportSession.processErrorStatus = new ExportErrorStatus(-203);
        }
    }

    public class VideoRequestMediaDataCallback implements Runnable {
        private static final int NOT_READY_TIME_OUT = 3000;
        private long cost;
        private long frame;
        private boolean isReady;
        private long notReadyStart;

        private VideoRequestMediaDataCallback() {
            this.isReady = true;
            this.notReadyStart = 0;
            this.frame = 1;
            this.cost = 0;
        }

        private void onRequestMediaData() {
            while (true) {
                if (AssetExportThread.this.videoWriterDone || AssetExportThread.this.cancel) {
                    break;
                }
                long unused = AssetExportThread.this.lastHandleVideoTimeStamp = SystemClock.uptimeMillis();
                if (AssetExportThread.this.isNeedCheckFrameProcessTimeout) {
                    AssetExportThread.this.exportHandler.removeCallbacks(AssetExportThread.this.videoTimeoutCallback);
                    AssetExportThread.this.exportHandler.postDelayed(AssetExportThread.this.videoTimeoutCallback, 20000);
                }
                System.currentTimeMillis();
                if (AssetExportThread.this.videoReader == null || !AssetExportThread.this.videoWriter.isReadyForMoreMediaData()) {
                    Logger.m144646i(AssetExportThread.TAG, "leex not ReadyForMoreMediaData");
                    if (this.isReady) {
                        this.isReady = false;
                        this.notReadyStart = System.currentTimeMillis();
                    } else if (System.currentTimeMillis() - this.notReadyStart > 3000) {
                        AssetExportThread.this.exportError(new ExportErrorStatus(CMSampleState.fromExportError(-3, ExportErrorStatus.ENCODER_NOT_READY_TIME_OUT, "", (Throwable) null)));
                        break;
                    }
                } else {
                    this.isReady = true;
                    long nanoTime = System.nanoTime();
                    CMSampleBuffer copyNextSampleBuffer = AssetExportThread.this.videoReader.copyNextSampleBuffer(true);
                    if (AssetExportThread.this.reportSession != null) {
                        AssetExportThread.this.reportSession.tickDecode(System.nanoTime() - nanoTime);
                    }
                    CMSampleState state = copyNextSampleBuffer.getState();
                    Logger.m144646i(AssetExportThread.TAG, "onRequestMediaData stateCode: " + state.getStateCode());
                    if (state.getStateCode() >= 0) {
                        ExportErrorStatus appendSampleBuffer = AssetExportThread.this.videoWriter.appendSampleBuffer(copyNextSampleBuffer);
                        if (appendSampleBuffer != null) {
                            AssetExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (AssetExportThread.this.reportSession != null) {
                            AssetExportThread.this.reportSession.tickExport(System.nanoTime() - nanoTime);
                        }
                    } else {
                        if (state.stateMatchingTo(-1)) {
                            AssetExportThread.this.videoWriter.markAsFinished();
                            break;
                        } else if (state.getStateCode() != -4) {
                            AssetExportThread.this.exportError(new ExportErrorStatus(state));
                            break;
                        }
                    }
                }
            }
            if (AssetExportThread.this.videoWriter.matrixFilter != null) {
                AssetExportThread.this.videoWriter.matrixFilter.release();
            }
            if (AssetExportThread.this.exportSession.videoCompositing != null) {
                AssetExportThread.this.exportSession.videoCompositing.release();
            }
            AssetExportThread assetExportThread = AssetExportThread.this;
            boolean unused2 = assetExportThread.videoReadFinish = !assetExportThread.cancel;
            AssetExportThread.this.exportHandler.removeCallbacks(AssetExportThread.this.videoTimeoutCallback);
            AssetExportThread.this.exportHandler.sendEmptyMessage(1);
        }

        public void run() {
            try {
                onRequestMediaData();
            } catch (Throwable th) {
                Logger.m144644e(AssetExportThread.TAG, "VideoRequestMediaDateCallback run: ", th);
                AssetExportThread.this.exportError(-14, th);
            }
        }
    }

    public class VideoWriterProgressListener implements AssetWriterInput.WriterProgressListener {
        private VideoWriterProgressListener() {
        }

        public void onError(ExportErrorStatus exportErrorStatus) {
            Logger.m144644e(AssetExportThread.TAG, "VideoWriterProgressListener onError: ", exportErrorStatus.throwable);
            AssetExportThread.this.exportError(exportErrorStatus);
        }

        public void onProgressChanged(AssetWriterInput assetWriterInput, long j) {
            Logger.m144646i("AssetExportSession", "onProgressChanged: videoWriter " + j + "  / " + AssetExportThread.this.getDuration());
            if (j == -1) {
                AssetExportThread assetExportThread = AssetExportThread.this;
                long unused = assetExportThread.videoTime = assetExportThread.exportSession.timeRange.getDuration().getTimeUs();
                float unused2 = AssetExportThread.this.videoProgress = 1.0f;
                boolean unused3 = AssetExportThread.this.videoWriterDone = true;
                AssetExportThread.this.exportHandler.sendEmptyMessage(1);
                return;
            }
            long unused4 = AssetExportThread.this.videoTime = j;
            long timeUs = AssetExportThread.this.exportSession.timeRange != null ? AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs() : AssetExportThread.this.videoReader != null ? AssetExportThread.this.videoReader.duration() : 0;
            if (timeUs != 0) {
                AssetExportThread assetExportThread2 = AssetExportThread.this;
                float unused5 = assetExportThread2.videoProgress = (((float) assetExportThread2.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                float unused6 = AssetExportThread.this.videoProgress = 1.0f;
            }
            AssetExportThread.this.exportSession.progress = Math.min(AssetExportThread.this.videoProgress, AssetExportThread.this.audioProgress);
            if (AssetExportThread.this.callbackHandler != null) {
                AssetExportThread.this.callbackHandler.handlerCallback(AssetExportThread.this.exportSession);
            }
        }
    }

    public AssetExportThread(AssetExportSession assetExportSession, AssetExportSession.ExportCallbackHandler exportCallbackHandler, AudioMix audioMix2, ExportConfig exportConfig) {
        super("ExportThread");
        this.exportSession = assetExportSession;
        this.callbackHandler = exportCallbackHandler;
        this.audioMix = audioMix2;
        this.audioInfo = new AudioInfo(exportConfig.getAudioSampleRateHz(), exportConfig.getAudioChannelCount(), 2);
        this.encodeOption = exportConfig;
    }

    private AssetReaderOutput createAudioTrackOutput() {
        ArrayList arrayList = (ArrayList) this.exportSession.asset.tracksWithMediaType(2);
        if (arrayList == null || arrayList.size() <= 0) {
            return new EmptyReaderOutput();
        }
        AssetReaderAudioMixOutput assetReaderAudioMixOutput = new AssetReaderAudioMixOutput(arrayList, (Map<String, Object>) null, this.mediaFactory);
        assetReaderAudioMixOutput.setAudioMix(this.audioMix);
        assetReaderAudioMixOutput.setAudioInfo(this.audioInfo);
        return assetReaderAudioMixOutput;
    }

    private AssetWriterInput createAudioWriterInput() {
        return new AssetWriterInput(2);
    }

    private AssetReaderOutput createVideoTrackOutput() {
        List<AssetTrack> tracksWithMediaType = this.exportSession.asset.tracksWithMediaType(1);
        if (tracksWithMediaType == null || tracksWithMediaType.size() <= 0) {
            return new EmptyReaderOutput();
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("frame-rate", Integer.valueOf(this.encodeOption.getVideoFrameRate()));
        AssetReaderVideoCompositionOutput assetReaderVideoCompositionOutput = new AssetReaderVideoCompositionOutput(tracksWithMediaType, hashMap, this.exportSession.assetExtension, this.mediaFactory);
        assetReaderVideoCompositionOutput.setVideoComposition(this.exportSession.videoComposition);
        assetReaderVideoCompositionOutput.setVideoCompositing(this.exportSession.videoCompositing);
        assetReaderVideoCompositionOutput.setVideoRevertMode(this.exportSession.isRevertMode());
        return assetReaderVideoCompositionOutput;
    }

    private AssetWriterInput createVideoWriterInput() {
        ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.setFramePerSecond(this.encodeOption.getVideoFrameRate());
        }
        return new AssetWriterInput(1);
    }

    /* access modifiers changed from: private */
    public synchronized void exportError(int i, Throwable th) {
        exportError(new ExportErrorStatus(i, th));
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void exportSuccess() {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0029 }
            com.tencent.tav.core.AssetExportSession r0 = r3.exportSession     // Catch:{ all -> 0x0026 }
            com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r1 = r0.status     // Catch:{ all -> 0x0026 }
            com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus r2 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted     // Catch:{ all -> 0x0026 }
            if (r1 != r2) goto L_0x000d
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)
            return
        L_0x000d:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.progress = r1     // Catch:{ all -> 0x0026 }
            r0.status = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            com.tencent.tav.report.ExportReportSession r0 = r3.reportSession     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x001b
            r0.onExportSuccess()     // Catch:{ all -> 0x0029 }
        L_0x001b:
            com.tencent.tav.core.AssetExportSession$ExportCallbackHandler r0 = r3.callbackHandler     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0024
            com.tencent.tav.core.AssetExportSession r1 = r3.exportSession     // Catch:{ all -> 0x0029 }
            r0.handlerCallback(r1)     // Catch:{ all -> 0x0029 }
        L_0x0024:
            monitor-exit(r3)
            return
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.AssetExportThread.exportSuccess():void");
    }

    /* access modifiers changed from: private */
    public void exporting() {
        initReaderAndWriter();
        this.exportSession.status = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting;
        this.videoExportThread = new HandlerThread("VideoWriter");
        this.videoWriter.setWriterProgressListener(new VideoWriterProgressListener());
        this.videoWriter.requestMediaDataWhenReadyOnQueue(this.videoExportThread, new VideoRequestMediaDataCallback());
        if (this.audioWriter != null) {
            this.audioExportThread = new HandlerThread("AudioWriter");
            this.audioWriter.setWriterProgressListener(new AudioWriterProgressListener());
            this.audioWriter.requestMediaDataWhenReadyOnQueue(this.audioExportThread, new AudioRequestMediaDataCallback());
            return;
        }
        this.audioReadFinish = true;
        this.audioWriterDone = true;
    }

    /* access modifiers changed from: private */
    public void finish() {
        Logger.m144646i(TAG, "finish");
        if (this.videoExportThread == null) {
            Logger.m144649w(TAG, "videoExportThread is null");
        } else if (this.isFinishing) {
            Logger.m144649w(TAG, "already finished");
        } else {
            this.isFinishing = true;
            new Handler(this.videoExportThread.getLooper()).post(new Runnable() {
                public void run() {
                    if (AssetExportThread.this.videoExportThread != null) {
                        AssetExportThread.this.videoExportThread.quitSafely();
                        HandlerThread unused = AssetExportThread.this.videoExportThread = null;
                    }
                    if (AssetExportThread.this.audioExportThread != null) {
                        AssetExportThread.this.audioExportThread.quitSafely();
                        HandlerThread unused2 = AssetExportThread.this.audioExportThread = null;
                    }
                    if (AssetExportThread.this.assetReader != null) {
                        AssetExportThread.this.assetReader.cancelReading();
                        AssetReader unused3 = AssetExportThread.this.assetReader = null;
                    }
                    if (AssetExportThread.this.reportSession != null) {
                        long j = 0;
                        AssetExportThread.this.reportSession.setTotalRealDecodeUs((AssetExportThread.this.videoReader == null || AssetExportThread.this.videoReader.getDecodePerformance() == null) ? 0 : AssetExportThread.this.videoReader.getDecodePerformance().getTotal() * 1000);
                        ExportReportSession access$500 = AssetExportThread.this.reportSession;
                        if (!(AssetExportThread.this.assetWriter == null || AssetExportThread.this.assetWriter.getEncodePerformance() == null)) {
                            j = AssetExportThread.this.assetWriter.getEncodePerformance().getTotal() * 1000;
                        }
                        access$500.setTotalEncodeUs(j);
                    }
                    boolean z = false;
                    if (AssetExportThread.this.assetWriter != null) {
                        try {
                            AssetExportThread.this.assetWriter.finishWriting(AssetExportThread.this.cancel);
                            z = true;
                        } catch (Exception e) {
                            Logger.m144644e("AssetExportSession", "code = -10 run: finishWriting error", (Throwable) e);
                            AssetExportThread.this.exportError(-10, e);
                        }
                        AssetWriter unused4 = AssetExportThread.this.assetWriter = null;
                    }
                    if (AssetExportThread.this.videoWriter != null) {
                        AssetExportThread.this.videoWriter.close();
                    }
                    if (AssetExportThread.this.audioWriter != null) {
                        AssetExportThread.this.audioWriter.close();
                    }
                    if (AssetExportThread.this.audioTimeout) {
                        AssetExportThread.this.exportSession.status = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusTimeout;
                        AssetExportThread.this.exportSession.exportErrorStatus = new ExportErrorStatus(ExportErrorStatus.AUDIO_FRAME_HANDLE_TIMEOUT, (Throwable) null, "handle audio timeout");
                        if (AssetExportThread.this.callbackHandler != null) {
                            AssetExportThread.this.callbackHandler.handlerCallback(AssetExportThread.this.exportSession);
                        }
                    } else if (AssetExportThread.this.videoTimeout) {
                        AssetExportThread.this.exportSession.status = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusTimeout;
                        AssetExportThread.this.exportSession.exportErrorStatus = new ExportErrorStatus(-203, (Throwable) null, "handle video timeout");
                        if (AssetExportThread.this.callbackHandler != null) {
                            AssetExportThread.this.callbackHandler.handlerCallback(AssetExportThread.this.exportSession);
                        }
                    } else if (AssetExportThread.this.cancel && AssetExportThread.this.exportSession.status != AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed) {
                        AssetExportThread.this.exportSession.status = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled;
                        if (AssetExportThread.this.callbackHandler != null) {
                            AssetExportThread.this.callbackHandler.handlerCallback(AssetExportThread.this.exportSession);
                        }
                    } else if (AssetExportThread.this.videoWriterDone && AssetExportThread.this.audioWriterDone && z && !AssetExportThread.this.cancel) {
                        AssetExportThread.this.exportSuccess();
                    }
                    AssetExportThread.this.quitSafely();
                    if (AssetExportThread.this.exportSession != null) {
                        AssetExportThread.this.exportSession.release();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public long getDuration() {
        CMTimeRange cMTimeRange;
        AssetExportSession assetExportSession = this.exportSession;
        if (assetExportSession != null && (cMTimeRange = assetExportSession.timeRange) != null) {
            return cMTimeRange.getDuration().getTimeUs() * 2;
        }
        AssetReaderOutput assetReaderOutput = this.audioReader;
        long j = 0;
        long duration = assetReaderOutput != null ? assetReaderOutput.duration() : 0;
        AssetReaderOutput assetReaderOutput2 = this.videoReader;
        if (assetReaderOutput2 != null) {
            j = assetReaderOutput2.duration();
        }
        return duration + j;
    }

    private void initReaderAndWriter() {
        Matrix matrix;
        AssetReader assetReader2 = new AssetReader(this.exportSession.asset);
        this.assetReader = assetReader2;
        assetReader2.setTimeRange(this.exportSession.timeRange);
        this.videoReader = createVideoTrackOutput();
        this.audioReader = createAudioTrackOutput();
        if (this.assetReader.canAddOutput(this.videoReader)) {
            this.assetReader.addOutput(this.videoReader);
        }
        AssetReaderOutput assetReaderOutput = this.audioReader;
        if (!(assetReaderOutput instanceof EmptyReaderOutput) && this.assetReader.canAddOutput(assetReaderOutput)) {
            this.assetReader.addOutput(this.audioReader);
        }
        AssetExportSession assetExportSession = this.exportSession;
        AssetWriter assetWriter2 = new AssetWriter(assetExportSession.outputFilePath, assetExportSession.outputFileType);
        this.assetWriter = assetWriter2;
        assetWriter2.setRenderContextParams(this.renderContextParams);
        CMTimeRange cMTimeRange = this.exportSession.timeRange;
        if (cMTimeRange != null) {
            this.assetWriter.startSessionAtSourceTime(cMTimeRange.getStart());
            this.assetWriter.endSessionAtSourceTime(this.exportSession.timeRange.getEnd());
            ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.setFileDurationUs(this.exportSession.timeRange.getDurationUs());
            }
        }
        this.assetWriter.setEncodeOption(this.encodeOption);
        AssetWriterInput createVideoWriterInput = createVideoWriterInput();
        this.videoWriter = createVideoWriterInput;
        VideoComposition videoComposition = this.exportSession.videoComposition;
        if (videoComposition != null) {
            createVideoWriterInput.setEnableLut(videoComposition.getLutBitmap());
        }
        if (!(this.audioReader instanceof EmptyReaderOutput)) {
            this.audioWriter = createAudioWriterInput();
        }
        if (this.assetWriter.canAddInput(this.videoWriter)) {
            Matrix matrix2 = null;
            AssetExportSession assetExportSession2 = this.exportSession;
            if (assetExportSession2.calculateBfsTransform) {
                Matrix matrix3 = new Matrix();
                CGSize naturalSize = this.exportSession.asset.getNaturalSize();
                if (this.exportSession.appliesPreferredTrackTransform) {
                    Matrix matrix4 = new Matrix();
                    DecoderUtils.getMatrixAndCropRect(this.exportSession.asset.getNaturalSize(), this.exportSession.asset.getPreferRotation(), 1.0f, 0.0f, new Point(0, 0), matrix4);
                    if (this.exportSession.asset.getPreferRotation() == 1 || this.exportSession.asset.getPreferRotation() == 3) {
                        matrix3.setScale(((float) this.encodeOption.getRenderWidth()) / naturalSize.height, ((float) this.encodeOption.getRenderHeight()) / naturalSize.width);
                    } else {
                        matrix3.setScale(((float) this.encodeOption.getRenderWidth()) / naturalSize.width, ((float) this.encodeOption.getRenderHeight()) / naturalSize.height);
                    }
                    matrix = matrix4;
                } else {
                    matrix = new Matrix();
                    matrix3.setScale((((float) this.encodeOption.getRenderWidth()) * 1.0f) / ((float) this.encodeOption.getOutputWidth()), (((float) this.encodeOption.getRenderHeight()) * 1.0f) / ((float) this.encodeOption.getOutputHeight()));
                }
                matrix.postConcat(matrix3);
                matrix2 = matrix;
            } else if (assetExportSession2.appliesPreferredTrackTransform) {
                matrix2 = DecoderUtils.getPreferMatrix(new CGSize((float) this.encodeOption.getRenderWidth(), (float) this.encodeOption.getRenderHeight()), this.exportSession.asset.getNaturalSize(), this.exportSession.asset.getPreferRotation());
            }
            this.videoWriter.setTransform(matrix2);
            this.assetWriter.addInput(this.videoWriter);
        }
        AssetWriterInput assetWriterInput = this.audioWriter;
        if (assetWriterInput != null && this.assetWriter.canAddInput(assetWriterInput)) {
            this.assetWriter.addInput(this.audioWriter);
        }
        this.assetWriter.startWriting(this.mediaFactory);
        this.assetReader.startReading(this.assetWriter);
    }

    public synchronized void cancel() {
        this.cancel = true;
        ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.reset();
            this.reportSession = null;
        }
        Handler handler = this.exportHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                public void run() {
                    AssetExportThread.this.finish();
                }
            });
        }
    }

    public ExportReportSession getReportSession() {
        return this.reportSession;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if ((i == 1 || i == 2) && !this.isFinishing) {
            if (this.cancel) {
                finish();
            }
            if (this.videoWriterDone && this.audioWriterDone && this.audioReadFinish && this.videoReadFinish) {
                finish();
            }
        }
        return true;
    }

    public void setMediaFactory(IMediaFactory iMediaFactory) {
        this.mediaFactory = iMediaFactory;
    }

    public void setRenderContextParams(RenderContextParams renderContextParams2) {
        this.renderContextParams = renderContextParams2;
        AssetWriter assetWriter2 = this.assetWriter;
        if (assetWriter2 != null) {
            assetWriter2.setRenderContextParams(renderContextParams2);
        }
    }

    public void setTimeoutParameter(boolean z, boolean z2) {
        this.isNeedCheckFrameProcessTimeout = z;
        this.timeoutInterruptWork = z2;
        Logger.m144647i(TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b", Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void startExport() {
        start();
        this.cancel = false;
        ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.onExportStart(System.nanoTime());
        }
        Handler handler = new Handler(getLooper(), this);
        this.exportHandler = handler;
        handler.post(new Runnable() {
            public void run() {
                AssetExportThread.this.exporting();
            }
        });
    }

    /* access modifiers changed from: private */
    public void exportError(ExportErrorStatus exportErrorStatus) {
        AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = this.exportSession.status;
        AssetExportSession.AssetExportSessionStatus assetExportSessionStatus2 = AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed;
        if (assetExportSessionStatus != assetExportSessionStatus2) {
            this.cancel = true;
            AssetExportSession assetExportSession = this.exportSession;
            assetExportSession.status = assetExportSessionStatus2;
            assetExportSession.exportErrorStatus = exportErrorStatus;
            ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.onExportError();
            }
            AssetExportSession.ExportCallbackHandler exportCallbackHandler = this.callbackHandler;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.handlerCallback(this.exportSession);
            }
        }
    }
}
