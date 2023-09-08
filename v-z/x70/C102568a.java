package x70;

import a14.C0000n0;
import a80.C103327c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKit$preOpenCamera$1", mo125469f = "CameraKit.kt", mo125470l = {73}, mo125471m = "invokeSuspend")
/* renamed from: x70.a */
public final class C102568a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public long f302009d;

    /* renamed from: e */
    public int f302010e;

    /* renamed from: f */
    public final /* synthetic */ boolean f302011f;

    /* renamed from: g */
    public final /* synthetic */ C112043d f302012g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102568a(boolean z, C112043d dVar, C15601d<? super C102568a> dVar2) {
        super(2, dVar2);
        this.f302011f = z;
        this.f302012g = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C102568a(this.f302011f, this.f302012g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102568a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f302010e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Camera.CameraKit", "preOpenCamera:" + this.f302011f + ' ' + this.f302012g.f335420e);
            j = Util.currentTicks();
            C103327c cVar = this.f302012g.f335420e;
            if (cVar != null) {
                Boolean valueOf = Boolean.valueOf(this.f302011f);
                this.f302009d = j;
                this.f302010e = 1;
                if (cVar.mo143112q(valueOf, this) == aVar) {
                    return aVar;
                }
                j2 = j;
            }
            Log.m105924i("MicroMsg.Camera.CameraKit", "preOpenCamera cost:" + Util.ticksToNow(j));
            return C13598b0.f38549a;
        } else if (i == 1) {
            j2 = this.f302009d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = j2;
        Log.m105924i("MicroMsg.Camera.CameraKit", "preOpenCamera cost:" + Util.ticksToNow(j));
        return C13598b0.f38549a;
    }
}
