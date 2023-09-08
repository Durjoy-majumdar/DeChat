package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import p214om.C11502f;
import te3.C101799k1;

/* renamed from: com.tencent.mm.plugin.sns.ui.y1 */
public class C96318y1 {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m123547a(android.content.Context r8, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r9, te3.C101799k1 r10) {
        /*
            java.lang.String r0 = "fillActionContent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.OpenActionContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r10 == 0) goto L_0x00c3
            te3.g1 r3 = r10.f298580j
            if (r3 == 0) goto L_0x00c3
            java.lang.Class<ym.l> r3 = p763ym.C79138l.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ym.l r3 = (p763ym.C79138l) r3
            te3.g1 r4 = r10.f298580j
            java.lang.String r4 = r4.f298271d
            boolean r3 = r3.Lw0(r4)
            if (r3 == 0) goto L_0x00c3
            r9.f281365Y = r2
            java.lang.String r3 = ""
            te3.s5 r4 = r10.f298584q
            if (r4 == 0) goto L_0x0071
            te3.s5 r4 = r10.f298585r
            if (r4 == 0) goto L_0x0071
            java.lang.Class<om.f> r3 = p214om.C11502f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            om.f r3 = (p214om.C11502f) r3
            wc3.y r3 = r3.mo11461Sr()
            te3.g1 r4 = r10.f298580j
            java.lang.String r4 = r4.f298271d
            boolean r8 = r3.mo93140D5(r8, r4)
            if (r8 == 0) goto L_0x0045
            te3.s5 r8 = r10.f298584q
            goto L_0x0047
        L_0x0045:
            te3.s5 r8 = r10.f298585r
        L_0x0047:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r4 = "zh_CN"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0058
            java.lang.String r8 = r8.f299377e
        L_0x0056:
            r3 = r8
            goto L_0x0091
        L_0x0058:
            java.lang.String r4 = "zh_TW"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x006e
            java.lang.String r4 = "zh_HK"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            java.lang.String r8 = r8.f299376d
            goto L_0x0056
        L_0x006e:
            java.lang.String r8 = r8.f299378f
            goto L_0x0056
        L_0x0071:
            java.lang.String r4 = m123549c(r8, r10)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0091 }
            if (r5 != 0) goto L_0x0091
            android.content.res.Resources r5 = r8.getResources()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "string"
            java.lang.String r7 = r8.getPackageName()     // Catch:{ Exception -> 0x0091 }
            int r4 = r5.getIdentifier(r4, r6, r7)     // Catch:{ Exception -> 0x0091 }
            if (r4 <= 0) goto L_0x0091
            java.lang.String r8 = r8.getString(r4)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0056
        L_0x0091:
            int r8 = r10.f298574d
            r4 = 4
            r5 = 1
            if (r8 == r4) goto L_0x00ae
            r4 = 5
            if (r8 == r4) goto L_0x00a5
            r10 = 6
            if (r8 == r10) goto L_0x00a0
            r9.f281365Y = r2
            goto L_0x00b2
        L_0x00a0:
            r9.f281366Z = r3
            r9.f281365Y = r5
            goto L_0x00b2
        L_0x00a5:
            int r8 = r10.f298576f
            if (r8 != r5) goto L_0x00b2
            r9.f281366Z = r3
            r9.f281365Y = r5
            goto L_0x00b2
        L_0x00ae:
            r9.f281366Z = r3
            r9.f281365Y = r5
        L_0x00b2:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r8 == 0) goto L_0x00c5
            java.lang.String r8 = "MicroMsg.OpenActionContent"
            java.lang.String r10 = "text can not load ?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r10)
            r9.f281365Y = r2
            goto L_0x00c5
        L_0x00c3:
            r9.f281365Y = r2
        L_0x00c5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96318y1.m123547a(android.content.Context, com.tencent.mm.plugin.sns.ui.w6, te3.k1):void");
    }

    /* renamed from: b */
    public static int m123548b(Context context, C101799k1 k1Var) {
        SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
        if (k1Var == null) {
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return 0;
        } else if (k1Var.f298574d != 6) {
            int i = k1Var.f298576f;
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return i;
        } else if (k1Var.f298582o == null) {
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return 0;
        } else if (k1Var.f298580j == null) {
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return 0;
        } else if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93140D5(context, k1Var.f298580j.f298271d)) {
            int i2 = k1Var.f298582o.f182212d;
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return i2;
        } else {
            int i3 = k1Var.f298582o.f182213e;
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return i3;
        }
    }

    /* renamed from: c */
    public static String m123549c(Context context, C101799k1 k1Var) {
        SnsMethodCalculate.markStartTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
        if (k1Var == null) {
            SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return "";
        } else if (k1Var.f298574d != 6) {
            String str = k1Var.f298581n;
            SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return str;
        } else if (k1Var.f298583p == null) {
            SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return "";
        } else if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93140D5(context, k1Var.f298580j.f298271d)) {
            String str2 = k1Var.f298583p.f185499d;
            SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return str2;
        } else {
            String str3 = k1Var.f298583p.f185500e;
            SnsMethodCalculate.markEndTimeMs("getWordingKey", "com.tencent.mm.plugin.sns.ui.OpenActionContent");
            return str3;
        }
    }
}
