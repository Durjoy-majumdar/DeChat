package h72;

import com.tencent.p014mm.autogen.events.SnsRemuxTaskEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: h72.e */
public class C98319e extends IStaticListener<SnsRemuxTaskEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0241  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r29) {
        /*
            r28 = this;
            r1 = r29
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent r1 = (com.tencent.p014mm.autogen.events.SnsRemuxTaskEvent) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0284
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            if (r0 == 0) goto L_0x0284
            te3.gu2 r0 = r0.f265185c
            if (r0 == 0) goto L_0x0284
            boolean r4 = r0.f298315n
            if (r4 == 0) goto L_0x0284
            java.lang.String r4 = "wxa5e0de08d96cc09d"
            java.lang.String r5 = r0.f298316o
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0284
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r5 = "SnsMiaojianAppVideoCompressEnabled"
            int r4 = r4.mo107404b(r5, r2)
            if (r4 == 0) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r2] = r6
            java.lang.String r6 = "MicroMsg.SnsTaskListener"
            java.lang.String r7 = "checkMiaoJianNeedRemux() called resule %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            if (r4 == 0) goto L_0x0284
            r0.f298315n = r2
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            java.lang.Runnable r0 = r0.f265186d
            com.tencent.mm.plugin.sns.model.x0 r0 = (com.tencent.p014mm.plugin.sns.model.C94968x0) r0
            r0.run()
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            java.lang.String r4 = r0.f265183a
            xb0.h r0 = xb0.C102609h.Fx0()
            r0.getClass()
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            java.lang.String r6 = "MicroMsg.SubCoreVideoControl"
            java.lang.String r7 = "getMiaoJianAppVideoPara"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            di3.d r7 = di3.C86312j.m106911c(r5)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_sns_video_control_immediate_effect
            boolean r7 = r7.mo58784wf(r8, r3)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            xb0.j[] r10 = r0.f302148n
            if (r10 == 0) goto L_0x007c
            if (r7 == 0) goto L_0x0084
        L_0x007c:
            java.lang.String r7 = "SnsMiaojianAppVideoConfig"
            xb0.j[] r7 = r0.Jx0(r7)
            r0.f302148n = r7
        L_0x0084:
            xb0.j[] r7 = r0.f302148n
            r10 = 0
            if (r7 == 0) goto L_0x00a9
            r7 = 0
        L_0x008a:
            xb0.j[] r11 = r0.f302148n
            int r12 = r11.length
            if (r7 >= r12) goto L_0x00a9
            r11 = r11[r7]
            if (r11 == 0) goto L_0x00a6
            boolean r12 = r11.mo142245c()
            if (r12 == 0) goto L_0x00a6
            java.lang.String r7 = "it busy time, try to get sns Record config."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            com.tencent.mm.modelcontrol.VideoTransPara r7 = r11.mo142244b(r2)
            boolean r11 = r11.f302162f
            goto L_0x00ab
        L_0x00a6:
            int r7 = r7 + 1
            goto L_0x008a
        L_0x00a9:
            r7 = r10
            r11 = 1
        L_0x00ab:
            if (r7 != 0) goto L_0x00b1
            com.tencent.mm.modelcontrol.VideoTransPara r7 = r0.Cx0()
        L_0x00b1:
            r12 = 44100(0xac44, float:6.1797E-41)
            r7.f267174o = r12
            r12 = 10
            r7.f267172j = r12
            r12 = 200(0xc8, float:2.8E-43)
            r7.f267179t = r12
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_sns_maas_export_max_duration
            r13 = 60
            int r5 = r5.mo58779Qe(r12, r13)
            r7.f267170h = r5
            r5 = 2
            r0.Dx0(r7, r5)
            if (r11 != 0) goto L_0x00e2
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 422(0x1a6, double:2.085E-321)
            r15 = 31
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x00ef
        L_0x00e2:
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 422(0x1a6, double:2.085E-321)
            r23 = 32
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
        L_0x00ef:
            int r0 = r7.f267169g
            int r0 = r0 / 1000
            r11 = 5
            int[] r11 = new int[r11]
            r11 = {350, 544, 800, 1200, 1600} // fill-array
            r12 = 33
            r13 = 38
            java.lang.Object r0 = kj2.C117407d.m165559s(r0, r11, r12, r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r0)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 422(0x1a6, double:2.085E-321)
            long r14 = (long) r0
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11[r2] = r8
            r11[r3] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r5] = r0
            java.lang.String r0 = "get getMiaoJianAppVideoPara para cost %d. %s rpt %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r11)
            java.lang.String r0 = "filePath"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "MicroMsg.VideoTransCodeHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "transCode() called with: filePath = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = ", videoParam = "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r5 = "_tmp"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            rx3.g r0 = hd0.C32813d.f89260a
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            hd0.e r0 = (hd0.C32816e) r0
            if (r0 == 0) goto L_0x027b
            hd0.c r0 = r0.mo58820a()
            if (r0 == 0) goto L_0x027b
            int r6 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r4)
            r8 = 180(0xb4, float:2.52E-43)
            if (r6 == 0) goto L_0x0181
            if (r6 == r8) goto L_0x0181
            int r9 = r7.f267167e
            goto L_0x0183
        L_0x0181:
            int r9 = r7.f267166d
        L_0x0183:
            if (r6 == 0) goto L_0x018a
            if (r6 == r8) goto L_0x018a
            int r6 = r7.f267166d
            goto L_0x018c
        L_0x018a:
            int r6 = r7.f267167e
        L_0x018c:
            r7.f267166d = r9
            r7.f267167e = r6
            hd0.b r6 = new hd0.b
            r6.<init>(r7)
            boolean r8 = r7.f267165L
            r6.f288460d = r8
            java.lang.String r8 = "MicroMsg.VideoTransCodeHelper"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "transCode: svrEnableHevc "
            r9.append(r11)
            boolean r7 = r7.f267165L
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            gy3.a0 r8 = new gy3.a0
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r3)
            r11 = -1
            if (r9 != 0) goto L_0x01cd
            java.lang.String r0 = "MicroMsg.VideoTransCodeHelper"
            java.lang.String r3 = "transCode: get tmp file export path error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            goto L_0x0246
        L_0x01cd:
            java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r2)
            if (r12 != 0) goto L_0x01dc
            java.lang.String r0 = "MicroMsg.VideoTransCodeHelper"
            java.lang.String r3 = "transCode: get file export path error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            goto L_0x0246
        L_0x01dc:
            f72.c r13 = new f72.c
            r13.<init>(r8, r7)
            boolean r0 = r0.mo137683a(r12, r9, r6, r13)
            r8.f27482d = r0
            if (r0 != 0) goto L_0x01ed
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            goto L_0x0246
        L_0x01ed:
            monitor-enter(r7)
            r7.wait()     // Catch:{ Exception -> 0x01f5 }
            goto L_0x0200
        L_0x01f2:
            r0 = move-exception
            goto L_0x0279
        L_0x01f5:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "MicroMsg.VideoTransCodeHelper"
            java.lang.String r9 = ""
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x01f2 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r6, r9, r12)     // Catch:{ all -> 0x01f2 }
        L_0x0200:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01f2 }
            monitor-exit(r7)
            boolean r0 = r8.f27482d
            if (r0 == 0) goto L_0x023b
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106463x(r5, r4)
            com.tencent.mm.plugin.sight.base.a r3 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r4, r3)
            java.lang.String r4 = "MicroMsg.VideoTransCodeHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "transCode: trans finish, moveFile ret "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ", videoLen "
            r5.append(r0)
            if (r3 == 0) goto L_0x022c
            int r0 = r3.f273443a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x022c:
            r5.append(r10)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r3 == 0) goto L_0x023e
            int r0 = r3.f273443a
            goto L_0x023f
        L_0x023b:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x023e:
            r0 = -1
        L_0x023f:
            if (r0 <= 0) goto L_0x0246
            long r3 = (long) r0
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r3)
        L_0x0246:
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            java.lang.String r0 = r0.f265183a
            java.lang.String r3 = "videoPath"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkVideoMeta() called with: videoPath = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.VideoTransCodeHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            xb0.h r3 = xb0.C102609h.Fx0()
            byte[] r3 = r3.Ix0()
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagMP4Dscp(r0, r3)
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(r0)
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$b r0 = r1.f265182e
            r0.f265188a = r11
            goto L_0x02c4
        L_0x0279:
            monitor-exit(r7)
            throw r0
        L_0x027b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "transcoder creator is null"
            r0.<init>(r1)
            throw r0
        L_0x0284:
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            java.lang.String r0 = r0.f265183a
            xb0.h r4 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.mo142239cw()
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r5 = r1.f265181d
            te3.gu2 r6 = r5.f265185c
            i72.f r5 = r5.f265187e
            boolean r0 = i72.C98610m.m128210a(r0, r4, r6, r5)
            if (r0 == 0) goto L_0x02c0
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            java.lang.Runnable r0 = r0.f265186d
            com.tencent.mm.plugin.sns.model.x0 r0 = (com.tencent.p014mm.plugin.sns.model.C94968x0) r0
            r0.run()
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r0 = r1.f265181d
            java.lang.String r0 = r0.f265183a
            xb0.h r3 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.mo142239cw()
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a r4 = r1.f265181d
            te3.gu2 r5 = r4.f265185c
            i72.f r4 = r4.f265187e
            int r0 = i72.C98610m.m128211b(r0, r3, r5, r4)
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$b r1 = r1.f265182e
            r1.f265188a = r0
            goto L_0x02c4
        L_0x02c0:
            com.tencent.mm.autogen.events.SnsRemuxTaskEvent$b r0 = r1.f265182e
            r0.f265188a = r3
        L_0x02c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h72.C98319e.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
