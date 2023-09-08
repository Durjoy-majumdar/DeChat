package p172io.clipworks.androidplus.media;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.jni.HybridData;

/* renamed from: io.clipworks.androidplus.media.NativeMediaCodecCallback */
public class NativeMediaCodecCallback extends MediaCodec.Callback {
    private final HybridData mHybridData;

    private NativeMediaCodecCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeOnError(MediaCodec.CodecException codecException);

    private native void nativeOnInputBufferAvailable(int i);

    private native void nativeOnOutputBufferAvailable(int i, MediaCodec.BufferInfo bufferInfo);

    private native void nativeOnOutputFormatChanged(MediaFormat mediaFormat);

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        nativeOnError(codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        nativeOnInputBufferAvailable(i);
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        nativeOnOutputBufferAvailable(i, bufferInfo);
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        nativeOnOutputFormatChanged(mediaFormat);
    }
}
