package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import e42.C7594e;
import hp2.C87579c;

/* renamed from: gp2.d */
public final class C87290d<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppMarketIntent");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppMarketIntent");
        return "getAppMarketIntent";
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121698s(e42.C7596h r14) {
        /*
            r13 = this;
            java.lang.String r0 = "doAction"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppMarketIntent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r14, r2)
            java.lang.String r2 = "cId"
            java.lang.String r14 = r14.optString(r2)
            r2 = 1
            r3 = 0
            if (r14 == 0) goto L_0x001f
            boolean r14 = z04.C112551y.m153811k(r14)
            if (r14 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r14 = 0
            goto L_0x0020
        L_0x001f:
            r14 = 1
        L_0x0020:
            r4 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r5 = "SnsAdMb.JsApi"
            if (r14 == 0) goto L_0x0037
            java.lang.String r14 = "the comp id is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
            e42.h r14 = r13.mo120842g(r4, r14)
            r13.mo122027r(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0037:
            T r14 = r13.f251227a
            r6 = 0
            if (r14 == 0) goto L_0x0041
            android.app.Activity r14 = r14.mo8720e0()
            goto L_0x0042
        L_0x0041:
            r14 = r6
        L_0x0042:
            boolean r7 = r14 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
            if (r7 == 0) goto L_0x0118
            r4 = r14
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r4 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r4
            r4.getClass()
            java.lang.String r5 = "getAdXmlValues"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f277585i1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            wr2.a r14 = wr2.C91098a.m114283g(r14, r4)
            android.content.Intent r14 = r14.mo125157i()
            java.lang.String r4 = "result"
            if (r14 == 0) goto L_0x0105
            boolean r5 = wr2.C91098a.m114280d(r14)
            e42.h r7 = new e42.h
            r7.<init>()
            r7.put(r4, r5)
            java.lang.String r5 = "intentToJSONObject"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.lang.String r8 = r14.getPackage()
            android.net.Uri r9 = r14.getData()
            if (r9 == 0) goto L_0x0084
            java.lang.String r6 = r9.toString()
        L_0x0084:
            java.lang.String r9 = "market_app_name"
            java.lang.String r9 = r14.getStringExtra(r9)
            java.lang.String r10 = "target_app_id"
            java.lang.String r10 = r14.getStringExtra(r10)
            r11 = 2
            java.lang.String r12 = "market_priority"
            int r11 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r14, r12, r11)
            java.lang.String r12 = "brand_state"
            boolean r14 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r14, r12, r2)
            if (r8 == 0) goto L_0x00ab
            boolean r12 = z04.C112551y.m153811k(r8)
            if (r12 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r12 = 0
            goto L_0x00ac
        L_0x00ab:
            r12 = 1
        L_0x00ac:
            if (r12 != 0) goto L_0x00b4
            java.lang.String r12 = "marketPackage"
            r7.put(r12, r8)
        L_0x00b4:
            if (r6 == 0) goto L_0x00bf
            boolean r8 = z04.C112551y.m153811k(r6)
            if (r8 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r8 = 0
            goto L_0x00c0
        L_0x00bf:
            r8 = 1
        L_0x00c0:
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = "marketUrl"
            r7.put(r8, r6)
        L_0x00c8:
            if (r9 == 0) goto L_0x00d3
            boolean r6 = z04.C112551y.m153811k(r9)
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = 0
            goto L_0x00d4
        L_0x00d3:
            r6 = 1
        L_0x00d4:
            if (r6 != 0) goto L_0x00dc
            java.lang.String r6 = "marketName"
            r7.put(r6, r9)
        L_0x00dc:
            if (r10 == 0) goto L_0x00e6
            boolean r6 = z04.C112551y.m153811k(r10)
            if (r6 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            if (r2 != 0) goto L_0x00ee
            java.lang.String r2 = "targetAppPkg"
            r7.put(r2, r10)
        L_0x00ee:
            java.lang.String r2 = "priority"
            r7.put(r2, r11)
            java.lang.String r2 = "state"
            r7.put(r2, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r13.mo120845j(r7)
            r13.mo122027r(r7)
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0105:
            if (r6 != 0) goto L_0x0128
            e42.h r14 = new e42.h
            r14.<init>()
            r14.put(r4, r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r13.mo120845j(r14)
            r13.mo122027r(r14)
            goto L_0x0128
        L_0x0118:
            java.lang.String r14 = "the activity is not SnsAdNative"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
            java.lang.String r14 = "the activity is not SnsAdNative!"
            e42.h r14 = r13.mo120842g(r4, r14)
            r13.mo122027r(r14)
        L_0x0128:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.C87290d.mo121698s(e42.h):void");
    }
}
