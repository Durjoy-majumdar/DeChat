package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rq2.C101425k;
import te3.C101804kv2;

/* renamed from: co2.r */
public class C92449r {

    /* renamed from: a */
    public List<C92448q> f264582a;

    /* renamed from: b */
    public int f264583b;

    /* renamed from: c */
    public int f264584c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r2.f264584c >= 6) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r5 >= r2.f264583b) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r6 = r2.f264582a.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r6 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r2.f264582a.add(r6);
        r2.f264584c++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r5 <= 4) goto L_0x003c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static co2.C92449r m116285b(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "parse"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = rq2.C101425k.m133098b(r5)
            r3 = 0
            if (r2 == 0) goto L_0x0013
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0013:
            co2.r r2 = new co2.r     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r4.<init>()     // Catch:{ all -> 0x0062 }
            r4.append(r6)     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = ".sliderCardList"
            r4.append(r6)     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0062 }
            java.util.List r5 = m116286c(r5, r6)     // Catch:{ all -> 0x0062 }
            r2.f264582a = r5     // Catch:{ all -> 0x0062 }
            int r5 = r5.size()     // Catch:{ all -> 0x0062 }
            r2.f264583b = r5     // Catch:{ all -> 0x0062 }
            r2.f264584c = r5     // Catch:{ all -> 0x0062 }
            if (r5 <= 0) goto L_0x005e
            r6 = 4
            if (r5 > r6) goto L_0x005e
        L_0x003c:
            int r5 = r2.f264584c     // Catch:{ all -> 0x0062 }
            r6 = 6
            if (r5 >= r6) goto L_0x005e
            r5 = 0
        L_0x0042:
            int r6 = r2.f264583b     // Catch:{ all -> 0x0062 }
            if (r5 >= r6) goto L_0x003c
            java.util.List<co2.q> r6 = r2.f264582a     // Catch:{ all -> 0x0062 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0062 }
            co2.q r6 = (co2.C92448q) r6     // Catch:{ all -> 0x0062 }
            if (r6 == 0) goto L_0x005b
            java.util.List<co2.q> r4 = r2.f264582a     // Catch:{ all -> 0x0062 }
            r4.add(r6)     // Catch:{ all -> 0x0062 }
            int r6 = r2.f264584c     // Catch:{ all -> 0x0062 }
            int r6 = r6 + 1
            r2.f264584c = r6     // Catch:{ all -> 0x0062 }
        L_0x005b:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x005e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0062:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.C92449r.m116285b(java.util.Map, java.lang.String):co2.r");
    }

    /* renamed from: c */
    public static List<C92448q> m116286c(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseAdSlideFullCardItemInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        String str2 = str + ".sliderCardItem";
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i == 0 ? "" : Integer.valueOf(i));
            String sb4 = sb.toString();
            if (map.containsKey(sb4)) {
                SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                C92448q qVar = null;
                if (C101425k.m133098b(map)) {
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                } else {
                    if (TextUtils.isEmpty(Util.nullAsNil(map.get(sb4 + ".media.id")))) {
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                    } else {
                        try {
                            C92448q qVar2 = new C92448q();
                            qVar2.f264573a = Util.nullAsNil(map.get(sb4 + ".title"));
                            qVar2.f264574b = Util.nullAsNil(map.get(sb4 + ".desc"));
                            qVar2.f264575c = Util.safeParseFloat(map.get(sb4 + ".markMaxAlpha"));
                            C101804kv2 c = C92448q.m116283c(map, sb4 + ".media");
                            qVar2.f264577e = c;
                            qVar2.f264576d = c.f298690e == 6 ? 1 : 0;
                            AdClickActionInfo b = AdClickActionInfo.m119629b(map, sb4 + ".clickActionInfo");
                            qVar2.f264578f = b;
                            b.f273639a = 3;
                            qVar2.f264579g = C92448q.m116282b(map, sb4 + ".buttonInfo");
                            qVar2.f264580h = Util.nullAsNil(map.get(sb4 + ".frontBorderImage"));
                            qVar2.f264581i = Util.nullAsNil(map.get(sb4 + ".backBorderImage"));
                            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                            qVar = qVar2;
                        } catch (Throwable th) {
                            Log.m105920e("AdSlideFullCardItemInfo", "parse AdSlideFullCardItemInfo error " + th.getMessage());
                            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
                        }
                    }
                }
                if (qVar == null) {
                    break;
                }
                arrayList.add(qVar);
                i++;
            } else {
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("parseAdSlideFullCardItemInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        return arrayList;
    }

    /* renamed from: a */
    public int mo126436a(int i) {
        SnsMethodCalculate.markStartTimeMs("getAdjustPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        int i2 = this.f264583b;
        if (i2 <= 4) {
            i %= i2;
        }
        SnsMethodCalculate.markEndTimeMs("getAdjustPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        return i;
    }
}
