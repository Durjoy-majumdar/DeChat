package v70;

import a14.C0000n0;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import w80.C111742d;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$unbindSurface$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.n */
public final class C111401n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C111389d f333518d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111401n(C111389d dVar, C15601d<? super C111401n> dVar2) {
        super(2, dVar2);
        this.f333518d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111401n(this.f333518d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111401n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "unbindSurface");
        C111742d.C111743a aVar = C111742d.f334647a;
        C111742d.C65942b bVar = this.f333518d.f333484o;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        C87412m.m108593f(eGLSurface, "EGL_NO_SURFACE");
        aVar.mo163467m(bVar, eGLSurface);
        this.f333518d.f333490u = false;
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "unbindSurface finish");
        return C13598b0.f38549a;
    }
}
