package h43;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;
import u33.C111130b;
import w80.C111742d;
import zt3.C119157j;

/* renamed from: h43.k */
public final class C108094k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323693d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C108115u, C13598b0> f323694e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108094k(C108115u uVar, C32226l<? super C108115u, C13598b0> lVar) {
        super(0);
        this.f323693d = uVar;
        this.f323694e = lVar;
    }

    public Object invoke() {
        int i;
        C108115u uVar = this.f323693d;
        uVar.f323746i = true;
        uVar.f323748k = this.f323694e;
        C111742d.C65942b k = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, uVar.f323738a, uVar.f323739b, (EGLContext) null, 16, (Object) null);
        uVar.f323740c = k;
        C111130b a = C109247e.vx0().mo163047a(0);
        if (a != null) {
            a.f332737d = k;
        }
        int i2 = uVar.f323738a;
        int i3 = uVar.f323739b;
        uVar.f323741d = new C108107q0(i2, i3, i2, i3, 2, 1);
        if (uVar.f323753p) {
            Log.m105924i("MicroMsg.PboSurfaceRender", "render YT face-beauty algorithm");
            i = 2;
        } else {
            i = 0;
        }
        uVar.f323754q = i;
        uVar.mo158524c(new C108104p(uVar));
        C110194c cVar = new C110194c(false, 14);
        uVar.f323745h = cVar;
        C108107q0 q0Var = uVar.f323741d;
        if (q0Var != null) {
            q0Var.mo158520v(cVar);
        }
        uVar.f323742e = new SurfaceTexture(cVar.f329652e);
        uVar.f323743f = new Surface(uVar.f323742e);
        SurfaceTexture surfaceTexture = uVar.f323742e;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new C108096l(uVar));
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C108098m(uVar));
        Log.m105924i("MicroMsg.PboSurfaceRender", "init create PboSurfaceRender, width:" + uVar.f323738a + ", height:" + uVar.f323739b);
        this.f323693d.f323747j = false;
        return C13598b0.f38549a;
    }
}
