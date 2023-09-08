package vj0;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import fy3.C32226l;
import j90.C108668f;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;

/* renamed from: vj0.f */
public interface C90807f extends C108668f {

    /* renamed from: vj0.f$a */
    public interface C90808a {
        /* renamed from: a */
        void mo124930a(SurfaceTexture surfaceTexture);
    }

    C110777a getAbsSurfaceRenderer();

    EGLContext getEGLContext();

    int getPreviewTextureId();

    int getSurfaceHeight();

    int getSurfaceWidth();

    boolean isAvailable();

    void setOnSurfaceTextureAvailableDelegate(C90808a aVar);

    void setOnTextureDrawFinishDelegate(C32226l<C110194c, C13598b0> lVar);

    void setPreviewRenderer(C110777a aVar);
}
