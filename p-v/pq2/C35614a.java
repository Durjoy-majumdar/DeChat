package pq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: pq2.a */
public final class C35614a {

    /* renamed from: a */
    public static final C35614a f95198a = new C35614a();

    /* renamed from: b */
    public static final Map<String, Long> f95199b = new LinkedHashMap();

    /* renamed from: pq2.a$a */
    public static final class C35615a {

        /* renamed from: a */
        public String f95200a = "";

        /* renamed from: b */
        public long f95201b;

        /* renamed from: c */
        public long f95202c;

        /* renamed from: d */
        public long f95203d;

        /* renamed from: e */
        public int f95204e = -1;
    }

    /* renamed from: b */
    public static final void m40778b(String str) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("recordAdRequestEnd", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("recordAdRequestEnd", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            return;
        }
        Map<String, Long> map = f95199b;
        synchronized (map) {
            try {
                map.put(str, Long.valueOf(System.currentTimeMillis()));
                C13598b0 b0Var = C13598b0.f38549a;
            } finally {
                str2 = "recordAdRequestEnd";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60337a() {
        /*
            r8 = this;
            java.lang.String r0 = "AdTimelineReporter"
            java.lang.String r1 = "getAsyncRequestReportEnable"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x002f }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x002f }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_ad_timeline_async_request_report_android     // Catch:{ all -> 0x002f }
            int r4 = r4.mo58779Qe(r5, r3)     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "getAsyncRequestReportEnable called "
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
            java.lang.String r7 = "getAsyncRequestReportEnable, exp="
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
        throw new UnsupportedOperationException("Method not decompiled: pq2.C35614a.mo60337a():boolean");
    }
}
