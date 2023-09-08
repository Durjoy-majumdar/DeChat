package g03;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import i03.C60239b;
import j03.C60695a;
import rx3.C13598b0;

/* renamed from: g03.a */
public interface C59338a {

    /* renamed from: g03.a$a */
    public interface C59339a {
        /* renamed from: a */
        long mo84452a();
    }

    /* renamed from: b */
    void mo84440b(C32226l<? super Bitmap, C13598b0> lVar);

    /* renamed from: c */
    void mo84441c(C60695a aVar);

    /* renamed from: d */
    void mo84442d(SurfaceTexture surfaceTexture);

    /* renamed from: e */
    void mo84443e(float f);

    /* renamed from: f */
    void mo84444f(C32224a<C13598b0> aVar);

    /* renamed from: g */
    void mo84445g(C32226l<? super SurfaceTexture, C13598b0> lVar);

    C60239b getReportInfo();

    /* renamed from: h */
    void mo84447h(int i, int i2);

    /* renamed from: i */
    void mo84448i();

    /* renamed from: j */
    void mo84449j(C32226l<? super Long, C13598b0> lVar);

    void release();

    void setMediaInfo(C58010a aVar);
}
