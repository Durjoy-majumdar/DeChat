package com.tencent.tav.core;

import android.opengl.GLES20;
import android.os.Trace;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.compositing.VideoCompositionRenderContext;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CMPerformance;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.DecoderTrackSegment;
import com.tencent.tav.decoder.IDecoder;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.VideoDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.AverageTimeReporter;
import java.util.ArrayList;
import java.util.List;

public class VideoCompositionDecoderTrack implements IDecoderTrack {
    private static final String TAG = "VideoComDecoderTrack";
    private static final int WAIT_TIME = 200;
    private AssetExtension assetExtension;
    private List<AssetTrack> assetTrackList;
    private boolean asynced;
    private final AverageTimeReporter decodeReporter;
    private IDecoderFactory decoderFactory;
    private List<IDecoderTrack> decoderTrackList;
    private CMTime frameDuration;
    private int frameRate;
    private CMSampleState lastSampleState;
    private VideoCompositionRenderContext renderContext;
    private int trackId;
    private VideoCompositing videoCompositing;
    private VideoComposition videoComposition;

    public VideoCompositionDecoderTrack(AssetExtension assetExtension2, int i) {
        this(assetExtension2, i, (IDecoderFactory) null);
    }

    private AsynchronousVideoCompositionRequest createVideoCompositionRequest(CMTime cMTime) {
        AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest = new AsynchronousVideoCompositionRequest(this, this.assetExtension);
        asynchronousVideoCompositionRequest.setRenderContext(this.renderContext);
        asynchronousVideoCompositionRequest.setCompositionTime(cMTime);
        VideoComposition videoComposition2 = this.videoComposition;
        if (videoComposition2 != null) {
            asynchronousVideoCompositionRequest.setVideoCompositionInstruction(VideoComposition.findInstruction(videoComposition2, cMTime));
        }
        return asynchronousVideoCompositionRequest;
    }

    private CMSampleBuffer getSampleFromRequest(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        synchronized (this) {
            if (asynchronousVideoCompositionRequest.getStatus() == Integer.MIN_VALUE) {
                waitForRequestFinish(200);
            }
        }
        if (asynchronousVideoCompositionRequest.getStatus() != 0) {
            this.lastSampleState = CMSampleState.fromError(-3);
            Logger.m144643e(TAG, "readSample: failed 1 " + this.lastSampleState);
            return new CMSampleBuffer(CMSampleState.fromError(-3));
        }
        this.lastSampleState = asynchronousVideoCompositionRequest.getComposedSampleBuffer().getState();
        return asynchronousVideoCompositionRequest.getComposedSampleBuffer();
    }

    private CMSampleBuffer readSampleToRequest(CMTime cMTime, AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        for (IDecoderTrack next : this.decoderTrackList) {
            CMSampleBuffer readSample = next.readSample(cMTime);
            if (readSample.getState().stateMatchingTo(-3, -2, -100)) {
                this.lastSampleState = new CMSampleState(readSample.getTime());
                Logger.m144643e(TAG, "readSample: failed 0 " + readSample.getTime());
                return new CMSampleBuffer(readSample.getState(), (TextureInfo) null);
            }
            if (!readSample.getState().stateMatchingTo(-1)) {
                asynchronousVideoCompositionRequest.appendCMSampleBuffer(readSample, next.getTrackId());
            } else if (this.decoderTrackList.size() <= 1) {
                Logger.m144641d(TAG, "readSample: finish 1");
                return readSample;
            }
        }
        return null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0008 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void waitForRequestFinish(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            long r0 = (long) r3
            r2.wait(r0)     // Catch:{ Exception -> 0x0008 }
            goto L_0x0008
        L_0x0006:
            r3 = move-exception
            goto L_0x000a
        L_0x0008:
            monitor-exit(r2)     // Catch:{ all -> 0x0006 }
            return
        L_0x000a:
            monitor-exit(r2)     // Catch:{ all -> 0x0006 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.VideoCompositionDecoderTrack.waitForRequestFinish(int):void");
    }

    public synchronized void addTrack(AssetTrack assetTrack) {
        this.assetTrackList.add(assetTrack);
    }

    public void asyncReadNextSample(CMTime cMTime) {
        if (this.asynced) {
            for (IDecoderTrack asyncReadNextSample : this.decoderTrackList) {
                asyncReadNextSample.asyncReadNextSample(cMTime);
            }
        }
    }

    public void clipRangeAndClearRange(CMTimeRange cMTimeRange) {
        for (IDecoderTrack clipRangeAndClearRange : this.decoderTrackList) {
            clipRangeAndClearRange.clipRangeAndClearRange(cMTimeRange);
        }
    }

    public CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    public AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    public CMTime getDuration() {
        CMTime cMTime = CMTime.CMTimeZero;
        for (IDecoderTrack duration : this.decoderTrackList) {
            CMTime duration2 = duration.getDuration();
            if (duration2.bigThan(cMTime)) {
                cMTime = duration2;
            }
        }
        return cMTime;
    }

    public CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public long getLaggingTime() {
        long j = 0;
        for (IDecoderTrack laggingTime : this.decoderTrackList) {
            j += laggingTime.getLaggingTime();
        }
        return j;
    }

    public VideoCompositionRenderContext getRenderContext() {
        return this.renderContext;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public VideoCompositing getVideoCompositing() {
        return this.videoCompositing;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public CMSampleBuffer readSample() {
        if (this.lastSampleState.stateMatchingTo(-100) || this.lastSampleState.isInvalid()) {
            return readSample(CMTime.CMTimeZero);
        }
        return readSample(this.lastSampleState.getTime().add(this.frameDuration));
    }

    public void release() {
        Logger.m144641d(TAG, "release:start " + this);
        for (IDecoderTrack next : this.decoderTrackList) {
            next.release();
            this.decodeReporter.add(next.getDecodePerformance());
        }
        this.decoderTrackList.clear();
        this.assetTrackList.clear();
        this.videoComposition = null;
        this.videoCompositing = null;
        this.renderContext = null;
        Logger.m144641d(TAG, "release:finish " + this);
    }

    public synchronized void removeTrack(AssetTrack assetTrack) {
        this.assetTrackList.remove(assetTrack);
    }

    public CMSampleBuffer seekTo(CMTime cMTime, boolean z, boolean z2) {
        Logger.m144641d(TAG, "seekTo:[timeUs " + cMTime + "] [needRead " + z + "] [quickSeek " + z2 + "]");
        if (!cMTime.equals(this.lastSampleState.getTime())) {
            for (IDecoderTrack seekTo : this.decoderTrackList) {
                seekTo.seekTo(cMTime, false, z2);
            }
        }
        if (cMTime.bigThan(this.frameDuration)) {
            this.lastSampleState = new CMSampleState(cMTime.sub(this.frameDuration));
        } else {
            this.lastSampleState = new CMSampleState(cMTime);
        }
        if (z) {
            return readSample();
        }
        return null;
    }

    public void setDecodeType(IDecoder.DecodeType decodeType) {
    }

    public void setFrameDuration(CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setFrameRate(int i) {
        this.frameRate = i;
        for (IDecoderTrack frameRate2 : this.decoderTrackList) {
            frameRate2.setFrameRate(i);
        }
    }

    public void setRenderContext(VideoCompositionRenderContext videoCompositionRenderContext) {
        this.renderContext = videoCompositionRenderContext;
    }

    public void setTrackSegments(List<DecoderTrackSegment> list) {
    }

    public void setVideoCompositing(VideoCompositing videoCompositing2) {
        this.videoCompositing = videoCompositing2;
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
    }

    public void setVolume(float f) {
    }

    public void start() {
        start((IDecoderTrack.SurfaceCreator) null);
    }

    public VideoCompositionDecoderTrack(AssetExtension assetExtension2, int i, IDecoderFactory iDecoderFactory) {
        this.decoderTrackList = new ArrayList();
        this.assetTrackList = new ArrayList();
        this.asynced = true;
        this.frameRate = 30;
        this.frameDuration = new CMTime(1, 30);
        this.lastSampleState = new CMSampleState();
        this.decodeReporter = new AverageTimeReporter();
        this.assetExtension = assetExtension2;
        this.trackId = i;
        this.decoderFactory = iDecoderFactory;
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, (CMTimeRange) null);
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator, CMTimeRange cMTimeRange) {
        CMTimeRange cMTimeRange2;
        Logger.m144641d(TAG, "start:[start] " + cMTimeRange + " size - " + this.assetTrackList.size());
        VideoCompositionRenderContext videoCompositionRenderContext = new VideoCompositionRenderContext((RenderContext) surfaceCreator);
        this.renderContext = videoCompositionRenderContext;
        videoCompositionRenderContext.setVideoComposition(this.videoComposition);
        for (AssetTrack next : this.assetTrackList) {
            if (next.getMediaType() == 1) {
                VideoDecoderTrack videoDecoderTrack = new VideoDecoderTrack(next, this.decoderFactory);
                this.decoderTrackList.add(videoDecoderTrack);
                if (cMTimeRange != null) {
                    videoDecoderTrack.start(surfaceCreator, cMTimeRange);
                } else {
                    CMTimeRange timeRange = next.getTimeRange();
                    if (timeRange == null) {
                        cMTimeRange2 = null;
                    } else {
                        cMTimeRange2 = new CMTimeRange(timeRange.getStart(), timeRange.getDuration());
                    }
                    videoDecoderTrack.start(surfaceCreator, cMTimeRange2);
                }
            }
        }
    }

    public CMSampleBuffer readSample(CMTime cMTime) {
        Logger.m144648v(TAG, "readSample:[targetTime " + cMTime + "]" + this.videoCompositing);
        if (this.videoCompositing == null) {
            this.lastSampleState = CMSampleState.fromError(-3);
            Logger.m144648v(TAG, "readSample: failed 2 " + this.lastSampleState);
            return new CMSampleBuffer(CMSampleState.fromError(-3));
        }
        if (cMTime.getValue() < 0) {
            cMTime = this.lastSampleState.getTime().add(this.frameDuration);
        }
        AsynchronousVideoCompositionRequest createVideoCompositionRequest = createVideoCompositionRequest(cMTime);
        Trace.beginSection("leex-decode");
        CMSampleBuffer readSampleToRequest = readSampleToRequest(cMTime, createVideoCompositionRequest);
        Trace.endSection();
        if (readSampleToRequest != null) {
            return readSampleToRequest;
        }
        if (createVideoCompositionRequest.getSourceTrackIDs().size() == 0) {
            Logger.m144648v(TAG, "readSample: finish 2");
            return new CMSampleBuffer(CMSampleState.fromError(-1));
        }
        Logger.m144648v(TAG, "readSample: startVideoCompositionRequest ");
        Trace.beginSection("leex-render");
        CMPerformance cMPerformance = new CMPerformance(CMPerformance.CMPerformanceStage.RENDER);
        cMPerformance.markStart();
        this.videoCompositing.startVideoCompositionRequest(createVideoCompositionRequest);
        Logger.m144648v(TAG, "readSample: startVideoCompositionRequest finish ");
        GLES20.glFlush();
        cMPerformance.markEnd();
        CMSampleBuffer sampleFromRequest = getSampleFromRequest(createVideoCompositionRequest);
        for (Integer intValue : createVideoCompositionRequest.getSourceTrackIDs()) {
            cMPerformance.preNodes.add(createVideoCompositionRequest.sourceFrameByTrackID(intValue.intValue()).getState().performance);
        }
        sampleFromRequest.getState().performance = cMPerformance;
        return sampleFromRequest;
    }
}
