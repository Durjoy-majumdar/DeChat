package com.tencent.p014mm.plugin.facedetect.views;

import com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView;

/* renamed from: com.tencent.mm.plugin.facedetect.views.a */
public class C105239a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f312658d;

    /* renamed from: e */
    public final /* synthetic */ FaceDetectCameraView.C105232c f312659e;

    /* renamed from: com.tencent.mm.plugin.facedetect.views.a$a */
    public class C105240a implements Runnable {
        public C105240a() {
        }

        public void run() {
            FaceDetectCameraView.this.f312645y.mo160112a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.a$b */
    public class C105241b implements Runnable {
        public C105241b() {
        }

        public void run() {
            FaceDetectCameraView.this.f312645y.mo160112a(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.a$c */
    public class C105242c implements Runnable {
        public C105242c() {
        }

        public void run() {
            FaceDetectCameraView.this.f312645y.mo160112a(2);
        }
    }

    public C105239a(FaceDetectCameraView.C105232c cVar, long j) {
        this.f312659e = cVar;
        this.f312658d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r0 = r9.f312659e
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r0 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
            java.lang.Object r0 = r0.f312641u
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r2 = "hy: enter worker thread. using %d ms"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e6 }
            long r5 = r9.f312658d     // Catch:{ all -> 0x00e6 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)     // Catch:{ all -> 0x00e6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00e6 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x00e6 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r4 = r9.f312659e     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.model.s r5 = r4.f312647a     // Catch:{ all -> 0x00e6 }
            if (r5 != 0) goto L_0x0041
            java.lang.String r1 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r2 = "hy: already released"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r1 = r9.f312659e     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r1 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x00e6 }
            kb1.h r1 = r1.f312645y     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x003f
            com.tencent.mm.plugin.facedetect.views.a$a r1 = new com.tencent.mm.plugin.facedetect.views.a$a     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)     // Catch:{ all -> 0x00e6 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x0041:
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r4 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ Exception -> 0x00ca }
            int r7 = r4.f312643w     // Catch:{ Exception -> 0x00ca }
            int r4 = r4.f312644x     // Catch:{ Exception -> 0x00ca }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Exception -> 0x00ca }
            r8.<init>(r7, r4)     // Catch:{ Exception -> 0x00ca }
            r5.f312617e = r8     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r4 = r9.f312659e     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.model.s r5 = r4.f312647a     // Catch:{ Exception -> 0x00ca }
            gj.z r7 = r5.f312614b     // Catch:{ Exception -> 0x00ca }
            if (r7 == 0) goto L_0x005c
            boolean r7 = r5.f312621i     // Catch:{ Exception -> 0x00ca }
            if (r7 == 0) goto L_0x005c
            r7 = 1
            goto L_0x005d
        L_0x005c:
            r7 = 0
        L_0x005d:
            if (r7 != 0) goto L_0x0067
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r4 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ Exception -> 0x00ca }
            android.graphics.SurfaceTexture r4 = r4.f312632i     // Catch:{ Exception -> 0x00ca }
            r7 = 4
            r5.mo149598d(r4, r3, r7)     // Catch:{ Exception -> 0x00ca }
        L_0x0067:
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r4 = r9.f312659e     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.model.s r5 = r4.f312647a     // Catch:{ Exception -> 0x00ca }
            android.graphics.Point r5 = r5.f312616d     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r4 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ Exception -> 0x00ca }
            com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.m141327E(r4, r5)     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r4 = r9.f312659e     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.model.s r5 = r4.f312647a     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r4 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ Exception -> 0x00ca }
            android.graphics.SurfaceTexture r4 = r4.f312632i     // Catch:{ Exception -> 0x00ca }
            r5.mo149601g(r4)     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r4 = r9.f312659e     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.model.s r5 = r4.f312647a     // Catch:{ Exception -> 0x00ca }
            android.hardware.Camera$PreviewCallback r4 = r4.f312648b     // Catch:{ Exception -> 0x00ca }
            r5.mo149600f(r4)     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r4 = r9.f312659e     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r4 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ Exception -> 0x00ca }
            kb1.h r4 = r4.f312645y     // Catch:{ Exception -> 0x00ca }
            if (r4 == 0) goto L_0x0096
            com.tencent.mm.plugin.facedetect.views.a$b r4 = new com.tencent.mm.plugin.facedetect.views.a$b     // Catch:{ Exception -> 0x00ca }
            r4.<init>()     // Catch:{ Exception -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r4)     // Catch:{ Exception -> 0x00ca }
        L_0x0096:
            java.lang.String r4 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r5 = "hy: opened and start preview. use: %d ms"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00ca }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)     // Catch:{ Exception -> 0x00ca }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x00ca }
            r3[r6] = r1     // Catch:{ Exception -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r1 = r9.f312659e     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r1 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x00e6 }
            boolean r2 = r1.f312637q     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x00c8
            long r2 = r1.f312633j     // Catch:{ all -> 0x00e6 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c8
            java.lang.String r2 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r3 = "hy: already request scanning face and now automatically capture"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00e6 }
            kb1.a r2 = new kb1.a     // Catch:{ all -> 0x00e6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)     // Catch:{ all -> 0x00e6 }
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x00ca:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r3 = "hy: exception caused"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r1 = r9.f312659e     // Catch:{ all -> 0x00e6 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r1 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x00e6 }
            kb1.h r1 = r1.f312645y     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00e4
            com.tencent.mm.plugin.facedetect.views.a$c r1 = new com.tencent.mm.plugin.facedetect.views.a$c     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x00e6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.views.C105239a.run():void");
    }
}
