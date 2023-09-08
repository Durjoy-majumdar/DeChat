package com.tencent.liteav.videoproducer.encoder;

import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.C17205a;
import com.tencent.liteav.videobase.common.C17206b;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.C17251j;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C17253a;
import com.tencent.liteav.videobase.videobase.C17257e;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.encoder.C17501bf;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
public class SoftwareVideoEncoder implements C17257e.C17258a, C17501bf {
    private C104516e mEGLCore;
    private VideoEncodeParams mEncodeParams;
    private C17257e mFrameConverter;
    private C17223e mGLTexturePool;
    private C17501bf.C17502a mListener;
    private long mNativeEncodeWrapper = 0;
    private C17234j mPixelFrameRenderer;
    private final IVideoReporter mReporter;
    private final C17251j mSnapshotTaker;
    private final String mTAG;

    public SoftwareVideoEncoder(IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
        this.mReporter = iVideoReporter;
        this.mSnapshotTaker = new C17251j("softenc" + hashCode());
        this.mTAG = "SoftwareVideoEncoder_" + streamType + "_" + hashCode();
    }

    private static EncodedVideoFrame createEncodedVideoFrameCallFromNative(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, int i4, int i5, long j4, long j5, long j6) {
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.nalType = C17205a.m17048a(i);
        encodedVideoFrame.profileType = C17206b.m17049a(i2);
        encodedVideoFrame.data = byteBuffer;
        encodedVideoFrame.dts = j;
        encodedVideoFrame.pts = j2;
        encodedVideoFrame.rotation = i3;
        encodedVideoFrame.frameIndex = j4;
        encodedVideoFrame.gopFrameIndex = 0;
        encodedVideoFrame.gopIndex = j5;
        encodedVideoFrame.refFrameIndex = j6;
        encodedVideoFrame.nativePtr = j3;
        encodedVideoFrame.width = i4;
        encodedVideoFrame.height = i5;
        return encodedVideoFrame;
    }

    private boolean initOpenGLComponents(Object obj) {
        if (this.mEncodeParams == null) {
            return false;
        }
        C104516e eVar = new C104516e();
        this.mEGLCore = eVar;
        try {
            eVar.mo147196a(obj, (Surface) null, 128, 128);
            this.mPixelFrameRenderer = new C17234j(this.mEncodeParams.getWidth(), this.mEncodeParams.getHeight());
            C17223e eVar2 = new C17223e();
            this.mGLTexturePool = eVar2;
            this.mSnapshotTaker.mo20231a(eVar2);
            this.mSnapshotTaker.mo20229a(this.mEncodeParams.getWidth(), this.mEncodeParams.getHeight());
            C17257e eVar3 = new C17257e();
            this.mFrameConverter = eVar3;
            eVar3.mo20259a(this.mGLTexturePool);
            this.mFrameConverter.mo20260a(new C17253a(this.mEncodeParams.getWidth(), this.mEncodeParams.getHeight()), GLConstants.PixelBufferType.BYTE_ARRAY, GLConstants.PixelFormatType.I420, 0, this);
            return true;
        } catch (C104518g e) {
            this.mEGLCore = null;
            LiteavLog.m16899e(this.mTAG, "initializeEGL failed.", (Throwable) e);
            return false;
        }
    }

    private static native long nativeCreate(SoftwareVideoEncoder softwareVideoEncoder);

    private static native void nativeDestroy(long j);

    private static native int nativeEncodeFrame(long j, byte[] bArr, int i, int i2, long j2);

    private static native void nativeRestartIDR(long j);

    private static native void nativeSetBitrate(long j, int i);

    private static native void nativeSetFps(long j, int i);

    private static native int nativeSetNearestRPS(long j, int i);

    private static native int nativeSetRPSRefBitmap(long j, int i, int i2);

    private static native void nativeSetRpsIdrFps(long j, int i);

    private static native int nativeStart(long j, VideoEncodeParams videoEncodeParams);

    private static native int nativeStop(long j);

    private void onEncodedError(int i) {
        C17501bf.C17502a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo20697a(String.valueOf(i));
        }
    }

    private void onEncodedNAL(EncodedVideoFrame encodedVideoFrame) {
        C17501bf.C17502a aVar = this.mListener;
        if (aVar != null) {
            aVar.onEncodedNAL(encodedVideoFrame, false);
        }
    }

    private void onRpsFrameRateChanged(boolean z, int i) {
        C17501bf.C17502a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo20699a(z, i);
        }
    }

    private void uninitializeOpenGLComponents() {
        if (this.mEGLCore != null) {
            LiteavLog.m16901i(this.mTAG, "uninitializeOpenGLComponents");
            try {
                this.mEGLCore.mo147195a();
                this.mFrameConverter.mo20257a(0, (C17257e.C17258a) this);
                this.mFrameConverter.mo20256a();
                this.mSnapshotTaker.mo20228a();
                C17234j jVar = this.mPixelFrameRenderer;
                if (jVar != null) {
                    jVar.mo20209a();
                    this.mPixelFrameRenderer = null;
                }
                C17223e eVar = this.mGLTexturePool;
                if (eVar != null) {
                    eVar.mo20184a();
                    this.mGLTexturePool.mo20187b();
                    this.mGLTexturePool = null;
                }
            } catch (C104518g e) {
                LiteavLog.m16899e(this.mTAG, "makeCurrent failed.", (Throwable) e);
            }
            C104516e.m139822a(this.mEGLCore);
            this.mEGLCore = null;
        }
    }

    public void ackRPSRecvFrameIndex(int i, int i2) {
        nativeSetRPSRefBitmap(this.mNativeEncodeWrapper, i, i2);
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            if (this.mEGLCore != null || initOpenGLComponents(pixelFrame.getGLContext())) {
                try {
                    this.mEGLCore.mo147195a();
                    C17222d a = this.mGLTexturePool.mo20199a(this.mEncodeParams.getWidth(), this.mEncodeParams.getHeight());
                    OpenGlUtils.glViewport(0, 0, a.mo20197b(), a.mo20198c());
                    this.mSnapshotTaker.mo20230a(pixelFrame);
                    this.mPixelFrameRenderer.mo20210a(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, a);
                    this.mFrameConverter.mo20258a(pixelFrame.getTimestamp(), a);
                    a.release();
                } catch (C104518g e) {
                    LiteavLog.m16899e(this.mTAG, "makeCurrent failed.", (Throwable) e);
                }
            }
        }
    }

    public VideoEncodeParams getEncodeParams() {
        return new VideoEncodeParams(this.mEncodeParams);
    }

    public VideoEncoderDef.C17464a getEncoderType() {
        return VideoEncoderDef.C17464a.SOFTWARE;
    }

    public void initialize() {
        this.mNativeEncodeWrapper = nativeCreate(this);
        String str = this.mTAG;
        LiteavLog.m16901i(str, "initialize " + this.mNativeEncodeWrapper);
    }

    public void onFrameConverted(int i, PixelFrame pixelFrame) {
        if (pixelFrame.getPixelFormatType() == GLConstants.PixelFormatType.I420 || pixelFrame.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_2D) {
            long j = this.mNativeEncodeWrapper;
            if (j != 0) {
                nativeEncodeFrame(j, pixelFrame.getData(), pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getTimestamp());
                return;
            }
            return;
        }
        LiteavLog.m16901i(this.mTAG, "pixelFrame pixelFormat not I420 ");
    }

    public void restartIDRFrame() {
        LiteavLog.m16901i(this.mTAG, "restartIDRFrame");
        nativeRestartIDR(this.mNativeEncodeWrapper);
    }

    public void setBitrate(int i) {
        LiteavLog.m16901i(this.mTAG, "SetBitrate: ".concat(String.valueOf(i)));
        nativeSetBitrate(this.mNativeEncodeWrapper, i);
        this.mEncodeParams.setBitrate(i);
    }

    public void setFps(int i) {
        LiteavLog.m16901i(this.mTAG, "setFps: ".concat(String.valueOf(i)));
        nativeSetFps(this.mNativeEncodeWrapper, i);
        this.mEncodeParams.setFps(i);
    }

    public void setRPSIFrameFPS(int i) {
        LiteavLog.m16902i(this.mTAG, "setRPSIFrameFPS：fps= %d", Integer.valueOf(i));
        nativeSetRpsIdrFps(this.mNativeEncodeWrapper, i);
    }

    public void setRPSNearestREFSize(int i) {
        LiteavLog.m16901i(this.mTAG, "setRPSNearestREFSize ".concat(String.valueOf(i)));
        nativeSetNearestRPS(this.mNativeEncodeWrapper, i);
    }

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public void signalEndOfStream() {
        LiteavLog.m16901i(this.mTAG, "signalEndOfStream");
        if (this.mListener != null) {
            this.mListener.onEncodedNAL(new EncodedVideoFrame(), true);
        }
    }

    public boolean start(VideoEncodeParams videoEncodeParams, C17501bf.C17502a aVar) {
        LiteavLog.m16901i(this.mTAG, "Start: ".concat(String.valueOf(videoEncodeParams)));
        VideoEncodeParams videoEncodeParams2 = new VideoEncodeParams(videoEncodeParams);
        this.mEncodeParams = videoEncodeParams2;
        this.mListener = aVar;
        nativeStart(this.mNativeEncodeWrapper, videoEncodeParams2);
        return true;
    }

    public void stop() {
        LiteavLog.m16901i(this.mTAG, "Stop");
        this.mEncodeParams = null;
        nativeStop(this.mNativeEncodeWrapper);
        uninitializeOpenGLComponents();
    }

    public void takeSnapshot(TakeSnapshotListener takeSnapshotListener) {
        this.mSnapshotTaker.f46629a = takeSnapshotListener;
    }

    public void uninitialize() {
        LiteavLog.m16901i(this.mTAG, "uninitialize ");
        nativeDestroy(this.mNativeEncodeWrapper);
    }
}
