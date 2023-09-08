package f23;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: f23.a */
public final class C97814a {

    /* renamed from: a */
    public static final C97814a f286944a = new C97814a();

    /* renamed from: b */
    public static final MultiProcessMMKV f286945b = MultiProcessMMKV.getMMKV("MultiMediaIDKeyStatMuxMark");

    /* renamed from: c */
    public static final int f286946c = 1;

    /* renamed from: d */
    public static final int f286947d = 2;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0204  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137150a(java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r25 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            java.lang.String r5 = "path"
            gy3.C87412m.m108594g(r0, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "finishMux:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", cost:"
            r5.append(r6)
            r14 = r27
            r5.append(r14)
            java.lang.String r6 = ", hasOriginSound:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", hasMusic:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", isHevcHard:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", isHevcSoft:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.MultiMediaIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r26)
            r16 = 1
            r12 = 0
            if (r5 != 0) goto L_0x007a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "finish mux file not exist path:"
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 1372(0x55c, double:6.78E-321)
            r20 = 18
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r7 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            rw.m$a r13 = r7.mo129930b(r0)
            r7 = 0
            if (r13 == 0) goto L_0x03b2
            int r8 = r13.f180525a
            if (r8 <= 0) goto L_0x03b2
            int r8 = r13.f180526b
            if (r8 <= 0) goto L_0x03b2
            float r8 = r13.f180527c
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x0094
            goto L_0x03b2
        L_0x0094:
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 1
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            if (r4 == 0) goto L_0x00ae
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 129(0x81, double:6.37E-322)
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x00ae:
            if (r3 == 0) goto L_0x00bb
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 130(0x82, double:6.4E-322)
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x00bb:
            if (r3 != 0) goto L_0x00d9
            if (r4 != 0) goto L_0x00d9
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 62
            r7 = r24
            r4 = r13
            r3 = 0
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 63
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            r3 = r4
            goto L_0x00fc
        L_0x00d9:
            r12 = r13
            r13 = 0
            if (r3 == 0) goto L_0x00eb
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 132(0x84, double:6.5E-322)
            r7 = r24
            r3 = r12
            r4 = 0
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            goto L_0x00fd
        L_0x00eb:
            r3 = r12
            r12 = 0
            if (r4 == 0) goto L_0x00fc
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 135(0x87, double:6.67E-322)
            r7 = r24
            r4 = 0
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 16
            float r7 = r3.f180527c
            long r7 = (long) r7
            r17 = r24
            r22 = r7
            r17.mo175913w(r18, r20, r22)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 17
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            if (r1 == 0) goto L_0x0125
            if (r2 != 0) goto L_0x0125
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 20
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0190
        L_0x0125:
            if (r1 != 0) goto L_0x0149
            if (r2 != 0) goto L_0x0149
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 21
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            r20 = 36
            long r7 = r3.f180528d
            r17 = r24
            r22 = r7
            r17.mo175913w(r18, r20, r22)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 37
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            goto L_0x0190
        L_0x0149:
            if (r1 == 0) goto L_0x016d
            if (r2 == 0) goto L_0x016d
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 22
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            r20 = 47
            long r7 = r3.f180528d
            r17 = r24
            r22 = r7
            r17.mo175913w(r18, r20, r22)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 48
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            goto L_0x0190
        L_0x016d:
            if (r1 != 0) goto L_0x0190
            if (r2 == 0) goto L_0x0190
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 23
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            r20 = 58
            long r7 = r3.f180528d
            r17 = r24
            r22 = r7
            r17.mo175913w(r18, r20, r22)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 59
            r22 = 1
            r17.mo175913w(r18, r20, r22)
        L_0x0190:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "finish mux video duration:"
            r7.append(r8)
            long r8 = r3.f180528d
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            long r7 = r3.f180528d
            r3 = 1000(0x3e8, float:1.401E-42)
            long r9 = (long) r3
            long r7 = r7 / r9
            r9 = 0
            r11 = 11
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x01ba
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ba
            r3 = 1
            goto L_0x01bb
        L_0x01ba:
            r3 = 0
        L_0x01bb:
            if (r3 == 0) goto L_0x0204
            if (r1 != 0) goto L_0x01cd
            if (r2 != 0) goto L_0x01cd
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 29
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x01ec
        L_0x01cd:
            if (r1 == 0) goto L_0x01dd
            if (r2 == 0) goto L_0x01dd
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 40
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x01ec
        L_0x01dd:
            if (r1 != 0) goto L_0x01ec
            if (r2 == 0) goto L_0x01ec
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 51
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x01ec:
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 66
            r7 = r24
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 67
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x03af
        L_0x0204:
            r9 = 21
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0210
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0210
            r12 = 1
            goto L_0x0211
        L_0x0210:
            r12 = 0
        L_0x0211:
            if (r12 == 0) goto L_0x025a
            if (r1 != 0) goto L_0x0223
            if (r2 != 0) goto L_0x0223
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 30
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0242
        L_0x0223:
            if (r1 == 0) goto L_0x0233
            if (r2 == 0) goto L_0x0233
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 41
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0242
        L_0x0233:
            if (r1 != 0) goto L_0x0242
            if (r2 == 0) goto L_0x0242
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 52
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x0242:
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 70
            r7 = r24
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 71
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x03af
        L_0x025a:
            r11 = 31
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0266
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0266
            r3 = 1
            goto L_0x0267
        L_0x0266:
            r3 = 0
        L_0x0267:
            if (r3 == 0) goto L_0x02b0
            if (r1 != 0) goto L_0x0279
            if (r2 != 0) goto L_0x0279
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 31
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0298
        L_0x0279:
            if (r1 == 0) goto L_0x0289
            if (r2 == 0) goto L_0x0289
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 42
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0298
        L_0x0289:
            if (r1 != 0) goto L_0x0298
            if (r2 == 0) goto L_0x0298
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 53
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x0298:
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 74
            r7 = r24
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 75
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x03af
        L_0x02b0:
            r9 = 41
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x02bc
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x02bc
            r12 = 1
            goto L_0x02bd
        L_0x02bc:
            r12 = 0
        L_0x02bd:
            if (r12 == 0) goto L_0x0306
            if (r1 != 0) goto L_0x02cf
            if (r2 != 0) goto L_0x02cf
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 32
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x02ee
        L_0x02cf:
            if (r1 == 0) goto L_0x02df
            if (r2 == 0) goto L_0x02df
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 43
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x02ee
        L_0x02df:
            if (r1 != 0) goto L_0x02ee
            if (r2 == 0) goto L_0x02ee
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 54
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x02ee:
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 78
            r7 = r24
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 79
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x03af
        L_0x0306:
            r11 = 51
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0312
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0312
            r3 = 1
            goto L_0x0313
        L_0x0312:
            r3 = 0
        L_0x0313:
            if (r3 == 0) goto L_0x035b
            if (r1 != 0) goto L_0x0325
            if (r2 != 0) goto L_0x0325
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 33
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0344
        L_0x0325:
            if (r1 == 0) goto L_0x0335
            if (r2 == 0) goto L_0x0335
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 44
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0344
        L_0x0335:
            if (r1 != 0) goto L_0x0344
            if (r2 == 0) goto L_0x0344
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 55
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x0344:
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 82
            r7 = r24
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 83
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x03af
        L_0x035b:
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0366
            r9 = 61
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0366
            goto L_0x0368
        L_0x0366:
            r16 = 0
        L_0x0368:
            if (r16 == 0) goto L_0x03af
            if (r1 != 0) goto L_0x037a
            if (r2 != 0) goto L_0x037a
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 34
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0399
        L_0x037a:
            if (r1 == 0) goto L_0x038a
            if (r2 == 0) goto L_0x038a
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 45
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
            goto L_0x0399
        L_0x038a:
            if (r1 != 0) goto L_0x0399
            if (r2 == 0) goto L_0x0399
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 56
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x0399:
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 86
            r7 = r24
            r12 = r27
            r7.mo175913w(r8, r10, r12)
            r18 = 1371(0x55b, double:6.774E-321)
            r20 = 87
            r22 = 1
            r17 = r24
            r17.mo175913w(r18, r20, r22)
        L_0x03af:
            r12 = r5
            goto L_0x0425
        L_0x03b2:
            r3 = r13
            r4 = 0
            if (r3 != 0) goto L_0x03d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "finish mux cannot get videoInfo path:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1372(0x55c, double:6.78E-321)
            r10 = 19
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x0424
        L_0x03d6:
            int r1 = r3.f180525a
            if (r1 <= 0) goto L_0x0405
            int r1 = r3.f180526b
            if (r1 > 0) goto L_0x03df
            goto L_0x0405
        L_0x03df:
            float r1 = r3.f180527c
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0424
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "finish mux cannot get videoInfo fps path:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1372(0x55c, double:6.78E-321)
            r10 = 21
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x0424
        L_0x0405:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "finish mux cannot get videoInfo width/height path:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1372(0x55c, double:6.78E-321)
            r10 = 20
            r12 = 1
            r7.mo175913w(r8, r10, r12)
        L_0x0424:
            r12 = 0
        L_0x0425:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f286945b
            int r2 = r1.getInt(r0, r4)
            int r3 = f286947d
            if (r2 != r3) goto L_0x0452
            if (r12 == 0) goto L_0x0442
            java.lang.String r2 = "finishMux error is resume from previous"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 101(0x65, double:5.0E-322)
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x0452
        L_0x0442:
            java.lang.String r2 = "finishMux success is resume from previous"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1371(0x55b, double:6.774E-321)
            r10 = 100
            r12 = 1
            r7.mo175913w(r8, r10, r12)
        L_0x0452:
            r1.remove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.C97814a.mo137150a(java.lang.String, long, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: b */
    public final void mo137151b(long j) {
        C115669n.INSTANCE.mo175912v(1371, j);
    }

    /* renamed from: c */
    public final void mo137152c(C96552p0 p0Var) {
        boolean z;
        C87412m.m108594g(p0Var, "composition");
        ArrayList<C106205q0> arrayList = p0Var.f282570c;
        boolean z2 = false;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<C106205q0> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f316501l.f331477o.mo162376b()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        boolean z3 = p0Var.f282576i;
        ArrayList<C106205q0> arrayList2 = p0Var.f282570c;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator<C106205q0> it4 = arrayList2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (!(it4.next().f316501l.f331468f == 1.0f)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            C115669n.INSTANCE.mo175912v(1371, 106);
        }
        if (z3) {
            C115669n.INSTANCE.mo175912v(1371, 107);
        }
        if (z2) {
            C115669n.INSTANCE.mo175912v(1371, 114);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055 A[EDGE_INSN: B:32:0x0055->B:25:0x0055 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137153d(java.util.List<? extends ai2.C92007a> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "itemList"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0025
        L_0x0010:
            java.util.Iterator r0 = r7.iterator()
        L_0x0014:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x000e
            java.lang.Object r3 = r0.next()
            ai2.a r3 = (ai2.C92007a) r3
            boolean r3 = r3 instanceof ai2.C92010c
            if (r3 == 0) goto L_0x0014
            r0 = 1
        L_0x0025:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x002d
        L_0x002b:
            r1 = 0
            goto L_0x0055
        L_0x002d:
            java.util.Iterator r7 = r7.iterator()
        L_0x0031:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r7.next()
            ai2.a r3 = (ai2.C92007a) r3
            boolean r4 = r3 instanceof ai2.C92025s
            if (r4 == 0) goto L_0x0052
            ai2.s r3 = (ai2.C92025s) r3
            java.lang.String r3 = r3.f263530k
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r3 == 0) goto L_0x0031
        L_0x0055:
            r2 = 1371(0x55b, double:6.774E-321)
            if (r0 == 0) goto L_0x0060
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 104(0x68, double:5.14E-322)
            r7.mo175912v(r2, r4)
        L_0x0060:
            if (r1 == 0) goto L_0x0069
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 105(0x69, double:5.2E-322)
            r7.mo175912v(r2, r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.C97814a.mo137153d(java.util.List):void");
    }
}
