package fo2;

/* renamed from: fo2.c */
public class C87029c {
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0061 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m108054a(android.content.Context r7) {
        /*
            java.lang.String r7 = "getSysInfoInfoForWUA"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "build_version_release"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "build_model"
            java.lang.String r3 = p156gj.C87203t.m108275k()     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "build_version_codename"
            java.lang.String r3 = android.os.Build.VERSION.CODENAME     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "build_id"
            java.lang.String r3 = android.os.Build.ID     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "sw_size"
            java.lang.String r3 = "getScreenWidthBucket"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r0)     // Catch:{ Exception -> 0x0068 }
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0042 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ Exception -> 0x0042 }
            r5 = 2131361810(0x7f0a0012, float:1.8343383E38)
            int r4 = r4.getInteger(r5)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0043
        L_0x0042:
            r4 = 1
        L_0x0043:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r4)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "build_manufacturer"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "build_release_or_codename"
            java.lang.String r3 = "getVersionReleaseOrCodename"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r0)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0068 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0061 }
            r6 = 30
            if (r5 < r6) goto L_0x0061
            java.lang.String r4 = android.os.Build.VERSION.RELEASE_OR_CODENAME     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r4)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0083
        L_0x0068:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getSysInfoInfoForWUA exp="
            r3.append(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AdDeviceInfo.ua.UserAgentUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0083:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fo2.C87029c.m108054a(android.content.Context):org.json.JSONObject");
    }
}
