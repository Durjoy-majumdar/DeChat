package x70;

import a14.C0000n0;
import a80.C103327c;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate$setLightTorch$1", mo125469f = "CameraKitOperate.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: x70.o */
public final class C112061o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C112065s f335474d;

    /* renamed from: e */
    public final /* synthetic */ boolean f335475e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112061o(C112065s sVar, boolean z, C15601d<? super C112061o> dVar) {
        super(2, dVar);
        this.f335474d = sVar;
        this.f335475e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112061o(this.f335474d, this.f335475e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112061o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C103327c cVar = this.f335474d.f335420e;
        boolean z = true;
        if (cVar == null || !cVar.mo143105g()) {
            z = false;
        }
        if (!z) {
            Log.m105920e("MicroMsg.Camera.CameraKit", "camera is not previewing, ignore setLightTorch");
            return C13598b0.f38549a;
        }
        Log.m105924i("MicroMsg.Camera.CameraKit", "setRecordStatus >> " + this.f335475e);
        C103327c cVar2 = this.f335474d.f335420e;
        if (cVar2 != null) {
            cVar2.setLightTorch(this.f335475e);
        }
        return C13598b0.f38549a;
    }
}
