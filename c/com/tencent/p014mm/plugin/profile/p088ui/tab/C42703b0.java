package com.tencent.p014mm.plugin.profile.p088ui.tab;

import androidx.viewpager.widget.ViewPager;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import mf2.C34555d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.b0 */
public final class C42703b0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115642d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42703b0(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(1);
        this.f115642d = contactWidgetTabBizInfo;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue < ((ArrayList) this.f115642d.f115621w).size()) {
            ViewPager viewPager = this.f115642d.f115622x;
            if (viewPager != null) {
                viewPager.setCurrentItem(intValue, false);
                C34555d dVar = C34555d.f92946a;
                ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115642d;
                dVar.mo59636a(contactWidgetTabBizInfo.f115610i, intValue, contactWidgetTabBizInfo.f115612n, contactWidgetTabBizInfo.f115608g, contactWidgetTabBizInfo.mo66841d());
            } else {
                C87412m.m108603p("viewPager");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
