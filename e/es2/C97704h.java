package es2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import es2.C97696c;

/* renamed from: es2.h */
public abstract class C97704h extends C97696c {
    public C97704h(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0 A[SYNTHETIC, Splitter:B:49:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013d A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0186 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020b A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020f A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0212 A[Catch:{ Exception -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021a A[Catch:{ Exception -> 0x024b }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo136971h(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "MicroMsg.SnsDownloadImageBase"
            java.lang.String r2 = "appendUrlArg"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.download.SnsDownloadImageBase"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)     // Catch:{ Exception -> 0x024b }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x024b }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x024b }
            java.lang.String r5 = "SnsCloseDownloadWebp"
            java.lang.String r4 = r4.mo107405c(r5)     // Catch:{ Exception -> 0x024b }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x024b }
            r6 = 0
            if (r5 != 0) goto L_0x0029
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)     // Catch:{ Exception -> 0x024b }
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            r5 = 2
            r7 = 1
            if (r4 == 0) goto L_0x002f
            goto L_0x003e
        L_0x002f:
            gj.m r4 = p156gj.C107835h0.f322856m     // Catch:{ Exception -> 0x024b }
            int r4 = r4.f322894d0     // Catch:{ Exception -> 0x024b }
            if (r4 != r5) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.lang.String r4 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x024b }
            if (r4 != 0) goto L_0x0040
        L_0x003e:
            r4 = 0
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            boolean r8 = p156gj.C87201q.m108263g()     // Catch:{ Exception -> 0x024b }
            if (r8 != 0) goto L_0x0048
            goto L_0x0057
        L_0x0048:
            boolean r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.sy0()     // Catch:{ Exception -> 0x024b }
            if (r8 != 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            java.lang.String r8 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x024b }
            if (r8 != 0) goto L_0x0059
        L_0x0057:
            r8 = 0
            goto L_0x005a
        L_0x0059:
            r8 = 1
        L_0x005a:
            boolean r9 = p156gj.C87201q.m108263g()     // Catch:{ Exception -> 0x024b }
            if (r9 != 0) goto L_0x0061
            goto L_0x0070
        L_0x0061:
            boolean r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.ry0()     // Catch:{ Exception -> 0x024b }
            if (r9 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            java.lang.String r9 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x024b }
            if (r9 != 0) goto L_0x0072
        L_0x0070:
            r9 = 0
            goto L_0x0073
        L_0x0072:
            r9 = 1
        L_0x0073:
            java.lang.String r10 = "isNeedTransToWebp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)     // Catch:{ Exception -> 0x024b }
            boolean r10 = p156gj.C87201q.m108263g()     // Catch:{ Exception -> 0x024b }
            if (r10 != 0) goto L_0x0083
            goto L_0x0092
        L_0x0083:
            boolean r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.py0()     // Catch:{ Exception -> 0x024b }
            if (r10 != 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            java.lang.String r10 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x024b }
            if (r10 != 0) goto L_0x0094
        L_0x0092:
            r10 = 0
            goto L_0x0095
        L_0x0094:
            r10 = 1
        L_0x0095:
            java.lang.String r11 = sf0.C90188n0.f258922P     // Catch:{ Exception -> 0x024b }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x024b }
            java.lang.String r12 = "new url  "
            if (r11 == 0) goto L_0x0135
            java.lang.String r11 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x024b }
            if (r11 != 0) goto L_0x00aa
            goto L_0x0135
        L_0x00aa:
            if (r10 == 0) goto L_0x00d2
            es2.a r4 = r13.f286589f     // Catch:{ Exception -> 0x024b }
            te3.kv2 r4 = r4.f286537a     // Catch:{ Exception -> 0x024b }
            r8 = 4
            r4.f298685S = r8     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = "tp=wxpic"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            r4.append(r12)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x024b }
            goto L_0x01b6
        L_0x00d2:
            if (r8 == 0) goto L_0x00f3
            java.lang.String r4 = "tp=wxpc"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            r4.append(r12)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x024b }
            goto L_0x01b6
        L_0x00f3:
            if (r9 == 0) goto L_0x0114
            java.lang.String r4 = "tp=hevc"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            r4.append(r12)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x024b }
            goto L_0x01b6
        L_0x0114:
            if (r4 == 0) goto L_0x01b6
            java.lang.String r4 = "tp=webp"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            r4.append(r12)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x024b }
            goto L_0x01b6
        L_0x0135:
            java.lang.String r4 = sf0.C90188n0.f258922P     // Catch:{ Exception -> 0x024b }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x024b }
            if (r4 != 0) goto L_0x017e
            java.lang.String r4 = "(//?)"
            java.lang.String[] r4 = r14.split(r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r8.<init>()     // Catch:{ Exception -> 0x024b }
            r9 = r4[r6]     // Catch:{ Exception -> 0x024b }
            r8.append(r9)     // Catch:{ Exception -> 0x024b }
            java.lang.String r9 = "//"
            r8.append(r9)     // Catch:{ Exception -> 0x024b }
            java.lang.String r9 = sf0.C90188n0.f258922P     // Catch:{ Exception -> 0x024b }
            r8.append(r9)     // Catch:{ Exception -> 0x024b }
            r9 = 2
        L_0x0158:
            int r10 = r4.length     // Catch:{ Exception -> 0x024b }
            if (r9 >= r10) goto L_0x0168
            java.lang.String r10 = "/"
            r8.append(r10)     // Catch:{ Exception -> 0x024b }
            r10 = r4[r9]     // Catch:{ Exception -> 0x024b }
            r8.append(r10)     // Catch:{ Exception -> 0x024b }
            int r9 = r9 + 1
            goto L_0x0158
        L_0x0168:
            java.lang.String r14 = r8.toString()     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            r4.append(r12)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x024b }
        L_0x017e:
            java.lang.String r4 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x024b }
            if (r4 != 0) goto L_0x01b6
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r8.<init>()     // Catch:{ Exception -> 0x024b }
            java.lang.String r9 = "tp="
            r8.append(r9)     // Catch:{ Exception -> 0x024b }
            java.lang.String r9 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x024b }
            r8.append(r9)     // Catch:{ Exception -> 0x024b }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x024b }
            r4[r6] = r8     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            java.lang.String r8 = "(dbg) new url  "
            r4.append(r8)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x024b }
        L_0x01b6:
            es2.a r4 = r13.f286589f     // Catch:{ Exception -> 0x024b }
            if (r4 == 0) goto L_0x01fc
            te3.kv2 r4 = r4.f286537a     // Catch:{ Exception -> 0x024b }
            int r4 = r4.f298671D     // Catch:{ Exception -> 0x024b }
            if (r4 == 0) goto L_0x01fc
            java.lang.String r4 = "enc=1"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r4.<init>()     // Catch:{ Exception -> 0x024b }
            java.lang.String r8 = "test for enckey "
            r4.append(r8)     // Catch:{ Exception -> 0x024b }
            es2.a r8 = r13.f286589f     // Catch:{ Exception -> 0x024b }
            te3.kv2 r8 = r8.f286537a     // Catch:{ Exception -> 0x024b }
            long r8 = r8.f298672E     // Catch:{ Exception -> 0x024b }
            r4.append(r8)     // Catch:{ Exception -> 0x024b }
            r4.append(r0)     // Catch:{ Exception -> 0x024b }
            es2.a r8 = r13.f286589f     // Catch:{ Exception -> 0x024b }
            te3.kv2 r8 = r8.f286537a     // Catch:{ Exception -> 0x024b }
            int r8 = r8.f298671D     // Catch:{ Exception -> 0x024b }
            r4.append(r8)     // Catch:{ Exception -> 0x024b }
            r4.append(r0)     // Catch:{ Exception -> 0x024b }
            r4.append(r14)     // Catch:{ Exception -> 0x024b }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x024b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x024b }
            r0 = 136(0x88, float:1.9E-43)
            as2.C28125b.m38099a(r0)     // Catch:{ Exception -> 0x024b }
        L_0x01fc:
            es2.a r0 = r13.f286589f     // Catch:{ Exception -> 0x024b }
            if (r0 == 0) goto L_0x0247
            te3.kv2 r4 = r0.f286537a     // Catch:{ Exception -> 0x024b }
            if (r4 == 0) goto L_0x0247
            boolean r0 = r0.f286540d     // Catch:{ Exception -> 0x024b }
            if (r0 == 0) goto L_0x020b
            java.lang.String r8 = r4.f298677J     // Catch:{ Exception -> 0x024b }
            goto L_0x020d
        L_0x020b:
            java.lang.String r8 = r4.f298674G     // Catch:{ Exception -> 0x024b }
        L_0x020d:
            if (r0 == 0) goto L_0x0212
            int r0 = r4.f298678K     // Catch:{ Exception -> 0x024b }
            goto L_0x0214
        L_0x0212:
            int r0 = r4.f298675H     // Catch:{ Exception -> 0x024b }
        L_0x0214:
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x024b }
            if (r4 != 0) goto L_0x0247
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r5.<init>()     // Catch:{ Exception -> 0x024b }
            java.lang.String r9 = "token="
            r5.append(r9)     // Catch:{ Exception -> 0x024b }
            r5.append(r8)     // Catch:{ Exception -> 0x024b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x024b }
            r4[r6] = r5     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r5.<init>()     // Catch:{ Exception -> 0x024b }
            java.lang.String r6 = "idx="
            r5.append(r6)     // Catch:{ Exception -> 0x024b }
            r5.append(r0)     // Catch:{ Exception -> 0x024b }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x024b }
            r4[r7] = r0     // Catch:{ Exception -> 0x024b }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x024b }
        L_0x0247:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r14
        L_0x024b:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "error get dyna by webp "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97704h.mo136971h(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0092 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[SYNTHETIC, Splitter:B:53:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0145 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018e A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c2 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fc A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ff A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0206 A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020e A[Catch:{ Exception -> 0x023f }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo136972i(java.lang.String r14, te3.C101804kv2 r15) {
        /*
            r13 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "appendUrlArg"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.download.SnsDownloadImageBase"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "MicroMsg.SnsDownloadImageBase"
            if (r15 != 0) goto L_0x001a
            java.lang.String r15 = "appendUrlArg, media is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            java.lang.String r14 = r13.mo136971h(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        L_0x001a:
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)     // Catch:{ Exception -> 0x023f }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x023f }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x023f }
            java.lang.String r5 = "SnsCloseDownloadWebp"
            java.lang.String r4 = r4.mo107405c(r5)     // Catch:{ Exception -> 0x023f }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x023f }
            r6 = 0
            if (r5 != 0) goto L_0x0038
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)     // Catch:{ Exception -> 0x023f }
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            r5 = 2
            r7 = 1
            if (r4 == 0) goto L_0x003e
            goto L_0x004d
        L_0x003e:
            gj.m r4 = p156gj.C107835h0.f322856m     // Catch:{ Exception -> 0x023f }
            int r4 = r4.f322894d0     // Catch:{ Exception -> 0x023f }
            if (r4 != r5) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            java.lang.String r4 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x023f }
            if (r4 != 0) goto L_0x004f
        L_0x004d:
            r4 = 0
            goto L_0x0050
        L_0x004f:
            r4 = 1
        L_0x0050:
            boolean r8 = p156gj.C87201q.m108263g()     // Catch:{ Exception -> 0x023f }
            if (r8 != 0) goto L_0x0057
            goto L_0x0066
        L_0x0057:
            boolean r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.sy0()     // Catch:{ Exception -> 0x023f }
            if (r8 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.lang.String r8 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x023f }
            if (r8 != 0) goto L_0x0068
        L_0x0066:
            r8 = 0
            goto L_0x0069
        L_0x0068:
            r8 = 1
        L_0x0069:
            boolean r9 = p156gj.C87201q.m108263g()     // Catch:{ Exception -> 0x023f }
            if (r9 != 0) goto L_0x0070
            goto L_0x007f
        L_0x0070:
            boolean r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.ry0()     // Catch:{ Exception -> 0x023f }
            if (r9 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            java.lang.String r9 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x023f }
            if (r9 != 0) goto L_0x0081
        L_0x007f:
            r9 = 0
            goto L_0x0082
        L_0x0081:
            r9 = 1
        L_0x0082:
            java.lang.String r10 = "isNeedTransToWebp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r2)     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r2)     // Catch:{ Exception -> 0x023f }
            boolean r10 = p156gj.C87201q.m108263g()     // Catch:{ Exception -> 0x023f }
            if (r10 != 0) goto L_0x0092
            goto L_0x00a1
        L_0x0092:
            boolean r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.py0()     // Catch:{ Exception -> 0x023f }
            if (r10 != 0) goto L_0x0099
            goto L_0x00a1
        L_0x0099:
            java.lang.String r10 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x023f }
            if (r10 != 0) goto L_0x00a3
        L_0x00a1:
            r10 = 0
            goto L_0x00a4
        L_0x00a3:
            r10 = 1
        L_0x00a4:
            java.lang.String r11 = sf0.C90188n0.f258922P     // Catch:{ Exception -> 0x023f }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x023f }
            java.lang.String r12 = "new url  "
            if (r11 == 0) goto L_0x013d
            java.lang.String r11 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x023f }
            if (r11 != 0) goto L_0x00b9
            goto L_0x013d
        L_0x00b9:
            if (r10 == 0) goto L_0x00da
            java.lang.String r4 = "tp=wxpic"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            r4.append(r12)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x023f }
            goto L_0x01be
        L_0x00da:
            if (r8 == 0) goto L_0x00fb
            java.lang.String r4 = "tp=wxpc"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            r4.append(r12)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x023f }
            goto L_0x01be
        L_0x00fb:
            if (r9 == 0) goto L_0x011c
            java.lang.String r4 = "tp=hevc"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            r4.append(r12)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x023f }
            goto L_0x01be
        L_0x011c:
            if (r4 == 0) goto L_0x01be
            java.lang.String r4 = "tp=webp"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            r4.append(r12)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x023f }
            goto L_0x01be
        L_0x013d:
            java.lang.String r4 = sf0.C90188n0.f258922P     // Catch:{ Exception -> 0x023f }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x023f }
            if (r4 != 0) goto L_0x0186
            java.lang.String r4 = "(//?)"
            java.lang.String[] r4 = r14.split(r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r8.<init>()     // Catch:{ Exception -> 0x023f }
            r9 = r4[r6]     // Catch:{ Exception -> 0x023f }
            r8.append(r9)     // Catch:{ Exception -> 0x023f }
            java.lang.String r9 = "//"
            r8.append(r9)     // Catch:{ Exception -> 0x023f }
            java.lang.String r9 = sf0.C90188n0.f258922P     // Catch:{ Exception -> 0x023f }
            r8.append(r9)     // Catch:{ Exception -> 0x023f }
            r9 = 2
        L_0x0160:
            int r10 = r4.length     // Catch:{ Exception -> 0x023f }
            if (r9 >= r10) goto L_0x0170
            java.lang.String r10 = "/"
            r8.append(r10)     // Catch:{ Exception -> 0x023f }
            r10 = r4[r9]     // Catch:{ Exception -> 0x023f }
            r8.append(r10)     // Catch:{ Exception -> 0x023f }
            int r9 = r9 + 1
            goto L_0x0160
        L_0x0170:
            java.lang.String r14 = r8.toString()     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            r4.append(r12)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x023f }
        L_0x0186:
            java.lang.String r4 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x023f }
            if (r4 != 0) goto L_0x01be
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r8.<init>()     // Catch:{ Exception -> 0x023f }
            java.lang.String r9 = "tp="
            r8.append(r9)     // Catch:{ Exception -> 0x023f }
            java.lang.String r9 = sf0.C90188n0.f258923Q     // Catch:{ Exception -> 0x023f }
            r8.append(r9)     // Catch:{ Exception -> 0x023f }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x023f }
            r4[r6] = r8     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            java.lang.String r8 = "(dbg) new url  "
            r4.append(r8)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x023f }
        L_0x01be:
            int r4 = r15.f298671D     // Catch:{ Exception -> 0x023f }
            if (r4 == 0) goto L_0x01f6
            java.lang.String r4 = "enc=1"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r4)     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            java.lang.String r8 = "test for enckey "
            r4.append(r8)     // Catch:{ Exception -> 0x023f }
            long r8 = r15.f298672E     // Catch:{ Exception -> 0x023f }
            r4.append(r8)     // Catch:{ Exception -> 0x023f }
            r4.append(r0)     // Catch:{ Exception -> 0x023f }
            int r8 = r15.f298671D     // Catch:{ Exception -> 0x023f }
            r4.append(r8)     // Catch:{ Exception -> 0x023f }
            r4.append(r0)     // Catch:{ Exception -> 0x023f }
            r4.append(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x023f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x023f }
            r0 = 136(0x88, float:1.9E-43)
            as2.C28125b.m38099a(r0)     // Catch:{ Exception -> 0x023f }
        L_0x01f6:
            es2.a r0 = r13.f286589f     // Catch:{ Exception -> 0x023f }
            boolean r0 = r0.f286540d     // Catch:{ Exception -> 0x023f }
            if (r0 == 0) goto L_0x01ff
            java.lang.String r4 = r15.f298677J     // Catch:{ Exception -> 0x023f }
            goto L_0x0201
        L_0x01ff:
            java.lang.String r4 = r15.f298674G     // Catch:{ Exception -> 0x023f }
        L_0x0201:
            if (r0 == 0) goto L_0x0206
            int r15 = r15.f298678K     // Catch:{ Exception -> 0x023f }
            goto L_0x0208
        L_0x0206:
            int r15 = r15.f298675H     // Catch:{ Exception -> 0x023f }
        L_0x0208:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x023f }
            if (r0 != 0) goto L_0x023b
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r5.<init>()     // Catch:{ Exception -> 0x023f }
            java.lang.String r8 = "token="
            r5.append(r8)     // Catch:{ Exception -> 0x023f }
            r5.append(r4)     // Catch:{ Exception -> 0x023f }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x023f }
            r0[r6] = r4     // Catch:{ Exception -> 0x023f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023f }
            r4.<init>()     // Catch:{ Exception -> 0x023f }
            java.lang.String r5 = "idx="
            r4.append(r5)     // Catch:{ Exception -> 0x023f }
            r4.append(r15)     // Catch:{ Exception -> 0x023f }
            java.lang.String r15 = r4.toString()     // Catch:{ Exception -> 0x023f }
            r0[r7] = r15     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = r13.mo136984t(r14, r0)     // Catch:{ Exception -> 0x023f }
        L_0x023b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        L_0x023f:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "error get dyna by webp "
            r0.append(r4)
            java.lang.String r15 = r15.getMessage()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97704h.mo136972i(java.lang.String, te3.kv2):java.lang.String");
    }

    /* renamed from: t */
    public final String mo136984t(String str, String... strArr) {
        SnsMethodCalculate.markStartTimeMs("safelyConcatParam", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImageBase");
        if (strArr != null) {
            StringBuilder sb = new StringBuilder(str);
            String str2 = "?";
            if (str.contains(str2)) {
                str2 = "&";
            }
            sb.append(str2);
            boolean z = true;
            for (String str3 : strArr) {
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(str3);
            }
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("safelyConcatParam", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImageBase");
            return sb4;
        }
        SnsMethodCalculate.markEndTimeMs("safelyConcatParam", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImageBase");
        return str;
    }
}
