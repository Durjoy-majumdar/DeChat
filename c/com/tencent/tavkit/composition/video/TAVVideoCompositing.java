package com.tencent.tavkit.composition.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest;
import com.tencent.tav.core.compositing.IVideoCompositionInstruction;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.compositing.VideoCompositionRenderContext;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.ErrorMsg;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.ciimage.CIContext;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.ciimage.ThreadLocalTextureCache;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import com.tencent.tavkit.composition.video.TAVAttachTimeRangeSourceEffect;
import com.tencent.tavkit.composition.video.TAVVideoEffect;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;
import com.tencent.tavkit.composition.video.TAVVideoTransition;
import com.tencent.tavkit.report.CompositingReportSession;
import com.tencent.tavkit.report.MemoryReportHelper;
import com.tencent.tavkit.utils.BenchUtil;
import java.util.HashMap;
import java.util.List;

public class TAVVideoCompositing implements VideoCompositing {
    private final String TAG = ("TAVVideoCompositing@" + Integer.toHexString(hashCode()));
    private CIContext ciContext;
    private final TAVVideoMixEffect.Filter defaultVideoMixFilter = new DefaultVideoMixFilter();
    private final HashMap<String, TAVVideoEffect.Filter> globalFilterMap = new HashMap<>();
    private final HashMap<String, TAVVideoMixEffect.Filter> mixFilterMap = new HashMap<>();
    private Thread renderThread;
    private CompositingReportSession reportSession;
    private final HashMap<String, TAVVideoEffect.Filter> sourceFilterMap = new HashMap<>();
    private final HashMap<String, TAVVideoTransition.Filter> transitionFilterMap = new HashMap<>();
    private boolean tryPostReleaseDone = false;

    private CIImage applyClipSourceEffect(RenderInfo renderInfo, CIImage cIImage, List<TAVVideoEffect> list) {
        if (list != null && !list.isEmpty()) {
            for (TAVVideoEffect next : list) {
                TAVVideoEffect.Filter sourceFilter = getSourceFilter(next);
                if (sourceFilter != null) {
                    cIImage = sourceFilter.apply(next, cIImage, renderInfo);
                }
            }
        }
        return cIImage;
    }

    private CIImage applyCompositionSourceEffect(RenderInfo renderInfo, CIImage cIImage, TAVVideoEffect tAVVideoEffect) {
        TAVVideoEffect.Filter sourceFilter = getSourceFilter(tAVVideoEffect);
        return sourceFilter == null ? cIImage : sourceFilter.apply(tAVVideoEffect, cIImage, renderInfo);
    }

    private void applySourceTransform(TAVVideoConfiguration tAVVideoConfiguration, CIImage cIImage, RenderInfo renderInfo) {
        String str = this.TAG;
        Logger.m144648v(str, "applySourceTransform() called with: config = [" + tAVVideoConfiguration + "]");
        if (tAVVideoConfiguration.frameEnable()) {
            cIImage.applyFillInFrame(tAVVideoConfiguration.getFrame(), tAVVideoConfiguration.getContentMode());
        } else if (tAVVideoConfiguration.getFrame() == TAVVideoConfiguration.FIX_RENDER_SIZE) {
            cIImage.applyFixInSize(renderInfo.getRenderSize(), tAVVideoConfiguration.getContentMode());
        }
        cIImage.safeApplyTransform(tAVVideoConfiguration.getTransform());
    }

    private CIImage compositingImages(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, TAVVideoCompositionInstruction tAVVideoCompositionInstruction) {
        if (this.ciContext == null) {
            return null;
        }
        for (TAVVideoEffect.Filter next : this.sourceFilterMap.values()) {
            if (next instanceof TAVAttachTimeRangeSourceEffect.TimeAttachFilter) {
                ((TAVAttachTimeRangeSourceEffect.TimeAttachFilter) next).attachPositionTime(asynchronousVideoCompositionRequest.getCompositionTime());
            }
        }
        RenderInfo renderInfo = new RenderInfo(asynchronousVideoCompositionRequest.getCompositionTime(), asynchronousVideoCompositionRequest.getRenderContext().getSize(), this.ciContext);
        ImageCollection convertToImageCollection = convertToImageCollection(asynchronousVideoCompositionRequest, renderInfo, tAVVideoCompositionInstruction);
        TAVVideoMixEffect.Filter videoMixFilter = getVideoMixFilter(tAVVideoCompositionInstruction, tAVVideoCompositionInstruction.getVideoMixEffect());
        CIImage apply = videoMixFilter != null ? videoMixFilter.apply(tAVVideoCompositionInstruction.getVideoMixEffect(), convertToImageCollection, renderInfo) : null;
        if (apply == null) {
            apply = this.defaultVideoMixFilter.apply((TAVVideoMixEffect) null, convertToImageCollection, renderInfo);
        }
        TAVVideoEffect.Filter globalFilter = getGlobalFilter(tAVVideoCompositionInstruction.getGlobalVideoEffect());
        return globalFilter != null ? globalFilter.apply(tAVVideoCompositionInstruction.getGlobalVideoEffect(), apply, renderInfo) : apply;
    }

    private CIImage convertLayerToImage(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, RenderInfo renderInfo, TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction, TAVVideoEffect tAVVideoEffect) {
        if (!tAVVideoCompositionLayerInstruction.getTimeRange().containsTime(renderInfo.getTime())) {
            return null;
        }
        CIImage sourceImageAtTime = tAVVideoCompositionLayerInstruction.getImageSource().sourceImageAtTime(renderInfo.getTime().sub(tAVVideoCompositionLayerInstruction.getTimeRange().getStart()), renderInfo.getRenderSize());
        if (sourceImageAtTime == null) {
            sourceImageAtTime = getImageWithRequest(asynchronousVideoCompositionRequest, tAVVideoCompositionLayerInstruction);
            String str = this.TAG;
            Logger.m144648v(str, "convertLayerToImage: begin sourceImage by request, sourceImage = " + sourceImageAtTime);
        }
        if (sourceImageAtTime == null) {
            Logger.m144649w(this.TAG, "convertLayerToImage: begin sourceImage by request, sourceImage is null ");
            return null;
        }
        renderInfo.addTrack(tAVVideoCompositionLayerInstruction.getImageSource());
        sourceImageAtTime.applyPreferRotation(tAVVideoCompositionLayerInstruction.getVideoConfiguration().getPreferRotation());
        applySourceTransform(tAVVideoCompositionLayerInstruction.getVideoConfiguration(), sourceImageAtTime, renderInfo);
        CIImage applyCompositionSourceEffect = applyCompositionSourceEffect(renderInfo, applyClipSourceEffect(renderInfo, sourceImageAtTime, tAVVideoCompositionLayerInstruction.getVideoConfiguration().getEffects()), tAVVideoEffect);
        String str2 = this.TAG;
        Logger.m144648v(str2, "convertLayerToImage: end, returned: " + applyCompositionSourceEffect);
        return applyCompositionSourceEffect;
    }

    private ImageCollection convertToImageCollection(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, RenderInfo renderInfo, TAVVideoCompositionInstruction tAVVideoCompositionInstruction) {
        ImageCollection imageCollection = new ImageCollection();
        for (List<TAVVideoCompositionLayerInstruction> it : tAVVideoCompositionInstruction.getChannelLayers()) {
            for (TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction : it) {
                CIImage convertLayerToImage = convertLayerToImage(asynchronousVideoCompositionRequest, renderInfo, tAVVideoCompositionLayerInstruction, tAVVideoCompositionInstruction.getSourceVideoEffect());
                if (convertLayerToImage != null && !convertLayerToImage.isCanvasImage()) {
                    imageCollection.addChannelImage(convertLayerToImage, tAVVideoCompositionLayerInstruction.getImageSource());
                }
            }
        }
        for (TAVVideoCompositionLayerInstruction next : tAVVideoCompositionInstruction.getOverlayLayers()) {
            CIImage convertLayerToImage2 = convertLayerToImage(asynchronousVideoCompositionRequest, renderInfo, next, tAVVideoCompositionInstruction.getSourceVideoEffect());
            if (convertLayerToImage2 != null && !convertLayerToImage2.isCanvasImage()) {
                imageCollection.addOverlayImage(convertLayerToImage2, next.getImageSource());
            }
        }
        String str = this.TAG;
        Logger.m144648v(str, "convertToImageCollection: result imageCollection = " + imageCollection);
        return imageCollection;
    }

    private TAVVideoEffect.Filter getGlobalFilter(TAVVideoEffect tAVVideoEffect) {
        if (tAVVideoEffect == null || TextUtils.isEmpty(tAVVideoEffect.effectId())) {
            return null;
        }
        String effectId = tAVVideoEffect.effectId();
        if (this.globalFilterMap.containsKey(effectId)) {
            return this.globalFilterMap.get(effectId);
        }
        TAVVideoEffect.Filter createFilter = tAVVideoEffect.createFilter();
        this.globalFilterMap.put(effectId, createFilter);
        return createFilter;
    }

    private CIImage getImageWithRequest(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction) {
        CMSampleBuffer sourceFrameByTrackID = asynchronousVideoCompositionRequest.sourceFrameByTrackID(tAVVideoCompositionLayerInstruction.getTrackID());
        if (sourceFrameByTrackID == null || sourceFrameByTrackID.getTextureInfo() == null) {
            return null;
        }
        return new CIImage(sourceFrameByTrackID.getTextureInfo());
    }

    private TAVVideoEffect.Filter getSourceFilter(TAVVideoEffect tAVVideoEffect) {
        if (tAVVideoEffect == null || TextUtils.isEmpty(tAVVideoEffect.effectId())) {
            return null;
        }
        String effectId = tAVVideoEffect.effectId();
        if (this.sourceFilterMap.containsKey(effectId)) {
            return this.sourceFilterMap.get(effectId);
        }
        TAVVideoEffect.Filter createFilter = tAVVideoEffect.createFilter();
        this.sourceFilterMap.put(effectId, createFilter);
        return createFilter;
    }

    private TAVVideoMixEffect.Filter getVideoMixFilter(TAVVideoCompositionInstruction tAVVideoCompositionInstruction, TAVVideoMixEffect tAVVideoMixEffect) {
        if (tAVVideoMixEffect == null || TextUtils.isEmpty(tAVVideoMixEffect.effectId())) {
            return null;
        }
        String effectId = tAVVideoMixEffect.effectId();
        if (this.mixFilterMap.containsKey(effectId)) {
            return this.mixFilterMap.get(effectId);
        }
        TAVVideoMixEffect.Filter createFilter = tAVVideoCompositionInstruction.getVideoMixEffect().createFilter();
        this.mixFilterMap.put(effectId, createFilter);
        return createFilter;
    }

    private void reportMemory() {
        if (!MemoryReportHelper.isInIntervalTime()) {
            String appendReportKey = MemoryReportHelper.appendReportKey(this.sourceFilterMap.values());
            String appendReportKey2 = MemoryReportHelper.appendReportKey(this.mixFilterMap.values());
            String appendReportKey3 = MemoryReportHelper.appendReportKey(this.globalFilterMap.values());
            MemoryReportHelper.getInstance().tick("sourceFilter:[" + appendReportKey + "], mixFilter:[" + appendReportKey2 + "], globalFilter:[" + appendReportKey3 + "]");
        }
    }

    private void tryPostReleaseToRenderThread() {
        if (!this.tryPostReleaseDone) {
            this.tryPostReleaseDone = true;
            if (this.renderThread instanceof HandlerThread) {
                new Handler(((HandlerThread) this.renderThread).getLooper()).post(new Runnable() {
                    public void run() {
                        TAVVideoCompositing.this.release();
                    }
                });
            }
        }
    }

    public void cancelAllPendingVideoCompositionRequests() {
    }

    public void release() {
        if (this.renderThread == null || Thread.currentThread().equals(this.renderThread)) {
            this.tryPostReleaseDone = false;
            String str = this.TAG;
            Logger.m144641d(str, "release: begin, currentThread = " + Thread.currentThread().getName());
            CIContext cIContext = this.ciContext;
            if (cIContext != null) {
                cIContext.release();
            }
            for (TAVVideoTransition.Filter release : this.transitionFilterMap.values()) {
                release.release();
            }
            for (TAVVideoEffect.Filter release2 : this.sourceFilterMap.values()) {
                release2.release();
            }
            for (TAVVideoMixEffect.Filter release3 : this.mixFilterMap.values()) {
                release3.release();
            }
            for (TAVVideoEffect.Filter release4 : this.globalFilterMap.values()) {
                release4.release();
            }
            this.transitionFilterMap.clear();
            this.sourceFilterMap.clear();
            this.mixFilterMap.clear();
            this.globalFilterMap.clear();
            ThreadLocalTextureCache.getInstance().release();
            CompositingReportSession compositingReportSession = this.reportSession;
            if (compositingReportSession != null) {
                compositingReportSession.flush();
                this.reportSession = null;
            }
            String str2 = this.TAG;
            Logger.m144641d(str2, "release: end, currentThread = " + Thread.currentThread().getName());
            return;
        }
        String str3 = this.TAG;
        Logger.m144643e(str3, "release: 当前线程非渲染线程！currentThread = " + Thread.currentThread().getName() + ", renderThread = " + this.renderThread.getName());
        tryPostReleaseToRenderThread();
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
        if (this.reportSession == null) {
            this.reportSession = new CompositingReportSession(asynchronousVideoCompositionRequest.getRenderContext().getSize().width, asynchronousVideoCompositionRequest.getRenderContext().getSize().height);
        }
        long nanoTime = System.nanoTime();
        String str = this.TAG;
        Logger.m144648v(str, "startVideoCompositionRequest: begin, currentThread = " + Thread.currentThread().getName() + ", request = [" + asynchronousVideoCompositionRequest + "]");
        if (this.ciContext == null) {
            this.ciContext = new CIContext(asynchronousVideoCompositionRequest.getRenderContext().getRenderContext());
        }
        if (this.renderThread == null) {
            this.renderThread = Thread.currentThread();
        }
        IVideoCompositionInstruction videoCompositionInstruction = asynchronousVideoCompositionRequest.getVideoCompositionInstruction();
        if (!(videoCompositionInstruction instanceof TAVVideoCompositionInstruction)) {
            Logger.m144643e(this.TAG, "startVideoCompositionRequest: end, instruction not instanceof TAVVideoCompositionInstruction");
            this.reportSession.tickFailed();
            asynchronousVideoCompositionRequest.finishWithError(new ErrorMsg(10086, "instruction not instanceof TAVVideoCompositionInstruction"));
            return;
        }
        BenchUtil.benchStart("compositingImages");
        CIImage compositingImages = compositingImages(asynchronousVideoCompositionRequest, (TAVVideoCompositionInstruction) videoCompositionInstruction);
        BenchUtil.benchEnd("compositingImages");
        BenchUtil.benchStart("renderToSampleBuffer");
        reportMemory();
        if (compositingImages != null) {
            CMSampleBuffer renderToSampleBuffer = this.ciContext.renderToSampleBuffer(compositingImages, asynchronousVideoCompositionRequest.getCompositionTime(), asynchronousVideoCompositionRequest.getRenderContext().getRenderContext());
            String str2 = this.TAG;
            Logger.m144648v(str2, "startVideoCompositionRequest: end, resultPixels = [" + renderToSampleBuffer + "]");
            this.reportSession.tickSuccess(System.nanoTime() - nanoTime);
            asynchronousVideoCompositionRequest.finishWithComposedVideoFrame(renderToSampleBuffer);
        } else {
            Logger.m144643e(this.TAG, "startVideoCompositionRequest: end, destImage is null ");
            this.reportSession.tickFailed();
            asynchronousVideoCompositionRequest.finishWithError(new ErrorMsg(10086, "destImage is null "));
        }
        BenchUtil.benchEnd("renderToSampleBuffer");
    }
}
