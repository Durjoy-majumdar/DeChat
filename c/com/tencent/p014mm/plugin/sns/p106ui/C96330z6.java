package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;

/* renamed from: com.tencent.mm.plugin.sns.ui.z6 */
public class C96330z6 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTransparentUI f281732d;

    public C96330z6(SnsTransparentUI snsTransparentUI) {
        this.f281732d = snsTransparentUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$2");
        C95198o2.m121132d(this.f281732d);
        this.f281732d.finish();
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$2");
    }
}
