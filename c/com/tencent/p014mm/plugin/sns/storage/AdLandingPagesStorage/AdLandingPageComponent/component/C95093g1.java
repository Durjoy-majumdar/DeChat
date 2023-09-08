package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ji3.C9457a;
import p763ym.C79138l;
import qs2.C101287r;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g1 */
public class C95093g1 extends C95108i0 {
    public C95093g1(Context context, C101287r rVar, ViewGroup viewGroup) {
        super(context, rVar, viewGroup);
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(rVar.f296690B);
        this.f276010t.mo90729c("pkg", appInfo == null ? "" : appInfo.field_packageName);
        this.f276010t.mo90729c("appid", rVar.f296690B);
    }

    /* renamed from: P */
    public void mo130182P() {
        Class cls = C79138l.class;
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
        C101287r O = mo131626O();
        if (((C79138l) C86312j.m106911c(cls)).Tb0(this.f276579d, O.f296690B)) {
            C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(O.f296690B);
            if (appInfo != null && !TextUtils.isEmpty(appInfo.field_packageName)) {
                Context context = this.f276579d;
                String str = appInfo.field_packageName;
                String hv = ((C79138l) C86312j.m106911c(cls)).mo74011hv(this.f276579d, appInfo);
                SnsMethodCalculate.markStartTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                boolean z = false;
                if (context == null || TextUtils.isEmpty(str)) {
                    SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                } else {
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                        if (launchIntentForPackage != null) {
                            if (!(context instanceof Activity)) {
                                context = this.f276579d;
                            }
                            C9457a.m9137a(new C43059f1(this, context, launchIntentForPackage, hv));
                            z = true;
                            SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                        }
                    } catch (Exception e) {
                        Log.m105920e("AdLandingPageOpenAppBtnComp", Util.stackTraceToString(e));
                    }
                    SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                }
                if (z) {
                    mo131613G();
                }
            }
            super.mo130182P();
        } else {
            super.mo130182P();
        }
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
    }
}
