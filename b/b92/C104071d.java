package b92;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import com.tencent.p014mm.sdk.platformtools.Log;
import u80.C111141c;
import w80.C111742d;

/* renamed from: b92.d */
public final class C104071d implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C104065a f307805d;

    public C104071d(C104065a aVar) {
        this.f307805d = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f307805d.f307798k = true;
        C104065a aVar = this.f307805d;
        synchronized (aVar) {
            try {
                if (aVar.f307798k) {
                    aVar.f307798k = false;
                    try {
                        SurfaceTexture surfaceTexture2 = aVar.f307794g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (Exception unused) {
                        Log.m105924i("MicroMsg.ScreenProjectCanvasRendererMgr", "render Image update");
                    }
                }
                C111141c cVar = aVar.f307793f;
                if (cVar != null) {
                    cVar.mo162879m();
                }
                C111742d.C65942b bVar = aVar.f307797j;
                if (bVar != null) {
                    EGL14.eglSwapBuffers(bVar.f189591a, bVar.f189592b);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ScreenProjectCanvasRendererMgr", "render error in " + e);
            }
        }
        return;
    }
}
