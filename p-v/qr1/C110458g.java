package qr1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: qr1.g */
public final class C110458g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110461j f330312d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110458g(C110461j jVar) {
        super(0);
        this.f330312d = jVar;
    }

    public Object invoke() {
        C110461j jVar = this.f330312d;
        C110194c cVar = new C110194c(false, 15);
        C110461j jVar2 = this.f330312d;
        jVar2.f330323i = new SurfaceTexture(cVar.f329652e);
        jVar2.f330322h = new Surface(jVar2.f330323i);
        SurfaceTexture surfaceTexture = jVar2.f330323i;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new C110456f(jVar2));
        }
        String str = jVar2.f330317c;
        Log.m105924i(str, "createVideoTexture finished texId:" + cVar.f329652e);
        jVar.f330324j = cVar;
        return C13598b0.f38549a;
    }
}
