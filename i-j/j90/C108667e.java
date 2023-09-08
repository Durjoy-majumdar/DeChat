package j90;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import fy3.C32226l;
import i72.C108382h;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import y80.C66557b;

/* renamed from: j90.e */
public interface C108667e extends C108668f {
    EGLContext getEGLContext();

    C108382h getFrameDataCallback();

    C110194c getPreviewTexture();

    /* renamed from: i */
    void mo148308i(C32226l<? super SurfaceTexture, C13598b0> lVar);

    /* renamed from: j */
    void mo148309j(C110777a aVar, boolean z);

    /* renamed from: m */
    void mo148310m(C66557b bVar);

    /* renamed from: n */
    void mo148311n();

    void release();

    /* renamed from: s */
    void mo148314s();

    void setOnDrawListener(C32226l<? super C110194c, C13598b0> lVar);
}
