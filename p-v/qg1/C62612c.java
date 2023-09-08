package qg1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58286q;
import gy3.C87412m;
import java.util.LinkedList;
import ls3.C61398h;
import ob0.C117747y;
import te3.C48742ao0;
import te3.C49335eu3;
import te3.C52285zn0;
import te3.C64273c21;
import te3.C64674r41;

/* renamed from: qg1.c */
public final class C62612c extends C58286q<C48742ao0> {

    /* renamed from: t */
    public final int f177811t;

    /* renamed from: u */
    public final String f177812u;

    /* renamed from: v */
    public final String f177813v = "Finder.CgiFinderGetLiveMsg";

    /* renamed from: w */
    public C61398h.C61400b f177814w;

    /* renamed from: x */
    public C52285zn0 f177815x;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0094, code lost:
        r12 = (r12 = (r12 = (r12 = r12.f154421r).f166251b).f166244n).f186807e;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x046a A[Catch:{ Exception -> 0x068d }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x046d A[Catch:{ Exception -> 0x068d }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0491 A[Catch:{ Exception -> 0x068d }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04b8 A[Catch:{ Exception -> 0x068d }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x052b A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0544 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x056c A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x057d A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x057f A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0591 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0593 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05a7 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x05b0 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x05c4 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x05c6 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x05de A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x05e0 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x05f2 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x05f4 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0637 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0641 A[Catch:{ Exception -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x038c A[Catch:{ Exception -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62612c(te3.C49842ig0 r21, java.lang.String r22, byte[] r23, long r24, long r26, java.lang.String r28, int r29, boolean r30, int r31, te3.C64840xw0 r32, int r33, te3.C49712hj1 r34, java.lang.String r35, ls3.C61398h.C61400b r36, java.lang.String r37, te3.C50317lw0 r38, te3.C64414h71 r39, boolean r40) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            r3 = r28
            r4 = r30
            r5 = r31
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            java.lang.Class<cl1.u> r10 = cl1.C55001u.class
            java.lang.String r11 = "finderBaseRequest"
            gy3.C87412m.m108594g(r0, r11)
            java.lang.String r11 = "nonceId"
            gy3.C87412m.m108594g(r3, r11)
            java.lang.String r11 = "contextObj"
            gy3.C87412m.m108594g(r7, r11)
            java.lang.String r11 = "callback"
            gy3.C87412m.m108594g(r9, r11)
            r1.<init>(r7)
            r1.f177811t = r6
            r1.f177812u = r8
            java.lang.String r11 = "Finder.CgiFinderGetLiveMsg"
            r1.f177813v = r11
            r1.f177814w = r9
            te3.zn0 r9 = new te3.zn0
            r9.<init>()
            r1.f177815x = r9
            r9.f146111d = r0
            r0 = r22
            r9.f146114g = r0
            pe3.b r0 = pe3.C89349b.m111674a(r23)
            r9.f146112e = r0
            te3.zn0 r0 = r1.f177815x
            r12 = r24
            r0.f146113f = r12
            r12 = r26
            r0.f146116i = r12
            r0.f146118n = r3
            r3 = r29
            r0.f146115h = r3
            r0.f146117j = r4
            r3 = r32
            r0.f146119o = r3
            r3 = r38
            r0.f146123s = r3
            r3 = r39
            r0.f146124t = r3
            r0.f146125u = r5
            ok1.e r3 = ok1.C62042e.f176370a
            boolean r9 = r3.mo87030O0()
            java.lang.String r14 = ""
            if (r9 != 0) goto L_0x009f
            te3.yn0 r9 = new te3.yn0
            r9.<init>()
            te3.w41 r15 = new te3.w41
            r15.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r12 = r12.mo77630e(r10)
            cl1.u r12 = (cl1.C55001u) r12
            if (r12 == 0) goto L_0x0098
            d50.h r12 = r12.f154421r
            if (r12 == 0) goto L_0x0098
            d50.g r12 = r12.f166251b
            if (r12 == 0) goto L_0x0098
            te3.zp2 r12 = r12.f166244n
            if (r12 == 0) goto L_0x0098
            java.lang.String r12 = r12.f186807e
            if (r12 != 0) goto L_0x0099
        L_0x0098:
            r12 = r14
        L_0x0099:
            r15.f143853d = r12
            r9.f145419d = r15
            r0.f146126v = r9
        L_0x009f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "[cgi-doGetLiveMsg] cookie is Empty: "
            r0.append(r9)
            r9 = 0
            r13 = 1
            if (r2 == 0) goto L_0x00b8
            int r2 = r2.length
            if (r2 != 0) goto L_0x00b2
            r2 = 1
            goto L_0x00b3
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x00b9
        L_0x00b8:
            r2 = r9
        L_0x00b9:
            r0.append(r2)
            java.lang.String r2 = ", offline:"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ", offline_scene:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = "  curStreamId: "
            r0.append(r2)
            te3.zn0 r2 = r1.f177815x
            te3.yn0 r2 = r2.f146126v
            if (r2 == 0) goto L_0x00de
            te3.w41 r2 = r2.f145419d
            if (r2 == 0) goto L_0x00de
            java.lang.String r2 = r2.f143853d
            goto L_0x00df
        L_0x00de:
            r2 = r9
        L_0x00df:
            if (r2 != 0) goto L_0x00e2
            r2 = r14
        L_0x00e2:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ken_debug"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            if (r37 == 0) goto L_0x00f9
            te3.zn0 r0 = r1.f177815x
            pe3.b r2 = pe3.C89349b.m111675b(r37)
            r0.f146120p = r2
            goto L_0x00fe
        L_0x00f9:
            java.lang.String r0 = "ljd live sei is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x00fe:
            je1.h2 r0 = je1.C46523h2.f125330a
            te3.zn0 r2 = r1.f177815x
            te3.ig0 r2 = r2.f146111d
            rx3.l r4 = new rx3.l
            int r5 = r7.f134675i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Long r7 = java.lang.Long.valueOf(r26)
            r4.<init>(r5, r7)
            java.util.List r4 = sx3.C26236u.m33719b(r4)
            r0.mo71865g(r2, r4, r9)
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.zn0 r2 = r1.f177815x
            r0.f127066a = r2
            te3.ao0 r2 = new te3.ao0
            r2.<init>()
            te3.ja r4 = new te3.ja
            r4.<init>()
            r2.setBaseResponse(r4)
            te3.ja r4 = r2.getBaseResponse()
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            r4.f135956e = r5
            r0.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/findergetlivemsg"
            r0.f127068c = r2
            r2 = 3976(0xf88, float:5.572E-42)
            r0.f127069d = r2
            r0.f127075j = r13
            r2 = 25000(0x61a8, float:3.5032E-41)
            r0.f127076k = r2
            ob0.c r0 = r0.mo72403a()
            r1.mo123453j(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "CgiFinderGetLiveMsg init "
            r0.append(r2)
            te3.zn0 r2 = r1.f177815x
            long r4 = r2.f146113f
            r0.append(r4)
            r2 = 44
            r0.append(r2)
            te3.zn0 r4 = r1.f177815x
            java.lang.String r4 = r4.f146114g
            r0.append(r4)
            r0.append(r2)
            te3.zn0 r2 = r1.f177815x
            int r2 = r2.f146115h
            r0.append(r2)
            java.lang.String r2 = ",liveCookies is null:"
            r0.append(r2)
            te3.zn0 r2 = r1.f177815x
            pe3.b r2 = r2.f146112e
            if (r2 != 0) goto L_0x0186
            r2 = 1
            goto L_0x0187
        L_0x0186:
            r2 = 0
        L_0x0187:
            r0.append(r2)
            java.lang.String r2 = ",reqVisitorRoleType:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = ", request.offline:"
            r0.append(r2)
            te3.zn0 r2 = r1.f177815x
            boolean r2 = r2.f146117j
            r0.append(r2)
            java.lang.String r2 = ", uniqueId:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.w r0 = (ak1.C54116w) r0
            te3.zn0 r2 = r1.f177815x
            ob0.c r4 = r1.f256789f
            java.lang.String r5 = "reqResp"
            gy3.C87412m.m108593f(r4, r5)
            r0.getClass()
            java.lang.Class<ak1.o> r5 = ak1.C54108o.class
            java.lang.Class<kq.h> r6 = p185kq.C10383h.class
            java.lang.Class<l31.e> r7 = l31.C61212e.class
            java.lang.Class<kq.g> r8 = p185kq.C61130g.class
            java.lang.Class<cl1.o> r11 = cl1.C54991o.class
            java.lang.String r15 = "request"
            gy3.C87412m.m108594g(r2, r15)
            r15 = r10
            long r9 = r2.f146113f
            r16 = 1
            int r18 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x01db
            goto L_0x06cd
        L_0x01db:
            fj1.b r9 = fj1.C45795b.f123698n
            if (r9 == 0) goto L_0x01ed
            androidx.lifecycle.i0 r9 = r9.mo71262a(r11)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.mo75997d4()
            if (r9 != r13) goto L_0x01ed
            r9 = 1
            goto L_0x01ee
        L_0x01ed:
            r9 = 0
        L_0x01ee:
            if (r9 == 0) goto L_0x01f2
            goto L_0x06cd
        L_0x01f2:
            fj1.b r9 = fj1.C45795b.f123698n
            if (r9 == 0) goto L_0x01ff
            androidx.lifecycle.i0 r9 = r9.mo71262a(r11)
            cl1.o r9 = (cl1.C54991o) r9
            int r9 = r9.f154291a1
            goto L_0x0200
        L_0x01ff:
            r9 = 0
        L_0x0200:
            r10 = 128(0x80, float:1.794E-43)
            boolean r9 = o40.C61926c.m72696u(r9, r10)
            if (r9 == 0) goto L_0x020a
            goto L_0x06cd
        L_0x020a:
            gy3.e0 r9 = new gy3.e0
            r9.<init>()
            long r12 = java.lang.System.currentTimeMillis()
            r9.f124000d = r12
            long r16 = ak1.C54116w.f151889l1
            long r12 = r12 - r16
            r16 = 10000(0x2710, double:4.9407E-320)
            r18 = 0
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x0243
            long r12 = r2.f146113f
            long r16 = ak1.C54116w.f151888k1
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x0243
            long r12 = r0.yx0(r12)
            long r16 = ak1.C54116w.f151894q1
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x0243
            long r12 = r2.f146113f
            long r12 = r0.yx0(r12)
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x0243
            boolean r10 = r2.f146117j
            if (r10 != 0) goto L_0x0243
            goto L_0x06cd
        L_0x0243:
            di3.d r10 = di3.C86312j.m106911c(r8)
            kq.g r10 = (p185kq.C61130g) r10
            long r12 = r2.f146113f
            boolean r10 = r10.mo33242Sx(r12)
            java.lang.String r12 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            if (r10 == 0) goto L_0x0288
            di3.d r13 = di3.C86312j.m106911c(r8)
            kq.g r13 = (p185kq.C61130g) r13
            r23 = r5
            r25 = r6
            long r5 = r2.f146113f
            r13.mo33247sq(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "set isLiveScroll false  !!! requestLiveId "
            r5.append(r6)
            r26 = r8
            r27 = r9
            long r8 = r2.f146113f
            r5.append(r8)
            java.lang.String r6 = ", lastLiveId : "
            r5.append(r6)
            long r8 = ak1.C54116w.f151888k1
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            goto L_0x0290
        L_0x0288:
            r23 = r5
            r25 = r6
            r26 = r8
            r27 = r9
        L_0x0290:
            long r5 = r2.f146113f
            long r8 = ak1.C54116w.f151888k1
            r13 = -1
            int r16 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x02b1
            long r8 = ak1.C54116w.f151894q1
            int r16 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x02a9
            long r5 = r0.yx0(r5)
            long r8 = ak1.C54116w.f151894q1
            int r16 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x02b1
        L_0x02a9:
            boolean r5 = ak1.C54116w.f151887j1
            if (r5 == 0) goto L_0x02d9
            boolean r5 = r2.f146117j
            if (r5 != 0) goto L_0x02d9
        L_0x02b1:
            ak1.C54116w.f151892o1 = r13
            ak1.C54116w.f151890m1 = r18
            ak1.C54116w.f151893p1 = r13
            ak1.C54116w.f151891n1 = r18
            if (r10 != 0) goto L_0x02d9
            ak1.C54116w.f151895r1 = r14
            r5 = 0
            ak1.C54116w.f151896s1 = r5
            di3.d r6 = di3.C86312j.m106911c(r7)
            l31.e r6 = (l31.C61212e) r6
            ak1.s r8 = ak1.C27912s.f77095a
            r6.mo86134Ei(r8)
            di3.d r6 = di3.C86312j.m106911c(r7)
            l31.e r6 = (l31.C61212e) r6
            ak1.t r8 = ak1.C54113t.f151884a
            java.lang.String r9 = "page_in"
            r6.Z50(r9, r8)
            goto L_0x02da
        L_0x02d9:
            r5 = 0
        L_0x02da:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "liveId : "
            r6.append(r8)
            long r8 = r2.f146113f
            r6.append(r8)
            java.lang.String r8 = ", enterSessionId : "
            r6.append(r8)
            long r8 = r2.f146113f
            long r8 = r0.yx0(r8)
            r6.append(r8)
            java.lang.String r8 = ", offline : "
            r6.append(r8)
            boolean r8 = r2.f146117j
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgLastLiveId : "
            r6.append(r8)
            long r8 = ak1.C54116w.f151888k1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgLastTime : "
            r6.append(r8)
            long r8 = ak1.C54116w.f151889l1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgLastReqTime : "
            r6.append(r8)
            long r8 = ak1.C54116w.f151890m1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgLastRespTime : "
            r6.append(r8)
            long r8 = ak1.C54116w.f151891n1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgReqSeq : "
            r6.append(r8)
            int r8 = ak1.C54116w.f151892o1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgRespSeq : "
            r6.append(r8)
            int r8 = ak1.C54116w.f151893p1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgEnterSessionId : "
            r6.append(r8)
            long r8 = ak1.C54116w.f151894q1
            r6.append(r8)
            java.lang.String r8 = ", sCgiGetLiveMsgLastOffile : "
            r6.append(r8)
            boolean r8 = ak1.C54116w.f151887j1
            r6.append(r8)
            java.lang.String r8 = ", roleType : "
            r6.append(r8)
            boolean r3 = r3.mo87027N0()
            r8 = 1
            r3 = r3 ^ r8
            r6.append(r3)
            java.lang.String r3 = ", isLiveScroll : "
            r6.append(r3)
            r6.append(r10)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "bindGetLiveMsgCgiReportInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            boolean r3 = r2.f146117j
            ak1.C54116w.f151887j1 = r3
            r3 = r27
            long r8 = r3.f124000d
            ak1.C54116w.f151889l1 = r8
            long r8 = r2.f146113f
            ak1.C54116w.f151888k1 = r8
            long r8 = r0.yx0(r8)
            ak1.C54116w.f151894q1 = r8
            java.lang.String r6 = r0.f151927X0     // Catch:{ Exception -> 0x039f }
            boolean r6 = u24.C90599h.m113511d(r6)     // Catch:{ Exception -> 0x039f }
            if (r6 != 0) goto L_0x03a0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x039f }
            java.lang.String r8 = r0.f151927X0     // Catch:{ Exception -> 0x039f }
            r6.<init>(r8)     // Catch:{ Exception -> 0x039f }
            java.lang.String r8 = "appid"
            java.lang.String r6 = r6.getString(r8)     // Catch:{ Exception -> 0x039f }
            java.lang.String r8 = "JSONObject(scenenote).getString(\"appid\")"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ Exception -> 0x039f }
            goto L_0x03a1
        L_0x039f:
        L_0x03a0:
            r6 = r14
        L_0x03a1:
            fj1.b r8 = fj1.C45795b.f123698n
            if (r8 == 0) goto L_0x03af
            androidx.lifecycle.i0 r8 = r8.mo71262a(r11)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r8 = r8.f154345o
            if (r8 != 0) goto L_0x03b0
        L_0x03af:
            r8 = r14
        L_0x03b0:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            fj1.b r5 = fj1.C45795b.f123698n
            if (r5 == 0) goto L_0x03cc
            androidx.lifecycle.i0 r5 = r5.mo71262a(r15)
            cl1.u r5 = (cl1.C55001u) r5
            d50.h r5 = r5.f154421r
            if (r5 == 0) goto L_0x03cc
            d50.g r5 = r5.f166251b
            if (r5 == 0) goto L_0x03cc
            int r5 = r5.mo82868a()
            goto L_0x03cd
        L_0x03cc:
            r5 = 0
        L_0x03cd:
            java.lang.String r15 = "birate"
            r9.put(r15, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0691 }
            r5.<init>()     // Catch:{ Exception -> 0x0691 }
            java.lang.String r15 = "bind isLiveScroll :   "
            r5.append(r15)     // Catch:{ Exception -> 0x0691 }
            r5.append(r10)     // Catch:{ Exception -> 0x0691 }
            java.lang.String r15 = "   liveId : "
            r5.append(r15)     // Catch:{ Exception -> 0x0691 }
            r28 = r14
            long r13 = r2.f146113f     // Catch:{ Exception -> 0x0691 }
            r5.append(r13)     // Catch:{ Exception -> 0x0691 }
            java.lang.String r13 = "  get_live_msg_cgi_req_seq "
            r5.append(r13)     // Catch:{ Exception -> 0x0691 }
            int r13 = ak1.C54116w.f151892o1     // Catch:{ Exception -> 0x0691 }
            r5.append(r13)     // Catch:{ Exception -> 0x0691 }
            java.lang.String r13 = ", rr "
            r5.append(r13)     // Catch:{ Exception -> 0x0691 }
            int r13 = r4.hashCode()     // Catch:{ Exception -> 0x0691 }
            r5.append(r13)     // Catch:{ Exception -> 0x0691 }
            r13 = 32
            r5.append(r13)     // Catch:{ Exception -> 0x0691 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0691 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ Exception -> 0x0691 }
            di3.d r5 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0691 }
            l31.e r5 = (l31.C61212e) r5     // Catch:{ Exception -> 0x0691 }
            r13 = 27
            rx3.l[] r13 = new rx3.C13604l[r13]     // Catch:{ Exception -> 0x0691 }
            java.lang.String r14 = "live_id"
            di3.d r15 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x0691 }
            kq.h r15 = (p185kq.C10383h) r15     // Catch:{ Exception -> 0x0691 }
            r17 = r3
            r16 = r4
            long r3 = r2.f146113f     // Catch:{ Exception -> 0x068d }
            java.lang.String r3 = r15.mo10700XQ(r3)     // Catch:{ Exception -> 0x068d }
            rx3.l r4 = new rx3.l     // Catch:{ Exception -> 0x068d }
            r4.<init>(r14, r3)     // Catch:{ Exception -> 0x068d }
            r3 = 0
            r13[r3] = r4     // Catch:{ Exception -> 0x068d }
            java.lang.String r3 = "feed_id"
            di3.d r4 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x068d }
            kq.h r4 = (p185kq.C10383h) r4     // Catch:{ Exception -> 0x068d }
            long r14 = r2.f146116i     // Catch:{ Exception -> 0x068d }
            java.lang.String r4 = r4.mo10700XQ(r14)     // Catch:{ Exception -> 0x068d }
            rx3.l r14 = new rx3.l     // Catch:{ Exception -> 0x068d }
            r14.<init>(r3, r4)     // Catch:{ Exception -> 0x068d }
            r3 = 1
            r13[r3] = r14     // Catch:{ Exception -> 0x068d }
            java.lang.String r4 = "enter_session_id"
            long r14 = r2.f146113f     // Catch:{ Exception -> 0x068d }
            long r14 = r0.yx0(r14)     // Catch:{ Exception -> 0x068d }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x068d }
            rx3.l r15 = new rx3.l     // Catch:{ Exception -> 0x068d }
            r15.<init>(r4, r14)     // Catch:{ Exception -> 0x068d }
            r4 = 2
            r13[r4] = r15     // Catch:{ Exception -> 0x068d }
            r14 = 3
            java.lang.String r15 = "comment_scene"
            di3.d r18 = di3.C86312j.m106911c(r26)     // Catch:{ Exception -> 0x068d }
            kq.g r18 = (p185kq.C61130g) r18     // Catch:{ Exception -> 0x068d }
            java.lang.String r18 = r18.mo33244gK()     // Catch:{ Exception -> 0x068d }
            if (r18 != 0) goto L_0x046d
            r3 = r28
            goto L_0x046f
        L_0x046d:
            r3 = r18
        L_0x046f:
            rx3.l r4 = new rx3.l     // Catch:{ Exception -> 0x068d }
            r4.<init>(r15, r3)     // Catch:{ Exception -> 0x068d }
            r13[r14] = r4     // Catch:{ Exception -> 0x068d }
            r3 = 4
            java.lang.String r4 = "finder_username"
            rx3.l r14 = new rx3.l     // Catch:{ Exception -> 0x068d }
            r14.<init>(r4, r8)     // Catch:{ Exception -> 0x068d }
            r13[r3] = r14     // Catch:{ Exception -> 0x068d }
            java.lang.String r3 = "session_buffer"
            long r14 = r0.f151943h     // Catch:{ Exception -> 0x068d }
            di3.d r4 = di3.C86312j.m106911c(r26)     // Catch:{ Exception -> 0x068d }
            kq.g r4 = (p185kq.C61130g) r4     // Catch:{ Exception -> 0x068d }
            java.lang.String r4 = r4.mo33244gK()     // Catch:{ Exception -> 0x068d }
            if (r4 != 0) goto L_0x0493
            r4 = r28
        L_0x0493:
            java.lang.String r4 = r0.zx0(r14, r4)     // Catch:{ Exception -> 0x068d }
            rx3.l r14 = new rx3.l     // Catch:{ Exception -> 0x068d }
            r14.<init>(r3, r4)     // Catch:{ Exception -> 0x068d }
            r3 = 5
            r13[r3] = r14     // Catch:{ Exception -> 0x068d }
            java.lang.String r4 = "live_enter_icon_type"
            di3.d r14 = di3.C86312j.m106911c(r23)     // Catch:{ Exception -> 0x068d }
            ak1.o r14 = (ak1.C54108o) r14     // Catch:{ Exception -> 0x068d }
            r14.getClass()     // Catch:{ Exception -> 0x068d }
            ak1.f0 r14 = ak1.C54108o.f151869h     // Catch:{ Exception -> 0x068d }
            di3.d r15 = di3.C86312j.m106911c(r26)     // Catch:{ Exception -> 0x068d }
            kq.g r15 = (p185kq.C61130g) r15     // Catch:{ Exception -> 0x068d }
            java.lang.String r15 = r15.mo33244gK()     // Catch:{ Exception -> 0x068d }
            if (r15 != 0) goto L_0x04ba
            r15 = r28
        L_0x04ba:
            int r3 = r0.f151947j     // Catch:{ Exception -> 0x068d }
            r30 = r7
            r18 = r8
            long r7 = (long) r3
            long r7 = r14.mo74755e(r15, r7)     // Catch:{ Exception -> 0x0689 }
            int r3 = (int) r7     // Catch:{ Exception -> 0x0689 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r3)     // Catch:{ Exception -> 0x0689 }
            r3 = 6
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 7
            java.lang.String r4 = "live_scenenote_appid"
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 8
            java.lang.String r4 = "live_request_id"
            fj1.b r6 = fj1.C45795b.f123698n     // Catch:{ Exception -> 0x0689 }
            if (r6 == 0) goto L_0x04ee
            androidx.lifecycle.i0 r6 = r6.mo71262a(r11)     // Catch:{ Exception -> 0x0689 }
            cl1.o r6 = (cl1.C54991o) r6     // Catch:{ Exception -> 0x0689 }
            java.lang.String r6 = r6.f154318g2     // Catch:{ Exception -> 0x0689 }
            if (r6 != 0) goto L_0x04f0
        L_0x04ee:
            r6 = r28
        L_0x04f0:
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 9
            java.lang.String r4 = "live_chnl_extra"
            java.lang.String r6 = r0.f151907K     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 10
            java.lang.String r4 = "live_switch_extra"
            java.lang.Class<ir.n> r6 = p565ir.C60606n.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0689 }
            ir.n r6 = (p565ir.C60606n) r6     // Catch:{ Exception -> 0x0689 }
            java.lang.String r6 = r6.tx0()     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 11
            java.lang.String r4 = "finder_context_id"
            di3.d r6 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x0689 }
            kq.h r6 = (p185kq.C10383h) r6     // Catch:{ Exception -> 0x0689 }
            java.lang.String r6 = r6.mo10696E()     // Catch:{ Exception -> 0x0689 }
            if (r6 != 0) goto L_0x052d
            r6 = r28
        L_0x052d:
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 12
            java.lang.String r4 = "finder_tab_context_id"
            di3.d r6 = di3.C86312j.m106911c(r25)     // Catch:{ Exception -> 0x0689 }
            kq.h r6 = (p185kq.C10383h) r6     // Catch:{ Exception -> 0x0689 }
            java.lang.String r6 = r6.mo10698S0()     // Catch:{ Exception -> 0x0689 }
            if (r6 != 0) goto L_0x0546
            r6 = r28
        L_0x0546:
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 13
            java.lang.String r4 = "finder_sub_tab_context_id"
            java.lang.String r6 = r0.f151955t     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 14
            java.lang.String r4 = "behaviour_session_id"
            java.lang.Class<h81.i> r6 = h81.C59774i.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0689 }
            h81.i r6 = (h81.C59774i) r6     // Catch:{ Exception -> 0x0689 }
            java.lang.String r6 = r6.mo84751Wb()     // Catch:{ Exception -> 0x0689 }
            if (r6 != 0) goto L_0x056e
            r6 = r28
        L_0x056e:
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 15
            java.lang.String r4 = "live_cur_screen_type"
            boolean r6 = r0.f151912Q     // Catch:{ Exception -> 0x0689 }
            if (r6 == 0) goto L_0x057f
            r8 = 2
            goto L_0x0580
        L_0x057f:
            r8 = 1
        L_0x0580:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 16
            java.lang.String r4 = "is_live_preview"
            if (r40 == 0) goto L_0x0593
            r8 = 2
            goto L_0x0594
        L_0x0593:
            r8 = 1
        L_0x0594:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 17
            java.lang.String r4 = "live_state"
            fj1.b r6 = fj1.C45795b.f123698n     // Catch:{ Exception -> 0x0689 }
            if (r6 == 0) goto L_0x05b0
            androidx.lifecycle.i0 r6 = r6.mo71262a(r11)     // Catch:{ Exception -> 0x0689 }
            cl1.o r6 = (cl1.C54991o) r6     // Catch:{ Exception -> 0x0689 }
            int r6 = r6.f154295b1     // Catch:{ Exception -> 0x0689 }
            goto L_0x05b1
        L_0x05b0:
            r6 = -1
        L_0x05b1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0689 }
            rx3.l r7 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r7     // Catch:{ Exception -> 0x0689 }
            r3 = 18
            java.lang.String r4 = "is_live_offline"
            boolean r2 = r2.f146117j     // Catch:{ Exception -> 0x0689 }
            if (r2 == 0) goto L_0x05c6
            r8 = 2
            goto L_0x05c7
        L_0x05c6:
            r8 = 1
        L_0x05c7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r4, r2)     // Catch:{ Exception -> 0x0689 }
            r13[r3] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 19
            java.lang.String r3 = "role_type"
            ok1.e r4 = ok1.C62042e.f176370a     // Catch:{ Exception -> 0x0689 }
            boolean r4 = r4.mo87027N0()     // Catch:{ Exception -> 0x0689 }
            if (r4 == 0) goto L_0x05e0
            r8 = 0
            goto L_0x05e1
        L_0x05e0:
            r8 = 1
        L_0x05e1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 20
            java.lang.String r3 = "is_live_scroll"
            if (r10 == 0) goto L_0x05f4
            r4 = 0
            goto L_0x05f5
        L_0x05f4:
            r4 = 1
        L_0x05f5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 21
            java.lang.String r3 = "is_private"
            di3.d r4 = di3.C86312j.m106911c(r23)     // Catch:{ Exception -> 0x0689 }
            ak1.o r4 = (ak1.C54108o) r4     // Catch:{ Exception -> 0x0689 }
            r4.getClass()     // Catch:{ Exception -> 0x0689 }
            r8 = r18
            int r4 = r14.mo74762l(r8)     // Catch:{ Exception -> 0x0689 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 22
            java.lang.String r3 = "live_scene_note"
            java.lang.String r4 = r0.f151927X0     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 23
            java.lang.String r3 = "live_ad_data"
            t91.c$a r4 = t91.C64208c.f181951a     // Catch:{ Exception -> 0x0689 }
            java.lang.String r4 = r4.mo89027b(r8)     // Catch:{ Exception -> 0x0689 }
            if (r4 == 0) goto L_0x0641
            java.lang.String r6 = ","
            java.lang.String r7 = ";"
            r8 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r6, r7, r8)     // Catch:{ Exception -> 0x0689 }
            goto L_0x0642
        L_0x0641:
            r4 = 0
        L_0x0642:
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 24
            java.lang.String r3 = "live_page_type"
            ak1.f0$j0 r4 = r0.f151922V     // Catch:{ Exception -> 0x0689 }
            int r4 = r4.f151506d     // Catch:{ Exception -> 0x0689 }
            long r6 = (long) r4     // Catch:{ Exception -> 0x0689 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 25
            java.lang.String r3 = "live_action_style"
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x0689 }
            rx3.l r6 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r6.<init>(r3, r4)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r6     // Catch:{ Exception -> 0x0689 }
            r2 = 26
            java.lang.String r3 = "live_start_time"
            long r6 = r0.f151935d     // Catch:{ Exception -> 0x0689 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0689 }
            rx3.l r4 = new rx3.l     // Catch:{ Exception -> 0x0689 }
            r4.<init>(r3, r0)     // Catch:{ Exception -> 0x0689 }
            r13[r2] = r4     // Catch:{ Exception -> 0x0689 }
            java.util.Map r0 = sx3.C90364q0.m113147f(r13)     // Catch:{ Exception -> 0x0689 }
            r2 = r16
            r5.mo86146Mp(r2, r0)     // Catch:{ Exception -> 0x0687 }
            goto L_0x06af
        L_0x0687:
            r0 = move-exception
            goto L_0x0697
        L_0x0689:
            r0 = move-exception
        L_0x068a:
            r2 = r16
            goto L_0x0697
        L_0x068d:
            r0 = move-exception
            r30 = r7
            goto L_0x068a
        L_0x0691:
            r0 = move-exception
            r17 = r3
            r2 = r4
            r30 = r7
        L_0x0697:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[bindGetLiveMsgCgiReportInfo] bind page params throw Exception : "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x06af:
            di3.d r0 = di3.C86312j.m106911c(r30)
            l31.e r0 = (l31.C61212e) r0
            ak1.u r3 = new ak1.u
            r4 = r17
            r3.<init>(r4)
            r0.E60(r2, r3)
            di3.d r0 = di3.C86312j.m106911c(r30)
            l31.e r0 = (l31.C61212e) r0
            ak1.v r3 = new ak1.v
            r3.<init>(r2)
            r0.mo86160cK(r3)
        L_0x06cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg1.C62612c.<init>(te3.ig0, java.lang.String, byte[], long, long, java.lang.String, int, boolean, int, te3.xw0, int, te3.hj1, java.lang.String, ls3.h$b, java.lang.String, te3.lw0, te3.h71, boolean):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C48742ao0 ao02 = (C48742ao0) eu32;
        C87412m.m108594g(ao02, "resp");
        if (i == 0 && i2 == 0) {
            mo85581g();
            String str2 = this.f177813v;
            StringBuilder sb = new StringBuilder();
            sb.append("[onCgiBack] errType=");
            sb.append(i);
            sb.append(" errCode=");
            sb.append(i2);
            sb.append(" errMsg=");
            sb.append(str);
            sb.append(" resp curOnlineCount:");
            sb.append(ao02.f130680h);
            sb.append(" cur_participant_count:");
            sb.append(ao02.f130688s);
            sb.append(" liveInfoEnableFlag:");
            sb.append(ao02.f130681i);
            sb.append(" liveCloseFlag:");
            sb.append(ao02.f130682j);
            sb.append(" live_ext_flag:");
            sb.append(ao02.f130686q);
            sb.append(" id: ");
            C64273c21 c212 = ao02.f130678f;
            Integer num = null;
            sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
            sb.append(' ');
            C64273c21 c213 = ao02.f130678f;
            sb.append(c213 != null ? Integer.valueOf(c213.f182394f) : null);
            sb.append(" msg:");
            LinkedList<C64674r41> linkedList = ao02.f130677e;
            if (linkedList != null) {
                num = Integer.valueOf(linkedList.size());
            }
            sb.append(num);
            sb.append(",interval:");
            sb.append(ao02.f130692w);
            sb.append(", uniqueId:");
            sb.append(this.f177812u);
            Log.m105924i(str2, sb.toString());
            C115669n.INSTANCE.mo175912v(this.f166900s, 22);
        } else {
            String str3 = this.f177813v;
            Log.m105924i(str3, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
            C115669n.INSTANCE.mo175912v(this.f166900s, 23);
        }
        C115669n.INSTANCE.mo175912v(this.f166900s, 21);
        this.f177814w.mo75426a(i, i2, str, ao02, this.f177811t, this.f177812u);
    }
}
