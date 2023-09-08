package dv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import hv0.C98543d;
import java.util.Map;
import kd0.C76541g0;
import kd0.C76549w;
import kd0.C76552z;
import te3.C77926f9;
import yu0.C102913k;

/* renamed from: dv0.i */
public class C97550i implements C75460n {

    /* renamed from: a */
    public byte[] f286253a = {35, 33, 65, 77, 82, 10, 2, 35, 33};

    /* renamed from: b */
    public byte[] f286254b = {35, 33, 65, 77, 82, 10, 35, 33};

    /* renamed from: a */
    public int mo105806a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        String x;
        boolean z;
        boolean z2;
        int i;
        String str2 = f9Var.f227337h.f141175d;
        if (C98543d.m128034e(f9Var.f227335f.f141175d)) {
            int b = C98543d.m128031b(str2);
            if (b != -1 && (i = b + 2) < str2.length()) {
                str2 = str2.substring(i);
            }
            Log.m105927v("MicroMsg.BackupItemVoice", "recover, voiceContentXml:%s", str2);
        }
        Map<String, String> parseXml = XmlParser.parseXml(str2, "msg", (String) null);
        if (parseXml != null) {
            try {
                f4Var.mo108732L2(C76549w.m92049c(parseXml.get(".msg.voicemsg.$fromusername"), (long) Util.getInt(parseXml.get(".msg.voicemsg.$voicelength"), 0), Util.getInt(parseXml.get(".msg.voicemsg.$isPlayed"), 1) == 1));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BackupItemVoice", "parsing voice msg xml failed");
                Log.printErrStackTrace("MicroMsg.BackupItemVoice", e, "", new Object[0]);
            }
        } else {
            Log.m105921e("MicroMsg.BackupItemVoice", "voicemsg paseXml failed:%s", f9Var.f227337h.f141175d);
            f4Var.mo108732L2(f9Var.f227337h.f141175d);
        }
        String SQ = C76541g0.m92032SQ(f9Var.f227335f.f141175d, "amr_");
        f4Var.mo108739S2(SQ);
        C98543d.m128033d(f4Var);
        String n = C76552z.m92076n(SQ, true);
        String x2 = C102913k.m136059x(f9Var, 9, (String) null);
        if (!Util.isNullOrNil(x2)) {
            String str3 = C102913k.m136050o(x2) + x2;
            if (C86013q1.m106450k(str3)) {
                byte[] O = C86013q1.m106433O(str3, 0, 9);
                byte[] bArr = this.f286253a;
                if (!Util.isNullOrNil(O)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= bArr.length) {
                            z = true;
                            break;
                        } else if (bArr[i2] != O[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
                if (z) {
                    byte[] O2 = C86013q1.m106433O(str3, 6, -1);
                    C86013q1.m106447h(str3);
                    C86013q1.m106437S(str3, O2);
                } else {
                    byte[] bArr2 = this.f286254b;
                    if (!Util.isNullOrNil(O)) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= bArr2.length) {
                                z2 = true;
                                break;
                            } else if (bArr2[i3] != O[i3]) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        byte[] O3 = C86013q1.m106433O(str3, 6, -1);
                        C86013q1.m106447h(str3);
                        C86013q1.m106437S(str3, O3);
                    }
                }
            }
        }
        if (!(n == null || C102913k.m136033E(f9Var, 9, n) || (x = C102913k.m136059x(f9Var, 9, (String) null)) == null)) {
            String str4 = C102913k.m136050o(x) + x;
            Log.m105919d("MicroMsg.BackupItemVoice", "recover from path:%s", str4);
            C86013q1.m106463x(str4, n);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00db A[SYNTHETIC, Splitter:B:51:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de A[Catch:{ Exception -> 0x0185 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0133 A[Catch:{ Exception -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0195 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0196  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo105807b(te3.C77926f9 r19, boolean r20, com.tencent.p014mm.storage.C72963f4 r21, java.lang.String r22, java.util.LinkedList<pv0.C100968x> r23, boolean r24) {
        /*
            r18 = this;
            java.lang.String r0 = r21.mo108765s2()
            r1 = 0
            java.lang.String r0 = kd0.C76552z.m92076n(r0, r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0010
            return r1
        L_0x0010:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r0)
            boolean r3 = r2.mo119967g()
            if (r3 != 0) goto L_0x001c
            return r1
        L_0x001c:
            long r2 = r2.mo119980r()
            int r10 = (int) r2
            if (r20 == 0) goto L_0x0024
            return r10
        L_0x0024:
            dv0.k$a r11 = new dv0.k$a
            r6 = 9
            r9 = 0
            r2 = r11
            r3 = r0
            r4 = r19
            r5 = r23
            r7 = r24
            r8 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            int r2 = dv0.C97551k.m125702a(r11)
            java.lang.String r3 = "0"
            java.lang.String r4 = "voicemsg"
            java.lang.String r5 = "msg"
            java.lang.String r6 = "1"
            java.lang.String r7 = ""
            java.lang.String r8 = r21.getContent()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            r11 = 1
            if (r8 == 0) goto L_0x0055
            r3 = 0
            r9 = 0
            goto L_0x0193
        L_0x0055:
            kd0.g0 r8 = kd0.C76546u.yx0()
            long r12 = r21.mo108774y2()
            kd0.y r8 = r8.mo106781Lo(r12)
            java.lang.String r12 = r21.getContent()
            r13 = 0
            r15 = 4
            java.lang.String r9 = "\n"
            boolean r9 = r12.endsWith(r9)     // Catch:{ Exception -> 0x00b5 }
            if (r9 == 0) goto L_0x0079
            int r9 = r12.length()     // Catch:{ Exception -> 0x00b5 }
            int r9 = r9 - r11
            java.lang.String r12 = r12.substring(r1, r9)     // Catch:{ Exception -> 0x00b5 }
        L_0x0079:
            java.lang.String r9 = ":"
            java.lang.String[] r9 = r12.split(r9)     // Catch:{ Exception -> 0x00b5 }
            int r12 = r9.length     // Catch:{ Exception -> 0x00b5 }
            if (r12 != r15) goto L_0x008c
            r12 = r9[r1]     // Catch:{ Exception -> 0x00b5 }
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85811N4(r12)     // Catch:{ Exception -> 0x00b5 }
            if (r12 == 0) goto L_0x008c
            r12 = 1
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            int r15 = r9.length     // Catch:{ Exception -> 0x00b5 }
            if (r15 <= r12) goto L_0x0093
            r15 = r9[r12]     // Catch:{ Exception -> 0x00b5 }
            goto L_0x0094
        L_0x0093:
            r15 = 0
        L_0x0094:
            int r1 = r9.length     // Catch:{ Exception -> 0x00b3 }
            int r11 = r12 + 1
            if (r1 <= r11) goto L_0x00a0
            r1 = r9[r11]     // Catch:{ Exception -> 0x00b3 }
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r13)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00a2
        L_0x00a0:
            r16 = r13
        L_0x00a2:
            int r1 = r9.length     // Catch:{ Exception -> 0x00b3 }
            int r12 = r12 + 2
            if (r1 <= r12) goto L_0x00b0
            r1 = r9[r12]     // Catch:{ Exception -> 0x00b3 }
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00b3 }
            r13 = r16
            goto L_0x00c2
        L_0x00b0:
            r13 = r16
            goto L_0x00c1
        L_0x00b3:
            goto L_0x00b7
        L_0x00b5:
            r15 = 0
        L_0x00b7:
            if (r15 != 0) goto L_0x00ba
            r15 = r7
        L_0x00ba:
            java.lang.String r1 = "MicroMsg.VoiceContent"
            java.lang.String r9 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            java.io.StringWriter r9 = new java.io.StringWriter
            r9.<init>()
            org.xmlpull.v1.XmlPullParserFactory r11 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x0185 }
            org.xmlpull.v1.XmlSerializer r11 = r11.newSerializer()     // Catch:{ Exception -> 0x0185 }
            r11.setOutput(r9)     // Catch:{ Exception -> 0x0185 }
            r12 = 0
            r11.startTag(r12, r5)     // Catch:{ Exception -> 0x0182 }
            r11.startTag(r12, r4)     // Catch:{ Exception -> 0x0182 }
            if (r8 == 0) goto L_0x00de
            java.lang.String r0 = r8.f224065p     // Catch:{ Exception -> 0x0185 }
            goto L_0x00f0
        L_0x00de:
            r8 = 1
            r12 = 0
            boolean r0 = kd0.C76550x.m92056e(r0, r12, r8)     // Catch:{ Exception -> 0x0185 }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x0185 }
            goto L_0x00f0
        L_0x00eb:
            r0 = 4
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0185 }
        L_0x00f0:
            java.lang.String r8 = "voiceformat"
            r12 = 0
            r11.attribute(r12, r8, r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "length"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0185 }
            r8.<init>()     // Catch:{ Exception -> 0x0185 }
            r8.append(r7)     // Catch:{ Exception -> 0x0185 }
            r8.append(r10)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0185 }
            r10 = 0
            r11.attribute(r10, r0, r8)     // Catch:{ Exception -> 0x017f }
            java.lang.String r0 = "endflag"
            r11.attribute(r10, r0, r6)     // Catch:{ Exception -> 0x017f }
            java.lang.String r0 = "cancelflag"
            r11.attribute(r10, r0, r3)     // Catch:{ Exception -> 0x017f }
            java.lang.String r0 = "voicelength"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0185 }
            r8.<init>()     // Catch:{ Exception -> 0x0185 }
            r8.append(r7)     // Catch:{ Exception -> 0x0185 }
            r8.append(r13)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0185 }
            r8 = 0
            r11.attribute(r8, r0, r7)     // Catch:{ Exception -> 0x017c }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x017c }
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = "fromusername"
            r11.attribute(r8, r0, r15)     // Catch:{ Exception -> 0x017c }
        L_0x0138:
            java.lang.String r0 = "isPlayed"
            if (r1 == 0) goto L_0x013e
            r3 = r6
        L_0x013e:
            r1 = 0
            r11.attribute(r1, r0, r3)     // Catch:{ Exception -> 0x017a }
            r11.endTag(r1, r4)     // Catch:{ Exception -> 0x017a }
            r11.endTag(r1, r5)     // Catch:{ Exception -> 0x017a }
            r11.endDocument()     // Catch:{ Exception -> 0x017a }
            r9.flush()     // Catch:{ Exception -> 0x017a }
            r9.close()     // Catch:{ Exception -> 0x017a }
            java.lang.StringBuffer r0 = r9.getBuffer()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r21.mo108768t()
            boolean r1 = hv0.C98543d.m128034e(r1)
            if (r1 == 0) goto L_0x0177
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r3 = ":\n"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0177:
            r9 = r0
            r3 = 0
            goto L_0x0193
        L_0x017a:
            r0 = move-exception
            goto L_0x0187
        L_0x017c:
            r0 = move-exception
            r1 = r8
            goto L_0x0187
        L_0x017f:
            r0 = move-exception
            r1 = r10
            goto L_0x0187
        L_0x0182:
            r0 = move-exception
            r1 = r12
            goto L_0x0187
        L_0x0185:
            r0 = move-exception
            r1 = 0
        L_0x0187:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "MicroMsg.BackupItemVoice"
            java.lang.String r6 = "packetVoice xml error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r4)
            r9 = r1
        L_0x0193:
            if (r9 != 0) goto L_0x0196
            return r3
        L_0x0196:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            r0.f141175d = r9
            r1 = 1
            r0.f141176e = r1
            r1 = r19
            r1.f227337h = r0
            int r0 = r9.length()
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.C97550i.mo105807b(te3.f9, boolean, com.tencent.mm.storage.f4, java.lang.String, java.util.LinkedList, boolean):int");
    }
}
