package wo2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import zt3.C119157j;

/* renamed from: wo2.d */
public class C102466d {

    /* renamed from: a */
    public static int f301721a;

    /* renamed from: b */
    public static HashMap<String, Integer> f301722b = new HashMap<>();

    /* renamed from: wo2.d$a */
    public static class C102467a {

        /* renamed from: a */
        public int f301723a;

        /* renamed from: b */
        public int f301724b;

        /* renamed from: c */
        public int f301725c;

        /* renamed from: d */
        public int f301726d;

        /* renamed from: e */
        public int f301727e;

        /* renamed from: f */
        public int f301728f;

        /* renamed from: g */
        public int f301729g;

        /* renamed from: h */
        public int f301730h;

        /* renamed from: i */
        public int f301731i;

        /* renamed from: j */
        public int f301732j;

        /* renamed from: k */
        public int f301733k;

        /* renamed from: l */
        public int f301734l;
    }

    /* renamed from: wo2.d$b */
    public static class C102468b {

        /* renamed from: a */
        public long f301735a;

        /* renamed from: b */
        public long f301736b;

        /* renamed from: c */
        public long f301737c;

        /* renamed from: d */
        public long f301738d;

        /* renamed from: e */
        public long f301739e;

        /* renamed from: f */
        public long f301740f;

        /* renamed from: g */
        public long f301741g;

        /* renamed from: h */
        public long f301742h;

        /* renamed from: i */
        public String f301743i = "";

        /* renamed from: j */
        public int f301744j;

        /* renamed from: k */
        public String f301745k = "";

        /* renamed from: l */
        public boolean f301746l = false;

        /* renamed from: a */
        public C102468b mo142078a() {
            SnsMethodCalculate.markStartTimeMs("onCreateEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            this.f301737c = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("reportEnterNetWorkType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            ((C119157j) C119157j.f356862d).mo183875f(new C102469e(this));
            SnsMethodCalculate.markEndTimeMs("reportEnterNetWorkType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            SnsMethodCalculate.markEndTimeMs("onCreateEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            return this;
        }
    }

    /* renamed from: a */
    public static void m135251a(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        SnsMethodCalculate.markStartTimeMs("idkeyReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        Log.m105918d("AdLandingPageStaticHelper", "idkeyReport, id=" + j + ", key=" + j2);
        C115669n.INSTANCE.mo175912v(j, j2);
        SnsMethodCalculate.markEndTimeMs("idkeyReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
    }

    /* renamed from: b */
    public static void m135252b(long j, long j2, long j3) {
        long j4 = j3;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        SnsMethodCalculate.markStartTimeMs("idkeyReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        if (j4 > 0) {
            Log.m105918d("AdLandingPageStaticHelper", "idkeyReport, id=" + j + ", key=" + j2 + ", value=" + j4);
            C115669n.INSTANCE.mo175913w(j, j2, j3);
        }
        SnsMethodCalculate.markEndTimeMs("idkeyReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m135253c() {
        /*
            java.lang.String r0 = "AdLandingPageStaticHelper"
            java.lang.String r1 = "enableReportRvPerformance"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x002f }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x002f }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_ad_timeline_performance_report_android     // Catch:{ all -> 0x002f }
            int r4 = r4.mo58779Qe(r5, r3)     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "getExptEnable called"
            r5.append(r6)     // Catch:{ all -> 0x002d }
            r5.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x0031
        L_0x002f:
            r5 = move-exception
            r4 = 0
        L_0x0031:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getExptEnable, exp="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x0045:
            if (r4 <= 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.C102466d.m135253c():boolean");
    }

    /* renamed from: d */
    public static void m135254d(String str) {
        SnsMethodCalculate.markStartTimeMs("recordSnsStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        f301721a++;
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("recordSnsStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            return;
        }
        if (f301722b.containsKey(str)) {
            Integer num = f301722b.get(str);
            if (num != null) {
                f301722b.put(str, Integer.valueOf(num.intValue() + 1));
            }
        } else {
            f301722b.put(str, 1);
        }
        SnsMethodCalculate.markEndTimeMs("recordSnsStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
    }
}
