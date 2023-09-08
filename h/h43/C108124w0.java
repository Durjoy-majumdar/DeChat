package h43;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: h43.w0 */
public final class C108124w0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108126x0 f323768d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f323769e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108124w0(C108126x0 x0Var, C32224a<C13598b0> aVar) {
        super(0);
        this.f323768d = x0Var;
        this.f323769e = aVar;
    }

    public Object invoke() {
        C108115u uVar;
        C108115u uVar2;
        C108115u uVar3;
        C108126x0 x0Var = this.f323768d;
        C108117v vVar = x0Var.f323776c;
        if (vVar != null) {
            C108091j[] jVarArr = {vVar.f323612e, vVar.f323613f, vVar.f323614g};
            for (int i = 0; i < 3; i++) {
                C108091j jVar = jVarArr[i];
                if (!(jVar == null || (uVar3 = x0Var.f323774a) == null)) {
                    C108115u.m146450d(uVar3, jVar, (C32226l) null, 2, (Object) null);
                }
            }
        }
        C108126x0 x0Var2 = this.f323768d;
        C108128y0 y0Var = x0Var2.f323775b;
        if (y0Var != null) {
            C108091j[] jVarArr2 = {y0Var.f323612e, y0Var.f323613f, y0Var.f323614g};
            for (int i2 = 0; i2 < 3; i2++) {
                C108091j jVar2 = jVarArr2[i2];
                if (!(jVar2 == null || (uVar2 = x0Var2.f323774a) == null)) {
                    C108115u.m146450d(uVar2, jVar2, (C32226l) null, 2, (Object) null);
                }
            }
        }
        C108126x0 x0Var3 = this.f323768d;
        C108061b bVar = x0Var3.f323777d;
        if (bVar != null) {
            C108091j[] jVarArr3 = {bVar.f323615h, bVar.f323614g, bVar.f323587y};
            for (int i3 = 0; i3 < 3; i3++) {
                C108091j jVar3 = jVarArr3[i3];
                if (!(jVar3 == null || (uVar = x0Var3.f323774a) == null)) {
                    C108115u.m146450d(uVar, jVar3, (C32226l) null, 2, (Object) null);
                }
            }
        }
        C108061b bVar2 = this.f323768d.f323777d;
        if (bVar2 != null) {
            bVar2.mo158465e();
        }
        C108128y0 y0Var2 = this.f323768d.f323775b;
        if (y0Var2 != null) {
            C108073f.m146394j(y0Var2, (C108091j) null, 1, (Object) null);
        }
        C108128y0 y0Var3 = this.f323768d.f323775b;
        if (y0Var3 != null) {
            y0Var3.mo158465e();
        }
        C108117v vVar2 = this.f323768d.f323776c;
        if (vVar2 != null) {
            C108073f.m146394j(vVar2, (C108091j) null, 1, (Object) null);
        }
        C108117v vVar3 = this.f323768d.f323776c;
        if (vVar3 != null) {
            vVar3.mo158465e();
        }
        C108115u uVar4 = this.f323768d.f323774a;
        if (uVar4 != null) {
            Log.m105924i("MicroMsg.PboSurfaceRender", "stop");
            uVar4.mo158524c(new C108108r(uVar4));
        }
        C108115u uVar5 = this.f323768d.f323774a;
        if (uVar5 != null) {
            Log.m105924i("MicroMsg.PboSurfaceRender", "stop");
            uVar5.f323749l.clear();
            uVar5.f323750m.clear();
            C108107q0 q0Var = uVar5.f323741d;
            if (q0Var != null) {
                q0Var.mo158471l();
            }
            uVar5.f323744g = false;
            Log.m105924i("MicroMsg.PboSurfaceRender", "stop set pauseRender");
            uVar5.f323747j = true;
            Surface surface = uVar5.f323743f;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture = uVar5.f323742e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            C110194c cVar = uVar5.f323745h;
            if (cVar != null) {
                cVar.close();
            }
            Log.m105924i("MicroMsg.PboSurfaceRender", "destroy finish");
        }
        C32224a<C13598b0> aVar = this.f323769e;
        if (aVar != null) {
            aVar.invoke();
        }
        return C13598b0.f38549a;
    }
}
