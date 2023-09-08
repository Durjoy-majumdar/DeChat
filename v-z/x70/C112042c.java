package x70;

import a14.C0000n0;
import a80.C103327c;
import android.content.Context;
import b80.C104043f;
import c80.C104306e;
import com.tencent.p014mm.media.camera.lifecycle.CameraLifecycleProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import d80.C107007b;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import v70.C111389d;
import wx3.C15601d;
import xx3.C15911a;
import y70.C38971a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKit$setUpCamera$1", mo125469f = "CameraKit.kt", mo125470l = {33, 34}, mo125471m = "invokeSuspend")
/* renamed from: x70.c */
public final class C112042c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f335414d;

    /* renamed from: e */
    public int f335415e;

    /* renamed from: f */
    public final /* synthetic */ C112043d f335416f;

    /* renamed from: g */
    public final /* synthetic */ Context f335417g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112042c(C112043d dVar, Context context, C15601d<? super C112042c> dVar2) {
        super(2, dVar2);
        this.f335416f = dVar;
        this.f335417g = context;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112042c(this.f335416f, this.f335417g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112042c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C112043d dVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335415e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Camera.CameraKit", "setUpCamera");
            dVar = this.f335416f;
            if (dVar.f335420e != null) {
                Log.m105928w("MicroMsg.Camera.CameraKit", "cameraInstance already setup,ignore operate");
                return C13598b0.f38549a;
            }
            this.f335414d = dVar;
            this.f335415e = 1;
            int i2 = C112043d.f335418v;
            dVar.getClass();
            int b = C38971a.f104993a.mo61854b();
            obj = b != 1 ? b != 2 ? b != 3 ? new C107007b(dVar.f335482s, dVar.f335419d) : new C107007b(dVar.f335482s, dVar.f335419d) : new C104306e(dVar.f335482s, dVar.f335419d) : new C104043f(dVar.f335482s, dVar.f335419d);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            dVar = (C112043d) this.f335414d;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Camera.CameraKit", "setUpCamera cameraInstance:" + this.f335416f.f335420e);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar.f335420e = (C103327c) obj;
        C112043d dVar2 = this.f335416f;
        C103327c cVar = dVar2.f335420e;
        if (cVar != null) {
            Context context = this.f335417g;
            CameraLifecycleProxy cameraLifecycleProxy = dVar2.f335451t;
            C111389d p = dVar2.mo163767p();
            C112043d dVar3 = this.f335416f;
            this.f335414d = null;
            this.f335415e = 2;
            if (cVar.mo143107l(context, cameraLifecycleProxy, p, dVar3, this) == aVar) {
                return aVar;
            }
        }
        Log.m105924i("MicroMsg.Camera.CameraKit", "setUpCamera cameraInstance:" + this.f335416f.f335420e);
        return C13598b0.f38549a;
    }
}
