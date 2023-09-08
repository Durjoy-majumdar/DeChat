package v70;

import a14.C0000n0;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Process;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e80.C107262j;
import fy3.C32227p;
import g80.C107768c;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import w80.C111742d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$bindSurface$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {183}, mo125471m = "invokeSuspend")
/* renamed from: v70.e */
public final class C111395e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f333502d;

    /* renamed from: e */
    public final /* synthetic */ Surface f333503e;

    /* renamed from: f */
    public final /* synthetic */ C111389d f333504f;

    /* renamed from: g */
    public final /* synthetic */ Integer f333505g;

    /* renamed from: h */
    public final /* synthetic */ Integer f333506h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111395e(Surface surface, C111389d dVar, Integer num, Integer num2, C15601d<? super C111395e> dVar2) {
        super(2, dVar2);
        this.f333503e = surface;
        this.f333504f = dVar;
        this.f333505g = num;
        this.f333506h = num2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111395e(this.f333503e, this.f333504f, this.f333505g, this.f333506h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111395e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f333502d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "bindSurface surface hash:" + this.f333503e.hashCode());
            C111742d.C65942b bVar = this.f333504f.f333484o;
            if (bVar == null) {
                Log.m105920e("MicroMsg.Camera.GLEnvBuilder", "bindSurface failed for glEnvironment is null!");
                return C13598b0.f38549a;
            } else if (!this.f333503e.isValid()) {
                Log.m105920e("MicroMsg.Camera.GLEnvBuilder", "bindSurface failed for surface isn't valid!,step 1");
                return C13598b0.f38549a;
            } else {
                long currentTicks = Util.currentTicks();
                Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "bindSurface step 1,create glsurface");
                C111742d.C111743a aVar2 = C111742d.f334647a;
                EGLSurface h = aVar2.mo163465h(bVar.f189591a, this.f333503e);
                Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "bindSurface step 1 cost:" + Util.ticksToNow(currentTicks));
                if (!this.f333503e.isValid()) {
                    Log.m105920e("MicroMsg.Camera.GLEnvBuilder", "bindSurface failed for surface isn't valid!,step 2");
                    return C13598b0.f38549a;
                }
                Integer num = this.f333505g;
                Integer num2 = this.f333506h;
                C111389d dVar = this.f333504f;
                if (!(num == null || num2 == null)) {
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "updateSurfaceSize w:" + intValue2 + " h:" + intValue);
                    if (intValue2 > 0 && intValue > 0) {
                        C107262j jVar = dVar.f333482j;
                        if (!(jVar.f320922a.f320920a == intValue2 && jVar.f320922a.f320921b == intValue)) {
                            jVar.f320922a.f320920a = intValue2;
                            jVar.f320922a.f320921b = intValue;
                            jVar.mo157743a();
                        }
                    }
                }
                long currentTicks2 = Util.currentTicks();
                Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "bindSurface step 2,make current");
                C111389d dVar2 = this.f333504f;
                if (!dVar2.f333491v) {
                    dVar2.f333491v = true;
                    C111742d.C65942b bVar2 = dVar2.f333484o;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    C87412m.m108593f(eGLSurface, "EGL_NO_SURFACE");
                    aVar2.mo163467m(bVar2, eGLSurface);
                }
                EGL14.eglMakeCurrent(bVar.f189591a, h, h, bVar.f189593c);
                this.f333504f.f333490u = true;
                aVar2.mo163460c("eglMakeCurrent", "MicroMsg.Camera.GLEnvBuilder");
                Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "bindSurface step 2 cost:" + Util.ticksToNow(currentTicks2));
                C111389d dVar3 = this.f333504f;
                C111742d.C65942b bVar3 = dVar3.f333484o;
                if (bVar3 != null) {
                    bVar3.f189592b = h;
                }
                C107768c cVar = dVar3.f333483n;
                cVar.f322538f = bVar3;
                this.f333502d = 1;
                if (cVar.mo158195e(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15601d<? super C13598b0> dVar4 = this.f333504f.f333486q;
        if (dVar4 != null) {
            Result.Companion companion = Result.Companion;
            dVar4.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        this.f333504f.f333486q = null;
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "bindSurface finish,thread-id:[" + Process.myTid() + "] name:" + Thread.currentThread().getName());
        return C13598b0.f38549a;
    }
}
