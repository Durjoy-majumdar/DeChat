package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.f0 */
public class C104814f0 extends C107175c0 {

    /* renamed from: a */
    public final /* synthetic */ AppBrandLauncherRecentsList.C84609n f311294a;

    /* renamed from: b */
    public final /* synthetic */ C107168a0 f311295b;

    /* renamed from: c */
    public final /* synthetic */ C104801e0 f311296c;

    public C104814f0(C104801e0 e0Var, AppBrandLauncherRecentsList.C84609n nVar, C107168a0 a0Var) {
        this.f311296c = e0Var;
        this.f311294a = nVar;
        this.f311295b = a0Var;
    }

    /* renamed from: a */
    public void mo143420a(View view) {
        this.f311295b.mo157608d((C107173b0) null);
        this.f311296c.mo17319h(this.f311294a);
        this.f311296c.f311275K.remove(this.f311294a);
        C104801e0 e0Var = this.f311296c;
        if (!e0Var.mo17325n()) {
            e0Var.mo17320i();
        }
    }

    /* renamed from: b */
    public void mo143457b(View view) {
        this.f311296c.getClass();
    }

    /* renamed from: c */
    public void mo144304c(View view) {
        if (view != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            view.setTranslationY(0.0f);
            C107207u.m145169j(view, 1.0f);
        }
    }
}
