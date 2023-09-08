package com.tencent.p014mm.plugin.voip.model;

import te3.pv4;

/* renamed from: com.tencent.mm.plugin.voip.model.r0 */
public class C106391r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ pv4 f317519d;

    /* renamed from: e */
    public final /* synthetic */ C106373o0 f317520e;

    public C106391r0(C106373o0 o0Var, pv4 pv4) {
        this.f317520e = o0Var;
        this.f317519d = pv4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0180, code lost:
        r8 = r8.f184901e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0190, code lost:
        r8 = (r8 = r7.f332095e).f184901e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0198, code lost:
        r8 = r7.f332097g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        r8 = r0.f332091M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = ""
            java.lang.String r3 = "MicroMsg.Voip.VoipSyncHandle"
            java.lang.String r0 = "__onMultiRelayData begin"
            z33.C112597j.m153938c(r3, r0)
            te3.pv4 r0 = r1.f317519d
            te3.qv3 r0 = r0.f184901e
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.mo123703f()
            r4 = 0
            te3.jv4 r5 = new te3.jv4     // Catch:{ IOException -> 0x04ec }
            r5.<init>()     // Catch:{ IOException -> 0x04ec }
            pe3.a r0 = r5.parseFrom(r0)     // Catch:{ IOException -> 0x04ec }
            te3.jv4 r0 = (te3.jv4) r0     // Catch:{ IOException -> 0x04ec }
            te3.pv4 r5 = r0.f332094d
            if (r5 == 0) goto L_0x0033
            te3.qv3 r6 = r5.f184901e
            if (r6 == 0) goto L_0x0033
            pe3.b r6 = r6.f140574f
            if (r6 == 0) goto L_0x0033
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332094d = r5
        L_0x0033:
            te3.pv4 r5 = r0.f332095e
            te3.qv3 r6 = r5.f184901e
            if (r6 == 0) goto L_0x0043
            pe3.b r6 = r6.f140574f
            if (r6 == 0) goto L_0x0043
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332095e = r5
        L_0x0043:
            int r5 = r0.f332096f
            if (r5 == 0) goto L_0x004d
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332096f = r5
        L_0x004d:
            te3.wt4 r5 = r0.f332097g
            if (r5 == 0) goto L_0x005b
            int r6 = r5.f299810d
            if (r6 == 0) goto L_0x005b
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332097g = r5
        L_0x005b:
            te3.wt4 r5 = r0.f332098h
            if (r5 == 0) goto L_0x0069
            int r6 = r5.f299810d
            if (r6 == 0) goto L_0x0069
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332098h = r5
        L_0x0069:
            java.util.LinkedList<te3.kv4> r5 = r0.f332090L
            if (r5 == 0) goto L_0x0083
            int r5 = r5.size()
            if (r5 == 0) goto L_0x0083
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            te3.jv4 r5 = r5.f317445b
            java.util.LinkedList<te3.kv4> r6 = r0.f332090L
            r5.f332090L = r6
            java.util.LinkedList<te3.kv4> r6 = r0.f332090L
            int r6 = r6.size()
            r5.f332089K = r6
        L_0x0083:
            int r5 = r0.f332100j
            if (r5 == 0) goto L_0x008d
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332100j = r5
        L_0x008d:
            int r5 = r0.f332101n
            if (r5 == 0) goto L_0x0097
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332101n = r5
        L_0x0097:
            te3.wt4 r5 = r0.f332105r
            int r6 = r5.f299810d
            if (r6 == 0) goto L_0x00a3
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332105r = r5
        L_0x00a3:
            int r5 = r0.f332106s
            if (r5 <= 0) goto L_0x00ae
            com.tencent.mm.plugin.voip.model.o0 r6 = r1.f317520e
            te3.jv4 r6 = r6.f317445b
            r6.f332106s = r5
            goto L_0x00ba
        L_0x00ae:
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            te3.jv4 r5 = r5.f317445b
            r5.f332106s = r4
            java.lang.String r5 = "zhengxue[LOGIC]:got no ARQstrategy in mrdata"
            z33.C112597j.m153938c(r3, r5)
        L_0x00ba:
            int r5 = r0.f332111x
            r6 = 1
            if (r5 <= 0) goto L_0x00e7
            com.tencent.mm.plugin.voip.model.o0 r7 = r1.f317520e
            te3.jv4 r7 = r7.f317445b
            int r5 = r5 - r6
            r7.f332111x = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "zhengxue[ENCRYPT] got encryptStrategy["
            r5.append(r7)
            com.tencent.mm.plugin.voip.model.o0 r7 = r1.f317520e
            te3.jv4 r7 = r7.f317445b
            int r7 = r7.f332111x
            r5.append(r7)
            java.lang.String r7 = "] from relaydata"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            z33.C112597j.m153938c(r3, r5)
            goto L_0x00f3
        L_0x00e7:
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            te3.jv4 r5 = r5.f317445b
            r5.f332111x = r6
            java.lang.String r5 = "zhengxue[LOGIC]:got no EncryptStrategy in mrdata"
            z33.C112597j.m153938c(r3, r5)
        L_0x00f3:
            int r5 = r0.f332107t
            if (r5 <= 0) goto L_0x013f
            com.tencent.mm.plugin.voip.model.o0 r7 = r1.f317520e
            te3.jv4 r7 = r7.f317445b
            r7.f332107t = r5
            int r5 = r0.f332108u
            r7.f332108u = r5
            int r5 = r0.f332109v
            r7.f332109v = r5
            int r5 = r0.f332110w
            r7.f332110w = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "zhengxue[LOGIC]:got ARQCacheLen: "
            r5.append(r7)
            int r7 = r0.f332107t
            r5.append(r7)
            java.lang.String r7 = ", ARQRttThreshold: "
            r5.append(r7)
            int r7 = r0.f332108u
            r5.append(r7)
            java.lang.String r7 = ", ARQUsedRateThreshold: "
            r5.append(r7)
            int r7 = r0.f332109v
            r5.append(r7)
            java.lang.String r7 = ", ARQRespRateThreshold: "
            r5.append(r7)
            int r7 = r0.f332110w
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            z33.C112597j.m153938c(r3, r5)
            goto L_0x0145
        L_0x013f:
            java.lang.String r5 = "zhengxue[LOGIC]:got no ARQKeyParameters in mrdata"
            z33.C112597j.m153938c(r3, r5)
        L_0x0145:
            int r5 = r0.f332080B
            if (r5 <= 0) goto L_0x0150
            com.tencent.mm.plugin.voip.model.o0 r7 = r1.f317520e
            te3.jv4 r7 = r7.f317445b
            r7.f332080B = r5
            goto L_0x015c
        L_0x0150:
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            te3.jv4 r5 = r5.f317445b
            r5.f332080B = r4
            java.lang.String r5 = "zhengxue[LOGIC]:got no QosStrategy in mrdata"
            z33.C112597j.m153938c(r3, r5)
        L_0x015c:
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            te3.jv4 r7 = r5.f317445b
            int r8 = r0.f332083E
            r7.f332083E = r8
            te3.pk2 r8 = r0.f332085G
            if (r8 == 0) goto L_0x016a
            r7.f332085G = r8
        L_0x016a:
            com.tencent.mm.plugin.voip.model.r r5 = r5.f317444a
            com.tencent.mm.plugin.voip.model.v2protocal r8 = r5.f317500x
            int r12 = r8.f317656n
            if (r12 == 0) goto L_0x04e6
            long r13 = r8.f317665q
            r8 = 0
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x017c
            goto L_0x04e6
        L_0x017c:
            te3.pv4 r8 = r7.f332094d
            if (r8 == 0) goto L_0x01aa
            te3.qv3 r8 = r8.f184901e
            if (r8 == 0) goto L_0x01aa
            pe3.b r8 = r8.f140574f
            if (r8 == 0) goto L_0x01aa
            int r8 = r7.f332096f
            if (r8 == 0) goto L_0x01aa
            te3.pv4 r8 = r7.f332095e
            if (r8 == 0) goto L_0x01aa
            te3.qv3 r8 = r8.f184901e
            if (r8 == 0) goto L_0x01aa
            pe3.b r8 = r8.f140574f
            if (r8 == 0) goto L_0x01aa
            te3.wt4 r8 = r7.f332097g
            if (r8 == 0) goto L_0x01a0
            int r8 = r8.f299810d
            if (r8 != 0) goto L_0x01a8
        L_0x01a0:
            te3.vq3 r8 = r0.f332091M
            if (r8 == 0) goto L_0x01aa
            int r8 = r8.f299682d
            if (r8 <= 0) goto L_0x01aa
        L_0x01a8:
            r8 = 1
            goto L_0x01ab
        L_0x01aa:
            r8 = 0
        L_0x01ab:
            java.lang.String r15 = "__onMultiRelayData end"
            if (r8 != 0) goto L_0x01b3
            z33.C112597j.m153938c(r3, r15)
            return
        L_0x01b3:
            java.lang.String r8 = r0.f332088J
            r7.f332088J = r8
            int r8 = r0.f332087I
            r7.f332087I = r8
            com.tencent.mm.plugin.voip.model.VoipScoreState r9 = r5.f317464O
            java.lang.String r10 = r0.f332088J
            int r11 = r0.f332087I
            r9.mo152533b(r10, r11, r12, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "multiRelayData recv all, update. RedirectReqThreshold = "
            r5.append(r7)
            com.tencent.mm.plugin.voip.model.o0 r7 = r1.f317520e
            te3.jv4 r7 = r7.f317445b
            int r7 = r7.f332083E
            r5.append(r7)
            java.lang.String r7 = " BothSideSwitchFlag = "
            r5.append(r7)
            int r7 = r0.f332084F
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            z33.C112597j.m153938c(r3, r5)
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r7 = r5.f317444a
            te3.jv4 r5 = r5.f317445b
            int r8 = r5.f332096f
            com.tencent.mm.plugin.voip.model.v2protocal r9 = r7.f317500x
            com.tencent.mm.plugin.voip.model.z r10 = r9.f317568G1
            r10.f317778g = r6
            r9.f317686x = r8
            te3.pv4 r5 = r5.f332094d
            te3.qv3 r5 = r5.f184901e
            pe3.b r5 = r5.f140574f
            byte[] r5 = r5.mo123703f()
            r7.mo152698L(r5)
            te3.qv3 r5 = r0.f332103p
            if (r5 == 0) goto L_0x0237
            pe3.b r5 = r5.f140574f
            if (r5 == 0) goto L_0x0237
            te3.qv3 r7 = r0.f332081C
            if (r7 == 0) goto L_0x0237
            pe3.b r7 = r7.f140574f
            if (r7 == 0) goto L_0x0237
            com.tencent.mm.plugin.voip.model.o0 r7 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r7 = r7.f317444a
            byte[] r5 = r5.mo123703f()
            int r8 = r0.f332102o
            com.tencent.mm.plugin.voip.model.o0 r9 = r1.f317520e
            te3.jv4 r9 = r9.f317445b
            int r9 = r9.f332111x
            te3.qv3 r10 = r0.f332081C
            pe3.b r10 = r10.f140574f
            byte[] r10 = r10.mo123703f()
            com.tencent.mm.plugin.voip.model.v2protocal r7 = r7.f317500x
            r7.f317680v = r8
            r7.f317683w = r5
            r7.f317619a1 = r9
            r7.f317622b1 = r10
        L_0x0237:
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            int r5 = r5.mo152615n()
            if (r5 == 0) goto L_0x0254
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r7 = r5.f317444a
            te3.jv4 r5 = r5.f317445b
            te3.pv4 r5 = r5.f332095e
            te3.qv3 r5 = r5.f184901e
            pe3.b r5 = r5.f140574f
            byte[] r5 = r5.mo123703f()
            r7.mo152697K(r5)
        L_0x0254:
            te3.vq3 r5 = r0.f332091M
            r7 = 2
            r8 = 4
            if (r5 == 0) goto L_0x025e
            int r5 = r5.f299682d
            if (r5 != 0) goto L_0x0296
        L_0x025e:
            te3.uq3 r5 = new te3.uq3
            r5.<init>()
            r5.f299626d = r4
            r5.f299627e = r2
            r5.f299628f = r2
            com.tencent.mm.plugin.voip.model.o0 r9 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r9 = r9.f317444a
            com.tencent.mm.plugin.voip.model.v2protocal r9 = r9.f317500x
            int r9 = r9.f317629e
            r5.f299629g = r9
            r5.f299630h = r8
            r5.f299631i = r7
            te3.wt4 r9 = r0.f332097g
            r5.f299632j = r9
            te3.wt4 r9 = r0.f332105r
            r5.f299633n = r9
            te3.vq3 r9 = new te3.vq3
            r9.<init>()
            r0.f332091M = r9
            r9.f299682d = r6
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r9.f299683e = r10
            te3.vq3 r9 = r0.f332091M
            java.util.LinkedList<te3.uq3> r9 = r9.f299683e
            r9.add(r5)
        L_0x0296:
            te3.c50 r5 = r0.f332092N
            if (r5 == 0) goto L_0x029e
            int r5 = r5.f297999d
            if (r5 != 0) goto L_0x02da
        L_0x029e:
            te3.b50 r5 = new te3.b50
            r5.<init>()
            r5.f331878d = r6
            r5.f331879e = r2
            r5.f331880f = r2
            com.tencent.mm.plugin.voip.model.o0 r2 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317444a
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            int r2 = r2.f317629e
            r5.f331881g = r2
            r5.f331882h = r8
            r5.f331883i = r7
            te3.wt4 r2 = r0.f332098h
            r5.f331884j = r2
            int r2 = r0.f332089K
            r5.f331885n = r2
            java.util.LinkedList<te3.kv4> r2 = r0.f332090L
            r5.f331886o = r2
            te3.c50 r2 = new te3.c50
            r2.<init>()
            r0.f332092N = r2
            r2.f297999d = r6
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            r2.f298000e = r9
            te3.c50 r2 = r0.f332092N
            java.util.LinkedList<te3.b50> r2 = r2.f298000e
            r2.add(r5)
        L_0x02da:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "relay conn cnt: "
            r2.append(r5)
            te3.vq3 r5 = r0.f332091M
            int r5 = r5.f299682d
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r3, r2)
            com.tencent.mm.plugin.voip.model.o0 r2 = r1.f317520e     // Catch:{ Exception -> 0x0301 }
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317444a     // Catch:{ Exception -> 0x0301 }
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x     // Catch:{ Exception -> 0x0301 }
            te3.vq3 r5 = r0.f332091M     // Catch:{ Exception -> 0x0301 }
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x0301 }
            r2.f317664p1 = r5     // Catch:{ Exception -> 0x0301 }
            goto L_0x0306
        L_0x0301:
            java.lang.String r2 = "relay conn info to byte array fail.."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0306:
            com.tencent.mm.plugin.voip.model.o0 r2 = r1.f317520e     // Catch:{ Exception -> 0x0315 }
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317444a     // Catch:{ Exception -> 0x0315 }
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x     // Catch:{ Exception -> 0x0315 }
            te3.c50 r5 = r0.f332092N     // Catch:{ Exception -> 0x0315 }
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x0315 }
            r2.f317667q1 = r5     // Catch:{ Exception -> 0x0315 }
            goto L_0x031a
        L_0x0315:
            java.lang.String r2 = "direct conn info to byte array fail.."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x031a:
            te3.i42 r2 = r0.f332093P     // Catch:{ Exception -> 0x032d }
            int r5 = r2.f135102d     // Catch:{ Exception -> 0x032d }
            if (r5 <= 0) goto L_0x0332
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e     // Catch:{ Exception -> 0x032d }
            com.tencent.mm.plugin.voip.model.r r5 = r5.f317444a     // Catch:{ Exception -> 0x032d }
            com.tencent.mm.plugin.voip.model.v2protocal r5 = r5.f317500x     // Catch:{ Exception -> 0x032d }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x032d }
            r5.f317670r1 = r2     // Catch:{ Exception -> 0x032d }
            goto L_0x0332
        L_0x032d:
            java.lang.String r2 = "nic query info to byte array fail.."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0332:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "onMultiRelayData natsvr ="
            r2.append(r5)
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            te3.jv4 r5 = r5.f317445b
            int r5 = r5.f332089K
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r3, r2)
            com.tencent.mm.plugin.voip.model.o0 r2 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r5 = r2.f317444a
            te3.jv4 r2 = r2.f317445b
            int r9 = r2.f332106s
            int r10 = r2.f332107t
            int r11 = r2.f332108u
            int r12 = r2.f332109v
            int r13 = r2.f332110w
            com.tencent.mm.plugin.voip.model.v2protocal r5 = r5.f317500x
            r5.f317597Q0 = r9
            r5.f317600R0 = r10
            r5.f317602S0 = r11
            r5.f317604T0 = r12
            r5.f317606U0 = r13
            int r9 = r2.f332080B
            r5.f317608V0 = r9
            int r9 = r2.f332100j
            int r10 = r2.f332101n
            r5.f317689y = r9
            r5.f317692z = r10
            int r2 = r2.f332083E
            r5.f317625c1 = r2
            int r2 = r0.f332084F
            r5.f317628d1 = r2
            te3.qv3 r2 = r0.f332086H
            if (r2 == 0) goto L_0x038a
            pe3.b r2 = r2.f140574f
            if (r2 == 0) goto L_0x038a
            byte[] r2 = r2.mo123703f()
            r5.f317557D = r2
        L_0x038a:
            te3.qv3 r2 = r0.f332113z
            if (r2 == 0) goto L_0x03b4
            pe3.b r2 = r2.f140574f
            if (r2 == 0) goto L_0x03b4
            te3.qv3 r5 = r0.f332079A
            if (r5 == 0) goto L_0x03b4
            pe3.b r5 = r5.f140574f
            if (r5 == 0) goto L_0x03b4
            com.tencent.mm.plugin.voip.model.o0 r5 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r5 = r5.f317444a
            int r9 = r0.f332112y
            byte[] r2 = r2.mo123703f()
            te3.qv3 r0 = r0.f332079A
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.mo123703f()
            com.tencent.mm.plugin.voip.model.v2protocal r5 = r5.f317500x
            r5.f317640h1 = r9
            r5.f317643i1 = r2
            r5.f317646j1 = r0
        L_0x03b4:
            com.tencent.mm.plugin.voip.model.o0 r0 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r2 = r0.f317444a
            te3.jv4 r0 = r0.f317445b
            te3.pk2 r0 = r0.f332085G
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            r2.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "v2protocal updateJbmBitrateRsSvrParam BitrateFlag : "
            r5.append(r9)
            int r9 = r0.f332223e
            r5.append(r9)
            java.lang.String r9 = " Bitrate: "
            r5.append(r9)
            int r9 = r0.f332224f
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = "MicroMsg.Voip"
            z33.C112597j.m153936a(r9, r5)
            r5 = 27
            r2.field_jbmParamArraySize = r5
            int[] r5 = new int[r5]
            r2.field_jbmBitratRsSvrParamArray = r5
            int r9 = r0.f332222d
            r5[r4] = r9
            int r9 = r0.f332223e
            r5[r6] = r9
            int r9 = r0.f332224f
            r5[r7] = r9
            int r9 = r0.f332225g
            r10 = 3
            r5[r10] = r9
            int r9 = r0.f332226h
            r5[r8] = r9
            int r9 = r0.f332227i
            r11 = 5
            r5[r11] = r9
            int r9 = r0.f332228j
            r12 = 6
            r5[r12] = r9
            int r9 = r0.f332231p
            r13 = 7
            r5[r13] = r9
            int r9 = r0.f332233q
            r14 = 8
            r5[r14] = r9
            int r9 = r0.f332236t
            r16 = 9
            r5[r16] = r9
            int r9 = r0.f332237u
            r17 = 10
            r5[r17] = r9
            int r9 = r0.f332240x
            r18 = 11
            r5[r18] = r9
            int r9 = r0.f332242y
            r19 = 12
            r5[r19] = r9
            int r9 = r0.f332198B
            r20 = 13
            r5[r20] = r9
            int r9 = r0.f332199C
            r21 = 14
            r5[r21] = r9
            int r9 = r0.f332202F
            r22 = 15
            r5[r22] = r9
            int r9 = r0.f332203G
            r23 = 16
            r5[r23] = r9
            int r9 = r0.f332206J
            r24 = 17
            r5[r24] = r9
            int r9 = r0.f332207K
            r25 = 18
            r5[r25] = r9
            int r9 = r0.f332210N
            r26 = 19
            r5[r26] = r9
            int r9 = r0.f332211P
            r14 = 20
            r5[r14] = r9
            int r9 = r0.f332214S
            r27 = 21
            r5[r27] = r9
            int r9 = r0.f332215T
            r27 = 22
            r5[r27] = r9
            int r9 = r0.f332218W
            r27 = 23
            r5[r27] = r9
            int r9 = r0.f332219X
            r27 = 24
            r5[r27] = r9
            int r9 = r0.f332232p0
            r27 = 25
            r5[r27] = r9
            int r9 = r0.f332241x0
            r27 = 26
            r5[r27] = r9
            r2.field_jbmParamDoubleArraySize = r14
            double[] r5 = new double[r14]
            r2.field_jbmBitratRsSvrParamDoubleArray = r5
            double r13 = r0.f332229n
            r5[r4] = r13
            double r13 = r0.f332230o
            r5[r6] = r13
            double r13 = r0.f332234r
            r5[r7] = r13
            double r6 = r0.f332235s
            r5[r10] = r6
            double r6 = r0.f332238v
            r5[r8] = r6
            double r6 = r0.f332239w
            r5[r11] = r6
            double r6 = r0.f332243z
            r5[r12] = r6
            double r6 = r0.f332197A
            r2 = 7
            r5[r2] = r6
            double r6 = r0.f332200D
            r2 = 8
            r5[r2] = r6
            double r6 = r0.f332201E
            r5[r16] = r6
            double r6 = r0.f332204H
            r5[r17] = r6
            double r6 = r0.f332205I
            r5[r18] = r6
            double r6 = r0.f332208L
            r5[r19] = r6
            double r6 = r0.f332209M
            r5[r20] = r6
            double r6 = r0.f332212Q
            r5[r21] = r6
            double r6 = r0.f332213R
            r5[r22] = r6
            double r6 = r0.f332216U
            r5[r23] = r6
            double r6 = r0.f332217V
            r5[r24] = r6
            double r6 = r0.f332220Y
            r5[r25] = r6
            double r6 = r0.f332221Z
            r5[r26] = r6
            com.tencent.mm.plugin.voip.model.o0 r0 = r1.f317520e
            com.tencent.mm.plugin.voip.model.r r0 = r0.f317444a
            r0.mo152694H()
            z33.C112597j.m153938c(r3, r15)
            return
        L_0x04e6:
            java.lang.String r0 = "not in valid room, __onMultiRelayData end"
            z33.C112597j.m153938c(r3, r0)
            return
        L_0x04ec:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106391r0.run():void");
    }
}
