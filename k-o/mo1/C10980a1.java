package mo1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: mo1.a1 */
public final class C10980a1 extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32681d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f32682e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10980a1(FinderProfileHeaderUIC finderProfileHeaderUIC, C58969q qVar) {
        super(1);
        this.f32681d = finderProfileHeaderUIC;
        this.f32682e = qVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32681d;
        C58969q qVar = this.f32682e;
        if (finderProfileHeaderUIC.f16217U0 == null) {
            C77407n nVar = new C77407n((Context) finderProfileHeaderUIC.getContext(), 1, true);
            nVar.mo107568m(finderProfileHeaderUIC.getContext().getResources().getString(C0966R.string.d2s), 17, 0);
            nVar.f225771i = new C11068y(finderProfileHeaderUIC);
            nVar.f225782p = new C11070z(finderProfileHeaderUIC, qVar);
            nVar.f225761d = new C10979a0(finderProfileHeaderUIC);
            finderProfileHeaderUIC.f16217U0 = nVar;
        }
        C77407n nVar2 = finderProfileHeaderUIC.f16217U0;
        if (nVar2 != null && !nVar2.mo107563h()) {
            nVar2.mo107573q();
        }
        return C13598b0.f38549a;
    }
}
