package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.service.C41490k1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C11184p0;
import o40.C61926c;
import te3.C49292ej1;
import te3.C50275lk0;
import te3.C50542nh0;

/* renamed from: com.tencent.mm.plugin.finder.ui.s0 */
public final class C41537s0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C50275lk0 f111845d;

    /* renamed from: e */
    public final /* synthetic */ FinderFansListUI f111846e;

    /* renamed from: com.tencent.mm.plugin.finder.ui.s0$a */
    public static final class C41538a implements C8794p5<C49292ej1> {

        /* renamed from: d */
        public final /* synthetic */ FinderFansListUI f111847d;

        public C41538a(FinderFansListUI finderFansListUI) {
            this.f111847d = finderFansListUI;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            String str;
            C49292ej1 ej12 = (C49292ej1) obj;
            C87412m.m108594g(ej12, "req");
            C87412m.m108594g(nh02, "ret");
            if (nh02.f138603e == 0 && (str = ej12.f132956d) != null) {
                FinderFansListUI finderFansListUI = this.f111847d;
                int i = FinderFansListUI.f111789z;
                finderFansListUI.getClass();
                C61926c.m72668M(new C41539t0(finderFansListUI, str));
            }
        }
    }

    public C41537s0(C50275lk0 lk02, FinderFansListUI finderFansListUI) {
        this.f111845d = lk02;
        this.f111846e = finderFansListUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        if (menuItem.getItemId() == 1001 && (str = this.f111845d.f137478f) != null) {
            FinderFansListUI finderFansListUI = this.f111846e;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C58417y0.fy0((C58417y0) c, context, 8, 3, false, 0, 0, (String) null, 120, (Object) null);
            ((C41490k1) C86312j.m106911c(C41490k1.class)).v70(str, new C41538a(finderFansListUI));
        }
    }
}
