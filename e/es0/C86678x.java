package es0;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84657x;
import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: es0.x */
public final class C86678x {
    /* renamed from: a */
    public static final void m107496a(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        C87412m.m108594g(appBrandRecommendUILogic, "<this>");
        if (appBrandRecommendUILogic.f247000i.mo121055G4().isEmpty()) {
            C84657x e = appBrandRecommendUILogic.mo117376e();
            String q = C76577a.m92166q(appBrandRecommendUILogic.f246996e, C0966R.string.f7844tj);
            C87412m.m108593f(q, "getString(context, R.str…ommend_null_list_wording)");
            C87412m.m108594g(e, "<this>");
            ((TextView) e.f246975a.findViewById(C0966R.C0970id.kve)).setText(q);
            return;
        }
        C84657x e2 = appBrandRecommendUILogic.mo117376e();
        String q2 = C76577a.m92166q(appBrandRecommendUILogic.f246996e, C0966R.string.f7743q7);
        C87412m.m108593f(q2, "getString(context, R.str…ents_list_footer_no_more)");
        C87412m.m108594g(e2, "<this>");
        ((TextView) e2.f246975a.findViewById(C0966R.C0970id.kve)).setText(q2);
    }

    /* renamed from: b */
    public static final void m107497b(AppBrandRecommendUILogic appBrandRecommendUILogic, boolean z) {
        C87412m.m108594g(appBrandRecommendUILogic, "<this>");
        appBrandRecommendUILogic.mo117377g().mo63430I(z);
    }

    /* renamed from: c */
    public static final void m107498c(AppBrandRecommendUILogic appBrandRecommendUILogic, boolean z) {
        C87412m.m108594g(appBrandRecommendUILogic, "<this>");
        if (!z) {
            m107496a(appBrandRecommendUILogic);
        }
        appBrandRecommendUILogic.mo117376e().mo117364a(z);
    }
}
