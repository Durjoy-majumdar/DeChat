package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.k */
public class C84640k implements LoadMoreRecyclerView.C40579c {

    /* renamed from: a */
    public final /* synthetic */ AppBrandLauncherRecentsList f246947a;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.k$a */
    public class C84641a implements RecyclerView.C16616j.C16618a {
        public C84641a() {
        }

        /* renamed from: a */
        public void mo17330a() {
            C84640k.this.f246947a.f246819I.mo148687I(this);
            ThreeDotsLoadingView threeDotsLoadingView = C84640k.this.f246947a.f246818H.f246976b;
            if (threeDotsLoadingView != null && threeDotsLoadingView.isShown()) {
                AppBrandLauncherRecentsList.m104196T(C84640k.this.f246947a);
            }
        }
    }

    public C84640k(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f246947a = appBrandLauncherRecentsList;
    }

    /* renamed from: a */
    public void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
        ThreeDotsLoadingView threeDotsLoadingView = this.f246947a.f246818H.f246976b;
        if (!(threeDotsLoadingView != null && threeDotsLoadingView.isShown())) {
            C104801e0 e0Var = this.f246947a.f246819I;
            if (e0Var.f311278u) {
                e0Var.mo148686H(new C84641a());
                return;
            }
            return;
        }
        AppBrandLauncherRecentsList.m104196T(this.f246947a);
    }
}
