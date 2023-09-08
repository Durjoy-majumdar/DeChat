package com.tencent.p014mm.plugin.game.model.silent_download;

import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Map;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.h */
public class C42104h {
    /* renamed from: a */
    public static void m45804a(String str, int i, int i2) {
        if (!Util.isNullOrNil(str)) {
            FileDownloadTaskInfo a = C42101c.m45793a(str);
            if (a != null) {
                long j = a.f12194d;
                if (j > 0) {
                    String str2 = a.f12195e;
                    long j2 = a.f12201n;
                    m45805b(str, j, str2, j2 == 0 ? 0 : (int) ((a.f12200j * 100) / j2), i, i2, false, false, false, false, false, (Map<String, String>) null);
                    return;
                }
            }
            m45805b(str, 0, "", 0, i, i2, false, false, false, false, false, (Map<String, String>) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ec A[LOOP:0: B:21:0x00ea->B:22:0x00ec, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45805b(java.lang.String r17, long r18, java.lang.String r20, int r21, int r22, int r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, java.util.Map<java.lang.String, java.lang.String> r29) {
        /*
            r0 = r17
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)     // Catch:{ UnsupportedEncodingException -> 0x0048 }
            java.lang.String r2 = "UTF-8"
            if (r1 != 0) goto L_0x0011
            r1 = r20
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            goto L_0x0013
        L_0x0011:
            r1 = r20
        L_0x0013:
            if (r29 != 0) goto L_0x001b
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ UnsupportedEncodingException -> 0x004a }
            r3.<init>()     // Catch:{ UnsupportedEncodingException -> 0x004a }
            goto L_0x001d
        L_0x001b:
            r3 = r29
        L_0x001d:
            java.lang.Class<sw1.q> r4 = sw1.C48484q.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            sw1.q r4 = (sw1.C48484q) r4     // Catch:{ UnsupportedEncodingException -> 0x004a }
            com.tencent.mm.plugin.game.model.silent_download.i r4 = r4.Po0()     // Catch:{ UnsupportedEncodingException -> 0x004a }
            com.tencent.mm.plugin.game.model.silent_download.f r4 = r4.mo66064jo(r0)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            if (r4 == 0) goto L_0x003a
            java.lang.String r5 = "forceUpdateFlag"
            int r4 = r4.field_forceUpdateFlag     // Catch:{ UnsupportedEncodingException -> 0x004a }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            r3.put(r5, r4)     // Catch:{ UnsupportedEncodingException -> 0x004a }
        L_0x003a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException -> 0x004a }
            r4.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            java.lang.String r3 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x004a }
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            goto L_0x004c
        L_0x0048:
            r1 = r20
        L_0x004a:
            java.lang.String r2 = ""
        L_0x004c:
            r3 = 12
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            java.lang.Long r6 = java.lang.Long.valueOf(r18)
            r7 = 1
            r4[r7] = r6
            r6 = 2
            r4[r6] = r1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            r9 = 3
            r4[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            r10 = 4
            r4[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            r11 = 5
            r4[r11] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r24)
            r12 = 6
            r4[r12] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r25)
            r13 = 7
            r4[r13] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r26)
            r14 = 8
            r4[r14] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r27)
            r15 = 9
            r4[r15] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r28)
            r16 = 10
            r4[r16] = r8
            r8 = 11
            r4[r8] = r2
            java.lang.String r8 = "MicroMsg.GameSilentDownloadReporter"
            java.lang.String r15 = "15547 reportInfo, appId:%s, downloadId:%d, downloadUrl:%s, downloadedPct:%d, finishType:%d, errCode:%d, noWifi:%b, noSdcard:%b, noEnoughSpace:%b, lowBattery:%b, continueDelay:%b, extInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r3[r7] = r0
            r3[r6] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r3[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r3[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r3[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r3[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r3[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r3[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r1 = 9
            r3[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r3[r16] = r0
            r0 = 11
            r3[r0] = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00ea:
            if (r5 >= r0) goto L_0x00fd
            r2 = r3[r5]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            int r5 = r5 + 1
            goto L_0x00ea
        L_0x00fd:
            r0 = r3[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            u10.a r1 = u10.C52415a.m58668a()
            u10.b r2 = new u10.b
            r3 = 15547(0x3cbb, float:2.1786E-41)
            r2.<init>(r3, r0)
            com.tencent.mm.game.report.b r1 = (com.tencent.p014mm.game.report.C40304b) r1
            r1.getClass()
            com.tencent.p014mm.game.report.C40311f.m43479a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.silent_download.C42104h.m45805b(java.lang.String, long, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, boolean, java.util.Map):void");
    }

    /* renamed from: c */
    public static void m45806c(String str, int i, int i2) {
        if (!Util.isNullOrNil(str) && ((C48484q) C86312j.m106911c(C48484q.class)).Po0().mo66064jo(str) != null) {
            m45804a(str, i, i2);
        }
    }

    /* renamed from: d */
    public static void m45807d(String str) {
        if (!Util.isNullOrNil(str)) {
            FileDownloadTaskInfo a = C42101c.m45793a(str);
            C42103f jo = ((C48484q) C86312j.m106911c(C48484q.class)).Po0().mo66064jo(str);
            if (a != null) {
                long j = a.f12194d;
                if (j > 0) {
                    if (jo != null) {
                        String str2 = a.f12195e;
                        long j2 = a.f12201n;
                        m45805b(str, j, str2, j2 == 0 ? 0 : (int) ((a.f12200j * 100) / j2), 3, 0, jo.field_noWifi, jo.field_noSdcard, jo.field_noEnoughSpace, jo.field_lowBattery, jo.field_continueDelay, (Map<String, String>) null);
                        return;
                    }
                    String str3 = a.f12195e;
                    long j3 = a.f12201n;
                    m45805b(str, j, str3, j3 == 0 ? 0 : (int) ((a.f12200j * 100) / j3), 3, 0, false, false, false, false, false, (Map<String, String>) null);
                    return;
                }
            }
            if (jo != null) {
                m45805b(str, 0, "", 0, 3, 0, jo.field_noWifi, jo.field_noSdcard, jo.field_noEnoughSpace, jo.field_lowBattery, jo.field_continueDelay, (Map<String, String>) null);
            } else {
                m45805b(str, 0, "", 0, 3, 0, false, false, false, false, false, (Map<String, String>) null);
            }
        }
    }
}
