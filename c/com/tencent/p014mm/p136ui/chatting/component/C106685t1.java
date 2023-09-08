package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.storage.C72963f4;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.component.t1 */
public final class C106685t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106673s1 f318936d;

    /* renamed from: e */
    public final /* synthetic */ boolean f318937e;

    /* renamed from: f */
    public final /* synthetic */ List<C72963f4> f318938f;

    public C106685t1(C106673s1 s1Var, boolean z, List<? extends C72963f4> list) {
        this.f318936d = s1Var;
        this.f318937e = z;
        this.f318938f = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0326, code lost:
        if ((r6.f318854R != null && (r6.f318861f > 0 || r6.f318853Q)) == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0368, code lost:
        if ((r6.f318854R != null && (r6.f318861f > 0 || r6.f318853Q)) != false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0470, code lost:
        if ((r4.f318854R != null && (r4.f318861f > 0 || r4.f318853Q)) != false) goto L_0x045d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x050c A[Catch:{ Exception -> 0x0598 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x051d A[Catch:{ Exception -> 0x0598 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0533 A[Catch:{ Exception -> 0x0598 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0552 A[Catch:{ Exception -> 0x0598 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0608 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x054f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0264  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            com.tencent.mm.ui.chatting.component.s1 r0 = r1.f318936d
            ck3.b r0 = r0.f215752d
            r0.mo91558S()
            boolean r0 = r1.f318937e
            r2 = 0
            if (r0 != 0) goto L_0x0028
            java.util.List<com.tencent.mm.storage.f4> r0 = r1.f318938f
            com.tencent.mm.ui.chatting.component.s1 r3 = r1.f318936d
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r0.next()
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            uk.f r5 = r3.f318912j
            r5.mo162925a(r4)
            goto L_0x0016
        L_0x0028:
            java.util.List<com.tencent.mm.storage.f4> r0 = r1.f318938f
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x0036
            r3 = r2
            goto L_0x005f
        L_0x0036:
            java.lang.Object r3 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x0041
            goto L_0x005f
        L_0x0041:
            r4 = r3
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            long r4 = r4.getMsgId()
        L_0x0048:
            java.lang.Object r6 = r0.next()
            r7 = r6
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            long r7 = r7.getMsgId()
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0059
            r3 = r6
            r4 = r7
        L_0x0059:
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L_0x0609
        L_0x005f:
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            if (r3 == 0) goto L_0x006a
            com.tencent.mm.ui.chatting.component.s1 r0 = r1.f318936d
            uk.f r0 = r0.f318912j
            r0.mo162925a(r3)
        L_0x006a:
            com.tencent.mm.ui.chatting.component.s1 r0 = r1.f318936d
            uk.f r3 = r0.f318912j
            uk.a r0 = r0.f318922w
            r3.mo162929e(r0)
            com.tencent.mm.ui.chatting.component.s1 r0 = r1.f318936d
            com.tencent.mm.ui.chatting.j3 r3 = r0.f318911i
            dm3.b r0 = r0.mo153629Y5()
            dm3.b r4 = r3.f318952c
            if (r4 == r0) goto L_0x008b
            if (r4 == 0) goto L_0x0083
            r4.f251059e = r2
        L_0x0083:
            r3.f318952c = r0
            if (r0 == 0) goto L_0x008b
            dm3.a r3 = r3.f318959j
            r0.f251059e = r3
        L_0x008b:
            com.tencent.mm.ui.chatting.component.s1 r0 = r1.f318936d
            ck3.b r0 = r0.f215752d
            java.lang.Class<ak3.f> r3 = ak3.C67067f.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            ak3.f r0 = (ak3.C67067f) r0
            int r0 = r0.mo91066C1()
            com.tencent.mm.ui.chatting.component.s1 r3 = r1.f318936d
            java.lang.String r3 = r3.f318907e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "dealWithEgg: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.ui.chatting.component.s1 r3 = r1.f318936d
            com.tencent.mm.ui.chatting.j3 r10 = r3.f318911i
            ck3.b r3 = r3.f215752d
            android.app.Activity r3 = r3.mo91565f()
            java.util.List<com.tencent.mm.storage.f4> r4 = r1.f318938f
            com.tencent.mm.ui.chatting.component.s1 r5 = r1.f318936d
            fy3.l<com.tencent.mm.storage.f4, java.lang.Boolean> r5 = r5.f318915p
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ce:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00eb
            java.lang.Object r7 = r4.next()
            r8 = r5
            com.tencent.mm.ui.chatting.component.s1$c r8 = (com.tencent.p014mm.p136ui.chatting.component.C106673s1.C106676c) r8
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00ce
            r6.add(r7)
            goto L_0x00ce
        L_0x00eb:
            r10.f318950a = r3
            int r4 = r10.f318958i
            r11 = 0
            if (r4 == r0) goto L_0x00fb
            r10.f318958i = r0
            com.tencent.mm.ui.chatting.ChattingAnimFrame r4 = r10.f318951b
            if (r4 == 0) goto L_0x00fb
            r4.setPadding(r11, r0, r11, r11)
        L_0x00fb:
            java.util.Iterator r12 = r6.iterator()
        L_0x00ff:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0608
            java.lang.Object r0 = r12.next()
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
            uk.g$a r4 = p1048uk.C102051g.f300534a
            java.lang.String r4 = r4.mo141551b(r0)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0118
            goto L_0x00ff
        L_0x0118:
            int r5 = r0.mo108769t2()
            r13 = 1
            if (r5 != r13) goto L_0x0121
            r14 = 1
            goto L_0x0122
        L_0x0121:
            r14 = 0
        L_0x0122:
            java.lang.String r5 = r0.mo108768t()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            long r8 = r0.getMsgId()
            java.lang.Class<zp.b> r0 = p777zp.C112645b.class
            java.lang.Class<z51.g> r6 = z51.C39315g.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            z51.g r6 = (z51.C39315g) r6
            zc3.a r6 = r6.mo58035cm()
            i61.h r6 = (i61.C98602h) r6
            uc0.g r6 = r6.mo137997E()
            if (r6 != 0) goto L_0x014f
            java.lang.String r0 = "MicroMsg.EggMgr"
            java.lang.String r4 = "eggList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
            r20 = r12
            goto L_0x0440
        L_0x014f:
            uc0.g r7 = r10.f318960k
            if (r7 != r6) goto L_0x0157
            qk.e r7 = r10.f318961l
            if (r7 != 0) goto L_0x01d9
        L_0x0157:
            qk.e r7 = new qk.e
            r7.<init>()
            r10.f318961l = r7
            qk.b r15 = r7.f296341a
            android.util.SparseArray<com.tencent.mm.smiley.z> r15 = r15.f283932b
            r15.clear()
            java.util.LinkedList<uc0.e> r15 = r6.f260401d
            java.lang.String r13 = "eggList.eggList"
            gy3.C87412m.m108593f(r15, r13)
            java.util.Iterator r13 = r15.iterator()
            r15 = 0
        L_0x0171:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x01d9
            java.lang.Object r17 = r13.next()
            int r18 = r15 + 1
            if (r15 < 0) goto L_0x01d4
            r2 = r17
            uc0.e r2 = (uc0.C111153e) r2
            java.util.LinkedList<uc0.f> r11 = r2.f332877d
            java.lang.String r1 = "info.keyWords"
            gy3.C87412m.m108593f(r11, r1)
            java.util.Iterator r1 = r11.iterator()
        L_0x018e:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x01cd
            java.lang.Object r11 = r1.next()
            uc0.f r11 = (uc0.C65319f) r11
            r19 = r1
            java.lang.String r1 = r11.f187992d
            if (r1 == 0) goto L_0x01a9
            int r1 = r1.length()
            if (r1 != 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r1 = 0
            goto L_0x01aa
        L_0x01a9:
            r1 = 1
        L_0x01aa:
            if (r1 != 0) goto L_0x01ca
            qk.b r1 = r7.f296341a
            r20 = r7
            qk.a r7 = new qk.a
            r7.<init>(r2, r15, r11)
            r1.getClass()
            com.tencent.mm.smiley.a r11 = new com.tencent.mm.smiley.a
            r11.<init>(r1)
            r21 = r2
            r2 = 0
            r1.mo135512a(r7, r2, r11)
            r1 = r19
            r7 = r20
            r2 = r21
            goto L_0x018e
        L_0x01ca:
            r1 = r19
            goto L_0x018e
        L_0x01cd:
            r1 = r24
            r15 = r18
            r2 = 0
            r11 = 0
            goto L_0x0171
        L_0x01d4:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x01d9:
            r10.f318960k = r6
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r2 = (int) r1
            java.lang.String r1 = "MicroMsg.EggMgr"
            java.lang.String r7 = "curSecond is %d, getEggList.size is %d"
            r11 = 2
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r17 = 0
            r13[r17] = r15
            java.util.LinkedList<uc0.e> r6 = r6.f260401d
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15 = 1
            r13[r15] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r13)
            qk.e r1 = r10.f318961l
            java.lang.String r4 = r4.toLowerCase()
            r1.getClass()
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            qk.d r7 = new qk.d
            r7.<init>(r6)
            com.tencent.mm.smiley.l r13 = new com.tencent.mm.smiley.l
            qk.b r1 = r1.f296341a
            r13.<init>(r1)
            r1 = -1
            r15 = 0
            r13.mo135537a(r4, r15, r1, r7)
            java.util.Iterator r4 = r6.iterator()
        L_0x0222:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02ae
            java.lang.Object r7 = r4.next()
            qk.c r7 = (p1085qk.C110442c) r7
            uc0.e r7 = r7.f330280a
            java.lang.String r13 = r7.f332883j
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r15 == 0) goto L_0x023b
            r20 = r12
            goto L_0x0253
        L_0x023b:
            java.lang.String r15 = ","
            java.lang.String[] r13 = r13.split(r15)
            int r15 = r13.length
            r1 = 0
        L_0x0243:
            if (r1 >= r15) goto L_0x025b
            r11 = r13[r1]
            r20 = r12
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0255
        L_0x0253:
            r1 = 1
            goto L_0x025e
        L_0x0255:
            int r1 = r1 + 1
            r12 = r20
            r11 = 2
            goto L_0x0243
        L_0x025b:
            r20 = r12
            r1 = 0
        L_0x025e:
            if (r1 != 0) goto L_0x0264
            r4.remove()
            goto L_0x02a8
        L_0x0264:
            int r1 = r7.f332881h
            if (r1 > r2) goto L_0x026c
            int r11 = r7.f332882i
            if (r2 <= r11) goto L_0x0273
        L_0x026c:
            int r11 = r7.f332882i
            if (r1 != r11) goto L_0x028b
            if (r1 == 0) goto L_0x0273
            goto L_0x028b
        L_0x0273:
            uc0.r r1 = r7.f332885o
            if (r1 == 0) goto L_0x02a8
            u51.a r7 = u51.C37341a.f98737a
            java.lang.String r1 = r1.f332898d
            if (r1 != 0) goto L_0x027f
            r1 = 0
            goto L_0x0285
        L_0x027f:
            java.util.LinkedList<java.lang.String> r7 = u51.C37341a.f98738b
            boolean r1 = r7.contains(r1)
        L_0x0285:
            if (r1 == 0) goto L_0x02a8
            r4.remove()
            goto L_0x02a8
        L_0x028b:
            uc0.r r1 = r7.f332885o
            if (r1 == 0) goto L_0x02a5
            u51.a r7 = u51.C37341a.f98737a
            java.lang.String r1 = r1.f332898d
            if (r1 != 0) goto L_0x0296
            goto L_0x02a5
        L_0x0296:
            java.util.LinkedList<java.lang.String> r11 = u51.C37341a.f98738b
            monitor-enter(r11)
            r11.remove(r1)     // Catch:{ all -> 0x02a1 }
            monitor-exit(r11)
            r7.mo61045a()
            goto L_0x02a5
        L_0x02a1:
            r0 = move-exception
            r1 = r0
            monitor-exit(r11)
            throw r1
        L_0x02a5:
            r4.remove()
        L_0x02a8:
            r12 = r20
            r1 = -1
            r11 = 2
            goto L_0x0222
        L_0x02ae:
            r20 = r12
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x02b8
            goto L_0x0440
        L_0x02b8:
            r1 = 0
            java.lang.Object r4 = r6.get(r1)
            qk.c r4 = (p1085qk.C110442c) r4
            uc0.e r4 = r4.f330280a
            java.lang.Object r7 = r6.get(r1)
            qk.c r7 = (p1085qk.C110442c) r7
            uc0.f r1 = r7.f330281b
            java.lang.String r1 = r1.f187992d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r11 = r4
        L_0x02d5:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0307
            java.lang.Object r4 = r6.next()
            qk.c r4 = (p1085qk.C110442c) r4
            uc0.e r12 = r4.f330280a
            boolean r12 = com.tencent.p014mm.p136ui.chatting.C106691j3.m144079d(r12)
            if (r12 != 0) goto L_0x02ef
            boolean r12 = com.tencent.p014mm.p136ui.chatting.C106691j3.m144079d(r11)
            if (r12 != 0) goto L_0x02fa
        L_0x02ef:
            uc0.e r1 = r4.f330280a
            uc0.f r11 = r4.f330281b
            java.lang.String r11 = r11.f187992d
            r23 = r11
            r11 = r1
            r1 = r23
        L_0x02fa:
            uc0.f r4 = r4.f330281b
            java.lang.String r4 = r4.f187992d
            r7.append(r4)
            java.lang.String r4 = "#"
            r7.append(r4)
            goto L_0x02d5
        L_0x0307:
            uc0.e r4 = r10.f318962m
            if (r4 != 0) goto L_0x030c
            goto L_0x0328
        L_0x030c:
            int r6 = r4.f332887q
            if (r6 > 0) goto L_0x0311
            goto L_0x0328
        L_0x0311:
            boolean r6 = r10.f318967r
            if (r6 != 0) goto L_0x032a
            com.tencent.mm.ui.chatting.ChattingAnimFrame r6 = r10.f318951b
            uc0.e r12 = r6.f318854R
            if (r12 == 0) goto L_0x0325
            int r12 = r6.f318861f
            if (r12 > 0) goto L_0x0323
            boolean r6 = r6.f318853Q
            if (r6 == 0) goto L_0x0325
        L_0x0323:
            r6 = 1
            goto L_0x0326
        L_0x0325:
            r6 = 0
        L_0x0326:
            if (r6 != 0) goto L_0x032a
        L_0x0328:
            r6 = 1
            goto L_0x032b
        L_0x032a:
            r6 = 0
        L_0x032b:
            if (r6 != 0) goto L_0x0343
            boolean r6 = r10.f318967r
            if (r6 == 0) goto L_0x0337
            boolean r4 = com.tencent.p014mm.p136ui.chatting.C106691j3.m144080e(r4, r11)
            if (r4 != 0) goto L_0x0343
        L_0x0337:
            p51.g r0 = p51.C110184g.f329618a
            java.lang.String r1 = r7.toString()
            r2 = 1
            r0.mo161587a(r2, r1)
            goto L_0x0440
        L_0x0343:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x03e1
            uc0.e r4 = r10.f318962m
            if (r4 != 0) goto L_0x034f
        L_0x034d:
            r6 = 0
            goto L_0x036b
        L_0x034f:
            boolean r6 = r10.f318967r
            if (r6 == 0) goto L_0x0355
        L_0x0353:
            r6 = 1
            goto L_0x036b
        L_0x0355:
            com.tencent.mm.ui.chatting.ChattingAnimFrame r6 = r10.f318951b
            if (r6 == 0) goto L_0x034d
            uc0.e r12 = r6.f318854R
            if (r12 == 0) goto L_0x0367
            int r12 = r6.f318861f
            if (r12 > 0) goto L_0x0365
            boolean r6 = r6.f318853Q
            if (r6 == 0) goto L_0x0367
        L_0x0365:
            r6 = 1
            goto L_0x0368
        L_0x0367:
            r6 = 0
        L_0x0368:
            if (r6 == 0) goto L_0x034d
            goto L_0x0353
        L_0x036b:
            if (r6 == 0) goto L_0x038d
            int r6 = r11.f332890t
            r12 = 1
            if (r6 != r12) goto L_0x038d
            boolean r4 = com.tencent.p014mm.p136ui.chatting.C106691j3.m144080e(r4, r11)
            if (r4 == 0) goto L_0x038d
            java.lang.String r4 = "MicroMsg.EggMgr"
            java.lang.String r6 = "continue easter egg %s"
            java.lang.Object[] r7 = new java.lang.Object[r12]
            java.lang.String r12 = r10.f318963n
            r13 = 0
            r7[r13] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r7)
            p51.g r4 = p51.C110184g.f329618a
            r6 = 5
            r4.mo161587a(r6, r1)
            goto L_0x03e1
        L_0x038d:
            p51.g r4 = p51.C110184g.f329618a
            boolean r6 = r10.f318953d
            java.lang.String r12 = r10.f318954e
            int r13 = r11.f332890t
            java.lang.String r15 = "name"
            gy3.C87412m.m108594g(r12, r15)
            java.lang.String r15 = "keyWord"
            gy3.C87412m.m108594g(r1, r15)
            r15 = 2
            java.lang.Integer r21 = java.lang.Integer.valueOf(r15)
            r15 = 1
            java.lang.Integer r22 = java.lang.Integer.valueOf(r15)
            if (r14 == 0) goto L_0x03ae
            r15 = r22
            goto L_0x03b0
        L_0x03ae:
            r15 = r21
        L_0x03b0:
            p51.C110184g.f329619b = r15
            java.lang.String r15 = ""
            if (r6 == 0) goto L_0x03bd
            p51.C110184g.f329621d = r12
            p51.C110184g.f329620c = r15
            p51.C110184g.f329623f = r21
            goto L_0x03c3
        L_0x03bd:
            p51.C110184g.f329620c = r12
            p51.C110184g.f329621d = r15
            p51.C110184g.f329623f = r22
        L_0x03c3:
            p51.C110184g.f329625h = r1
            long r21 = eb0.C31543z5.m39451a()
            java.lang.Long r6 = java.lang.Long.valueOf(r21)
            p51.C110184g.f329622e = r6
            r6 = 1
            if (r13 != r6) goto L_0x03d5
            r16 = 2
            goto L_0x03d7
        L_0x03d5:
            r16 = 1
        L_0x03d7:
            p51.C110184g.f329626i = r16
            java.lang.String r7 = r7.toString()
            r4.mo161587a(r6, r7)
            goto L_0x03e2
        L_0x03e1:
            r6 = 1
        L_0x03e2:
            java.lang.String r4 = "MicroMsg.EggMgr"
            java.lang.String r7 = "egg session id %s"
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Long r13 = p51.C110184g.f329622e
            r15 = 0
            r12[r15] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r12)
            boolean r4 = com.tencent.p014mm.p136ui.chatting.C106691j3.m144079d(r11)
            if (r4 == 0) goto L_0x0406
            r4 = 1263(0x4ef, float:1.77E-42)
            if (r14 == 0) goto L_0x0400
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7.mo175911u(r4, r6)
            goto L_0x0406
        L_0x0400:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 2
            r6.mo175911u(r4, r7)
        L_0x0406:
            if (r11 == 0) goto L_0x05f1
            com.tencent.mm.ui.chatting.ChattingAnimFrame r4 = r10.f318951b
            if (r4 != 0) goto L_0x0435
            r4 = 2131316298(0x7f094e4a, float:1.8251074E38)
            android.view.View r4 = r3.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x041a
            r4.inflate()
        L_0x041a:
            r4 = 2131299073(0x7f090b01, float:1.8216137E38)
            android.view.View r4 = r3.findViewById(r4)
            com.tencent.mm.ui.chatting.ChattingAnimFrame r4 = (com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame) r4
            r10.f318951b = r4
            int r6 = r10.f318958i
            r7 = 0
            r4.setPadding(r7, r6, r7, r7)
            com.tencent.mm.ui.chatting.ChattingAnimFrame r4 = r10.f318951b
            com.tencent.mm.ui.chatting.k3 r6 = new com.tencent.mm.ui.chatting.k3
            r6.<init>(r10, r3, r5)
            r4.setOnLuckyBagClick(r6)
        L_0x0435:
            com.tencent.mm.ui.chatting.ChattingAnimFrame r4 = r10.f318951b
            if (r4 != 0) goto L_0x0444
            java.lang.String r0 = "MicroMsg.EggMgr"
            java.lang.String r1 = "AnimFrameView should not be null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0440:
            r1 = 0
            r6 = 0
            goto L_0x05fc
        L_0x0444:
            int r5 = r11.f332881h
            r12 = 3
            if (r5 > r2) goto L_0x044d
            int r6 = r11.f332882i
            if (r2 <= r6) goto L_0x0453
        L_0x044d:
            int r2 = r11.f332882i
            if (r5 != r2) goto L_0x05d0
            if (r5 != 0) goto L_0x05d0
        L_0x0453:
            uc0.e r2 = r10.f318962m
            if (r2 != 0) goto L_0x0459
        L_0x0457:
            r4 = 0
            goto L_0x0473
        L_0x0459:
            boolean r5 = r10.f318967r
            if (r5 == 0) goto L_0x045f
        L_0x045d:
            r4 = 1
            goto L_0x0473
        L_0x045f:
            if (r4 == 0) goto L_0x0457
            uc0.e r5 = r4.f318854R
            if (r5 == 0) goto L_0x046f
            int r5 = r4.f318861f
            if (r5 > 0) goto L_0x046d
            boolean r4 = r4.f318853Q
            if (r4 == 0) goto L_0x046f
        L_0x046d:
            r4 = 1
            goto L_0x0470
        L_0x046f:
            r4 = 0
        L_0x0470:
            if (r4 == 0) goto L_0x0457
            goto L_0x045d
        L_0x0473:
            if (r4 == 0) goto L_0x047d
            boolean r2 = com.tencent.p014mm.p136ui.chatting.C106691j3.m144080e(r2, r11)
            if (r2 == 0) goto L_0x047d
            r2 = 1
            goto L_0x047e
        L_0x047d:
            r2 = 0
        L_0x047e:
            r10.f318962m = r11
            if (r2 != 0) goto L_0x0486
            r10.f318963n = r1
            r10.f318964o = r8
        L_0x0486:
            uc0.d r4 = r11.f332888r
            if (r4 == 0) goto L_0x0495
            java.lang.String r4 = r4.f332875f
            di3.d r5 = di3.C86312j.m106911c(r0)
            zp.b r5 = (p777zp.C112645b) r5
            r5.pw0(r4)
        L_0x0495:
            uc0.h r4 = r11.f332892v
            if (r4 == 0) goto L_0x04ae
            java.lang.String r4 = r4.f332895e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x04ae
            di3.d r0 = di3.C86312j.m106911c(r0)
            zp.b r0 = (p777zp.C112645b) r0
            uc0.h r4 = r11.f332892v
            java.lang.String r4 = r4.f332895e
            r0.u30(r4)
        L_0x04ae:
            int r0 = r11.f332890t
            r4 = 1
            if (r0 != r4) goto L_0x04d0
            e61.b r5 = new e61.b
            java.lang.String r0 = r11.f332891u
            java.lang.Long r4 = p51.C110184g.f329622e
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = r10.f318954e
            r5.<init>(r0, r4, r6)
            r10.f318966q = r5
            r6 = 0
            r4 = r10
            r7 = r1
            r4.mo153652f(r5, r6, r7, r8)
            if (r2 != 0) goto L_0x04e7
            r10.mo153651c(r11, r1)
            goto L_0x04e7
        L_0x04d0:
            dm3.b r0 = r10.f318952c
            if (r0 == 0) goto L_0x04dc
            e61.b r2 = r10.f318966q
            if (r2 == 0) goto L_0x04dc
            r4 = 2
            r0.mo120734h0(r2, r4)
        L_0x04dc:
            com.tencent.mm.ui.chatting.ChattingAnimFrame r0 = r10.f318951b
            boolean r0 = r0.mo153606c(r11)
            if (r0 == 0) goto L_0x04e7
            r10.mo153651c(r11, r1)
        L_0x04e7:
            int r0 = r11.f332880g
            java.lang.String r2 = "eggresult.rep"
            java.lang.String r4 = "MicroMsg.EggMgr"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0598 }
            r5.<init>()     // Catch:{ Exception -> 0x0598 }
            eb0.c r6 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0598 }
            java.lang.String r6 = r6.mo105901p()     // Catch:{ Exception -> 0x0598 }
            r5.append(r6)     // Catch:{ Exception -> 0x0598 }
            r5.append(r2)     // Catch:{ Exception -> 0x0598 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0598 }
            r6 = -1
            r7 = 0
            byte[] r5 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r7, r6)     // Catch:{ Exception -> 0x0598 }
            if (r5 == 0) goto L_0x051d
            java.lang.String r6 = "data not null, parse it"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r6)     // Catch:{ Exception -> 0x0598 }
            uc0.k r6 = new uc0.k     // Catch:{ Exception -> 0x0598 }
            r6.<init>()     // Catch:{ Exception -> 0x0598 }
            pe3.a r5 = r6.parseFrom(r5)     // Catch:{ Exception -> 0x0598 }
            uc0.k r5 = (uc0.C52519k) r5     // Catch:{ Exception -> 0x0598 }
            goto L_0x0527
        L_0x051d:
            java.lang.String r5 = "data is null, new one"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)     // Catch:{ Exception -> 0x0598 }
            uc0.k r5 = new uc0.k     // Catch:{ Exception -> 0x0598 }
            r5.<init>()     // Catch:{ Exception -> 0x0598 }
        L_0x0527:
            java.util.LinkedList<uc0.j> r6 = r5.f146686d     // Catch:{ Exception -> 0x0598 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0598 }
        L_0x052d:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0598 }
            if (r7 == 0) goto L_0x054f
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0598 }
            uc0.j r7 = (uc0.C52518j) r7     // Catch:{ Exception -> 0x0598 }
            int r8 = r7.f146683d     // Catch:{ Exception -> 0x0598 }
            if (r8 == r0) goto L_0x053e
            goto L_0x052d
        L_0x053e:
            if (r14 == 0) goto L_0x0547
            int r6 = r7.f146684e     // Catch:{ Exception -> 0x0598 }
            r8 = 1
            int r6 = r6 + r8
            r7.f146684e = r6     // Catch:{ Exception -> 0x0598 }
            goto L_0x054d
        L_0x0547:
            int r6 = r7.f146685f     // Catch:{ Exception -> 0x0598 }
            r8 = 1
            int r6 = r6 + r8
            r7.f146685f = r6     // Catch:{ Exception -> 0x0598 }
        L_0x054d:
            r6 = 1
            goto L_0x0550
        L_0x054f:
            r6 = 0
        L_0x0550:
            if (r6 != 0) goto L_0x0567
            uc0.j r6 = new uc0.j     // Catch:{ Exception -> 0x0598 }
            r6.<init>()     // Catch:{ Exception -> 0x0598 }
            r6.f146683d = r0     // Catch:{ Exception -> 0x0598 }
            if (r14 == 0) goto L_0x055f
            r7 = 1
            r6.f146684e = r7     // Catch:{ Exception -> 0x0598 }
            goto L_0x0562
        L_0x055f:
            r7 = 1
            r6.f146685f = r7     // Catch:{ Exception -> 0x0598 }
        L_0x0562:
            java.util.LinkedList<uc0.j> r0 = r5.f146686d     // Catch:{ Exception -> 0x0598 }
            r0.add(r6)     // Catch:{ Exception -> 0x0598 }
        L_0x0567:
            byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x0598 }
            java.lang.String r6 = "report list is %s, then save it"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0598 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0598 }
            r7 = 0
            r8[r7] = r5     // Catch:{ Exception -> 0x0598 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r8)     // Catch:{ Exception -> 0x0598 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0598 }
            r5.<init>()     // Catch:{ Exception -> 0x0598 }
            eb0.c r6 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0598 }
            java.lang.String r6 = r6.mo105901p()     // Catch:{ Exception -> 0x0598 }
            r5.append(r6)     // Catch:{ Exception -> 0x0598 }
            r5.append(r2)     // Catch:{ Exception -> 0x0598 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0598 }
            int r5 = r0.length     // Catch:{ Exception -> 0x0598 }
            r6 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r2, r0, r6, r5)     // Catch:{ Exception -> 0x0598 }
            r6 = 0
            goto L_0x05af
        L_0x0598:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r2 = r0.getLocalizedMessage()
            r6 = 0
            r5[r6] = r2
            java.lang.String r2 = "statistics crash : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r5)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r2)
        L_0x05af:
            java.lang.String r0 = "MicroMsg.EggMgr"
            java.lang.String r2 = "match keyWord[%s], time[%d - %d]"
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r6] = r1
            int r1 = r11.f332881h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r4[r5] = r1
            int r1 = r11.f332882i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 2
            r4[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r4)
            r1 = 0
            r6 = 0
            r13 = 1
            goto L_0x05fd
        L_0x05d0:
            r2 = 0
            r10.f318962m = r2
            java.lang.String r0 = "MicroMsg.EggMgr"
            java.lang.String r2 = "match keyWord[%s], but not match time[%d - %d]"
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r6 = 0
            r4[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r4[r5] = r1
            int r1 = r11.f332882i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 2
            r4[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r4)
            r1 = 0
            goto L_0x05fc
        L_0x05f1:
            r1 = 0
            r6 = 0
            r10.f318962m = r1
            java.lang.String r0 = "MicroMsg.EggMgr"
            java.lang.String r2 = "no match"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
        L_0x05fc:
            r13 = 0
        L_0x05fd:
            if (r13 == 0) goto L_0x0600
            goto L_0x0608
        L_0x0600:
            r2 = r1
            r12 = r20
            r11 = 0
            r1 = r24
            goto L_0x00ff
        L_0x0608:
            return
        L_0x0609:
            r1 = r24
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C106685t1.run():void");
    }
}
