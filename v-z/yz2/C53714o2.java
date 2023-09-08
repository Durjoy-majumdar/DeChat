package yz2;

import android.app.Activity;
import androidx.lifecycle.C39622i0;
import androidx.viewpager.widget.ViewPager;
import az2.C39674e;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import uy2.C52665g;

/* renamed from: yz2.o2 */
public final class C53714o2 extends TabLayout.C39996i {

    /* renamed from: b */
    public final /* synthetic */ C53700n2 f150822b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53714o2(ViewPager viewPager, C53700n2 n2Var) {
        super(viewPager);
        this.f150822b = n2Var;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onTabUnSelected() called with: tab = ");
        int i = -1;
        sb.append(fVar != null ? fVar.f154604e : -1);
        Log.m105918d("MicroMsg.TextStatus.TextStatusPagerUIC", sb.toString());
        int i2 = fVar != null ? fVar.f154604e : -1;
        if (i2 == 0) {
            C53700n2 n2Var = this.f150822b;
            n2Var.f150800j = fVar != null ? C53700n2.m60208c3(n2Var, fVar) : 0;
        } else if (i2 == 1) {
            C53700n2 n2Var2 = this.f150822b;
            n2Var2.f150799i = fVar != null ? C53700n2.m60208c3(n2Var2, fVar) : 0;
        }
        if (fVar != null) {
            C53700n2.m60209d3(this.f150822b, fVar, false);
        }
        C53700n2 n2Var3 = this.f150822b;
        int i3 = fVar != null ? fVar.f154604e : -1;
        n2Var3.getClass();
        if (i3 == 0) {
            C39674e eVar = C39674e.f106452d;
            int e = C31543z5.m39455e();
            eVar.getClass();
            Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markLikeTabShown() called");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, Integer.valueOf(e));
        } else if (i3 == 1) {
            C39674e eVar2 = C39674e.f106452d;
            int e2 = C31543z5.m39455e();
            eVar2.getClass();
            Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markConvTabShown() called");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, Integer.valueOf(e2));
        }
        if ((fVar != null ? fVar.f154604e : -1) == 1) {
            C39674e.f106452d.mo62241N0();
        }
        C53700n2 n2Var4 = this.f150822b;
        if (fVar != null) {
            i = fVar.f154604e;
        }
        n2Var4.mo74293i3(i);
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        int i;
        int i2;
        C87412m.m108594g(fVar, "tab");
        this.f107222a.setCurrentItem(fVar.f154604e);
        Log.m105918d("MicroMsg.TextStatus.TextStatusPagerUIC", "onTabSelected() called with: tab = " + fVar.f154604e + ' ' + this.f150822b.f150797g);
        C53700n2 n2Var = this.f150822b;
        if (!n2Var.f150797g) {
            int i3 = fVar.f154604e;
            if (i3 == 0) {
                int c3 = C53700n2.m60208c3(n2Var, fVar);
                i = this.f150822b.f150799i;
                i2 = c3;
            } else if (i3 != 1) {
                i2 = 0;
                i = 0;
            } else {
                int c35 = C53700n2.m60208c3(n2Var, fVar);
                i2 = this.f150822b.f150800j;
                i = c35;
            }
            Activity context = this.f150822b.getContext();
            C87412m.m108594g(context, "context");
            C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52665g.class);
            C87412m.m108593f(a, "UICProvider.of(context).…tusReportUIC::class.java)");
            C52665g gVar = (C52665g) a;
            C52665g.m59047c3(gVar, fVar.f154604e == 0 ? 2 : 3, i2, i, 0, 8, (Object) null);
            gVar.f147058e++;
        }
        C53700n2.m60209d3(this.f150822b, fVar, true);
    }
}
