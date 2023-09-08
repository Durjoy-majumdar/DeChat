package x70;

import a14.C0000n0;
import a80.C103327c;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107255c;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate$switchToCamera$2", mo125469f = "CameraKitOperate.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: x70.r */
public final class C112064r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ boolean f335480d;

    /* renamed from: e */
    public final /* synthetic */ C112065s f335481e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112064r(boolean z, C112065s sVar, C15601d<? super C112064r> dVar) {
        super(2, dVar);
        this.f335480d = z;
        this.f335481e = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112064r(this.f335480d, this.f335481e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112064r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C107255c v;
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.CameraKit", "switchToCamera back:" + this.f335480d);
        C103327c cVar = this.f335481e.f335420e;
        if (cVar == null || (v = cVar.mo143116v()) == null) {
            return C13598b0.f38549a;
        }
        boolean z = v.f320908c;
        if ((!z && this.f335480d) || (z && !this.f335480d)) {
            C112065s sVar = this.f335481e;
            sVar.getClass();
            sVar.mo163062D("switchCamera", new C112062p(sVar, (C15601d<? super C112062p>) null));
        }
        return C13598b0.f38549a;
    }
}
