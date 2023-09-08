package p236sn;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C27049a1;
import f62.C75700k0;
import g62.C75875l;
import java.util.ArrayList;
import rb0.C47984k;
import rb0.C48004s;
import rb0.C48009v0;

/* renamed from: sn.e */
public class C48422e implements C27049a1 {
    /* renamed from: V4 */
    public void mo54537V4(C72963f4 f4Var, C75875l.C45886e eVar, boolean[] zArr) {
        ((C48004s) C86312j.m106911c(C48004s.class)).mo72740wp().getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if ((r11.mo108786G2() + r1.f123847d) >= 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
        if (r2 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026a, code lost:
        if ((r11.mo108786G2() + r1.f123847d) >= 0) goto L_0x026c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05f2  */
    /* JADX WARNING: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* renamed from: a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54538a2(com.tencent.p014mm.storage.C72963f4 r27, com.tencent.p014mm.storage.C72976h2 r28, boolean r29, g62.C75875l.C45886e r30) {
        /*
            r26 = this;
            r0 = r28
            r1 = r30
            java.lang.Class<rb0.s> r2 = rb0.C48004s.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            rb0.s r2 = (rb0.C48004s) r2
            com.tencent.mm.storage.b0 r2 = r2.mo72740wp()
            r2.getClass()
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r3)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.v3 r4 = r4.mo96094Ku()
            if (r1 != 0) goto L_0x0023
            r6 = 0
            goto L_0x0025
        L_0x0023:
            java.lang.String r6 = r1.f123844a
        L_0x0025:
            if (r1 == 0) goto L_0x0036
            java.lang.String r8 = r1.f123845b
            java.lang.String r9 = "delete"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0036
            int r8 = r1.f123849f
            if (r8 <= 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            java.lang.String r9 = "insert"
            if (r1 == 0) goto L_0x0048
            java.lang.String r10 = r1.f123845b
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x0048
            int r10 = r1.f123848e
            if (r10 <= 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r10 = 0
        L_0x0049:
            java.lang.String r11 = r28.mo108782C2()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r12 = " "
            java.lang.String r13 = ":"
            java.lang.String r5 = ""
            java.lang.String r7 = "MicroMsg.BizConversationStorage"
            java.lang.String r14 = "update"
            r18 = 0
            if (r11 != 0) goto L_0x0331
            java.lang.String r11 = r28.mo108782C2()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            com.tencent.mm.storage.h2 r11 = r4.mo69771j(r11)
            if (r11 == 0) goto L_0x021d
            r15 = 2097152(0x200000, float:2.938736E-39)
            boolean r15 = r11.mo108372k3(r15)
            if (r15 == 0) goto L_0x021d
            if (r10 <= 0) goto L_0x00e7
            java.lang.String r15 = r1.f123845b
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto L_0x0085
            int r15 = r1.f123847d
            if (r15 > 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r20 = r2
            goto L_0x0098
        L_0x0085:
            java.lang.String r15 = r1.f123845b
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L_0x00df
            int r15 = r11.mo108786G2()
            r20 = r2
            int r2 = r1.f123847d
            int r15 = r15 + r2
            if (r15 < 0) goto L_0x00e1
        L_0x0098:
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r6)
            if (r2 == 0) goto L_0x00d4
            boolean r2 = eb0.C45628s0.m50746K(r2)
            if (r2 != 0) goto L_0x00c9
            sb0.d r2 = rb0.C48009v0.Ax0()     // Catch:{ all -> 0x00c2 }
            r21 = r14
            long r14 = r1.f123851h     // Catch:{ all -> 0x00c0 }
            sb0.c r2 = r2.mo73042a0(r14)     // Catch:{ all -> 0x00c0 }
            r14 = 1
            boolean r2 = r2.mo73033l2(r14)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c6
        L_0x00c0:
            goto L_0x00c5
        L_0x00c2:
            r21 = r14
            goto L_0x00c0
        L_0x00c5:
            r2 = 0
        L_0x00c6:
            if (r2 == 0) goto L_0x00d6
            goto L_0x00cb
        L_0x00c9:
            r21 = r14
        L_0x00cb:
            int r2 = r11.mo108788I2()
            int r2 = r2 + r10
            r11.mo108817i3(r2)
            goto L_0x00e3
        L_0x00d4:
            r21 = r14
        L_0x00d6:
            int r2 = r11.mo108786G2()
            int r2 = r2 + r10
            r11.mo108812g3(r2)
            goto L_0x00e3
        L_0x00df:
            r20 = r2
        L_0x00e1:
            r21 = r14
        L_0x00e3:
            r4.mo69761e(r0, r8, r10)
            goto L_0x00eb
        L_0x00e7:
            r20 = r2
            r21 = r14
        L_0x00eb:
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            java.lang.String r14 = r28.mo108782C2()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            java.lang.String r2 = r2.mo69743N(r14)
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r2 = r3.Ex0(r2)
            if (r2 == 0) goto L_0x01e8
            long r14 = r2.getMsgId()
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x01e8
            r11.mo101164o3(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = r2.mo108768t()
            r3.append(r14)
            r3.append(r13)
            java.lang.String r14 = r2.getContent()
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r11.mo108792M2(r3)
            int r3 = r2.getType()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r11.mo108806b3(r3)
            com.tencent.mm.storage.v3$b r3 = r4.mo69741L()
            if (r3 == 0) goto L_0x01e3
            com.tencent.mm.pointers.PString r3 = new com.tencent.mm.pointers.PString
            r3.<init>()
            com.tencent.mm.pointers.PString r14 = new com.tencent.mm.pointers.PString
            r14.<init>()
            com.tencent.mm.pointers.PInt r15 = new com.tencent.mm.pointers.PInt
            r15.<init>()
            r22 = r13
            java.lang.String r13 = r28.mo108782C2()
            r2.mo108749c3(r13)
            java.lang.String r13 = r11.getContent()
            r2.mo108732L2(r13)
            com.tencent.mm.storage.v3$b r13 = r4.mo69741L()
            com.tencent.mm.app.o1 r13 = (com.tencent.p014mm.app.C28686o1) r13
            r13.getClass()
            r13 = 1
            p875ci.C67379u.m79740d(r2, r3, r14, r15, r13)
            int r13 = r2.getType()
            r23 = r6
            java.lang.String r6 = r2.getContent()
            java.lang.String r6 = r4.mo69757b0(r13, r6)
            long r24 = r2.mo108759l2()
            r16 = -1
            int r13 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x01b0
            sb0.k r13 = rb0.C48009v0.Bx0()     // Catch:{ all -> 0x01ae }
            java.lang.String r2 = r2.mo108760m2()     // Catch:{ all -> 0x01ae }
            sb0.j r2 = r13.get(r2)     // Catch:{ all -> 0x01ae }
            java.lang.String r13 = r3.value     // Catch:{ all -> 0x01ae }
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x01ae }
            java.lang.String r2 = r2.field_userName     // Catch:{ all -> 0x01ae }
            r14 = 0
            r0[r14] = r2     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = java.lang.String.format(r13, r0)     // Catch:{ all -> 0x01ae }
            r3.value = r0     // Catch:{ all -> 0x01ae }
            r11.mo108795P2(r5)     // Catch:{ all -> 0x01ae }
            goto L_0x01b5
        L_0x01ae:
            goto L_0x01b5
        L_0x01b0:
            java.lang.String r0 = r14.value
            r11.mo108795P2(r0)
        L_0x01b5:
            java.lang.String r0 = r3.value
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x01c3
            r2 = r5
            goto L_0x01d6
        L_0x01c3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x01d6:
            java.lang.String r0 = r0.concat(r2)
            r11.mo108794O2(r0)
            int r0 = r15.value
            r11.mo108801W2(r0)
            goto L_0x01ef
        L_0x01e3:
            r23 = r6
            r22 = r13
            goto L_0x01ef
        L_0x01e8:
            r23 = r6
            r22 = r13
            r11.mo101162m3()
        L_0x01ef:
            java.lang.String r0 = r28.mo108782C2()
            r2 = 1
            int r0 = r4.mo69775m0(r11, r0, r2, r2)
            if (r0 <= 0) goto L_0x0233
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = r28.mo108782C2()
            r6 = 0
            r3[r6] = r0
            int r0 = r11.mo108786G2()
            int r0 = r0 + r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "hakon update parent conversation's unread %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r0, r3)
            java.lang.String r0 = r28.mo108782C2()
            r2 = 3
            r4.doNotify(r2, r4, r0)
            goto L_0x0233
        L_0x021d:
            r20 = r2
            r23 = r6
            r22 = r13
            r21 = r14
            if (r11 == 0) goto L_0x0239
            java.lang.String r0 = r11.getUsername()
            java.lang.String r2 = "officialaccounts"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0239
        L_0x0233:
            r0 = r28
            r2 = r21
            goto L_0x0339
        L_0x0239:
            if (r11 == 0) goto L_0x0282
            java.lang.String r0 = r11.getUsername()
            java.lang.String r2 = "appbrandcustomerservicemsg"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0282
            if (r10 <= 0) goto L_0x0233
            java.lang.String r0 = r1.f123845b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0259
            int r0 = r1.f123847d
            if (r0 > 0) goto L_0x0256
            goto L_0x0259
        L_0x0256:
            r2 = r21
            goto L_0x026c
        L_0x0259:
            java.lang.String r0 = r1.f123845b
            r2 = r21
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0274
            int r0 = r11.mo108786G2()
            int r3 = r1.f123847d
            int r0 = r0 + r3
            if (r0 < 0) goto L_0x0274
        L_0x026c:
            int r0 = r11.mo108786G2()
            int r0 = r0 + r10
            r11.mo108812g3(r0)
        L_0x0274:
            r0 = r28
            r4.mo69761e(r0, r8, r10)
            java.lang.String r3 = r28.mo108782C2()
            r4.mo69773k0(r11, r3)
            goto L_0x0339
        L_0x0282:
            r0 = r28
            r2 = r21
            if (r11 == 0) goto L_0x0339
            java.lang.String r6 = r11.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85845p5(r6)
            if (r6 == 0) goto L_0x0339
            if (r10 <= 0) goto L_0x0339
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.lang.String r6 = r28.getUsername()
            com.tencent.mm.storage.z1 r3 = r3.get(r6)
            if (r3 == 0) goto L_0x02ad
            boolean r3 = eb0.C45628s0.m50746K(r3)
            goto L_0x02ae
        L_0x02ad:
            r3 = 0
        L_0x02ae:
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r13 = r28.getUsername()
            r14 = 0
            r6[r14] = r13
            int r13 = r11.mo108786G2()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 1
            r6[r14] = r13
            int r13 = r11.mo108788I2()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 2
            r6[r14] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r14 = 3
            r6[r14] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            r14 = 4
            r6[r14] = r13
            java.lang.String r13 = "alvinluo updateOpenImKefuService conversation unRead msg count, username: %s, old unReadCount: %s, old unReadMuteCount: %s, newMsgInsertCount: %s, isMute: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r6)
            java.lang.String r6 = r1.f123845b
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02ed
            int r6 = r1.f123847d
            if (r6 > 0) goto L_0x02fe
        L_0x02ed:
            java.lang.String r6 = r1.f123845b
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0326
            int r6 = r11.mo108786G2()
            int r13 = r1.f123847d
            int r6 = r6 + r13
            if (r6 < 0) goto L_0x0326
        L_0x02fe:
            int r6 = r11.mo108786G2()
            if (r6 <= 0) goto L_0x030f
            if (r3 != 0) goto L_0x0326
            int r3 = r11.mo108786G2()
            int r3 = r3 + r10
            r11.mo108812g3(r3)
            goto L_0x0326
        L_0x030f:
            if (r3 == 0) goto L_0x031e
            r3 = 0
            r11.mo108812g3(r3)
            int r3 = r11.mo108788I2()
            int r3 = r3 + r10
            r11.mo108817i3(r3)
            goto L_0x0326
        L_0x031e:
            int r3 = r11.mo108786G2()
            int r3 = r3 + r10
            r11.mo108812g3(r3)
        L_0x0326:
            r4.mo69761e(r0, r8, r10)
            java.lang.String r3 = r28.mo108782C2()
            r4.mo69773k0(r11, r3)
            goto L_0x0339
        L_0x0331:
            r20 = r2
            r23 = r6
            r22 = r13
            r2 = r14
            r11 = 0
        L_0x0339:
            if (r1 == 0) goto L_0x063e
            long r3 = r1.f123851h
            r13 = -1
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x063e
            r3 = 8388608(0x800000, float:1.17549435E-38)
            boolean r3 = r0.mo108372k3(r3)
            if (r3 == 0) goto L_0x063e
            java.lang.Class<rb0.e0> r3 = rb0.C47966e0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rb0.e0 r3 = (rb0.C47966e0) r3
            com.tencent.mm.storage.a0 r3 = r3.mo72739Mm()
            long r13 = r1.f123851h
            r6 = r23
            com.tencent.mm.storage.f4 r3 = r3.mo100930n(r6, r13)
            sb0.b r4 = rb0.C48009v0.Dx0()
            long r13 = r1.f123851h
            sb0.a r4 = r4.mo73024Yt(r13)
            sb0.d r13 = rb0.C48009v0.Ax0()
            long r14 = r1.f123851h
            sb0.c r13 = r13.mo73042a0(r14)
            java.lang.String r14 = r13.field_bizChatServId
            if (r14 != 0) goto L_0x037e
            java.lang.String r0 = "willen updateBizChatConversation bizChatInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x063e
        L_0x037e:
            if (r3 == 0) goto L_0x0609
            long r14 = r3.getMsgId()
            int r16 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x038a
            goto L_0x0609
        L_0x038a:
            boolean r14 = r13.mo73037p2()
            r4.field_brandUserName = r6
            boolean r15 = r3.mo100985X3()
            if (r15 == 0) goto L_0x039d
            java.lang.String r15 = r3.mo101011p3()
            r4.field_content = r15
            goto L_0x03a3
        L_0x039d:
            java.lang.String r15 = r3.getContent()
            r4.field_content = r15
        L_0x03a3:
            com.tencent.mm.pointers.PString r15 = new com.tencent.mm.pointers.PString
            r15.<init>()
            r23 = r6
            r16 = r7
            r7 = r20
            com.tencent.mm.storage.v3 r6 = r7.f121062a
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            com.tencent.mm.storage.v3$b r6 = r6.mo69741L()
            r17 = r8
            com.tencent.mm.pointers.PString r8 = new com.tencent.mm.pointers.PString
            r8.<init>()
            r18 = r10
            com.tencent.mm.pointers.PInt r10 = new com.tencent.mm.pointers.PInt
            r10.<init>()
            com.tencent.mm.app.o1 r6 = (com.tencent.p014mm.app.C28686o1) r6
            r6.getClass()
            r6 = 0
            p875ci.C67379u.m79740d(r3, r15, r8, r10, r6)
            java.lang.String r6 = r15.value
            sb0.k r8 = rb0.C48009v0.Bx0()
            java.lang.String r10 = r3.mo108760m2()
            sb0.j r8 = r8.get(r10)
            if (r14 == 0) goto L_0x043a
            int r10 = r3.mo108769t2()
            r14 = 1
            if (r10 != r14) goto L_0x0412
            if (r8 == 0) goto L_0x0412
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821576(0x7f110408, float:1.92759E38)
            java.lang.String r14 = r14.getString(r15)
            r10.append(r14)
            r14 = r22
            r10.append(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r4.field_digest = r6
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = r6.getString(r15)
            r8.field_userName = r6
            goto L_0x043c
        L_0x0412:
            r14 = r22
            if (r8 == 0) goto L_0x0437
            java.lang.String r10 = r8.field_userName
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0437
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = r8.field_userName
            r10.append(r15)
            r10.append(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r4.field_digest = r6
            java.lang.String r6 = r8.field_userName
            goto L_0x043d
        L_0x0437:
            r4.field_digest = r6
            goto L_0x043c
        L_0x043a:
            r4.field_digest = r6
        L_0x043c:
            r6 = 0
        L_0x043d:
            com.tencent.mm.storage.v3 r8 = r7.f121062a
            int r10 = r3.getType()
            java.lang.String r14 = r3.getContent()
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8
            java.lang.String r8 = r8.mo69757b0(r10, r14)
            java.lang.String r10 = r4.field_digest
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r14 != 0) goto L_0x0473
            boolean r14 = r10.endsWith(r8)
            if (r14 != 0) goto L_0x0473
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r12)
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            r4.field_digest = r8
        L_0x0473:
            r4.field_digestUser = r5
            int r5 = r13.field_chatType
            r4.field_chatType = r5
            long r14 = r3.getMsgId()
            r4.field_lastMsgID = r14
            boolean r5 = r3.mo100989b4()
            if (r5 == 0) goto L_0x048c
            long r14 = r3.getCreateTime()
            r4.field_lastMsgTime = r14
            goto L_0x049f
        L_0x048c:
            int r5 = r3.getStatus()
            r8 = 1
            if (r5 != r8) goto L_0x0499
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x049d
        L_0x0499:
            long r14 = r3.getCreateTime()
        L_0x049d:
            r4.field_lastMsgTime = r14
        L_0x049f:
            int r5 = r3.getStatus()
            r4.field_status = r5
            int r5 = r3.mo108769t2()
            r4.field_isSend = r5
            int r5 = r3.getType()
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r4.field_msgType = r5
            long r14 = r3.getCreateTime()
            r5 = 1
            long r14 = sb0.C48329b.m53633kD(r4, r5, r14)
            r4.field_flag = r14
            java.lang.String r5 = r1.f123845b
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x04cc
            int r5 = r1.f123847d
            if (r5 > 0) goto L_0x04db
        L_0x04cc:
            java.lang.String r5 = r1.f123845b
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x050d
            int r2 = r4.field_unReadCount
            int r5 = r1.f123847d
            int r2 = r2 + r5
            if (r2 < 0) goto L_0x050d
        L_0x04db:
            int r2 = r4.field_unReadCount
            int r5 = r1.f123847d
            int r2 = r2 + r5
            r4.field_unReadCount = r2
            int r2 = r4.field_newUnReadCount
            int r2 = r2 + r5
            r4.field_newUnReadCount = r2
            if (r5 <= 0) goto L_0x050d
            r2 = 1
            boolean r5 = r13.mo73033l2(r2)
            if (r5 == 0) goto L_0x050d
            int r2 = r28.mo108786G2()
            int r5 = r1.f123847d
            int r2 = r2 - r5
            if (r2 > 0) goto L_0x04fe
            r5 = 0
            r0.mo108812g3(r5)
            goto L_0x0501
        L_0x04fe:
            r0.mo108812g3(r2)
        L_0x0501:
            int r2 = r28.mo108788I2()
            int r5 = r1.f123847d
            int r2 = r2 + r5
            r0.mo108817i3(r2)
            r2 = 1
            goto L_0x050e
        L_0x050d:
            r2 = 0
        L_0x050e:
            java.lang.String r5 = r1.f123845b
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x05b4
            java.util.ArrayList<com.tencent.mm.storage.f4> r5 = r1.f123846c
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x05b4
            boolean r5 = r13.mo73037p2()
            if (r5 == 0) goto L_0x05b4
            sb0.k r5 = rb0.C48009v0.Bx0()
            java.lang.String r8 = r3.mo108768t()
            java.lang.String r5 = r5.mo73076Pk(r8)
            java.util.ArrayList<com.tencent.mm.storage.f4> r1 = r1.f123846c
            java.util.Iterator r1 = r1.iterator()
            r14 = r2
        L_0x0537:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05b3
            java.lang.Object r2 = r1.next()
            com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2
            if (r5 == 0) goto L_0x05b1
            int r8 = r2.mo108769t2()
            r9 = 1
            if (r8 == r9) goto L_0x05b1
            boolean r8 = r2.mo100993e4()
            if (r8 == 0) goto L_0x05b1
            boolean r8 = r2.mo100966E3(r5)
            if (r8 == 0) goto L_0x0570
            int r8 = r4.field_atCount
            int r8 = r8 + r9
            r4.field_atCount = r8
            int r8 = r28.mo108818l2()
            int r8 = r8 + r9
            r0.mo108789J2(r8)
            if (r11 == 0) goto L_0x056f
            int r8 = r11.mo108818l2()
            int r8 = r8 + r9
            r11.mo108789J2(r8)
        L_0x056f:
            r14 = 1
        L_0x0570:
            java.lang.String r2 = r2.f230724G
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r8 == 0) goto L_0x057b
            r2 = 0
            r9 = 0
            goto L_0x0597
        L_0x057b:
            java.lang.String r8 = "msgsource"
            r9 = 0
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r8, r9)
            if (r2 != 0) goto L_0x0585
            goto L_0x0596
        L_0x0585:
            java.lang.String r8 = ".msgsource.atall"
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x0595 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0595 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0595 }
            if (r2 <= 0) goto L_0x0596
            r2 = 1
            goto L_0x0597
        L_0x0595:
        L_0x0596:
            r2 = 0
        L_0x0597:
            if (r2 == 0) goto L_0x0537
            r2 = 1
            r4.field_atAll = r2
            int r8 = r28.mo108818l2()
            int r8 = r8 + 4096
            r0.mo108789J2(r8)
            if (r11 == 0) goto L_0x05af
            int r8 = r11.mo108818l2()
            int r8 = r8 + r2
            r11.mo108789J2(r8)
        L_0x05af:
            r14 = 1
            goto L_0x0537
        L_0x05b1:
            r9 = 0
            goto L_0x0537
        L_0x05b3:
            r2 = r14
        L_0x05b4:
            sb0.b r1 = rb0.C48009v0.Dx0()
            r8 = r17
            r10 = r18
            r1.mo73028jo(r4, r8, r10)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 == 0) goto L_0x05cd
            java.lang.String r1 = r3.mo108760m2()
            java.lang.String r6 = r13.mo73035n2(r1)
        L_0x05cd:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r23
            java.lang.String r5 = r13.field_bizChatServId
            r8 = 1
            r1[r8] = r5
            java.lang.String r3 = r3.mo108760m2()
            r5 = 2
            r1[r5] = r3
            r3 = 3
            r1[r3] = r6
            java.lang.String r3 = "updateBizChatConversation brandUserName:%s, bizChatId:%s, userId:%s, displayName:%s"
            r6 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            sb0.b r1 = rb0.C48009v0.Dx0()
            r1.mo73020LL(r4)
            if (r2 == 0) goto L_0x063e
            com.tencent.mm.storage.v3 r1 = r7.f121062a
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r2 = r23
            r1.mo69773k0(r0, r2)
            if (r11 == 0) goto L_0x063e
            com.tencent.mm.storage.v3 r0 = r7.f121062a
            java.lang.String r1 = r11.getUsername()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69773k0(r11, r1)
            goto L_0x063e
        L_0x0609:
            r2 = r6
            r6 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update null BizChatConversation with talker "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 0
            r4.field_status = r0
            r4.field_isSend = r0
            r4.field_content = r5
            java.lang.String r1 = "0"
            r4.field_msgType = r1
            r4.field_unReadCount = r0
            r4.field_digest = r5
            r4.field_digestUser = r5
            sb0.b r0 = rb0.C48009v0.Dx0()
            r0.mo73028jo(r4, r8, r10)
            sb0.b r0 = rb0.C48009v0.Dx0()
            r0.mo73020LL(r4)
        L_0x063e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236sn.C48422e.mo54538a2(com.tencent.mm.storage.f4, com.tencent.mm.storage.h2, boolean, g62.l$e):void");
    }

    /* renamed from: k3 */
    public void mo54539k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        ((C48004s) C86312j.m106911c(C48004s.class)).mo72740wp().getClass();
        if (eVar == null) {
            Log.m105920e("MicroMsg.BizConversationStorage", "compose notifyInfo is null");
            return;
        }
        String str = eVar.f123844a;
        if (z) {
            if (!(f4Var == null || f4Var.mo108769t2() == 1 || (C75569c4.m90673f(f4Var) & 1) == 0)) {
                Log.m105924i("MicroMsg.BizConversationStorage", "create a temp session conversation.");
                h2Var.mo108371j3(4194304);
            }
            if (f4Var != null && C47984k.m53334h(str)) {
                Log.m105924i("MicroMsg.BizConversationStorage", "create a bitChat conversation.");
                h2Var.mo108371j3(8388608);
            }
        } else {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            if (z1Var != null && z1Var.mo62916m3() && !z1Var.mo62927s3() && f4Var != null && f4Var.mo108769t2() != 1 && !h2Var.mo108372k3(4194304) && (h2Var.mo108821o2() < C48009v0.Nx0() || (C75569c4.m90673f(f4Var) & 1) != 0)) {
                h2Var.mo108371j3(4194304);
                Log.m105925i("MicroMsg.BizConversationStorage", "onNotifyChange is old temp session, %s", str);
            }
            if (f4Var != null && C47984k.m53334h(str)) {
                Log.m105925i("MicroMsg.BizConversationStorage", "onNotifyChange a bitChat conversation, %s", str);
                h2Var.mo108371j3(8388608);
            }
        }
        if (!eVar.f123846c.isEmpty() && eVar.f123846c.get(0) != null) {
            h2Var.mo108803Y2(eVar.f123846c.get(0).mo108769t2());
            if (eVar.f123845b.equals("insert")) {
                ArrayList<C72963f4> arrayList = eVar.f123846c;
                h2Var.f212786n1 = arrayList.get(arrayList.size() - 1);
            }
        }
    }
}
