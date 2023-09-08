package com.tencent.liteav.videoproducer.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.C17125a;
import com.tencent.liteav.beauty.p305b.C104510o;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.p309a.C17188a;
import com.tencent.liteav.videobase.utils.C17241a;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17253a;
import com.tencent.liteav.videobase.videobase.C17257e;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

@JNINamespace("liteav::video")
public class VideoPreprocessor implements BeautyProcessor.C17533a {
    private static final String TAG = "VideoPreprocessor";
    private final C17241a mAverageCostCalculator;
    private final SparseArray<C17253a> mConvertParamsList = new SparseArray<>();
    private long mLastProcessTimestamp = 0;
    private final CyclicBarrier mLoadFrameCyclicBarrier = new CyclicBarrier(2);
    private float mLookupMixLevel = 0.5f;
    private final C17548h mPreprocessor;
    private long mTotalFrameCount = 0;
    private final IVideoReporter mVideoReporter;
    private C17111b mWorkHandler;

    public VideoPreprocessor(Context context, BeautyProcessor beautyProcessor, IVideoReporter iVideoReporter) {
        this.mPreprocessor = new C17548h(context, beautyProcessor, iVideoReporter);
        this.mVideoReporter = iVideoReporter;
        beautyProcessor.setBeautyManagerStatusListener(this);
        C17125a.m16947a(iVideoReporter);
        this.mAverageCostCalculator = new C17241a("preprocess", new C17562q(this));
    }

    public static /* synthetic */ void lambda$processFrame$2(VideoPreprocessor videoPreprocessor, PixelFrame pixelFrame, long j) {
        PixelFrame pixelFrame2;
        C17548h hVar = videoPreprocessor.mPreprocessor;
        pixelFrame.getGLContext();
        Object gLContext = pixelFrame.getGLContext();
        if (!CommonUtil.equals(hVar.f47677k, gLContext)) {
            hVar.f47677k = gLContext;
            hVar.mo20816a();
            LiteavLog.m16902i("GPUPreprocessor", "set unique eglcore: %s", gLContext);
        }
        try {
            if (hVar.f47676j == null) {
                Object gLContext2 = pixelFrame.getGLContext();
                LiteavLog.m16902i("GPUPreprocessor", "initialize internal, eglContextFromPixelFrame: %s", gLContext2);
                C104516e eVar = new C104516e();
                hVar.f47676j = eVar;
                eVar.mo147196a(gLContext2, (Surface) null, 128, 128);
                hVar.f47676j.mo147195a();
                C17223e eVar2 = new C17223e();
                hVar.f47679m = eVar2;
                hVar.f47681o.mo20259a(eVar2);
                hVar.f47671e.initialize(hVar.f47679m);
                hVar.mo20819b();
            }
            hVar.f47676j.mo147195a();
            hVar.f47670d.mo20220a();
            if (hVar.f47678l == null) {
                hVar.f47678l = new C17234j(hVar.f47674h, hVar.f47675i);
            }
            OpenGlUtils.glViewport(0, 0, hVar.f47674h, hVar.f47675i);
            if (pixelFrame.getHeight() == hVar.f47675i && pixelFrame.getWidth() == hVar.f47674h && pixelFrame.getRotation() == Rotation.NORMAL && !pixelFrame.isMirrorVertical() && !pixelFrame.isMirrorHorizontal() && pixelFrame.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_2D) {
                pixelFrame.retain();
                pixelFrame2 = pixelFrame;
            } else {
                C17222d a = hVar.f47679m.mo20199a(hVar.f47674h, hVar.f47675i);
                hVar.f47678l.mo20210a(pixelFrame, hVar.f47673g == CaptureSourceInterface.SourceType.SCREEN ? GLConstants.GLScaleType.FIT_CENTER : GLConstants.GLScaleType.CENTER_CROP, a);
                pixelFrame2 = a.mo20196a(hVar.f47676j.mo147198c());
                a.release();
            }
            hVar.f47672f.setTimestamp(pixelFrame.getTimestamp());
            C17222d a2 = hVar.f47679m.mo20199a(hVar.f47674h, hVar.f47675i);
            hVar.f47672f.onDraw(pixelFrame2.getTextureId(), a2, hVar.f47668b, hVar.f47669c);
            pixelFrame2.release();
            a2.release();
        } catch (C104518g e) {
            LiteavLog.m16899e("GPUPreprocessor", "initializeEGL failed.", (Throwable) e);
            hVar.f47676j = null;
        }
        videoPreprocessor.mVideoReporter.updateStatus(C17271i.STATUS_VIDEO_PREPROCESS_TIME, Long.valueOf(SystemClock.elapsedRealtime() - j));
        videoPreprocessor.reportProcessFrameRate();
        pixelFrame.release();
    }

    public static /* synthetic */ void lambda$registerVideoProcessedListener$3(VideoPreprocessor videoPreprocessor, int i, C17253a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, boolean z, C17541ag agVar) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        C17548h.C17553c cVar = new C17548h.C17553c(i, aVar, pixelBufferType, pixelFormatType, agVar);
        if (!z) {
            C17548h.m17735a(cVar, hVar.f47683q);
        } else {
            C17548h.m17735a(cVar, hVar.f47684r);
        }
        if (hVar.f47676j != null) {
            hVar.mo20820c();
        }
        LiteavLog.m16902i("GPUPreprocessor", "register listener, identity:%d, bufferType:%s, formatType:%s, withWatermark:%b, listener:%s", Integer.valueOf(i), pixelBufferType, pixelFormatType, Boolean.valueOf(z), agVar);
        videoPreprocessor.mConvertParamsList.put(i, aVar);
        videoPreprocessor.recalculateProcessSizeInternal();
    }

    public static /* synthetic */ void lambda$setFilterMixLevel$7(VideoPreprocessor videoPreprocessor, float f) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        hVar.f47670d.mo20221a(C17558m.m17749a(hVar, f));
    }

    public static /* synthetic */ void lambda$setGaussianBlurLevel$12(VideoPreprocessor videoPreprocessor, float f) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        hVar.f47670d.mo20221a(C17557l.m17748a(hVar, f / 4.0f));
    }

    public static /* synthetic */ void lambda$setGreenScreenFile$5(VideoPreprocessor videoPreprocessor, String str, boolean z) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        hVar.f47670d.mo20221a(C17560o.m17751a(hVar, str, z));
    }

    public static /* synthetic */ void lambda$setGreenScreenParam$6(VideoPreprocessor videoPreprocessor, GLConstants.GLScaleType gLScaleType, boolean z) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        hVar.f47670d.mo20221a(C17561p.m17752a(hVar, gLScaleType, z));
    }

    public static /* synthetic */ void lambda$setInterceptorBeforeWatermark$14(VideoPreprocessor videoPreprocessor, C17188a aVar) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        hVar.f47670d.mo20221a(C17554i.m17745a(hVar, aVar));
    }

    public static /* synthetic */ void lambda$setWatermark$10(VideoPreprocessor videoPreprocessor, Bitmap bitmap, float f, float f2, float f3) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        LiteavLog.m16897d("GPUPreprocessor", "setWatermark xOffsetRatio: %.2f, yOffsetRatio: %.2f, widthRatio: %.2f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        hVar.f47670d.mo20221a(C17555j.m17746a(hVar, bitmap, f, f2, f3));
    }

    public static /* synthetic */ void lambda$setWatermarkList$11(VideoPreprocessor videoPreprocessor, List list) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        hVar.f47670d.mo20221a(C17556k.m17747a(hVar, list));
    }

    public static /* synthetic */ void lambda$unregisterVideoProcessedListener$4(VideoPreprocessor videoPreprocessor, int i, C17541ag agVar) {
        C17548h hVar = videoPreprocessor.mPreprocessor;
        C17548h.C17553c a = C17548h.m17734a(i, agVar, hVar.f47683q);
        if (!(a == null && (a = C17548h.m17734a(i, agVar, hVar.f47684r)) == null)) {
            hVar.f47681o.mo20257a(i, (C17257e.C17258a) a);
            C17257e eVar = hVar.f47682p;
            if (eVar != null) {
                eVar.mo20257a(i, (C17257e.C17258a) a);
            }
            LiteavLog.m16902i("GPUPreprocessor", "unregister listener: identity: %d, listener: %s", Integer.valueOf(i), agVar);
        }
        videoPreprocessor.mConvertParamsList.remove(i);
        videoPreprocessor.recalculateProcessSizeInternal();
    }

    private void recalculateProcessSizeInternal() {
        if (this.mConvertParamsList.size() != 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.mConvertParamsList.size(); i3++) {
                C17253a valueAt = this.mConvertParamsList.valueAt(i3);
                Rotation rotation = valueAt.f46645c;
                boolean z = rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270;
                int i4 = z ? valueAt.f46644b : valueAt.f46643a;
                int i5 = z ? valueAt.f46643a : valueAt.f46644b;
                if (i * i5 != i2 * i4) {
                    LiteavLog.m16906w(TAG, "video preprocessor has different w/h ratio: %dx%d vs %dx%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5));
                }
                if (i4 * i5 > i * i2) {
                    i2 = i5;
                    i = i4;
                }
            }
            C17548h hVar = this.mPreprocessor;
            if (hVar.f47674h == i && hVar.f47675i == i2) {
                LiteavLog.m16896d("GPUPreprocessor", "process size is same as before");
                return;
            }
            hVar.f47674h = i;
            hVar.f47675i = i2;
            LiteavLog.m16902i("GPUPreprocessor", "process size update to %dx%d", Integer.valueOf(i), Integer.valueOf(i2));
            C17234j jVar = hVar.f47678l;
            if (jVar != null) {
                jVar.mo20209a();
                hVar.f47678l = null;
            }
            C17223e eVar = hVar.f47679m;
            if (eVar != null) {
                eVar.mo20184a();
            }
            hVar.f47672f.onOutputSizeChanged(i, i2);
        }
    }

    private void reportProcessFrameRate() {
        this.mTotalFrameCount++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.mLastProcessTimestamp;
        if (elapsedRealtime > 2000 + j) {
            this.mVideoReporter.updateStatus(C17271i.STATUS_VIDEO_PREPROCESS_FPS_IN, Double.valueOf((((double) this.mTotalFrameCount) * 1000.0d) / ((double) (elapsedRealtime - j))));
            this.mTotalFrameCount = 0;
            this.mLastProcessTimestamp = elapsedRealtime;
        }
    }

    public BeautyProcessor getBeautyProcessor() {
        return this.mPreprocessor.f47671e;
    }

    public void initialize() {
        LiteavLog.m16901i(TAG, "initialize");
        HandlerThread handlerThread = new HandlerThread("video-preprocessor");
        handlerThread.start();
        this.mWorkHandler = new C17111b(handlerThread.getLooper());
    }

    public void onBeautyStatsChanged(String str) {
        this.mVideoReporter.updateStatus(C17271i.STATUS_VIDEO_PREPROCESS_BEAUTY_SETTINGS, str);
    }

    public void postTaskToGlThread(Runnable runnable) {
        this.mWorkHandler.post(runnable);
    }

    public synchronized boolean processFrame(PixelFrame pixelFrame) {
        boolean post;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        pixelFrame.retain();
        post = this.mWorkHandler.post(C17571z.m17761a(this, pixelFrame, elapsedRealtime));
        if (!post) {
            pixelFrame.release();
        }
        return post;
    }

    public void registerVideoProcessedListener(int i, C17253a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, boolean z, C17541ag agVar) {
        if (pixelBufferType == GLConstants.PixelBufferType.TEXTURE_2D) {
            GLConstants.PixelFormatType pixelFormatType2 = GLConstants.PixelFormatType.I420;
        }
        this.mWorkHandler.post(C17535aa.m17721a(this, i, aVar, pixelBufferType, pixelFormatType, z, agVar));
    }

    public void runTaskInGlThreadAndWaitDone(Runnable runnable) {
        this.mWorkHandler.mo19361a(runnable);
    }

    public void setFilterGroupImages(float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        postTaskToGlThread(C17563r.m17753a(this, f, bitmap, f2, bitmap2, f3));
    }

    public void setFilterMixLevel(float f) {
        LiteavLog.m16901i(TAG, "setFilterMixLevel: ".concat(String.valueOf(f)));
        this.mLookupMixLevel = f;
        this.mWorkHandler.post(C17539ae.m17725a(this, f));
    }

    public void setGaussianBlurLevel(float f) {
        this.mWorkHandler.post(C17566u.m17756a(this, f));
    }

    public boolean setGreenScreenFile(String str, boolean z) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 18) {
            return false;
        }
        LiteavLog.m16901i(TAG, "setGreenScreenFile: path=" + str + ", isLoop=" + z);
        this.mWorkHandler.post(C17537ac.m17723a(this, str, z));
        return true;
    }

    public void setGreenScreenParam(GLConstants.GLScaleType gLScaleType, boolean z) {
        this.mWorkHandler.post(C17538ad.m17724a(this, gLScaleType, z));
    }

    public void setInterceptorBeforeWatermark(C17188a aVar) {
        this.mWorkHandler.post(C17569x.m17759a(this, aVar));
    }

    public void setLookupImage(Bitmap bitmap) {
        LiteavLog.m16901i(TAG, "setLookupImage: ".concat(String.valueOf(bitmap)));
        this.mWorkHandler.post(C17540af.m17726a(this, bitmap));
    }

    public void setSourceType(CaptureSourceInterface.SourceType sourceType) {
        this.mWorkHandler.post(C17570y.m17760a(this, sourceType));
    }

    public void setWatermark(Bitmap bitmap, float f, float f2, float f3) {
        this.mWorkHandler.post(C17564s.m17754a(this, bitmap, f, f2, f3));
    }

    public void setWatermarkList(List<C104510o> list) {
        this.mWorkHandler.post(C17565t.m17755a(this, list));
    }

    public void uninitialize() {
        LiteavLog.m16901i(TAG, "uninitialize");
        this.mAverageCostCalculator.mo20216a();
        C17111b bVar = this.mWorkHandler;
        if (bVar != null) {
            C17548h hVar = this.mPreprocessor;
            hVar.getClass();
            bVar.post(C17568w.m17758a(hVar));
            bVar.mo19360a();
        }
    }

    public void unregisterVideoProcessedListener(int i, C17541ag agVar) {
        this.mWorkHandler.post(C17536ab.m17722a(this, i, agVar));
    }

    public void updateHomeOrientation(int i) {
        this.mWorkHandler.post(C17567v.m17757a(this, i));
    }
}
