package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.appusage.C81526t1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter;
import com.tencent.p014mm.plugin.appbrand.report.C84175n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import kr0.C76630x0;
import te3.C49962j90;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.d */
public final class C84626d extends C84628f implements C81526t1.C81528b {

    /* renamed from: r */
    public final MultiProcessMMKV f246908r;

    public C84626d(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        C87412m.m108591d(a);
        this.f246908r = a;
    }

    /* renamed from: a */
    public void mo113805a(C49962j90 j902) {
        C87412m.m108594g(j902, "info");
        if (!this.f246908r.getBoolean("kv_want_show_entry", false) && j902.f135937e == 1) {
            this.f246908r.putBoolean("kv_want_show_entry", true);
        }
        mo117339n(j902);
    }

    /* renamed from: b */
    public C81526t1.C81527a mo113806b() {
        return C81526t1.C81527a.ENTRANCE_ID_LIVE;
    }

    /* renamed from: e */
    public void mo117280e() {
        boolean z = true;
        mo117321l(true);
        if (!C87412m.m108589b(((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_appbrand_desktop_live_entrance_enable, ""), "1") || !this.f246908r.getBoolean("kv_want_show_entry", false)) {
            z = false;
        }
        mo117321l(z);
    }

    /* renamed from: j */
    public void mo117282j(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "imageView");
        weImageView.setVisibility(0);
        weImageView.setImageResource(C0966R.raw.icons_outline_miniprogram_live);
        weImageView.setIconColor(this.f246909e.getResources().getColor(C0966R.color.f2961ah));
    }

    /* renamed from: m */
    public String mo117283m() {
        return this.f246909e.getString(C0966R.string.f7840td);
    }

    public void onClick(View view) {
        super.onClick(view);
        C86299o oVar = new C86299o();
        oVar.f250929a = "gh_bc64bb356935@app";
        oVar.f250931c = 0;
        oVar.f250932d = 0;
        oVar.f250939k = 1001;
        oVar.f250940l = "";
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f246909e, oVar);
        if (this.f246918q != null) {
            C84175n nVar = C84175n.f245826d;
            FragmentActivity fragmentActivity = this.f246909e;
            C87412m.m108593f(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            AppBrandLauncherDesktopReporter a = nVar.mo116851a(fragmentActivity);
            int i = this.f246918q.f135938f;
            C115669n.INSTANCE.mo160131h(19468, 3, Integer.valueOf(i), "", "", "", "", Long.valueOf(a.f158155d));
        }
    }
}
