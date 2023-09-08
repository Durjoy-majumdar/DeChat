package m90;

import lu3.C88656g;

/* renamed from: m90.i */
public class C109570i implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ C109557d f327996d;

    /* renamed from: m90.i$a */
    public class C109571a implements Runnable {
        public C109571a() {
        }

        public void run() {
            C109570i.this.f327996d.f327938D.mo150355d(1);
        }
    }

    public C109570i(C109557d dVar) {
        this.f327996d = dVar;
    }

    public String getKey() {
        return "MMSightMediaCodecMP4MuxRecorder_stop";
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r27 = this;
            r1 = r27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "["
            r0.append(r2)
            int r3 = r27.hashCode()
            r0.append(r3)
            java.lang.String r3 = "] stopImpl status:%s"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            m90.d r5 = r1.f327996d
            j72.z r5 = r5.f327975o
            j72.f$c r5 = r5.f325384a
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "MicroMsg.Media.MediaCodecMP4MuxRecorder"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r4)
            m90.d r0 = r1.f327996d
            j72.z r4 = r0.f327975o
            j72.f$c r4 = r4.f325384a
            j72.f$c r7 = j72.C108607f.C108610c.Stop
            if (r4 != r7) goto L_0x005c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r2 = r27.hashCode()
            r0.append(r2)
            java.lang.String r2 = "] stopImp, already stop"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            m90.d r0 = r1.f327996d
            m90.a r0 = r0.f327968h
            if (r0 == 0) goto L_0x005b
            r0.clear()
        L_0x005b:
            return
        L_0x005c:
            r0.getClass()
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            n80.b r4 = r0.f327969i
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            if (r4 != 0) goto L_0x0088
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r0 = r0.hashCode()
            r4.append(r0)
            java.lang.String r0 = "] muxTask, videoEncoder is null"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0359
        L_0x0088:
            int r4 = r4.f328349f
            int r15 = r0.f327964d
            if (r15 > 0) goto L_0x00b5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r7 = r0.hashCode()
            r4.append(r7)
            java.lang.String r7 = "] muxTask, mDurationMS error %s"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            int r0 = r0.f327964d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r7)
            goto L_0x0359
        L_0x00b5:
            float r10 = (float) r4
            r17 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 * r17
            float r15 = (float) r15
            float r10 = r10 / r15
            r0.f327965e = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            int r15 = r0.hashCode()
            r10.append(r15)
            java.lang.String r15 = "] stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s"
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            r15 = 7
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15[r6] = r4
            float r4 = r0.f327965e
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r15[r3] = r4
            int r4 = r0.f327964d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15[r14] = r4
            java.lang.String r4 = r0.f327963c
            r15[r13] = r4
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r15[r12] = r4
            int r4 = r0.f327966f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15[r11] = r4
            r4 = 6
            float r8 = r0.f327967g
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r15[r4] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r8 = r0.hashCode()
            r4.append(r8)
            java.lang.String r8 = "] frameCountCallback %s"
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            i72.c r9 = r0.f327983w
            java.lang.String r9 = r9.mo158895c()
            r8[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r8 = r0.hashCode()
            r4.append(r8)
            java.lang.String r8 = "] yuvRecorderWriteDataCallback %s"
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            i72.c r9 = r0.f327982v
            java.lang.String r9 = r9.mo158895c()
            r8[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r8)
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r4 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            if (r4 == 0) goto L_0x016a
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r4 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            java.lang.String r4 = r4.getAccVideoPath()
            goto L_0x0183
        L_0x016a:
            java.lang.String r4 = r0.f327963c
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0182
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = r0.f327963c
            r4.<init>((java.lang.String) r8)
            com.tencent.mm.vfs.m1 r4 = r4.mo119974l()
            java.lang.String r4 = r4.mo119971i()
            goto L_0x0183
        L_0x0182:
            r4 = 0
        L_0x0183:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r8 != 0) goto L_0x01c6
            int r8 = r0.hashCode()
            boolean r9 = f72.C97842b.f286991a
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            java.lang.Object[] r10 = new java.lang.Object[r14]
            r10[r6] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r8 = ""
            r4.append(r8)
            long r12 = java.lang.System.currentTimeMillis()
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r10[r3] = r4
            java.lang.String r4 = "%s/%s.mp4"
            java.lang.String r4 = java.lang.String.format(r4, r10)
            r9.<init>((java.lang.String) r4)
            boolean r4 = r9.mo119967g()
            if (r4 == 0) goto L_0x01c1
            r9.mo119966f()
        L_0x01c1:
            java.lang.String r4 = r9.mo119971i()
            goto L_0x01c8
        L_0x01c6:
            java.lang.String r4 = r0.f327963c
        L_0x01c8:
            int r9 = r0.f327964d
            int r10 = r0.f327966f
            if (r10 <= 0) goto L_0x01d1
            r22 = r10
            goto L_0x01d3
        L_0x01d1:
            r22 = r9
        L_0x01d3:
            float r9 = r0.f327965e
            float r10 = r0.f327967g
            r12 = 0
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x01df
            r20 = r10
            goto L_0x01e1
        L_0x01df:
            r20 = r9
        L_0x01e1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r10 = r0.hashCode()
            r9.append(r10)
            java.lang.String r10 = "] muxResultPath : "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            j72.q r9 = new j72.q
            com.tencent.mm.plugin.sight.base.e r10 = r0.f327977q
            int r12 = r0.f327972l
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r0.f327984x
            int r13 = r13.f267174o
            boolean r8 = r0.f327941G
            if (r8 == 0) goto L_0x0214
            boolean r8 = r0.f327954T
            if (r8 != 0) goto L_0x0214
            r24 = 1
            goto L_0x0216
        L_0x0214:
            r24 = 0
        L_0x0216:
            r25 = 0
            boolean r8 = r0.f327978r
            r17 = r9
            r18 = r10
            r19 = r4
            r21 = r12
            r23 = r13
            r26 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r8 = r0.f327978r
            boolean r8 = com.tencent.p014mm.plugin.sight.base.C85456b.m105448a(r6, r8)
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r8 = r9.mo159656a(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r10 = r0.hashCode()
            r9.append(r10)
            java.lang.String r10 = "] mux used %sms, success: %s"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r14]
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r10[r6] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            r10[r3] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[r14]
            int r10 = r0.f327955U
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r6] = r10
            int r10 = r0.f327956V
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r3] = r10
            java.lang.String r10 = "mux finish, dtsCount:%d, ptsCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            if (r8 != 0) goto L_0x029d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r0 = r0.hashCode()
            r4.append(r0)
            java.lang.String r0 = "] mux failed!"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            i72.C108389l.m146844e()
            goto L_0x0359
        L_0x029d:
            boolean r8 = r0.f327936B
            if (r8 == 0) goto L_0x035b
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r10 = r0.f327937C
            r12 = 270(0x10e, float:3.78E-43)
            if (r10 != r12) goto L_0x02ac
            goto L_0x02ae
        L_0x02ac:
            r12 = 90
        L_0x02ae:
            java.lang.String r10 = r0.f327979s
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(r4, r10, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            int r13 = r0.hashCode()
            r10.append(r13)
            java.lang.String r13 = "] tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s"
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r13 = new java.lang.Object[r11]
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r13[r6] = r8
            int r8 = r0.f327976p
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13[r3] = r8
            boolean r8 = r0.f327936B
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r13[r14] = r8
            int r8 = r0.f327937C
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 3
            r13[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r9 = 4
            r13[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r13)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ Exception -> 0x033e }
            java.lang.String r12 = r0.f327979s     // Catch:{ Exception -> 0x033e }
            com.tencent.p014mm.vfs.C86013q1.m106463x(r12, r4)     // Catch:{ Exception -> 0x033e }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            int r13 = r0.hashCode()
            r12.append(r13)
            java.lang.String r13 = "] copyFile cost %s"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object[] r13 = new java.lang.Object[r3]
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r13[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r12, r13)
            java.lang.String r9 = r0.f327979s
            zt3.t r10 = zt3.C119157j.f356862d
            m90.j r12 = new m90.j
            r12.<init>(r0, r9)
            zt3.j r10 = (zt3.C119157j) r10
            java.lang.String r9 = "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process"
            r10.mo183876g(r12, r9)
            goto L_0x035b
        L_0x033e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r0 = r0.hashCode()
            r4.append(r0)
            java.lang.String r0 = "] stop, copy file error"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0359:
            r0 = 0
            goto L_0x0382
        L_0x035b:
            com.tencent.mm.plugin.sight.base.e r9 = r0.f327977q
            r9.mo151875c()
            j72.z r9 = r0.f327975o
            r9.mo159676a(r7)
            java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)
            r0.f327935A = r7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 != 0) goto L_0x0381
            java.lang.String r7 = r0.f327963c
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0381
            java.lang.String r0 = r0.f327963c
            com.tencent.p014mm.vfs.C86013q1.m106463x(r4, r0)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r4)
        L_0x0381:
            r0 = 1
        L_0x0382:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int r7 = r27.hashCode()
            r4.append(r7)
            java.lang.String r7 = "] stopImpl result: %s"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r7[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r7)
            java.lang.String r4 = "MicroMsg.MediaEditorIDKeyStat"
            if (r0 == 0) goto L_0x05ad
            java.lang.String r0 = "markMediaCodecCaptureSuccess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 985(0x3d9, double:4.867E-321)
            r20 = 22
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            m90.d r7 = r1.f327996d
            java.lang.String r0 = r7.f327963c
            android.graphics.Bitmap r0 = f72.C97842b.m126300q(r0)
            if (r0 != 0) goto L_0x03e3
            r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r7 = r7.hashCode()
            r0.append(r7)
            java.lang.String r7 = "] saveVideoThumbImpl with null bitmap"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x04ec
        L_0x03e3:
            java.lang.String r9 = r7.f327980t
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0408
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r7 = r7.hashCode()
            r0.append(r7)
            java.lang.String r7 = "] saveVideoThumbImpl, thumbpath is null"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x04ec
        L_0x0408:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r10 = r7.hashCode()
            r9.append(r10)
            java.lang.String r10 = "] prepare to save bitmap : $s  to  $s"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r14]
            int r12 = r0.hashCode()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r6] = r12
            java.lang.String r12 = r7.f327980t
            r10[r3] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r10 = r7.hashCode()
            r9.append(r10)
            java.lang.String r10 = "] thumb parent path : %s"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r12 = r7.f327980t
            java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106458s(r12)
            r10[r6] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r10)
            r9 = 100
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x04ad }
            java.lang.String r12 = r7.f327980t     // Catch:{ IOException -> 0x04ad }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r9, r10, r12, r3)     // Catch:{ IOException -> 0x04ad }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04ad }
            r9.<init>()     // Catch:{ IOException -> 0x04ad }
            r9.append(r2)     // Catch:{ IOException -> 0x04ad }
            int r10 = r7.hashCode()     // Catch:{ IOException -> 0x04ad }
            r9.append(r10)     // Catch:{ IOException -> 0x04ad }
            java.lang.String r10 = "] saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s %s"
            r9.append(r10)     // Catch:{ IOException -> 0x04ad }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x04ad }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x04ad }
            java.lang.String r11 = r7.f327980t     // Catch:{ IOException -> 0x04ad }
            r10[r6] = r11     // Catch:{ IOException -> 0x04ad }
            int r11 = r7.f327976p     // Catch:{ IOException -> 0x04ad }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x04ad }
            r10[r3] = r11     // Catch:{ IOException -> 0x04ad }
            int r11 = r0.getWidth()     // Catch:{ IOException -> 0x04ad }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x04ad }
            r10[r14] = r11     // Catch:{ IOException -> 0x04ad }
            int r0 = r0.getHeight()     // Catch:{ IOException -> 0x04ad }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x04ad }
            r11 = 3
            r10[r11] = r0     // Catch:{ IOException -> 0x04ad }
            java.lang.String r0 = r7.f327980t     // Catch:{ IOException -> 0x04ad }
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ IOException -> 0x04ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ IOException -> 0x04ad }
            r8 = 4
            r10[r8] = r0     // Catch:{ IOException -> 0x04ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r10)     // Catch:{ IOException -> 0x04ad }
            goto L_0x04ec
        L_0x04ad:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            int r9 = r7.hashCode()
            r8.append(r9)
            java.lang.String r9 = "] saveVideoThumbImpl error"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            int r7 = r7.hashCode()
            r8.append(r7)
            java.lang.String r7 = "] saveVideoThumbImpl error! %s"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r0.getMessage()
            r8[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r7, r8)
        L_0x04ec:
            m90.d r0 = r1.f327996d
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.f327984x
            int r0 = r0.f267181v
            if (r0 != r14) goto L_0x0529
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r7 = r27.hashCode()
            r0.append(r7)
            java.lang.String r7 = "] steve:[hardcoder] hwenc qp add metadata flag, switch:%s"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            m90.d r8 = r1.f327996d
            com.tencent.mm.modelcontrol.VideoTransPara r8 = r8.f327984x
            int r8 = r8.f267181v
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r6] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)
            m90.d r0 = r1.f327996d
            java.lang.String r7 = r0.f327963c
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.f327984x
            int r0 = r0.f267181v
            r8 = 0
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r7, r8, r6, r0)
        L_0x0529:
            m90.d r0 = r1.f327996d     // Catch:{ Exception -> 0x0569 }
            java.lang.String r0 = r0.f327963c     // Catch:{ Exception -> 0x0569 }
            com.tencent.mm.plugin.sight.base.a r0 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r0, r3)     // Catch:{ Exception -> 0x0569 }
            if (r0 == 0) goto L_0x0584
            int r3 = r0.f273444b     // Catch:{ Exception -> 0x0569 }
            int r0 = r0.f273447e     // Catch:{ Exception -> 0x0569 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0569 }
            r6.<init>()     // Catch:{ Exception -> 0x0569 }
            java.lang.String r7 = "markMediaCodecCaptureResult, bitrate:"
            r6.append(r7)     // Catch:{ Exception -> 0x0569 }
            r6.append(r3)     // Catch:{ Exception -> 0x0569 }
            java.lang.String r7 = ", fps:"
            r6.append(r7)     // Catch:{ Exception -> 0x0569 }
            r6.append(r0)     // Catch:{ Exception -> 0x0569 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0569 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)     // Catch:{ Exception -> 0x0569 }
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0569 }
            long r12 = (long) r3     // Catch:{ Exception -> 0x0569 }
            r14 = 985(0x3d9, double:4.867E-321)
            r10 = 21
            r8 = 985(0x3d9, double:4.867E-321)
            r7 = r6
            r7.mo175913w(r8, r10, r12)     // Catch:{ Exception -> 0x0569 }
            long r12 = (long) r0     // Catch:{ Exception -> 0x0569 }
            r10 = 24
            r7 = r6
            r8 = r14
            r7.mo175913w(r8, r10, r12)     // Catch:{ Exception -> 0x0569 }
            goto L_0x0584
        L_0x0569:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r3 = r27.hashCode()
            r0.append(r3)
            java.lang.String r3 = "] SightUtil.getMedia error !"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0584:
            m90.d r0 = r1.f327996d
            java.lang.Runnable r0 = r0.f327939E
            if (r0 == 0) goto L_0x05d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r2 = r27.hashCode()
            r0.append(r2)
            java.lang.String r2 = "] call stopCallback"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            m90.d r0 = r1.f327996d
            java.lang.Runnable r0 = r0.f327939E
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x05d2
        L_0x05ad:
            java.lang.String r0 = "markMediaCodecCaptureFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 985(0x3d9, double:4.867E-321)
            r8 = 20
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            m90.d r0 = r1.f327996d
            com.tencent.mm.plugin.sight.base.e r0 = r0.f327977q
            r0.mo151875c()
            m90.d r0 = r1.f327996d
            j72.f$a r0 = r0.f327938D
            if (r0 == 0) goto L_0x05d2
            m90.i$a r0 = new m90.i$a
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x05d2:
            long r2 = w80.C102361h.f301460b
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0609
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "markMediaCodecWaitStop, waitTime:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 985(0x3d9, double:4.867E-321)
            r8 = 17
            r5 = r12
            r5.mo175913w(r6, r8, r10)
            r13 = 985(0x3d9, double:4.867E-321)
            r15 = 18
            r17 = 1
            r12.mo175913w(r13, r15, r17)
            r2 = -1
            w80.C102361h.f301460b = r2
        L_0x0609:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C109570i.run():void");
    }
}
