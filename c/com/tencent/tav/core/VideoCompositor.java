package com.tencent.tav.core;

import android.graphics.Matrix;
import com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest;
import com.tencent.tav.core.compositing.IVideoCompositionInstruction;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.compositing.VideoCompositionRenderContext;
import com.tencent.tav.core.composition.VideoCompositionLayerInstruction;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.coremedia.Transform;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.RenderContext;
import java.util.HashMap;

public class VideoCompositor implements VideoCompositing {
    private MultiTextureFilter filter;

    private boolean checkRequest(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        return (asynchronousVideoCompositionRequest.getRenderContext() == null || asynchronousVideoCompositionRequest.getSourceTrackIDs() == null || asynchronousVideoCompositionRequest.getSourceTrackIDs().isEmpty()) ? false : true;
    }

    private void drawInstructionBuffer(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, IVideoCompositionInstruction iVideoCompositionInstruction) {
        this.filter.clearBufferBuffer(iVideoCompositionInstruction.getBackgroundColor());
        for (VideoCompositionLayerInstruction videoCompositionLayerInstruction : iVideoCompositionInstruction.getLayerInstructions()) {
            CMSampleBuffer sourceFrameByTrackID = asynchronousVideoCompositionRequest.sourceFrameByTrackID(videoCompositionLayerInstruction.getTrackID());
            if (!(sourceFrameByTrackID == null || sourceFrameByTrackID.getTextureInfo() == null)) {
                CMTime compositionTime = asynchronousVideoCompositionRequest.getCompositionTime();
                Transform transformForTime = getTransformForTime(compositionTime, videoCompositionLayerInstruction.getTransformRampForTime(compositionTime));
                this.filter.applyFilter(sourceFrameByTrackID.getTextureInfo(), transformForTime == null ? null : transformForTime.toMatrix(), (Matrix) null, getOpacityForTime(compositionTime, videoCompositionLayerInstruction.getOpacityRampForTime(compositionTime)), getCropRectangleForTime(compositionTime, videoCompositionLayerInstruction.getCropRectangleRampForTime(compositionTime)));
            }
        }
    }

    private void drawSrcBuffer(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        this.filter.clearBufferBuffer(-16777216);
        for (Integer intValue : asynchronousVideoCompositionRequest.getSourceTrackIDs()) {
            CMSampleBuffer sourceFrameByTrackID = asynchronousVideoCompositionRequest.sourceFrameByTrackID(intValue.intValue());
            if (!(sourceFrameByTrackID == null || sourceFrameByTrackID.getTextureInfo() == null)) {
                TextureInfo textureInfo = sourceFrameByTrackID.getTextureInfo();
                Matrix matrix = new Matrix();
                DecoderUtils.getRotationMatrix(matrix, textureInfo.preferRotation, (float) textureInfo.width, (float) textureInfo.height);
                this.filter.applyFilter(sourceFrameByTrackID.getTextureInfo(), matrix, textureInfo.getTextureMatrix(), 1.0f, (CGRect) null);
            }
        }
    }

    private static CGRect getCropRectangleForTime(CMTime cMTime, VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp) {
        if (cropRectangleRamp.startCropRectangle == null || cropRectangleRamp.endCropRectangle == null || !cropRectangleRamp.timeRange.containsTime(cMTime)) {
            return null;
        }
        float timeUs = (((float) (cMTime.getTimeUs() - cropRectangleRamp.timeRange.getStartUs())) * 1.0f) / ((float) cropRectangleRamp.timeRange.getDurationUs());
        return new CGRect(interpolation(timeUs, cropRectangleRamp.startCropRectangle.origin.x, cropRectangleRamp.endCropRectangle.origin.x), interpolation(timeUs, cropRectangleRamp.startCropRectangle.origin.y, cropRectangleRamp.endCropRectangle.origin.y), interpolation(timeUs, cropRectangleRamp.startCropRectangle.size.width, cropRectangleRamp.endCropRectangle.size.width), interpolation(timeUs, cropRectangleRamp.startCropRectangle.size.height, cropRectangleRamp.endCropRectangle.size.height));
    }

    private static float getOpacityForTime(CMTime cMTime, VideoCompositionLayerInstruction.OpacityRamp opacityRamp) {
        if (!opacityRamp.timeRange.containsTime(cMTime)) {
            return 1.0f;
        }
        return interpolation((((float) (cMTime.getTimeUs() - opacityRamp.timeRange.getStartUs())) * 1.0f) / ((float) opacityRamp.timeRange.getDurationUs()), opacityRamp.startOpacity, opacityRamp.endOpacity);
    }

    private static Transform getTransformForTime(CMTime cMTime, VideoCompositionLayerInstruction.TransformRamp transformRamp) {
        if (!transformRamp.timeRange.containsTime(cMTime) || transformRamp.startTransform == null || transformRamp.endTransform == null) {
            return null;
        }
        float timeUs = (((float) (cMTime.getTimeUs() - transformRamp.timeRange.getStartUs())) * 1.0f) / ((float) transformRamp.timeRange.getDurationUs());
        return new Transform(interpolation(timeUs, transformRamp.startTransform.scaleX, transformRamp.endTransform.scaleX), interpolation(timeUs, transformRamp.startTransform.scaleY, transformRamp.endTransform.scaleY), interpolation(timeUs, transformRamp.startTransform.translateX, transformRamp.endTransform.translateX), interpolation(timeUs, transformRamp.startTransform.translateY, transformRamp.endTransform.translateY), interpolation(timeUs, transformRamp.startTransform.degrees, transformRamp.endTransform.degrees));
    }

    private void initFilter(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        if (this.filter == null) {
            CGSize size = asynchronousVideoCompositionRequest.getRenderContext().getSize();
            MultiTextureFilter multiTextureFilter = new MultiTextureFilter();
            this.filter = multiTextureFilter;
            multiTextureFilter.setRendererWidth((int) size.width);
            this.filter.setRendererHeight((int) size.height);
            this.filter.setRenderForScreen(false);
        }
    }

    private static float interpolation(float f, float f2, float f3) {
        return f2 == f3 ? f2 : ((f3 - f2) * f) + f2;
    }

    public void cancelAllPendingVideoCompositionRequests() {
    }

    public CMSampleBuffer finishComposedVideoFrame(RenderContext renderContext, CMSampleBuffer cMSampleBuffer) {
        return cMSampleBuffer;
    }

    public void release() {
        MultiTextureFilter multiTextureFilter = this.filter;
        if (multiTextureFilter != null) {
            multiTextureFilter.release();
            this.filter = null;
        }
    }

    public void renderContextChanged(VideoCompositionRenderContext videoCompositionRenderContext) {
    }

    public HashMap<String, Object> requiredPixelBufferAttributesForRenderContext() {
        return null;
    }

    public HashMap<String, Object> sourcePixelBufferAttributes() {
        return null;
    }

    public void startVideoCompositionRequest(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        if (checkRequest(asynchronousVideoCompositionRequest)) {
            initFilter(asynchronousVideoCompositionRequest);
            CMSampleBuffer cMSampleBuffer = new CMSampleBuffer(asynchronousVideoCompositionRequest.getCompositionTime(), asynchronousVideoCompositionRequest.getRenderContext().newTextureInfo(), false);
            if (cMSampleBuffer.getTextureInfo() != null) {
                this.filter.setDesTextureInfo(cMSampleBuffer.getTextureInfo());
                IVideoCompositionInstruction videoCompositionInstruction = asynchronousVideoCompositionRequest.getVideoCompositionInstruction();
                if (videoCompositionInstruction == null || videoCompositionInstruction.getLayerInstructions() == null || videoCompositionInstruction.getLayerInstructions().size() == 0) {
                    drawSrcBuffer(asynchronousVideoCompositionRequest);
                } else {
                    drawInstructionBuffer(asynchronousVideoCompositionRequest, videoCompositionInstruction);
                }
                asynchronousVideoCompositionRequest.finishWithComposedVideoFrame(finishComposedVideoFrame(asynchronousVideoCompositionRequest.getRenderContext().getRenderContext(), cMSampleBuffer));
            }
        }
    }
}
