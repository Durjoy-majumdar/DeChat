package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.C17231i;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
public class SoftwareVideoDecoder implements C17334au {
    private static final String TAG = "SoftwareVideoDecoder";
    private C17336av mListener;
    private long mNativeVideoDecoderWrapper = 0;
    private C17231i mPixelFramePool;
    private final IVideoReporter mReporter;
    private Object mSharedEGLContext = null;

    public SoftwareVideoDecoder(IVideoReporter iVideoReporter) {
        this.mReporter = iVideoReporter;
    }

    private ByteBuffer getByteBufferFromPixelFrame(PixelFrame pixelFrame) {
        return pixelFrame.getBuffer();
    }

    private void handleDecoderError(C17263h.C17270c cVar, String str, Object... objArr) {
        this.mReporter.notifyWarning(cVar, str, objArr);
        C17336av avVar = this.mListener;
        if (avVar != null) {
            avVar.mo20333a();
        }
    }

    private static native void nativeAbandonDecodingFrames(long j);

    private static native long nativeCreate(SoftwareVideoDecoder softwareVideoDecoder);

    private static native int nativeDecodeFrame(long j, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i, int i2, int i3, long j2, long j3);

    private static native void nativeDestroy(long j);

    private static native int nativeStart(long j);

    private static native int nativeStop(long j);

    private PixelFrame obtainPixelFrame(int i, int i2, int i3, int i4, long j) {
        GLConstants.PixelFormatType a = GLConstants.PixelFormatType.m17044a(i);
        if (a == null) {
            handleDecoderError(C17263h.C17270c.WARNING_VIDEO_DECODE_ERROR_NOT_SUPPORT_PIXEL_FORMAT_TYPE, "unknown format:".concat(String.valueOf(i)), new Object[0]);
            LiteavLog.m16898e(TAG, "obtainPixelFrame formatType: ".concat(String.valueOf(i)));
            return null;
        }
        C17231i iVar = this.mPixelFramePool;
        if (iVar == null) {
            LiteavLog.m16901i(TAG, "obtainPixelFrame mPixelFramePool is null.");
            return null;
        }
        PixelFrame a2 = iVar.mo20206a(i2, i3, GLConstants.PixelBufferType.BYTE_BUFFER, a);
        a2.setRotation(Rotation.m139836a(i4));
        a2.setTimestamp(j);
        a2.setGLContext(this.mSharedEGLContext);
        return a2;
    }

    private void onDecodedFrame(PixelFrame pixelFrame, long j) {
        if (j != 0) {
            handleDecoderError(C17263h.C17270c.WARNING_VIDEO_DECODE_RESTART_WHEN_DECODE_ERROR, "VideoDecode: decode error, errCode:".concat(String.valueOf(j)), new Object[0]);
            LiteavLog.m16898e(TAG, "decode failed.".concat(String.valueOf(j)));
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        } else if (pixelFrame != null) {
            C17336av avVar = this.mListener;
            if (avVar != null) {
                avVar.mo20334a(pixelFrame.getTimestamp());
                this.mListener.mo20335a(pixelFrame, pixelFrame.getTimestamp());
            }
            pixelFrame.release();
        }
    }

    public void abandonDecodingFrames() {
        long j = this.mNativeVideoDecoderWrapper;
        if (j == 0) {
            LiteavLog.m16905w(TAG, "decoder has already stopped");
            return;
        }
        nativeAbandonDecodingFrames(j);
        C17336av avVar = this.mListener;
        if (avVar != null) {
            avVar.mo20337c();
        }
    }

    public boolean decode(EncodedVideoFrame encodedVideoFrame) {
        ByteBuffer byteBuffer;
        C17336av avVar;
        if (encodedVideoFrame == null || (byteBuffer = encodedVideoFrame.data) == null || byteBuffer.remaining() == 0) {
            return false;
        }
        if (!encodedVideoFrame.isEosFrame || (avVar = this.mListener) == null) {
            nativeDecodeFrame(this.mNativeVideoDecoderWrapper, encodedVideoFrame, encodedVideoFrame.data, encodedVideoFrame.nalType.mValue, encodedVideoFrame.codecType.mValue, encodedVideoFrame.rotation, encodedVideoFrame.pts, encodedVideoFrame.dts);
            encodedVideoFrame.release();
            C17336av avVar2 = this.mListener;
            if (avVar2 != null) {
                avVar2.mo20338d();
            }
            return true;
        }
        avVar.mo20339e();
        return true;
    }

    public C17334au.C17335a getDecoderType() {
        return C17334au.C17335a.SOFTWARE;
    }

    public void initialize() {
    }

    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
    }

    public void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig) {
    }

    public void start(Object obj, C17336av avVar) {
        if (this.mNativeVideoDecoderWrapper != 0) {
            LiteavLog.m16905w(TAG, "decoder is already started!");
            return;
        }
        this.mSharedEGLContext = obj;
        this.mPixelFramePool = new C17231i();
        this.mListener = avVar;
        long nativeCreate = nativeCreate(this);
        this.mNativeVideoDecoderWrapper = nativeCreate;
        if (nativeCreate == 0) {
            handleDecoderError(C17263h.C17270c.WARNING_VIDEO_DECODE_START_FAILED_OUT_OF_MEMORY, "VideoDecode: out of memory, Start decoder failed", new Object[0]);
            LiteavLog.m16898e(TAG, "create native instance failed.");
        } else if (nativeStart(nativeCreate) != 0) {
            handleDecoderError(C17263h.C17270c.WARNING_VIDEO_DECODE_START_FAILED, "VideoDecode: Start decoder failed", new Object[0]);
            LiteavLog.m16898e(TAG, "Start software decoder failed.");
        } else {
            this.mReporter.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_START_SUCCESS, "Start decoder success", new Object[0]);
            LiteavLog.m16901i(TAG, "decoder Start success.");
        }
    }

    public void stop() {
        if (this.mNativeVideoDecoderWrapper == 0) {
            LiteavLog.m16905w(TAG, "decoder has already stopped");
            return;
        }
        C17231i iVar = this.mPixelFramePool;
        if (iVar != null) {
            iVar.mo20187b();
            this.mPixelFramePool = null;
        }
        nativeStop(this.mNativeVideoDecoderWrapper);
        nativeDestroy(this.mNativeVideoDecoderWrapper);
        this.mNativeVideoDecoderWrapper = 0;
        LiteavLog.m16901i(TAG, "decoder stop.");
    }

    public void uninitialize() {
    }
}
