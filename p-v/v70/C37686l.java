package v70;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$resume$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.l */
public final class C37686l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f99872d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f99873e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37686l(C111389d dVar, C15601d<? super C37686l> dVar2) {
        super(2, dVar2);
        this.f99873e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C37686l lVar = new C37686l(this.f99873e, dVar);
        lVar.f99872d = obj;
        return lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C37686l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "resume hash:" + ((C0000n0) this.f99872d).hashCode());
        this.f99873e.f333488s = false;
        return C13598b0.f38549a;
    }
}
