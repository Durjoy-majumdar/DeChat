package g82;

import eb0.C86497v5;
import ob0.C35136m;

/* renamed from: g82.h */
public class C107786h implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x038d  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9066Y(ob0.C35136m.C35137a r36) {
        /*
            r35 = this;
            r0 = r36
            com.tencent.mm.plugin.multitalk.model.w0 r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.wx0()
            com.tencent.mm.plugin.multitalk.model.a0 r1 = r1.f314820n
            if (r1 != 0) goto L_0x0015
            com.tencent.mm.plugin.multitalk.model.w0 r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.wx0()
            com.tencent.mm.plugin.multitalk.model.a0 r2 = new com.tencent.mm.plugin.multitalk.model.a0
            r2.<init>()
            r1.f314820n = r2
        L_0x0015:
            com.tencent.mm.plugin.multitalk.model.w0 r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.wx0()
            com.tencent.mm.plugin.multitalk.model.a0 r1 = r1.f314820n
            r1.getClass()
            te3.j3 r2 = r0.f94242a
            te3.rv3 r2 = r2.f227631h
            java.lang.String r2 = sf0.C48374j0.m53718g(r2)
            java.lang.String r3 = "sysmsg"
            r4 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r3, r4)
            java.lang.String r5 = ".sysmsg.multivoip.notfriendnotifydata"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie"
            if (r5 == 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "receive notfriendnotifydata msg:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0a26
        L_0x004f:
            java.lang.String r2 = ".sysmsg.multivoip.notifydata"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = " buffer len "
            r7 = 4
            r8 = 3
            java.lang.String r9 = ""
            r10 = 1
            r11 = 5
            r12 = 2
            r13 = 0
            if (r2 == 0) goto L_0x088c
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r9)
            byte[] r1 = r1.getBytes()
            byte[] r1 = android.util.Base64.decode(r1, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "receive "
            r2.append(r3)
            te3.j3 r0 = r0.f94242a
            te3.rv3 r0 = r0.f227631h
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            r2.append(r0)
            r2.append(r5)
            int r0 = r1.length
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r0 = r0.f314798d
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.u1 r2 = r2.f251803a
            java.lang.Object r2 = r2.mo119660a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
            java.lang.String r3 = eb0.C75592q0.m90789s()
            nw3.e r0 = (nw3.C109779e) r0
            r0.mo161040k(r2, r3)
            com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r0 = r0.f314798d
            nw3.e r0 = (nw3.C109779e) r0
            r0.getClass()
            zr3.g r0 = zr3.C112679g.m154059e()
            r0.getClass()
            r0 = -1601(0xfffffffffffff9bf, float:NaN)
            java.lang.String r2 = "notify"
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r5 = "CLTNOT onNotify data len="
            r3[r13] = r5
            int r5 = r1.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r10] = r5
            java.lang.String r5 = "NETCMD"
            bs3.C104161b.m138993b(r5, r3)
            nw3.f r3 = nw3.C109770a.m149092a()
            r3.getClass()
            as3.r r5 = new as3.r     // Catch:{ Exception -> 0x00e9 }
            r5.<init>()     // Catch:{ Exception -> 0x00e9 }
            p978i9.C108421e.m146905c(r5, r1)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            nw3.C109799g0.m149206g(r0)
            r5 = r4
        L_0x00ed:
            java.lang.String r1 = "TalkRoomService"
            if (r5 != 0) goto L_0x013c
            java.lang.String r0 = r3.f328593p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "pasrefail"
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = r3.f328595q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0104
            goto L_0x0127
        L_0x0104:
            int r0 = r3.f328597s
            long r5 = r3.f328598t
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            nw3.g0 r3 = new nw3.g0
            r3.<init>()
            r3.f328677a = r9
            r3.f328680d = r0
            r3.f328681e = r5
            r3.f328678b = r9
            r3.mo161124a(r2)
            java.lang.String r0 = r3.mo161126c()
            nw3.C109799g0.m149207h(r0)
            bs3.C104164e.m138999b()
            goto L_0x0130
        L_0x0127:
            nw3.g0 r0 = r3.f328563J
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            r0.mo161124a(r2)
        L_0x0130:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = "CLTNOT onVoiceGroupChange groupChg null"
            r0[r13] = r2
            bs3.C104161b.m138997f(r1, r0)
            r0 = -2
            goto L_0x085a
        L_0x013c:
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = "CLTNOT onVoiceGroupChange "
            r0[r13] = r6
            java.lang.String r6 = r3.f328593p
            r0[r10] = r6
            int r6 = r3.f328597s
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r12] = r6
            long r14 = r3.f328598t
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r0[r8] = r6
            long r14 = r5.f307145o
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r0[r7] = r6
            int r6 = r5.f307132b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r11] = r6
            int r6 = r5.f307144n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 6
            r0[r9] = r6
            bs3.C104161b.m138997f(r1, r0)
            long r14 = r5.f307145o
            java.util.HashSet<java.lang.Long> r0 = r3.f328579V
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0183
            r0 = 1
            goto L_0x018d
        L_0x0183:
            java.util.HashSet<java.lang.Long> r0 = r3.f328579V
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r0.add(r6)
            r0 = 0
        L_0x018d:
            if (r0 == 0) goto L_0x01e3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r4 = "CLTNOT onVoiceGroupChange isMsgDouble error: msgId:"
            r0[r13] = r4
            long r6 = r5.f307145o
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r10] = r4
            bs3.C104161b.m138993b(r1, r0)
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r6 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r6
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            java.lang.String r1 = "repeat"
            if (r0 == 0) goto L_0x01c9
            nw3.g0 r0 = r3.f328563J
            java.lang.String[] r3 = new java.lang.String[r8]
            r3[r13] = r2
            r3[r10] = r1
            int r1 = r5.f307132b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3[r12] = r1
            r0.mo161124a(r3)
            goto L_0x01e0
        L_0x01c9:
            java.lang.String r0 = r5.f307133c
            int r3 = r5.f307134d
            long r6 = r5.f307135e
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r13] = r2
            r4[r10] = r1
            int r1 = r5.f307132b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4[r12] = r1
            nw3.C109799g0.m149209k(r0, r3, r6, r4)
        L_0x01e0:
            r0 = -3
            goto L_0x085a
        L_0x01e3:
            int r0 = r5.f307132b
            int r6 = r5.f307144n
            java.lang.String r14 = " is smaller than the latest handled msg seq "
            java.lang.String r15 = "voiceMsg type "
            java.lang.String r16 = " seq "
            r4 = 1024(0x400, float:1.435E-42)
            r11 = 256(0x100, float:3.59E-43)
            r9 = 512(0x200, float:7.175E-43)
            r12 = 2048(0x800, float:2.87E-42)
            r13 = 8
            if (r0 == r10) goto L_0x032d
            if (r0 == r7) goto L_0x0302
            if (r0 == r13) goto L_0x02d7
            if (r0 == r11) goto L_0x02aa
            if (r0 == r9) goto L_0x027d
            if (r0 == r4) goto L_0x0250
            if (r0 == r12) goto L_0x0221
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = 0
            r14[r17] = r0
            r14[r10] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r18 = 2
            r14[r18] = r0
            java.lang.String r0 = " unknow voiceMsg type "
            bs3.C104161b.m138997f(r0, r14)
            goto L_0x0356
        L_0x0221:
            r17 = 0
            r18 = 2
            int r12 = r3.f328562I
            if (r6 > r12) goto L_0x024c
            r12 = 6
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r9[r17] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9[r10] = r0
            r9[r18] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r9[r8] = r0
            r9[r7] = r14
            int r0 = r3.f328562I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r9[r6] = r0
            bs3.C104161b.m138997f(r1, r9)
            goto L_0x0356
        L_0x024c:
            r3.f328562I = r6
            goto L_0x035d
        L_0x0250:
            int r9 = r3.f328561H
            if (r6 > r9) goto L_0x0279
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r10] = r0
            r9 = 2
            r12[r9] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12[r8] = r0
            r12[r7] = r14
            int r0 = r3.f328561H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r12[r6] = r0
            bs3.C104161b.m138997f(r1, r12)
            goto L_0x0356
        L_0x0279:
            r3.f328561H = r6
            goto L_0x035d
        L_0x027d:
            int r9 = r3.f328560G
            if (r6 > r9) goto L_0x02a6
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r10] = r0
            r9 = 2
            r12[r9] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12[r8] = r0
            r12[r7] = r14
            int r0 = r3.f328560G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r12[r6] = r0
            bs3.C104161b.m138997f(r1, r12)
            goto L_0x0356
        L_0x02a6:
            r3.f328560G = r6
            goto L_0x035d
        L_0x02aa:
            int r9 = r3.f328559F
            if (r6 > r9) goto L_0x02d3
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r10] = r0
            r9 = 2
            r12[r9] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12[r8] = r0
            r12[r7] = r14
            int r0 = r3.f328559F
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r12[r6] = r0
            bs3.C104161b.m138997f(r1, r12)
            goto L_0x0356
        L_0x02d3:
            r3.f328559F = r6
            goto L_0x035d
        L_0x02d7:
            int r9 = r3.f328558E
            if (r6 > r9) goto L_0x02ff
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r10] = r0
            r9 = 2
            r12[r9] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12[r8] = r0
            r12[r7] = r14
            int r0 = r3.f328558E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r12[r6] = r0
            bs3.C104161b.m138997f(r1, r12)
            goto L_0x0356
        L_0x02ff:
            r3.f328558E = r6
            goto L_0x035d
        L_0x0302:
            int r9 = r3.f328557D
            if (r6 > r9) goto L_0x032a
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r10] = r0
            r9 = 2
            r12[r9] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12[r8] = r0
            r12[r7] = r14
            int r0 = r3.f328557D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r12[r6] = r0
            bs3.C104161b.m138997f(r1, r12)
            goto L_0x0356
        L_0x032a:
            r3.f328557D = r6
            goto L_0x035d
        L_0x032d:
            if (r6 <= 0) goto L_0x035b
            int r9 = r3.f328556C
            if (r6 > r9) goto L_0x035b
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r10] = r0
            r9 = 2
            r12[r9] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r12[r8] = r0
            r12[r7] = r14
            int r0 = r3.f328556C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 5
            r12[r6] = r0
            bs3.C104161b.m138997f(r1, r12)
        L_0x0356:
            r6 = 2
            r12 = 0
            r26 = 0
            goto L_0x0378
        L_0x035b:
            r3.f328556C = r6
        L_0x035d:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12 = 0
            r9[r12] = r0
            r9[r10] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r6 = 2
            r9[r6] = r0
            java.lang.String r0 = " update local seq"
            r9[r8] = r0
            bs3.C104161b.m138997f(r15, r9)
            r26 = 1
        L_0x0378:
            if (r26 != 0) goto L_0x038d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = "onVoiceGroupChange update msg seq fail type:"
            r0[r12] = r2
            int r2 = r5.f307132b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r10] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x038d:
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r11 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r11
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            if (r0 == 0) goto L_0x03b8
            nw3.g0 r0 = r3.f328563J
            java.lang.String[] r9 = new java.lang.String[r8]
            r11 = 0
            r9[r11] = r2
            java.lang.String r2 = "succ"
            r9[r10] = r2
            int r2 = r5.f307132b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r11 = 2
            r9[r11] = r2
            r0.mo161124a(r9)
            goto L_0x03b9
        L_0x03b8:
            r11 = 2
        L_0x03b9:
            int r0 = r5.f307132b
            if (r0 != r11) goto L_0x03e3
            java.lang.String r15 = r5.f307133c
            r16 = 0
            int r0 = r5.f307136f
            int r1 = r5.f307134d
            long r6 = r5.f307135e
            as3.b1[] r2 = r5.f307139i
            as3.c1[] r4 = r5.f307138h
            as3.z0 r5 = r5.f307137g
            r24 = 1
            r25 = 1
            r14 = r3
            r17 = r0
            r18 = r1
            r19 = r6
            r21 = r2
            r22 = r4
            r23 = r5
            r14.mo161075G(r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            goto L_0x0859
        L_0x03e3:
            if (r0 != r7) goto L_0x0422
            java.lang.String r15 = r5.f307133c
            r16 = 0
            int r0 = r5.f307136f
            int r1 = r5.f307134d
            long r6 = r5.f307135e
            as3.b1[] r2 = r5.f307139i
            as3.c1[] r4 = r5.f307138h
            as3.z0 r8 = r5.f307137g
            r24 = 1
            r25 = 1
            r14 = r3
            r17 = r0
            r18 = r1
            r19 = r6
            r21 = r2
            r22 = r4
            r23 = r8
            r14.mo161075G(r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            int r0 = r5.f307142l
            if (r0 != 0) goto L_0x0411
            int r1 = r5.f307143m
            if (r1 == 0) goto L_0x0859
        L_0x0411:
            nw3.b r1 = r3.f328564K
            if (r1 == 0) goto L_0x0859
            int r2 = r5.f307143m
            com.tencent.mm.plugin.multi.talk r1 = r1.f328532a
            if (r1 != 0) goto L_0x041d
            goto L_0x0859
        L_0x041d:
            r1.SetAVEncryptType(r0, r2)
            goto L_0x0859
        L_0x0422:
            r2 = 16
            if (r0 != r2) goto L_0x044c
            java.lang.String r15 = r5.f307133c
            r16 = 0
            int r0 = r5.f307136f
            int r1 = r5.f307134d
            long r6 = r5.f307135e
            as3.b1[] r2 = r5.f307139i
            as3.c1[] r4 = r5.f307138h
            as3.z0 r5 = r5.f307137g
            r24 = 1
            r25 = 0
            r14 = r3
            r17 = r0
            r18 = r1
            r19 = r6
            r21 = r2
            r22 = r4
            r23 = r5
            r14.mo161075G(r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            goto L_0x0859
        L_0x044c:
            java.lang.String r2 = " roomId: "
            if (r0 != r10) goto L_0x053a
            r9 = 6
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r4 = "handlerCreateGroupChange groupChg.groupId: "
            r6 = 0
            r0[r6] = r4
            java.lang.String r4 = r5.f307133c
            r0[r10] = r4
            r4 = 2
            r0[r4] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = " roomkey: "
            r0[r7] = r2
            long r11 = r5.f307135e
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4 = 5
            r0[r4] = r2
            bs3.C104161b.m138997f(r1, r0)
            java.lang.String r0 = cs3.C106962a.f320180a
            boolean r0 = bs3.C104166f.m139002b(r0)
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x052e
            boolean r0 = r3.mo161080L()
            if (r0 == 0) goto L_0x04a1
            java.lang.String r0 = r5.f307133c
            java.lang.String r2 = r3.f328593p
            boolean r0 = bs3.C104166f.m139001a(r0, r2)
            if (r0 == 0) goto L_0x04a1
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "CLTNOT handlerCreateGroupChange return is same groupId: "
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = r3.f328593p
            r0[r10] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x04a1:
            java.lang.String r15 = r5.f307133c
            r16 = 0
            int r0 = r5.f307136f
            int r2 = r5.f307134d
            long r11 = r5.f307135e
            as3.b1[] r4 = r5.f307139i
            as3.c1[] r6 = r5.f307138h
            as3.z0 r9 = r5.f307137g
            r24 = 0
            r25 = 1
            r14 = r3
            r17 = r0
            r18 = r2
            r19 = r11
            r21 = r4
            r22 = r6
            r23 = r9
            r14.mo161075G(r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            java.lang.String r0 = r5.f307133c
            int r2 = r5.f307134d
            long r3 = r5.f307135e
            int r6 = r5.f307136f
            int r5 = r5.f307146p
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 == 0) goto L_0x04e0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = "CLTNOT ackTalkRoom groupId is null"
            r3 = 0
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0522
        L_0x04e0:
            ow3.a r9 = new ow3.a
            r34 = 0
            r27 = r9
            r28 = r0
            r29 = r2
            r30 = r3
            r32 = r6
            r33 = r5
            r27.<init>(r28, r29, r30, r32, r33, r34)
            zr3.e r6 = zr3.C112675e.m154053e()
            boolean r6 = r6.mo164407c(r9)
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r11 = "CLTNOT ackTalkRoom groupId: "
            r12 = 0
            r9[r12] = r11
            r9[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 2
            r9[r2] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r9[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r9[r7] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2 = 5
            r9[r2] = r0
            bs3.C104161b.m138993b(r1, r9)
        L_0x0522:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = "handlerCreateGroupChange start ui"
            r9 = 0
            r0[r9] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x052e:
            r9 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = "CLTNOT handlerCreateGroupChange isAuthed is false"
            r0[r9] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x053a:
            r9 = 0
            java.lang.String r11 = " mGroupId: "
            if (r0 != r13) goto L_0x05c9
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = "handleCancelCreateVoiceGroupChange groupChg.groupId: "
            r0[r9] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            r2 = 2
            r0[r2] = r11
            java.lang.String r2 = r3.f328593p
            r0[r8] = r2
            bs3.C104161b.m138997f(r1, r0)
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r1 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r1
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            if (r0 == 0) goto L_0x05a3
            java.lang.String r15 = r5.f307133c
            r16 = 0
            int r0 = r5.f307136f
            int r1 = r5.f307134d
            long r6 = r5.f307135e
            as3.b1[] r2 = r5.f307139i
            as3.c1[] r4 = r5.f307138h
            as3.z0 r8 = r5.f307137g
            r24 = 1
            r25 = 0
            r14 = r3
            r17 = r0
            r18 = r1
            r19 = r6
            r21 = r2
            r22 = r4
            r23 = r8
            r14.mo161075G(r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r1 = r5.f307135e
            r19 = 0
            r21 = 0
            boolean r4 = r3.f328588h
            r22 = 1
            r16 = r0
            r17 = r1
            r20 = r4
            r14.mo161099j(r15, r16, r17, r19, r20, r21, r22)
            goto L_0x0859
        L_0x05a3:
            java.lang.String r15 = r5.f307133c
            r16 = 0
            int r0 = r5.f307136f
            int r1 = r5.f307134d
            long r6 = r5.f307135e
            as3.b1[] r2 = r5.f307139i
            as3.c1[] r4 = r5.f307138h
            as3.z0 r5 = r5.f307137g
            r24 = 1
            r25 = 0
            r14 = r3
            r17 = r0
            r18 = r1
            r19 = r6
            r21 = r2
            r22 = r4
            r23 = r5
            r14.mo161075G(r15, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            goto L_0x0859
        L_0x05c9:
            r9 = 128(0x80, float:1.794E-43)
            if (r0 != r9) goto L_0x0619
            r9 = 6
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r2 = "handleMemberWhisper groupChg.groupChg.groupId: "
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            r2 = 2
            r0[r2] = r11
            java.lang.String r2 = r3.f328593p
            r0[r8] = r2
            java.lang.String r2 = " groupChg.whisperBuf size: "
            r0[r7] = r2
            byte[] r2 = r5.f307147q
            if (r2 != 0) goto L_0x05ea
            r2 = 0
            goto L_0x05eb
        L_0x05ea:
            int r2 = r2.length
        L_0x05eb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 5
            r0[r4] = r2
            bs3.C104161b.m138993b(r1, r0)
            nw3.j r0 = r3.f328573S
            java.lang.String r1 = r5.f307133c
            byte[] r2 = r5.f307147q
            r0.getClass()
            nw3.f0 r3 = new nw3.f0
            r3.<init>(r0, r1, r2)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L_0x0612
            r3.run()
            goto L_0x0859
        L_0x0612:
            android.os.Handler r0 = r0.f328706b
            r0.post(r3)
            goto L_0x0859
        L_0x0619:
            java.lang.String r9 = "handleVideoMember notify is null"
            r6 = 256(0x100, float:3.59E-43)
            if (r0 != r6) goto L_0x06f5
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r11 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r11
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            if (r0 != 0) goto L_0x064b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "handleVideoMember is not same room "
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x064b:
            byte[] r0 = r5.f307147q
            if (r0 != 0) goto L_0x0668
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "handleVideoMember whisperBuf is null"
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x0668:
            as3.t r4 = new as3.t     // Catch:{ d -> 0x0671 }
            r4.<init>()     // Catch:{ d -> 0x0671 }
            p978i9.C108421e.m146905c(r4, r0)     // Catch:{ d -> 0x0671 }
            goto L_0x0680
        L_0x0671:
            r0 = move-exception
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r4 = "handleVideoMember "
            r11 = 0
            r6[r11] = r4
            r6[r10] = r0
            bs3.C104161b.m138997f(r1, r6)
            r4 = 0
        L_0x0680:
            if (r4 == 0) goto L_0x06de
            as3.s0[] r0 = r4.f307161b
            if (r0 != 0) goto L_0x0687
            goto L_0x06de
        L_0x0687:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            as3.s0[] r4 = r4.f307161b
            int r5 = r4.length
            r6 = 0
        L_0x0690:
            if (r6 >= r5) goto L_0x069d
            r9 = r4[r6]
            if (r9 != 0) goto L_0x0697
            goto L_0x069a
        L_0x0697:
            r0.add(r9)
        L_0x069a:
            int r6 = r6 + 1
            goto L_0x0690
        L_0x069d:
            r6 = 6
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = "handleVideoMember groupid: "
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r3.f328593p
            r4[r10] = r5
            r5 = 2
            r4[r5] = r2
            int r2 = r3.f328597s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r8] = r2
            java.lang.String r2 = " videoUserNames: "
            r4[r7] = r2
            r2 = 5
            r4[r2] = r0
            bs3.C104161b.m138993b(r1, r4)
            nw3.j r1 = r3.f328573S
            r1.getClass()
            nw3.y r2 = new nw3.y
            r2.<init>(r1, r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r0 != r3) goto L_0x06d7
            r2.run()
            goto L_0x0859
        L_0x06d7:
            android.os.Handler r0 = r1.f328706b
            r0.post(r2)
            goto L_0x0859
        L_0x06de:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r2 = 0
            r0[r2] = r9
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x06f5:
            if (r0 != r4) goto L_0x0745
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r11 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r11
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            if (r0 != 0) goto L_0x0723
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "handleOtherDevice is not same room "
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x0723:
            int r0 = r3.f328587g
            if (r0 == r8) goto L_0x0859
            if (r0 != r7) goto L_0x072b
            goto L_0x0859
        L_0x072b:
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r1 = r5.f307135e
            r19 = 1
            r14 = r3
            r16 = r0
            r17 = r1
            r14.mo161081M(r15, r16, r17, r19)
            nw3.j r0 = r3.f328573S
            r1 = -1400(0xfffffffffffffa88, float:NaN)
            r2 = 0
            r0.mo161132b(r1, r2)
            goto L_0x0859
        L_0x0745:
            r2 = 0
            r4 = 512(0x200, float:7.175E-43)
            if (r0 != r4) goto L_0x07e5
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r6 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r6
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            if (r0 != 0) goto L_0x0776
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "handleVideoSubscribes is not same room "
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x0776:
            byte[] r0 = r5.f307147q
            if (r0 != 0) goto L_0x0793
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "handleVideoSubscribes whisperBuf is null"
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x0793:
            as3.s r4 = new as3.s     // Catch:{ d -> 0x079d }
            r4.<init>()     // Catch:{ d -> 0x079d }
            p978i9.C108421e.m146905c(r4, r0)     // Catch:{ d -> 0x079d }
            r7 = 0
            goto L_0x07ac
        L_0x079d:
            r0 = move-exception
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r4 = "handleVideoSubscribes "
            r7 = 0
            r6[r7] = r4
            r6[r10] = r0
            bs3.C104161b.m138997f(r1, r6)
            r4 = r2
        L_0x07ac:
            if (r4 != 0) goto L_0x07c4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r9
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x07c4:
            nw3.j r0 = r3.f328573S
            int r1 = r4.f307153b
            r0.getClass()
            nw3.q r2 = new nw3.q
            r2.<init>(r0, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r1 != r3) goto L_0x07df
            r2.run()
            goto L_0x0859
        L_0x07df:
            android.os.Handler r0 = r0.f328706b
            r0.post(r2)
            goto L_0x0859
        L_0x07e5:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 != r2) goto L_0x085e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = "onVoiceGroupChange, chgtype: audiostream"
            r4 = 0
            r0[r4] = r2
            bs3.C104161b.m138997f(r1, r0)
            java.lang.String r15 = r5.f307133c
            int r0 = r5.f307134d
            long r11 = r5.f307135e
            r19 = 0
            r14 = r3
            r16 = r0
            r17 = r11
            boolean r0 = r14.mo161078J(r15, r16, r17, r19)
            if (r0 != 0) goto L_0x081e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = "handleAudioStreamChange is not same room "
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = r5.f307133c
            r0[r10] = r2
            int r2 = r5.f307134d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 2
            r0[r6] = r2
            bs3.C104161b.m138997f(r1, r0)
            goto L_0x0859
        L_0x081e:
            r4 = 0
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = "handleAudioStreamChange audio_stream_type"
            r0[r4] = r2
            int r2 = r5.f307150t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r10] = r2
            bs3.C104161b.m138993b(r1, r0)
            byte[] r0 = new byte[r7]
            int r1 = r5.f307150t
            r2 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r2 = r1 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r10] = r2
            int r2 = r1 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r4 = 2
            r0[r4] = r2
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r0[r8] = r1
            nw3.b r1 = r3.f328564K
            com.tencent.mm.plugin.multi.talk r1 = r1.f328532a
            r2 = 306(0x132, float:4.29E-43)
            r1.setAppCmd(r2, r0, r7)
        L_0x0859:
            r0 = 0
        L_0x085a:
            r3 = 2
            r26 = 0
            goto L_0x0879
        L_0x085e:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = "onVoiceGroupChange, unknow chgtype:"
            r26 = 0
            r2[r26] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r10] = r0
            long r3 = r5.f307145o
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 2
            r2[r3] = r0
            bs3.C104161b.m138997f(r1, r2)
            r0 = 0
        L_0x0879:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "handleMultiTalkNotify ret: "
            r1[r26] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.lang.String r0 = "TalkRoomSdkApi"
            bs3.C104161b.m138997f(r0, r1)
            goto L_0x0a26
        L_0x088c:
            java.lang.String r2 = ".sysmsg.multivoip.banner"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x089b
            r1.mo150717a(r2, r0)
            goto L_0x0a26
        L_0x089b:
            java.lang.String r1 = ".sysmsg.voipmt.invite"
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "hy: unable to parse from data"
            java.lang.String r4 = "MicroMsg.Multitalk.ILinkService"
            if (r1 == 0) goto L_0x0979
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r9)
            byte[] r1 = r1.getBytes()
            r3 = 0
            byte[] r1 = android.util.Base64.decode(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "receive invite "
            r3.append(r7)
            te3.j3 r0 = r0.f94242a
            te3.rv3 r0 = r0.f227631h
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            r3.append(r0)
            r3.append(r5)
            int r0 = r1.length
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.u1 r3 = r3.f251803a
            java.lang.Object r3 = r3.mo119660a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r3)
            long r5 = (long) r3
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r0.mo150615y(r5, r3)
            te3.rs4 r3 = new te3.rs4
            r3.<init>()
            r3.parseFrom(r1)     // Catch:{ IOException -> 0x096f }
            java.util.Map<java.lang.Long, te3.rs4> r1 = r0.f314427y1
            if (r1 == 0) goto L_0x091a
            long r5 = r3.f141117e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L_0x091a
            java.util.Map<java.lang.Long, te3.rs4> r1 = r0.f314427y1
            long r5 = r3.f141117e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r2, r3)
        L_0x091a:
            r0.f314371V = r10
            java.lang.Object[] r1 = new java.lang.Object[r10]
            long r5 = r3.f141117e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 0
            r1[r5] = r2
            java.lang.String r2 = "recvnotify roomid %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r1 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.ipcinvoker.wx_extension.j r1 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r1
            com.tencent.mm.plugin.multitalk.ilinkservice.q r2 = r0.f314394i
            r2.getClass()
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            te3.ls4 r4 = new te3.ls4
            r4.<init>()
            r2.f127066a = r4
            te3.ms4 r4 = new te3.ms4
            r4.<init>()
            r2.f127067b = r4
            r4 = 573(0x23d, float:8.03E-43)
            r2.f127069d = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/voipmtgetauthcode"
            r2.f127068c = r4
            r4 = 0
            r2.f127070e = r4
            r2.f127071f = r4
            ob0.c r2 = r2.mo72403a()
            ob0.c$c r4 = r2.f127055a
            pe3.a r4 = r4.f127080a
            te3.ls4 r4 = (te3.ls4) r4
            r4.f137632d = r10
            com.tencent.mm.plugin.multitalk.ilinkservice.b0 r4 = new com.tencent.mm.plugin.multitalk.ilinkservice.b0
            r4.<init>(r0, r3)
            r1.mo63014eH(r2, r4)
            goto L_0x0a26
        L_0x096f:
            r0 = move-exception
            r1 = r0
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r2, r0)
            goto L_0x0a26
        L_0x0979:
            r11 = 0
            java.lang.String r1 = ".sysmsg.voipmt.banner"
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0a26
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r9)
            byte[] r1 = r1.getBytes()
            byte[] r1 = android.util.Base64.decode(r1, r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "receive banner "
            r3.append(r11)
            te3.j3 r0 = r0.f94242a
            te3.rv3 r0 = r0.f227631h
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            r3.append(r0)
            r3.append(r5)
            int r0 = r1.length
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.u1 r3 = r3.f251803a
            java.lang.Object r3 = r3.mo119660a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r3)
            long r5 = (long) r3
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r0.mo150615y(r5, r3)
            te3.gs4 r3 = new te3.gs4
            r3.<init>()
            r3.parseFrom(r1)     // Catch:{ IOException -> 0x0a1e }
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r3.f331980d
            r5 = 0
            r1[r5] = r2
            java.lang.String r2 = r3.f331982f
            r1[r10] = r2
            long r5 = r3.f331981e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 2
            r1[r5] = r2
            long r5 = r3.f331984h
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1[r8] = r2
            int r2 = r3.f331985i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            java.lang.String r2 = "got banner msg from wxgroupid %s sdkgroupid %s roomid %d seq %d status %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            java.lang.String r1 = r3.f331982f
            if (r1 == 0) goto L_0x0a09
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0a0e
        L_0x0a09:
            int r1 = r3.f331985i
            if (r1 == 0) goto L_0x0a0e
            goto L_0x0a26
        L_0x0a0e:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.lang.String r2 = r3.f331980d
            r4 = 2
            r1.mo150639P(r2, r4)
            com.tencent.mm.plugin.multitalk.ilinkservice.d r0 = r0.f314406p0
            r0.mo150491d(r3)
            goto L_0x0a26
        L_0x0a1e:
            r0 = move-exception
            r1 = r0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r2, r0)
        L_0x0a26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g82.C107786h.mo9066Y(ob0.m$a):void");
    }
}
