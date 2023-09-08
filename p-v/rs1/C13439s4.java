package rs1;

import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import pe1.C35464c;
import rs1.C13392r4;
import te3.C48736am1;
import up1.C37521f;

/* renamed from: rs1.s4 */
public final class C13439s4 implements TabLayout.C104470c<TabLayout.C55061f> {

    /* renamed from: a */
    public final /* synthetic */ C13392r4 f38055a;

    public C13439s4(C13392r4 r4Var) {
        this.f38055a = r4Var;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        WeImageView weImageView;
        C87412m.m108594g(fVar, "t");
        Object obj = fVar.f154600a;
        if (obj instanceof C13392r4.C13393a) {
            C13392r4.C13393a aVar = (C13392r4.C13393a) obj;
            aVar.mo12808b(this.f38055a.getContext().getResources().getColor(C0966R.color.f3596yx), true);
            aVar.mo12807a(false);
            int i = aVar.f37958b;
            if (i == 1) {
                WeImageView weImageView2 = aVar.f37960d;
                if (weImageView2 != null) {
                    Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 1, false, 2, (Object) null);
                    weImageView2.setImageResource(c0 != null ? c0.intValue() : C0966R.raw.icons_outlined_little_like);
                }
            } else if (i == 2 && (weImageView = aVar.f37960d) != null) {
                weImageView.setImageResource(C0966R.raw.icons_outlined_location);
            }
        }
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        WeImageView weImageView;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(fVar, "t");
        Object obj = fVar.f154600a;
        if (obj instanceof C13392r4.C13393a) {
            C13392r4.C13393a aVar = (C13392r4.C13393a) obj;
            boolean z = false;
            aVar.mo12808b(this.f38055a.getContext().getResources().getColor(C0966R.color.f3593yt), false);
            aVar.mo12807a(true);
            C48736am1 am12 = this.f38055a.mo12804j3().f34361h;
            C13392r4 r4Var = this.f38055a;
            am12.f130634i = 0;
            am12.f130633h = r4Var.mo12804j3().f34363j;
            am12.f130632g = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("TLRecommendTab") != null;
            am12.f130631f = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("TLFollow") != null;
            am12.f130630e = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("finder_tl_hot_tab") != null;
            am12.f130629d = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderEntrance") != null;
            C39818r rVar = C39818r.f106831a;
            ((FinderHomeUIC) rVar.mo62444c(this.f38055a.getActivity()).mo75002a(FinderHomeUIC.class)).mo5135k3(aVar.f37958b, (Bundle) null);
            int i = aVar.f37958b;
            if (i == 1) {
                WeImageView weImageView2 = aVar.f37960d;
                if (weImageView2 != null) {
                    Integer b0 = C58784w3.f168295a.mo83917b0(1, true);
                    weImageView2.setImageResource(b0 != null ? b0.intValue() : C0966R.raw.icons_filled_little_like);
                }
            } else if (i == 2 && (weImageView = aVar.f37960d) != null) {
                weImageView.setImageResource(C0966R.raw.icons_filled_location);
            }
            C37521f.f99374d.getClass();
            C35464c<Integer> cVar = C37521f.f99315W0;
            if ((cVar.mo60266n().intValue() == 1 || cVar.mo60266n().intValue() == 2) && !this.f38055a.mo12805k3()) {
                View findViewById = this.f38055a.findViewById(C0966R.C0970id.m1o);
                if (findViewById != null) {
                    int i2 = aVar.f37958b == 3 ? 8 : 0;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$buildTab$2", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$buildTab$2", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C63575n3 n3Var = (C63575n3) rVar.mo62444c(this.f38055a.getActivity()).mo75002a(C63575n3.class);
                if (aVar.f37958b != 3) {
                    z = true;
                }
                n3Var.mo88427k3(z);
            }
        }
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
    }
}
