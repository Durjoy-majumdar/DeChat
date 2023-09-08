package p964fd;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fd.x */
public class C86850x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f252113d;

    /* renamed from: e */
    public final /* synthetic */ C86826e f252114e;

    public C86850x(C86826e eVar, Surface surface) {
        this.f252114e = eVar;
        this.f252113d = surface;
    }

    public void run() {
        C86826e eVar = this.f252114e;
        Surface surface = this.f252113d;
        eVar.f252031g = surface;
        if (eVar.f252033h != null) {
            Log.m105925i(eVar.mo121291y(), "replaceSurfaceTextureInternal, setSurface:%s", surface);
            eVar.f252033h.setSurface(eVar.f252031g);
        }
    }
}
