package h43;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: h43.t */
public final class C108113t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323735d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<SurfaceTexture, C13598b0> f323736e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108113t(C108115u uVar, C32226l<? super SurfaceTexture, C13598b0> lVar) {
        super(0);
        this.f323735d = uVar;
        this.f323736e = lVar;
    }

    public Object invoke() {
        try {
            C108115u uVar = this.f323735d;
            uVar.f323744g = false;
            C110194c cVar = uVar.f323745h;
            if (cVar != null) {
                cVar.close();
            }
            SurfaceTexture surfaceTexture = this.f323735d.f323742e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f323735d.f323745h = new C110194c(false, 14);
            C108115u uVar2 = this.f323735d;
            C110194c cVar2 = uVar2.f323745h;
            if (cVar2 != null) {
                C32226l<SurfaceTexture, C13598b0> lVar = this.f323736e;
                C108107q0 q0Var = uVar2.f323741d;
                if (q0Var != null) {
                    q0Var.mo158520v(cVar2);
                }
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(cVar2.f329652e);
                uVar2.f323742e = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(new C108111s(uVar2));
                if (lVar != null) {
                    C13598b0 invoke = lVar.invoke(uVar2.f323742e);
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.PboSurfaceRender", "switch camera failed");
            C108115u uVar3 = this.f323735d;
            uVar3.f323744g = true;
            C32226l<SurfaceTexture, C13598b0> lVar2 = this.f323736e;
            if (lVar2 != null) {
                C13598b0 invoke2 = lVar2.invoke(uVar3.f323742e);
            }
        }
        return C13598b0.f38549a;
    }
}
