package com.tencent.p014mm.modelstat;

import ad0.C0033t;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import hd0.C98408n0;
import hd0.C98429r0;
import po2.C100833f;
import rq2.C63505q;
import te3.C64258bf0;
import te3.bb4;
import te3.cb4;

/* renamed from: com.tencent.mm.modelstat.v */
public class C92859v {
    /* renamed from: a */
    public static void m117123a(String str, C0033t tVar) {
        SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (tVar == null) {
            SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return;
        }
        m117124b(str, tVar);
        SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
    }

    /* renamed from: b */
    public static void m117124b(String str, C0033t tVar) {
        SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (Util.isNullOrNil(str) || tVar == null) {
            SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return;
        }
        cb4 g = m117129g(str);
        StringBuilder sb = new StringBuilder();
        sb.append(g == null ? -1 : g.f298025g);
        sb.append(",");
        tVar.mo32a("Source", sb.toString());
        tVar.mo32a("SnsStatExt", m117128f(g));
        SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.modelstat.SnsStatExtUtil");
    }

    /* renamed from: c */
    public static String m117125c(C64258bf0 bf02) {
        String str;
        SnsMethodCalculate.markStartTimeMs("composeTopicTitle", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (TextUtils.isEmpty(bf02.f182282f) || (bf02.f182284h & 1) == 1) {
            str = bf02.f182281e;
        } else {
            str = MMApplicationContext.getContext().getString(C0966R.string.jh7, new Object[]{bf02.f182282f, bf02.f182281e});
        }
        SnsMethodCalculate.markEndTimeMs("composeTopicTitle", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return str;
    }

    /* renamed from: d */
    public static int m117126d(String str) {
        SnsMethodCalculate.markStartTimeMs("getAdCanvasType", "com.tencent.mm.modelstat.SnsStatExtUtil");
        int i = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markStartTimeMs("isShareGiveHBCanvas", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                boolean z = str != null && str.contains("<giveHBCardInfo>");
                SnsMethodCalculate.markEndTimeMs("isShareGiveHBCanvas", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                if (z) {
                    i = 2;
                } else if (str.contains("isInteractiveCanvas")) {
                    i = 1;
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsStatExtUtil", "getAdCanvasType exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getAdCanvasType", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return i;
    }

    /* renamed from: e */
    public static String m117127e(C72963f4 f4Var) {
        SnsMethodCalculate.markStartTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (f4Var == null) {
            SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return "";
        }
        String str = null;
        if (f4Var.mo101020w3()) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null || Util.isNullOrNil(u.f195535U1)) {
                SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return "";
            }
            str = u.f195535U1;
        }
        if (f4Var.mo100989b4()) {
            C98408n0 i = C98429r0.m127818i(f4Var.mo108765s2());
            if (i == null || Util.isNullOrNil(i.f288536D)) {
                SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return "";
            }
            str = i.f288536D;
        }
        SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r3 = r3.split("\\|");
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m117128f(te3.cb4 r9) {
        /*
            java.lang.String r0 = "getSnsStatExt"
            java.lang.String r1 = "com.tencent.mm.modelstat.SnsStatExtUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = ""
            if (r9 == 0) goto L_0x0050
            java.lang.String r3 = r9.f298024f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r5 = 0
            if (r4 != 0) goto L_0x0022
            java.lang.String r4 = "\\|"
            java.lang.String[] r3 = r3.split(r4)
            if (r3 == 0) goto L_0x0022
            int r4 = r3.length
            if (r4 <= 0) goto L_0x0022
            r3 = r3[r5]
            goto L_0x0023
        L_0x0022:
            r3 = r2
        L_0x0023:
            r4 = 1
            java.lang.String r6 = "expId=%d&adgroup_id=%s&snsId=%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            int r8 = r9.f298027i     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            r7[r5] = r8     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            java.lang.String r8 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r8)     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            r7[r4] = r3     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            r3 = 2
            java.lang.String r9 = r9.f298023e     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            r7[r3] = r9     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            java.lang.String r9 = java.lang.String.format(r6, r7)     // Catch:{ UnsupportedEncodingException -> 0x0046 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        L_0x0046:
            r9 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r9
            java.lang.String r9 = "MicroMsg.SnsStatExtUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r2, r3)
        L_0x0050:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C92859v.m117128f(te3.cb4):java.lang.String");
    }

    /* renamed from: g */
    public static cb4 m117129g(String str) {
        SnsMethodCalculate.markStartTimeMs("parseStatSnsAdInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("parseStatSnsAdInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        bb4 bb4 = new bb4();
        try {
            bb4.parseFrom(decode);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsStatExtUtil", "", e);
        }
        cb4 cb4 = bb4.f226992d;
        SnsMethodCalculate.markEndTimeMs("parseStatSnsAdInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        return cb4;
    }

    /* renamed from: h */
    public static bb4 m117130h(String str) {
        SnsMethodCalculate.markStartTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.SnsStatExtUtil", "parseStatisticsExtInfoFromEncodeStr, statextstr empty");
            SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return null;
        }
        bb4 bb4 = new bb4();
        try {
            bb4.parseFrom(Base64.decode(str, 0));
            if (bb4.f226992d == null) {
                SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                return null;
            }
            SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return bb4;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsStatExtUtil", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("parseStatisticsExtInfoFromEncodeStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            return null;
        }
    }

    /* renamed from: i */
    public static void m117131i(C72963f4 f4Var) {
        SnsMethodCalculate.markStartTimeMs("reportAdShareClickForChat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        try {
            bb4 h = m117130h(m117127e(f4Var));
            if (h != null) {
                if (h.f226992d != null) {
                    String t = f4Var.mo108768t();
                    SnsMethodCalculate.markStartTimeMs("getChatScene", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    String str = t.endsWith("@chatroom") ? "2" : "1";
                    SnsMethodCalculate.markEndTimeMs("getChatScene", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    int d = m117126d(f4Var.getContent());
                    C100833f fVar = new C100833f();
                    cb4 cb4 = h.f226992d;
                    fVar.f295341a = cb4.f298023e;
                    fVar.f295342b = cb4.f298024f;
                    fVar.f295343c = 2;
                    fVar.f295344d = Util.safeParseInt(str);
                    fVar.f295345e = d;
                    C63505q.m74843b(fVar);
                    C115669n.INSTANCE.mo175911u(1898, 1);
                    SnsMethodCalculate.markEndTimeMs("reportAdShareClickForChat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    return;
                }
            }
            Log.m105920e("MicroMsg.SnsStatExtUtil", "reportAdShareClickForChat, extInfo or extInfo.StatSnsAdInfo==null");
            SnsMethodCalculate.markEndTimeMs("reportAdShareClickForChat", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsStatExtUtil", "reportAdShareClickForChat, exp=" + th.toString());
        }
    }
}
