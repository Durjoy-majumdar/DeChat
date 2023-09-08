package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95074c0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d0 */
public class C95081d0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C95074c0 f275973d;

    public C95081d0(C95074c0 c0Var) {
        this.f275973d = c0Var;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$4");
        C95074c0 c0Var = this.f275973d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        C95074c0.C95078d dVar = c0Var.f275967h;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        SnsAdNativeLandingPagesUI.C95440u uVar = (SnsAdNativeLandingPagesUI.C95440u) dVar;
        uVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$34");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onDismiss");
        uVar.mo132564a();
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$34");
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$4");
    }
}
