package com.tencent.p014mm.plugin.sns.p106ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$k */
public class NewSightWidget$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277099d;

    public NewSightWidget$$k(NewSightWidget newSightWidget) {
        this.f277099d = newSightWidget;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0279  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r33 = this;
            r0 = r33
            java.lang.String r1 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$5"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.NewSightWidget r3 = r0.f277099d
            java.lang.String r4 = "access$2000"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.NewSightWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r3.getClass()
            java.lang.String r6 = "commitInThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = r3.f277069u
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.UploadPackHelper"
            java.lang.String r13 = " thumb: "
            java.lang.String r14 = "commitInThread videopath "
            java.lang.String r15 = "MicroMsg.SightWidget"
            if (r9 != 0) goto L_0x0175
            java.lang.String r9 = r3.f277070v
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0175
            com.tencent.mm.plugin.sns.model.s2 r9 = r3.f277032V
            java.lang.String r10 = r3.f277049h
            java.lang.String r12 = r3.f277047g
            r24 = r1
            java.lang.String r1 = r3.f277033W
            r25 = r2
            java.lang.String r2 = r3.f277051i
            java.lang.String r0 = r3.f277069u
            r26 = r4
            java.lang.String r4 = r3.f277070v
            r9.getClass()
            r27 = r7
            java.lang.String r7 = "addSightObjectByUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)
            hi2.o r8 = hi2.C98464o.f288797a
            hi2.o$a r8 = r8.mo137832a(r10)
            r29 = r5
            java.lang.String r5 = "MicroMsg.UploadPackHelper"
            if (r8 == 0) goto L_0x0080
            r30 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r31 = r15
            java.lang.String r15 = "addSightObjectByUrl commit video_info:"
            r6.append(r15)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            int r6 = r8.f288800c
            float r6 = (float) r6
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r8
            goto L_0x0085
        L_0x0080:
            r30 = r6
            r31 = r15
            r6 = 0
        L_0x0085:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r8.append(r15)
            byte[] r15 = r10.getBytes()
            java.lang.String r15 = p823sg.C90193h.m112878f(r15)
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            r9.mo131251h(r8)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r10, r8)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r32 = r13
            java.lang.String r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r15.append(r13)
            byte[] r13 = r12.getBytes()
            java.lang.String r13 = p823sg.C90193h.m112878f(r13)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r12, r13)
            r18 = 6
            java.lang.String r17 = ""
            r16 = r9
            r19 = r8
            r20 = r13
            r21 = r2
            r22 = r0
            r23 = r4
            te3.kv2 r0 = r16.mo131258o(r17, r18, r19, r20, r21, r22, r23)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "share img o.imagePath is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            r0 = 0
            goto L_0x011f
        L_0x00e7:
            r0.f298691f = r1
            java.lang.String r2 = r0.f298697o
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x00f3
            r0.f298697o = r1
        L_0x00f3:
            r0.f298684R = r6
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r9.f275199f
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r1.add(r0)
            te3.ar2 r1 = new te3.ar2
            r1.<init>()
            int r0 = r0.f298701s
            r1.f182140d = r0
            te3.lv2 r0 = r9.f275200g
            java.util.LinkedList<te3.ar2> r0 = r0.f298747h
            r0.add(r1)
            com.tencent.mm.plugin.sns.model.r1 r0 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275179a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r2 = r0.mo131223b(r10)
            r0.mo131222a(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            r0 = 1
        L_0x011f:
            if (r0 != 0) goto L_0x016e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r1 = r3.f277049h
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            r0.append(r1)
            r1 = r32
            r0.append(r1)
            java.lang.String r1 = r3.f277047g
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            r0.append(r1)
            java.lang.String r1 = ",cdnUrl "
            r0.append(r1)
            java.lang.String r1 = r3.f277069u
            r0.append(r1)
            java.lang.String r1 = "cdnThubmUrl "
            r0.append(r1)
            java.lang.String r1 = r3.f277070v
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.sns.ui.t1 r0 = new com.tencent.mm.plugin.sns.ui.t1
            r0.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            r0 = r29
            r4 = r30
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)
            goto L_0x01d9
        L_0x016e:
            r0 = r29
            r4 = r30
            r2 = r31
            goto L_0x01c1
        L_0x0175:
            r24 = r1
            r25 = r2
            r26 = r4
            r0 = r5
            r4 = r6
            r27 = r7
            r1 = r13
            r2 = r15
            com.tencent.mm.plugin.sns.model.s2 r5 = r3.f277032V
            java.lang.String r6 = r3.f277049h
            java.lang.String r7 = r3.f277047g
            java.lang.String r8 = r3.f277033W
            java.lang.String r9 = r3.f277051i
            boolean r5 = r5.mo131250g(r6, r7, r8, r9)
            if (r5 != 0) goto L_0x01c1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r6 = r3.f277049h
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r3.f277047g
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            r5.append(r6)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.sns.ui.u1 r1 = new com.tencent.mm.plugin.sns.ui.u1
            r1.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)
            goto L_0x01d9
        L_0x01c1:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r27
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r5 = 0
            r3[r5] = r1
            java.lang.String r1 = "commitInThread cost time %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)
        L_0x01d9:
            r1 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r0)
            r1 = r33
            com.tencent.mm.plugin.sns.ui.NewSightWidget r3 = r1.f277099d
            java.lang.String r4 = "access$2100"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r0)
            r3.getClass()
            java.lang.String r5 = "checkMiaojianInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r0)
            pt2.i$a r6 = r3.f277030T
            if (r6 == 0) goto L_0x0250
            com.tencent.mm.plugin.sns.model.s2 r6 = r3.f277032V
            if (r6 != 0) goto L_0x0201
            java.lang.String r3 = "pack helper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r0)
            goto L_0x0253
        L_0x0201:
            java.lang.String r7 = "getVideoTemplate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r6.f275199f
            te3.e94 r6 = r6.videoTemplate
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            if (r6 == 0) goto L_0x022f
            com.tencent.mm.plugin.sns.model.s2 r6 = r3.f277032V
            r6.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r6.f275199f
            te3.e94 r6 = r6.videoTemplate
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            java.lang.String r6 = r6.f182943e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x022f
            java.lang.String r3 = "already have template info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r0)
            goto L_0x0253
        L_0x022f:
            pt2.i$a r6 = r3.f277030T
            com.tencent.mm.plugin.sns.ui.NewSightWidget$$a r7 = new com.tencent.mm.plugin.sns.ui.NewSightWidget$$a
            r7.<init>(r3)
            java.lang.String r3 = "awaitTmplInfoBlocking"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            java.lang.String r9 = "miaoJianCutSameInfo"
            gy3.C87412m.m108594g(r6, r9)
            pt2.j r9 = new pt2.j
            r10 = 0
            r9.<init>(r6, r7, r10)
            r6 = 1
            a14.C53895h.m60468f(r10, r9, r6, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
        L_0x0250:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r0)
        L_0x0253:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)
            java.lang.String r3 = "removeRunnable showProgress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.sns.ui.NewSightWidget r2 = r1.f277099d
            java.lang.String r3 = "access$2200"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r0)
            java.lang.Runnable r2 = r2.f277062n0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r2)
            com.tencent.mm.plugin.sns.ui.NewSightWidget r2 = r1.f277099d
            com.tencent.mm.plugin.sns.model.s2 r3 = r2.f277032V
            if (r3 != 0) goto L_0x0279
            r3 = r24
            r4 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x0279:
            r3 = r24
            r4 = r25
            java.lang.String r5 = "access$2300"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r0)
            java.lang.Runnable r2 = r2.f277060m0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget$$k.run():void");
    }
}
