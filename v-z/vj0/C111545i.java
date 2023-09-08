package vj0;

import android.opengl.EGL14;
import com.tencent.p014mm.sdk.platformtools.Log;
import s80.C110777a;
import vj0.C111524d;
import w80.C111742d;

/* renamed from: vj0.i */
public class C111545i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111524d.C111531d f333963d;

    /* renamed from: e */
    public final /* synthetic */ C111537h f333964e;

    public C111545i(C111537h hVar, C111524d.C111531d dVar) {
        this.f333964e = hVar;
        this.f333963d = dVar;
    }

    public void run() {
        C111537h hVar;
        Log.m105925i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: onSurfaceTextureDestroyed in thread! can preview: %b", Boolean.valueOf(this.f333964e.f333947n.get()));
        try {
            if (this.f333964e.f333947n.get()) {
                this.f333964e.f333947n.getAndSet(false);
                C110777a aVar = this.f333964e.f333945i;
                if (aVar != null) {
                    aVar.mo157956n(true);
                } else {
                    Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: no renderer!");
                }
                C111742d.C65942b bVar = this.f333964e.f333944h;
                if (bVar != null) {
                    EGL14.eglDestroyContext(bVar.f189591a, bVar.f189593c);
                    C111742d.C65942b bVar2 = this.f333964e.f333944h;
                    EGL14.eglDestroySurface(bVar2.f189591a, bVar2.f189592b);
                    C111524d dVar = this.f333964e.f333940d;
                    dVar.mo163226h(dVar.f333913h);
                }
            }
            hVar = this.f333964e;
        } catch (Throwable th) {
            this.f333964e.f333940d.mo163222b(this.f333963d);
            throw th;
        }
        hVar.f333940d.mo163222b(this.f333963d);
    }
}
