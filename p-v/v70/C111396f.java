package v70;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107261i;
import fy3.C32227p;
import g80.C107768c;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$bufferUpdateFrame$2$1", mo125469f = "GLEnvBuilder.kt", mo125470l = {98}, mo125471m = "invokeSuspend")
/* renamed from: v70.f */
public final class C111396f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f333507d;

    /* renamed from: e */
    public final /* synthetic */ C111389d f333508e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f333509f;

    /* renamed from: g */
    public final /* synthetic */ C15601d<C13598b0> f333510g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111396f(C111389d dVar, byte[] bArr, C15601d<? super C13598b0> dVar2, C15601d<? super C111396f> dVar3) {
        super(2, dVar3);
        this.f333508e = dVar;
        this.f333509f = bArr;
        this.f333510g = dVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111396f(this.f333508e, this.f333509f, this.f333510g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111396f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f333507d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C107261i iVar = this.f333508e.f333482j.f320923b;
            C107768c cVar = this.f333508e.f333483n;
            byte[] bArr = this.f333509f;
            int i2 = iVar.f320920a;
            int i3 = iVar.f320921b;
            this.f333507d = 1;
            if (cVar.mo158198j(bArr, i2, i3, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15601d<C13598b0> dVar = this.f333510g;
        Result.Companion companion = Result.Companion;
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.resumeWith(Result.m168114constructorimpl(b0Var));
        Log.m105926v("MicroMsg.Camera.GLEnvBuilder", "render yuv finish");
        return b0Var;
    }
}
