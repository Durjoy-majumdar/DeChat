package mo1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C58413v0;
import gy3.C87412m;
import p823sg.C101614i;
import te3.C64586nn1;
import zp3.C23555k;

/* renamed from: mo1.s0 */
public final class C11050s0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C2479n0.C2480a f32803a;

    /* renamed from: b */
    public final /* synthetic */ FinderProfileHeaderUIC f32804b;

    public C11050s0(C2479n0.C2480a aVar, FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32803a = aVar;
        this.f32804b = finderProfileHeaderUIC;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        View view2 = view;
        C87412m.m108594g(view, "view");
        if (z) {
            C2479n0.C2480a aVar = this.f32803a;
            C55718s0 s0Var = aVar.f12910c;
            C64586nn1 nn12 = aVar.f12909b;
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32804b;
            if (s0Var != null && nn12 != null) {
                C58413v0 v0Var = C58413v0.f167346a;
                C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
                C58413v0.m67781i(v0Var, "3", s0Var, nn12, 1, finderProfileHeaderUIC.getContextObj(), 0, (String) null, 0, 0, 480, (Object) null);
            }
        }
    }
}
