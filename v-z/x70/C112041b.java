package x70;

import a14.C0000n0;
import a80.C103327c;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107254b;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKit$setCameraKitSetting$1", mo125469f = "CameraKit.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: x70.b */
public final class C112041b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C112043d f335412d;

    /* renamed from: e */
    public final /* synthetic */ C107254b f335413e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112041b(C112043d dVar, C107254b bVar, C15601d<? super C112041b> dVar2) {
        super(2, dVar2);
        this.f335412d = dVar;
        this.f335413e = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112041b(this.f335412d, this.f335413e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112041b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C103327c cVar = this.f335412d.f335420e;
        if (cVar == null) {
            Log.m105920e("MicroMsg.Camera.CameraKit", "camera has not created:" + this.f335413e);
            return C13598b0.f38549a;
        }
        boolean z = true;
        if (cVar == null || !cVar.mo143105g()) {
            z = false;
        }
        if (z) {
            Log.m105920e("MicroMsg.Camera.CameraKit", "camera already start,ignore set:" + this.f335413e);
            return C13598b0.f38549a;
        }
        C107254b bVar = this.f335413e;
        if (bVar != null) {
            C112043d dVar = this.f335412d;
            C103327c cVar2 = dVar.f335420e;
            if (cVar2 != null) {
                cVar2.mo143113r(bVar);
            }
            dVar.mo163767p().getClass();
        }
        return C13598b0.f38549a;
    }
}
