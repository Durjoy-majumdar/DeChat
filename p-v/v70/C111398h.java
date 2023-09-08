package v70;

import a14.C0000n0;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$getGLInputSurface$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {289}, mo125471m = "invokeSuspend")
/* renamed from: v70.h */
public final class C111398h extends C91594j implements C32227p<C0000n0, C15601d<? super Surface>, Object> {

    /* renamed from: d */
    public int f333512d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f333513e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111398h(C111389d dVar, C15601d<? super C111398h> dVar2) {
        super(2, dVar2);
        this.f333513e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111398h(this.f333513e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111398h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f333512d;
        Integer num = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Surface surface = this.f333513e.f333481i;
            boolean z = false;
            if (surface != null && surface.isValid()) {
                z = true;
            }
            if (!z) {
                C111389d dVar = this.f333513e;
                this.f333512d = 1;
                dVar.getClass();
                if (dVar.mo163058p("getGLInputTexture", new C111399i(dVar, true, (C15601d<? super C111399i>) null), this) == aVar) {
                    return aVar;
                }
            }
            return this.f333513e.f333481i;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f333513e.f333481i = new Surface(this.f333513e.f333480h);
        StringBuilder sb = new StringBuilder();
        sb.append("create texture:[");
        sb.append(this.f333513e.f333479g);
        sb.append("] surface:[");
        Surface surface2 = this.f333513e.f333481i;
        if (surface2 != null) {
            num = new Integer(surface2.hashCode());
        }
        sb.append(num);
        sb.append("] name:");
        sb.append(Thread.currentThread().getName());
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", sb.toString());
        return this.f333513e.f333481i;
    }
}
