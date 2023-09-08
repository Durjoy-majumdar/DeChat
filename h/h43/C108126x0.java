package h43;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: h43.x0 */
public final class C108126x0 {

    /* renamed from: a */
    public C108115u f323774a;

    /* renamed from: b */
    public C108128y0 f323775b;

    /* renamed from: c */
    public C108117v f323776c;

    /* renamed from: d */
    public C108061b f323777d;

    /* renamed from: e */
    public C32228q<? super Size, ? super Integer, ? super Integer, C13598b0> f323778e;

    /* renamed from: a */
    public final void mo158528a(C108091j jVar, int i) {
        if (jVar != null) {
            Log.printInfoStack("MicroMsg.VoipWindowsSurfaceRenderer", "add render surface renderSide " + i + " and :" + jVar, new Object[0]);
            C108128y0 y0Var = this.f323775b;
            if (y0Var != null) {
                y0Var.mo158483a(jVar, i);
            }
            C108117v vVar = this.f323776c;
            if (vVar != null) {
                vVar.mo158483a(jVar, i);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.VoipWindowsSurfaceRenderer", "add a null surface");
    }

    /* renamed from: b */
    public final boolean mo158529b(C108091j jVar) {
        boolean z;
        Object obj;
        C111742d.C65942b bVar;
        C87412m.m108594g(jVar, "glSurface");
        C108115u uVar = this.f323774a;
        if (uVar == null) {
            return false;
        }
        Log.m105924i("MicroMsg.PboSurfaceRender", "createSurface:" + jVar);
        if (!jVar.mo158509b()) {
            return false;
        }
        synchronized (jVar.f323689f) {
            z = jVar.f323688e;
        }
        if (z || (obj = jVar.f323685b) == null || (bVar = uVar.f323740c) == null) {
            return false;
        }
        Log.m105924i("MicroMsg.PboSurfaceRender", "start createEGLSurface:" + obj.hashCode());
        jVar.f323686c = C111742d.f334647a.mo163465h(bVar.f189591a, obj);
        jVar.mo158510c(false);
        Log.m105924i("MicroMsg.PboSurfaceRender", "createSurface finished:" + obj.hashCode() + ", " + jVar.mo158508a().hashCode());
        return true;
    }

    /* renamed from: c */
    public final void mo158530c(C108091j jVar, int i) {
        if (jVar != null) {
            C108128y0 y0Var = this.f323775b;
            if (y0Var != null) {
                y0Var.mo158484f(jVar, i);
            }
            C108117v vVar = this.f323776c;
            if (vVar != null) {
                vVar.mo158484f(jVar, i);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.VoipWindowsSurfaceRenderer", "remove a null surface");
    }

    /* renamed from: d */
    public final void mo158531d() {
        C108128y0 y0Var = this.f323775b;
        if (y0Var != null) {
            y0Var.mo158486i();
        }
        C108117v vVar = this.f323776c;
        if (vVar != null) {
            vVar.mo158486i();
        }
    }
}
