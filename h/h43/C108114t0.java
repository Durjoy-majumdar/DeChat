package h43;

import android.view.Surface;
import com.tencent.p014mm.plugin.voip.model.C106340f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;

/* renamed from: h43.t0 */
public final class C108114t0 implements C106340f.C106341a {

    /* renamed from: a */
    public final /* synthetic */ C108126x0 f323737a;

    public C108114t0(C108126x0 x0Var) {
        this.f323737a = x0Var;
    }

    /* renamed from: a */
    public void mo152572a(Surface surface, int i, int i2) {
        C108061b bVar;
        C87412m.m108594g(surface, "encoderSurface");
        Log.m105924i("MicroMsg.VoipWindowsSurfaceRenderer", "onEncoderSurfaceReady:" + surface.hashCode() + ", size:[" + i + ',' + i2 + ']');
        if (surface.isValid()) {
            C108091j jVar = new C108091j(surface, i2, i);
            if (this.f323737a.mo158529b(jVar) && (bVar = this.f323737a.f323777d) != null) {
                bVar.f323614g = jVar;
            }
        }
    }

    /* renamed from: b */
    public void mo152573b(Surface surface) {
        C108091j jVar;
        Object obj;
        C108115u uVar;
        C87412m.m108594g(surface, "encoderSurface");
        Log.m105924i("MicroMsg.VoipWindowsSurfaceRenderer", "onEncoderSurfaceRelease:" + surface.hashCode());
        C108061b bVar = this.f323737a.f323777d;
        if (bVar != null && (jVar = bVar.f323614g) != null && (obj = jVar.f323685b) != null && C87412m.m108589b(obj, surface) && (uVar = this.f323737a.f323774a) != null) {
            C108115u.m146450d(uVar, jVar, (C32226l) null, 2, (Object) null);
        }
    }
}
