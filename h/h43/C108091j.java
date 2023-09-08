package h43;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p206nj.C11171e;
import rx3.C13598b0;

/* renamed from: h43.j */
public final class C108091j {

    /* renamed from: a */
    public final String f323684a = ("MicroMsg.OpenGLSurface@" + hashCode());

    /* renamed from: b */
    public Object f323685b;

    /* renamed from: c */
    public EGLSurface f323686c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    public C108092a f323687d = new C108092a();

    /* renamed from: e */
    public boolean f323688e;

    /* renamed from: f */
    public final Object f323689f = new Object();

    /* renamed from: h43.j$a */
    public static final class C108092a {

        /* renamed from: a */
        public int f323690a;

        /* renamed from: b */
        public int f323691b;
    }

    public C108091j(Surface surface, int i, int i2) {
        C87412m.m108594g(surface, "surface");
        mo158511d(0, 0, i, i2);
        this.f323685b = surface;
    }

    /* renamed from: a */
    public final EGLSurface mo158508a() {
        EGLSurface eGLSurface = this.f323686c;
        C87412m.m108593f(eGLSurface, "eglSurface");
        return eGLSurface;
    }

    /* renamed from: b */
    public final boolean mo158509b() {
        Object obj = this.f323685b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof SurfaceTexture) {
            return !C11171e.m11046c(26) || !((SurfaceTexture) obj).isReleased();
        }
        if (obj instanceof Surface) {
            return ((Surface) obj).isValid();
        }
        return false;
    }

    /* renamed from: c */
    public final void mo158510c(boolean z) {
        String str = this.f323684a;
        Log.m105924i(str, "markSurfaceRemoved:" + z);
        synchronized (this.f323689f) {
            this.f323688e = z;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public final void mo158511d(int i, int i2, int i3, int i4) {
        this.f323687d.getClass();
        this.f323687d.getClass();
        C108092a aVar = this.f323687d;
        aVar.f323690a = i3;
        aVar.f323691b = i4;
    }

    public C108091j(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        mo158511d(0, 0, i, i2);
        this.f323685b = surfaceTexture;
    }

    public C108091j(int i, int i2, int i3, int i4) {
        mo158511d(i, i2, i3, i4);
    }
}
