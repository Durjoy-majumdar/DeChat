package j72;

/* renamed from: j72.s */
public class C108640s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108633r f325335d;

    /* renamed from: j72.s$a */
    public class C108641a implements Runnable {
        public C108641a() {
        }

        public void run() {
            C108640s.this.f325335d.f325299H.mo150355d(1);
        }
    }

    public C108640s(C108633r rVar) {
        this.f325335d = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r0 = r21
            j72.r r1 = r0.f325335d
            r1.getClass()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.os.HandlerThread r4 = r1.f325323s
            r5 = 0
            if (r4 == 0) goto L_0x0029
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r1.f325324t
            if (r4 == 0) goto L_0x0029
            r4 = 18
            boolean r4 = p206nj.C11171e.m11046c(r4)
            if (r4 == 0) goto L_0x0022
            android.os.HandlerThread r4 = r1.f325323s
            r4.quitSafely()
            goto L_0x0027
        L_0x0022:
            android.os.HandlerThread r4 = r1.f325323s
            r4.quit()
        L_0x0027:
            r1.f325324t = r5
        L_0x0029:
            j72.x r4 = r1.f325313i
            int r4 = r4.f325362g
            float r6 = (float) r4
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 * r7
            int r7 = r1.f325308d
            float r7 = (float) r7
            float r6 = r6 / r7
            r1.f325309e = r6
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r6[r7] = r4
            float r4 = r1.f325309e
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r8 = 1
            r6[r8] = r4
            int r4 = r1.f325308d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 2
            r6[r9] = r4
            java.lang.String r4 = r1.f325307c
            r10 = 3
            r6[r10] = r4
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 4
            r6[r3] = r2
            int r2 = r1.f325310f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 5
            r6[r4] = r2
            r2 = 6
            float r11 = r1.f325311g
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r6[r2] = r11
            java.lang.String r2 = "MicroMsg.MMSightMediaCodecMP4MuxRecorder"
            java.lang.String r11 = "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r6)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            i72.c r11 = r1.f325292A
            java.lang.String r11 = r11.mo158895c()
            r6[r7] = r11
            java.lang.String r11 = "frameCountCallback %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r6)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            i72.c r11 = r1.f325330z
            java.lang.String r11 = r11.mo158895c()
            r6[r7] = r11
            java.lang.String r11 = "yuvRecorderWriteDataCallback %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r6)
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r6 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            if (r6 == 0) goto L_0x00ab
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r5 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            java.lang.String r5 = r5.getAccVideoPath()
            goto L_0x00c2
        L_0x00ab:
            java.lang.String r6 = r1.f325307c
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00c2
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = r1.f325307c
            r5.<init>((java.lang.String) r6)
            com.tencent.mm.vfs.m1 r5 = r5.mo119974l()
            java.lang.String r5 = r5.mo119971i()
        L_0x00c2:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x00cd
            java.lang.String r5 = f72.C97842b.m126296m(r5)
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r5 = r1.f325307c
        L_0x00cf:
            int r6 = r1.f325308d
            int r11 = r1.f325310f
            if (r11 <= 0) goto L_0x00d8
            r16 = r11
            goto L_0x00da
        L_0x00d8:
            r16 = r6
        L_0x00da:
            float r6 = r1.f325309e
            float r11 = r1.f325311g
            r12 = 0
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00e5
            r14 = r11
            goto L_0x00e6
        L_0x00e5:
            r14 = r6
        L_0x00e6:
            j72.q r6 = new j72.q
            com.tencent.mm.plugin.sight.base.e r12 = new com.tencent.mm.plugin.sight.base.e
            int r11 = r1.f325322r
            r12.<init>(r11)
            int r15 = r1.f325317m
            com.tencent.mm.modelcontrol.VideoTransPara r11 = r1.f325293B
            int r13 = r11.f267174o
            boolean r11 = r1.f325303L
            r19 = 0
            r20 = 0
            r18 = r11
            r11 = r6
            r17 = r13
            r13 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.f325314j = r6
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            j72.q r6 = r1.f325314j
            boolean r6 = r6.mo159656a(r7)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13[r7] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r13[r8] = r11
            java.lang.String r11 = "mux used %sms, success: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r13)
            if (r6 != 0) goto L_0x0133
            java.lang.String r1 = "mux failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            i72.C108389l.m146844e()
            goto L_0x01dd
        L_0x0133:
            boolean r6 = r1.f325297F
            r11 = 180(0xb4, float:2.52E-43)
            if (r6 == 0) goto L_0x013d
            boolean r12 = r1.f325326v
            if (r12 != 0) goto L_0x0154
        L_0x013d:
            boolean r12 = r1.f325326v
            if (r12 != 0) goto L_0x0143
            if (r6 == 0) goto L_0x0154
        L_0x0143:
            if (r6 == 0) goto L_0x0150
            int r6 = r1.f325321q
            int r12 = r1.f325298G
            int r6 = r6 - r12
            int r6 = java.lang.Math.abs(r6)
            if (r6 == 0) goto L_0x0154
        L_0x0150:
            int r6 = r1.f325298G
            if (r6 != r11) goto L_0x01df
        L_0x0154:
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r6 = r1.f325326v
            if (r6 != 0) goto L_0x0163
            boolean r14 = r1.f325297F
            if (r14 != 0) goto L_0x0163
            int r14 = r1.f325321q
            goto L_0x016a
        L_0x0163:
            if (r6 == 0) goto L_0x0168
            int r14 = r1.f325298G
            goto L_0x016a
        L_0x0168:
            r14 = 180(0xb4, float:2.52E-43)
        L_0x016a:
            int r15 = r1.f325298G
            if (r15 != r11) goto L_0x0178
            if (r6 != 0) goto L_0x0178
            int r14 = r14 + 180
            r6 = 360(0x168, float:5.04E-43)
            if (r14 <= r6) goto L_0x0178
            int r14 = r14 + -360
        L_0x0178:
            if (r14 <= 0) goto L_0x01df
            java.lang.String r6 = r1.f325325u
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(r5, r6, r14)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r4[r7] = r6
            int r6 = r1.f325321q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r8] = r6
            boolean r6 = r1.f325297F
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r9] = r6
            int r6 = r1.f325298G
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r10] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r4[r3] = r6
            java.lang.String r3 = "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x01d8 }
            java.lang.String r6 = r1.f325325u     // Catch:{ Exception -> 0x01d8 }
            com.tencent.p014mm.vfs.C86013q1.m106463x(r6, r5)     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object[] r6 = new java.lang.Object[r8]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6[r7] = r3
            java.lang.String r3 = "copyFile cost %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r6)
            java.lang.String r3 = r1.f325325u
            j72.t r4 = new j72.t
            r4.<init>(r1, r3)
            java.lang.String r3 = "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r4, r3)
            goto L_0x01df
        L_0x01d8:
            java.lang.String r1 = "stop, copy file error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x01dd:
            r1 = 0
            goto L_0x0208
        L_0x01df:
            int r3 = r1.f325322r
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(r3)
            j72.z r3 = r1.f325320p
            j72.f$c r4 = j72.C108607f.C108610c.Stop
            r3.mo159676a(r4)
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)
            r1.f325296E = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r3 != 0) goto L_0x0207
            java.lang.String r3 = r1.f325307c
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0207
            java.lang.String r1 = r1.f325307c
            com.tencent.p014mm.vfs.C86013q1.m106463x(r5, r1)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x0207:
            r1 = 1
        L_0x0208:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r3[r7] = r4
            java.lang.String r4 = "stopImpl result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            if (r1 == 0) goto L_0x022a
            j72.r r1 = r0.f325335d
            java.lang.Runnable r1 = r1.f325300I
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = "call stopCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            j72.r r1 = r0.f325335d
            java.lang.Runnable r1 = r1.f325300I
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x023f
        L_0x022a:
            j72.r r1 = r0.f325335d
            int r1 = r1.f325322r
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(r1)
            j72.r r1 = r0.f325335d
            j72.f$a r1 = r1.f325299H
            if (r1 == 0) goto L_0x023f
            j72.s$a r1 = new j72.s$a
            r1.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.C108640s.run():void");
    }
}
