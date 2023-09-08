package t51;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p51.C110175b;
import p821rk.C48035h;
import q51.C47757d;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggViewModel$loadMaterial$resp$1", mo125469f = "SpringLuckyEggViewModel.kt", mo125470l = {104}, mo125471m = "invokeSuspend")
/* renamed from: t51.v */
public final class C110934v extends C91594j implements C32227p<C0000n0, C15601d<? super C48035h>, Object> {

    /* renamed from: d */
    public int f331781d;

    /* renamed from: e */
    public final /* synthetic */ C110935w f331782e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110934v(C110935w wVar, C15601d<? super C110934v> dVar) {
        super(2, dVar);
        this.f331782e = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110934v(this.f331782e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110934v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f331781d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C47757d dVar = new C47757d(this.f331782e.f331784e, "", 0, "");
            this.f331781d = 1;
            obj = C110175b.m149770a(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
