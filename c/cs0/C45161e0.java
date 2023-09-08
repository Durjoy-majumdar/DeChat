package cs0;

import a14.C0000n0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.v75;
import te3.w75;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.revoke.UserInfoRevokeViewModel$onRevokeBtnClick$1", mo125469f = "UserInfoRevokeViewModel.kt", mo125470l = {73, 79}, mo125471m = "invokeSuspend")
/* renamed from: cs0.e0 */
public final class C45161e0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f122451d;

    /* renamed from: e */
    public final /* synthetic */ C45164f0 f122452e;

    /* renamed from: f */
    public final /* synthetic */ C45166g0 f122453f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45161e0(C45164f0 f0Var, C45166g0 g0Var, C15601d<? super C45161e0> dVar) {
        super(2, dVar);
        this.f122452e = f0Var;
        this.f122453f = g0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45161e0(this.f122452e, this.f122453f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45161e0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f122451d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f122452e.f122464i.setValue(C45155b0.DOING);
            C45166g0 g0Var = this.f122453f;
            w75 w75 = g0Var.f122468b;
            if (w75 != null) {
                C45152a0 a0Var = C45152a0.f122426a;
                String str = g0Var.f122467a.f143915d;
                String str2 = w75.f143915d;
                String str3 = g0Var.f122469c.f141804d;
                this.f122451d = 1;
                if (a0Var.mo70659d(str, str2, str3, this) == aVar) {
                    return aVar;
                }
            } else {
                C45152a0 a0Var2 = C45152a0.f122426a;
                String str4 = g0Var.f122467a.f143915d;
                String str5 = g0Var.f122469c.f141804d;
                this.f122451d = 2;
                if (a0Var2.mo70658c(str4, str5, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1 || i == 2) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onRevokeBtnClick, revoke fail since " + e);
                this.f122452e.f122464i.setValue(C45155b0.FAILURE);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f122453f.f122469c.f141806f = 7;
        C54219z<v75> zVar = this.f122452e.f122460e;
        zVar.setValue(zVar.getValue());
        this.f122452e.f122464i.setValue(C45155b0.SUCCESS);
        return C13598b0.f38549a;
    }
}
