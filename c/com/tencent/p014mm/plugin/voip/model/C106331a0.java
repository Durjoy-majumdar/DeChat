package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;

/* renamed from: com.tencent.mm.plugin.voip.model.a0 */
public class C106331a0 implements C35141t {

    /* renamed from: com.tencent.mm.plugin.voip.model.a0$a */
    public static final class C106332a {

        /* renamed from: a */
        public int f317172a;

        /* renamed from: b */
        public long f317173b;

        /* renamed from: c */
        public int f317174c;

        /* renamed from: d */
        public int f317175d;

        /* renamed from: a */
        public boolean mo152539a(String str) {
            this.f317175d = 0;
            try {
                Map<String, String> parseXml = XmlParser.parseXml(str, "voipinvitemsg", (String) null);
                if (parseXml == null) {
                    return false;
                }
                if (parseXml.get(".voipinvitemsg.roomid") != null) {
                    this.f317172a = Util.getInt(parseXml.get(".voipinvitemsg.roomid"), 0);
                }
                if (parseXml.get(".voipinvitemsg.key") != null) {
                    this.f317173b = Util.getLong(parseXml.get(".voipinvitemsg.key"), 0);
                }
                if (parseXml.get(".voipinvitemsg.status") != null) {
                    this.f317174c = Util.getInt(parseXml.get(".voipinvitemsg.status"), 0);
                }
                if (parseXml.get(".voipinvitemsg.invitetype") != null) {
                    this.f317175d = Util.getInt(parseXml.get(".voipinvitemsg.invitetype"), 0);
                }
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoipExtension", e, "", new Object[0]);
                Log.m105921e("MicroMsg.VoipExtension", "parse voip message error: %s", e.getMessage());
                return false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: ob0.m$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.tencent.mm.storage.f4} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04ff  */
    /* renamed from: Fg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo56403Fg(ob0.C35136m.C35137a r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            te3.j3 r2 = r0.f94242a
            te3.rv3 r3 = r2.f227628e
            java.lang.String r3 = sf0.C48374j0.m53718g(r3)
            te3.rv3 r4 = r2.f227629f
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            te3.rv3 r5 = r2.f227631h
            java.lang.String r5 = sf0.C48374j0.m53718g(r5)
            java.lang.String r6 = "MicroMsg.VoipExtension"
            java.lang.String r7 = "voip msg, from: %s, content: %s"
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r3
            r11 = 1
            r9[r11] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r9)
            k40.a r6 = f40.C86709a0.m107533q(r1)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.String r9 = ""
            java.lang.Object r7 = r7.mo119684e(r8, r9)
            java.lang.String r7 = (java.lang.String) r7
            int r9 = r7.length()
            r12 = 0
            if (r9 > 0) goto L_0x004b
            return r12
        L_0x004b:
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r4 = r3
        L_0x0053:
            long r13 = r2.f227638r
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r4 = r6.h30(r4, r13)
            long r6 = r4.getMsgId()
            r13 = 0
            int r9 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0079
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            long r6 = r2.f227638r
            r4.mo108745Y2(r6)
            int r6 = r2.f227635o
            long r6 = (long) r6
            long r6 = eb0.C75604z3.m90841m(r3, r6)
            r4.mo108733M2(r6)
        L_0x0079:
            boolean r6 = com.tencent.p014mm.plugin.voip.model.C106357m.m143310c()
            if (r6 == 0) goto L_0x0213
            java.lang.String r6 = "voipmsg"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.isStartXml(r5, r6, r12)
            if (r6 == 0) goto L_0x0213
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r3 = "onPreAddMessage: voip bubble msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.Class<com.tencent.mm.plugin.voip.model.m> r3 = com.tencent.p014mm.plugin.voip.model.C106357m.class
            monitor-enter(r3)
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r5, r0)     // Catch:{ all -> 0x0210 }
            com.tencent.mm.plugin.voip.model.m r0 = com.tencent.p014mm.plugin.voip.model.C106357m.f317386a     // Catch:{ all -> 0x0210 }
            te3.ds4 r4 = r0.mo152652n(r5)     // Catch:{ all -> 0x0210 }
            if (r4 != 0) goto L_0x00a9
            java.lang.String r0 = "MicroMsg.VoIPBubbleHelper"
            java.lang.String r1 = "handlerBubbleMsg: parse bubble info error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0210 }
            monitor-exit(r3)
            goto L_0x020f
        L_0x00a9:
            java.lang.String r5 = "MicroMsg.VoIPBubbleHelper"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r6.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r8 = "handlerBubbleMsg: msg "
            r6.append(r8)     // Catch:{ all -> 0x0210 }
            java.lang.String r8 = r4.f331956d     // Catch:{ all -> 0x0210 }
            r6.append(r8)     // Catch:{ all -> 0x0210 }
            java.lang.String r8 = ", roomid "
            r6.append(r8)     // Catch:{ all -> 0x0210 }
            long r7 = r4.f331959g     // Catch:{ all -> 0x0210 }
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = ", roomkey "
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            long r7 = r4.f331960h     // Catch:{ all -> 0x0210 }
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = ", inviteid "
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            long r7 = r4.f331961i     // Catch:{ all -> 0x0210 }
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = ", msgType "
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            int r7 = r4.f331962j     // Catch:{ all -> 0x0210 }
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = " identity "
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = r4.f331964o     // Catch:{ all -> 0x0210 }
            r6.append(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0210 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x0210 }
            xh.i9 r5 = r0.mo152647d(r4)     // Catch:{ all -> 0x0210 }
            if (r5 != 0) goto L_0x0126
            xh.i9 r5 = new xh.i9     // Catch:{ all -> 0x0210 }
            r5.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r6 = "MicroMsg.VoIPBubbleHelper"
            java.lang.String r7 = "handlerBubbleMsg: not find item in db"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0210 }
            long r6 = r4.f331959g     // Catch:{ all -> 0x0210 }
            r5.mo163944U2(r6)     // Catch:{ all -> 0x0210 }
            long r6 = r4.f331960h     // Catch:{ all -> 0x0210 }
            r5.mo163945V2(r6)     // Catch:{ all -> 0x0210 }
            long r6 = r4.f331961i     // Catch:{ all -> 0x0210 }
            r5.mo163936M2(r6)     // Catch:{ all -> 0x0210 }
            int r6 = r4.f331957e     // Catch:{ all -> 0x0210 }
            r5.mo163943T2(r6)     // Catch:{ all -> 0x0210 }
            java.lang.String r6 = r4.f331964o     // Catch:{ all -> 0x0210 }
            r5.mo163934K2(r6)     // Catch:{ all -> 0x0210 }
            int r6 = r4.f331962j     // Catch:{ all -> 0x0210 }
            r5.mo163938O2(r6)     // Catch:{ all -> 0x0210 }
            r0.mo152650i(r5)     // Catch:{ all -> 0x0210 }
        L_0x0126:
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ all -> 0x0210 }
            f62.k0 r6 = (f62.C75700k0) r6     // Catch:{ all -> 0x0210 }
            g62.l r6 = r6.mo96095LE()     // Catch:{ all -> 0x0210 }
            long r7 = r5.mo163956u2()     // Catch:{ all -> 0x0210 }
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6     // Catch:{ all -> 0x0210 }
            com.tencent.mm.storage.f4 r6 = r6.b00(r7)     // Catch:{ all -> 0x0210 }
            long r7 = r6.getMsgId()     // Catch:{ all -> 0x0210 }
            int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x0144
            r7 = 1
            goto L_0x0145
        L_0x0144:
            r7 = 0
        L_0x0145:
            if (r7 == 0) goto L_0x0148
            r12 = r6
        L_0x0148:
            if (r12 == 0) goto L_0x0171
            java.lang.String r0 = "MicroMsg.VoIPBubbleHelper"
            java.lang.String r2 = "handlerBubbleMsg: update msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = r4.f331956d     // Catch:{ all -> 0x0210 }
            r12.mo101012p4(r0)     // Catch:{ all -> 0x0210 }
            k40.a r0 = f40.C86709a0.m107533q(r1)     // Catch:{ all -> 0x0210 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ all -> 0x0210 }
            g62.l r0 = r0.mo96095LE()     // Catch:{ all -> 0x0210 }
            long r1 = r5.mo163956u2()     // Catch:{ all -> 0x0210 }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ all -> 0x0210 }
            r0.xy0(r1, r12)     // Catch:{ all -> 0x0210 }
            ob0.m$b r0 = new ob0.m$b     // Catch:{ all -> 0x0210 }
            r0.<init>(r12, r10)     // Catch:{ all -> 0x0210 }
        L_0x016e:
            r12 = r0
            goto L_0x020e
        L_0x0171:
            java.lang.String r6 = "MicroMsg.VoIPBubbleHelper"
            java.lang.String r7 = "handlerBubbleMsg: no msg inserted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0210 }
            com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x0210 }
            r6.<init>()     // Catch:{ all -> 0x0210 }
            te3.rv3 r7 = r2.f227628e     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = sf0.C48374j0.m53718g(r7)     // Catch:{ all -> 0x0210 }
            te3.rv3 r8 = r2.f227629f     // Catch:{ all -> 0x0210 }
            java.lang.String r8 = sf0.C48374j0.m53718g(r8)     // Catch:{ all -> 0x0210 }
            int r12 = r2.f227635o     // Catch:{ all -> 0x0210 }
            long r12 = (long) r12     // Catch:{ all -> 0x0210 }
            long r12 = eb0.C75604z3.m90841m(r7, r12)     // Catch:{ all -> 0x0210 }
            long r9 = r2.f227638r     // Catch:{ all -> 0x0210 }
            r6.mo108745Y2(r9)     // Catch:{ all -> 0x0210 }
            long r9 = r5.mo163958w2()     // Catch:{ all -> 0x0210 }
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r9 = r12
        L_0x019f:
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x01a4
            r12 = r9
        L_0x01a4:
            r6.mo108733M2(r12)     // Catch:{ all -> 0x0210 }
            int r2 = r2.f227630g     // Catch:{ all -> 0x0210 }
            r6.setType(r2)     // Catch:{ all -> 0x0210 }
            int r2 = r4.f331957e     // Catch:{ all -> 0x0210 }
            if (r2 != 0) goto L_0x01b4
            java.lang.String r2 = "voip_content_video"
            goto L_0x01b7
        L_0x01b4:
            java.lang.String r2 = "voip_content_voice"
        L_0x01b7:
            r6.mo108732L2(r2)     // Catch:{ all -> 0x0210 }
            java.lang.String r2 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x0210 }
            boolean r2 = gy3.C87412m.m108589b(r7, r2)     // Catch:{ all -> 0x0210 }
            if (r2 == 0) goto L_0x01cb
            r6.mo108749c3(r8)     // Catch:{ all -> 0x0210 }
            r6.mo108740T2(r11)     // Catch:{ all -> 0x0210 }
            goto L_0x01d2
        L_0x01cb:
            r6.mo108749c3(r7)     // Catch:{ all -> 0x0210 }
            r2 = 0
            r6.mo108740T2(r2)     // Catch:{ all -> 0x0210 }
        L_0x01d2:
            boolean r2 = r4.f331958f     // Catch:{ all -> 0x0210 }
            if (r2 == 0) goto L_0x01d8
            r7 = 3
            goto L_0x01d9
        L_0x01d8:
            r7 = 6
        L_0x01d9:
            r6.mo100991d(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r2 = r4.f331956d     // Catch:{ all -> 0x0210 }
            r6.mo101012p4(r2)     // Catch:{ all -> 0x0210 }
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ all -> 0x0210 }
            f62.k0 r1 = (f62.C75700k0) r1     // Catch:{ all -> 0x0210 }
            g62.l r1 = r1.mo96095LE()     // Catch:{ all -> 0x0210 }
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ all -> 0x0210 }
            long r1 = r1.my0(r6)     // Catch:{ all -> 0x0210 }
            r5.mo163939P2(r1)     // Catch:{ all -> 0x0210 }
            r1 = 4
            r5.mo163942S2(r1)     // Catch:{ all -> 0x0210 }
            long r1 = r6.getCreateTime()     // Catch:{ all -> 0x0210 }
            r5.mo163931H2(r1)     // Catch:{ all -> 0x0210 }
            int r1 = r4.f331962j     // Catch:{ all -> 0x0210 }
            r5.mo163938O2(r1)     // Catch:{ all -> 0x0210 }
            r0.mo152653p(r5)     // Catch:{ all -> 0x0210 }
            ob0.m$b r0 = new ob0.m$b     // Catch:{ all -> 0x0210 }
            r0.<init>(r6, r11)     // Catch:{ all -> 0x0210 }
            goto L_0x016e
        L_0x020e:
            monitor-exit(r3)
        L_0x020f:
            return r12
        L_0x0210:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0213:
            com.tencent.mm.plugin.voip.model.h0 r6 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.a0$a r6 = r6.mo152626y(r5)
            if (r6 != 0) goto L_0x02da
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r1 = "parse voip message failed, voipMessage is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            java.lang.String r0 = "voipwarnmsg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r0, r12)     // Catch:{ Exception -> 0x02bf }
            if (r0 == 0) goto L_0x02d9
            java.lang.String r1 = ".voipwarnmsg.type"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x02bf }
            if (r1 == 0) goto L_0x02d9
            java.lang.String r1 = ".voipwarnmsg.type"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x02bf }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x02bf }
            if (r1 != r11) goto L_0x02d9
            java.lang.String r1 = ".voipwarnmsg.warntips"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x02bf }
            if (r1 == 0) goto L_0x02d9
            java.lang.String r2 = ""
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x02bf }
            if (r2 != 0) goto L_0x02d9
            java.lang.String r2 = "MicroMsg.VoipExtension"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bf }
            r3.<init>()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r4 = "got risk tips back:"
            r3.append(r4)     // Catch:{ Exception -> 0x02bf }
            r3.append(r1)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02bf }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r2 = ".voipwarnmsg.roomid"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x02bf }
            if (r2 == 0) goto L_0x02a2
            boolean r2 = p645pj.C77091b.m93035q()     // Catch:{ Exception -> 0x02bf }
            if (r2 != 0) goto L_0x0282
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r2 = "set voipmsg not notification..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x02bf }
            goto L_0x02a2
        L_0x0282:
            java.lang.String r2 = ".voipwarnmsg.roomid"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02bf }
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x02bf }
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x02bf }
            int r2 = r2.mo152615n()     // Catch:{ Exception -> 0x02bf }
            if (r0 == r2) goto L_0x02a2
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r1 = "wrong roomid,now return.."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x02bf }
            return r12
        L_0x02a2:
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x02bf }
            r0.f317351t = r1     // Catch:{ Exception -> 0x02bf }
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x02bf }
            r0.getClass()     // Catch:{ Exception -> 0x02bf }
            r2 = 0
        L_0x02b0:
            if (r2 >= r8) goto L_0x02d9
            com.tencent.mm.plugin.voip.model.k0 r3 = new com.tencent.mm.plugin.voip.model.k0     // Catch:{ Exception -> 0x02bf }
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x02bf }
            r4 = 1000(0x3e8, double:4.94E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r4)     // Catch:{ Exception -> 0x02bf }
            int r2 = r2 + 1
            goto L_0x02b0
        L_0x02bf:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.VoipExtension"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)
            java.lang.String r1 = "MicroMsg.VoipExtension"
            java.lang.String r2 = "parse voip message error: %s"
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r0 = r0.getMessage()
            r4[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r4)
        L_0x02d9:
            return r12
        L_0x02da:
            com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r7 = r7.f317332a
            r7.getClass()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "phone"
            java.lang.Object r7 = r7.getSystemService(r9)
            android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7
            int r7 = r7.getCallState()
            if (r7 == 0) goto L_0x02f7
            r7 = 1
            goto L_0x02f8
        L_0x02f7:
            r7 = 0
        L_0x02f8:
            r9 = 5
            if (r7 == 0) goto L_0x0300
            r4.mo108745Y2(r13)
            goto L_0x03d9
        L_0x0300:
            int r7 = r6.f317174c
            if (r7 != r8) goto L_0x0306
            r10 = 1
            goto L_0x0307
        L_0x0306:
            r10 = 0
        L_0x0307:
            if (r10 == 0) goto L_0x038e
            java.lang.String r7 = "MicroMsg.VoipExtension"
            java.lang.String r10 = "recv voip cancel message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
            r7.getClass()
            if (r5 == 0) goto L_0x038c
            int r10 = r5.length()
            if (r10 != 0) goto L_0x0320
            goto L_0x038c
        L_0x0320:
            com.tencent.mm.plugin.voip.model.a0$a r10 = new com.tencent.mm.plugin.voip.model.a0$a
            r10.<init>()
            boolean r5 = r10.mo152539a(r5)
            if (r5 != 0) goto L_0x032c
            goto L_0x038c
        L_0x032c:
            int r5 = r10.f317174c
            if (r5 == r8) goto L_0x0331
            goto L_0x038c
        L_0x0331:
            int r5 = r10.f317172a
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r8 = r7.f317357z
            r8.mo152528w(r5)
            com.tencent.mm.plugin.voip.model.m0 r5 = r7.f317332a
            r5.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "onCancelInviteMessage, roomId: "
            r8.append(r15)
            int r15 = r10.f317172a
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            java.lang.String r15 = "MicroMsg.Voip.VoipServiceEx"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)
            com.tencent.mm.plugin.voip.model.r r8 = r5.f317396a
            te3.yu4 r8 = r8.f317453D
            if (r8 != 0) goto L_0x035c
            goto L_0x0362
        L_0x035c:
            int r10 = r10.f317172a
            int r8 = r8.f145520d
            if (r10 == r8) goto L_0x0364
        L_0x0362:
            r5 = 0
            goto L_0x0373
        L_0x0364:
            w33.z r8 = w33.C111730z.f334576a
            w33.z$a r8 = w33.C111730z.C111731a.CANCEL
            w33.C111730z.f334579d = r8
            com.tencent.mm.plugin.voip.model.l0 r8 = new com.tencent.mm.plugin.voip.model.l0
            r8.<init>(r5)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            r5 = 1
        L_0x0373:
            if (r5 == 0) goto L_0x038c
            z33.e r5 = r7.f317330E
            if (r5 == 0) goto L_0x0383
            r5.mo164353v()
            z33.e r5 = r7.f317330E
            r5.mo164328B()
            r7.f317330E = r12
        L_0x0383:
            h43.f0 r5 = r7.f317331F
            if (r5 == 0) goto L_0x038c
            r5.mo158495j()
            r7.f317331F = r12
        L_0x038c:
            r5 = 1
            goto L_0x03da
        L_0x038e:
            r5 = 4
            if (r7 != r5) goto L_0x0393
            r5 = 1
            goto L_0x0394
        L_0x0393:
            r5 = 0
        L_0x0394:
            if (r5 == 0) goto L_0x0397
            return r12
        L_0x0397:
            if (r7 != r11) goto L_0x039b
            r5 = 1
            goto L_0x039c
        L_0x039b:
            r5 = 0
        L_0x039c:
            if (r5 == 0) goto L_0x03c8
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r1 = "recv voip invite delay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.voip.model.h0 r18 = l33.C109247e.xx0()
            int r0 = r6.f317172a
            long r1 = r6.f317173b
            int r3 = r6.f317175d
            if (r3 != 0) goto L_0x03b4
            r22 = 1
            goto L_0x03b6
        L_0x03b4:
            r22 = 0
        L_0x03b6:
            r18.getClass()
            com.tencent.mm.plugin.voip.model.i0 r3 = new com.tencent.mm.plugin.voip.model.i0
            r17 = r3
            r19 = r0
            r20 = r1
            r17.<init>(r18, r19, r20, r22)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            return r12
        L_0x03c8:
            if (r7 != r9) goto L_0x03cc
            r5 = 1
            goto L_0x03cd
        L_0x03cc:
            r5 = 0
        L_0x03cd:
            if (r5 == 0) goto L_0x0517
            java.lang.String r5 = "MicroMsg.VoipExtension"
            java.lang.String r7 = "receive invite busy message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            r4.mo108745Y2(r13)
        L_0x03d9:
            r5 = 0
        L_0x03da:
            boolean r7 = com.tencent.p014mm.plugin.voip.model.C106357m.m143310c()
            if (r7 == 0) goto L_0x03e1
            return r12
        L_0x03e1:
            int r7 = r6.f317172a
            com.tencent.mm.plugin.voip.model.h0 r8 = l33.C109247e.xx0()
            int r8 = r8.f317341j
            if (r7 != r8) goto L_0x03f3
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r1 = "already ignore the invite, don't add the message to db"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r12
        L_0x03f3:
            int r7 = r2.f227630g
            r4.setType(r7)
            int r7 = r6.f317175d
            if (r7 != 0) goto L_0x03fe
            r7 = 1
            goto L_0x03ff
        L_0x03fe:
            r7 = 0
        L_0x03ff:
            if (r7 == 0) goto L_0x0407
            int r7 = com.tencent.p014mm.storage.C72963f4.f212661I1
            java.lang.String r7 = "voip_content_video"
            goto L_0x040c
        L_0x0407:
            int r7 = com.tencent.p014mm.storage.C72963f4.f212661I1
            java.lang.String r7 = "voip_content_voice"
        L_0x040c:
            r4.mo108732L2(r7)
            r7 = 0
            r4.mo108740T2(r7)
            r4.mo108749c3(r3)
            if (r5 == 0) goto L_0x042d
            eb0.u0 r5 = eb0.C75594u0.f222079a
            monitor-enter(r5)
            java.lang.String r7 = eb0.C75594u0.f222080b     // Catch:{ all -> 0x0429 }
            monitor-exit(r5)
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x042d
            r3 = 6
            r4.mo100991d(r3)
            goto L_0x0438
        L_0x0429:
            r0 = move-exception
            r1 = r0
            monitor-exit(r5)
            throw r1
        L_0x042d:
            int r3 = r2.f227632i
            r5 = 3
            if (r3 <= r5) goto L_0x0434
            r15 = r3
            goto L_0x0435
        L_0x0434:
            r15 = 3
        L_0x0435:
            r4.mo100991d(r15)
        L_0x0438:
            int r3 = r6.f317174c
            if (r3 != r9) goto L_0x043e
            r3 = 1
            goto L_0x043f
        L_0x043e:
            r3 = 0
        L_0x043f:
            if (r3 != 0) goto L_0x0466
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r3 = r3.f317332a
            r3.getClass()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "phone"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r3 = r3.getCallState()
            if (r3 == 0) goto L_0x045e
            r3 = 1
            goto L_0x045f
        L_0x045e:
            r3 = 0
        L_0x045f:
            if (r3 == 0) goto L_0x0462
            goto L_0x0466
        L_0x0462:
            r4.mo101012p4(r12)
            goto L_0x0474
        L_0x0466:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131838543(0x7f11464f, float:1.9310312E38)
            java.lang.String r3 = r3.getString(r5)
            r4.mo101012p4(r3)
        L_0x0474:
            eb0.C75604z3.m90842n(r4, r0)
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r3 = "voipMessage==null: %b"
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r7 = 0
            r5[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r5)
            long r8 = r4.getMsgId()
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x04ff
            java.lang.String r0 = "MicroMsg.VoipExtension"
            java.lang.String r2 = "add or update msg, roomid: %s"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            int r5 = r6.f317172a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()
            java.util.Map<java.lang.Integer, java.lang.Long> r0 = r0.f317340i
            int r2 = r6.f317172a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L_0x04d2
            long r0 = eb0.C75604z3.m90852x(r4)
            r4.setMsgId(r0)
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()
            java.util.Map<java.lang.Integer, java.lang.Long> r0 = r0.f317340i
            int r1 = r6.f317172a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r2 = r4.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r1, r2)
            goto L_0x04f9
        L_0x04d2:
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r1.f317340i
            int r2 = r6.f317172a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r1, r4)
        L_0x04f9:
            ob0.m$b r0 = new ob0.m$b
            r0.<init>(r4, r11)
            goto L_0x0516
        L_0x04ff:
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r1 = r2.f227638r
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.yy0(r1, r4)
            ob0.m$b r0 = new ob0.m$b
            r1 = 0
            r0.<init>(r4, r1)
        L_0x0516:
            return r0
        L_0x0517:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106331a0.mo56403Fg(ob0.m$a):ob0.m$b");
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
