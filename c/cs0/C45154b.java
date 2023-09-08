package cs0;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage$Companion$start$1", mo125469f = "AppBrandUserInfoRevokePage.kt", mo125470l = {67}, mo125471m = "invokeSuspend")
/* renamed from: cs0.b */
public final class C45154b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f122432d;

    /* renamed from: e */
    public final /* synthetic */ String f122433e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45154b(String str, C15601d<? super C45154b> dVar) {
        super(2, dVar);
        this.f122433e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45154b(this.f122433e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45154b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f122432d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45152a0 a0Var = C45152a0.f122426a;
            String str = this.f122433e;
            this.f122432d = 1;
            if (a0Var.mo70656a(str, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "start, getUsageInfo fail since " + e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
