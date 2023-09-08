package t51;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import p51.C110174a;
import p51.C110175b;
import p821rk.C48039l;
import q51.C47754a;
import r51.C110502a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggViewModel$acceptCoupon$1", mo125469f = "SpringLuckyEggViewModel.kt", mo125470l = {166}, mo125471m = "invokeSuspend")
/* renamed from: t51.r */
public final class C110929r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f331767d;

    /* renamed from: e */
    public final /* synthetic */ String f331768e;

    /* renamed from: f */
    public final /* synthetic */ String f331769f;

    /* renamed from: g */
    public final /* synthetic */ C110935w f331770g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110929r(String str, String str2, C110935w wVar, C15601d<? super C110929r> dVar) {
        super(2, dVar);
        this.f331768e = str;
        this.f331769f = str2;
        this.f331770g = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110929r(this.f331768e, this.f331769f, this.f331770g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110929r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C110502a aVar = C110502a.Failed;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f331767d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f331768e;
            String str2 = this.f331769f;
            String str3 = this.f331770g.f331786g;
            if (str3 == null) {
                str3 = "";
            }
            C47754a aVar3 = new C47754a(str, str2, "CNY_EXPRESSION", str3);
            this.f331767d = 1;
            obj = C110175b.m149770a(aVar3, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C110174a e) {
                C110935w wVar = this.f331770g;
                wVar.getClass();
                if (e.f329596d > 0) {
                    wVar.f331789j.postValue(C110502a.Denied);
                } else {
                    wVar.f331789j.postValue(aVar);
                }
                Log.m105928w("MicroMsg.SpringLuckyEggViewModel", "Unable to accept money");
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C48039l lVar = (C48039l) obj;
        Log.m105928w("MicroMsg.SpringLuckyEggViewModel", "accept coupon result: " + lVar.f128854d);
        if (lVar.f128854d == 0) {
            this.f331770g.f331795s.setValue(Boolean.TRUE);
            this.f331770g.f331789j.postValue(C110502a.Succeed);
        } else {
            this.f331770g.f331789j.postValue(aVar);
        }
        return C13598b0.f38549a;
    }
}
