package y80;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Size;
import fy3.C32226l;
import i72.C108382h;
import l90.C109292b;
import rx3.C13598b0;

/* renamed from: y80.g */
public interface C112405g {
    /* renamed from: A */
    boolean mo143140A(Rect rect, Rect rect2);

    /* renamed from: B */
    boolean mo164109B();

    /* renamed from: a */
    boolean mo143161a();

    /* renamed from: b */
    boolean mo143162b(C32226l<? super Bitmap, C13598b0> lVar);

    /* renamed from: c */
    int mo143163c();

    /* renamed from: d */
    boolean mo143164d(Context context, boolean z);

    /* renamed from: e */
    void mo143165e(String str, int i);

    /* renamed from: f */
    void mo143166f(float f);

    /* renamed from: g */
    Rect mo143167g(float f, float f2, float f3, int i, int i2);

    int getFlashMode();

    /* renamed from: h */
    void mo143169h(SurfaceTexture surfaceTexture, boolean z, int i);

    /* renamed from: i */
    void mo143170i(boolean z);

    /* renamed from: j */
    void mo143171j(boolean z, boolean z2, int i);

    /* renamed from: k */
    void mo143172k(int i, int i2);

    /* renamed from: l */
    Point mo143173l(boolean z);

    /* renamed from: m */
    C66557b mo143174m();

    /* renamed from: n */
    float[] mo143175n();

    /* renamed from: o */
    void mo143176o(int i);

    void onDestroy();

    /* renamed from: p */
    void mo143177p(C32226l<? super Boolean, C13598b0> lVar);

    /* renamed from: q */
    boolean mo143178q();

    /* renamed from: r */
    void mo164114r(C109292b.C61240a aVar);

    void release();

    /* renamed from: s */
    int mo143180s();

    void setDisplayScreenSize(Size size);

    void setFlashMode(int i);

    boolean switchCamera();

    /* renamed from: t */
    void mo143182t(C108382h hVar);

    /* renamed from: u */
    void mo143183u(float f, float f2, int i, int i2, long j);

    /* renamed from: v */
    void mo143184v(String str, boolean z);

    /* renamed from: w */
    void mo143185w(C108382h hVar);

    /* renamed from: x */
    String mo143186x();

    /* renamed from: y */
    void mo143187y();

    /* renamed from: z */
    void mo143188z(SurfaceTexture surfaceTexture, boolean z, Float f, int i);
}
