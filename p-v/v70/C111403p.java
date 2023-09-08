package v70;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107262j;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$updateInputRotate$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.p */
public final class C111403p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ int f333521d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f333522e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111403p(int i, C111389d dVar, C15601d<? super C111403p> dVar2) {
        super(2, dVar2);
        this.f333521d = i;
        this.f333522e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111403p(this.f333521d, this.f333522e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111403p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "setRotate:" + this.f333521d);
        C107262j jVar = this.f333522e.f333482j;
        jVar.f320925d = this.f333521d;
        jVar.mo157743a();
        return C13598b0.f38549a;
    }
}
