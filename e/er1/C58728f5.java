package er1;

import c50.C54655b;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import di3.C86312j;
import eb0.C31543z5;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60169f4;

/* renamed from: er1.f5 */
public final class C58728f5 {

    /* renamed from: a */
    public static final C58728f5 f168144a = new C58728f5();

    /* renamed from: b */
    public static long f168145b;

    /* renamed from: c */
    public static long f168146c;

    /* renamed from: d */
    public static long f168147d;

    /* renamed from: e */
    public static long f168148e;

    /* renamed from: f */
    public static int f168149f = 1;

    /* renamed from: g */
    public static final int f168150g = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_statistics_frequency, 4000);

    /* renamed from: h */
    public static final int f168151h = 100;

    /* renamed from: i */
    public static C54655b f168152i;

    /* renamed from: j */
    public static long f168153j;

    /* renamed from: k */
    public static int f168154k;

    /* renamed from: l */
    public static String f168155l = "";

    /* renamed from: m */
    public static int f168156m;

    static {
        C32444a aVar = C32444a.f86121a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0069, code lost:
        r0 = r0.f172989A;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m68215a(er1.C58728f5 r31, java.lang.String r32, int r33, int r34, java.lang.String r35, fj1.C45795b r36, java.lang.String r37, int r38, java.lang.Object r39) {
        /*
            r0 = r32
            r14 = r33
            r1 = r35
            r2 = r36
            r3 = r38 & 32
            if (r3 == 0) goto L_0x001b
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeString(r3)
            java.lang.String r4 = "getNetTypeString(MMAppli…tionContext.getContext())"
            gy3.C87412m.m108593f(r3, r4)
            r15 = r3
            goto L_0x001d
        L_0x001b:
            r15 = r37
        L_0x001d:
            r31.getClass()
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.String r4 = "cgiEvent"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "cgiErrmsg"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "extra"
            gy3.C87412m.m108594g(r15, r4)
            java.lang.String r4 = f168155l
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            java.lang.String r5 = "Finder.LiveStatisticsReport"
            if (r4 == 0) goto L_0x0061
            int r4 = f168156m
            if (r4 != r14) goto L_0x0061
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "anchorStatisticsReport,liveCgiEvent:"
            r0.append(r1)
            java.lang.String r1 = f168155l
            r0.append(r1)
            java.lang.String r1 = ",liveCgiErrorCode:"
            r0.append(r1)
            int r1 = f168156m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0191
        L_0x0061:
            f168155l = r0
            f168156m = r14
            c50.b r0 = f168152i
            if (r0 == 0) goto L_0x0070
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0070
            int r0 = r0.f166265l
            goto L_0x0071
        L_0x0070:
            r0 = -1
        L_0x0071:
            f168149f = r0
            r4 = 1
            if (r2 == 0) goto L_0x0084
            java.lang.Class<cl1.h1> r6 = cl1.C54979h1.class
            androidx.lifecycle.i0 r6 = r2.mo71262a(r6)
            cl1.h1 r6 = (cl1.C54979h1) r6
            boolean r6 = r6.f154134f
            if (r6 != r4) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            np1.w r7 = np1.C61882w.f175962a
            r7.getClass()
            boolean r7 = np1.C61882w.f175965d
            long r8 = f168145b
            long r10 = f168146c
            long r10 = r10 - r8
            long r12 = f168147d
            long r12 = r12 - r8
            long r16 = f168148e
            long r16 = r16 - r8
            if (r2 == 0) goto L_0x00a7
            androidx.lifecycle.i0 r18 = r2.mo71262a(r3)
            r0 = r18
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154295b1
            r18 = r0
            goto L_0x00a9
        L_0x00a7:
            r18 = 0
        L_0x00a9:
            if (r2 == 0) goto L_0x00b6
            androidx.lifecycle.i0 r0 = r2.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r19 = r0
            goto L_0x00b8
        L_0x00b6:
            r19 = 0
        L_0x00b8:
            if (r2 == 0) goto L_0x00c4
            androidx.lifecycle.i0 r0 = r2.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154329j1
            if (r0 != 0) goto L_0x00c6
        L_0x00c4:
            java.lang.String r0 = ""
        L_0x00c6:
            r20 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = f168155l
            r0.append(r4)
            r0.append(r1)
            java.lang.String r21 = r0.toString()
            r22 = 0
            r23 = 0
            if (r2 == 0) goto L_0x00ed
            androidx.lifecycle.i0 r0 = r2.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x00f1
        L_0x00ed:
            java.lang.String r0 = eb0.C75592q0.m90783m()
        L_0x00f1:
            r1 = r0
            java.lang.String r0 = "liveRoomData?.business(L…getNicknameFromUserInfo()"
            gy3.C87412m.m108593f(r1, r0)
            if (r2 == 0) goto L_0x010a
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x010a
            long r3 = r0.f182392d
            r27 = r3
            goto L_0x010c
        L_0x010a:
            r27 = 0
        L_0x010c:
            int r0 = f168149f
            long r2 = (long) r0
            long r24 = f168153j
            r29 = 0
            int r0 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1))
            if (r0 == 0) goto L_0x0149
            long r24 = eb0.C31543z5.m39451a()
            long r29 = f168153j
            long r24 = r24 - r29
            int r0 = f168150g
            r26 = r1
            long r0 = (long) r0
            int r4 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "anchorStatisticsReport too fast,frequency:"
            r0.append(r1)
            long r1 = eb0.C31543z5.m39451a()
            long r3 = f168153j
            long r1 = r1 - r3
            r0.append(r1)
            r1 = 33
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0191
        L_0x0149:
            r26 = r1
        L_0x014b:
            int r0 = f168154k
            int r1 = f168151h
            if (r0 < r1) goto L_0x0157
            java.lang.String r0 = "anchorStatisticsReport too much times!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0191
        L_0x0157:
            r0 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0164
            long r0 = eb0.C31543z5.m39451a()
            f168145b = r0
            r8 = r0
        L_0x0164:
            long r0 = eb0.C31543z5.m39451a()
            f168153j = r0
            int r0 = f168154k
            r1 = 1
            int r0 = r0 + r1
            f168154k = r0
            java.lang.Class<ht1.f4> r0 = ht1.C60169f4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.f4 r0 = (ht1.C60169f4) r0
            r4 = 0
            r29 = r2
            r2 = r4
            r1 = 1
            java.lang.String r24 = ""
            r25 = r15
            r14 = r16
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r33
            r20 = r34
            r0.mo83327d(r1, r2, r4, r6, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58728f5.m68215a(er1.f5, java.lang.String, int, int, java.lang.String, fj1.b, java.lang.String, int, java.lang.Object):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m68216c(C58728f5 f5Var, C45795b bVar, int i, int i2, String str, String str2, int i3, Object obj) {
        f5Var.mo83645b(bVar, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2);
    }

    /* renamed from: b */
    public final void mo83645b(C45795b bVar, int i, int i2, String str, String str2) {
        C45795b bVar2 = bVar;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(bVar2, "buContext");
        C87412m.m108594g(str, "msg");
        C87412m.m108594g(str2, "extra");
        long j = (long) ((C55001u) bVar2.mo71262a(cls2)).f154420q.f182396h;
        Integer valueOf = Integer.valueOf(((C55001u) bVar2.mo71262a(cls2)).f154420q.f182398j);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : C31543z5.m39455e();
        long j2 = ((C55001u) bVar2.mo71262a(cls2)).f154420q.f182392d;
        long j3 = ((long) intValue) - j;
        String str3 = ((C55001u) bVar2.mo71262a(cls2)).f154425v;
        boolean z = ((C54979h1) bVar2.mo71262a(C54979h1.class)).f154134f;
        int i3 = ((C54991o) bVar2.mo71262a(cls)).f154295b1;
        int i4 = ((C54991o) bVar2.mo71262a(cls)).f154291a1;
        String str4 = ((C54991o) bVar2.mo71262a(cls)).f154329j1;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        C87412m.m108594g(str3, "snn");
        long j4 = f168145b;
        long j5 = j2;
        ((C60169f4) C86312j.m106911c(C60169f4.class)).mo83327d(1, j, j3, z ? 1 : 0, 0, j4, f168146c - j4, f168147d - j4, f168148e - j4, i3, i4, str5, 0, 0, "", i, i2, str, str2, str3, j5, (long) f168149f);
    }

    /* renamed from: d */
    public final void mo83646d(long j) {
        f168145b = j;
    }
}
