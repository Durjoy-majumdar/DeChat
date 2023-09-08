package com.tencent.p014mm.feature.sight.api;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import di3.C7335d;

/* renamed from: com.tencent.mm.feature.sight.api.ISightJNIService */
public interface ISightJNIService extends C7335d {
    public static final int MMSIGHT_YUV420P = 2;
    public static final int MMSIGHT_YUV420SP = 1;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_SURFACE = 0;

    void addReportMetadata(String str, ABAPrams aBAPrams, int i, int i2);

    String calcVideoRangeTs(String str, double d);

    int drawFrame(int i, Bitmap bitmap, int i2, Bitmap bitmap2, boolean z, boolean z2);

    int drawScaledFrame(int i, Bitmap bitmap, int i2, int i3);

    int drawSurfaceColor(Surface surface, int i);

    int drawSurfaceFrame(int i, Surface surface, int i2, Bitmap bitmap, boolean z);

    int drawSurfaceThumb(Surface surface, Bitmap bitmap, Bitmap bitmap2);

    int freeAll();

    int freeObj(int i);

    int getMp4RotateVFS(String str);

    String getSimpleMp4InfoVFS(String str);

    double getVideoDuration(int i);

    int getVideoHeight(int i);

    String getVideoInfo(int i);

    double getVideoPlayTime(int i);

    double getVideoRate(int i);

    double getVideoStartTime(int i);

    int getVideoWidth(int i);

    int handleThumb(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    boolean isH265VideoVFS(String str);

    void mirrorCameraData(byte[] bArr, int i, int i2, boolean z);

    int openFileVFS(String str, int i, int i2, boolean z);

    boolean optimizeMP4VFS(String str);

    int remuxingVFS(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, byte[] bArr, int i7, boolean z, int i8, int i9);

    int seekStream(double d, int i);

    int seekStreamWithFlag(double d, int i, int i2);

    int shouldRemuxingVFS(String str, int i, int i2, int i3, double d, int i4);
}
