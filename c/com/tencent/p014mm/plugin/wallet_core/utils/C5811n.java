package com.tencent.p014mm.plugin.wallet_core.utils;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.n */
public final class C5811n extends MMBaseAccessibilityConfig {

    /* renamed from: d */
    public boolean f21958d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5811n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.cec).view(C0966R.C0970id.f7k).expand(12, 12, 12, 12);
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (!this.f21958d) {
            this.f21958d = true;
            ((TextView) getContext().findViewById(C0966R.C0970id.lj6)).sendAccessibilityEvent(128);
        }
    }
}
