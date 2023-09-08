package g23;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.nio.Buffer;
import p80.C110193b;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: g23.k */
public final class C107708k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107709l f322272d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107708k(C107709l lVar) {
        super(0);
        this.f322272d = lVar;
    }

    public Object invoke() {
        int i;
        int i2;
        C107709l lVar = this.f322272d;
        Surface surface = lVar.f322300d;
        C111742d.C111743a aVar = C111742d.f334647a;
        int i3 = 0;
        if (surface == null) {
            i3 = lVar.f322297a;
            i2 = lVar.f322298b;
            i = 18;
        } else {
            i2 = 0;
            i = 30;
        }
        lVar.f322273e = C111742d.C111743a.m152352k(aVar, surface, (SurfaceTexture) null, i3, i2, (EGLContext) null, i, (Object) null);
        Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", "initGL succ");
        C107709l lVar2 = this.f322272d;
        C110194c b = C110193b.m149776b(true, 9);
        C107709l lVar3 = this.f322272d;
        if (lVar3.f322276h <= 0 || lVar3.f322277i <= 0) {
            Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", "[OpenGL] init productionTexObj, width:" + lVar3.f322297a + ", height:" + lVar3.f322298b);
            C110194c.m149779b(b, lVar3.f322297a, lVar3.f322298b, 0, (Buffer) null, 0, 0, 60, (Object) null);
        } else {
            Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", "[OpenGL] init productionTexObj, width:" + lVar3.f322276h + ", height:" + lVar3.f322277i);
            C110194c.m149779b(b, lVar3.f322276h, lVar3.f322277i, 0, (Buffer) null, 0, 0, 60, (Object) null);
        }
        lVar2.f322299c = b;
        C107709l lVar4 = this.f322272d;
        C111742d.C65942b bVar = lVar4.f322273e;
        EGLContext eGLContext = null;
        if (bVar != null) {
            EGLSurface eGLSurface = bVar.f189592b;
        }
        lVar4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("[OpenGL] init egl environment after, surface: ");
        sb.append(this.f322272d.f322300d);
        sb.append(", eglEnv: ");
        C111742d.C65942b bVar2 = this.f322272d.f322273e;
        if (bVar2 != null) {
            eGLContext = bVar2.f189593c;
        }
        sb.append(eGLContext);
        Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", sb.toString());
        return C13598b0.f38549a;
    }
}
