package com.tencent.p014mm.plugin.appbrand.page;

import ak0.C79584a;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.widget.recent.AppBrandRecentView;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.w1 */
public class C83959w1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245108d;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.w1$a */
    public class C83960a implements AppBrandRecentView.C85016d {

        /* renamed from: d */
        public final /* synthetic */ View f245109d;

        public C83960a(View view) {
            this.f245109d = view;
        }

        /* renamed from: b */
        public void mo103709b(int i) {
            C83959w1.this.f245108d.f245019c1.setRefreshListener((AppBrandRecentView.C85016d) null);
            C83959w1.this.mo116579a(this.f245109d);
        }
    }

    public C83959w1(C83928t1 t1Var) {
        this.f245108d = t1Var;
    }

    /* renamed from: a */
    public final void mo116579a(View view) {
        AppBrandRecentView appBrandRecentView = this.f245108d.f245019c1;
        if (appBrandRecentView != null && appBrandRecentView.getCount() != 0) {
            this.f245108d.f245019c1.mo117963x1();
            this.f245108d.f245020d1.showAsDropDown(view);
            C84240s.m103840f(this.f245108d.getAppId(), this.f245108d.mo116162Q0(), 21, "", Util.nowSecond(), 1, 0);
        }
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (C79584a.f233382a.mo109700c(this.f245108d.getRuntime())) {
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (!this.f245108d.f245022f1.getAndSet(true)) {
            this.f245108d.mo115900S1();
            AppBrandRecentView appBrandRecentView = this.f245108d.f245019c1;
            if (appBrandRecentView != null) {
                appBrandRecentView.setRefreshListener(new C83960a(view));
                this.f245108d.f245019c1.mo117963x1();
            }
        } else {
            mo116579a(view);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
