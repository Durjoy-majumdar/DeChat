package com.tencent.tav.core.composition;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.Composition;
import com.tencent.tav.core.VideoCompositor;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import java.util.ArrayList;
import java.util.List;

public class MutableVideoComposition extends VideoComposition {
    private static final String TAG = "VideoComposition";
    private Asset asset;
    private Class<? extends VideoCompositing> customVideoCompositorClass;
    private CMTime frameDuration;
    private List<? extends VideoCompositionInstruction> instructions;
    private VideoComposition.RenderLayoutMode renderLayoutMode;
    private float renderScale;
    private CGSize renderSize;
    private int sourceTrackIDForFrameTiming;

    public MutableVideoComposition(Asset asset2) {
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
        this.renderScale = 1.0f;
    }

    public VideoCompositing getCustomVideoCompositor() {
        Class<? extends VideoCompositing> cls = this.customVideoCompositorClass;
        if (cls == null) {
            return new VideoCompositor();
        }
        try {
            return (VideoCompositing) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            return new VideoCompositor();
        }
    }

    public Class<? extends VideoCompositing> getCustomVideoCompositorClass() {
        return this.customVideoCompositorClass;
    }

    public CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public List<? extends VideoCompositionInstruction> getInstructions() {
        return this.instructions;
    }

    public VideoComposition.RenderLayoutMode getRenderLayoutMode() {
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

    public void setCustomVideoCompositorClass(Class<? extends VideoCompositing> cls) {
        this.customVideoCompositorClass = cls;
    }

    public void setFrameDuration(CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setInstructions(List<? extends VideoCompositionInstruction> list) {
        this.instructions = list;
    }

    public void setRenderLayoutMode(VideoComposition.RenderLayoutMode renderLayoutMode2) {
        this.renderLayoutMode = renderLayoutMode2;
    }

    public void setRenderScale(float f) {
        this.renderScale = f;
    }

    public void setRenderSize(CGSize cGSize) {
        this.renderSize = cGSize;
    }

    public void setSourceTrackIDForFrameTiming(int i) {
        this.sourceTrackIDForFrameTiming = i;
    }

    public String toString() {
        return "MutableVideoComposition{, frameDuration=" + this.frameDuration + ", renderSize=" + this.renderSize + ", renderLayoutMode=" + this.renderLayoutMode + ", instructions=" + this.instructions + '}';
    }

    public MutableVideoComposition() {
    }
}
