package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.report.C84175n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di0.C86299o;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kr0.C76630x0;
import rp0.C36434i;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherHeaderOrderEntrance */
public final class AppBrandLauncherHeaderOrderEntrance extends C84628f {

    /* renamed from: r */
    public C0000n0 f246808r = C53930o0.m60555b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandLauncherHeaderOrderEntrance(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "viewGroup");
        fragmentActivity.getLifecycle().addObserver(new C0124r(this) {

            /* renamed from: d */
            public final /* synthetic */ AppBrandLauncherHeaderOrderEntrance f246809d;

            {
                this.f246809d = r1;
            }

            @C112974b0(C39623j.C39625b.ON_DESTROY)
            public final void onDestroy() {
                C0000n0 n0Var = this.f246809d.f246808r;
                if (n0Var != null) {
                    C53930o0.m60556c(n0Var, (CancellationException) null);
                }
                this.f246809d.f246808r = null;
            }
        });
    }

    /* renamed from: e */
    public void mo117280e() {
        mo117321l(true);
        Log.m105924i("MicroMsg.AppBrandLauncherHeaderOrderEntrance", "onAttached");
        Log.m105924i("MicroMsg.AppBrandLauncherHeaderOrderEntrance", "updateMoreOptionEntryRedDotStatus");
        C0000n0 n0Var = this.f246808r;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C29671e(this, (C15601d<? super C29671e>) null), 3, (Object) null);
        }
    }

    /* renamed from: h */
    public void mo117281h() {
        super.mo117281h();
        Log.m105924i("MicroMsg.AppBrandLauncherHeaderOrderEntrance", "updateMoreOptionEntryRedDotStatus");
        C0000n0 n0Var = this.f246808r;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C29671e(this, (C15601d<? super C29671e>) null), 3, (Object) null);
        }
    }

    /* renamed from: j */
    public void mo117282j(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "imageView");
        weImageView.setVisibility(0);
        weImageView.setImageResource(C0966R.raw.icons_outline_miniprogram_order);
        weImageView.setIconColor(this.f246909e.getResources().getColor(C0966R.color.f2939n));
    }

    /* renamed from: m */
    public String mo117283m() {
        String string = this.f246909e.getString(C0966R.string.f7841te);
        C87412m.m108593f(string, "activity.getString(R.str…header_order_tag_wording)");
        return string;
    }

    public void onClick(View view) {
        super.onClick(view);
        C86299o oVar = new C86299o();
        oVar.f250929a = "gh_af04e9bb7e91@app";
        oVar.f250931c = 0;
        oVar.f250932d = 0;
        oVar.f250939k = 1001;
        oVar.f250940l = "";
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f246909e, oVar);
        C86709a0.m107529k().f251779b.mo123460f(new C36434i(true));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(18685, 2);
        C84175n nVar2 = C84175n.f245826d;
        FragmentActivity fragmentActivity = this.f246909e;
        C87412m.m108593f(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        nVar.mo160131h(19468, 4, "", "", "", "", "", Long.valueOf(nVar2.mo116851a(fragmentActivity).f158155d));
    }
}
