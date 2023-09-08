package rs1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C8478d0;
import kotlin.ResultKt;
import q62.C101048b;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderWifiHintUIC$checkShowNotWifiHint$1", mo125469f = "FinderWifiHintUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rs1.fb */
public final class C36472fb extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63555gb f97046d;

    /* renamed from: e */
    public final /* synthetic */ boolean f97047e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36472fb(C63555gb gbVar, boolean z, C15601d<? super C36472fb> dVar) {
        super(2, dVar);
        this.f97046d = gbVar;
        this.f97047e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C36472fb(this.f97046d, this.f97047e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C36472fb) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C63555gb gbVar = this.f97046d;
        gbVar.getClass();
        if (!NetStatusUtil.isMobile(MMApplicationContext.getContext())) {
            Log.m105924i("FinderWifiHintUIC", "[checkShowNotWifiHint]: is not mobile data");
        } else {
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = C0966R.string.efc;
            Class cls = C101048b.class;
            int Pe = ((C101048b) C86312j.m106911c(cls)).mo60591Pe();
            C101048b bVar = (C101048b) C86312j.m106911c(cls);
            boolean z = false;
            int j = bVar != null ? bVar.Uo0() : false ? Pe == 0 ? C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_NOT_WIFI_HINT_WK_TYPE_INT_SYNC, 0) : Pe : 0;
            if (j == 3) {
                z = true;
            }
            Log.m105924i("FinderWifiHintUIC", "[isFreeSimCard] result: " + z + ", wkType: " + j + " getWkType:" + Pe);
            if (z) {
                d0Var.f27483d = C0966R.string.d6_;
            }
            C53895h.m60466d(gbVar.getMainScope(), (C66212f) null, (C53934p0) null, new C36476hb(gbVar, d0Var, 3000, (C15601d<? super C36476hb>) null), 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
