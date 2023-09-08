package d80;

import a14.C0000n0;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$buildCameraUsage$2$1$1$1$2$1", mo125469f = "CameraXImpl.kt", mo125470l = {178}, mo125471m = "invokeSuspend")
/* renamed from: d80.d */
public final class C58244d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f166776d;

    /* renamed from: e */
    public final /* synthetic */ C107007b f166777e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58244d(C107007b bVar, C15601d<? super C58244d> dVar) {
        super(2, dVar);
        this.f166777e = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C58244d(this.f166777e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58244d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f166776d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C32226l<? super C15601d<? super C13598b0>, ? extends Object> lVar = this.f166777e.f320331B;
            if (lVar != null) {
                this.f166776d = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f166777e.f320331B = null;
        return C13598b0.f38549a;
    }
}
