package v70;

import a14.C0000n0;
import android.graphics.SurfaceTexture;
import fy3.C32227p;
import g80.C107768c;
import kotlin.ResultKt;
import p80.C110194c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$availableListener$1$1", mo125469f = "GLEnvBuilder.kt", mo125470l = {88}, mo125471m = "invokeSuspend")
/* renamed from: v70.c */
public final class C111388c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f333474d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f333475e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111388c(C111389d dVar, C15601d<? super C111388c> dVar2) {
        super(2, dVar2);
        this.f333475e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111388c(this.f333475e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111388c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f333474d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SurfaceTexture surfaceTexture = this.f333475e.f333480h;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
            C111389d dVar = this.f333475e;
            if (!dVar.f333488s && dVar.f333490u) {
                if (dVar.f333489t) {
                    dVar.f333489t = false;
                    return C13598b0.f38549a;
                }
                C107768c cVar = dVar.f333483n;
                C110194c cVar2 = dVar.f333479g;
                this.f333474d = 1;
                if (cVar.mo158197h(cVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
