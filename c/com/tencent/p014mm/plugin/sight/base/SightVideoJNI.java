package com.tencent.p014mm.plugin.sight.base;

import a70.C112760b;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kj2.C117407d;
import p823sg.C48380r;
import rw0.C101478s;
import xb0.C15631e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sight.base.SightVideoJNI */
public class SightVideoJNI {
    public static final int MMSIGHT_YUV420P = 2;
    public static final int MMSIGHT_YUV420SP = 1;
    private static final Object MMSightLock = new Object();
    private static final String TAG = "MicroMsg.SightVideoJNI";
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_SURFACE = 0;

    /* renamed from: com.tencent.mm.plugin.sight.base.SightVideoJNI$VideoTSRange */
    public static class VideoTSRange {
        public double beginTs;
        public long dataOffset;
        public long dataSize;
        public double endTs;
    }

    static {
        C101478s.vx0();
    }

    @Deprecated
    public static native void NV21ToYUV420XXAndScaleRotate(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2);

    public static void addReportArrayMetadata(String str, int[] iArr, int i, int i2) {
        if (i == 1 || i == 2) {
            byte[] bArr = {1, 0, 0, 0};
            if (iArr != null) {
                bArr[2] = (byte) iArr[3];
            }
            bArr[3] = 68;
            String str2 = "wxmmca" + ((iArr == null || iArr[3] <= 0) ? (iArr == null || iArr[4] <= 0) ? "br00" : "br22" : "br11") + ((iArr == null || iArr[35] <= 0) ? "dr0" : "dr1") + ((iArr == null || iArr[20] != 1) ? (iArr == null || iArr[20] != 2) ? "0" : "2" : "1") + "00";
            Log.m105925i(TAG, "ABA: array method add the metadata filename: [%s] cprt [%s]", str, str2);
            tagMP4CprtChpl(str, str2, bArr, true);
            optimizeMP4VFS(str);
            return;
        }
        Log.m105924i(TAG, "ABA: array method aba switch is closed");
    }

    public static void addReportMetadata(String str, ABAPrams aBAPrams, int i, int i2) {
        if (i == 1 || i == 2) {
            byte[] bArr = {1, 0, 0, 0};
            if (aBAPrams != null) {
                bArr[2] = (byte) aBAPrams.bitrateAdaptiveUP;
            }
            bArr[3] = 68;
            String str2 = "wxmmca" + ((aBAPrams == null || aBAPrams.bitrateAdaptiveUP <= 0) ? (aBAPrams == null || aBAPrams.bitrateAdaptiveDown <= 0) ? "br00" : "br22" : "br11") + ((aBAPrams == null || aBAPrams.skipVideoCompress <= 0) ? "dr0" : "dr1") + ((aBAPrams == null || aBAPrams.isEnableHEVC != 1) ? (aBAPrams == null || aBAPrams.isEnableHEVC != 2) ? "0" : "2" : "1") + "00";
            Log.m105925i(TAG, "ABA: add the metadata filename: [%s] cprt [%s]", str, str2);
            tagMP4CprtChpl(str, str2, bArr, true);
            optimizeMP4VFS(str);
            return;
        }
        Log.m105924i(TAG, "ABA: aba switch is closed");
    }

    @Deprecated
    public static native void blendYuvFrame(byte[] bArr, byte[] bArr2, int i, int i2);

    @Deprecated
    public static native void cropCameraData(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    @Deprecated
    public static native void cropCameraDataLongEdge(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    @Deprecated
    public static native void cropCameraDataLongEdgeCenterCrop(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native int drawFrame(int i, Bitmap bitmap, int i2, Bitmap bitmap2, boolean z, boolean z2);

    public static native int drawScaledFrame(int i, Bitmap bitmap, int i2, int i3);

    public static native int drawSurfaceColor(Surface surface, int i);

    public static native int drawSurfaceFrame(int i, Surface surface, int i2, Bitmap bitmap, boolean z);

    public static native int drawSurfaceThumb(Surface surface, Bitmap bitmap, Bitmap bitmap2);

    public static native void finishVideoEncode(int i);

    public static native int freeAll();

    public static native int freeObj(int i);

    public static native byte[] getAACADTSHeaderData(int i, long j, int i2, int i3, int i4);

    @Deprecated
    public static native int getHeight(int i);

    private static native byte[] getMP4Chpl(String str);

    private static native byte[] getMP4Cprt(String str);

    public static String getMP4CprtH(String str) {
        byte[] mP4Cprt;
        if (!Util.isNullOrNil(str) && (mP4Cprt = getMP4Cprt(C48380r.m53726a(str, false))) != null && mP4Cprt.length > 0) {
            int i = 0;
            while (true) {
                if (i >= mP4Cprt.length) {
                    i = 0;
                    break;
                } else if (mP4Cprt[i] == -57) {
                    break;
                } else {
                    i++;
                }
            }
            Log.m105925i(TAG, "tagMP4Cprt, index: %s", Integer.valueOf(i));
            int i2 = i + 1;
            if (i2 < mP4Cprt.length) {
                try {
                    int length = mP4Cprt.length - i2;
                    byte[] bArr = new byte[length];
                    System.arraycopy(mP4Cprt, i2, bArr, 0, length);
                    return new String(bArr);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    private static native byte[] getMP4RecordInfo(String str);

    public static String getMp4RecordInfo(String str) {
        byte[] mP4RecordInfo;
        if (!Util.isNullOrNil(str) && (mP4RecordInfo = getMP4RecordInfo(C48380r.m53726a(str, false))) != null && mP4RecordInfo.length > 0) {
            int i = 0;
            while (true) {
                if (i >= mP4RecordInfo.length) {
                    i = 0;
                    break;
                } else if (mP4RecordInfo[i] == -60) {
                    break;
                } else {
                    i++;
                }
            }
            Log.m105925i(TAG, "getMp4RecordInfo, index: %s", Integer.valueOf(i));
            int i2 = i + 1;
            if (i2 < mP4RecordInfo.length) {
                try {
                    int length = mP4RecordInfo.length - i2;
                    byte[] bArr = new byte[length];
                    System.arraycopy(mP4RecordInfo, i2, bArr, 0, length);
                    return new String(bArr);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    private static native int getMp4Rotate(String str);

    public static int getMp4RotateVFS(String str) {
        return getMp4Rotate(C48380r.m53726a(str, false));
    }

    public static native String getMuxerTempVideoPath(int i);

    private static native String getSimpleMp4Info(String str, boolean z);

    public static String getSimpleMp4InfoVFS(String str) {
        return getSimpleMp4Info(C48380r.m53726a(str, false), C15631e.m14633a());
    }

    public static native long[] getSoftEncodeDtsArray(int i);

    public static native long[] getSoftEncodePtsArray(int i);

    public static native double getVideoDuration(int i);

    public static native int getVideoHeight(int i);

    public static native String getVideoInfo(int i);

    public static native String getVideoMetaData(String str);

    public static native double getVideoPlayTime(int i);

    public static native double getVideoRate(int i);

    public static native double getVideoStartTime(int i);

    public static native int getVideoWidth(int i);

    @Deprecated
    public static native int getWidth(int i);

    public static native int handleThumb(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    public static native int initDataBufferForCapture(int i, int i2, boolean z, int i3, float f, int i4, int i5, int i6, float f2, boolean z2, boolean z3, boolean z4, String str);

    public static native int initDataBufferForHardRemux(String str, boolean z, boolean z2, boolean z3);

    @Deprecated
    public static native int initDataBufferForMMSight(int i, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9, float f2, boolean z, boolean z2, int i15, boolean z3, String str, boolean z4, boolean z5, boolean z6);

    @Deprecated
    public static int initDataBufferForMMSightLock(int i, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9, float f2, boolean z, boolean z2, int i15, boolean z3, boolean z4, boolean z5) {
        int initDataBufferForMMSight;
        synchronized (MMSightLock) {
            initDataBufferForMMSight = initDataBufferForMMSight(i, i2, i3, i4, i5, f, i6, i7, i8, i9, f2, z, z2, i15, z3, C85456b.m105449b(), z5, true, z4);
        }
        return initDataBufferForMMSight;
    }

    public static native int initDataBufferForSoftRemux(int i, int i2, int i3, float f, boolean z, int i4, int i5, int i6, float f2, boolean z2, int i7, int i8, int i9, boolean z3, String str);

    @Deprecated
    public static native void initScaleAndRoateBuffer(int i);

    private static native boolean isH265Video(String str);

    public static boolean isH265VideoVFS(String str) {
        return isH265Video(C48380r.m53726a(str, false));
    }

    private static native int isSightOk(String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i);

    public static int isSightOkVFS(String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i) {
        return isSightOk(C48380r.m53726a(str, false), iArr, iArr2, iArr3, iArr4, iArr5, i);
    }

    public static native byte[] loadAACData(int i);

    @Deprecated
    public static native void mirrorCameraData(byte[] bArr, int i, int i2, boolean z);

    public static native int muxVideo(int i, String str, int i2, float f, boolean z, int i3, int i4);

    @Deprecated
    private static native int muxing(int i, String str, int i2, int i3, int i4, int i5, long j, String str2, float f, int i6, int i7, int i8, int i9, int i15, float f2, byte[] bArr, int i16, boolean z, boolean z2, boolean z3, boolean z4);

    @Deprecated
    public static int muxingLock(int i, String str, int i2, int i3, float f, int i4, int i5, boolean z, boolean z2) {
        return muxingLock(i, (String) null, i2, 1024, 2, i3, 0, str, f, i4, i5, C85457c.f249056a, 8, 2, 23.0f, (byte[]) null, 0, false, z, false, false, z2);
    }

    public static native void nativeBufferCopy(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    public static native String nativeCalcAllVideoRangeTs(String str, double d);

    public static native VideoTSRange nativeCalcVideoRangeForTime(String str, double d, double d2);

    private static native int openFile(String str, int i, int i2, boolean z);

    public static int openFileVFS(String str, int i, int i2, boolean z) {
        return openFile(C48380r.m53726a(str, false), i, i2, z);
    }

    private static native boolean optimizeMP4(String str, String str2);

    public static boolean optimizeMP4VFS(String str) {
        final String a = C48380r.m53726a(str, true);
        String str2 = a + ".tmp";
        boolean optimizeMP4 = optimizeMP4(a, str2);
        Log.m105919d(TAG, "optimizeMP4VFS result:%s", Boolean.valueOf(optimizeMP4));
        if (optimizeMP4) {
            C86013q1.m106463x(str2, a);
            if (Build.VERSION.SDK_INT >= 30) {
                if (!a.contains("/" + MMApplicationContext.getContext().getPackageName()) && !new File(new File(a).getParent(), FilePathGenerator.NO_MEDIA_FILENAME).exists()) {
                    ((C119157j) C119157j.f356862d).mo183878i(new Runnable() {
                        public void run() {
                            AndroidMediaUtil.insertPathIntoMediaStore(MMApplicationContext.getContext(), a);
                        }
                    }, 800);
                }
            }
        } else {
            Log.m105920e(TAG, "optimizeMP4VFS error");
            C86013q1.m106447h(str2);
            C115669n.INSTANCE.mo175913w(986, 147, 1);
        }
        return optimizeMP4;
    }

    @Deprecated
    public static native void paddingYuvData16(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native void registerALL();

    public static native void releaseBigSightDataBuffer(int i);

    @Deprecated
    public static void releaseBigSightDataBufferLock(int i) {
        synchronized (MMSightLock) {
            releaseBigSightDataBuffer(i);
        }
    }

    @Deprecated
    public static native int releaseRecorderBuffer();

    @Deprecated
    public static void releaseRecorderBufferRef(String str) {
        Log.m105919d(TAG, "ashutest::call release recorder buffer, %s", str);
        releaseRecorderBuffer();
    }

    @Deprecated
    public static void releaseRecorderBufferRefLock(String str) {
        synchronized (MMSightLock) {
            Log.m105919d(TAG, "ashutest::call release recorder buffer, %s", str);
            releaseRecorderBuffer();
        }
    }

    @Deprecated
    public static native void releaseScaleAndRoateBuffer(int i);

    public static void removeVideoMetadata(String str, boolean z, boolean z2) {
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        C112760b.m154236i0("media").mo119987x();
        String str2 = C112760b.m154236i0("media").mo119976n() + File.separator + System.currentTimeMillis() + "_remove_metadata_temp";
        C86013q1.m106444e(str2);
        boolean removeVideoMetadata = removeVideoMetadata(C86013q1.m106448i(str, false), C86013q1.m106448i(str2, true), z, z2);
        Log.m105925i(TAG, "removeVideoMetadata, removeCreationTime:%s, removeLocation:%s, result:%s, input:%s, output:%s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(removeVideoMetadata), str, str2);
        if (removeVideoMetadata) {
            C86013q1.m106463x(str2, str);
        }
        C86013q1.m106447h(str2);
    }

    private static native boolean removeVideoMetadata(String str, String str2, boolean z, boolean z2);

    private static native int remuxing(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, byte[] bArr, int i7, boolean z, int i8, int i9, String str3, boolean z2);

    public static int remuxingVFS(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, byte[] bArr, int i7, boolean z, int i8, int i9) {
        boolean d = C85456b.m105451d();
        int remuxing = remuxing(C48380r.m53726a(str, false), C48380r.m53726a(str2, true), i, i2, i3, i4, i5, i6, f, f2, bArr, i7, z, i8, i9, C85456b.m105449b(), d);
        if (d) {
            C85456b.m105452e(82, 1);
            if (remuxing < 0) {
                C85456b.m105452e(81, 1);
            } else {
                C85456b.m105452e(80, 1);
            }
        } else {
            C85456b.m105452e(85, 1);
            if (remuxing < 0) {
                C85456b.m105452e(84, 1);
            } else {
                C85456b.m105452e(83, 1);
            }
        }
        return remuxing;
    }

    @Deprecated
    public static void reportIDKey(long j, long j2, long j3) {
        try {
            C117407d.INSTANCE.idkeyStat(j, j2, j3, false);
            Log.m105919d(TAG, "reportIDKey jni called: %d, %d, %d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        } catch (Error e) {
            Log.printErrStackTrace(TAG, e, "reportIDKey jni called error", new Object[0]);
        }
    }

    public static native void rgbaToNV21(int[] iArr, byte[] bArr, int i, int i2);

    public static native int seekStream(double d, int i);

    public static native int seekStreamWithFlag(double d, int i, int i2);

    public static native int setCropBorder(int i, int i2, int i3, int i4, int i5);

    public static native void setEnableVCodecEncode(int i);

    @Deprecated
    public static native void setI420Format(int i, boolean z);

    @Deprecated
    public static native void setRotateForBufId(int i, int i2);

    public static native void setVideoFormatHeader(int i, String[] strArr, int[] iArr);

    private static native int shouldRemuxing(String str, int i, int i2, int i3, double d, int i4);

    public static int shouldRemuxingVFS(String str, int i, int i2, int i3, double d, int i4) {
        return shouldRemuxing(C48380r.m53726a(str, false), i, i2, i3, d, i4);
    }

    public static void tagMP4CprtChpl(String str, String str2, byte[] bArr, boolean z) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            long currentTicks = Util.currentTicks();
            byte[] bytes = str2.getBytes();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length + 2);
            allocateDirect.order(ByteOrder.nativeOrder());
            allocateDirect.put(new byte[]{21, -57});
            allocateDirect.put(bytes);
            byte[] array = allocateDirect.array();
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(2 + bArr.length);
            allocateDirect2.order(ByteOrder.nativeOrder());
            allocateDirect2.put(new byte[]{85, -60});
            allocateDirect2.put(bArr);
            byte[] array2 = allocateDirect2.array();
            tagMP4CprtChpl(C48380r.m53726a(str, false), array, array.length, array2, array2.length, z);
            Log.m105925i(TAG, "tagMP4CprtInfo used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    private static native void tagMP4CprtChpl(String str, byte[] bArr, int i, byte[] bArr2, int i2, boolean z);

    public static void tagMP4Dscp(String str, byte[] bArr) {
        if (!Util.isNullOrNil(str) && bArr != null) {
            long currentTicks = Util.currentTicks();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2 + bArr.length);
            allocateDirect.order(ByteOrder.nativeOrder());
            allocateDirect.put(new byte[]{85, -60});
            allocateDirect.put(bArr);
            byte[] array = allocateDirect.array();
            tagMP4Dscp(C48380r.m53726a(str, false), array, array.length);
            Log.m105925i(TAG, "tagMP4Dscp used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    private static native void tagMP4Dscp(String str, byte[] bArr, int i);

    private static native void tagMP4RecordInfo(String str, byte[] bArr, int i);

    public static void tagMp4RecordInfo(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            long currentTicks = Util.currentTicks();
            byte[] bytes = str2.getBytes();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2 + bytes.length);
            allocateDirect.order(ByteOrder.nativeOrder());
            allocateDirect.put(new byte[]{85, -60});
            allocateDirect.put(bytes);
            byte[] array = allocateDirect.array();
            tagMP4RecordInfo(C48380r.m53726a(str, false), array, array.length);
            Log.m105925i(TAG, "tagMP4RecordInfo used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    private static native int tagRotateVideo(String str, String str2, int i);

    public static int tagRotateVideoVFS(String str, String str2, int i) {
        return tagRotateVideo(C48380r.m53726a(str, false), C48380r.m53726a(str2, true), i);
    }

    @Deprecated
    public static native int triggerEncode(int i, int i2, boolean z);

    public static native void writeAACData(int i, ByteBuffer byteBuffer, int i2, long j);

    @Deprecated
    public static void writeAACDataLock(int i, ByteBuffer byteBuffer, int i2, long j) {
        synchronized (MMSightLock) {
            writeAACData(i, byteBuffer, i2, j);
        }
    }

    public static native void writeAACDataWithADTS(int i, ByteBuffer byteBuffer, int i2, long j, int i3, int i4, int i5);

    @Deprecated
    public static void writeAACDataWithADTSLock(int i, ByteBuffer byteBuffer, int i2, long j, int i3, int i4, int i5) {
        synchronized (MMSightLock) {
            writeAACDataWithADTS(i, byteBuffer, i2, j, i3, i4, i5);
        }
    }

    public static native void writeDtsData(int i, long j);

    public static native void writeH264Data(int i, ByteBuffer byteBuffer, int i2, long j);

    @Deprecated
    public static void writeH264DataLock(int i, ByteBuffer byteBuffer, int i2, long j) {
        synchronized (MMSightLock) {
            writeH264Data(i, byteBuffer, i2, j);
        }
    }

    public static native void writeRGBDataForMMSight(int i, Buffer buffer, int i2, int i3, boolean z, boolean z2, int i4, int i5);

    @Deprecated
    public static native void writeYuvDataForMMSight(int i, byte[] bArr, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6);

    public static native void writeYuvDataForMMSightEncode(int i, Buffer buffer, int i2, int i3);

    @Deprecated
    public static native void writeYuvDataForMMSightWithBuffer(int i, Buffer buffer, int i2, int i3, boolean z, boolean z2, int i4, int i5);

    @Deprecated
    public static int muxingLock(int i, String str, int i2, int i3, int i4, int i5, long j, String str2, float f, int i6, int i7, int i8, int i9, int i15, float f2, byte[] bArr, int i16, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int muxing;
        synchronized (MMSightLock) {
            long currentTicks = Util.currentTicks();
            muxing = muxing(i, C48380r.m53726a(str, false), i2, i3, i4, i5, j, C48380r.m53726a(str2, true), f, i6, i7, i8, i9, i15, f2, bArr, i16, z, z2, z5, C85456b.m105454g());
            C85456b.m105453f(muxing, currentTicks);
        }
        return muxing;
    }

    public static String getSimpleMp4InfoVFS(String str, boolean z) {
        return getSimpleMp4Info(C48380r.m53726a(str, false), C15631e.m14633a());
    }

    @Deprecated
    public static int initDataBufferForMMSightLock(int i, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9, float f2, boolean z, boolean z2, int i15, boolean z3) {
        int initDataBufferForMMSight;
        synchronized (MMSightLock) {
            initDataBufferForMMSight = initDataBufferForMMSight(i, i2, i3, i4, i5, f, i6, i7, i8, i9, f2, z, z2, i15, z3, C85456b.m105449b(), C85456b.m105450c(z2, false), true, false);
        }
        return initDataBufferForMMSight;
    }
}
