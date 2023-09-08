package il1;

import androidx.lifecycle.C0120a0;

/* renamed from: il1.p7 */
public final class C60494p7<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172441d;

    public C60494p7(C60362c7 c7Var) {
        this.f172441d = c7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x032b, code lost:
        r1 = r1.f179023q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0434, code lost:
        if (r11 > 0) goto L_0x0436;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Class<ak1.w> r2 = ak1.C54116w.class
            java.lang.Class<qj1.dg> r3 = qj1.C62741dg.class
            java.lang.Class<ky2.i> r4 = ky2.C10432i.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.Class<qj1.w6> r6 = qj1.C63084w6.class
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r7)
            java.lang.String r8 = ""
            java.lang.String r9 = "Finder.FinderLiveVisitorGameTeamWidget"
            r13 = 0
            r14 = 1
            r15 = 0
            if (r1 == 0) goto L_0x031d
            di3.d r1 = di3.C86312j.m106911c(r4)
            ky2.i r1 = (ky2.C10432i) r1
            boolean r1 = r1.mo10750e()
            if (r1 == 0) goto L_0x002d
            goto L_0x031d
        L_0x002d:
            il1.c7 r1 = r0.f172441d
            java.lang.String r10 = "checkVisible"
            r1.mo85329d(r10)
            il1.c7 r1 = r0.f172441d
            qj1.c r1 = r1.f172118c
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r5)
            cl1.o r1 = (cl1.C54991o) r1
            te3.uy0 r1 = r1.f154363s1
            if (r1 == 0) goto L_0x0051
            java.lang.Class<ym.l> r10 = p763ym.C79138l.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ym.l r10 = (p763ym.C79138l) r10
            java.lang.String r11 = r1.f143182f
            java.lang.String r1 = r1.f143186j
            r10.mo74004WW(r11, r1, r13)
        L_0x0051:
            il1.c7 r1 = r0.f172441d
            qj1.c r1 = r1.f172118c
            qj1.c r1 = r1.mo87687E0(r3)
            qj1.dg r1 = (qj1.C62741dg) r1
            if (r1 == 0) goto L_0x0062
            il1.t6 r1 = r1.f178129x
            android.view.ViewGroup r1 = r1.f172521a
            goto L_0x0063
        L_0x0062:
            r1 = r13
        L_0x0063:
            if (r1 != 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r1.setVisibility(r15)
        L_0x0069:
            il1.c7 r1 = r0.f172441d
            qj1.c r1 = r1.f172118c
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r5)
            cl1.o r1 = (cl1.C54991o) r1
            int r1 = r1.f154371u1
            if (r1 == 0) goto L_0x007b
            if (r1 == r14) goto L_0x007b
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 == 0) goto L_0x02e6
            il1.c7 r1 = r0.f172441d
            qj1.c r7 = r1.f172118c
            qj1.c r3 = r7.mo87687E0(r3)
            qj1.dg r3 = (qj1.C62741dg) r3
            if (r3 == 0) goto L_0x0096
            il1.t6 r3 = r3.f178129x
            android.view.ViewGroup r3 = r3.f172521a
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0096
            r3 = 1
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            if (r3 != 0) goto L_0x009b
            goto L_0x031a
        L_0x009b:
            java.lang.String r3 = "checkShowGuide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            qj1.c r3 = r1.f172118c
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r5)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            if (r3 != 0) goto L_0x00ae
            goto L_0x031a
        L_0x00ae:
            int r7 = r3.f182177d
            boolean r10 = r1.f172100B
            int r11 = r3.f182182i
            if (r11 != r14) goto L_0x00c4
            qj1.c r11 = r1.f172118c
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r5)
            cl1.o r11 = (cl1.C54991o) r11
            boolean r11 = r11.f154393z1
            if (r11 != 0) goto L_0x00c4
            r11 = 1
            goto L_0x00c5
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            r1.f172100B = r11
            if (r10 != 0) goto L_0x00d9
            if (r11 == 0) goto L_0x00d9
            qj1.c r10 = r1.f172118c
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r5)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.f154195E1
            if (r10 != 0) goto L_0x00d9
            r10 = 1
            goto L_0x00da
        L_0x00d9:
            r10 = 0
        L_0x00da:
            qj1.c r11 = r1.f172118c
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r5)
            cl1.o r11 = (cl1.C54991o) r11
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_JOIN_GUIDE_SHOW_BOOLEAN_SYNC
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Object r11 = r11.mo119685f(r13, r12)
            int r12 = r3.f182182i
            if (r12 != r14) goto L_0x0112
            qj1.c r12 = r1.f172118c
            androidx.lifecycle.i0 r12 = r12.mo87696x0(r5)
            cl1.o r12 = (cl1.C54991o) r12
            boolean r12 = r12.f154393z1
            if (r12 != 0) goto L_0x0112
            boolean r12 = r1.f172099A
            if (r12 != 0) goto L_0x0112
            if (r10 == 0) goto L_0x0112
            java.lang.String r3 = "do preload CgiFinderLiveGetGameTeamInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            r1.mo85332g(r15)
            goto L_0x031a
        L_0x0112:
            r10 = 3
            if (r7 == r10) goto L_0x0128
            r12 = 4
            if (r7 == r12) goto L_0x0128
            qj1.c r7 = r1.f172118c
            androidx.lifecycle.i0 r7 = r7.mo87696x0(r5)
            cl1.o r7 = (cl1.C54991o) r7
            boolean r7 = r7.f154393z1
            if (r7 != 0) goto L_0x0128
            int r7 = r3.f182182i
            if (r7 != 0) goto L_0x0147
        L_0x0128:
            boolean r7 = r1.f172099A
            if (r7 == 0) goto L_0x0147
            qj1.c r3 = r1.f172118c
            qj1.c r3 = r3.mo87687E0(r6)
            qj1.w6 r3 = (qj1.C63084w6) r3
            if (r3 == 0) goto L_0x013d
            il1.p4 r3 = r3.f179023q
            if (r3 == 0) goto L_0x013d
            r3.mo85445a()
        L_0x013d:
            r1.f172099A = r15
            java.lang.String r1 = "status is Team_Full or Not_In_Team_Up, hide join game guide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x031a
        L_0x0147:
            boolean r7 = r1.f172099A
            if (r7 == 0) goto L_0x0198
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.String r10 = r3.f182178e
            r7[r15] = r10
            int r10 = r3.f182185o
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7[r14] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 2
            r7[r11] = r10
            java.lang.String r10 = "showing join game guide， title:%s, info teamup_gift_status:%d, msg teamup_gift_status:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r7)
            qj1.c r7 = r1.f172118c
            qj1.c r7 = r7.mo87687E0(r6)
            qj1.w6 r7 = (qj1.C63084w6) r7
            if (r7 == 0) goto L_0x0179
            il1.p4 r7 = r7.f179023q
            if (r7 == 0) goto L_0x0179
            java.lang.String r10 = r3.f182178e
            r7.mo85449e(r10, r15)
        L_0x0179:
            qj1.c r1 = r1.f172118c
            qj1.c r1 = r1.mo87687E0(r6)
            qj1.w6 r1 = (qj1.C63084w6) r1
            if (r1 == 0) goto L_0x031a
            il1.p4 r1 = r1.f179023q
            if (r1 == 0) goto L_0x031a
            java.lang.String r6 = r3.f182180g
            java.lang.String r7 = r3.f182196z
            te3.yr1 r3 = r3.f182184n
            if (r3 == 0) goto L_0x0192
            int r3 = r3.f186594r
            goto L_0x0193
        L_0x0192:
            r3 = 0
        L_0x0193:
            r1.mo85448d(r6, r7, r3)
            goto L_0x031a
        L_0x0198:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r11, r3)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r3 = r11.booleanValue()
            if (r3 != 0) goto L_0x02d5
            boolean r3 = r1.f172141z
            if (r3 != 0) goto L_0x02d5
            boolean r3 = r1.f172100B
            if (r3 != 0) goto L_0x02d5
            qj1.c r3 = r1.f172118c
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r5)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.f154195E1
            if (r3 != 0) goto L_0x02d5
            java.lang.String r3 = "show new guide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            qj1.c r3 = r1.f172118c
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r5)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r3 = r3.f154379w1
            qj1.c r7 = r1.f172118c
            qj1.c r7 = r7.mo87687E0(r6)
            qj1.w6 r7 = (qj1.C63084w6) r7
            if (r7 == 0) goto L_0x01d6
            il1.p4 r7 = r7.f179023q
            goto L_0x01d7
        L_0x01d6:
            r7 = 0
        L_0x01d7:
            if (r7 != 0) goto L_0x01da
            goto L_0x01e2
        L_0x01da:
            il1.y7 r10 = new il1.y7
            r10.<init>(r1, r3)
            r7.setMListener(r10)
        L_0x01e2:
            qj1.c r7 = r1.f172118c
            qj1.c r7 = r7.mo87687E0(r6)
            qj1.w6 r7 = (qj1.C63084w6) r7
            if (r7 == 0) goto L_0x01ef
            il1.p4 r7 = r7.f179023q
            goto L_0x01f0
        L_0x01ef:
            r7 = 0
        L_0x01f0:
            if (r7 != 0) goto L_0x01f3
            goto L_0x01fb
        L_0x01f3:
            il1.z7 r10 = new il1.z7
            r10.<init>(r1, r3)
            r7.setMCloseListener(r10)
        L_0x01fb:
            qj1.c r7 = r1.f172118c
            qj1.c r7 = r7.mo87687E0(r6)
            qj1.w6 r7 = (qj1.C63084w6) r7
            if (r7 == 0) goto L_0x0237
            il1.p4 r7 = r7.f179023q
            if (r7 == 0) goto L_0x0237
            android.view.ViewGroup r10 = r1.f172116a
            android.content.Context r10 = r10.getContext()
            if (r3 == 0) goto L_0x0226
            te3.e05 r11 = r3.f182195y
            if (r11 == 0) goto L_0x0226
            java.lang.String r11 = r11.f182913d
            if (r11 == 0) goto L_0x0226
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0221
            r11 = 1
            goto L_0x0222
        L_0x0221:
            r11 = 0
        L_0x0222:
            if (r11 != r14) goto L_0x0226
            r11 = 1
            goto L_0x0227
        L_0x0226:
            r11 = 0
        L_0x0227:
            if (r11 == 0) goto L_0x022d
            r11 = 2131826790(0x7f111866, float:1.9286474E38)
            goto L_0x0230
        L_0x022d:
            r11 = 2131826761(0x7f111849, float:1.9286416E38)
        L_0x0230:
            java.lang.String r10 = r10.getString(r11)
            r7.mo85449e(r10, r14)
        L_0x0237:
            qj1.c r7 = r1.f172118c
            qj1.c r7 = r7.mo87687E0(r6)
            qj1.w6 r7 = (qj1.C63084w6) r7
            if (r7 == 0) goto L_0x0249
            il1.p4 r7 = r7.f179023q
            if (r7 == 0) goto L_0x0249
            r10 = 0
            r7.mo85448d(r8, r10, r15)
        L_0x0249:
            qj1.c r7 = r1.f172118c
            androidx.lifecycle.i0 r7 = r7.mo87696x0(r5)
            cl1.o r7 = (cl1.C54991o) r7
            qj1.c r7 = r1.f172118c
            androidx.lifecycle.i0 r7 = r7.mo87696x0(r5)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154367t1
            if (r3 == 0) goto L_0x0263
            int r10 = r3.f182185o
            if (r10 != r14) goto L_0x0263
            r10 = 1
            goto L_0x0264
        L_0x0263:
            r10 = 0
        L_0x0264:
            if (r10 == 0) goto L_0x026b
            int r7 = r3.f182185o
            java.lang.String r3 = r3.f182186p
            goto L_0x026d
        L_0x026b:
            r3 = r7
            r7 = 0
        L_0x026d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "teamup_gift_status:"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            if (r7 != r14) goto L_0x0296
            qj1.c r10 = r1.f172118c
            qj1.c r10 = r10.mo87687E0(r6)
            qj1.w6 r10 = (qj1.C63084w6) r10
            if (r10 == 0) goto L_0x02a7
            il1.p4 r10 = r10.f179023q
            if (r10 == 0) goto L_0x02a7
            r10.setGiftTitle(r3)
            goto L_0x02a7
        L_0x0296:
            qj1.c r3 = r1.f172118c
            qj1.c r3 = r3.mo87687E0(r6)
            qj1.w6 r3 = (qj1.C63084w6) r3
            if (r3 == 0) goto L_0x02a7
            il1.p4 r3 = r3.f179023q
            if (r3 == 0) goto L_0x02a7
            r3.setGiftTitle(r8)
        L_0x02a7:
            di3.d r3 = di3.C86312j.m106911c(r2)
            ak1.w r3 = (ak1.C54116w) r3
            r10 = 17
            java.lang.String r7 = r1.mo85334i(r7, r10)
            r3.fy0(r7)
            r1.f172141z = r14
            r1.f172099A = r15
            qj1.c r3 = r1.f172118c
            qj1.c r3 = r3.mo87687E0(r6)
            qj1.w6 r3 = (qj1.C63084w6) r3
            if (r3 == 0) goto L_0x02cb
            il1.p4 r3 = r3.f179023q
            if (r3 == 0) goto L_0x02cb
            r3.mo85450f()
        L_0x02cb:
            d60.b r1 = r1.f172117b
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_SHOW_GAME_JOIN_GUIDE
            r6 = 2
            r7 = 0
            d60.C58124b.C7172a.m7372a(r1, r3, r7, r6, r7)
            goto L_0x031a
        L_0x02d5:
            boolean r1 = r1.f172141z
            if (r1 == 0) goto L_0x02e0
            java.lang.String r1 = "showing new guide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x031a
        L_0x02e0:
            java.lang.String r1 = "checkShowGuide, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x031a
        L_0x02e6:
            il1.c7 r1 = r0.f172441d
            qj1.c r1 = r1.f172118c
            qj1.c r1 = r1.mo87687E0(r6)
            qj1.w6 r1 = (qj1.C63084w6) r1
            if (r1 == 0) goto L_0x02ff
            il1.p4 r1 = r1.f179023q
            if (r1 == 0) goto L_0x02ff
            java.lang.Boolean r1 = r1.mo85447c()
            boolean r1 = gy3.C87412m.m108589b(r1, r7)
            goto L_0x0300
        L_0x02ff:
            r1 = 0
        L_0x0300:
            if (r1 == 0) goto L_0x031a
            il1.c7 r1 = r0.f172441d
            qj1.c r1 = r1.f172118c
            qj1.c r1 = r1.mo87687E0(r6)
            qj1.w6 r1 = (qj1.C63084w6) r1
            if (r1 == 0) goto L_0x0315
            il1.p4 r1 = r1.f179023q
            if (r1 == 0) goto L_0x0315
            r1.mo85445a()
        L_0x0315:
            il1.c7 r1 = r0.f172441d
            r1.mo85336k()
        L_0x031a:
            r1 = 0
            goto L_0x0397
        L_0x031d:
            il1.c7 r1 = r0.f172441d
            r1.f172100B = r15
            qj1.c r1 = r1.f172118c
            qj1.c r1 = r1.mo87687E0(r6)
            qj1.w6 r1 = (qj1.C63084w6) r1
            if (r1 == 0) goto L_0x0338
            il1.p4 r1 = r1.f179023q
            if (r1 == 0) goto L_0x0338
            java.lang.Boolean r1 = r1.mo85447c()
            boolean r1 = gy3.C87412m.m108589b(r1, r7)
            goto L_0x0339
        L_0x0338:
            r1 = 0
        L_0x0339:
            if (r1 == 0) goto L_0x0353
            il1.c7 r1 = r0.f172441d
            qj1.c r1 = r1.f172118c
            qj1.c r1 = r1.mo87687E0(r6)
            qj1.w6 r1 = (qj1.C63084w6) r1
            if (r1 == 0) goto L_0x034e
            il1.p4 r1 = r1.f179023q
            if (r1 == 0) goto L_0x034e
            r1.mo85445a()
        L_0x034e:
            il1.c7 r1 = r0.f172441d
            r1.mo85336k()
        L_0x0353:
            il1.c7 r1 = r0.f172441d
            qo3.w r1 = r1.f172130o
            if (r1 == 0) goto L_0x0361
            boolean r1 = r1.mo12466f()
            if (r1 != r14) goto L_0x0361
            r1 = 1
            goto L_0x0362
        L_0x0361:
            r1 = 0
        L_0x0362:
            if (r1 == 0) goto L_0x0387
            il1.c7 r1 = r0.f172441d
            qo3.w r1 = r1.f172130o
            if (r1 == 0) goto L_0x036d
            r1.mo5085n()
        L_0x036d:
            il1.c7 r1 = r0.f172441d
            android.view.ViewGroup r1 = r1.f172116a
            android.content.Context r1 = r1.getContext()
            il1.c7 r3 = r0.f172441d
            android.view.ViewGroup r3 = r3.f172116a
            android.content.Context r3 = r3.getContext()
            r6 = 2131826763(0x7f11184b, float:1.928642E38)
            java.lang.String r3 = kg3.C76577a.m92166q(r3, r6)
            nj3.C76912y0.m92767f(r1, r3)
        L_0x0387:
            r6 = 0
            il1.C60362c7.f172095S = r6
            il1.C60362c7.f172096T = r15
            il1.C60362c7.f172097U = r8
            r1 = 0
            il1.C60362c7.f172098V = r1
            java.lang.String r3 = "resetLastGameTeamClick, from:CheckVisibleGone"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
        L_0x0397:
            di3.d r3 = di3.C86312j.m106911c(r4)
            ky2.i r3 = (ky2.C10432i) r3
            boolean r3 = r3.mo10750e()
            if (r3 != 0) goto L_0x05cf
            il1.c7 r3 = r0.f172441d
            qj1.c r4 = r3.f172118c
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r5)
            cl1.o r4 = (cl1.C54991o) r4
            te3.bu0 r4 = r4.f154183B1
            qj1.c r6 = r3.f172118c
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r5)
            cl1.o r6 = (cl1.C54991o) r6
            long r6 = r6.f154187C1
            long r10 = r3.f172105G
            r12 = 0
            int r19 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r19 != 0) goto L_0x03cd
            qj1.c r10 = r3.f172118c
            androidx.lifecycle.i0 r5 = r10.mo87696x0(r5)
            cl1.o r5 = (cl1.C54991o) r5
            long r10 = r5.f154191D1
            r3.f172105G = r10
        L_0x03cd:
            java.lang.String r5 = "checkGameInvitation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            boolean r5 = r3.f172108J
            if (r5 == 0) goto L_0x03de
            java.lang.String r1 = "showing jump game team dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x05d4
        L_0x03de:
            boolean r5 = r3.f172107I
            if (r5 == 0) goto L_0x03ea
            java.lang.String r1 = "showing jump game invitation dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x05d4
        L_0x03ea:
            if (r4 != 0) goto L_0x03f3
            java.lang.String r1 = "game invitation is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x05d4
        L_0x03f3:
            boolean r5 = r3.f172106H
            if (r5 == 0) goto L_0x0409
            te3.bu0 r10 = r3.f172104F
            if (r10 == 0) goto L_0x0409
            long r10 = r3.f172105G
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0409
            java.lang.String r1 = "showing the same game invitation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            goto L_0x05d4
        L_0x0409:
            if (r5 == 0) goto L_0x041c
            te3.bu0 r5 = r3.f172104F
            if (r5 == 0) goto L_0x041c
            long r10 = r3.f172105G
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x041c
            java.lang.String r5 = "showing game invitation, but info diff"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            goto L_0x0470
        L_0x041c:
            te3.bu0 r5 = r3.f172104F
            java.lang.String r10 = "lastGameInvitationSeq:%d, gameInvitationInfoSeq:%d"
            if (r5 == 0) goto L_0x0428
            long r11 = r3.f172105G
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x0436
        L_0x0428:
            if (r5 != 0) goto L_0x0451
            long r11 = r3.f172105G
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0451
            r16 = 0
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0451
        L_0x0436:
            java.lang.String r1 = "don't show same game invitation again"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = r3.f172105G
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r15] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r1[r14] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r1)
            goto L_0x05d4
        L_0x0451:
            java.lang.String r5 = "show game invitation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            long r11 = r3.f172105G
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r5[r15] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            r5[r14] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r5)
            int r5 = r3.f172109K
            r3.mo85332g(r5)
        L_0x0470:
            qo3.w r5 = r3.f172130o
            if (r5 == 0) goto L_0x0477
            r5.mo5085n()
        L_0x0477:
            android.view.ViewGroup r5 = r3.f172116a
            android.content.Context r5 = r5.getContext()
            java.lang.String r10 = "root.context"
            gy3.C87412m.m108593f(r5, r10)
            r3.mo85342q(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "checkGameInvitation gameInvitation bottomSheet: invitation_id:"
            r5.append(r10)
            java.lang.String r10 = r4.f182336g
            r5.append(r10)
            java.lang.String r10 = ", title:"
            r5.append(r10)
            java.lang.String r10 = r4.f182333d
            r5.append(r10)
            java.lang.String r10 = ", sub_title:"
            r5.append(r10)
            java.lang.String r10 = r4.f182334e
            r5.append(r10)
            java.lang.String r10 = ", wording:"
            r5.append(r10)
            java.lang.String r10 = r4.f182335f
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            android.widget.TextView r5 = r3.f172119d
            if (r5 != 0) goto L_0x04be
            goto L_0x04c7
        L_0x04be:
            java.lang.String r9 = r4.f182333d
            if (r9 == 0) goto L_0x04c3
            goto L_0x04c4
        L_0x04c3:
            r9 = r8
        L_0x04c4:
            r5.setText(r9)
        L_0x04c7:
            android.widget.TextView r5 = r3.f172120e
            if (r5 != 0) goto L_0x04cc
            goto L_0x04d5
        L_0x04cc:
            java.lang.String r9 = r4.f182334e
            if (r9 == 0) goto L_0x04d1
            goto L_0x04d2
        L_0x04d1:
            r9 = r8
        L_0x04d2:
            r5.setText(r9)
        L_0x04d5:
            android.widget.TextView r5 = r3.f172121f
            if (r5 != 0) goto L_0x04da
            goto L_0x04e2
        L_0x04da:
            java.lang.String r9 = r4.f182335f
            if (r9 == 0) goto L_0x04df
            r8 = r9
        L_0x04df:
            r5.setText(r8)
        L_0x04e2:
            android.widget.TextView r5 = r3.f172120e
            if (r5 == 0) goto L_0x04eb
            java.lang.CharSequence r13 = r5.getText()
            goto L_0x04ec
        L_0x04eb:
            r13 = r1
        L_0x04ec:
            if (r13 == 0) goto L_0x04f7
            int r1 = r13.length()
            if (r1 != 0) goto L_0x04f5
            goto L_0x04f7
        L_0x04f5:
            r1 = 0
            goto L_0x04f8
        L_0x04f7:
            r1 = 1
        L_0x04f8:
            r5 = 8
            if (r1 == 0) goto L_0x0505
            android.widget.TextView r1 = r3.f172120e
            if (r1 != 0) goto L_0x0501
            goto L_0x050d
        L_0x0501:
            r1.setVisibility(r5)
            goto L_0x050d
        L_0x0505:
            android.widget.TextView r1 = r3.f172120e
            if (r1 != 0) goto L_0x050a
            goto L_0x050d
        L_0x050a:
            r1.setVisibility(r15)
        L_0x050d:
            android.view.View r1 = r3.f172129n
            if (r1 != 0) goto L_0x0512
            goto L_0x0553
        L_0x0512:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.mo10233c(r5)
            java.lang.Object[] r17 = r8.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r19 = "checkGameInvitation"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r8.mo10231a(r15)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r18 = "checkGameInvitation"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0553:
            int r1 = r3.f172103E
            r3.f172101C = r1
            android.widget.TextView r1 = r3.f172122g
            r5 = 2131232532(0x7f080714, float:1.8081176E38)
            if (r1 == 0) goto L_0x0561
            r1.setBackgroundResource(r5)
        L_0x0561:
            android.widget.TextView r1 = r3.f172122g
            if (r1 != 0) goto L_0x0566
            goto L_0x0569
        L_0x0566:
            r1.setClickable(r14)
        L_0x0569:
            android.widget.TextView r1 = r3.f172122g
            if (r1 != 0) goto L_0x056e
            goto L_0x0582
        L_0x056e:
            android.view.ViewGroup r8 = r3.f172116a
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165315(0x7f070083, float:1.7944844E38)
            int r8 = r8.getDimensionPixelOffset(r9)
            r1.setWidth(r8)
        L_0x0582:
            android.widget.TextView r1 = r3.f172122g
            if (r1 != 0) goto L_0x0587
            goto L_0x0597
        L_0x0587:
            android.view.ViewGroup r8 = r3.f172116a
            android.content.Context r8 = r8.getContext()
            r9 = 2131826730(0x7f11182a, float:1.9286353E38)
            java.lang.String r8 = r8.getString(r9)
            r1.setText(r8)
        L_0x0597:
            android.widget.TextView r1 = r3.f172122g
            if (r1 == 0) goto L_0x059e
            r1.setBackgroundResource(r5)
        L_0x059e:
            android.widget.TextView r1 = r3.f172122g
            if (r1 == 0) goto L_0x05aa
            il1.h7 r5 = new il1.h7
            r5.<init>(r3)
            r1.setOnClickListener(r5)
        L_0x05aa:
            r3.f172104F = r4
            r3.f172105G = r6
            qo3.w r1 = r3.f172130o
            if (r1 == 0) goto L_0x05b5
            r1.mo5086o()
        L_0x05b5:
            r3.f172106H = r14
            di3.d r1 = di3.C86312j.m106911c(r2)
            java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r3 = r1
            ak1.w r3 = (ak1.C54116w) r3
            r4 = 14
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r9 = 0
            ak1.C54116w.gy0(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05d4
        L_0x05cf:
            java.lang.String r1 = "gameInfo is null or is isTeenMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r1)
        L_0x05d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60494p7.onChanged(java.lang.Object):void");
    }
}
