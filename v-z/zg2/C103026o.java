package zg2;

import fy3.C32229r;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C101781gb0;
import zg2.C103021n;

/* renamed from: zg2.o */
public final class C103026o extends C87413o implements C32229r<String, String, Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103021n.C103022a f304003d;

    /* renamed from: e */
    public final /* synthetic */ long f304004e;

    /* renamed from: f */
    public final /* synthetic */ long f304005f;

    /* renamed from: g */
    public final /* synthetic */ C101781gb0 f304006g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103026o(C103021n.C103022a aVar, long j, long j2, C101781gb0 gb02) {
        super(4);
        this.f304003d = aVar;
        this.f304004e = j;
        this.f304005f = j2;
        this.f304006g = gb02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x022a  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo162I(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r23 = this;
            r1 = r23
            r9 = r24
            java.lang.String r9 = (java.lang.String) r9
            r5 = r25
            java.lang.String r5 = (java.lang.String) r5
            r0 = r26
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r27
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            u60.n r10 = u60.C65234n.Wait
            java.lang.String r2 = "mixVideoPath"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "mixThumbPath"
            gy3.C87412m.m108594g(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mixer task done "
            r2.append(r3)
            zg2.n$a r3 = r1.f304003d
            zg2.f r3 = r3.f303997f
            java.lang.String r3 = r3.field_taskId
            r2.append(r3)
            java.lang.String r3 = " ret "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " mixVideoPath "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " mixThumb "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "MicroMsg.mix_background.VideoMixHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r1.f304004e
            long r13 = r2 - r6
            zg2.n$a r2 = r1.f304003d
            int r2 = r2.f303999h
            r12 = 0
            r15 = 1
            if (r2 == 0) goto L_0x0091
            com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r3 = r3.getHcEncodeVideoEnable()
            zg2.n$a r4 = r1.f304003d
            int r4 = r4.f303999h
            int r2 = r2.stopPerformance(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r12] = r2
            java.lang.String r2 = "hardcoder summerPerformance stopPerformance %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r3)
            zg2.n$a r2 = r1.f304003d
            r2.f303999h = r12
        L_0x0091:
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r8 = new com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo
            r8.<init>()
            zg2.n$a r2 = r1.f304003d
            zg2.f r2 = r2.f303997f
            java.lang.String r2 = r2.field_reportInfo
            r8.mo129810a(r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r1.f304005f
            long r2 = r2 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "KEY_REMUX_VIDEO_COST_MS_INT"
            r8.mo129812c(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "after remux, reportInfo:"
            r2.append(r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            java.util.HashMap r4 = r8.f272939d
            r3.<init>(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            zg2.n$a r7 = r1.f304003d
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r6 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            te3.gb0 r2 = r1.f304006g
            r24 = r13
            long r12 = r2.f298291d
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r2 = r6
            r4 = r9
            r14 = r6
            r6 = r12
            r12 = r7
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12.f303998g = r14
            if (r0 == 0) goto L_0x0290
            te3.e70 r0 = new te3.e70
            r0.<init>()
            zg2.n$a r2 = r1.f304003d
            zg2.f r2 = r2.f303997f
            byte[] r2 = r2.field_baseItemData
            r3 = 0
            if (r2 != 0) goto L_0x00ff
            r4 = 0
            goto L_0x0113
        L_0x00ff:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0104 }
            r4 = 0
            goto L_0x0114
        L_0x0104:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "safeParser"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r5, r0)
        L_0x0113:
            r0 = r3
        L_0x0114:
            if (r0 == 0) goto L_0x021e
            zg2.n$a r2 = r1.f304003d
            zg2.f r3 = r2.f303997f
            int r3 = r3.field_fromScene
            r5 = 3
            if (r3 != r5) goto L_0x0121
            r12 = 1
            goto L_0x0122
        L_0x0121:
            r12 = 0
        L_0x0122:
            if (r12 == 0) goto L_0x021e
            boolean r3 = r0.f298176y
            java.lang.String r4 = "MicroMsg.StoryRemuxDetailIDKeyStat"
            java.lang.String r6 = "markSucess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 11
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            if (r3 == 0) goto L_0x0149
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 12
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            goto L_0x0154
        L_0x0149:
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 13
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
        L_0x0154:
            boolean r3 = r0.f298176y
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "markSuccessCost, isCaptureVideo:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", time:"
            r7.append(r8)
            r13 = r24
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            r7 = 1005(0x3ed, double:4.965E-321)
            r16 = 31
            r12 = r6
            r19 = r13
            r13 = r7
            r7 = 1
            r15 = r16
            r17 = r19
            r12.mo175913w(r13, r15, r17)
            if (r3 == 0) goto L_0x0192
            r13 = 1005(0x3ed, double:4.965E-321)
            r15 = 32
            r12 = r6
            r17 = r19
            r12.mo175913w(r13, r15, r17)
            goto L_0x019c
        L_0x0192:
            r13 = 1005(0x3ed, double:4.965E-321)
            r15 = 33
            r12 = r6
            r17 = r19
            r12.mo175913w(r13, r15, r17)
        L_0x019c:
            zg2.f r2 = r2.f303997f
            int r2 = r2.field_mixRetryTime
            boolean r0 = r0.f298176y
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "markSuccessRetryTimes, times:"
            r3.append(r8)
            r3.append(r2)
            java.lang.String r8 = ", isCaptureVideo:"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 41
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            if (r2 > r7) goto L_0x01e6
            if (r0 == 0) goto L_0x01da
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 42
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            goto L_0x021e
        L_0x01da:
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 43
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            goto L_0x021e
        L_0x01e6:
            r3 = 2
            if (r2 != r3) goto L_0x0203
            if (r0 == 0) goto L_0x01f7
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 45
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            goto L_0x021e
        L_0x01f7:
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 46
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            goto L_0x021e
        L_0x0203:
            if (r2 != r5) goto L_0x021e
            if (r0 == 0) goto L_0x0213
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 48
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
            goto L_0x021e
        L_0x0213:
            r17 = 1005(0x3ed, double:4.965E-321)
            r19 = 49
            r21 = 1
            r16 = r6
            r16.mo175913w(r17, r19, r21)
        L_0x021e:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x022a
            zg2.n$a r0 = r1.f304003d
            r0.mo11853b(r10)
            goto L_0x0295
        L_0x022a:
            hi2.o r0 = hi2.C98464o.f288797a
            hi2.o$a r0 = r0.mo137832a(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "videoInfo : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            zg2.n$a r0 = r1.f304003d
            r0.getClass()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "time cost: "
            r0.append(r4)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            hi2.h r0 = hi2.C98453h.f288774a
            te3.gb0 r0 = r1.f304006g
            if (r0 == 0) goto L_0x027f
            zt3.t r2 = zt3.C119157j.f356862d
            hi2.m r3 = new hi2.m
            r3.<init>(r0)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r0 = "mux_save_work"
            r2.mo183876g(r3, r0)
        L_0x027f:
            zg2.n$a r0 = r1.f304003d
            zg2.f r0 = r0.f303997f
            java.lang.String r0 = r0.field_blurBgPath
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            zg2.n$a r0 = r1.f304003d
            u60.n r2 = u60.C65234n.OK
            r0.mo11853b(r2)
            goto L_0x0295
        L_0x0290:
            zg2.n$a r0 = r1.f304003d
            r0.mo11853b(r10)
        L_0x0295:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zg2.C103026o.mo162I(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
