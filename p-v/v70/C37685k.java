package v70;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$pause$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.k */
public final class C37685k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f99870d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f99871e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37685k(C111389d dVar, C15601d<? super C37685k> dVar2) {
        super(2, dVar2);
        this.f99871e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C37685k kVar = new C37685k(this.f99871e, dVar);
        kVar.f99870d = obj;
        return kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C37685k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "pause hash:" + ((C0000n0) this.f99870d).hashCode());
        this.f99871e.f333488s = true;
        return C13598b0.f38549a;
    }
}
