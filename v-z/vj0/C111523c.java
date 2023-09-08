package vj0;

import android.opengl.EGL14;
import com.tencent.p014mm.sdk.platformtools.Log;
import s80.C110777a;
import w80.C111742d;

/* renamed from: vj0.c */
public class C111523c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111517b f333910d;

    public C111523c(C111517b bVar) {
        this.f333910d = bVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.CameraPreviewGLTextureView", "hy: onSurfaceTextureDestroyed in thread! can preview: %b", Boolean.valueOf(this.f333910d.f333898p.get()));
        try {
            if (this.f333910d.f333898p.get()) {
                C111517b bVar = this.f333910d;
                boolean unused = C111523c.super.onSurfaceTextureDestroyed(bVar.f333897o.mo160064b());
                this.f333910d.f333898p.getAndSet(false);
                C110777a aVar = this.f333910d.f333896n;
                if (aVar != null) {
                    aVar.mo157956n(false);
                } else {
                    Log.m105928w("MicroMsg.CameraPreviewGLTextureView", "hy: no renderer!");
                }
                C111742d.C65942b bVar2 = this.f333910d.f333893h;
                if (bVar2 != null) {
                    EGL14.eglDestroyContext(bVar2.f189591a, bVar2.f189593c);
                    C111742d.C65942b bVar3 = this.f333910d.f333893h;
                    EGL14.eglDestroySurface(bVar3.f189591a, bVar3.f189592b);
                    this.f333910d.f333892g.release();
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.CameraPreviewGLTextureView", th, "hy: error in surface destroy!!", new Object[0]);
        }
    }
}
