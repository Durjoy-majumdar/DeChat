package com.tencent.liteav.videoproducer.producer;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.ScreenCapturer;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import com.tencent.liteav.videoproducer.preprocessor.VideoPreprocessor;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

@JNINamespace("liteav::video")
public class VideoProducerProxy {
    private final C17604f mProducer;

    public VideoProducerProxy(boolean z, IVideoReporter iVideoReporter) {
        this(ContextUtils.getApplicationContext(), z, iVideoReporter);
    }

    public static VideoEncoderDef.EncodeAbility getEncodeAbility() {
        return C17604f.m17859b();
    }

    public void ackRPSRecvFrameIndex(VideoProducerDef.StreamType streamType, int i, int i2) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17624v.m17911a(fVar, streamType, i, i2));
    }

    public void appendCustomCaptureFrame(PixelFrame pixelFrame) {
        C17604f fVar = this.mProducer;
        if (pixelFrame == null || !pixelFrame.isFrameDataValid()) {
            LiteavLog.m16905w(fVar.f47905a, "appendCustomCaptureFrame: frame is not valid.");
            return;
        }
        int width = pixelFrame.getWidth();
        int height = pixelFrame.getHeight();
        pixelFrame.retain();
        if (!fVar.mo20925a(C17576ad.m17774a(fVar, pixelFrame, width, height))) {
            pixelFrame.release();
        }
    }

    public BeautyProcessor getBeautyProcessor() {
        return this.mProducer.f47908d;
    }

    public VideoPreprocessor getVideoPreprocessor() {
        return this.mProducer.f47907c;
    }

    public void initialize() {
        C17604f fVar = this.mProducer;
        synchronized (fVar) {
            if (fVar.f47910f) {
                LiteavLog.m16905w(fVar.f47905a, "videoproducer already initialized.");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("videoProducer_" + fVar.hashCode());
            handlerThread.start();
            fVar.f47909e = new C17111b(handlerThread.getLooper());
            fVar.f47910f = true;
            fVar.f47909e.mo19361a(C17609g.m17896a(fVar));
        }
    }

    public void pauseCapture() {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17594av.m17792a(fVar));
    }

    public void requestKeyFrame(VideoProducerDef.StreamType streamType) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17625w.m17912a(fVar, streamType));
    }

    public void resumeCapture() {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17595aw.m17793a(fVar));
    }

    public int setCameraFocusPosition(int i, int i2) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17617o.m17904a(fVar, i, i2));
        return 0;
    }

    public void setCaptureParams(CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17592at.m17790a(fVar, sourceType, producerMode, captureParams));
    }

    public void setCustomRenderListener(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17578af.m17776a(fVar, pixelFormatType, pixelBufferType, videoRenderListener));
    }

    public void setCustomVideoProcessListener(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17580ah.m17778a(fVar, pixelFormatType, pixelBufferType, customVideoProcessListener));
    }

    public void setDisplayView(DisplayTarget displayTarget) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17610h.m17897a(fVar, displayTarget));
    }

    public void setEncodeMirrorEnabled(boolean z) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17614l.m17901a(fVar, z));
    }

    public void setEncodeParams(VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, GLConstants.Orientation orientation) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17621s.m17908a(fVar, streamType, orientation, videoEncodeParams));
    }

    public void setEncodeRotation(Rotation rotation) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17615m.m17902a(fVar, rotation));
    }

    public void setEncodeStrategy(VideoProducerDef.StreamType streamType, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17613k.m17900a(fVar, streamType, encodeStrategy));
    }

    public void setGSensorMode(VideoProducerDef.GSensorMode gSensorMode) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17618p.m17905a(fVar, gSensorMode));
    }

    public void setHWEncoderDeviceRelatedParams(String str) {
        C17604f fVar = this.mProducer;
        if (!TextUtils.isEmpty(str)) {
            fVar.mo20925a(C17616n.m17903a(fVar, str));
        }
    }

    public void setHomeOrientation(VideoProducerDef.HomeOrientation homeOrientation) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17619q.m17906a(fVar, homeOrientation));
    }

    public void setPausedImage(Bitmap bitmap, int i) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17593au.m17791a(fVar, bitmap, i));
    }

    public void setRPSIFrameFPS(VideoProducerDef.StreamType streamType, int i) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17622t.m17909a(fVar, i, streamType));
    }

    public void setRPSNearestREFSize(VideoProducerDef.StreamType streamType, int i) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17623u.m17910a(fVar, i, streamType));
    }

    public void setRenderMirrorMode(GLConstants.MirrorMode mirrorMode) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17626x.m17913a(fVar, mirrorMode));
    }

    public void setRenderRotation(Rotation rotation) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17628z.m17915a(fVar, rotation));
    }

    public void setRenderScaleType(GLConstants.GLScaleType gLScaleType) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17627y.m17914a(fVar, gLScaleType));
    }

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17575ac.m17773a(fVar, serverVideoProducerConfig));
    }

    public void setWatermark(Bitmap bitmap, float f, float f2, float f3) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17579ag.m17777a(fVar, bitmap, f, f2, f3));
    }

    public void startCapture(CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        C17604f fVar = this.mProducer;
        CaptureSourceInterface.SourceType sourceType2 = CaptureSourceInterface.SourceType.CAMERA;
        if (sourceType != sourceType2 && sourceType != CaptureSourceInterface.SourceType.SCREEN && sourceType != CaptureSourceInterface.SourceType.VIRTUAL_CAMERA) {
            throw new IllegalArgumentException("type: ".concat(String.valueOf(sourceType)));
        } else if (sourceType != sourceType2 || (captureParams instanceof CameraCaptureParams)) {
            if (sourceType == CaptureSourceInterface.SourceType.SCREEN) {
                if (!(captureParams instanceof ScreenCapturer.ScreenCaptureParams)) {
                    throw new IllegalArgumentException("CaptureParams is not ScreenCaptureParams");
                } else if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
                    fVar.f47906b.notifyError(C17263h.C17268a.ERR_VIDEO_CAPTURE_SCREEN_UNSUPPORTED, "not support screen capture", new Object[0]);
                }
            }
            if (sourceType != CaptureSourceInterface.SourceType.VIRTUAL_CAMERA || (captureParams instanceof VirtualCamera.VirtualCameraParams)) {
                fVar.mo20925a(C17586an.m17784a(fVar, sourceType, producerMode, captureParams));
                return;
            }
            throw new IllegalArgumentException("CaptureParams is not VirtualCameraParams");
        } else {
            throw new IllegalArgumentException("CaptureParams is not CameraCaptureParams");
        }
    }

    public void startCustomCapture() {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17574ab.m17772a(fVar));
    }

    public void startEncodeStream(VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17611i.m17898a(fVar, streamType, videoEncodeParams, videoEncoderDataListener));
    }

    public void stopCapture() {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17591as.m17789a(fVar));
    }

    public void stopCustomCapture() {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17577ae.m17775a(fVar));
    }

    public void stopEncodeStream(VideoProducerDef.StreamType streamType) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17612j.m17899a(fVar, streamType));
    }

    public void takeSnapshot(SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17573aa.m17771a(fVar, snapshotSourceType, takeSnapshotListener));
    }

    public void uninitialize() {
        C17604f fVar = this.mProducer;
        fVar.mo20925a(C17620r.m17907a(fVar));
    }

    public VideoProducerProxy(Context context, boolean z, IVideoReporter iVideoReporter) {
        this.mProducer = new C17604f(context, z, iVideoReporter);
    }
}
