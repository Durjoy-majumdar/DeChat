package com.tencent.tav.core.composition;

import android.graphics.Bitmap;
import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.Composition;
import com.tencent.tav.core.VideoCompositor;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.Transform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoComposition {
    private static final String TAG = "VideoComposition";
    private Asset asset;
    private Class<? extends VideoCompositing> customVideoCompositorClass;
    private CMTime frameDuration;
    private List<? extends VideoCompositionInstruction> instructions;
    private Bitmap lutBitmap;
    private RenderLayoutMode renderLayoutMode;
    private float renderScale;
    private CGSize renderSize;
    private int sourceTrackIDForFrameTiming;

    public enum RenderLayoutMode {
        aspectFit,
        aspectFill
    }

    public VideoComposition(Asset asset2) {
        this.asset = asset2;
        this.instructions = new ArrayList();
        fillSourceProperty();
    }

    private void fillSourceProperty() {
        List<AssetTrack> tracksWithMediaType = this.asset.tracksWithMediaType(1);
        this.frameDuration = null;
        this.renderSize = null;
        if (tracksWithMediaType != null) {
            for (AssetTrack next : tracksWithMediaType) {
                CMTime cMTime = this.frameDuration;
                if (cMTime == null) {
                    this.frameDuration = new CMTime(1, (int) next.getNominalFrameRate());
                } else {
                    this.frameDuration = ((float) cMTime.timeScale) > next.getNominalFrameRate() ? this.frameDuration : new CMTime(1, (int) next.getNominalFrameRate());
                }
            }
        }
        CMTime cMTime2 = this.frameDuration;
        if (cMTime2 == null || cMTime2.timeScale == 0) {
            this.frameDuration = new CMTime(1, 30);
        }
        Asset asset2 = this.asset;
        if (asset2 instanceof Composition) {
            this.renderSize = asset2.getNaturalSize();
        } else if (tracksWithMediaType != null) {
            for (AssetTrack next2 : tracksWithMediaType) {
                if (this.renderSize == null) {
                    this.renderSize = next2.getNaturalSize();
                } else if (next2.getNaturalSize() != null) {
                    this.renderSize = new CGSize(Math.max(this.renderSize.width, next2.getNaturalSize().width), Math.max(this.renderSize.height, next2.getNaturalSize().height));
                }
            }
        }
        this.instructions = new ArrayList();
        if (tracksWithMediaType != null && !(this.asset instanceof Composition)) {
            for (AssetTrack next3 : tracksWithMediaType) {
                VideoCompositionInstruction videoCompositionInstruction = new VideoCompositionInstruction();
                videoCompositionInstruction.backgroundColor = -16777216;
                videoCompositionInstruction.enablePostProcessing = true;
                videoCompositionInstruction.passthroughTrackID = next3.getTrackID();
                videoCompositionInstruction.timeRange = new CMTimeRange(CMTime.CMTimeZero, next3.getDuration());
                videoCompositionInstruction.requiredSourceTrackIDs = Arrays.asList(new Integer[]{Integer.valueOf(next3.getTrackID())});
                MutableVideoCompositionLayerInstruction mutableVideoCompositionLayerInstruction = new MutableVideoCompositionLayerInstruction();
                mutableVideoCompositionLayerInstruction.setTrackID(next3.getTrackID());
                mutableVideoCompositionLayerInstruction.setTransformRampFromStartTransform((Transform) null, (Transform) null, videoCompositionInstruction.timeRange);
                mutableVideoCompositionLayerInstruction.setCropRectangleRampFromStartCropRectangle((CGRect) null, (CGRect) null, videoCompositionInstruction.timeRange);
                mutableVideoCompositionLayerInstruction.setOpacityRampFromStartOpacity(1.0f, 1.0f, videoCompositionInstruction.timeRange);
                videoCompositionInstruction.layerInstructions.add(mutableVideoCompositionLayerInstruction);
            }
        }
        this.renderScale = 1.0f;
    }

    public static VideoCompositionInstruction findInstruction(VideoComposition videoComposition, CMTime cMTime) {
        VideoCompositionInstruction videoCompositionInstruction = null;
        if (videoComposition.getInstructions() == null) {
            return null;
        }
        for (VideoCompositionInstruction videoCompositionInstruction2 : videoComposition.getInstructions()) {
            if (videoCompositionInstruction2.getTimeRange() != null && (videoCompositionInstruction == null || videoCompositionInstruction.getTimeRange().getEnd().smallThan(videoCompositionInstruction2.getTimeRange().getEnd()))) {
                videoCompositionInstruction = videoCompositionInstruction2;
            }
            CMTimeRange timeRange = videoCompositionInstruction2.getTimeRange();
            if (timeRange != null && timeRange.getStartUs() <= cMTime.getTimeUs() && timeRange.getEndUs() > cMTime.getTimeUs()) {
                return videoCompositionInstruction2;
            }
        }
        return videoCompositionInstruction;
    }

    public void enableLut(Bitmap bitmap) {
        this.lutBitmap = bitmap;
    }

    public VideoCompositing getCustomVideoCompositor() {
        Class<? extends VideoCompositing> cls = this.customVideoCompositorClass;
        if (cls == null) {
            return new VideoCompositor();
        }
        try {
            return (VideoCompositing) cls.newInstance();
        } catch (InstantiationException unused) {
            return new VideoCompositor();
        } catch (IllegalAccessException unused2) {
            return new VideoCompositor();
        }
    }

    public Class<? extends VideoCompositing> getCustomVideoCompositorClass() {
        return this.customVideoCompositorClass;
    }

    public CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public <T extends VideoCompositionInstruction> List<T> getInstructions() {
        return this.instructions;
    }

    public Bitmap getLutBitmap() {
        return this.lutBitmap;
    }

    public RenderLayoutMode getRenderLayoutMode() {
        return this.renderLayoutMode;
    }

    public float getRenderScale() {
        return this.renderScale;
    }

    public CGSize getRenderSize() {
        return this.renderSize;
    }

    public int getSourceTrackIDForFrameTiming() {
        return this.sourceTrackIDForFrameTiming;
    }

    public String toString() {
        return "MutableVideoComposition{, frameDuration=" + this.frameDuration + ", renderSize=" + this.renderSize + ", renderLayoutMode=" + this.renderLayoutMode + ", instructions=" + this.instructions + '}';
    }

    public VideoComposition() {
    }
}
