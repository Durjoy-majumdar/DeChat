package v70;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107262j;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$updateScreenSize$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.r */
public final class C111405r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ int f333526d;

    /* renamed from: e */
    public final /* synthetic */ int f333527e;

    /* renamed from: f */
    public final /* synthetic */ C111389d f333528f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111405r(int i, int i2, C111389d dVar, C15601d<? super C111405r> dVar2) {
        super(2, dVar2);
        this.f333526d = i;
        this.f333527e = i2;
        this.f333528f = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111405r(this.f333526d, this.f333527e, this.f333528f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111405r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "setPreviewSize:[" + this.f333526d + ' ' + this.f333527e + ']');
        C107262j jVar = this.f333528f.f333482j;
        int i = this.f333526d;
        int i2 = this.f333527e;
        if (!(jVar.f320922a.f320920a == i && jVar.f320922a.f320921b == i2)) {
            jVar.f320922a.f320920a = i;
            jVar.f320922a.f320921b = i2;
            jVar.mo157743a();
        }
        C15601d<? super C13598b0> dVar = this.f333528f.f333486q;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        this.f333528f.f333486q = null;
        return C13598b0.f38549a;
    }
}
