package com.tencent.p014mm.plugin.mmsight.segment;

import java.nio.ByteBuffer;
import p823sg.C48380r;
import rw0.C101478s;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI */
public final class MP4MuxerJNI {
    public static final int SEGMENT_COLOR_FORMAT_YUV420P = 2;
    public static final int SEGMENT_COLOR_FORMAT_YUV420SP = 1;
    private static final Object lock = new Object();

    static {
        C101478s.vx0();
    }

    public static native boolean ffmpegCheckIfReachEndTimestamp();

    public static boolean ffmpegCheckIfReachEndTimestampLock() {
        boolean ffmpegCheckIfReachEndTimestamp;
        synchronized (lock) {
            ffmpegCheckIfReachEndTimestamp = ffmpegCheckIfReachEndTimestamp();
        }
        return ffmpegCheckIfReachEndTimestamp;
    }

    public static native byte[] ffmpegGetNextVideoFrameData(byte[] bArr);

    public static byte[] ffmpegGetNextVideoFrameDataLock(byte[] bArr) {
        byte[] ffmpegGetNextVideoFrameData;
        synchronized (lock) {
            ffmpegGetNextVideoFrameData = ffmpegGetNextVideoFrameData(bArr);
        }
        return ffmpegGetNextVideoFrameData;
    }

    public static native int ffmpegGetVideoHeight();

    public static int ffmpegGetVideoHeightLock() {
        int ffmpegGetVideoHeight;
        synchronized (lock) {
            ffmpegGetVideoHeight = ffmpegGetVideoHeight();
        }
        return ffmpegGetVideoHeight;
    }

    public static native int ffmpegGetVideoWidth();

    public static int ffmpegGetVideoWidthLock() {
        int ffmpegGetVideoWidth;
        synchronized (lock) {
            ffmpegGetVideoWidth = ffmpegGetVideoWidth();
        }
        return ffmpegGetVideoWidth;
    }

    private static native int ffmpegOpenAndSeekFile(String str, double d, double d2);

    public static int ffmpegOpenAndSeekFileLock(String str, double d, double d2) {
        int ffmpegOpenAndSeekFileVFS;
        synchronized (lock) {
            ffmpegOpenAndSeekFileVFS = ffmpegOpenAndSeekFileVFS(str, d, d2);
        }
        return ffmpegOpenAndSeekFileVFS;
    }

    public static int ffmpegOpenAndSeekFileVFS(String str, double d, double d2) {
        return ffmpegOpenAndSeekFile(C48380r.m53726a(str, false), d, d2);
    }

    private static native byte[] getVideoThumb(String str, int i, int i2);

    public static byte[] getVideoThumbVFS(String str, int i, int i2) {
        return getVideoThumb(C48380r.m53726a(str, false), i, i2);
    }

    public static native int initDataBuf(int i);

    public static int initDataBufLock(int i) {
        int initDataBuf;
        synchronized (lock) {
            initDataBuf = initDataBuf(i);
        }
        return initDataBuf;
    }

    public static native int initH264Encoder(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2, int i7, int i8);

    public static int initH264EncoderLock(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2, int i7, int i8) {
        int initH264Encoder;
        synchronized (lock) {
            initH264Encoder = initH264Encoder(i, i2, f, i3, i4, i5, i6, f2, i7, i8);
        }
        return initH264Encoder;
    }

    private static native int muxing(int i, int i2, int i3, int i4, int i5, String str, float f, byte[] bArr, int i6);

    public static native int muxingForX264(int i, int i2, int i3, int i4, String str, float f, int i5, byte[] bArr, int i6);

    public static int muxingForX264Lock(int i, int i2, int i3, int i4, String str, float f, int i5, byte[] bArr, int i6) {
        int muxingForX264VFS;
        synchronized (lock) {
            muxingForX264VFS = muxingForX264VFS(i, i2, i3, i4, str, f, i5, bArr, i6);
        }
        return muxingForX264VFS;
    }

    public static int muxingForX264VFS(int i, int i2, int i3, int i4, String str, float f, int i5, byte[] bArr, int i6) {
        String str2 = str;
        return muxingForX264(i, i2, i3, i4, C48380r.m53726a(str, false), f, i5, bArr, i6);
    }

    public static int muxingLock(int i, int i2, int i3, int i4, int i5, String str, float f, byte[] bArr, int i6) {
        int muxingVFS;
        synchronized (lock) {
            muxingVFS = muxingVFS(i, i2, i3, i4, i5, str, f, bArr, i6);
        }
        return muxingVFS;
    }

    public static int muxingVFS(int i, int i2, int i3, int i4, int i5, String str, float f, byte[] bArr, int i6) {
        String str2 = str;
        return muxing(i, i2, i3, i4, i5, C48380r.m53726a(str, false), f, bArr, i6);
    }

    public static native void releaseDataBuf(int i);

    public static void releaseDataBufLock(int i) {
        synchronized (lock) {
            releaseDataBuf(i);
        }
    }

    public static native int triggerEncodeForSegment(int i, boolean z);

    public static int triggerEncodeForSegmentLock(int i, boolean z) {
        int triggerEncodeForSegment;
        synchronized (lock) {
            triggerEncodeForSegment = triggerEncodeForSegment(i, z);
        }
        return triggerEncodeForSegment;
    }

    public static native void writeAACData(int i, ByteBuffer byteBuffer, int i2);

    public static void writeAACDataLock(int i, ByteBuffer byteBuffer, int i2) {
        synchronized (lock) {
            writeAACData(i, byteBuffer, i2);
        }
    }

    public static native void writeH264Data(int i, ByteBuffer byteBuffer, int i2);

    public static void writeH264DataLock(int i, ByteBuffer byteBuffer, int i2) {
        synchronized (lock) {
            writeH264Data(i, byteBuffer, i2);
        }
    }

    public static native int writeYuvDataForSegment(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public static int writeYuvDataForSegmentLock(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int writeYuvDataForSegment;
        synchronized (lock) {
            writeYuvDataForSegment = writeYuvDataForSegment(bArr, i, i2, i3, i4, i5, i6, i7);
        }
        return writeYuvDataForSegment;
    }

    public static native void yuv420pTo420XXAndScale(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static void yuv420pTo420XXAndScaleLock(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        synchronized (lock) {
            yuv420pTo420XXAndScale(bArr, i, bArr2, i2, i3, i4, i5, i6, i7, i8);
        }
    }
}
