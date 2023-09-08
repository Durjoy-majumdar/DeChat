package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
public class NativeEncoderDataListener implements VideoEncoderDef.VideoEncoderDataListener {
    public static final String TAG = "NativeEncoderDataListener";
    private long mNativeVideoEncodeDataListener;
    private int mStreamType;

    public NativeEncoderDataListener(long j, int i) {
        this.mNativeVideoEncodeDataListener = j;
        this.mStreamType = i;
    }

    private native void nativeOnEncodedFail(long j, int i, int i2);

    private native void nativeOnEncodedNAL(long j, int i, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2, long j3, long j4, long j5, long j6, long j7, int i6, int i7);

    public synchronized void onEncodedFail(C17263h.C17268a aVar) {
        long j = this.mNativeVideoEncodeDataListener;
        if (j != 0) {
            nativeOnEncodedFail(j, this.mStreamType, C17263h.m17162a(aVar));
        } else {
            LiteavLog.m16901i(TAG, "onEncodedFail nativeclient is zero.");
        }
    }

    public synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z) {
        EncodedVideoFrame encodedVideoFrame2 = encodedVideoFrame;
        synchronized (this) {
            long j = this.mNativeVideoEncodeDataListener;
            if (j != 0) {
                int i = this.mStreamType;
                ByteBuffer byteBuffer = encodedVideoFrame2.data;
                int i2 = encodedVideoFrame2.nalType.mValue;
                int i3 = encodedVideoFrame2.profileType.mValue;
                int i4 = encodedVideoFrame2.codecType.mValue;
                int i5 = encodedVideoFrame2.rotation;
                long j2 = encodedVideoFrame2.dts;
                long j3 = encodedVideoFrame2.pts;
                long j4 = encodedVideoFrame2.gopIndex;
                long j5 = encodedVideoFrame2.gopFrameIndex;
                long j6 = encodedVideoFrame2.frameIndex;
                long j7 = encodedVideoFrame2.refFrameIndex;
                int i6 = encodedVideoFrame2.width;
                int i7 = i6;
                long j8 = j7;
                nativeOnEncodedNAL(j, i, encodedVideoFrame, byteBuffer, i2, i3, i4, i5, j2, j3, j4, j5, j6, j8, i7, encodedVideoFrame2.height);
                return;
            }
            LiteavLog.m16896d(TAG, "onEncodedNAL nativeclient is zero.");
        }
    }

    public synchronized void onOutputFormatChanged(MediaFormat mediaFormat) {
    }

    public synchronized void reset() {
        this.mNativeVideoEncodeDataListener = 0;
    }
}
