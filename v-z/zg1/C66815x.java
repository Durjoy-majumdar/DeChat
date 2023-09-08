package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.x */
public final class C66815x extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66815x(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:280:0x07a9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r51) {
        /*
            r50 = this;
            r1 = r51
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r1, r0)
            r3 = r50
            fj1.b r0 = r3.f43066a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            r10 = r0
            cl1.d0 r10 = (cl1.C54963d0) r10
            java.lang.Class<tf0.r1> r11 = tf0.C64918r1.class
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            java.lang.Class<cl1.u> r13 = cl1.C55001u.class
            fj1.b r14 = r10.f107146d
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r51.iterator()
        L_0x002a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r4.next()
            r6 = r5
            te3.xs0 r6 = (te3.C52013xs0) r6
            int[] r7 = r10.f154055I
            int r6 = r6.f144903e
            boolean r6 = sx3.C110823p.m151008x(r7, r6)
            if (r6 == 0) goto L_0x002a
            r0.add(r5)
            goto L_0x002a
        L_0x0045:
            r15.addAll(r0)
            java.util.Iterator r16 = r15.iterator()
        L_0x004c:
            boolean r0 = r16.hasNext()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x04a5
            java.lang.Object r0 = r16.next()
            r5 = r0
            te3.xs0 r5 = (te3.C52013xs0) r5
            te3.zs0 r8 = new te3.zs0
            r8.<init>()
            pe3.b r0 = r5.f144906h
            if (r0 == 0) goto L_0x0069
            byte[] r0 = r0.mo123703f()
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 != 0) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x007e
        L_0x0071:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r4 = ""
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r4, r3)
        L_0x007e:
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "receive accept mic msg:[isAnchor:"
            r3.append(r4)
            di3.d r4 = di3.C86312j.m106911c(r11)
            tf0.r1 r4 = (tf0.C64918r1) r4
            boolean r4 = r4.mo89039GD()
            r3.append(r4)
            java.lang.String r4 = ", username:"
            r3.append(r4)
            te3.hx0 r4 = r5.f144914s
            if (r4 == 0) goto L_0x00a7
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = r4.username
            goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            r3.append(r4)
            java.lang.String r4 = ", nickname:"
            r3.append(r4)
            te3.hx0 r4 = r5.f144914s
            if (r4 == 0) goto L_0x00bb
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x00bb
            java.lang.String r4 = r4.nickname
            goto L_0x00bc
        L_0x00bb:
            r4 = 0
        L_0x00bc:
            r3.append(r4)
            java.lang.String r4 = ", sdkUerId:"
            r3.append(r4)
            te3.bq2 r4 = r8.f186854g
            if (r4 == 0) goto L_0x00cb
            java.lang.String r4 = r4.f182313e
            goto L_0x00cc
        L_0x00cb:
            r4 = 0
        L_0x00cc:
            r3.append(r4)
            java.lang.String r4 = ", micType:"
            r3.append(r4)
            int r4 = r8.f186852e
            r3.append(r4)
            java.lang.String r4 = ", sessionId:"
            r3.append(r4)
            java.lang.String r4 = r5.f144909n
            r3.append(r4)
            java.lang.String r4 = ", seq:"
            r3.append(r4)
            long r6 = r8.f186857j
            r3.append(r6)
            r6 = 93
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "receive accept audience mic msg: isAnchor:"
            r3.append(r6)
            di3.d r6 = di3.C86312j.m106911c(r11)
            tf0.r1 r6 = (tf0.C64918r1) r6
            boolean r6 = r6.mo89039GD()
            r3.append(r6)
            java.lang.String r6 = ", live_sdk_info:"
            r3.append(r6)
            te3.bq2 r6 = r8.f186854g
            r3.append(r6)
            java.lang.String r6 = ",fromUsername:"
            r3.append(r6)
            te3.hx0 r6 = r5.f144914s
            if (r6 == 0) goto L_0x012c
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x012c
            java.lang.String r6 = r6.username
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            r3.append(r6)
            java.lang.String r6 = ", acceptNickname:"
            r3.append(r6)
            te3.hx0 r6 = r8.f186855h
            if (r6 == 0) goto L_0x0140
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x0140
            java.lang.String r6 = r6.nickname
            goto L_0x0141
        L_0x0140:
            r6 = 0
        L_0x0141:
            r3.append(r6)
            java.lang.String r6 = ", liveSdkUerId:"
            r3.append(r6)
            te3.bq2 r6 = r8.f186854g
            if (r6 == 0) goto L_0x0150
            java.lang.String r6 = r6.f182313e
            goto L_0x0151
        L_0x0150:
            r6 = 0
        L_0x0151:
            r3.append(r6)
            java.lang.String r6 = " micSdkUserId:"
            r3.append(r6)
            java.lang.String r6 = r8.f186851d
            r3.append(r6)
            java.lang.String r6 = " isAnchorLiveWithoutSndDevice: "
            r3.append(r6)
            di3.d r6 = di3.C86312j.m106911c(r11)
            tf0.r1 r6 = (tf0.C64918r1) r6
            boolean r6 = r6.mo89049b5()
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.String r6 = r5.f144909n
            if (r6 == 0) goto L_0x0491
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            boolean r0 = r0.mo89049b5()
            if (r0 != 0) goto L_0x0487
            androidx.lifecycle.i0 r0 = r14.mo71262a(r2)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.f154082y
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0198
            goto L_0x01a8
        L_0x0198:
            int r0 = r0.intValue()
            r3 = 3
            if (r0 != r3) goto L_0x01a8
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.String r3 = "mic has closed, skip msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x0487
        L_0x01a8:
            te3.bq2 r0 = r8.f186854g
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = r0.f182313e
            if (r0 != 0) goto L_0x01b2
        L_0x01b0:
            java.lang.String r0 = r8.f186851d
        L_0x01b2:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r10.f154082y
            r7 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.put(r6, r7)
            androidx.lifecycle.i0 r3 = r14.mo71262a(r2)
            cl1.d0 r3 = (cl1.C54963d0) r3
            java.util.List<al1.j> r3 = r3.f154047A
            java.lang.String r7 = "liveData.business(LiveLi….pendingNotifyMicUserList"
            gy3.C87412m.m108593f(r3, r7)
            monitor-enter(r3)
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x0484 }
        L_0x01ce:
            boolean r17 = r7.hasNext()     // Catch:{ all -> 0x0484 }
            if (r17 == 0) goto L_0x01e5
            java.lang.Object r17 = r7.next()     // Catch:{ all -> 0x0484 }
            r4 = r17
            al1.j r4 = (al1.C54130j) r4     // Catch:{ all -> 0x0484 }
            java.lang.String r4 = r4.f151997a     // Catch:{ all -> 0x0484 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ all -> 0x0484 }
            if (r4 == 0) goto L_0x01ce
            goto L_0x01e7
        L_0x01e5:
            r17 = 0
        L_0x01e7:
            monitor-exit(r3)
            r3 = r17
            al1.j r3 = (al1.C54130j) r3
            al1.j r4 = new al1.j
            te3.hx0 r7 = r8.f186855h
            if (r7 == 0) goto L_0x01fb
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r7.f134919d
            if (r9 == 0) goto L_0x01fb
            java.lang.String r9 = r9.headUrl
            r21 = r9
            goto L_0x01fd
        L_0x01fb:
            r21 = 0
        L_0x01fd:
            if (r7 == 0) goto L_0x0208
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r7.f134919d
            if (r9 == 0) goto L_0x0208
            java.lang.String r9 = r9.username
            r22 = r9
            goto L_0x020a
        L_0x0208:
            r22 = 0
        L_0x020a:
            if (r7 == 0) goto L_0x0215
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r7.f134919d
            if (r9 == 0) goto L_0x0215
            java.lang.String r9 = r9.nickname
            r23 = r9
            goto L_0x0217
        L_0x0215:
            r23 = 0
        L_0x0217:
            int r9 = r8.f186852e
            java.lang.String r1 = r5.f144909n
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            if (r7 == 0) goto L_0x0230
            r46 = r15
            int r15 = r7.f134923h
            r32 = r15
            goto L_0x0234
        L_0x0230:
            r46 = r15
            r32 = 0
        L_0x0234:
            if (r3 == 0) goto L_0x023b
            boolean r3 = r3.f152010n
            r33 = r3
            goto L_0x023d
        L_0x023b:
            r33 = 0
        L_0x023d:
            r34 = 0
            r35 = 0
            r36 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            int r3 = r8.f186853f
            r43 = r3
            r44 = 4050880(0x3dcfc0, float:5.676492E-39)
            r45 = 0
            r19 = r4
            r20 = r0
            r24 = r9
            r25 = r1
            r38 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45)
            r10.mo75917Y3(r4)
            androidx.lifecycle.i0 r1 = r14.mo71262a(r2)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154076s
            java.lang.String r3 = "liveData.business(LiveLi…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r1, r3)
            monitor-enter(r1)
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0481 }
            r7 = 0
        L_0x0277:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x0481 }
            if (r9 == 0) goto L_0x02a1
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x0481 }
            al1.j r9 = (al1.C54130j) r9     // Catch:{ all -> 0x0481 }
            androidx.lifecycle.i0 r15 = r14.mo71262a(r2)     // Catch:{ all -> 0x0481 }
            cl1.d0 r15 = (cl1.C54963d0) r15     // Catch:{ all -> 0x0481 }
            java.util.List<al1.j> r15 = r15.f154047A     // Catch:{ all -> 0x0481 }
            r19 = r3
            java.lang.String r3 = "liveData.business(LiveLi….pendingNotifyMicUserList"
            gy3.C87412m.m108593f(r15, r3)     // Catch:{ all -> 0x0481 }
            cl1.f0 r3 = new cl1.f0     // Catch:{ all -> 0x0481 }
            r3.<init>(r9)     // Catch:{ all -> 0x0481 }
            boolean r3 = o40.C61926c.m72700y(r15, r3)     // Catch:{ all -> 0x0481 }
            if (r3 == 0) goto L_0x029e
            r7 = 1
        L_0x029e:
            r3 = r19
            goto L_0x0277
        L_0x02a1:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0481 }
            monitor-exit(r1)
            androidx.lifecycle.i0 r1 = r14.mo71262a(r2)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154047A
            r1.clear()
            java.lang.String r1 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "receive accept audience mic msg hasPendingNotifyMicId:"
            r3.append(r9)
            r3.append(r7)
            java.lang.String r9 = " roomPk:"
            r3.append(r9)
            boolean r9 = r10.f154053G
            r3.append(r9)
            java.lang.String r9 = " curMicSdkUseId: "
            r3.append(r9)
            r3.append(r0)
            java.lang.String r9 = " selfSdkUserId: "
            r3.append(r9)
            androidx.lifecycle.i0 r9 = r14.mo71262a(r12)
            cl1.o r9 = (cl1.C54991o) r9
            java.lang.String r9 = r9.mo76015n4()
            r3.append(r9)
            java.lang.String r9 = " audienceMode: "
            r3.append(r9)
            androidx.lifecycle.i0 r9 = r14.mo71262a(r12)
            cl1.o r9 = (cl1.C54991o) r9
            int r9 = r9.mo75996d3()
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            if (r7 == 0) goto L_0x031e
            androidx.lifecycle.i0 r1 = r14.mo71262a(r12)
            cl1.o r1 = (cl1.C54991o) r1
            r1.mo76009k4(r4)
            boolean r1 = r10.f154053G
            if (r1 == 0) goto L_0x0315
            di3.d r1 = di3.C86312j.m106911c(r11)
            tf0.r1 r1 = (tf0.C64918r1) r1
            r3 = 1
            r1.mo89048Z8(r3)
            goto L_0x031e
        L_0x0315:
            di3.d r1 = di3.C86312j.m106911c(r11)
            tf0.r1 r1 = (tf0.C64918r1) r1
            r1.mo89044Rq()
        L_0x031e:
            androidx.lifecycle.i0 r1 = r14.mo71262a(r12)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.mo76015n4()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r0)
            if (r1 == 0) goto L_0x047b
            androidx.lifecycle.i0 r1 = r14.mo71262a(r2)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r3 = 0
            r1.f154078u = r3
            y50.a r1 = new y50.a
            androidx.lifecycle.i0 r3 = r14.mo71262a(r13)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            java.lang.String r5 = r5.f144909n
            te3.bq2 r7 = r8.f186854g
            if (r7 == 0) goto L_0x034e
            int r15 = r7.f182312d
            r24 = r15
            goto L_0x0350
        L_0x034e:
            r24 = 0
        L_0x0350:
            if (r7 == 0) goto L_0x0357
            int r15 = r7.f182315g
            r25 = r15
            goto L_0x0359
        L_0x0357:
            r25 = 0
        L_0x0359:
            if (r7 == 0) goto L_0x0360
            int r15 = r7.f182314f
            r26 = r15
            goto L_0x0362
        L_0x0360:
            r26 = 0
        L_0x0362:
            if (r7 == 0) goto L_0x036f
            pe3.b r7 = r7.f182316h
            if (r7 == 0) goto L_0x036f
            java.lang.String r7 = r7.mo123705h()
            r27 = r7
            goto L_0x0371
        L_0x036f:
            r27 = 0
        L_0x0371:
            te3.bq2 r7 = r8.f186854g
            if (r7 == 0) goto L_0x0380
            pe3.b r7 = r7.f182317i
            if (r7 == 0) goto L_0x0380
            java.lang.String r7 = r7.mo123705h()
            r28 = r7
            goto L_0x0382
        L_0x0380:
            r28 = 0
        L_0x0382:
            te3.bq2 r7 = r8.f186854g
            r15 = r10
            if (r7 == 0) goto L_0x038c
            long r9 = r7.f182321p
            r29 = r9
            goto L_0x038e
        L_0x038c:
            r29 = 0
        L_0x038e:
            if (r7 == 0) goto L_0x0399
            pe3.b r7 = r7.f182318j
            if (r7 == 0) goto L_0x0399
            byte[] r7 = r7.f257327a
            r31 = r7
            goto L_0x039b
        L_0x0399:
            r31 = 0
        L_0x039b:
            int r7 = r8.f186852e
            java.lang.Integer r32 = java.lang.Integer.valueOf(r7)
            long r9 = r8.f186857j
            r33 = r9
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 28672(0x7000, float:4.0178E-41)
            r39 = 0
            r19 = r1
            r20 = r3
            r22 = r5
            r23 = r0
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r35, r36, r37, r38, r39)
            androidx.lifecycle.i0 r3 = r14.mo71262a(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo76015n4()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r0)
            if (r0 == 0) goto L_0x046b
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.i70(r1)
            androidx.lifecycle.i0 r0 = r14.mo71262a(r12)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 != 0) goto L_0x041d
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r3 = r15
            fj1.b r4 = r3.f107146d
            int r5 = r8.f186852e
            r0.na0(r4, r5)
            r3.mo75915W3(r1)
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            j50.a r0 = r0.mo89057iV()
            r1 = 0
            if (r0 == 0) goto L_0x0400
            r0.mo85686c0(r1)
        L_0x0400:
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            j50.a r0 = r0.mo89057iV()
            if (r0 == 0) goto L_0x040f
            r0.mo85684b0(r1)
        L_0x040f:
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.Su0()
            r18 = r12
            r20 = r13
            goto L_0x045a
        L_0x041d:
            r3 = r15
            androidx.lifecycle.i0 r0 = r14.mo71262a(r13)
            cl1.u r0 = (cl1.C55001u) r0
            d50.h r0 = r0.f154421r
            if (r0 == 0) goto L_0x044b
            di3.d r4 = di3.C86312j.m106911c(r11)
            java.lang.String r5 = "getService(IFinderLiveBaseService::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r10 = r4
            tf0.r1 r10 = (tf0.C64918r1) r10
            cl1.g0 r15 = new cl1.g0
            r4 = r15
            r9 = 0
            r5 = r14
            r7 = r3
            r18 = r12
            r20 = r13
            r12 = 0
            r12 = r9
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r10.mo89058ig(r12, r0, r15)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0451
        L_0x044b:
            r18 = r12
            r20 = r13
            r12 = 0
            r5 = r12
        L_0x0451:
            if (r5 != 0) goto L_0x045a
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.String r1 = "receive accept audience mic msg liveRoomModel is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x045a:
            di3.d r0 = di3.C86312j.m106911c(r11)
            java.lang.String r1 = "getService(IFinderLiveBaseService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r4 = 0
            r0.U50(r4)
            goto L_0x048e
        L_0x046b:
            r18 = r12
            r20 = r13
            r3 = r15
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.String r4 = "receive accept audience mic msg not current user"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r3.mo75915W3(r1)
            goto L_0x048e
        L_0x047b:
            r3 = r10
            r18 = r12
            r20 = r13
            goto L_0x048e
        L_0x0481:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0484:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0487:
            r3 = r10
            r18 = r12
            r20 = r13
            r46 = r15
        L_0x048e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0498
        L_0x0491:
            r3 = r10
            r18 = r12
            r20 = r13
            r46 = r15
        L_0x0498:
            r1 = r51
            r10 = r3
            r12 = r18
            r13 = r20
            r15 = r46
            r3 = r50
            goto L_0x004c
        L_0x04a5:
            r3 = r10
            r18 = r12
            r20 = r13
            r46 = r15
            r12 = 0
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "acceptMicMsgList:"
            r1.append(r5)
            int r5 = r46.size()
            r1.append(r5)
            java.lang.String r5 = " isAnchor:"
            r1.append(r5)
            di3.d r5 = di3.C86312j.m106911c(r11)
            tf0.r1 r5 = (tf0.C64918r1) r5
            boolean r5 = r5.mo89039GD()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r51.iterator()
        L_0x04e7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0502
            java.lang.Object r6 = r5.next()
            r7 = r6
            te3.xs0 r7 = (te3.C52013xs0) r7
            int[] r8 = r3.f154057K
            int r7 = r7.f144903e
            boolean r7 = sx3.C110823p.m151008x(r8, r7)
            if (r7 == 0) goto L_0x04e7
            r1.add(r6)
            goto L_0x04e7
        L_0x0502:
            r0.addAll(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x050e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0537
            java.lang.Object r5 = r0.next()
            r6 = r5
            te3.xs0 r6 = (te3.C52013xs0) r6
            te3.hx0 r6 = r6.f144914s
            if (r6 == 0) goto L_0x0526
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x0526
            java.lang.String r6 = r6.username
            goto L_0x0527
        L_0x0526:
            r6 = r12
        L_0x0527:
            java.lang.String r7 = eb0.C75592q0.m90789s()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r7)
            r4 = 1
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x050e
            r1.add(r5)
            goto L_0x050e
        L_0x0537:
            java.util.Iterator r5 = r1.iterator()
        L_0x053b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0808
            java.lang.Object r0 = r5.next()
            r6 = r0
            te3.xs0 r6 = (te3.C52013xs0) r6
            te3.qt0 r7 = new te3.qt0
            r7.<init>()
            pe3.b r0 = r6.f144906h
            if (r0 == 0) goto L_0x0556
            byte[] r0 = r0.mo123703f()
            goto L_0x0557
        L_0x0556:
            r0 = r12
        L_0x0557:
            if (r0 != 0) goto L_0x055a
            goto L_0x056d
        L_0x055a:
            r7.parseFrom(r0)     // Catch:{ Exception -> 0x055e }
            goto L_0x056d
        L_0x055e:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r10 = ""
            r4 = 1
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r9 = 0
            r13[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r10, r13)
        L_0x056d:
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "receive close mic msg, [sdkUserId:"
            r8.append(r10)
            java.lang.String r10 = r7.f140535d
            r8.append(r10)
            java.lang.String r10 = ", sessionId:"
            r8.append(r10)
            java.lang.String r10 = r6.f144909n
            r8.append(r10)
            java.lang.String r10 = "], curLiveUser:"
            r8.append(r10)
            al1.j r10 = r3.f154073p
            r8.append(r10)
            java.lang.String r10 = ", audienceLinkMicUserList:"
            r8.append(r10)
            java.util.List<al1.j> r10 = r3.f154074q
            r8.append(r10)
            java.lang.String r10 = ", applySessionId:"
            r8.append(r10)
            java.lang.String r10 = r3.f154070j
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            java.lang.String r0 = r6.f144909n
            if (r0 == 0) goto L_0x07fc
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r3.f154082y
            r10 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r8.put(r0, r13)
            di3.d r8 = di3.C86312j.m106911c(r11)
            tf0.r1 r8 = (tf0.C64918r1) r8
            boolean r8 = r8.mo89039GD()
            if (r8 == 0) goto L_0x068e
            java.util.List<al1.j> r8 = r3.f154074q
            java.lang.String r0 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r8, r0)
            monitor-enter(r8)
            java.util.Iterator r0 = r8.iterator()     // Catch:{ all -> 0x068b }
        L_0x05d3:
            boolean r10 = r0.hasNext()     // Catch:{ all -> 0x068b }
            if (r10 == 0) goto L_0x05eb
            java.lang.Object r10 = r0.next()     // Catch:{ all -> 0x068b }
            r13 = r10
            al1.j r13 = (al1.C54130j) r13     // Catch:{ all -> 0x068b }
            java.lang.String r13 = r13.f152002f     // Catch:{ all -> 0x068b }
            java.lang.String r14 = r6.f144909n     // Catch:{ all -> 0x068b }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x068b }
            if (r13 == 0) goto L_0x05d3
            goto L_0x05ec
        L_0x05eb:
            r10 = r12
        L_0x05ec:
            monitor-exit(r8)
            al1.j r10 = (al1.C54130j) r10
            if (r10 == 0) goto L_0x0657
            y50.f r0 = new y50.f
            r13 = r20
            androidx.lifecycle.i0 r8 = r3.business(r13)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            long r14 = r8.f182392d
            te3.hx0 r8 = r6.f144914s
            if (r8 == 0) goto L_0x060c
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
            if (r8 == 0) goto L_0x060c
            java.lang.String r8 = r8.username
            r24 = r8
            goto L_0x060e
        L_0x060c:
            r24 = r12
        L_0x060e:
            java.lang.String r8 = r6.f144909n
            java.lang.String r4 = r10.f151997a
            int r9 = r10.f152001e
            r21 = r0
            r22 = r14
            r25 = r8
            r26 = r4
            r27 = r9
            r21.<init>(r22, r24, r25, r26, r27)
            r3.mo75916X3(r0)
            r4 = 0
            r3.f154078u = r4
            java.util.List<al1.j> r0 = r3.f154074q
            java.lang.String r4 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r0, r4)
            cl1.h0 r4 = new cl1.h0
            r4.<init>(r6)
            o40.C61926c.m72700y(r0, r4)
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "anchor receive close msg, [sdkUserId:"
            r4.append(r8)
            java.lang.String r8 = r7.f140535d
            r4.append(r8)
            java.lang.String r8 = "] closeUser:"
            r4.append(r8)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x0659
        L_0x0657:
            r13 = r20
        L_0x0659:
            java.util.List<al1.j> r0 = r3.f154071n
            java.lang.String r4 = "linkMicUserList"
            gy3.C87412m.m108593f(r0, r4)
            cl1.i0 r4 = new cl1.i0
            r4.<init>(r7)
            sx3.C64175a0.m75512t(r0, r4)
            java.util.List<al1.j> r0 = r3.f154072o
            java.lang.String r4 = "newLinkMicUserList"
            gy3.C87412m.m108593f(r0, r4)
            cl1.j0 r4 = new cl1.j0
            r4.<init>(r7)
            sx3.C64175a0.m75512t(r0, r4)
            java.util.List<al1.j> r0 = r3.f154076s
            java.lang.String r4 = "linkMicUserInfoList"
            gy3.C87412m.m108593f(r0, r4)
            cl1.k0 r4 = new cl1.k0
            r4.<init>(r6)
            o40.C61926c.m72700y(r0, r4)
            r15 = r5
            r14 = r18
            goto L_0x0801
        L_0x068b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x068e:
            r13 = r20
            java.util.List<al1.j> r8 = r3.f154074q
            java.lang.String r4 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r8, r4)
            monitor-enter(r8)
            java.util.Iterator r4 = r8.iterator()     // Catch:{ all -> 0x07f9 }
        L_0x069c:
            boolean r10 = r4.hasNext()     // Catch:{ all -> 0x07f9 }
            if (r10 == 0) goto L_0x06b4
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x07f9 }
            r14 = r10
            al1.j r14 = (al1.C54130j) r14     // Catch:{ all -> 0x07f9 }
            java.lang.String r14 = r14.f152002f     // Catch:{ all -> 0x07f9 }
            java.lang.String r15 = r6.f144909n     // Catch:{ all -> 0x07f9 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x07f9 }
            if (r14 == 0) goto L_0x069c
            goto L_0x06b5
        L_0x06b4:
            r10 = r12
        L_0x06b5:
            monitor-exit(r8)
            al1.j r10 = (al1.C54130j) r10
            if (r10 == 0) goto L_0x071c
            y50.f r0 = new y50.f
            androidx.lifecycle.i0 r4 = r3.business(r13)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r14 = r4.f182392d
            te3.hx0 r4 = r6.f144914s
            if (r4 == 0) goto L_0x06d3
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x06d3
            java.lang.String r4 = r4.username
            r23 = r4
            goto L_0x06d5
        L_0x06d3:
            r23 = r12
        L_0x06d5:
            java.lang.String r4 = r6.f144909n
            java.lang.String r8 = r10.f151997a
            int r9 = r10.f152001e
            r20 = r0
            r21 = r14
            r24 = r4
            r25 = r8
            r26 = r9
            r20.<init>(r21, r23, r24, r25, r26)
            r3.mo75916X3(r0)
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.w90()
            java.util.List<al1.j> r0 = r3.f154076s
            java.lang.String r4 = "linkMicUserInfoList"
            gy3.C87412m.m108593f(r0, r4)
            cl1.l0 r4 = new cl1.l0
            r4.<init>(r6)
            o40.C61926c.m72700y(r0, r4)
            java.lang.String r0 = r10.f151997a
            r14 = r18
            androidx.lifecycle.i0 r4 = r3.business(r14)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.mo76015n4()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r4)
            if (r0 == 0) goto L_0x0796
            r4 = 0
            r3.f154078u = r4
            goto L_0x0796
        L_0x071c:
            r14 = r18
            androidx.lifecycle.i0 r4 = r3.business(r2)
            cl1.d0 r4 = (cl1.C54963d0) r4
            boolean r4 = r4.mo75913U3()
            if (r4 != 0) goto L_0x0736
            androidx.lifecycle.i0 r4 = r3.business(r2)
            cl1.d0 r4 = (cl1.C54963d0) r4
            boolean r4 = r4.mo75914V3()
            if (r4 == 0) goto L_0x0796
        L_0x0736:
            androidx.lifecycle.i0 r4 = r3.business(r14)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.mo76015n4()
            java.lang.String r8 = r7.f140535d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r8)
            if (r4 == 0) goto L_0x0796
            androidx.lifecycle.i0 r4 = r3.business(r2)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.lang.String r4 = r4.f154070j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r0)
            if (r0 == 0) goto L_0x0796
            int r0 = r3.f154078u
            r4 = 1
            if (r0 == r4) goto L_0x0762
            r8 = 3
            if (r0 != r8) goto L_0x075f
            goto L_0x0762
        L_0x075f:
            r26 = 2
            goto L_0x0764
        L_0x0762:
            r26 = 1
        L_0x0764:
            y50.f r0 = new y50.f
            androidx.lifecycle.i0 r8 = r3.business(r13)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            r15 = r5
            long r4 = r8.f182392d
            te3.hx0 r8 = r6.f144914s
            if (r8 == 0) goto L_0x077e
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
            if (r8 == 0) goto L_0x077e
            java.lang.String r8 = r8.username
            r23 = r8
            goto L_0x0780
        L_0x077e:
            r23 = r12
        L_0x0780:
            java.lang.String r6 = r6.f144909n
            java.lang.String r8 = r7.f140535d
            r20 = r0
            r21 = r4
            r24 = r6
            r25 = r8
            r20.<init>(r21, r23, r24, r25, r26)
            r3.mo75916X3(r0)
            r4 = 0
            r3.f154078u = r4
            goto L_0x0797
        L_0x0796:
            r15 = r5
        L_0x0797:
            androidx.lifecycle.i0 r0 = r3.business(r14)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.mo76015n4()
            java.lang.String r4 = r7.f140535d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r4)
            if (r0 == 0) goto L_0x07bb
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.mo89065rc()
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.mo89069zq()
        L_0x07bb:
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "visitor receive close msg, [sdkUserId:"
            r4.append(r5)
            java.lang.String r5 = r7.f140535d
            r4.append(r5)
            java.lang.String r5 = "], selfSdkUserId:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r3.business(r14)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.mo76015n4()
            r4.append(r5)
            java.lang.String r5 = ", closeUser:"
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = ", linkMicState:"
            r4.append(r5)
            int r5 = r3.f154078u
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x0801
        L_0x07f9:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x07fc:
            r15 = r5
            r14 = r18
            r13 = r20
        L_0x0801:
            r20 = r13
            r18 = r14
            r5 = r15
            goto L_0x053b
        L_0x0808:
            r14 = r18
            r13 = r20
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "closeMicMsgList:"
            r4.append(r5)
            int r1 = r1.size()
            r4.append(r1)
            java.lang.String r1 = " isAnchor:"
            r4.append(r1)
            di3.d r1 = di3.C86312j.m106911c(r11)
            tf0.r1 r1 = (tf0.C64918r1) r1
            boolean r1 = r1.mo89039GD()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            d50.i$e r1 = d50.C58115i.C58120e.ROLE_APPLY_PK
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r51.iterator()
        L_0x0848:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0863
            java.lang.Object r6 = r4.next()
            r7 = r6
            te3.xs0 r7 = (te3.C52013xs0) r7
            int[] r8 = r3.f154058L
            int r7 = r7.f144903e
            boolean r7 = sx3.C110823p.m151008x(r8, r7)
            if (r7 == 0) goto L_0x0848
            r0.add(r6)
            goto L_0x0848
        L_0x0863:
            r5.addAll(r0)
            di3.d r0 = di3.C86312j.m106911c(r11)
            tf0.r1 r0 = (tf0.C64918r1) r0
            boolean r0 = r0.mo89039GD()
            java.lang.String r6 = "MMFinder.LiveLinkMicSlice"
            if (r0 == 0) goto L_0x0bec
            java.lang.Object r0 = sx3.C110818d0.m150916N(r5)
            r7 = r0
            te3.xs0 r7 = (te3.C52013xs0) r7
            if (r7 == 0) goto L_0x0bec
            te3.at0 r8 = new te3.at0
            r8.<init>()
            pe3.b r0 = r7.f144906h
            if (r0 == 0) goto L_0x088b
            byte[] r0 = r0.mo123703f()
            goto L_0x088c
        L_0x088b:
            r0 = r12
        L_0x088c:
            java.lang.String r10 = ""
            if (r0 != 0) goto L_0x0891
            goto L_0x0894
        L_0x0891:
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x0896 }
        L_0x0894:
            r9 = 0
            goto L_0x08a3
        L_0x0896:
            r0 = move-exception
            r15 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r9 = 0
            r0[r9] = r15
            java.lang.String r15 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r15, r10, r0)
        L_0x08a3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r15 = "[LinkMicPk]  receive accept pk msg, [applySdkUserId:"
            r0.append(r15)
            java.lang.String r15 = r8.f182145d
            r0.append(r15)
            java.lang.String r15 = ", sessionId:"
            r0.append(r15)
            java.lang.String r4 = r7.f144909n
            r0.append(r4)
            java.lang.String r4 = "], curLiveUser:"
            r0.append(r4)
            al1.j r4 = r3.f154073p
            r0.append(r4)
            java.lang.String r4 = ", bgUrl:"
            r0.append(r4)
            java.lang.String r4 = r8.f182148g
            r0.append(r4)
            java.lang.String r4 = "]}, acceptInfo.seq:"
            r0.append(r4)
            r16 = r10
            long r9 = r8.f182155q
            r0.append(r9)
            java.lang.String r9 = ", liveData.acceptSeq:"
            r0.append(r9)
            long r9 = r3.f154069i
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = r7.f144909n
            if (r0 == 0) goto L_0x0bec
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r3.f154082y
            java.lang.Object r9 = r9.get(r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x08fc
            goto L_0x090a
        L_0x08fc:
            int r9 = r9.intValue()
            r10 = 3
            if (r9 != r10) goto L_0x090a
            java.lang.String r0 = "[LinkMicPk] mic has closed, skip accept!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0bec
        L_0x090a:
            androidx.lifecycle.i0 r2 = r3.business(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.mo75914V3()
            if (r2 == 0) goto L_0x091d
            java.lang.String r0 = "[LinkMicPk] anchor is linking mic, skip accept!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0bec
        L_0x091d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r3.f154082y
            r9 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r2.put(r0, r10)
            al1.j r2 = r3.f154073p
            if (r2 == 0) goto L_0x092e
            boolean r2 = r2.f152015s
            goto L_0x092f
        L_0x092e:
            r2 = 0
        L_0x092f:
            pe3.b r9 = r8.f182156r
            if (r9 == 0) goto L_0x0937
            byte[] r10 = r9.f257327a
            int r10 = r10.length
            goto L_0x0938
        L_0x0937:
            r10 = 0
        L_0x0938:
            if (r10 <= 0) goto L_0x093c
            r10 = 1
            goto L_0x093d
        L_0x093c:
            r10 = 0
        L_0x093d:
            if (r10 == 0) goto L_0x0940
            goto L_0x0942
        L_0x0940:
            pe3.b r9 = r8.f182154p
        L_0x0942:
            r3.f154053G = r10
            al1.j r4 = new al1.j
            java.lang.String r12 = r8.f182152n
            r46 = r5
            te3.hx0 r5 = r7.f144914s
            r47 = r1
            if (r5 == 0) goto L_0x0959
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r5.f134919d
            if (r1 == 0) goto L_0x0959
            java.lang.String r1 = r1.headUrl
            r21 = r1
            goto L_0x095b
        L_0x0959:
            r21 = 0
        L_0x095b:
            if (r5 == 0) goto L_0x0966
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r5.f134919d
            if (r1 == 0) goto L_0x0966
            java.lang.String r1 = r1.username
            r22 = r1
            goto L_0x0968
        L_0x0966:
            r22 = 0
        L_0x0968:
            if (r5 == 0) goto L_0x0973
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r5.f134919d
            if (r1 == 0) goto L_0x0973
            java.lang.String r1 = r1.nickname
            r23 = r1
            goto L_0x0975
        L_0x0973:
            r23 = 0
        L_0x0975:
            r24 = 2
            java.lang.String r1 = r7.f144909n
            r27 = 1
            r48 = r14
            int r14 = r8.f182153o
            r49 = r13
            if (r5 == 0) goto L_0x098c
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r5.f134919d
            if (r13 == 0) goto L_0x098c
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r13 = r13.authInfo
            r29 = r13
            goto L_0x098e
        L_0x098c:
            r29 = 0
        L_0x098e:
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            java.lang.String r13 = r8.f182148g
            r34 = r13
            r35 = 0
            r36 = 0
            r39 = 0
            r40 = 0
            te3.up2 r13 = r8.f182151j
            r41 = r13
            r42 = 0
            r43 = 0
            r44 = 7191552(0x6dbc00, float:1.0077511E-38)
            r45 = 0
            r19 = r4
            r20 = r12
            r25 = r1
            r26 = r9
            r28 = r14
            r38 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45)
            r3.f154073p = r4
            java.lang.String r1 = "[LinkMicPk] receive accept pk msg, curLinkMicUser is me"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            di3.d r1 = di3.C86312j.m106911c(r11)
            tf0.r1 r1 = (tf0.C64918r1) r1
            fj1.b r4 = r3.f107146d
            r5 = 2
            r1.na0(r4, r5)
            long r4 = r8.f182155q
            r3.f154069i = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "[LinkMicPk] receive accept msg:[isAnchor:"
            r1.append(r4)
            di3.d r4 = di3.C86312j.m106911c(r11)
            tf0.r1 r4 = (tf0.C64918r1) r4
            boolean r4 = r4.mo89039GD()
            r1.append(r4)
            java.lang.String r4 = ", username:"
            r1.append(r4)
            te3.hx0 r4 = r7.f144914s
            if (r4 == 0) goto L_0x09fc
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x09fc
            java.lang.String r5 = r4.username
            goto L_0x09fd
        L_0x09fc:
            r5 = 0
        L_0x09fd:
            r1.append(r5)
            java.lang.String r4 = ", nickname:"
            r1.append(r4)
            te3.hx0 r4 = r7.f144914s
            if (r4 == 0) goto L_0x0a10
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x0a10
            java.lang.String r5 = r4.nickname
            goto L_0x0a11
        L_0x0a10:
            r5 = 0
        L_0x0a11:
            r1.append(r5)
            java.lang.String r4 = ", sdkUerId:"
            r1.append(r4)
            java.lang.String r4 = r8.f182152n
            r1.append(r4)
            java.lang.String r4 = ", sdkLiveId:"
            r1.append(r4)
            int r4 = r8.f182153o
            r1.append(r4)
            r1.append(r15)
            java.lang.String r4 = r7.f144909n
            r1.append(r4)
            java.lang.String r4 = ", isRandomMatch:"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = ", isRoomPk:"
            r1.append(r4)
            r1.append(r10)
            java.lang.String r4 = "] acceptSeq: "
            r1.append(r4)
            long r4 = r3.f154069i
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            di3.d r1 = di3.C86312j.m106911c(r11)
            java.lang.String r4 = "getService(IFinderLiveBaseService::class.java)"
            gy3.C87412m.m108593f(r1, r4)
            tf0.r1 r1 = (tf0.C64918r1) r1
            r4 = 0
            r1.mo89050dl(r4)
            if (r10 == 0) goto L_0x0a7a
            di3.d r1 = di3.C86312j.m106911c(r11)
            tf0.r1 r1 = (tf0.C64918r1) r1
            java.lang.String r4 = r8.f182152n
            if (r4 != 0) goto L_0x0a6f
            r4 = r16
        L_0x0a6f:
            int r5 = r8.f182153o
            r12 = 1
            r1.Vj0(r4, r5, r12, r0)
            n50.c r1 = n50.C61620c.C61622b.f175234a
            r1.mo86556d(r0)
        L_0x0a7a:
            y50.a r0 = new y50.a
            r1 = r49
            androidx.lifecycle.i0 r1 = r3.business(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r12 = r1.f182392d
            java.lang.String r1 = r7.f144909n
            java.lang.String r5 = r8.f182152n
            r7 = r48
            androidx.lifecycle.i0 r14 = r3.business(r7)
            cl1.o r14 = (cl1.C54991o) r14
            int r24 = r14.mo76011l4()
            r25 = 0
            int r14 = r8.f182153o
            r29 = 0
            r31 = 0
            r15 = 2
            java.lang.Integer r32 = java.lang.Integer.valueOf(r15)
            r15 = r5
            long r4 = r8.f182155q
            if (r9 == 0) goto L_0x0aaf
            java.lang.String r8 = r9.mo123705h()
            goto L_0x0ab0
        L_0x0aaf:
            r8 = 0
        L_0x0ab0:
            r36 = 1
            java.lang.String r27 = ""
            java.lang.String r28 = ""
            r19 = r0
            r20 = r12
            r22 = r1
            r23 = r15
            r26 = r14
            r33 = r4
            r35 = r8
            r37 = r2
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r35, r36, r37)
            r3.mo75915W3(r0)
            java.lang.String r0 = "sign"
            java.lang.String r1 = "MicroMsg.LiveCoreAnchor"
            java.lang.String r2 = " username:"
            if (r10 == 0) goto L_0x0b69
            di3.d r4 = di3.C86312j.m106911c(r11)
            tf0.r1 r4 = (tf0.C64918r1) r4
            j50.a r4 = r4.mo89057iV()
            boolean r5 = r4 instanceof c50.C54655b
            if (r5 == 0) goto L_0x0ae7
            r5 = r4
            c50.b r5 = (c50.C54655b) r5
            goto L_0x0ae8
        L_0x0ae7:
            r5 = 0
        L_0x0ae8:
            if (r5 == 0) goto L_0x0bee
            androidx.lifecycle.i0 r4 = r3.business(r7)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.mo76013m4()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = java.lang.String.valueOf(r14)
            if (r8 != 0) goto L_0x0b00
            r8 = r16
        L_0x0b00:
            if (r15 != 0) goto L_0x0b05
            r10 = r16
            goto L_0x0b06
        L_0x0b05:
            r10 = r15
        L_0x0b06:
            java.lang.String r9 = "connectRoomId"
            gy3.C87412m.m108594g(r4, r9)
            java.lang.String r12 = "connectedRoomId"
            gy3.C87412m.m108594g(r7, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "startRoomPkLinkMic: connectRoomId:"
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = " connectedRoomId:"
            r13.append(r14)
            r13.append(r7)
            java.lang.String r14 = " roomPkSign:"
            r13.append(r14)
            r13.append(r8)
            r13.append(r2)
            r13.append(r10)
            java.lang.String r2 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            d50.i r1 = r5.f172989A
            r13 = r47
            r1.f166257d = r13
            r5.mo75577I0(r4, r7, r8, r10)
            k50.c r1 = r5.f173025i
            if (r1 == 0) goto L_0x0bee
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x0bee }
            r2.put(r9, r4)     // Catch:{ Exception -> 0x0bee }
            long r4 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x0bee }
            r2.put(r12, r4)     // Catch:{ Exception -> 0x0bee }
            r2.put(r0, r8)     // Catch:{ Exception -> 0x0bee }
            com.tencent.trtc.TRTCCloud r0 = r1.f173671a     // Catch:{ Exception -> 0x0bee }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0bee }
            r0.ConnectOtherRoom(r1)     // Catch:{ Exception -> 0x0bee }
            goto L_0x0bee
        L_0x0b69:
            r13 = r47
            di3.d r4 = di3.C86312j.m106911c(r11)
            tf0.r1 r4 = (tf0.C64918r1) r4
            j50.a r4 = r4.mo89057iV()
            boolean r5 = r4 instanceof c50.C54655b
            if (r5 == 0) goto L_0x0b7d
            r5 = r4
            c50.b r5 = (c50.C54655b) r5
            goto L_0x0b7e
        L_0x0b7d:
            r5 = 0
        L_0x0b7e:
            if (r5 == 0) goto L_0x0bee
            java.lang.String r4 = java.lang.String.valueOf(r14)
            if (r15 != 0) goto L_0x0b88
            r15 = r16
        L_0x0b88:
            if (r8 != 0) goto L_0x0b8d
            r10 = r16
            goto L_0x0b8e
        L_0x0b8d:
            r10 = r8
        L_0x0b8e:
            java.lang.String r7 = "roomId"
            gy3.C87412m.m108594g(r4, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "startCrossLinkMic roomId:"
            r8.append(r9)
            r8.append(r4)
            r8.append(r2)
            r8.append(r15)
            java.lang.String r2 = " pkSign:"
            r8.append(r2)
            r8.append(r10)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            d50.i r1 = r5.f172989A
            r1.f166257d = r13
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.d r1 = r1.mo85946c()
            if (r1 == 0) goto L_0x0bc9
            r1.f174706e = r15
            r2 = 1
            r1.f174707f = r2
            r1.f174705d = r4
        L_0x0bc9:
            k50.c r1 = r5.f173025i
            if (r1 == 0) goto L_0x0bee
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x0bee }
            r2.put(r7, r4)     // Catch:{ Exception -> 0x0bee }
            java.lang.String r4 = "userId"
            r2.put(r4, r15)     // Catch:{ Exception -> 0x0bee }
            r2.put(r0, r10)     // Catch:{ Exception -> 0x0bee }
            com.tencent.trtc.TRTCCloud r0 = r1.f173671a     // Catch:{ Exception -> 0x0bee }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0bee }
            r0.ConnectOtherRoom(r1)     // Catch:{ Exception -> 0x0bee }
            goto L_0x0bee
        L_0x0bec:
            r46 = r5
        L_0x0bee:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[LinkMicPk] acceptMicMsgPkList:"
            r0.append(r1)
            int r1 = r46.size()
            r0.append(r1)
            java.lang.String r1 = " isAnchor:"
            r0.append(r1)
            di3.d r1 = di3.C86312j.m106911c(r11)
            tf0.r1 r1 = (tf0.C64918r1) r1
            boolean r1 = r1.mo89039GD()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r1 = r51
            r3.mo75924f3(r1)
            r3.mo75926i3(r1)
            r3.mo75921c3(r1)
            r3.mo75922d3(r1)
            r3.mo75923e3(r1)
            r3.mo75927j3(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C66815x.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20004, 20005, 20016, 20017, 20018, 20026, 20028, 20029, 20039};
    }
}
