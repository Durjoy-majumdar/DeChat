package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50937qb;
import te3.C51082rb;
import te3.C51218sb;
import te3.C51370tb;

/* renamed from: com.tencent.mm.plugin.exdevice.model.t0 */
public class C41168t0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f110919d = null;

    /* renamed from: e */
    public C11385n f110920e = null;

    /* renamed from: f */
    public String[] f110921f;

    public C41168t0(String[] strArr, String str, int i) {
        if (strArr == null) {
            throw new IllegalArgumentException("null == aMac");
        } else if (strArr.length == 0) {
            Log.m105920e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "0 == aMac.length");
        } else {
            this.f110921f = strArr;
            Log.m105925i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, %s, list = %d", str, Integer.valueOf(strArr.length));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51218sb();
            bVar.f127067b = new C51370tb();
            bVar.f127069d = 542;
            bVar.f127068c = "/cgi-bin/micromsg-bin/batchsearchharddevice";
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f110919d = a;
            C51218sb sbVar = (C51218sb) a.f127055a.f127080a;
            LinkedList<C51082rb> linkedList = new LinkedList<>();
            for (String str2 : strArr) {
                if (str2 != null) {
                    C51082rb rbVar = new C51082rb();
                    rbVar.f140796d = str2;
                    linkedList.add(rbVar);
                    Log.m105925i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, item = %s", str2);
                }
            }
            sbVar.f141411d = linkedList;
            if (!Util.isNullOrNil(str)) {
                C50937qb qbVar = new C50937qb();
                qbVar.f140222d = str;
                sbVar.f141412e = qbVar;
            }
            if (i >= 0) {
                sbVar.f141413f = i;
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110920e = nVar;
        return dispatch(gVar, this.f110919d, this);
    }

    public int getType() {
        return 542;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        r5 = r5.f127056b.f127083a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r20, int r21, int r22, java.lang.String r23, com.tencent.p014mm.network.C114799u r24, byte[] r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            r8 = 1
            r5[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            r9 = 2
            r5[r9] = r6
            r6 = 3
            r5[r6] = r3
            java.lang.String r10 = "MicroMsg.exdevice.NetSceneBatchSearchHardDevice"
            java.lang.String r11 = "onGYNetEnd, netId = %d, errType = %d, errCode = %d, errMsg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r5)
            java.lang.String[] r5 = r0.f110921f
            if (r5 == 0) goto L_0x003c
            int r11 = r5.length
            if (r11 != r8) goto L_0x003c
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r5 = r5[r7]
            r11[r7] = r5
            java.lang.String r5 = "device mac is  = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r11)
        L_0x003c:
            if (r24 != 0) goto L_0x0044
            java.lang.String r1 = "null == rr"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            return
        L_0x0044:
            ob0.c r5 = r0.f110919d
            int r5 = r5.f127058d
            int r11 = r24.getType()
            if (r5 == r11) goto L_0x006a
            java.lang.Object[] r1 = new java.lang.Object[r9]
            ob0.c r2 = r0.f110919d
            int r2 = r2.f127058d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            int r2 = r24.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r8] = r2
            java.lang.String r2 = "mReqResp.getType(%d) != rr.getType(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
            return
        L_0x006a:
            if (r1 != 0) goto L_0x03e1
            if (r2 != 0) goto L_0x03e1
            ob0.c r5 = r0.f110919d
            if (r5 == 0) goto L_0x007b
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            if (r5 == 0) goto L_0x007b
            te3.tb r5 = (te3.C51370tb) r5
            goto L_0x007c
        L_0x007b:
            r5 = 0
        L_0x007c:
            java.util.LinkedList<te3.ub> r5 = r5.f142083d
            java.util.Iterator r5 = r5.iterator()
        L_0x0082:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x03e1
            java.lang.Object r12 = r5.next()
            te3.ub r12 = (te3.C51519ub) r12
            java.lang.Object[] r13 = new java.lang.Object[r4]
            int r14 = r12.f142711d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r7] = r14
            java.lang.String r14 = r12.f142712e
            r13[r8] = r14
            java.lang.String r14 = r12.f142714g
            r13[r9] = r14
            java.lang.String r14 = r12.f142715h
            r13[r6] = r14
            java.lang.String r14 = "BatchSearchHardDeviceResp, ret = %d, bind ticket = %s, mac = %s, device name = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r13)
            te3.jy2 r12 = r12.f142713f
            if (r12 != 0) goto L_0x00b3
            java.lang.String r12 = "null == item.Contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r12)
            goto L_0x0082
        L_0x00b3:
            java.lang.Class<f62.k0> r13 = f62.C75700k0.class
            te3.rv3 r14 = r12.f136424d
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            java.lang.String r15 = r12.f136419Z
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r16 == 0) goto L_0x00e1
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r16 == 0) goto L_0x00e1
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r7] = r14
            r12[r8] = r15
            java.lang.String r13 = "processModContact user is null user:%s enuser:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r13, r12)
        L_0x00d9:
            r8 = r10
            r7 = 0
            r16 = 1
            r18 = 0
            goto L_0x03d5
        L_0x00e1:
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r14
            java.lang.String r6 = "processModContact : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r4)
            k40.a r4 = f40.C86709a0.m107533q(r13)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r4 = r4.get(r14)
            if (r4 == 0) goto L_0x010b
            java.lang.String r6 = r4.mo73978v2()
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x010b
            java.lang.String r4 = "cat's replace user with stranger"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r4)
            goto L_0x00d9
        L_0x010b:
            com.tencent.mm.storage.z1 r6 = new com.tencent.mm.storage.z1
            r6.<init>(r14)
            java.lang.String r11 = r12.f136395J
            r6.mo62857I2(r11)
            int r11 = r12.f136436j
            int r8 = r12.f136441n
            r8 = r8 & r11
            r6.setType(r8)
            long r7 = r12.f136457u1
            r17 = r10
            long r9 = r12.f136459v1
            long r7 = r7 & r9
            r6.mo73961b3(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r7 != 0) goto L_0x0131
            r6.mo62874S2(r15)
            goto L_0x013f
        L_0x0131:
            if (r4 == 0) goto L_0x013f
            long r7 = r4.f108320R1
            int r8 = (int) r7
            if (r8 <= 0) goto L_0x013f
            java.lang.String r7 = r4.mo73978v2()
            r6.mo62874S2(r7)
        L_0x013f:
            if (r4 != 0) goto L_0x0144
            r9 = 0
            goto L_0x0148
        L_0x0144:
            long r9 = r4.f108320R1
            int r10 = (int) r9
            long r9 = (long) r10
        L_0x0148:
            r6.f108320R1 = r9
            te3.rv3 r9 = r12.f136426e
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62878U2(r9)
            te3.rv3 r9 = r12.f136428f
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62882W2(r9)
            te3.rv3 r9 = r12.f136430g
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62884X2(r9)
            int r9 = r12.f136432h
            r6.mo62900f4(r9)
            int r9 = r12.f136452s
            r6.mo62866N3(r9)
            te3.rv3 r9 = r12.f136458v
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62872R2(r9)
            int r9 = r12.f136460w
            r6.mo62861K3(r9)
            int r9 = r12.f136387B
            r6.mo62889Z3(r9)
            java.lang.String r9 = r12.f136405S
            java.lang.String r10 = r12.f136464y
            java.lang.String r11 = r12.f136466z
            java.lang.String r9 = com.tencent.p014mm.storage.RegionCodeDecoder.m124564q(r9, r10, r11)
            r6.mo62893c4(r9)
            java.lang.String r9 = r12.f136386A
            r6.mo62902g4(r9)
            int r9 = r12.f136389D
            r6.mo62894d3(r9)
            java.lang.String r9 = r12.f136390E
            r6.mo62925q4(r9)
            int r9 = r12.f136392G
            r6.mo62912k4(r9)
            int r9 = r12.f136398M
            r6.mo62896e3(r9)
            java.lang.String r9 = r12.f136397L
            r6.mo62899f3(r9)
            java.lang.String r9 = r12.f136393H
            boolean r9 = eb0.C45628s0.m50754S(r9)
            if (r9 == 0) goto L_0x01ba
            java.lang.String r9 = r12.f136393H
            r6.mo62928s4(r9)
        L_0x01ba:
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r10 = (int) r9
            r6.mo62863L3(r10)
            te3.rv3 r9 = r12.f136445p
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62860K2(r9)
            te3.rv3 r9 = r12.f136450r
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62862L2(r9)
            te3.rv3 r9 = r12.f136448q
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            r6.mo62864M2(r9)
            java.lang.String r9 = r12.f136418Y0
            r6.mo62895d4(r9)
            java.lang.String r9 = r12.f136420Z0
            r6.mo62897e4(r9)
            if (r4 == 0) goto L_0x021a
            java.lang.String r9 = r4.f149515T0
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            java.lang.String r10 = r12.f136420Z0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x021a
            xc0.g r9 = xc0.C78795g.m95196e()
            java.lang.String r9 = r9.mo108705b(r14)
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r18 = 0
            r11[r18] = r14
            r16 = 1
            r11[r16] = r9
            java.lang.String r10 = "MicroMsg.RemarkImageStorage"
            java.lang.String r7 = "remove remark image: %s, path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r7, r11)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r9)
            goto L_0x021e
        L_0x021a:
            r16 = 1
            r18 = 0
        L_0x021e:
            k40.a r7 = f40.C86709a0.m107533q(r13)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            r7.mo69718o4(r14)
            java.lang.String r7 = r6.getUsername()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x023f
            java.lang.String r7 = "dkinit dealModContactExtInfo failed invalid contact"
            r8 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
        L_0x023c:
            r7 = 0
            goto L_0x033f
        L_0x023f:
            r8 = r17
            java.lang.String r7 = r6.getUsername()
            java.lang.Class<ln.i> r9 = p196ln.C76708i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ln.i r9 = (p196ln.C76708i) r9
            com.tencent.mm.modelavatar.n r9 = r9.mo106818Bq(r7, r12, r6)
            java.lang.Class<ln.g> r10 = p196ln.C76706g.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ln.g r10 = (p196ln.C76706g) r10
            ln.n r10 = r10.mo106832eg()
            com.tencent.mm.modelavatar.o r10 = (com.tencent.p014mm.modelavatar.C68098o) r10
            r10.mo93608Yt(r9)
            te3.a94 r9 = r12.f136403R
            java.lang.String r10 = r6.getUsername()
            java.lang.String r11 = "@chatroom"
            boolean r10 = r10.endsWith(r11)
            if (r10 != 0) goto L_0x02e5
            if (r9 == 0) goto L_0x02e5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "SnsFlag modcontact "
            r10.append(r11)
            int r11 = r9.f130392d
            r10.append(r11)
            java.lang.String r11 = " "
            r10.append(r11)
            te3.rv3 r11 = r12.f136424d
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "SnsBg modcontact "
            r10.append(r11)
            java.lang.String r11 = r9.f130393e
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "SnsBgId modcontact "
            r10.append(r11)
            long r1 = r9.f130394f
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            int r2 = r9.f130395g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            jr2.n r1 = jr2.C99019x.m128971c()
            if (r1 == 0) goto L_0x02e5
            jr2.n r1 = jr2.C99019x.m128971c()
            java.lang.String r2 = r6.getUsername()
            os2.d0 r1 = (os2.C100399d0) r1
            r1.mo139792uP(r2, r9)
        L_0x02e5:
            java.lang.Class<rn.w> r1 = p227rn.C48054w.class
            java.lang.String r2 = eb0.C75592q0.m90789s()
            if (r2 == 0) goto L_0x023c
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x023c
            di3.d r2 = di3.C86312j.m106911c(r1)
            rn.w r2 = (p227rn.C48054w) r2
            rn.u r2 = r2.get(r7)
            xh.s0 r2 = (p749xh.C53349s0) r2
            r2.field_username = r7
            java.lang.String r7 = r12.f136411V
            r2.field_brandList = r7
            te3.r10 r7 = r12.f136413W
            if (r7 == 0) goto L_0x0321
            int r9 = r7.f140656d
            r2.field_brandFlag = r9
            java.lang.String r9 = r7.f140658f
            r2.field_brandInfo = r9
            java.lang.String r9 = r7.f140659g
            r2.field_brandIconURL = r9
            java.lang.String r7 = r7.f140657e
            r2.field_extInfo = r7
            r7 = 0
            r2.field_attrSyncVersion = r7
            r9 = 0
            r2.field_incrementUpdateTime = r9
            goto L_0x0322
        L_0x0321:
            r7 = 0
        L_0x0322:
            di3.d r9 = di3.C86312j.m106911c(r1)
            rn.w r9 = (p227rn.C48054w) r9
            r10 = r2
            rn.u r10 = (p227rn.C48052u) r10
            boolean r9 = r9.mo72620Nf(r10)
            if (r9 != 0) goto L_0x033a
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.w r1 = (p227rn.C48054w) r1
            r1.mo72621Uu(r10)
        L_0x033a:
            int r1 = r2.field_type
            r6.mo62852D3(r1)
        L_0x033f:
            int r1 = r12.f136416X0
            r6.mo62869P2(r1)
            te3.z3 r1 = r12.f136404R0
            if (r1 == 0) goto L_0x0363
            te3.ao2 r1 = r1.f145664d
            if (r1 == 0) goto L_0x0363
            java.lang.String r1 = r1.f130697e
            r6.mo62881V3(r1)
            te3.z3 r1 = r12.f136404R0
            te3.ao2 r1 = r1.f145664d
            java.lang.String r1 = r1.f130696d
            r6.mo62883W3(r1)
            te3.z3 r1 = r12.f136404R0
            te3.ao2 r1 = r1.f145664d
            java.lang.String r1 = r1.f130698f
            r6.mo62885X3(r1)
        L_0x0363:
            boolean r1 = eb0.C45628s0.m50812z(r14)
            if (r1 == 0) goto L_0x036c
            r6.mo62877T3()
        L_0x036c:
            boolean r1 = r6.mo62916m3()
            if (r1 == 0) goto L_0x0375
            r6.mo62937v4()
        L_0x0375:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r1 != 0) goto L_0x0389
            k40.a r1 = f40.C86709a0.m107533q(r13)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            r1.mo69678Y2(r15, r6)
            goto L_0x0396
        L_0x0389:
            k40.a r1 = f40.C86709a0.m107533q(r13)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            r1.mo69668Q3(r6)
        L_0x0396:
            if (r4 == 0) goto L_0x03d5
            int r1 = r4.getType()
            r1 = r1 & 2048(0x800, float:2.87E-42)
            int r2 = r6.getType()
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r1 == r2) goto L_0x03d5
            int r1 = r6.getType()
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x03c2
            k40.a r1 = f40.C86709a0.m107533q(r13)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            java.lang.String r2 = r6.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69766g0(r2)
            goto L_0x03d5
        L_0x03c2:
            k40.a r1 = f40.C86709a0.m107533q(r13)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            java.lang.String r2 = r6.getUsername()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69772j0(r2)
        L_0x03d5:
            r1 = r21
            r2 = r22
            r10 = r8
            r4 = 4
            r6 = 3
            r7 = 0
            r8 = 1
            r9 = 2
            goto L_0x0082
        L_0x03e1:
            ob0.n r1 = r0.f110920e
            r2 = r21
            r4 = r22
            r1.onSceneEnd(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41168t0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
