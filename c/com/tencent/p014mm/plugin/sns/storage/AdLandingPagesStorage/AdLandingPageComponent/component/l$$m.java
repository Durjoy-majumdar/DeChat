package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import ps2.C100880k;
import ps2.C100891r;
import vr2.C102251n;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$m */
public class l$$m implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f276125a;

    /* renamed from: b */
    public final /* synthetic */ String f276126b;

    /* renamed from: c */
    public final /* synthetic */ boolean f276127c;

    /* renamed from: d */
    public final /* synthetic */ C102251n f276128d;

    /* renamed from: e */
    public final /* synthetic */ C95136l f276129e;

    public l$$m(C95136l lVar, String str, String str2, boolean z, C102251n nVar) {
        this.f276129e = lVar;
        this.f276125a = str;
        this.f276126b = str2;
        this.f276127c = z;
        this.f276128d = nVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        Log.m105920e("AdLandingNewH5Comp", "onDownloadError, imageUrl=" + this.f276125a);
        C95136l.m121014I(this.f276129e);
        C95136l.m121015J(this.f276129e, this.f276126b, false);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        Log.m105924i("AdLandingNewH5Comp", "onDownloaded succ, imageUrl=" + this.f276125a);
        try {
            String l = C100891r.m132217l("adId", this.f276125a);
            if (TextUtils.isEmpty(l) || !C86013q1.m106450k(l)) {
                C95136l.m121014I(this.f276129e);
                C95136l.m121015J(this.f276129e, this.f276126b, false);
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
            }
            Log.m105924i("AdLandingNewH5Comp", "onDownloaded, local file exists, imageUrl=" + this.f276125a);
            if (this.f276127c) {
                C102251n nVar = this.f276128d;
                String str2 = this.f276125a;
                C95136l lVar = this.f276129e;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                C102251n.C102257c cVar = lVar.f276106C;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                nVar.mo141816j(l, str2, cVar);
            } else {
                C102251n nVar2 = this.f276128d;
                String str3 = this.f276125a;
                C95136l lVar2 = this.f276129e;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                C102251n.C102257c cVar2 = lVar2.f276106C;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                nVar2.mo141817k(l, str3, cVar2);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        } catch (Throwable th) {
            Log.m105920e("AdLandingNewH5Comp", "onDownloaded exp=" + th.toString());
            C95136l.m121014I(this.f276129e);
            C95136l.m121015J(this.f276129e, this.f276126b, false);
        }
    }
}
