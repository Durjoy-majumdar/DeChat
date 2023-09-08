package com.tencent.tav.core.compositing;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.RenderContext;

public class VideoCompositionRenderContext {
    public RectF edgeWidths;
    private RenderContext renderContext;
    private float renderScale;
    private Matrix renderTransform;
    private CGSize size;
    private VideoComposition videoComposition;
    private TextureInfo videoTexture;

    public VideoCompositionRenderContext(RenderContext renderContext2) {
        this.renderContext = renderContext2;
        this.size = new CGSize((float) renderContext2.width(), (float) renderContext2.height());
    }

    public RectF getEdgeWidths() {
        return this.edgeWidths;
    }

    public RenderContext getRenderContext() {
        return this.renderContext;
    }

    public float getRenderScale() {
        return this.renderScale;
    }

    public Matrix getRenderTransform() {
        return this.renderTransform;
    }

    public CGSize getSize() {
        return this.size;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public TextureInfo newTextureInfo() {
        if (this.videoTexture == null) {
            RenderContext.checkEglError("newSampleBuffer");
            int createTexture = RenderContext.createTexture(3553);
            CGSize cGSize = this.size;
            this.videoTexture = new TextureInfo(createTexture, 3553, (int) cGSize.width, (int) cGSize.height, 0);
        }
        return this.videoTexture;
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
    }

    public String toString() {
        return "VideoCompositionRenderContext{size=" + this.size + ", renderContext=" + this.renderContext + '}';
    }
}
