package com.tencent.qqmusic.mediaplayer.codec;

import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class NativeDecoder extends BaseDecoder {
    private static final String TAG = "NativeDecoder";
    private long mNativePointer = 0;
    private final ReadWriteLock mReadWriteLock = new ReentrantReadWriteLock();

    private native int nativeDecode(long j, byte[] bArr, int i, int i2);

    private native AudioInformation nativeGetAudioInformation(long j);

    private native long nativeGetBytePositionOfTime(long j, long j2);

    private native long nativeGetCurrentPosition(long j);

    private native int nativeGetDetailErrorCode(long j);

    private native String nativeGetDetailErrorDescription(long j);

    private native long nativeGetDuration(long j);

    private native long nativeGetMinBufferSize(long j);

    private native long[] nativeInit(long j);

    private native long[] nativeInit(IDataSource iDataSource);

    private native int nativeRelease(long j);

    private native long nativeSeekTo(long j, long j2);

    public int decodeData(int i, byte[] bArr) {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeDecode(this.mNativePointer, bArr, 0, i);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public AudioInformation getAudioInformation() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetAudioInformation(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public long getBytePositionOfTime(long j) {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetBytePositionOfTime(this.mNativePointer, j);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public long getCurrentTime() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetCurrentPosition(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public long getDuration() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetDuration(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public int getErrorCodeMask() {
        return -1;
    }

    public long getMinBufferSize() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetMinBufferSize(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public List<NativeLibs> getNativeLibs() {
        return Arrays.asList(new NativeLibs[]{NativeLibs.audioCommon, NativeLibs.formatDetector, NativeLibs.codecFactory, NativeLibs.decoderJni, NativeLibs.cppShared, NativeLibs.stlportShared, NativeLibs.xlog, NativeLibs.xFFmpeg});
    }

    public int init(IDataSource iDataSource) {
        this.mReadWriteLock.writeLock().lock();
        try {
            long[] nativeInit = nativeInit(iDataSource);
            long j = -1;
            if (nativeInit != null && nativeInit.length >= 2) {
                this.mNativePointer = nativeInit[0];
                j = nativeInit[1];
            }
            int i = (int) j;
            return i;
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }

    public int release() {
        this.mReadWriteLock.writeLock().lock();
        try {
            int nativeRelease = nativeRelease(this.mNativePointer);
            this.mNativePointer = 0;
            return nativeRelease;
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }

    public int seekTo(int i) {
        this.mReadWriteLock.readLock().lock();
        try {
            return (int) nativeSeekTo(this.mNativePointer, (long) i);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public int init(INativeDataSource iNativeDataSource) {
        this.mReadWriteLock.writeLock().lock();
        long j = -1;
        if (iNativeDataSource != null) {
            try {
                long[] nativeInit = nativeInit(iNativeDataSource.getNativeInstance());
                if (nativeInit != null && nativeInit.length >= 2) {
                    this.mNativePointer = nativeInit[0];
                    j = nativeInit[1];
                }
            } catch (Throwable th) {
                this.mReadWriteLock.writeLock().unlock();
                throw th;
            }
        }
        int i = (int) j;
        this.mReadWriteLock.writeLock().unlock();
        return i;
    }

    public int init(String str, boolean z) {
        return init((IDataSource) new FileDataSource(str));
    }
}
