package s50;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111140b;
import w80.C111742d;

/* renamed from: s50.s */
public final class C110758s implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C110755r f331269d;

    public C110758s(C110755r rVar) {
        this.f331269d = rVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C110194c cVar;
        C32228q<? super Integer, ? super Integer, ? super Integer, C13598b0> qVar;
        C111140b bVar;
        this.f331269d.f331266l = true;
        C110755r rVar = this.f331269d;
        synchronized (rVar) {
            try {
                if (rVar.f331266l) {
                    rVar.f331266l = false;
                    try {
                        SurfaceTexture surfaceTexture2 = rVar.f331261g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (Exception unused) {
                        Log.m105924i("MicroMsg.ScreenProjectCanvasRendererMgr", "render Image update");
                    }
                }
                rVar.mo162271a();
                C111140b bVar2 = rVar.f331260f;
                if (bVar2 != null) {
                    bVar2.mo162879m();
                }
                C111742d.C65942b bVar3 = rVar.f331265k;
                if (bVar3 != null) {
                    EGL14.eglSwapBuffers(bVar3.f189591a, bVar3.f189592b);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ScreenProjectCanvasRendererMgr", "render error in " + e);
            }
        }
        C110755r rVar2 = this.f331269d;
        Bitmap bitmap = rVar2.f331262h;
        if (!(bitmap == null || (bVar = rVar2.f331260f) == null)) {
            C111140b.m151568v(bVar, bitmap, false, 2, (Object) null);
        }
        C110755r rVar3 = this.f331269d;
        C111140b bVar4 = rVar3.f331260f;
        if (bVar4 != null && (cVar = bVar4.f332754i) != null && (qVar = rVar3.f331263i) != null) {
            qVar.invoke(Integer.valueOf(cVar.f329652e), Integer.valueOf(rVar3.f331255a), Integer.valueOf(rVar3.f331256b));
            return;
        }
        return;
    }
}
