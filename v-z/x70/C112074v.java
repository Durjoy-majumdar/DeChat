package x70;

import a14.C0000n0;
import a80.C103327c;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitUIChange$updateScreenRotate$1", mo125469f = "CameraKitUIChange.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
/* renamed from: x70.v */
public final class C112074v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335511d;

    /* renamed from: e */
    public final /* synthetic */ C112069u f335512e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112074v(C112069u uVar, C15601d<? super C112074v> dVar) {
        super(2, dVar);
        this.f335512e = uVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112074v(this.f335512e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112074v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335511d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C103327c cVar = this.f335512e.f335420e;
            if (cVar != null) {
                this.f335511d = 1;
                if (cVar.mo143106k(this) == aVar) {
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
