package com.tencent.p014mm.plugin.vlog.model;

import android.media.ImageReader;

/* renamed from: com.tencent.mm.plugin.vlog.model.m */
public final class C106200m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageReader f316479d;

    /* renamed from: e */
    public final /* synthetic */ C106197k f316480e;

    public C106200m(ImageReader imageReader, C106197k kVar) {
        this.f316479d = imageReader;
        this.f316480e = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[Catch:{ Exception -> 0x006f, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ Exception -> 0x006f, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[SYNTHETIC, Splitter:B:32:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088 A[Catch:{ Exception -> 0x006f, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[Catch:{ Exception -> 0x006f, all -> 0x0106 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.CompositionSoftwareEncoder"
            r1 = 0
            android.media.ImageReader r2 = r14.f316479d     // Catch:{ Exception -> 0x006f }
            android.view.Surface r2 = r2.getSurface()     // Catch:{ Exception -> 0x006f }
            boolean r2 = r2.isValid()     // Catch:{ Exception -> 0x006f }
            r3 = 1
            if (r2 == 0) goto L_0x00fa
            com.tencent.mm.plugin.vlog.model.k r2 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            w80.d$a r4 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x006f }
            android.media.ImageReader r5 = r14.f316479d     // Catch:{ Exception -> 0x006f }
            android.view.Surface r5 = r5.getSurface()     // Catch:{ Exception -> 0x006f }
            r6 = 0
            r7 = 0
            r8 = 0
            com.tencent.mm.plugin.vlog.model.k r9 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            com.tencent.tav.decoder.RenderContext r9 = r9.f316450a     // Catch:{ Exception -> 0x006f }
            r12 = 0
            if (r9 == 0) goto L_0x0029
            android.opengl.EGLContext r9 = r9.eglContext()     // Catch:{ Exception -> 0x006f }
            goto L_0x002a
        L_0x0029:
            r9 = r12
        L_0x002a:
            r10 = 14
            r11 = 0
            w80.d$b r4 = w80.C111742d.C111743a.m152352k(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x006f }
            r2.f316464o = r4     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.vlog.model.k r2 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            u80.g r13 = new u80.g     // Catch:{ Exception -> 0x006f }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 15
            r11 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.vlog.model.k r4 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x006f }
            r6 = 24
            if (r5 < r6) goto L_0x00c0
            android.media.MediaFormat r5 = r4.f316455f     // Catch:{ Exception -> 0x006f }
            java.lang.String r6 = "color-range"
            if (r5 == 0) goto L_0x0059
            boolean r5 = r5.containsKey(r6)     // Catch:{ Exception -> 0x006f }
            if (r5 != r3) goto L_0x0059
            r5 = 1
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            if (r5 == 0) goto L_0x0072
            android.media.MediaFormat r5 = r4.f316455f     // Catch:{ Exception -> 0x006f }
            if (r5 == 0) goto L_0x0068
            int r5 = r5.getInteger(r6)     // Catch:{ Exception -> 0x006f }
            if (r5 != r3) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            r13.f332853U = r5     // Catch:{ Exception -> 0x006f }
            r13.mo162883v()     // Catch:{ Exception -> 0x006f }
            goto L_0x0077
        L_0x006f:
            r2 = move-exception
            goto L_0x0108
        L_0x0072:
            java.lang.String r5 = "initRgb2YuvImageReader: do not containsKey KEY_COLOR_RANGE "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)     // Catch:{ Exception -> 0x006f }
        L_0x0077:
            android.media.MediaFormat r5 = r4.f316455f     // Catch:{ Exception -> 0x006f }
            java.lang.String r6 = "color-standard"
            if (r5 == 0) goto L_0x0085
            boolean r5 = r5.containsKey(r6)     // Catch:{ Exception -> 0x006f }
            if (r5 != r3) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 == 0) goto L_0x009b
            android.media.MediaFormat r4 = r4.f316455f     // Catch:{ Exception -> 0x006f }
            if (r4 == 0) goto L_0x0094
            int r4 = r4.getInteger(r6)     // Catch:{ Exception -> 0x006f }
            if (r4 != r3) goto L_0x0094
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            r13.f332854V = r4     // Catch:{ Exception -> 0x006f }
            r13.mo162883v()     // Catch:{ Exception -> 0x006f }
            goto L_0x00a0
        L_0x009b:
            java.lang.String r4 = "initRgb2YuvImageReader: do not containsKey KEY_COLOR_STANDARD "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)     // Catch:{ Exception -> 0x006f }
        L_0x00a0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006f }
            r4.<init>()     // Catch:{ Exception -> 0x006f }
            java.lang.String r5 = "initRgb2YuvImageReader: trans is fullRange "
            r4.append(r5)     // Catch:{ Exception -> 0x006f }
            boolean r5 = r13.f332853U     // Catch:{ Exception -> 0x006f }
            r4.append(r5)     // Catch:{ Exception -> 0x006f }
            java.lang.String r5 = ", is yuv709 "
            r4.append(r5)     // Catch:{ Exception -> 0x006f }
            boolean r5 = r13.f332854V     // Catch:{ Exception -> 0x006f }
            r4.append(r5)     // Catch:{ Exception -> 0x006f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x006f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x006f }
        L_0x00c0:
            r2.f316463n = r13     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.vlog.model.k r2 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            u80.g r4 = r2.f316463n     // Catch:{ Exception -> 0x006f }
            if (r4 == 0) goto L_0x00cf
            int r5 = r2.f316466q     // Catch:{ Exception -> 0x006f }
            int r2 = r2.f316467r     // Catch:{ Exception -> 0x006f }
            r4.mo158522s(r5, r2)     // Catch:{ Exception -> 0x006f }
        L_0x00cf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006f }
            r2.<init>()     // Catch:{ Exception -> 0x006f }
            java.lang.String r4 = "create rgb2yuvEGLEnvironment:"
            r2.append(r4)     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.vlog.model.k r4 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            w80.d$b r4 = r4.f316464o     // Catch:{ Exception -> 0x006f }
            r2.append(r4)     // Catch:{ Exception -> 0x006f }
            java.lang.String r4 = ", shareEGLContext:"
            r2.append(r4)     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.vlog.model.k r4 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            com.tencent.tav.decoder.RenderContext r4 = r4.f316450a     // Catch:{ Exception -> 0x006f }
            if (r4 == 0) goto L_0x00ef
            android.opengl.EGLContext r12 = r4.eglContext()     // Catch:{ Exception -> 0x006f }
        L_0x00ef:
            r2.append(r12)     // Catch:{ Exception -> 0x006f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x006f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x006f }
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r2 = "create rgb2yuvEGLEnvironment error surface invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ Exception -> 0x006f }
        L_0x00ff:
            com.tencent.mm.plugin.vlog.model.k r2 = r14.f316480e     // Catch:{ Exception -> 0x006f }
            r2.f316462m = r3     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.vlog.model.k r0 = r14.f316480e
            goto L_0x0115
        L_0x0106:
            r0 = move-exception
            goto L_0x011b
        L_0x0108:
            java.lang.String r3 = "configure imageReader render error"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0106 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r4)     // Catch:{ all -> 0x0106 }
            com.tencent.mm.plugin.vlog.model.k r0 = r14.f316480e     // Catch:{ all -> 0x0106 }
            r0.f316462m = r1     // Catch:{ all -> 0x0106 }
            com.tencent.mm.plugin.vlog.model.k r0 = r14.f316480e
        L_0x0115:
            android.os.ConditionVariable r0 = r0.f316465p
            r0.open()
            return
        L_0x011b:
            com.tencent.mm.plugin.vlog.model.k r1 = r14.f316480e
            android.os.ConditionVariable r1 = r1.f316465p
            r1.open()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C106200m.run():void");
    }
}
