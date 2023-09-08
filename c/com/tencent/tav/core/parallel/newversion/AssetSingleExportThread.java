package com.tencent.tav.core.parallel.newversion;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.C0120a0;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.codec.IMediaFactory;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.AssetParallelSegmentStatus;
import com.tencent.tav.core.AssetReader;
import com.tencent.tav.core.AssetReaderAudioMixOutput;
import com.tencent.tav.core.AssetReaderOutput;
import com.tencent.tav.core.AssetReaderVideoCompositionOutput;
import com.tencent.tav.core.AssetWriter;
import com.tencent.tav.core.AssetWriterInput;
import com.tencent.tav.core.AudioMix;
import com.tencent.tav.core.EmptyReaderOutput;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.tav.report.ExportReportSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssetSingleExportThread extends HandlerThread implements Handler.Callback {
    public static final int FRAME_OPERATE_TIMEOUT = 20000;
    private static final int msg_done_a = 2;
    private static final int msg_done_v = 1;
    /* access modifiers changed from: private */
    public final String TAG = ("AssetExportThread-" + hashCode());
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
    public volatile boolean cancel = false;
    private final ExportConfig encodeOption;
    /* access modifiers changed from: private */
    public Handler exportHandler;
    /* access modifiers changed from: private */
    public AssetParallelExportSession exportSession;
    /* access modifiers changed from: private */
    public volatile boolean hasError = false;
    public PipelineIndicatorInfo indicatorInfo;
    private volatile boolean isFinishing;
    /* access modifiers changed from: private */
    public boolean isNeedCheckFrameProcessTimeout = true;
    private volatile boolean isReleased = false;
    /* access modifiers changed from: private */
    public long lastHandleAudioTimeStamp = SystemClock.uptimeMillis();
    /* access modifiers changed from: private */
    public long lastHandleVideoTimeStamp = SystemClock.uptimeMillis();
    private IMediaFactory mediaFactory;
    /* access modifiers changed from: private */
    public C0120a0<PipelineIndicatorInfo> observer;
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
            if (SystemClock.uptimeMillis() - AssetSingleExportThread.this.lastHandleAudioTimeStamp >= 20000) {
                Logger.m144646i(AssetSingleExportThread.this.TAG, "audioTimeout");
                boolean unused = AssetSingleExportThread.this.audioTimeout = true;
                AssetSingleExportThread.this.indicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusTimeout);
                AssetSingleExportThread.this.indicatorInfo.errorStatus = new ExportErrorStatus(ExportErrorStatus.AUDIO_FRAME_HANDLE_TIMEOUT, (Throwable) null, "handle audio timeout");
                if (AssetSingleExportThread.this.observer != null) {
                    AssetSingleExportThread.this.observer.onChanged(AssetSingleExportThread.this.indicatorInfo);
                    return;
                }
                return;
            }
            Logger.m144646i(AssetSingleExportThread.this.TAG, "Maybe app into background audio");
        }
    }

    public class AudioRequestMediaDataCallback implements Runnable {
        private AudioRequestMediaDataCallback() {
        }

        private void onAudioRequestMediaData() {
            while (true) {
                if (AssetSingleExportThread.this.audioWriterDone || AssetSingleExportThread.this.cancel || AssetSingleExportThread.this.audioWriter == null || AssetSingleExportThread.this.hasError) {
                    break;
                }
                long unused = AssetSingleExportThread.this.lastHandleAudioTimeStamp = SystemClock.uptimeMillis();
                if (AssetSingleExportThread.this.isNeedCheckFrameProcessTimeout) {
                    AssetSingleExportThread.this.exportHandler.removeCallbacks(AssetSingleExportThread.this.audioTimeoutCallback);
                    AssetSingleExportThread.this.exportHandler.postDelayed(AssetSingleExportThread.this.audioTimeoutCallback, 20000);
                }
                if (AssetSingleExportThread.this.audioReader != null && AssetSingleExportThread.this.audioWriter.isReadyForMoreMediaData()) {
                    AssetSingleExportThread.this.audioReader.duration();
                    CMSampleBuffer copyNextSampleBuffer = AssetSingleExportThread.this.audioReader.copyNextSampleBuffer(false);
                    CMSampleState state = copyNextSampleBuffer.getState();
                    if (state.getStateCode() >= 0) {
                        ExportErrorStatus appendSampleBuffer = AssetSingleExportThread.this.audioWriter.appendSampleBuffer(copyNextSampleBuffer, false);
                        if (appendSampleBuffer != null) {
                            AssetSingleExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (copyNextSampleBuffer.getTime().getTimeUs() >= AssetSingleExportThread.this.indicatorInfo.timeRange.getDuration().getTimeUs()) {
                            AssetSingleExportThread.this.audioWriter.markAsFinished();
                            break;
                        }
                    } else if (state.getStateCode() == -1) {
                        AssetSingleExportThread.this.audioWriter.markAsFinished();
                        break;
                    } else if (state.getStateCode() != -4) {
                        AssetSingleExportThread.this.exportError(new ExportErrorStatus(state));
                        break;
                    }
                }
            }
            AssetSingleExportThread assetSingleExportThread = AssetSingleExportThread.this;
            boolean unused2 = assetSingleExportThread.audioReadFinish = !assetSingleExportThread.cancel;
            AssetSingleExportThread.this.exportHandler.removeCallbacks(AssetSingleExportThread.this.audioTimeoutCallback);
            AssetSingleExportThread.this.exportHandler.sendEmptyMessage(2);
        }

        public void run() {
            try {
                onAudioRequestMediaData();
            } catch (Throwable th) {
                Logger.m144644e(AssetSingleExportThread.this.TAG, "AudioRequestMediaDateCallback run: ", th);
                AssetSingleExportThread.this.exportError(-15, th);
            }
        }
    }

    public class AudioWriterProgressListener implements AssetWriterInput.WriterProgressListener {
        private AudioWriterProgressListener() {
        }

        public void onError(ExportErrorStatus exportErrorStatus) {
            Logger.m144644e(AssetSingleExportThread.this.TAG, "AudioWriterProgressListener onError: ", exportErrorStatus.throwable);
            AssetSingleExportThread.this.exportError(exportErrorStatus);
        }

        public void onProgressChanged(AssetWriterInput assetWriterInput, long j) {
            Logger.m144641d("AssetExportSession", "onProgressChanged: audioWriter " + j + "  / " + AssetSingleExportThread.this.getDuration());
            if (j == -1) {
                AssetSingleExportThread assetSingleExportThread = AssetSingleExportThread.this;
                long unused = assetSingleExportThread.audioTime = assetSingleExportThread.indicatorInfo.timeRange.getDuration().getTimeUs();
                float unused2 = AssetSingleExportThread.this.audioProgress = 1.0f;
                boolean unused3 = AssetSingleExportThread.this.audioWriterDone = true;
                AssetSingleExportThread.this.exportHandler.sendEmptyMessage(2);
                return;
            }
            long unused4 = AssetSingleExportThread.this.audioTime = j;
            AssetSingleExportThread assetSingleExportThread2 = AssetSingleExportThread.this;
            CMTimeRange cMTimeRange = assetSingleExportThread2.indicatorInfo.timeRange;
            long timeUs = cMTimeRange != null ? cMTimeRange.getDuration().getTimeUs() : assetSingleExportThread2.audioReader != null ? AssetSingleExportThread.this.audioReader.duration() : 0;
            if (timeUs != 0) {
                AssetSingleExportThread assetSingleExportThread3 = AssetSingleExportThread.this;
                float unused5 = assetSingleExportThread3.audioProgress = (((float) assetSingleExportThread3.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                float unused6 = AssetSingleExportThread.this.audioProgress = 1.0f;
            }
            AssetSingleExportThread assetSingleExportThread4 = AssetSingleExportThread.this;
            assetSingleExportThread4.indicatorInfo.setProgress(assetSingleExportThread4.audioProgress);
            if (AssetSingleExportThread.this.observer != null) {
                AssetSingleExportThread.this.observer.onChanged(AssetSingleExportThread.this.indicatorInfo);
            }
            if (AssetSingleExportThread.this.audioTime >= AssetSingleExportThread.this.indicatorInfo.timeRange.getDuration().getTimeUs()) {
                AssetSingleExportThread assetSingleExportThread5 = AssetSingleExportThread.this;
                long unused7 = assetSingleExportThread5.audioTime = assetSingleExportThread5.indicatorInfo.timeRange.getDuration().getTimeUs();
                boolean unused8 = AssetSingleExportThread.this.audioWriterDone = true;
                AssetSingleExportThread.this.exportHandler.sendEmptyMessage(2);
            }
        }
    }

    public class VideoFrameOperateTimeoutCallback implements Runnable {
        private VideoFrameOperateTimeoutCallback() {
        }

        public void run() {
            if (SystemClock.uptimeMillis() - AssetSingleExportThread.this.lastHandleVideoTimeStamp < 20000) {
                return;
            }
            if (AssetSingleExportThread.this.timeoutInterruptWork) {
                boolean unused = AssetSingleExportThread.this.videoTimeout = true;
                Logger.m144646i(AssetSingleExportThread.this.TAG, "videoTimeout");
                AssetSingleExportThread.this.indicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusTimeout);
                AssetSingleExportThread.this.indicatorInfo.errorStatus = new ExportErrorStatus(-203, (Throwable) null, "handle video timeout");
                if (AssetSingleExportThread.this.observer != null) {
                    AssetSingleExportThread.this.observer.onChanged(AssetSingleExportThread.this.indicatorInfo);
                    return;
                }
                return;
            }
            AssetSingleExportThread.this.exportSession.processErrorStatus = new ExportErrorStatus(-203);
        }
    }

    public class VideoRequestMediaDataCallback implements Runnable {
        private long cost;
        private long frame;

        private VideoRequestMediaDataCallback() {
            this.frame = 1;
            this.cost = 0;
        }

        private void onRequestMediaData() {
            while (true) {
                if (AssetSingleExportThread.this.videoWriterDone || AssetSingleExportThread.this.cancel || AssetSingleExportThread.this.hasError) {
                    break;
                }
                long unused = AssetSingleExportThread.this.lastHandleVideoTimeStamp = SystemClock.uptimeMillis();
                if (AssetSingleExportThread.this.isNeedCheckFrameProcessTimeout) {
                    AssetSingleExportThread.this.exportHandler.removeCallbacks(AssetSingleExportThread.this.videoTimeoutCallback);
                    AssetSingleExportThread.this.exportHandler.postDelayed(AssetSingleExportThread.this.videoTimeoutCallback, 20000);
                }
                System.currentTimeMillis();
                if (AssetSingleExportThread.this.videoReader == null || !AssetSingleExportThread.this.videoWriter.isReadyForMoreMediaData()) {
                    Logger.m144646i(AssetSingleExportThread.this.TAG, "leex not ReadyForMoreMediaData");
                } else {
                    long nanoTime = System.nanoTime();
                    CMSampleBuffer copyNextSampleBuffer = AssetSingleExportThread.this.videoReader.copyNextSampleBuffer(false);
                    if (AssetSingleExportThread.this.reportSession != null) {
                        AssetSingleExportThread.this.reportSession.tickDecode(System.nanoTime() - nanoTime);
                    }
                    CMSampleState state = copyNextSampleBuffer.getState();
                    if (state.getStateCode() < 0) {
                        String access$1600 = AssetSingleExportThread.this.TAG;
                        Logger.m144646i(access$1600, "onRequestMediaData stateCode: " + state.getStateCode());
                    }
                    if (state.getStateCode() >= 0) {
                        ExportErrorStatus appendSampleBuffer = AssetSingleExportThread.this.videoWriter.appendSampleBuffer(copyNextSampleBuffer, true);
                        if (appendSampleBuffer != null) {
                            AssetSingleExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (AssetSingleExportThread.this.reportSession != null) {
                            AssetSingleExportThread.this.reportSession.tickExport(System.nanoTime() - nanoTime);
                        }
                    } else {
                        if (state.stateMatchingTo(-1)) {
                            AssetSingleExportThread.this.videoWriter.markAsFinished();
                            Logger.m144646i(AssetSingleExportThread.this.TAG, "markAsFinished");
                            break;
                        } else if (state.getStateCode() != -4) {
                            AssetSingleExportThread.this.exportError(new ExportErrorStatus(state));
                            break;
                        }
                    }
                }
            }
            if (AssetSingleExportThread.this.videoWriter.matrixFilter != null) {
                AssetSingleExportThread.this.videoWriter.matrixFilter.release();
            }
            if (AssetSingleExportThread.this.exportSession.videoCompositing != null) {
                AssetSingleExportThread.this.exportSession.videoCompositing.release();
            }
            AssetSingleExportThread assetSingleExportThread = AssetSingleExportThread.this;
            boolean unused2 = assetSingleExportThread.videoReadFinish = !assetSingleExportThread.cancel;
            AssetSingleExportThread.this.exportHandler.removeCallbacks(AssetSingleExportThread.this.videoTimeoutCallback);
            AssetSingleExportThread.this.exportHandler.sendEmptyMessage(1);
        }

        public void run() {
            try {
                onRequestMediaData();
            } catch (Throwable th) {
                Logger.m144644e(AssetSingleExportThread.this.TAG, "VideoRequestMediaDateCallback run: ", th);
                AssetSingleExportThread.this.exportError(-14, th);
            }
        }
    }

    public class VideoWriterProgressListener implements AssetWriterInput.WriterProgressListener {
        private VideoWriterProgressListener() {
        }

        public void onError(ExportErrorStatus exportErrorStatus) {
            Logger.m144644e(AssetSingleExportThread.this.TAG, "VideoWriterProgressListener onError: ", exportErrorStatus.throwable);
            AssetSingleExportThread.this.exportError(exportErrorStatus);
        }

        public void onProgressChanged(AssetWriterInput assetWriterInput, long j) {
            String access$1600 = AssetSingleExportThread.this.TAG;
            Logger.m144641d(access$1600, "onProgressChanged: videoWriter " + j + "  / " + AssetSingleExportThread.this.getDuration());
            if (j == -1) {
                AssetSingleExportThread assetSingleExportThread = AssetSingleExportThread.this;
                long unused = assetSingleExportThread.videoTime = assetSingleExportThread.indicatorInfo.timeRange.getDuration().getTimeUs();
                float unused2 = AssetSingleExportThread.this.videoProgress = 1.0f;
                boolean unused3 = AssetSingleExportThread.this.videoWriterDone = true;
                AssetSingleExportThread.this.exportHandler.sendEmptyMessage(1);
                return;
            }
            long unused4 = AssetSingleExportThread.this.videoTime = j;
            AssetSingleExportThread assetSingleExportThread2 = AssetSingleExportThread.this;
            CMTimeRange cMTimeRange = assetSingleExportThread2.indicatorInfo.timeRange;
            long timeUs = cMTimeRange != null ? cMTimeRange.getDuration().getTimeUs() : assetSingleExportThread2.videoReader != null ? AssetSingleExportThread.this.videoReader.duration() : 0;
            if (timeUs != 0) {
                AssetSingleExportThread assetSingleExportThread3 = AssetSingleExportThread.this;
                float unused5 = assetSingleExportThread3.videoProgress = (((float) assetSingleExportThread3.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                float unused6 = AssetSingleExportThread.this.videoProgress = 1.0f;
            }
            AssetSingleExportThread assetSingleExportThread4 = AssetSingleExportThread.this;
            assetSingleExportThread4.indicatorInfo.setProgress(assetSingleExportThread4.videoProgress);
            if (AssetSingleExportThread.this.observer != null) {
                AssetSingleExportThread.this.observer.onChanged(AssetSingleExportThread.this.indicatorInfo);
            }
        }
    }

    public AssetSingleExportThread(PipelineIndicatorInfo pipelineIndicatorInfo, AssetParallelExportSession assetParallelExportSession, AudioMix audioMix2, ExportConfig exportConfig) {
        super("ExportThread");
        this.indicatorInfo = pipelineIndicatorInfo;
        this.audioMix = audioMix2;
        this.exportSession = assetParallelExportSession;
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
        assetReaderVideoCompositionOutput.setVideoCompositing(this.exportSession.newVideoCompositing());
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
    private synchronized void exportSuccess() {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0031 }
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r0 = r3.indicatorInfo     // Catch:{ all -> 0x002e }
            com.tencent.tav.core.AssetParallelSegmentStatus r0 = r0.getSegmentStatus()     // Catch:{ all -> 0x002e }
            com.tencent.tav.core.AssetParallelSegmentStatus r1 = com.tencent.tav.core.AssetParallelSegmentStatus.AssetExportStatusCompleted     // Catch:{ all -> 0x002e }
            if (r0 != r1) goto L_0x000f
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x000f:
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r0 = r3.indicatorInfo     // Catch:{ all -> 0x002e }
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setProgress(r2)     // Catch:{ all -> 0x002e }
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r0 = r3.indicatorInfo     // Catch:{ all -> 0x002e }
            r0.setSegmentStatus(r1)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            com.tencent.tav.report.ExportReportSession r0 = r3.reportSession     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0023
            r0.onExportSuccess()     // Catch:{ all -> 0x0031 }
        L_0x0023:
            androidx.lifecycle.a0<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> r0 = r3.observer     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002c
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r1 = r3.indicatorInfo     // Catch:{ all -> 0x0031 }
            r0.onChanged(r1)     // Catch:{ all -> 0x0031 }
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.exportSuccess():void");
    }

    /* access modifiers changed from: private */
    public void exporting() {
        initReaderAndWriter();
        this.indicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusStarted);
        if (this.videoWriter != null) {
            this.videoExportThread = new HandlerThread("VideoWriter");
            this.videoWriter.setWriterProgressListener(new VideoWriterProgressListener());
            this.videoWriter.requestMediaDataWhenReadyOnQueue(this.videoExportThread, new VideoRequestMediaDataCallback());
        } else {
            this.videoReadFinish = true;
            this.videoWriterDone = true;
        }
        if (this.audioWriter != null) {
            this.audioExportThread = new HandlerThread("AudioWriter");
            this.audioWriter.setWriterProgressListener(new AudioWriterProgressListener());
            this.audioWriter.requestMediaDataWhenReadyOnQueue(this.audioExportThread, new AudioRequestMediaDataCallback());
        } else {
            this.audioReadFinish = true;
            this.audioWriterDone = true;
        }
        Logger.m144647i(this.TAG, "[%d]exporting", Integer.valueOf(hashCode()));
    }

    /* access modifiers changed from: private */
    public long getDuration() {
        CMTimeRange cMTimeRange;
        PipelineIndicatorInfo pipelineIndicatorInfo = this.indicatorInfo;
        if (pipelineIndicatorInfo != null && (cMTimeRange = pipelineIndicatorInfo.timeRange) != null) {
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
        AssetReader assetReader2 = new AssetReader(this.exportSession.asset);
        this.assetReader = assetReader2;
        assetReader2.setTimeRange(this.indicatorInfo.timeRange);
        AssetParallelExportSession assetParallelExportSession = this.exportSession;
        AssetWriter assetWriter2 = new AssetWriter(assetParallelExportSession.outputFilePath, assetParallelExportSession.outputFileType);
        this.assetWriter = assetWriter2;
        assetWriter2.setRenderContextParams(this.renderContextParams);
        CMTimeRange cMTimeRange = this.indicatorInfo.timeRange;
        if (cMTimeRange != null) {
            this.assetWriter.startSessionAtSourceTime(cMTimeRange.getStart());
            this.assetWriter.endSessionAtSourceTime(this.indicatorInfo.timeRange.getEnd());
            ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.setFileDurationUs(this.indicatorInfo.timeRange.getDurationUs());
            }
        }
        this.assetWriter.setEncodeOption(this.encodeOption);
        int i = this.indicatorInfo.type;
        if (i == 1) {
            AssetReaderOutput createVideoTrackOutput = createVideoTrackOutput();
            this.videoReader = createVideoTrackOutput;
            if (this.assetReader.canAddOutput(createVideoTrackOutput)) {
                this.assetReader.addOutput(this.videoReader);
            }
            AssetWriterInput createVideoWriterInput = createVideoWriterInput();
            this.videoWriter = createVideoWriterInput;
            VideoComposition videoComposition = this.exportSession.videoComposition;
            if (videoComposition != null) {
                createVideoWriterInput.setEnableLut(videoComposition.getLutBitmap());
            }
            if (this.assetWriter.canAddInput(this.videoWriter)) {
                Matrix matrix = null;
                if (this.exportSession.appliesPreferredTrackTransform) {
                    matrix = DecoderUtils.getPreferMatrix(new CGSize((float) this.encodeOption.getOutputWidth(), (float) this.encodeOption.getOutputHeight()), this.exportSession.asset.getNaturalSize(), this.exportSession.asset.getPreferRotation());
                }
                this.videoWriter.setTransform(matrix);
                this.assetWriter.addInput(this.videoWriter);
            }
        } else if (i == 2) {
            AssetReaderOutput createAudioTrackOutput = createAudioTrackOutput();
            this.audioReader = createAudioTrackOutput;
            if (!(createAudioTrackOutput instanceof EmptyReaderOutput) && this.assetReader.canAddOutput(createAudioTrackOutput)) {
                this.assetReader.addOutput(this.audioReader);
            }
            if (!(this.audioReader instanceof EmptyReaderOutput)) {
                this.audioWriter = createAudioWriterInput();
            }
            AssetWriterInput assetWriterInput = this.audioWriter;
            if (assetWriterInput != null && this.assetWriter.canAddInput(assetWriterInput)) {
                this.assetWriter.addInput(this.audioWriter);
            }
        }
        this.assetWriter.startWriting(this.mediaFactory);
        this.assetWriter.prepareParallelSegmentInfo(this.indicatorInfo);
        this.assetWriter.prepareParallelSegmentInfo(this.indicatorInfo);
        this.assetReader.startReading(this.assetWriter);
    }

    private void releaseAudio(final Runnable runnable) {
        if (this.audioExportThread == null) {
            Logger.m144649w(this.TAG, "releaseAudio is null");
            return;
        }
        Logger.m144646i(this.TAG, "releaseAudio");
        new Handler(this.audioExportThread.getLooper()).post(new Runnable() {
            public void run() {
                if (AssetSingleExportThread.this.assetReader != null) {
                    AssetSingleExportThread.this.assetReader.cancelReading();
                    AssetReader unused = AssetSingleExportThread.this.assetReader = null;
                }
                if (AssetSingleExportThread.this.reportSession != null) {
                    long j = 0;
                    AssetSingleExportThread.this.reportSession.setTotalRealDecodeUs((AssetSingleExportThread.this.videoReader == null || AssetSingleExportThread.this.videoReader.getDecodePerformance() == null) ? 0 : AssetSingleExportThread.this.videoReader.getDecodePerformance().getTotal() * 1000);
                    ExportReportSession access$300 = AssetSingleExportThread.this.reportSession;
                    if (!(AssetSingleExportThread.this.assetWriter == null || AssetSingleExportThread.this.assetWriter.getEncodePerformance() == null)) {
                        j = AssetSingleExportThread.this.assetWriter.getEncodePerformance().getTotal() * 1000;
                    }
                    access$300.setTotalEncodeUs(j);
                }
                if (AssetSingleExportThread.this.assetWriter != null) {
                    try {
                        AssetSingleExportThread.this.assetWriter.finishWriting();
                    } catch (Exception e) {
                        Logger.m144644e("AssetExportSession", "code = -10 run: finishWriting error", (Throwable) e);
                        AssetSingleExportThread.this.exportError(-10, e);
                    }
                }
                if (AssetSingleExportThread.this.audioWriter != null) {
                    AssetSingleExportThread.this.audioWriter.close();
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                if (AssetSingleExportThread.this.audioExportThread != null) {
                    AssetSingleExportThread.this.audioExportThread.quitSafely();
                    HandlerThread unused2 = AssetSingleExportThread.this.audioExportThread = null;
                }
            }
        });
    }

    private void releaseVideo(final Runnable runnable) {
        if (this.videoExportThread == null) {
            Logger.m144649w(this.TAG, "videoExportThread is null");
            return;
        }
        Logger.m144646i(this.TAG, "releaseVideo");
        new Handler(this.videoExportThread.getLooper()).post(new Runnable() {
            public void run() {
                if (AssetSingleExportThread.this.assetReader != null) {
                    AssetSingleExportThread.this.assetReader.cancelReading();
                    AssetReader unused = AssetSingleExportThread.this.assetReader = null;
                }
                if (AssetSingleExportThread.this.reportSession != null) {
                    long j = 0;
                    AssetSingleExportThread.this.reportSession.setTotalRealDecodeUs((AssetSingleExportThread.this.videoReader == null || AssetSingleExportThread.this.videoReader.getDecodePerformance() == null) ? 0 : AssetSingleExportThread.this.videoReader.getDecodePerformance().getTotal() * 1000);
                    ExportReportSession access$300 = AssetSingleExportThread.this.reportSession;
                    if (!(AssetSingleExportThread.this.assetWriter == null || AssetSingleExportThread.this.assetWriter.getEncodePerformance() == null)) {
                        j = AssetSingleExportThread.this.assetWriter.getEncodePerformance().getTotal() * 1000;
                    }
                    access$300.setTotalEncodeUs(j);
                }
                if (AssetSingleExportThread.this.assetWriter != null) {
                    try {
                        AssetSingleExportThread.this.assetWriter.finishWriting();
                    } catch (Exception e) {
                        Logger.m144644e("AssetExportSession", "code = -10 run: finishWriting error", (Throwable) e);
                        AssetSingleExportThread.this.exportError(-10, e);
                    }
                }
                if (AssetSingleExportThread.this.videoWriter != null) {
                    AssetSingleExportThread.this.videoWriter.close();
                }
                if ((AssetSingleExportThread.this.videoReader instanceof AssetReaderVideoCompositionOutput) && ((AssetReaderVideoCompositionOutput) AssetSingleExportThread.this.videoReader).getVideoCompositing() != null) {
                    ((AssetReaderVideoCompositionOutput) AssetSingleExportThread.this.videoReader).getVideoCompositing().release();
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                if (AssetSingleExportThread.this.videoExportThread != null) {
                    AssetSingleExportThread.this.videoExportThread.quitSafely();
                    HandlerThread unused2 = AssetSingleExportThread.this.videoExportThread = null;
                }
            }
        });
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
                    AssetSingleExportThread.this.release((Runnable) null);
                }
            });
        }
    }

    public void clearResource() {
        if (getMuxer() != null) {
            getMuxer().clearResource();
        }
    }

    public IMediaMuxer getMuxer() {
        AssetWriter assetWriter2 = this.assetWriter;
        if (assetWriter2 == null || assetWriter2.encoderWriter() == null) {
            return null;
        }
        return this.assetWriter.encoderWriter().getMuxer();
    }

    public ExportReportSession getReportSession() {
        return this.reportSession;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1 || i == 2) {
            Logger.m144647i(this.TAG, "handleMessage:%d", Integer.valueOf(i));
            if (!this.isFinishing) {
                if (this.cancel) {
                    Logger.m144646i(this.TAG, "setSegmentStatus AssetParallelStatusCancelled");
                    this.isFinishing = true;
                    this.indicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetParallelStatusCancelled);
                    C0120a0<PipelineIndicatorInfo> a0Var = this.observer;
                    if (a0Var != null) {
                        a0Var.onChanged(this.indicatorInfo);
                    }
                    return true;
                } else if (this.videoWriterDone && this.audioWriterDone && this.audioReadFinish && this.videoReadFinish) {
                    Logger.m144646i(this.TAG, "setSegmentStatus AssetExportStatusCompleted");
                    this.isFinishing = true;
                    this.indicatorInfo.setSegmentStatus(AssetParallelSegmentStatus.AssetExportStatusCompleted);
                    C0120a0<PipelineIndicatorInfo> a0Var2 = this.observer;
                    if (a0Var2 != null) {
                        a0Var2.onChanged(this.indicatorInfo);
                    }
                }
            }
        }
        return true;
    }

    public void observe(C0120a0<PipelineIndicatorInfo> a0Var) {
        this.observer = a0Var;
    }

    public void release(Runnable runnable) {
        Logger.m144646i(this.TAG, "finish");
        if (this.isReleased) {
            Logger.m144649w(this.TAG, "already release");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.isReleased = true;
        releaseVideo(runnable);
        releaseAudio(runnable);
        quitSafely();
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
        Logger.m144647i(this.TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b", Boolean.valueOf(z), Boolean.valueOf(z2));
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
                AssetSingleExportThread.this.exporting();
            }
        });
    }

    /* access modifiers changed from: private */
    public void exportError(ExportErrorStatus exportErrorStatus) {
        Logger.m144647i(this.TAG, "exportError:%s", exportErrorStatus.toString());
        AssetParallelSegmentStatus segmentStatus = this.indicatorInfo.getSegmentStatus();
        AssetParallelSegmentStatus assetParallelSegmentStatus = AssetParallelSegmentStatus.AssetParallelStatusFailed;
        if (segmentStatus != assetParallelSegmentStatus) {
            this.hasError = true;
            this.indicatorInfo.setSegmentStatus(assetParallelSegmentStatus);
            this.indicatorInfo.errorStatus = exportErrorStatus;
            ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.onExportError();
            }
            C0120a0<PipelineIndicatorInfo> a0Var = this.observer;
            if (a0Var != null) {
                a0Var.onChanged(this.indicatorInfo);
            }
        }
    }
}
