package com.tencent.p014mm.plugin.profile.p088ui.tab;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.DialogContactInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController;
import gy3.C87412m;
import ht1.C46107h1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.d0 */
public final class C42707d0 implements ContactWidgetTabBizHeaderController.C42686g {

    /* renamed from: a */
    public final /* synthetic */ ContactWidgetTabBizInfo f115648a;

    public C42707d0(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f115648a = contactWidgetTabBizInfo;
    }

    /* renamed from: a */
    public void mo66837a() {
        ViewPager viewPager = this.f115648a.f115622x;
        if (viewPager != null) {
            int currentItem = viewPager.getCurrentItem();
            ViewPager viewPager2 = this.f115648a.f115622x;
            if (viewPager2 == null) {
                C87412m.m108603p("viewPager");
                throw null;
            } else if (viewPager2.getCurrentItem() <= ((ArrayList) this.f115648a.f115621w).size() - 1) {
                ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115648a;
                List<Fragment> list = contactWidgetTabBizInfo.f115621w;
                ArrayList<Fragment> arrayList = new ArrayList<>();
                for (T next : list) {
                    if (!C87412m.m108589b((Fragment) next, ((ArrayList) contactWidgetTabBizInfo.f115621w).get(currentItem))) {
                        arrayList.add(next);
                    }
                }
                for (Fragment fragment : arrayList) {
                    C46107h1 h1Var = fragment instanceof C46107h1 ? (C46107h1) fragment : null;
                    if (h1Var != null) {
                        h1Var.mo66873C();
                    }
                }
            }
        } else {
            C87412m.m108603p("viewPager");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo66838b(boolean z) {
        this.f115648a.mo66844g(z, false);
    }

    /* renamed from: c */
    public boolean mo66839c() {
        ContactInfoUI contactInfoUI = this.f115648a.f115605d;
        contactInfoUI.getClass();
        return contactInfoUI instanceof DialogContactInfoUI;
    }
}
