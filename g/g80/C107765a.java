package g80;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import w80.C111742d;

/* renamed from: g80.a */
public final class C107765a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107766b f322525d;

    /* renamed from: e */
    public final /* synthetic */ EGLContext f322526e;

    public C107765a(C107766b bVar, EGLContext eGLContext) {
        this.f322525d = bVar;
        this.f322526e = eGLContext;
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f322525d.f322531h = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, 0, 0, this.f322526e, 14, (Object) null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Log.m105924i("MicroMsg.BaseCustomRenderCallback", "eglSetupBySurface finish,envCost:" + currentTimeMillis2);
        this.f322525d.mo158192c();
    }
}
