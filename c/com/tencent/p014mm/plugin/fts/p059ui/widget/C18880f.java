package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.fts.p059ui.FTSBaseMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import uv1.C65484f;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.f */
public final class C18880f extends C106742j1 {

    /* renamed from: r */
    public final AppCompatActivity f52936r;

    /* renamed from: s */
    public boolean f52937s;

    /* renamed from: t */
    public C18881a f52938t;

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.f$a */
    public interface C18881a {
    }

    public C18880f(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f52936r = appCompatActivity;
    }

    /* renamed from: h */
    public boolean mo23881h() {
        return this.f52937s;
    }

    /* renamed from: j */
    public void mo23882j(FragmentActivity fragmentActivity, Menu menu) {
        if (fragmentActivity == null) {
            Log.m105928w("MicroMsg.FTS.FTSVoiceSearchViewHelper", "on add search menu, activity is null");
            return;
        }
        if (this.f319121i == null) {
            this.f319121i = new FTSActionBarSearchView(fragmentActivity);
        }
        super.mo23882j(fragmentActivity, menu);
    }

    /* renamed from: p */
    public void mo23883p() {
        C18881a aVar = this.f52938t;
        if (aVar != null) {
            FTSBaseMainUI.C18817c cVar = (FTSBaseMainUI.C18817c) aVar;
            FTSBaseMainUI.this.getStateCenter().dispatch(new C65484f(FTSBaseMainUI.this.f52734r));
        }
    }

    /* renamed from: r */
    public void mo23884r(String str) {
        try {
            super.mo23884r(str);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FTS.FTSVoiceSearchViewHelper", "setSearchContent exception: " + e.getMessage());
        }
    }
}
