package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95217u;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lo2.C34318c;
import lo2.C99552l;
import vr2.C102239c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t */
public class C95215t implements C44580q1 {

    /* renamed from: a */
    public final /* synthetic */ C102239c f276296a;

    /* renamed from: b */
    public final /* synthetic */ C95217u f276297b;

    public C95215t(C95217u uVar, C102239c cVar) {
        this.f276297b = uVar;
        this.f276296a = cVar;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$1");
        Log.m105924i("MicroMsg.AdLandingPageAppMarketBtnComp", "onLaunchApp, launchSuccess=" + z + ", launchCancel=" + z2);
        if (z) {
            C95217u uVar = this.f276297b;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            uVar.mo131716g0(2, 0, "");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            C95217u uVar2 = this.f276297b;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            C95217u.C95220c cVar = uVar2.f276311L;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            cVar.f276315a = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            C95217u.C95219b bVar = C95217u.f276299M;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            if (bVar != null) {
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                C95217u.C95219b bVar2 = C95217u.f276299M;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                Map<String, C95217u.C95220c> map = bVar2.f276314c;
                String b0 = C95217u.m121169b0(this.f276297b);
                C95217u uVar3 = this.f276297b;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                C95217u.C95220c cVar2 = uVar3.f276311L;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                ((ConcurrentHashMap) map).put(b0, cVar2);
            }
            C99552l.m129929e(this.f276296a, 3);
            C34318c.m40323b(C95217u.m121169b0(this.f276297b), C95217u.m121170c0(this.f276297b).f296542u0);
            C115669n.INSTANCE.mo175911u(1958, 2);
        } else {
            C95217u uVar4 = this.f276297b;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            uVar4.mo131716g0(2, 2, "");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        }
        SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$1");
    }
}
