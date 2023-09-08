package com.tencent.tav.core;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.Filter;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public class AssetImageGenerator {
    /* access modifiers changed from: private */
    public final String TAG;
    private ApertureMode apertureMode;
    private boolean appliesPreferredTrackTransform;
    public Asset asset;
    public AssetExtension assetExtension;
    private final ImageGeneratorThread generatorThread;
    private long generatorThreadId;
    private CGSize maximumSize;
    private ByteBuffer outBitmapReaderBuffer;
    private String outSavePath;
    private OutputBitmapFactory outputBitmapFactory;
    private RenderContext renderContext;
    private RenderContextParams renderContextParams;
    private VideoCompositing videoCompositing;
    private VideoComposition videoComposition;
    private VideoCompositionDecoderTrack videoCompositionDecoderTrack;

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$1 */
    public static /* synthetic */ class C1069001 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.tav.core.AssetImageGenerator$ApertureMode[] r0 = com.tencent.tav.core.AssetImageGenerator.ApertureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode = r0
                com.tencent.tav.core.AssetImageGenerator$ApertureMode r1 = com.tencent.tav.core.AssetImageGenerator.ApertureMode.aspectFit     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tav.core.AssetImageGenerator$ApertureMode r1 = com.tencent.tav.core.AssetImageGenerator.ApertureMode.aspectFill     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.tav.core.AssetImageGenerator$ApertureMode r1 = com.tencent.tav.core.AssetImageGenerator.ApertureMode.scaleToFit     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.AssetImageGenerator.C1069001.<clinit>():void");
        }
    }

    public enum ApertureMode {
        aspectFit,
        aspectFill,
        scaleToFit
    }

    public enum AssetImageGeneratorResult {
        AssetImageGeneratorSucceeded,
        AssetImageGeneratorFailed,
        AssetImageGeneratorCancelled
    }

    public static class DefaultBitmapFactory implements OutputBitmapFactory {
        private DefaultBitmapFactory() {
        }

        public /* synthetic */ DefaultBitmapFactory(C1069001 r1) {
            this();
        }

        public Bitmap getOutputBitmap(int i, int i2) {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public interface ImageGeneratorListener {
        void onCompletion(CMTime cMTime, Bitmap bitmap, CMTime cMTime2, AssetImageGeneratorResult assetImageGeneratorResult);
    }

    public class ImageGeneratorThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_CREATE_RENDERCONTEXT = 3;
        private static final int MSG_GENERATOR_COVER = 1;
        private static final int MSG_RELEASE = 2;
        private ImageGeneratorListener generatorListener;
        private Handler handler;
        private List<CMTime> requestedTimes;

        public ImageGeneratorThread(String str) {
            super(str);
        }

        /* access modifiers changed from: private */
        public void generatorCover() {
            for (CMTime cMTime : this.requestedTimes) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = cMTime;
                this.handler.sendMessage(obtain);
            }
        }

        /* access modifiers changed from: private */
        public void initHandler() {
            this.handler = new Handler(getLooper(), this);
        }

        /* access modifiers changed from: private */
        public void release() {
            Message obtain = Message.obtain();
            obtain.what = 2;
            this.handler.sendMessage(obtain);
        }

        public boolean handleMessage(Message message) {
            Bitmap bitmap;
            int i = message.what;
            if (i == 1) {
                try {
                    bitmap = AssetImageGenerator.this.copyCGImageAtTimeAndActualTime((CMTime) message.obj, (CMTime) null);
                } catch (Exception e) {
                    Logger.m144644e(AssetImageGenerator.this.TAG, "copyCGImage", (Throwable) e);
                    bitmap = null;
                }
                ImageGeneratorListener imageGeneratorListener = this.generatorListener;
                if (imageGeneratorListener == null) {
                    return false;
                }
                imageGeneratorListener.onCompletion((CMTime) message.obj, bitmap, (CMTime) null, bitmap != null ? AssetImageGeneratorResult.AssetImageGeneratorSucceeded : AssetImageGeneratorResult.AssetImageGeneratorFailed);
                return false;
            } else if (i != 2) {
                return false;
            } else {
                this.handler.removeCallbacksAndMessages((Object) null);
                AssetImageGenerator.this.doRelease();
                quit();
                return false;
            }
        }

        public void onLooperPrepared() {
            super.onLooperPrepared();
        }

        public void setGeneratorListener(ImageGeneratorListener imageGeneratorListener) {
            this.generatorListener = imageGeneratorListener;
        }

        public void setRequestedTimes(List<CMTime> list) {
            this.requestedTimes = list;
        }
    }

    public interface OutputBitmapFactory {
        Bitmap getOutputBitmap(int i, int i2);
    }

    public AssetImageGenerator(Asset asset2) {
        this(asset2, new AssetExtension(AssetExtension.SCENE_THUMBNAIL));
    }

    private Bitmap bitmapFromFBO(RenderContext renderContext2, CMSampleBuffer cMSampleBuffer) {
        Matrix matrix;
        TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
        if (textureInfo == null) {
            return null;
        }
        Bitmap readBitmapFromTexture = readBitmapFromTexture(renderContext2, textureInfo);
        Matrix matrix2 = getMatrix(this.maximumSize, new CGSize((float) textureInfo.width, (float) textureInfo.height));
        Matrix matrix3 = new Matrix();
        matrix3.postScale(1.0f, -1.0f);
        matrix3.postTranslate(0.0f, (float) readBitmapFromTexture.getHeight());
        if (matrix2 != null) {
            matrix2.postConcat(matrix3);
            matrix = matrix2;
        } else {
            matrix = matrix3;
        }
        CGSize cGSize = this.maximumSize;
        if (cGSize == null) {
            cGSize = new CGSize((float) textureInfo.width, (float) textureInfo.height);
        }
        return Bitmap.createBitmap(readBitmapFromTexture, 0, 0, (int) cGSize.width, (int) cGSize.height, matrix, true);
    }

    private Bitmap doGenerator(CMTime cMTime) {
        RenderContext initRenderContext = initRenderContext();
        CMSampleBuffer cmSampleBuffer = getCmSampleBuffer(cMTime, initRenderContext);
        return !initRenderContext.isPBufferEnable() ? bitmapFromFBO(initRenderContext, cmSampleBuffer) : readBitmap(renderToMaximumSizeBox(initRenderContext, cmSampleBuffer));
    }

    /* access modifiers changed from: private */
    public void doRelease() {
        String str = this.TAG;
        Logger.m144641d(str, "doRelease: start, thread = " + Thread.currentThread().getName());
        VideoCompositionDecoderTrack videoCompositionDecoderTrack2 = this.videoCompositionDecoderTrack;
        if (videoCompositionDecoderTrack2 != null) {
            videoCompositionDecoderTrack2.release();
            this.videoCompositionDecoderTrack = null;
        }
        VideoCompositing videoCompositing2 = this.videoCompositing;
        if (videoCompositing2 != null) {
            videoCompositing2.release();
            this.videoCompositing = null;
        }
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null) {
            renderContext2.release();
            this.renderContext = null;
        }
        this.videoComposition = null;
        String str2 = this.TAG;
        Logger.m144641d(str2, "doRelease: end, thread = " + Thread.currentThread().getName());
    }

    private CMSampleBuffer getCmSampleBuffer(CMTime cMTime, RenderContext renderContext2) {
        if (this.videoCompositionDecoderTrack == null) {
            this.videoCompositionDecoderTrack = new VideoCompositionDecoderTrack(this.assetExtension, 1);
            for (AssetTrack assetTrack : this.asset.getTracks()) {
                if (assetTrack.getMediaType() == 1) {
                    this.videoCompositionDecoderTrack.addTrack(assetTrack);
                }
            }
            this.videoCompositionDecoderTrack.setVideoComposition(this.videoComposition);
            VideoComposition videoComposition2 = this.videoComposition;
            VideoCompositing customVideoCompositor = videoComposition2 == null ? null : videoComposition2.getCustomVideoCompositor();
            this.videoCompositing = customVideoCompositor;
            this.videoCompositionDecoderTrack.setVideoCompositing(customVideoCompositor);
            this.videoCompositionDecoderTrack.start(renderContext2);
        }
        this.videoCompositionDecoderTrack.seekTo(cMTime, false, true);
        return this.videoCompositionDecoderTrack.readSample(cMTime);
    }

    private Matrix getMatrix(CGSize cGSize, CGSize cGSize2) {
        if (cGSize == null || cGSize2 == null || this.apertureMode == null) {
            return null;
        }
        CGRect cGRect = new CGRect(new PointF(), cGSize2);
        CGRect cGRect2 = new CGRect(new PointF(), cGSize);
        int i = C1069001.$SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode[this.apertureMode.ordinal()];
        if (i == 1) {
            return CGMathFunctions.transformBySourceRectFit(cGRect, cGRect2);
        }
        if (i == 2) {
            return CGMathFunctions.transformBySourceRectFill(cGRect, cGRect2);
        }
        if (i != 3) {
            return null;
        }
        return CGMathFunctions.transformByScaleFitRect(cGRect, cGRect2);
    }

    private RenderContext initRenderContext() {
        this.generatorThreadId = Thread.currentThread().getId();
        if (this.renderContext == null) {
            CGSize cGSize = this.maximumSize;
            if (cGSize == null) {
                cGSize = this.asset.getNaturalSize();
            }
            RenderContext renderContext2 = new RenderContext((int) cGSize.width, (int) cGSize.height);
            this.renderContext = renderContext2;
            renderContext2.setParams(this.renderContextParams);
        }
        this.renderContext.makeCurrent();
        return this.renderContext;
    }

    private Bitmap readBitmap(CGSize cGSize) {
        if (this.outputBitmapFactory == null) {
            this.outputBitmapFactory = new DefaultBitmapFactory((C1069001) null);
        }
        Bitmap outputBitmap = this.outputBitmapFactory.getOutputBitmap((int) cGSize.width, (int) cGSize.height);
        if (outputBitmap.getConfig() == Bitmap.Config.ARGB_8888 || outputBitmap.getConfig() == Bitmap.Config.ARGB_4444) {
            int width = outputBitmap.getWidth() * outputBitmap.getHeight() * 4;
            ByteBuffer byteBuffer = this.outBitmapReaderBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < width) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(width);
                this.outBitmapReaderBuffer = allocateDirect;
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                this.outBitmapReaderBuffer.rewind();
                this.outBitmapReaderBuffer.clear();
            }
            GLES20.glReadPixels(0, 0, outputBitmap.getWidth(), outputBitmap.getHeight(), NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.outBitmapReaderBuffer);
            this.outBitmapReaderBuffer.rewind();
            outputBitmap.copyPixelsFromBuffer(this.outBitmapReaderBuffer);
            this.outBitmapReaderBuffer.clear();
            return outputBitmap;
        }
        Logger.m144643e(this.TAG, "readBitmap: bitmap 格式错误：暂时只支持ARGB_8888、ARGB_4444格式");
        return outputBitmap;
    }

    private Bitmap readBitmapFromTexture(RenderContext renderContext2, TextureInfo textureInfo) {
        renderContext2.makeCurrent();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureID, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(textureInfo.width * textureInfo.height * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        GLES20.glReadPixels(0, 0, textureInfo.width, textureInfo.height, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(textureInfo.width, textureInfo.height, Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }

    private CGSize renderToMaximumSizeBox(RenderContext renderContext2, CMSampleBuffer cMSampleBuffer) {
        TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
        CGSize cGSize = this.maximumSize;
        if (cGSize == null) {
            cGSize = new CGSize((float) textureInfo.width, (float) textureInfo.height);
        }
        if (textureInfo != null) {
            Filter filter = new Filter();
            filter.setRendererWidth((int) cGSize.width);
            filter.setRendererHeight((int) cGSize.height);
            Matrix matrix = getMatrix(this.maximumSize, new CGSize((float) textureInfo.width, (float) textureInfo.height));
            renderContext2.makeCurrent();
            Matrix matrix2 = new Matrix();
            matrix2.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            int[] iArr = new int[4];
            GLES20.glGetIntegerv(2978, iArr, 0);
            GLES20.glViewport(0, 0, (int) cGSize.width, (int) cGSize.height);
            filter.applyFilter(textureInfo, matrix, matrix2);
            filter.release();
            renderContext2.setPresentationTime(cMSampleBuffer.getTime().getTimeUs());
            renderContext2.swapBuffers();
            GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return cGSize;
    }

    public Bitmap copyCGImageAtTimeAndActualTime(CMTime cMTime, CMTime cMTime2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return doGenerator(cMTime);
        }
        throw new Exception("cannot process in the main thread");
    }

    public void generateCGImagesAsynchronouslyForTimes(List<CMTime> list, ImageGeneratorListener imageGeneratorListener) {
        this.generatorThread.setRequestedTimes(list);
        this.generatorThread.setGeneratorListener(imageGeneratorListener);
        this.generatorThread.generatorCover();
    }

    public AssetExtension getAssetExtension() {
        return this.assetExtension;
    }

    public RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public void release() {
        if (Thread.currentThread().getId() != this.generatorThreadId) {
            this.generatorThread.release();
            this.videoComposition = null;
            return;
        }
        doRelease();
        this.generatorThread.quit();
    }

    public void setApertureMode(ApertureMode apertureMode2) {
        this.apertureMode = apertureMode2;
    }

    public void setAppliesPreferredTrackTransform(boolean z) {
        this.appliesPreferredTrackTransform = z;
    }

    public void setMaximumSize(CGSize cGSize) {
        this.maximumSize = cGSize;
    }

    public void setOutSavePath(String str) {
        this.outSavePath = str;
    }

    public void setOutputBitmapFactory(OutputBitmapFactory outputBitmapFactory2) {
        this.outputBitmapFactory = outputBitmapFactory2;
    }

    public void setRenderContextParams(RenderContextParams renderContextParams2) {
        this.renderContextParams = renderContextParams2;
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null) {
            renderContext2.setParams(renderContextParams2);
        }
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
    }

    public AssetImageGenerator(Asset asset2, AssetExtension assetExtension2) {
        this.TAG = "AssetImageGenerator@" + Integer.toHexString(hashCode());
        this.generatorThreadId = -1;
        this.asset = asset2;
        this.assetExtension = assetExtension2;
        this.apertureMode = ApertureMode.aspectFit;
        ImageGeneratorThread imageGeneratorThread = new ImageGeneratorThread("image_generator");
        this.generatorThread = imageGeneratorThread;
        imageGeneratorThread.start();
        imageGeneratorThread.initHandler();
    }
}
