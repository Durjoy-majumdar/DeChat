package b80;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl$checkListenerCreated$1$callback$2", mo125469f = "Camera1Impl.kt", mo125470l = {87}, mo125471m = "invokeSuspend")
/* renamed from: b80.e */
public final class C104042e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f307699d;

    /* renamed from: e */
    public final /* synthetic */ C104043f f307700e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104042e(C104043f fVar, C15601d<? super C104042e> dVar) {
        super(2, dVar);
        this.f307700e = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C104042e(this.f307700e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C104042e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f307699d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Camera.Camera1Impl", "GrabStartPreview");
            C104043f fVar = this.f307700e;
            Boolean valueOf = Boolean.valueOf(fVar.mo143099B());
            this.f307699d = 1;
            if (fVar.mo143112q(valueOf, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
