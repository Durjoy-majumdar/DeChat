package jq2;

import android.text.TextUtils;
import ao2.C79617c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import zt3.C119157j;

/* renamed from: jq2.l */
public class C88011l {

    /* renamed from: a */
    public static volatile String f254627a = "";

    /* renamed from: jq2.l$a */
    public class C88012a implements Runnable {
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
            if (r8 == null) goto L_0x0112;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
            if (r8 == null) goto L_0x0112;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0157  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String r2 = "access$000"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                java.lang.String r4 = jq2.C88011l.f254627a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                boolean r2 = android.text.TextUtils.isEmpty(r4)
                java.lang.String r5 = "AdWuidHelper"
                if (r2 != 0) goto L_0x0035
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "skip updateWuidFromHistoryAd, wuid="
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            L_0x0035:
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.String r2 = "access$100"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                java.lang.String r4 = "updateWuidFromHistoryAd"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                r8 = 0
                r9 = 0
                int r10 = eb0.C31543z5.m39455e()     // Catch:{ all -> 0x00f3 }
                if (r10 > 0) goto L_0x0054
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
                goto L_0x012a
            L_0x0054:
                r11 = 864000(0xd2f00, float:1.210722E-39)
                int r11 = r10 - r11
                if (r11 >= 0) goto L_0x005c
                r11 = 0
            L_0x005c:
                os2.j r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ all -> 0x00f3 }
                android.database.Cursor r8 = r12.mo139860Lo(r10, r11)     // Catch:{ all -> 0x00f3 }
                if (r8 == 0) goto L_0x00f0
                boolean r10 = r8.moveToFirst()     // Catch:{ all -> 0x00f3 }
                if (r10 == 0) goto L_0x00f0
            L_0x006c:
                int r9 = r9 + 1
                com.tencent.mm.plugin.sns.storage.AdSnsInfo r10 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo     // Catch:{ all -> 0x00d0 }
                r10.<init>()     // Catch:{ all -> 0x00d0 }
                r10.convertFrom((android.database.Cursor) r8)     // Catch:{ all -> 0x00d0 }
                com.tencent.mm.plugin.sns.storage.ADInfo r11 = r10.getAdInfo()     // Catch:{ all -> 0x00d0 }
                long r12 = r10.field_snsId     // Catch:{ all -> 0x00d0 }
                java.lang.String r10 = vr2.C102236a0.m134765q0(r12)     // Catch:{ all -> 0x00d0 }
                if (r11 == 0) goto L_0x00ba
                java.lang.String r12 = r11.uxInfo     // Catch:{ all -> 0x00d0 }
                boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00d0 }
                if (r12 != 0) goto L_0x00ba
                java.lang.String r11 = r11.uxInfo     // Catch:{ all -> 0x00d0 }
                java.lang.String r11 = jq2.C88011l.m109542d(r11)     // Catch:{ all -> 0x00d0 }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
                r12.<init>()     // Catch:{ all -> 0x00d0 }
                java.lang.String r13 = "wuid="
                r12.append(r13)     // Catch:{ all -> 0x00d0 }
                r12.append(r11)     // Catch:{ all -> 0x00d0 }
                java.lang.String r13 = ", snsId="
                r12.append(r13)     // Catch:{ all -> 0x00d0 }
                r12.append(r10)     // Catch:{ all -> 0x00d0 }
                java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x00d0 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)     // Catch:{ all -> 0x00d0 }
                boolean r10 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00d0 }
                if (r10 != 0) goto L_0x00ea
                r8.close()     // Catch:{ all -> 0x00b6 }
            L_0x00b6:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
                goto L_0x012c
            L_0x00ba:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
                r11.<init>()     // Catch:{ all -> 0x00d0 }
                java.lang.String r12 = "updateWuidFromHistoryAd, empty uxinfo, snsId="
                r11.append(r12)     // Catch:{ all -> 0x00d0 }
                r11.append(r10)     // Catch:{ all -> 0x00d0 }
                java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00d0 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)     // Catch:{ all -> 0x00d0 }
                goto L_0x00ea
            L_0x00d0:
                r10 = move-exception
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
                r11.<init>()     // Catch:{ all -> 0x00f3 }
                java.lang.String r12 = "updateWuidFromHistoryAd loop exp="
                r11.append(r12)     // Catch:{ all -> 0x00f3 }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00f3 }
                r11.append(r10)     // Catch:{ all -> 0x00f3 }
                java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00f3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r10)     // Catch:{ all -> 0x00f3 }
            L_0x00ea:
                boolean r10 = r8.moveToNext()     // Catch:{ all -> 0x00f3 }
                if (r10 != 0) goto L_0x006c
            L_0x00f0:
                if (r8 == 0) goto L_0x0112
                goto L_0x010f
            L_0x00f3:
                r10 = move-exception
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
                r11.<init>()     // Catch:{ all -> 0x015f }
                java.lang.String r12 = "updateWuidFromHistoryAd, exp="
                r11.append(r12)     // Catch:{ all -> 0x015f }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015f }
                r11.append(r10)     // Catch:{ all -> 0x015f }
                java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x015f }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r10)     // Catch:{ all -> 0x015f }
                if (r8 == 0) goto L_0x0112
            L_0x010f:
                r8.close()     // Catch:{ all -> 0x0112 }
            L_0x0112:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "updateWuidFromHistoryAd, empty, count="
                r8.append(r10)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            L_0x012a:
                java.lang.String r11 = ""
            L_0x012c:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "updateWuidFromHistoryAd, timeCost="
                r2.append(r3)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r6
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 3
                r4 = 1940(0x794, float:2.719E-42)
                r2.mo175911u(r4, r3)
                boolean r3 = android.text.TextUtils.isEmpty(r11)
                if (r3 == 0) goto L_0x015b
                r3 = 4
                r2.mo175911u(r4, r3)
            L_0x015b:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            L_0x015f:
                r0 = move-exception
                if (r8 == 0) goto L_0x0165
                r8.close()     // Catch:{ all -> 0x0165 }
            L_0x0165:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jq2.C88011l.C88012a.run():void");
        }
    }

    /* renamed from: a */
    public static void m109539a() {
        SnsMethodCalculate.markStartTimeMs("clearWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        Log.m105924i("AdWuidHelper", "clearWuid, old=" + f254627a);
        f254627a = "";
        C115669n.INSTANCE.mo175911u(1940, 6);
        SnsMethodCalculate.markEndTimeMs("clearWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
    }

    /* renamed from: b */
    public static String m109540b(boolean z) {
        SnsMethodCalculate.markStartTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        String str = f254627a;
        if (!TextUtils.isEmpty(str)) {
            Log.m105924i("AdWuidHelper", "doGetWuid, hit mem cache=" + str + ", isPreload=" + z);
            SnsMethodCalculate.markEndTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return str;
        }
        SnsMethodCalculate.markStartTimeMs("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        String c = m109541c();
        String str2 = "";
        if (!TextUtils.isEmpty(c)) {
            HashMap<String, HashMap<String, String>> hashMap = C79617c.f233467a;
            SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            String c2 = C79617c.m96684c(str2, c);
            SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            str2 = Util.nullAsNil(c2);
            SnsMethodCalculate.markEndTimeMs("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        } else {
            SnsMethodCalculate.markEndTimeMs("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        }
        if (!TextUtils.isEmpty(str2)) {
            Log.m105924i("AdWuidHelper", "doGetWuid, hit local cache=" + str2 + ", isPreload=" + z);
            f254627a = str2;
            SnsMethodCalculate.markEndTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return str2;
        }
        Log.m105924i("AdWuidHelper", "doGetWuid, empty, isPreload=" + z);
        if (z && MMApplicationContext.isMainProcess()) {
            ((C119157j) C119157j.f356862d).mo183875f(new C88012a());
        }
        String str3 = f254627a;
        SnsMethodCalculate.markEndTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return str3;
    }

    /* renamed from: c */
    public static String m109541c() {
        SnsMethodCalculate.markStartTimeMs("getWuidCacheKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        String str = "";
        try {
            String i = C86709a0.m107523b().mo121111i();
            if (!TextUtils.isEmpty(i)) {
                str = "ad_wuid_" + i;
            }
        } catch (Throwable th) {
            Log.m105920e("AdWuidHelper", "getWuidCacheKey, exp=" + th.toString());
        }
        Log.m105924i("AdWuidHelper", "getWuidCacheKey, key=" + str);
        if (TextUtils.isEmpty(str)) {
            C115669n.INSTANCE.mo175911u(1940, 5);
        }
        SnsMethodCalculate.markEndTimeMs("getWuidCacheKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m109542d(java.lang.String r9) {
        /*
            java.lang.String r0 = "updateWuid"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "getWuid"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "getParamAtIdx"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0041
            java.lang.String r5 = "\\|"
            java.lang.String[] r5 = r9.split(r5)     // Catch:{ Exception -> 0x0033 }
            if (r5 == 0) goto L_0x003d
            int r7 = r5.length     // Catch:{ Exception -> 0x0033 }
            r8 = 13
            if (r7 <= r8) goto L_0x003d
            r5 = r5[r8]     // Catch:{ Exception -> 0x0033 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0033 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0045
        L_0x0033:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "UxInfoHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
        L_0x003d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0044
        L_0x0041:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x0044:
            r5 = r6
        L_0x0045:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r3 = "AdWuidHelper"
            if (r2 != 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "updateWuid:"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = ", uxInfo="
            r2.append(r4)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            f254627a = r5
            java.lang.String r9 = m109541c()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x008a
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r2 = ao2.C79617c.f233467a
            java.lang.String r2 = "setAdValue"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            ao2.C79617c.m96686e(r6, r9, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0090
        L_0x008a:
            java.lang.String r9 = "updateWuid, cacheKey is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x0090:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        L_0x0094:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "updateWuid, empty wuid, uxInfo="
            r2.append(r4)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jq2.C88011l.m109542d(java.lang.String):java.lang.String");
    }
}
