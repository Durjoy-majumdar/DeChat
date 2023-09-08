package com.tencent.tav.decoder;

import com.tencent.tav.ResourceLoadUtil;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import k20.C9556a;

public class AudioMixer {
    public static final int OUTPUT_CHANNEL_COUNT = 1;
    public static final int OUTPUT_SAMPLE_RATE = 44100;
    private static final int SIGNED_SHORT_LIMIT = 32768;
    private static final String TAG = "AudioMixer";
    private static final int UNSIGNED_SHORT_MAX = 65535;
    private byte _hellAccFlag_;
    private ByteBuffer cachedByteBuffer;
    private ByteBuffer cachedMergedBuffer;
    private short[] cachedMergedBytes;
    private int destAudioChannelCount;
    private int destAudioSampleRate;
    private ByteBuffer emptyAudioBuffer;
    private long nativeContext;
    private int pcmEncoding;
    private short[] resampleBuffer;
    private short[] sampleBuffer;
    private float sampleFactor;
    private boolean singleChannel;
    private int srcNumChannels;
    private int srcSampleRate;

    static {
        if (!ResourceLoadUtil.isLoaded()) {
            try {
                System.out.println("loadlibrary : tav start");
                C9556a aVar = new C9556a();
                aVar.mo10233c("tav");
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/tav/decoder/AudioMixer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/tav/decoder/AudioMixer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                ResourceLoadUtil.setLoaded(true);
                System.out.println("loadlibrary : tav end");
            } catch (Throwable unused) {
            }
        }
    }

    public AudioMixer() {
        this(44100, 1);
    }

    private short[] downRemix(short[] sArr) {
        ShortBuffer wrap = ShortBuffer.wrap(sArr);
        ShortBuffer allocate = ShortBuffer.allocate(sArr.length);
        downRemix(wrap, allocate);
        return allocate.array();
    }

    private short[] getCachedSampleBuffer(int i) {
        short[] sArr = this.sampleBuffer;
        if (sArr != null && sArr.length >= i) {
            return sArr;
        }
        short[] sArr2 = new short[i];
        this.sampleBuffer = sArr2;
        return sArr2;
    }

    private int getResampleLength(int i) {
        int i2 = (int) (((float) i) * this.sampleFactor);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    private native void nativeRelease(long j);

    private native long nativeSetup(int i, int i2);

    private native void readShortFromStream(long j, short[] sArr);

    private short[] resample(short[] sArr, int i) {
        float f = this.sampleFactor;
        if (f == 1.0f) {
            return sArr;
        }
        if (Float.compare(f, 0.5f) == 0) {
            return downRemix(sArr);
        }
        int resampleLength = getResampleLength(i);
        short[] sArr2 = this.resampleBuffer;
        if (sArr2 == null || sArr2.length < resampleLength) {
            sArr2 = new short[resampleLength];
            this.resampleBuffer = sArr2;
        }
        float f2 = 1.0f / this.sampleFactor;
        int i2 = 0;
        if (this.singleChannel) {
            while (i2 < resampleLength) {
                short s = sArr[(int) (((float) i2) * f2)];
                sArr2[i2 + 1] = s;
                sArr2[i2] = s;
                i2 += 2;
            }
        } else {
            while (i2 < resampleLength) {
                int i3 = ((int) (((double) i2) * 0.5d * ((double) f2))) * 2;
                sArr2[i2] = sArr[i3];
                sArr2[i2 + 1] = sArr[i3 + 1];
                i2 += 2;
            }
        }
        return sArr2;
    }

    private native int writeShortToStream(long j, short[] sArr, int i, float f, float f2, float f3);

    public void finalize() {
        release();
    }

    public int getDestAudioChannelCount() {
        return this.destAudioChannelCount;
    }

    public ByteBuffer mergeSamples(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        ByteBuffer byteBuffer = this.cachedMergedBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < shortBuffer.limit() * 2) {
            ByteBuffer allocate = ByteBuffer.allocate(shortBuffer.limit() * 2);
            this.cachedMergedBuffer = allocate;
            allocate.order(shortBuffer.order());
        } else {
            this.cachedMergedBuffer.clear();
        }
        short[] sArr = this.cachedMergedBytes;
        if (sArr == null || sArr.length < shortBuffer.limit() * 2) {
            this.cachedMergedBytes = new short[(shortBuffer.limit() * 2)];
        }
        ShortBuffer asShortBuffer = this.cachedMergedBuffer.asShortBuffer();
        short[] sArr2 = this.cachedMergedBytes;
        int min = Math.min(shortBuffer.limit(), shortBuffer2.limit());
        for (int i = 0; i < min; i++) {
            int i2 = shortBuffer.get(i) + shortBuffer2.get(i);
            if (i2 < -32768) {
                i2 = -32768;
            } else if (i2 > 32767) {
                i2 = 32767;
            }
            sArr2[i] = (short) i2;
        }
        asShortBuffer.put(sArr2, 0, min);
        if (min < shortBuffer.limit()) {
            shortBuffer.position(min);
            asShortBuffer.put(shortBuffer);
        }
        this.cachedMergedBuffer.position(0);
        this.cachedMergedBuffer.limit(shortBuffer.limit() * 2);
        return this.cachedMergedBuffer;
    }

    public ByteBuffer processBytes(ByteBuffer byteBuffer, float f, float f2, float f3) {
        short[] sArr;
        int i;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i2 == 0 && f2 == 1.0f && f3 == 1.0f && this.sampleFactor == 1.0f) {
            return byteBuffer3;
        }
        int i3 = this.pcmEncoding;
        if (i3 == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            i = asShortBuffer.limit();
            sArr = getCachedSampleBuffer(i);
            asShortBuffer.get(sArr, 0, i);
        } else if (i3 != 3) {
            return byteBuffer3;
        } else {
            i = byteBuffer.limit();
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr, 0, i);
            sArr = getCachedSampleBuffer(i);
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4] = (short) bArr[i4];
            }
        }
        short[] resample = resample(sArr, i);
        int resampleLength = getResampleLength(i);
        int i5 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i5 == 0) {
            resampleLength = (int) (((float) resampleLength) / f);
        } else if (!(i2 == 0 && f2 == 1.0f && f3 == 1.0f)) {
            resampleLength = writeShortToStream(this.nativeContext, resample, resampleLength / this.destAudioChannelCount, f, f2, f3) * this.destAudioChannelCount;
            resample = getCachedSampleBuffer(resampleLength);
            readShortFromStream(this.nativeContext, resample);
        }
        if (i5 == 0) {
            ByteBuffer byteBuffer4 = this.emptyAudioBuffer;
            if (byteBuffer4 == null || byteBuffer4.limit() < resampleLength * 2) {
                int i6 = resampleLength * 2;
                ByteBuffer allocate = ByteBuffer.allocate(i6);
                this.emptyAudioBuffer = allocate;
                allocate.order(byteBuffer.order());
                this.emptyAudioBuffer.put(new byte[i6]);
            }
            byteBuffer2 = this.emptyAudioBuffer;
        } else {
            ByteBuffer byteBuffer5 = this.cachedByteBuffer;
            if (byteBuffer5 == null || byteBuffer5.capacity() < resampleLength * 2) {
                byteBuffer2 = ByteBuffer.allocate(resampleLength * 2);
                this.cachedByteBuffer = byteBuffer2;
                byteBuffer2.order(byteBuffer.order());
            } else {
                byteBuffer2 = this.cachedByteBuffer;
                byteBuffer2.clear();
            }
            byteBuffer2.asShortBuffer().put(resample, 0, resampleLength);
        }
        byteBuffer2.position(0);
        byteBuffer2.limit(resampleLength * 2);
        return byteBuffer2;
    }

    public final void release() {
        nativeRelease(this.nativeContext);
        this.nativeContext = 0;
    }

    public void setAudioInfo(int i, int i2, int i3) {
        this.srcSampleRate = i;
        this.srcNumChannels = i2;
        this.sampleFactor = ((float) (this.destAudioSampleRate * this.destAudioChannelCount)) / (((float) (i * i2)) * 1.0f);
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        this.singleChannel = z;
        this.pcmEncoding = i3;
    }

    public AudioMixer(int i, int i2) {
        this.srcSampleRate = 44100;
        boolean z = true;
        this.srcNumChannels = 1;
        this.destAudioSampleRate = i;
        this.destAudioChannelCount = i2;
        this.nativeContext = nativeSetup(i, i2);
        this.sampleFactor = 1.0f;
        this.singleChannel = i2 != 1 ? false : z;
        this.pcmEncoding = 2;
    }

    public void downRemix(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i = 0; i < min; i++) {
            int i2 = ((shortBuffer.get() + 32768) + (shortBuffer.get() + 32768)) / 2;
            if (i2 >= 65536) {
                i2 = -1;
            }
            shortBuffer2.put((short) (i2 - 32768));
        }
    }
}
