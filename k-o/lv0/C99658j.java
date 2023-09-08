package lv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;
import jv0.C99055a;
import kd0.C76541g0;
import kd0.C76549w;
import ov0.C100556h;
import te3.C51018qv3;
import te3.C77926f9;

/* renamed from: lv0.j */
public class C99658j implements C99663m {

    /* renamed from: a */
    public byte[] f292067a = {35, 33, 65, 77, 82, 10, 2, 35, 33};

    /* renamed from: b */
    public byte[] f292068b = {35, 33, 65, 77, 82, 10, 35, 33};

    /* renamed from: a */
    public int mo139033a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        String d;
        int i;
        String str2 = f9Var.f227337h.f141175d;
        if (C100556h.m131584d(f9Var.f227335f.f141175d)) {
            int a = C100556h.m131581a(str2);
            if (a != -1 && (i = a + 2) < str2.length()) {
                str2 = str2.substring(i);
            }
            Log.m105926v("MicroMsg.BakOldItemVoice", "chatroom voicemsg, new content=" + str2);
        }
        Map<String, String> parseXml = XmlParser.parseXml(str2, "msg", (String) null);
        boolean z = true;
        if (parseXml != null) {
            try {
                int i2 = Util.getInt(parseXml.get(".msg.voicemsg.$voicelength"), 0);
                String str3 = parseXml.get(".msg.voicemsg.$fromusername");
                if (Util.getInt(parseXml.get(".msg.voicemsg.$isPlayed"), 1) != 1) {
                    z = false;
                }
                f4Var.mo108732L2(C76549w.m92049c(str3, (long) i2, z));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BakOldItemVoice", "parsing voice msg xml failed");
                Log.printErrStackTrace("MicroMsg.BakOldItemVoice", e, "", new Object[0]);
            }
        } else {
            Log.m105921e("MicroMsg.BakOldItemVoice", "voicemsg paseXml failed:%s", f9Var.f227337h.f141175d);
            f4Var.mo108732L2(f9Var.f227337h.f141175d);
        }
        String SQ = C76541g0.m92032SQ(f9Var.f227335f.f141175d, "amr_");
        f4Var.mo108739S2(SQ);
        C100556h.m131583c(f4Var);
        String b = C100556h.m131582b(SQ);
        if (f9Var.f227347u == 9) {
            byte[] bArr = f9Var.f227345s.f140574f.f257327a;
            if (mo139036c(this.f292067a, bArr)) {
                byte[] bArr2 = new byte[(bArr.length - 6)];
                System.arraycopy(bArr, 6, bArr2, 0, bArr.length - 6);
                f9Var.f227346t = bArr.length - 6;
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(bArr2);
                f9Var.f227345s = qv32;
            } else if (mo139036c(this.f292068b, bArr)) {
                byte[] bArr3 = new byte[(bArr.length - 6)];
                System.arraycopy(bArr, 6, bArr3, 0, bArr.length - 6);
                f9Var.f227346t = bArr.length - 6;
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(bArr3);
                f9Var.f227345s = qv33;
            }
            if (!(b == null || C99055a.m129009h(f9Var, 9, b) || (d = C99055a.m129005d(f9Var, 9, (String) null)) == null)) {
                String f = C99055a.m129007f(d);
                Log.m105918d("MicroMsg.BakOldItemVoice", "recover Frome Sdcard" + f);
                C86013q1.m106442c(f, b);
            }
            return 0;
        }
        String d2 = C99055a.m129005d(f9Var, 9, (String) null);
        if (!Util.isNullOrNil(d2)) {
            String f2 = C99055a.m129007f(d2);
            if (C86013q1.m106450k(f2)) {
                byte[] O = C86013q1.m106433O(f2, 0, 9);
                if (mo139036c(this.f292067a, O)) {
                    byte[] O2 = C86013q1.m106433O(f2, 6, -1);
                    C86013q1.m106447h(f2);
                    C86013q1.m106438T(f2, O2, 0, O2.length);
                } else if (mo139036c(this.f292068b, O)) {
                    byte[] O3 = C86013q1.m106433O(f2, 6, -1);
                    C86013q1.m106447h(f2);
                    C86013q1.m106438T(f2, O3, 0, O3.length);
                }
            }
        }
        String f3 = C99055a.m129007f(d);
        Log.m105918d("MicroMsg.BakOldItemVoice", "recover Frome Sdcard" + f3);
        C86013q1.m106442c(f3, b);
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101 A[Catch:{ Exception -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010b A[Catch:{ Exception -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0164 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo139034b(te3.C77926f9 r18, boolean r19, com.tencent.p014mm.storage.C72963f4 r20, java.lang.String r21, java.util.LinkedList<pv0.C100968x> r22, java.util.HashMap<java.lang.Long, lv0.C99659k.C99660a> r23, boolean r24, long r25) {
        /*
            r17 = this;
            java.lang.String r0 = r20.mo108765s2()
            java.lang.String r2 = ov0.C100556h.m131582b(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r9 = 0
            if (r0 == 0) goto L_0x0010
            return r9
        L_0x0010:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r2)
            boolean r1 = r0.mo119967g()
            if (r1 != 0) goto L_0x001c
            return r9
        L_0x001c:
            long r0 = r0.mo119980r()
            int r10 = (int) r0
            if (r19 == 0) goto L_0x0024
            return r10
        L_0x0024:
            lv0.l$a r0 = new lv0.l$a
            r5 = 9
            r8 = 0
            r1 = r0
            r3 = r18
            r4 = r22
            r6 = r24
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            int r1 = lv0.C99661l.m130077a(r0)
            java.lang.String r0 = "0"
            java.lang.String r2 = "voicemsg"
            java.lang.String r3 = "msg"
            java.lang.String r4 = "1"
            java.lang.String r5 = ""
            java.lang.String r6 = r20.getContent()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0053
            goto L_0x0162
        L_0x0053:
            java.lang.String r6 = r20.getContent()
            r11 = 0
            java.lang.String r13 = "\n"
            boolean r13 = r6.endsWith(r13)     // Catch:{ Exception -> 0x00a4 }
            if (r13 == 0) goto L_0x006a
            int r13 = r6.length()     // Catch:{ Exception -> 0x00a4 }
            int r13 = r13 - r8
            java.lang.String r6 = r6.substring(r9, r13)     // Catch:{ Exception -> 0x00a4 }
        L_0x006a:
            java.lang.String r13 = ":"
            java.lang.String[] r6 = r6.split(r13)     // Catch:{ Exception -> 0x00a4 }
            int r13 = r6.length     // Catch:{ Exception -> 0x00a4 }
            r14 = 4
            if (r13 != r14) goto L_0x007e
            r13 = r6[r9]     // Catch:{ Exception -> 0x00a4 }
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85811N4(r13)     // Catch:{ Exception -> 0x00a4 }
            if (r13 == 0) goto L_0x007e
            r13 = 1
            goto L_0x007f
        L_0x007e:
            r13 = 0
        L_0x007f:
            int r14 = r6.length     // Catch:{ Exception -> 0x00a4 }
            if (r14 <= r13) goto L_0x0085
            r14 = r6[r13]     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0086
        L_0x0085:
            r14 = r7
        L_0x0086:
            int r15 = r6.length     // Catch:{ Exception -> 0x00a2 }
            int r8 = r13 + 1
            if (r15 <= r8) goto L_0x0092
            r8 = r6[r8]     // Catch:{ Exception -> 0x00a2 }
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r11)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0093
        L_0x0092:
            r15 = r11
        L_0x0093:
            int r8 = r6.length     // Catch:{ Exception -> 0x00a2 }
            int r13 = r13 + 2
            if (r8 <= r13) goto L_0x009f
            r6 = r6[r13]     // Catch:{ Exception -> 0x00a2 }
            boolean r6 = r6.equals(r4)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a0
        L_0x009f:
            r6 = 0
        L_0x00a0:
            r11 = r15
            goto L_0x00b1
        L_0x00a2:
            goto L_0x00a6
        L_0x00a4:
            r14 = r7
        L_0x00a6:
            if (r14 != 0) goto L_0x00a9
            r14 = r5
        L_0x00a9:
            java.lang.String r6 = "MicroMsg.VoiceContent"
            java.lang.String r8 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            r6 = 0
        L_0x00b1:
            java.io.StringWriter r8 = new java.io.StringWriter
            r8.<init>()
            org.xmlpull.v1.XmlPullParserFactory r13 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x0146 }
            org.xmlpull.v1.XmlSerializer r13 = r13.newSerializer()     // Catch:{ Exception -> 0x0146 }
            r13.setOutput(r8)     // Catch:{ Exception -> 0x0146 }
            r13.startTag(r7, r3)     // Catch:{ Exception -> 0x0146 }
            r13.startTag(r7, r2)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r15 = "length"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
            r9.<init>()     // Catch:{ Exception -> 0x0146 }
            r9.append(r5)     // Catch:{ Exception -> 0x0146 }
            r9.append(r10)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0146 }
            r13.attribute(r7, r15, r9)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r9 = "endflag"
            r13.attribute(r7, r9, r4)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r9 = "cancelflag"
            r13.attribute(r7, r9, r0)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r9 = "voicelength"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146 }
            r10.<init>()     // Catch:{ Exception -> 0x0146 }
            r10.append(r5)     // Catch:{ Exception -> 0x0146 }
            r10.append(r11)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x0146 }
            r13.attribute(r7, r9, r5)     // Catch:{ Exception -> 0x0146 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0146 }
            if (r5 != 0) goto L_0x0106
            java.lang.String r5 = "fromusername"
            r13.attribute(r7, r5, r14)     // Catch:{ Exception -> 0x0146 }
        L_0x0106:
            java.lang.String r5 = "isPlayed"
            if (r6 == 0) goto L_0x010c
            r0 = r4
        L_0x010c:
            r13.attribute(r7, r5, r0)     // Catch:{ Exception -> 0x0146 }
            r13.endTag(r7, r2)     // Catch:{ Exception -> 0x0146 }
            r13.endTag(r7, r3)     // Catch:{ Exception -> 0x0146 }
            r13.endDocument()     // Catch:{ Exception -> 0x0146 }
            r8.flush()     // Catch:{ Exception -> 0x0146 }
            r8.close()     // Catch:{ Exception -> 0x0146 }
            java.lang.StringBuffer r0 = r8.getBuffer()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r20.mo108768t()
            boolean r2 = ov0.C100556h.m131584d(r2)
            if (r2 == 0) goto L_0x0144
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r3 = ":\n"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0144:
            r7 = r0
            goto L_0x0162
        L_0x0146:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "packetVoice xml error: "
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MicroMsg.BakOldItemVoice"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0162:
            if (r7 != 0) goto L_0x0166
            r2 = 0
            return r2
        L_0x0166:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            r0.f141175d = r7
            r2 = 1
            r0.f141176e = r2
            r2 = r18
            r2.f227337h = r0
            int r0 = r7.length()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lv0.C99658j.mo139034b(te3.f9, boolean, com.tencent.mm.storage.f4, java.lang.String, java.util.LinkedList, java.util.HashMap, boolean, long):int");
    }

    /* renamed from: c */
    public final boolean mo139036c(byte[] bArr, byte[] bArr2) {
        if (Util.isNullOrNil(bArr2)) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
