package ck2;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import nj2.C61759g;
import q40.C62580c;
import rx3.C13598b0;
import ve3.C65684l0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalDataUIC$replaceRingtone$2$1", mo125469f = "RingtoneGlobalDataUIC.kt", mo125470l = {97}, mo125471m = "invokeSuspend")
/* renamed from: ck2.t */
public final class C54927t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153944d;

    /* renamed from: e */
    public final /* synthetic */ C65684l0 f153945e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f153946f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54927t(C65684l0 l0Var, C15601d<? super Boolean> dVar, C15601d<? super C54927t> dVar2) {
        super(2, dVar2);
        this.f153945e = l0Var;
        this.f153946f = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54927t(this.f153945e, this.f153946f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54927t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153944d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61759g.C61760a aVar2 = C61759g.f175551f;
            C65684l0 l0Var = this.f153945e;
            int i2 = l0Var.f189016e;
            int i3 = l0Var.f189017f;
            this.f153944d = 1;
            obj = aVar2.mo86681e(1, 1, l0Var, i2, i3, 0, "", this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15601d<Boolean> dVar = this.f153946f;
        if (((C62580c) obj).f177733a) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            Result.Companion companion2 = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        return C13598b0.f38549a;
    }
}
