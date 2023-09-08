package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import qs2.C101255a0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a */
public abstract class C95250a extends C95295z {
    public C95250a(Context context, C101255a0 a0Var, ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
    }

    /* renamed from: E */
    public abstract List<C95295z> mo130196E();

    /* renamed from: G */
    public abstract void mo130197G();

    /* renamed from: s */
    public boolean mo131640s() {
        SnsMethodCalculate.markStartTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingPageContainerComponent");
        int l = mo131853l();
        Log.m105925i("MicroMsg.AdLandingPageContainerComponent", "inScreenHeight %d", Integer.valueOf(l));
        if (l > 0) {
            SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingPageContainerComponent");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingPageContainerComponent");
        return false;
    }
}
