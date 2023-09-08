package cs0;

import a14.C0000n0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.utils.C2036f1;
import cs0.C45168h0;
import cs0.C45174j;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.revoke.UserInfoManageAreaAdapter$onBindViewHolder$3$1", mo125469f = "AppBrandUserInfoRevokePage.kt", mo125470l = {493}, mo125471m = "invokeSuspend")
/* renamed from: cs0.u */
public final class C45195u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f122511d;

    /* renamed from: e */
    public final /* synthetic */ C45174j f122512e;

    /* renamed from: f */
    public final /* synthetic */ C45168h0 f122513f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45195u(C45174j jVar, C45168h0 h0Var, C15601d<? super C45195u> dVar) {
        super(2, dVar);
        this.f122512e = jVar;
        this.f122513f = h0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45195u(this.f122512e, this.f122513f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45195u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f122511d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = C85875k4.m106211z() ? ((C45174j.C45178d) this.f122512e).f122484a.f122469c.f141808h : ((C45174j.C45178d) this.f122512e).f122484a.f122469c.f141807g;
            if (str == null) {
                str = ((C45174j.C45178d) this.f122512e).f122484a.f122469c.f141807g;
            }
            if (str != null) {
                WeImageView weImageView = ((C45168h0.C45172d) this.f122513f).f122479z;
                this.f122511d = 1;
                if (C2036f1.m1986a(str, weImageView, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
