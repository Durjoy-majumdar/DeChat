package om2;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import java.util.regex.Pattern;
import p629ny.C76979h;

/* renamed from: om2.b */
public class C35195b implements C31922b1 {

    /* renamed from: d */
    public static final Pattern f94359d = Pattern.compile("\\$\\{(.+)\\}");

    /* renamed from: d */
    public static CharSequence m40588d(String str, String str2, boolean z) {
        String str3;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
        if (!z || Util.isNullOrNil(z1Var.mo73969n2())) {
            String username = z1Var.getUsername();
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            str3 = Lo == null ? null : Lo.mo69789q2(username);
        } else {
            str3 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.mo62909j3();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.getUsername();
        }
        return ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f5 A[Catch:{ Exception -> 0x0171 }] */
    /* renamed from: X5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo10269X5(java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, ob0.C35136m.C35137a r20) {
        /*
            r17 = this;
            r0 = r19
            java.lang.Class<km2.b> r1 = km2.C33939b.class
            java.lang.String r2 = ".sysmsg.revokehistoryinjoinroommsg.historyid"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = ""
            r6 = r18
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
            r7 = 0
            r4[r7] = r5
            java.lang.String r5 = "MicroMsg.recordSelect.RevokeHistoryInjoinRoomMsgNewXmlConsumer"
            java.lang.String r8 = "consumeNewXml subType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r8, r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r18)
            java.lang.String r6 = "revokehistoryinjoinroommsg"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0189
            if (r0 == 0) goto L_0x0189
            r4 = 2
            boolean r6 = r0.containsKey(r2)     // Catch:{ Exception -> 0x0171 }
            if (r6 == 0) goto L_0x016a
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r6 = ".sysmsg.revokehistoryinjoinroommsg.roomname"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0171 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = ".sysmsg.revokehistoryinjoinroommsg.template"
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = r8.trim()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r9 = ".sysmsg.revokehistoryinjoinroommsg.inviterusername"
            java.lang.Object r9 = r0.get(r9)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0171 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r9 = r9.trim()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r10 = ".sysmsg.revokehistoryinjoinroommsg.oper"
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0171 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)     // Catch:{ Exception -> 0x0171 }
            if (r0 == r3) goto L_0x008c
            if (r0 != r4) goto L_0x008a
            java.lang.String r10 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0171 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r10)     // Catch:{ Exception -> 0x0171 }
            if (r10 != 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r1 = 0
            goto L_0x00e8
        L_0x008c:
            di3.d r10 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0171 }
            km2.b r10 = (km2.C33939b) r10     // Catch:{ Exception -> 0x0171 }
            pm2.b r10 = r10.vx0()     // Catch:{ Exception -> 0x0171 }
            com.tencent.mm.storage.f4 r10 = r10.mo60316Lo(r2)     // Catch:{ Exception -> 0x0171 }
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0171 }
            km2.b r1 = (km2.C33939b) r1     // Catch:{ Exception -> 0x0171 }
            pm2.b r1 = r1.vx0()     // Catch:{ Exception -> 0x0171 }
            boolean r1 = r1.mo60319jo(r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r11 = "historyId:%s deleteRelatedMsgs res:%s"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0171 }
            r12[r7] = r2     // Catch:{ Exception -> 0x0171 }
            r12[r3] = r1     // Catch:{ Exception -> 0x0171 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r12)     // Catch:{ Exception -> 0x0171 }
            int r1 = r10.f230723F     // Catch:{ Exception -> 0x0171 }
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r10.mo108743W2(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x0171 }
            f62.k0 r1 = (f62.C75700k0) r1     // Catch:{ Exception -> 0x0171 }
            g62.l r1 = r1.mo96095LE()     // Catch:{ Exception -> 0x0171 }
            long r11 = r10.getMsgId()     // Catch:{ Exception -> 0x0171 }
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ Exception -> 0x0171 }
            r1.xy0(r11, r10)     // Catch:{ Exception -> 0x0171 }
            com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent r1 = new com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent     // Catch:{ Exception -> 0x0171 }
            r1.<init>()     // Catch:{ Exception -> 0x0171 }
            com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent$a r11 = r1.f78941d     // Catch:{ Exception -> 0x0171 }
            long r12 = r10.getMsgId()     // Catch:{ Exception -> 0x0171 }
            r11.f78942a = r12     // Catch:{ Exception -> 0x0171 }
            android.os.Looper r10 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0171 }
            r1.asyncPublish((android.os.Looper) r10)     // Catch:{ Exception -> 0x0171 }
            r1 = 1
        L_0x00e8:
            java.util.regex.Pattern r10 = f94359d     // Catch:{ Exception -> 0x0171 }
            java.util.regex.Matcher r10 = r10.matcher(r8)     // Catch:{ Exception -> 0x0171 }
            boolean r11 = r10.find()     // Catch:{ Exception -> 0x0171 }
            r12 = 3
            if (r11 == 0) goto L_0x0116
            java.lang.String r10 = r10.group(r7)     // Catch:{ Exception -> 0x0171 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0171 }
            if (r11 != 0) goto L_0x0116
            int r11 = r10.length()     // Catch:{ Exception -> 0x0171 }
            if (r11 <= r12) goto L_0x0116
            int r11 = r10.length()     // Catch:{ Exception -> 0x0171 }
            int r11 = r11 - r3
            java.lang.String r11 = r10.substring(r4, r11)     // Catch:{ Exception -> 0x0171 }
            java.lang.CharSequence r11 = m40588d(r6, r11, r3)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = r8.replace(r10, r11)     // Catch:{ Exception -> 0x0171 }
        L_0x0116:
            com.tencent.mm.storage.f4 r10 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x0171 }
            r10.<init>()     // Catch:{ Exception -> 0x0171 }
            r10.mo108740T2(r7)     // Catch:{ Exception -> 0x0171 }
            r10.mo108749c3(r6)     // Catch:{ Exception -> 0x0171 }
            r10.mo100991d(r12)     // Catch:{ Exception -> 0x0171 }
            r10.mo108732L2(r8)     // Catch:{ Exception -> 0x0171 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0171 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r15
            long r13 = eb0.C75604z3.m90841m(r6, r13)     // Catch:{ Exception -> 0x0171 }
            r10.mo108733M2(r13)     // Catch:{ Exception -> 0x0171 }
            r8 = 10000(0x2710, float:1.4013E-41)
            r10.setType(r8)     // Catch:{ Exception -> 0x0171 }
            int r8 = r10.mo108762o2()     // Catch:{ Exception -> 0x0171 }
            r8 = r8 | 8
            r10.mo108735O2(r8)     // Catch:{ Exception -> 0x0171 }
            long r10 = eb0.C75604z3.m90852x(r10)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = "consumeNewXml roomName:%s oper:%s historyId:%s template msgId:%s inviterUsername:%s revokeHistroy:%s"
            r13 = 6
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0171 }
            r13[r7] = r6     // Catch:{ Exception -> 0x0171 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0171 }
            r13[r3] = r0     // Catch:{ Exception -> 0x0171 }
            r13[r4] = r2     // Catch:{ Exception -> 0x0171 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0171 }
            r13[r12] = r0     // Catch:{ Exception -> 0x0171 }
            r0 = 4
            r13[r0] = r9     // Catch:{ Exception -> 0x0171 }
            r0 = 5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0171 }
            r13[r0] = r1     // Catch:{ Exception -> 0x0171 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r13)     // Catch:{ Exception -> 0x0171 }
            goto L_0x0189
        L_0x016a:
            java.lang.String r0 = "no contains historyid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0171 }
            goto L_0x0189
        L_0x0171:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1[r7] = r2
            java.lang.String r0 = r0.getMessage()
            r1[r3] = r0
            java.lang.String r0 = "consumeNewXml Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r1)
        L_0x0189:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om2.C35195b.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
    }
}
