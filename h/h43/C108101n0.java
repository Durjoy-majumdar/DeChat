package h43;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import uu1.e$$c;

/* renamed from: h43.n0 */
public final class C108101n0 implements e$$c {

    /* renamed from: a */
    public final /* synthetic */ C108077f0 f323702a;

    /* renamed from: b */
    public final /* synthetic */ C108091j f323703b;

    public C108101n0(C108077f0 f0Var, C108091j jVar) {
        this.f323702a = f0Var;
        this.f323703b = jVar;
    }

    /* renamed from: a */
    public void mo158515a(int i, int i2) {
        Log.m105924i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureSizeChanged: width=" + i + ", height=" + i2);
        this.f323702a.mo158492g(this.f323703b, i, i2, 0);
    }

    /* renamed from: b */
    public void mo158516b() {
        Log.m105928w("MicroMsg.VoIPRenderMgr", "onSurfaceTextureDestroy");
        C108126x0 x0Var = this.f323702a.f323646f;
        if (x0Var != null) {
            x0Var.mo158530c(this.f323703b, 0);
        }
    }

    /* renamed from: c */
    public void mo158517c(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureReady: " + surfaceTexture);
        this.f323702a.mo158493h(this.f323703b, 0);
    }
}
