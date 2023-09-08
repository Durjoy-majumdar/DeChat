package com.tencent.tav.core;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.AverageTimeReporter;
import java.util.List;
import java.util.Map;

public class AssetReaderVideoCompositionOutput extends AssetReaderOutput {
    public static final String TAG = "AssetReaderVideoCompositionOutput";
    private AssetExtension assetExtension;
    private IContextCreate contextCreate;
    private VideoCompositing customVideoCompositor = new VideoCompositor();
    private IDecoderFactory decoderFactory;
    private boolean decoderStarted = false;
    private int frameRate = -1;
    private boolean readFirstFrame = false;
    private boolean revertMode = false;
    private VideoCompositing videoCompositing;
    private VideoComposition videoComposition;
    private IDecoderTrack videoDecoderTrack;
    private Map<String, Object> videoSettings;
    private List<AssetTrack> videoTracks;

    public AssetReaderVideoCompositionOutput(List<AssetTrack> list, Map<String, Object> map, AssetExtension assetExtension2, IDecoderFactory iDecoderFactory) {
        this.videoTracks = list;
        this.videoSettings = map;
        this.assetExtension = assetExtension2;
        this.mediaType = 1;
        if (map != null && map.containsKey("frame-rate")) {
            this.frameRate = ((Integer) map.get("frame-rate")).intValue();
        }
        this.decoderFactory = iDecoderFactory;
    }

    private void tryStartDecoder() {
        if (!this.decoderStarted) {
            this.decoderStarted = true;
            this.videoDecoderTrack.setFrameRate(this.frameRate);
            IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
            IContextCreate iContextCreate = this.contextCreate;
            iDecoderTrack.start(iContextCreate == null ? null : iContextCreate.renderContext());
            this.videoDecoderTrack.seekTo(this.timeRange.getStart(), false, true);
        }
    }

    public AverageTimeReporter getDecodePerformance() {
        IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
        if (iDecoderTrack != null) {
            return iDecoderTrack.getDecodePerformance();
        }
        return null;
    }

    public VideoCompositing getVideoCompositing() {
        return this.videoCompositing;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public Map<String, Object> getVideoSettings() {
        return this.videoSettings;
    }

    public List<AssetTrack> getVideoTracks() {
        return this.videoTracks;
    }

    public void markConfigurationAsFinal() {
    }

    public synchronized CMSampleBuffer nextSampleBuffer(boolean z) {
        CMSampleBuffer cMSampleBuffer;
        if (this.videoDecoderTrack != null) {
            tryStartDecoder();
            IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
            if (iDecoderTrack == null) {
                cMSampleBuffer = new CMSampleBuffer(CMSampleState.fromError(-100));
            } else if (this.readFirstFrame) {
                cMSampleBuffer = iDecoderTrack.readSample();
            } else {
                cMSampleBuffer = iDecoderTrack.readSample(this.timeRange.getStart());
                this.readFirstFrame = true;
            }
            if (cMSampleBuffer.getTime().smallThan(this.timeRange.getStart())) {
                return cMSampleBuffer;
            }
            if (cMSampleBuffer.getTime().smallThan(this.timeRange.getEnd())) {
                if (z) {
                    this.videoDecoderTrack.asyncReadNextSample(cMSampleBuffer.getTime());
                }
                CMSampleBuffer cMSampleBuffer2 = new CMSampleBuffer(cMSampleBuffer.getTime().sub(this.timeRange.getStart()), cMSampleBuffer.getTextureInfo(), cMSampleBuffer.isNewFrame());
                cMSampleBuffer2.getState().performance = cMSampleBuffer.getState().performance;
                return cMSampleBuffer2;
            }
            return new CMSampleBuffer(CMSampleState.fromError(-1));
        }
        return new CMSampleBuffer(CMSampleState.fromError(-100));
    }

    public synchronized void release() {
        IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
        if (iDecoderTrack != null) {
            iDecoderTrack.release();
        }
        VideoCompositing videoCompositing2 = this.videoCompositing;
        if (videoCompositing2 != null) {
            videoCompositing2.release();
            this.videoCompositing = null;
        }
    }

    public void reset(CMTimeRange cMTimeRange) {
        Logger.m144647i(TAG, "reset %s", cMTimeRange);
        this.timeRange = cMTimeRange;
        this.videoDecoderTrack.seekTo(cMTimeRange.getStart(), false, true);
    }

    public void resetForReadingTimeRanges(List<CMTimeRange> list) {
    }

    public void setVideoCompositing(VideoCompositing videoCompositing2) {
        this.videoCompositing = videoCompositing2;
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
    }

    public void setVideoRevertMode(boolean z) {
        this.revertMode = z;
    }

    public void start(IContextCreate iContextCreate, CMTimeRange cMTimeRange) {
        super.start(iContextCreate, cMTimeRange);
        VideoCompositionDecoderTrack videoCompositionDecoderTrack = new VideoCompositionDecoderTrack(this.assetExtension, 1, this.decoderFactory);
        int i = this.frameRate;
        for (AssetTrack next : this.videoTracks) {
            if (next != null && next.isEnabled()) {
                videoCompositionDecoderTrack.addTrack(next);
                if (next.getNominalFrameRate() > 0.0f && this.frameRate < 0) {
                    i = (int) Math.min(next.getNominalFrameRate(), (float) i);
                }
            }
        }
        if (i <= 0) {
            i = 30;
        }
        videoCompositionDecoderTrack.setVideoComposition(this.videoComposition);
        videoCompositionDecoderTrack.setVideoCompositing(this.videoCompositing);
        videoCompositionDecoderTrack.setFrameRate(i);
        videoCompositionDecoderTrack.setFrameDuration(new CMTime(1, i));
        this.contextCreate = iContextCreate;
        if (this.revertMode) {
            this.videoDecoderTrack = new CachedVideoDecoderTrack(videoCompositionDecoderTrack, true);
        } else {
            this.videoDecoderTrack = videoCompositionDecoderTrack;
        }
    }
}
