package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import e42.C7594e;
import hp2.C87579c;

/* renamed from: gp2.p */
public final class C87305p<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiRecordAdLandingCompReportData");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiRecordAdLandingCompReportData");
        return "recordAdLandingCompReportData";
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015e  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121698s(e42.C7596h r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "doAction"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiRecordAdLandingCompReportData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "data"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "mbCompId"
            java.lang.String r5 = r1.optString(r4)
            java.lang.String r6 = "id"
            java.lang.String r6 = r1.optString(r6)
            java.lang.String r7 = "reportData"
            org.json.JSONObject r1 = r1.optJSONObject(r7)
            T r7 = r0.f251227a
            if (r7 == 0) goto L_0x002d
            android.app.Activity r7 = r7.mo8720e0()
            goto L_0x002e
        L_0x002d:
            r7 = 0
        L_0x002e:
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x003b
            boolean r11 = z04.C112551y.m153811k(r5)
            if (r11 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r11 = 0
            goto L_0x003c
        L_0x003b:
            r11 = 1
        L_0x003c:
            r12 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r13 = "SnsAdMb.JsApi"
            if (r11 != 0) goto L_0x0187
            if (r6 == 0) goto L_0x004d
            boolean r11 = z04.C112551y.m153811k(r6)
            if (r11 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r11 = 0
            goto L_0x004e
        L_0x004d:
            r11 = 1
        L_0x004e:
            if (r11 == 0) goto L_0x0052
            goto L_0x0187
        L_0x0052:
            if (r1 != 0) goto L_0x0068
            java.lang.String r1 = "the report data json object is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            java.lang.String r1 = "the report data is null, are you sure?"
            e42.h r1 = r0.mo120842g(r12, r1)
            r0.mo122027r(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0068:
            fp2.f r11 = fp2.C87070f.f252656a
            java.lang.String r11 = "getSpecifiedJsCompInfoInAdLandingMbComp"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r14)
            java.lang.String r15 = "SnsAdMB"
            if (r7 != 0) goto L_0x0080
            java.lang.String r4 = "getSpecifiedJsCompInfoInAdLandingMbComp: the activity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
        L_0x007d:
            r4 = 0
            goto L_0x011a
        L_0x0080:
            if (r5 == 0) goto L_0x008c
            boolean r16 = z04.C112551y.m153811k(r5)
            if (r16 == 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r16 = 0
            goto L_0x008e
        L_0x008c:
            r16 = 1
        L_0x008e:
            if (r16 != 0) goto L_0x0110
            if (r6 == 0) goto L_0x009c
            boolean r16 = z04.C112551y.m153811k(r6)
            if (r16 == 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            r16 = 0
            goto L_0x009e
        L_0x009c:
            r16 = 1
        L_0x009e:
            if (r16 == 0) goto L_0x00a1
            goto L_0x0110
        L_0x00a1:
            java.util.Map<java.lang.Integer, fp2.b> r16 = fp2.C87070f.f252657b
            int r7 = r7.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = r16
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.lang.Object r7 = r8.get(r7)
            fp2.b r7 = (fp2.C87066b) r7
            if (r7 == 0) goto L_0x0105
            ip2.a r7 = r7.mo121532a()
            if (r7 != 0) goto L_0x00be
            goto L_0x0105
        L_0x00be:
            java.lang.String r8 = "getOneJsComponentInfo"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r15)
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "jsCompId"
            gy3.C87412m.m108594g(r6, r4)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r4 = r7.f289594c
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r4 = r4.get(r6)
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 != 0) goto L_0x00fe
        L_0x00e1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "there is no js component in magic brush component: ["
            r4.append(r7)
            r4.append(r5)
            r7 = 93
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "LandingPageMagic"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r4)
            r4 = 0
        L_0x00fe:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            goto L_0x011a
        L_0x0105:
            java.lang.String r4 = "the ad landing page helper is null, can't obtain the js component inf "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            goto L_0x007d
        L_0x0110:
            java.lang.String r4 = "getSpecifiedJsCompInfoInAdLandingMbComp: the magic component id is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            goto L_0x007d
        L_0x011a:
            if (r4 == 0) goto L_0x015b
            java.util.Iterator r7 = r1.keys()
            java.lang.String r8 = "reportData.keys()"
            gy3.C87412m.m108593f(r7, r8)
        L_0x0126:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0151
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x013d
            boolean r11 = z04.C112551y.m153811k(r8)
            if (r11 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r11 = 0
            goto L_0x013e
        L_0x013d:
            r11 = 1
        L_0x013e:
            if (r11 == 0) goto L_0x0147
            java.lang.String r8 = "recordCompReportData::the key is empty, Please check!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r8)
            goto L_0x0126
        L_0x0147:
            java.lang.Object r11 = r1.opt(r8)
            if (r11 == 0) goto L_0x0126
            r4.put(r8, r11)
            goto L_0x0126
        L_0x0151:
            e42.h r1 = r17.mo120844i()
            r0.mo122027r(r1)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x015c
        L_0x015b:
            r8 = 0
        L_0x015c:
            if (r8 != 0) goto L_0x0183
            java.lang.String r1 = "it can't obtain js comp info with mb comp "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "it can't obtain js comp info with mb comp id "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " and js comp id "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            e42.h r1 = r0.mo120842g(r12, r1)
            r0.mo122027r(r1)
        L_0x0183:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0187:
            java.lang.String r1 = "the mb comp id is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            e42.h r1 = r0.mo120842g(r12, r1)
            r0.mo122027r(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.C87305p.mo121698s(e42.h):void");
    }
}
