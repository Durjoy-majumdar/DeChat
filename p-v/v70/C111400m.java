package v70;

import a14.C0000n0;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Process;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import g80.C107768c;
import gy3.C8480h;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import u80.C111141c;
import u80.C111143e;
import u80.C111144f;
import w80.C111742d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$setUpGLEnv$1", mo125469f = "GLEnvBuilder.kt", mo125470l = {130}, mo125471m = "invokeSuspend")
/* renamed from: v70.m */
public final class C111400m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f333516d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f333517e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111400m(C111389d dVar, C15601d<? super C111400m> dVar2) {
        super(2, dVar2);
        this.f333517e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111400m(this.f333517e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111400m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f333516d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f333517e.f333484o = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, 1, 1, (EGLContext) null, 16, (Object) null);
            C111389d dVar = this.f333517e;
            C107768c cVar = dVar.f333483n;
            cVar.f322538f = dVar.f333484o;
            this.f333516d = 1;
            cVar.getClass();
            Log.m105924i("MicroMsg.Camera.CameraRenderPipeline", "setUpInGLEnv");
            cVar.f322539g = new C111144f(0, 0, 0, 0, 2, 2);
            cVar.f322540h = new C111141c(0, 0, 0, 0, 2, 2);
            cVar.f322541i = new C111143e(0, 0, 0, 0, 0, 0, 48, (C8480h) null);
            C111387b bVar = cVar.f322542j;
            if (bVar != null) {
                obj2 = bVar.mo149731i(this);
                if (obj2 != aVar) {
                    obj2 = C13598b0.f38549a;
                }
            } else {
                obj2 = C13598b0.f38549a;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15601d<? super C13598b0> dVar2 = this.f333517e.f333486q;
        if (dVar2 != null) {
            Result.Companion companion = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        this.f333517e.f333486q = null;
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "gl env set up finish,thread-id:[" + Process.myTid() + "] name:" + Thread.currentThread().getName());
        return C13598b0.f38549a;
    }
}
