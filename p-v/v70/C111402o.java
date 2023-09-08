package v70;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$updateInputMirror$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.o */
public final class C111402o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ boolean f333519d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f333520e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111402o(boolean z, C111389d dVar, C15601d<? super C111402o> dVar2) {
        super(2, dVar2);
        this.f333519d = z;
        this.f333520e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111402o(this.f333519d, this.f333520e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111402o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "setMirror:" + this.f333519d);
        this.f333520e.f333482j.f320926e = this.f333519d;
        return C13598b0.f38549a;
    }
}
