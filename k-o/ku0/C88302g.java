package ku0;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ku0.g */
public final class C88302g extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255251d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<SurfaceTexture, C13598b0> f255252e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88302g(C88288a aVar, C32226l<? super SurfaceTexture, C13598b0> lVar) {
        super(1);
        this.f255251d = aVar;
        this.f255252e = lVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        String str = this.f255251d.f255208f;
        Log.m105924i(str, "replaceCallback#setupWebGLExtTextureIfNeed, extTexture: " + surfaceTexture);
        this.f255251d.f255218s = surfaceTexture;
        if (surfaceTexture != null) {
            this.f255252e.invoke(surfaceTexture);
        }
        return C13598b0.f38549a;
    }
}
