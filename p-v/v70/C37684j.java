package v70;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$jumpNextFrame$2$1", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.j */
public final class C37684j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C111389d f99868d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C13598b0> f99869e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37684j(C111389d dVar, C15601d<? super C13598b0> dVar2, C15601d<? super C37684j> dVar3) {
        super(2, dVar3);
        this.f99868d = dVar;
        this.f99869e = dVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C37684j(this.f99868d, this.f99869e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C37684j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f99868d.f333489t = true;
        C15601d<C13598b0> dVar = this.f99869e;
        Result.Companion companion = Result.Companion;
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.resumeWith(Result.m168114constructorimpl(b0Var));
        return b0Var;
    }
}
