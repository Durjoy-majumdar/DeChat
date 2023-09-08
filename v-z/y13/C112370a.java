package y13;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.mediaplus.AudioSoftDecoderJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.codec.IMediaCodec;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.ExportRuntimeException;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p206nj.C88957l;
import rw0.C101478s;

/* renamed from: y13.a */
public final class C112370a implements IMediaCodec {

    /* renamed from: a */
    public final String f336435a = "AudioSoftDecoder";

    /* renamed from: b */
    public long f336436b;

    /* renamed from: c */
    public ByteBuffer f336437c;

    /* renamed from: d */
    public ByteBuffer f336438d;

    /* renamed from: e */
    public long f336439e;

    public C112370a() {
        C101478s.vx0();
        C88957l.m111078n("mediaplus");
    }

    public void bindSurfaceTexture(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "p0");
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
    }

    public Surface createInputSurface() {
        return null;
    }

    public int dequeueInputBuffer(long j) {
        return 0;
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        C87412m.m108594g(bufferInfo, "info");
        byte[] nGetOutputBuffer = AudioSoftDecoderJni.nGetOutputBuffer(this.f336436b);
        if (nGetOutputBuffer == null) {
            return -1;
        }
        if (nGetOutputBuffer.length == 0) {
            return -1;
        }
        int length = nGetOutputBuffer.length;
        ByteBuffer byteBuffer = this.f336438d;
        int min = Math.min(length, byteBuffer != null ? byteBuffer.capacity() : 0);
        if (min < nGetOutputBuffer.length) {
            String str = this.f336435a;
            Log.m105928w(str, "output size not enough " + min + ", " + nGetOutputBuffer.length);
        }
        bufferInfo.presentationTimeUs = this.f336439e;
        bufferInfo.size = min;
        ByteBuffer byteBuffer2 = this.f336438d;
        if (byteBuffer2 != null) {
            byteBuffer2.position(0);
            if (byteBuffer2.limit() != min) {
                String str2 = this.f336435a;
                Log.m105924i(str2, "output buffer size changed " + byteBuffer2.limit() + " -> " + min);
            }
            byteBuffer2.limit(min);
            byteBuffer2.put(nGetOutputBuffer, 0, min);
        }
        return 0;
    }

    public void flush() {
        AudioSoftDecoderJni.nFlush(this.f336436b);
    }

    public ByteBuffer getInputBuffer(int i) {
        ByteBuffer byteBuffer = this.f336437c;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return this.f336437c;
    }

    public ByteBuffer getOutputBuffer(int i) {
        return this.f336438d;
    }

    public MediaFormat getOutputFormat() {
        return null;
    }

    public boolean isSoft() {
        return false;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f336439e = j;
        ByteBuffer byteBuffer = this.f336437c;
        if (byteBuffer != null) {
            AudioSoftDecoderJni.nDecodeSample(this.f336436b, byteBuffer, i3);
        }
    }

    public void release() {
        AudioSoftDecoderJni.nDestroy(this.f336436b);
        this.f336436b = 0;
    }

    public void releaseOutputBuffer(int i, boolean z) {
    }

    public void reset() {
    }

    public void setDataSource(String str) {
        C87412m.m108594g(str, "path");
        long nInit = AudioSoftDecoderJni.nInit(str);
        this.f336436b = nInit;
        int nGetOutputBufferSize = AudioSoftDecoderJni.nGetOutputBufferSize(nInit);
        int nGetErrCode = AudioSoftDecoderJni.nGetErrCode(this.f336436b);
        String str2 = this.f336435a;
        Log.m105924i(str2, "configure " + this.f336436b + ' ' + nGetOutputBufferSize + ' ' + nGetErrCode);
        if (nGetErrCode == 0) {
            this.f336437c = ByteBuffer.allocateDirect(8192).order(ByteOrder.nativeOrder());
            this.f336438d = ByteBuffer.allocateDirect(nGetOutputBufferSize).order(ByteOrder.nativeOrder());
            return;
        }
        throw new ExportRuntimeException(new ExportErrorStatus(-202, (Throwable) null, ""));
    }

    public void signalEndOfInputStream() {
    }

    public void start() {
    }

    public void stop() {
    }
}
