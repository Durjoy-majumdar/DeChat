package ku0;

import android.util.Size;
import android.view.Surface;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ku0.j */
public final class C88305j extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255255d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f255256e;

    /* renamed from: f */
    public final /* synthetic */ Size f255257f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88305j(C88288a aVar, C32226l<? super Boolean, C13598b0> lVar, Size size) {
        super(1);
        this.f255255d = aVar;
        this.f255256e = lVar;
        this.f255257f = size;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Log.m105924i(this.f255255d.f255208f, "startCustomVideoCaptureIfNeed, setupWebGLEnv failure");
            C32226l<Boolean, C13598b0> lVar = this.f255256e;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        } else {
            C80301a aVar = this.f255255d.f255220u;
            if (aVar == null) {
                C88288a aVar2 = this.f255255d;
                C32226l<Boolean, C13598b0> lVar2 = this.f255256e;
                if (C88288a.f255200F) {
                    Log.m105918d(aVar2.f255208f, "startCustomVideoCaptureIfNeed, mbRuntime is null");
                }
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.FALSE);
                }
            } else {
                C88288a aVar3 = this.f255255d;
                Size size = this.f255257f;
                C88304i iVar = new C88304i(aVar3);
                if (C88288a.f255200F) {
                    String str = aVar3.f255208f;
                    Log.m105918d(str, "setupWebGLExtTextureIfNeed, previewSurfaceSize: " + size);
                }
                if (aVar3.f255217r) {
                    Log.m105924i(aVar3.f255208f, "setupWebGLExtTextureIfNeed, already registerSurface");
                } else {
                    Log.m105924i(aVar3.f255208f, "setupWebGLExtTextureIfNeed, registerSurface");
                    aVar.f235097m.mo111602a("livepusher").mo124241a(aVar3.f255206d.f253971d, size.getWidth(), size.getHeight(), (Surface) null, new C88302g(aVar3, iVar), new C88303h(aVar3));
                    aVar3.f255217r = true;
                }
                C32226l<Boolean, C13598b0> lVar3 = this.f255256e;
                if (lVar3 != null) {
                    lVar3.invoke(Boolean.TRUE);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
