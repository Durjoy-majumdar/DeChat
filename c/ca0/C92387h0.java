package ca0;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.libpag.PAGView;
import p175j0.C24725u1;

/* renamed from: ca0.h0 */
public final class C92387h0 implements C24725u1 {

    /* renamed from: d */
    public PAGView f264369d;

    /* renamed from: b */
    public void mo51625b() {
        Log.m105924i("MicroMsg.ComposePagView", "onAbandoned");
        mo51627d();
    }

    /* renamed from: c */
    public void mo51626c() {
        PAGView pAGView;
        Log.m105924i("MicroMsg.ComposePagView", "onRemembered");
        PAGView pAGView2 = this.f264369d;
        boolean z = false;
        if (pAGView2 != null && !pAGView2.isPlaying()) {
            z = true;
        }
        if (z && (pAGView = this.f264369d) != null) {
            pAGView.play();
        }
    }

    /* renamed from: d */
    public void mo51627d() {
        Log.m105924i("MicroMsg.ComposePagView", "onForgotten");
        PAGView pAGView = this.f264369d;
        if (pAGView != null) {
            pAGView.stop();
        }
    }
}
