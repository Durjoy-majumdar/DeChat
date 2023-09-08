package p485cy;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pointers.PInt;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import p500dy.C86416e;
import p500dy.C97560f;
import rw0.C101478s;

@C86522b
/* renamed from: cy.b */
public class C106964b extends C86301e implements C97560f, ISightJNIService, C86416e {

    /* renamed from: d */
    public static boolean f320184d;

    /* renamed from: Ww */
    public String mo136822Ww() {
        return C94555d.m119566b();
    }

    public C94554a Z40(String str) {
        return C94555d.m119567c(str, true);
    }

    public void addReportMetadata(String str, ABAPrams aBAPrams, int i, int i2) {
        SightVideoJNI.addReportMetadata(str, aBAPrams, i, i2);
    }

    public String calcVideoRangeTs(String str, double d) {
        return SightVideoJNI.nativeCalcAllVideoRangeTs(str, d);
    }

    public int drawFrame(int i, Bitmap bitmap, int i2, Bitmap bitmap2, boolean z, boolean z2) {
        return SightVideoJNI.drawFrame(i, bitmap, i2, bitmap2, z, z2);
    }

    public int drawScaledFrame(int i, Bitmap bitmap, int i2, int i3) {
        return SightVideoJNI.drawScaledFrame(i, bitmap, i2, i3);
    }

    public int drawSurfaceColor(Surface surface, int i) {
        return SightVideoJNI.drawSurfaceColor(surface, i);
    }

    public int drawSurfaceFrame(int i, Surface surface, int i2, Bitmap bitmap, boolean z) {
        return SightVideoJNI.drawSurfaceFrame(i, surface, i2, bitmap, z);
    }

    public int drawSurfaceThumb(Surface surface, Bitmap bitmap, Bitmap bitmap2) {
        return SightVideoJNI.drawSurfaceThumb(surface, bitmap, bitmap2);
    }

    public C94554a e30(String str, boolean z) {
        return C94555d.m119567c(str, z);
    }

    public int freeAll() {
        return SightVideoJNI.freeAll();
    }

    public int freeObj(int i) {
        return SightVideoJNI.freeObj(i);
    }

    public int getMp4RotateVFS(String str) {
        return SightVideoJNI.getMp4RotateVFS(str);
    }

    public String getSimpleMp4InfoVFS(String str) {
        return SightVideoJNI.getSimpleMp4InfoVFS(str);
    }

    public double getVideoDuration(int i) {
        return SightVideoJNI.getVideoDuration(i);
    }

    public int getVideoHeight(int i) {
        return SightVideoJNI.getVideoHeight(i);
    }

    public String getVideoInfo(int i) {
        return SightVideoJNI.getVideoInfo(i);
    }

    public double getVideoPlayTime(int i) {
        return SightVideoJNI.getVideoPlayTime(i);
    }

    public double getVideoRate(int i) {
        return SightVideoJNI.getVideoRate(i);
    }

    public double getVideoStartTime(int i) {
        return SightVideoJNI.getVideoStartTime(i);
    }

    public int getVideoWidth(int i) {
        return SightVideoJNI.getVideoWidth(i);
    }

    public void gu0() {
        Class<C101478s> cls = C101478s.class;
        synchronized (cls) {
            if (!f320184d) {
                C86312j.m106911c(cls);
                f320184d = true;
            }
        }
    }

    public int handleThumb(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        return SightVideoJNI.handleThumb(bitmap, bitmap2, bitmap3);
    }

    public boolean isH265VideoVFS(String str) {
        return SightVideoJNI.isH265VideoVFS(str);
    }

    public void mirrorCameraData(byte[] bArr, int i, int i2, boolean z) {
        SightVideoJNI.mirrorCameraData(bArr, i, i2, z);
    }

    public int openFileVFS(String str, int i, int i2, boolean z) {
        return SightVideoJNI.openFileVFS(str, i, i2, z);
    }

    public boolean optimizeMP4VFS(String str) {
        return SightVideoJNI.optimizeMP4VFS(str);
    }

    public int remuxingVFS(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, byte[] bArr, int i7, boolean z, int i8, int i9) {
        return SightVideoJNI.remuxingVFS(str, str2, i, i2, i3, i4, i5, i6, f, f2, bArr, i7, z, i8, i9);
    }

    public int seekStream(double d, int i) {
        return SightVideoJNI.seekStream(d, i);
    }

    public int seekStreamWithFlag(double d, int i, int i2) {
        return SightVideoJNI.seekStreamWithFlag(d, i, i2);
    }

    public int shouldRemuxingVFS(String str, int i, int i2, int i3, double d, int i4) {
        return SightVideoJNI.shouldRemuxingVFS(str, i, i2, i3, d, i4);
    }

    /* renamed from: un */
    public String mo136825un(String str) {
        return C94555d.m119568d(str);
    }

    /* renamed from: xX */
    public String mo136826xX(String str, PInt pInt, PInt pInt2, PInt pInt3, PInt pInt4, PInt pInt5) {
        return C94555d.m119569e(str, pInt, pInt2, pInt3, pInt4, pInt5);
    }
}
