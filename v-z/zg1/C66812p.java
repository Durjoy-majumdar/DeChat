package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.p */
public final class C66812p extends C16006g {

    /* renamed from: c */
    public final String f191936c = "LiveGameTeamMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66812p(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r15, r0)
            fj1.b r0 = r14.f43066a
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            int r2 = r15.size()
            java.util.ListIterator r2 = r15.listIterator(r2)
        L_0x0011:
            boolean r3 = r2.hasPrevious()
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r2.previous()
            r7 = r3
            te3.xs0 r7 = (te3.C52013xs0) r7
            int r7 = r7.f144903e
            r8 = 20023(0x4e37, float:2.8058E-41)
            if (r7 != r8) goto L_0x0029
            r7 = 1
            goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            if (r7 == 0) goto L_0x0011
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            te3.xs0 r3 = (te3.C52013xs0) r3
            java.lang.String r2 = ", title:"
            java.lang.String r7 = "safeParser"
            java.lang.String r8 = ""
            if (r3 == 0) goto L_0x01aa
            te3.du0 r9 = new te3.du0
            r9.<init>()
            pe3.b r10 = r3.f144906h
            if (r10 == 0) goto L_0x0046
            byte[] r10 = r10.mo123703f()
            goto L_0x0047
        L_0x0046:
            r10 = r4
        L_0x0047:
            if (r10 != 0) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            r9.parseFrom(r10)     // Catch:{ Exception -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r10)
        L_0x0056:
            r9 = r4
        L_0x0057:
            java.lang.String r10 = r14.f191936c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "gameteam lastMsg, seq:"
            r11.append(r12)
            long r12 = r3.f144913r
            r11.append(r12)
            java.lang.String r3 = ", gameLiveTeamUpInfo in_team_up:"
            r11.append(r3)
            if (r9 == 0) goto L_0x0076
            int r3 = r9.f182853h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0077
        L_0x0076:
            r3 = r4
        L_0x0077:
            r11.append(r3)
            java.lang.String r3 = ", is_team_full:"
            r11.append(r3)
            if (r9 == 0) goto L_0x0088
            int r3 = r9.f182854i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0089
        L_0x0088:
            r3 = r4
        L_0x0089:
            r11.append(r3)
            r11.append(r2)
            if (r9 == 0) goto L_0x0094
            java.lang.String r3 = r9.f182851f
            goto L_0x0095
        L_0x0094:
            r3 = r4
        L_0x0095:
            r11.append(r3)
            java.lang.String r3 = ", rank:"
            r11.append(r3)
            if (r9 == 0) goto L_0x00a2
            java.lang.String r3 = r9.f182852g
            goto L_0x00a3
        L_0x00a2:
            r3 = r4
        L_0x00a3:
            r11.append(r3)
            java.lang.String r3 = ", member:"
            r11.append(r3)
            if (r9 == 0) goto L_0x00b0
            java.lang.String r3 = r9.f182849d
            goto L_0x00b1
        L_0x00b0:
            r3 = r4
        L_0x00b1:
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            if (r9 == 0) goto L_0x01aa
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x00eb
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r10 = new te3.az0
            r10.<init>()
            r3.mo76024u4(r10)
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r3.f182181h = r8
        L_0x00e2:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            r3.mo75957E4(r6)
        L_0x00eb:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x00f6
            goto L_0x00fd
        L_0x00f6:
            java.lang.String r10 = r9.f182851f
            if (r10 != 0) goto L_0x00fb
            r10 = r8
        L_0x00fb:
            r3.f182178e = r10
        L_0x00fd:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x0108
            goto L_0x010f
        L_0x0108:
            java.lang.String r10 = r9.f182852g
            if (r10 != 0) goto L_0x010d
            r10 = r8
        L_0x010d:
            r3.f182179f = r10
        L_0x010f:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            java.lang.String r10 = r9.f182849d
            if (r10 != 0) goto L_0x011f
            r10 = r8
        L_0x011f:
            r3.f182180g = r10
        L_0x0121:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            int r10 = r9.f182853h
            r3.f182182i = r10
        L_0x0130:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            int r10 = r9.f182854i
            if (r10 != r5) goto L_0x013c
            r10 = 1
            goto L_0x013d
        L_0x013c:
            r10 = 0
        L_0x013d:
            r3.f154393z1 = r10
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x014a
            goto L_0x014e
        L_0x014a:
            int r10 = r9.f182856n
            r3.f182185o = r10
        L_0x014e:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x0159
            goto L_0x0160
        L_0x0159:
            java.lang.String r10 = r9.f182857o
            if (r10 != 0) goto L_0x015e
            r10 = r8
        L_0x015e:
            r3.f182186p = r10
        L_0x0160:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 == 0) goto L_0x016e
            te3.yr1 r3 = r3.f182184n
            if (r3 != 0) goto L_0x0173
        L_0x016e:
            te3.yr1 r3 = new te3.yr1
            r3.<init>()
        L_0x0173:
            te3.zr1 r9 = r9.f182855j
            if (r9 == 0) goto L_0x017a
            int r10 = r9.f186839d
            goto L_0x017b
        L_0x017a:
            r10 = 0
        L_0x017b:
            r3.f186594r = r10
            if (r9 == 0) goto L_0x0182
            java.lang.String r10 = r9.f186840e
            goto L_0x0183
        L_0x0182:
            r10 = r4
        L_0x0183:
            r3.f186584e = r10
            if (r9 == 0) goto L_0x018a
            int r10 = r9.f186841f
            goto L_0x018b
        L_0x018a:
            r10 = 0
        L_0x018b:
            r3.f186587h = r10
            if (r9 == 0) goto L_0x0192
            int r9 = r9.f186842g
            goto L_0x0193
        L_0x0192:
            r9 = 0
        L_0x0193:
            r3.f186589j = r9
            androidx.lifecycle.i0 r9 = r0.mo71262a(r1)
            cl1.o r9 = (cl1.C54991o) r9
            te3.az0 r9 = r9.f154379w1
            if (r9 != 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r9.f182184n = r3
        L_0x01a2:
            androidx.lifecycle.i0 r3 = r0.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            r3.f154389y1 = r5
        L_0x01aa:
            int r3 = r15.size()
            java.util.ListIterator r15 = r15.listIterator(r3)
        L_0x01b2:
            boolean r3 = r15.hasPrevious()
            if (r3 == 0) goto L_0x01cb
            java.lang.Object r3 = r15.previous()
            r9 = r3
            te3.xs0 r9 = (te3.C52013xs0) r9
            int r9 = r9.f144903e
            r10 = 20033(0x4e41, float:2.8072E-41)
            if (r9 != r10) goto L_0x01c7
            r9 = 1
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            if (r9 == 0) goto L_0x01b2
            goto L_0x01cc
        L_0x01cb:
            r3 = r4
        L_0x01cc:
            te3.xs0 r3 = (te3.C52013xs0) r3
            if (r3 == 0) goto L_0x024f
            te3.bu0 r15 = new te3.bu0
            r15.<init>()
            pe3.b r9 = r3.f144906h
            if (r9 == 0) goto L_0x01de
            byte[] r9 = r9.mo123703f()
            goto L_0x01df
        L_0x01de:
            r9 = r4
        L_0x01df:
            if (r9 != 0) goto L_0x01e2
            goto L_0x01ee
        L_0x01e2:
            r15.parseFrom(r9)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x01ef
        L_0x01e6:
            r15 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r6] = r15
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r5)
        L_0x01ee:
            r15 = r4
        L_0x01ef:
            java.lang.String r5 = r14.f191936c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "gameInvite lastMsg, seq:"
            r6.append(r7)
            long r7 = r3.f144913r
            r6.append(r7)
            java.lang.String r7 = ", gameLiveInviteInfo  invitation_id:"
            r6.append(r7)
            if (r15 == 0) goto L_0x020a
            java.lang.String r7 = r15.f182336g
            goto L_0x020b
        L_0x020a:
            r7 = r4
        L_0x020b:
            r6.append(r7)
            r6.append(r2)
            if (r15 == 0) goto L_0x0216
            java.lang.String r2 = r15.f182333d
            goto L_0x0217
        L_0x0216:
            r2 = r4
        L_0x0217:
            r6.append(r2)
            java.lang.String r2 = ", sub_title:"
            r6.append(r2)
            if (r15 == 0) goto L_0x0224
            java.lang.String r2 = r15.f182334e
            goto L_0x0225
        L_0x0224:
            r2 = r4
        L_0x0225:
            r6.append(r2)
            java.lang.String r2 = ", wording:"
            r6.append(r2)
            if (r15 == 0) goto L_0x0231
            java.lang.String r4 = r15.f182335f
        L_0x0231:
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r15 == 0) goto L_0x024f
            androidx.lifecycle.i0 r2 = r0.mo71262a(r1)
            cl1.o r2 = (cl1.C54991o) r2
            r2.f154183B1 = r15
            androidx.lifecycle.i0 r15 = r0.mo71262a(r1)
            cl1.o r15 = (cl1.C54991o) r15
            long r0 = r3.f144913r
            r15.f154187C1 = r0
        L_0x024f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C66812p.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20023, 20033};
    }
}
