package mo1;

import android.content.Intent;
import android.view.View;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p823sg.C101614i;
import te3.C64586nn1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: mo1.f0 */
public final class C10997f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32707d;

    public C10997f0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32707d = finderProfileHeaderUIC;
    }

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleFansLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66785b bVar = C66785b.f191882e;
        C54446b c = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
        int i = c != null ? c.field_fansAddCount : 0;
        if (i > 0) {
            C7335d c2 = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32707d;
            C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
            C58417y0.Nx0((C58417y0) c2, "3", 1, 2, 5, 3, i, (String) null, (String) null, 0, finderProfileHeaderUIC.getContextObj(), 0, 0, 3520, (Object) null);
        }
        C54447c cVar = new C54447c(bVar.mo90662O5());
        cVar.field_fansAddCount = 0;
        bVar.mo90672m1(cVar, C39759i.ACCOUNT_MODIFY);
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("AuthorProfileFans");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("AuthorProfileFans");
        FinderProfileHeaderUIC finderProfileHeaderUIC2 = this.f32707d;
        if (!(G5 == null || R5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C101614i<String, FinderProfileHeaderUIC.C3463b> iVar2 = FinderProfileHeaderUIC.f16192h1;
            C58413v0.m67781i(v0Var, "3", G5, R5, 2, finderProfileHeaderUIC2.getContextObj(), 0, (String) null, 0, 0, 480, (Object) null);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("AuthorProfileFans");
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).Gx0(this.f32707d.getActivity(), (Intent) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleFansLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
