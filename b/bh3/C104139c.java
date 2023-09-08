package bh3;

import j20.C117293c;

/* renamed from: bh3.c */
public final class C104139c implements C117293c {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo109570a(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Object r14, java.lang.Object[] r15) {
        /*
            r8 = this;
            bh3.d r9 = bh3.C104140d.f308132a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[CameraHooker] method:"
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = ",methodDec:"
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = ",caller:"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "CameraHooker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.String r9 = "openCamera"
            boolean r9 = gy3.C87412m.m108589b(r12, r9)
            r11 = 0
            if (r9 == 0) goto L_0x0183
            java.lang.String r9 = "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V"
            boolean r9 = gy3.C87412m.m108589b(r13, r9)
            java.lang.String r0 = "using camera2 but StateCallback is not MMCameraStateCallBack, "
            java.lang.String r1 = "null cannot be cast to non-null type android.hardware.camera2.CameraDevice.StateCallback"
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r3 = "on camera2 open"
            r4 = 2
            r5 = 0
            r6 = 1
            if (r9 == 0) goto L_0x00dd
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r9 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.f347926a
            boolean r13 = r9.mo176849f()
            if (r13 != 0) goto L_0x009e
            if (r15 == 0) goto L_0x0050
            int r13 = r15.length
            goto L_0x0051
        L_0x0050:
            r13 = 0
        L_0x0051:
            if (r13 < r4) goto L_0x0055
            r13 = 1
            goto L_0x0056
        L_0x0055:
            r13 = 0
        L_0x0056:
            if (r13 == 0) goto L_0x005a
            r13 = r15
            goto L_0x005b
        L_0x005a:
            r13 = r11
        L_0x005b:
            if (r13 == 0) goto L_0x0080
            r7 = r13[r6]
            boolean r7 = r7 instanceof bh3.C104144l
            if (r7 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r13 = r11
        L_0x0065:
            if (r13 == 0) goto L_0x0080
            r13 = r13[r6]
            boolean r7 = r13 instanceof bh3.C104144l
            if (r7 == 0) goto L_0x0070
            bh3.l r13 = (bh3.C104144l) r13
            goto L_0x0071
        L_0x0070:
            r13 = r11
        L_0x0071:
            if (r13 == 0) goto L_0x0080
            boolean r9 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163124b(r9, r12, r11, r4, r11)
            if (r9 == 0) goto L_0x007d
            r13.mo145785a()
            return r11
        L_0x007d:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            goto L_0x0081
        L_0x0080:
            r9 = r11
        L_0x0081:
            if (r9 != 0) goto L_0x009e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.Throwable r12 = new java.lang.Throwable
            r12.<init>()
            java.lang.String r12 = android.util.Log.getStackTraceString(r12)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x009e:
            boolean r9 = r14 instanceof android.hardware.camera2.CameraManager
            if (r9 == 0) goto L_0x00a5
            android.hardware.camera2.CameraManager r14 = (android.hardware.camera2.CameraManager) r14
            goto L_0x00a6
        L_0x00a5:
            r14 = r11
        L_0x00a6:
            if (r15 == 0) goto L_0x00b3
            int r9 = r15.length
            if (r9 != 0) goto L_0x00ad
            r9 = 1
            goto L_0x00ae
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            r9 = r9 ^ r6
            if (r9 != r6) goto L_0x00b3
            r9 = 1
            goto L_0x00b4
        L_0x00b3:
            r9 = 0
        L_0x00b4:
            if (r9 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r15 = r11
        L_0x00b8:
            if (r15 == 0) goto L_0x00dc
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            if (r14 == 0) goto L_0x00dc
            r9 = r15[r5]
            gy3.C87412m.m108592e(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            r10 = r15[r6]
            gy3.C87412m.m108592e(r10, r1)
            android.hardware.camera2.CameraDevice$StateCallback r10 = (android.hardware.camera2.CameraDevice.StateCallback) r10
            r12 = r15[r4]
            boolean r13 = r12 instanceof android.os.Handler
            if (r13 == 0) goto L_0x00d6
            r11 = r12
            android.os.Handler r11 = (android.os.Handler) r11
        L_0x00d6:
            r14.openCamera(r9, r10, r11)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r11 = r9
        L_0x00dc:
            return r11
        L_0x00dd:
            java.lang.String r9 = "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V"
            boolean r9 = gy3.C87412m.m108589b(r13, r9)
            if (r9 == 0) goto L_0x0183
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r9 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.f347926a
            boolean r13 = r9.mo176849f()
            if (r13 != 0) goto L_0x0140
            if (r15 == 0) goto L_0x00f1
            int r13 = r15.length
            goto L_0x00f2
        L_0x00f1:
            r13 = 0
        L_0x00f2:
            r7 = 3
            if (r13 < r7) goto L_0x00f7
            r13 = 1
            goto L_0x00f8
        L_0x00f7:
            r13 = 0
        L_0x00f8:
            if (r13 == 0) goto L_0x00fc
            r13 = r15
            goto L_0x00fd
        L_0x00fc:
            r13 = r11
        L_0x00fd:
            if (r13 == 0) goto L_0x0122
            r7 = r13[r4]
            boolean r7 = r7 instanceof bh3.C104144l
            if (r7 == 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r13 = r11
        L_0x0107:
            if (r13 == 0) goto L_0x0122
            r13 = r13[r4]
            boolean r7 = r13 instanceof bh3.C104144l
            if (r7 == 0) goto L_0x0112
            bh3.l r13 = (bh3.C104144l) r13
            goto L_0x0113
        L_0x0112:
            r13 = r11
        L_0x0113:
            if (r13 == 0) goto L_0x0122
            boolean r9 = com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163124b(r9, r12, r11, r4, r11)
            if (r9 == 0) goto L_0x011f
            r13.mo145785a()
            return r11
        L_0x011f:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            goto L_0x0123
        L_0x0122:
            r9 = r11
        L_0x0123:
            if (r9 != 0) goto L_0x0140
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.Throwable r12 = new java.lang.Throwable
            r12.<init>()
            java.lang.String r12 = android.util.Log.getStackTraceString(r12)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x0140:
            boolean r9 = r14 instanceof android.hardware.camera2.CameraManager
            if (r9 == 0) goto L_0x0147
            android.hardware.camera2.CameraManager r14 = (android.hardware.camera2.CameraManager) r14
            goto L_0x0148
        L_0x0147:
            r14 = r11
        L_0x0148:
            if (r15 == 0) goto L_0x0155
            int r9 = r15.length
            if (r9 != 0) goto L_0x014f
            r9 = 1
            goto L_0x0150
        L_0x014f:
            r9 = 0
        L_0x0150:
            r9 = r9 ^ r6
            if (r9 != r6) goto L_0x0155
            r9 = 1
            goto L_0x0156
        L_0x0155:
            r9 = 0
        L_0x0156:
            if (r9 == 0) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r15 = r11
        L_0x015a:
            if (r15 == 0) goto L_0x0183
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r9 < r11) goto L_0x0181
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            if (r14 == 0) goto L_0x0181
            r9 = r15[r5]
            gy3.C87412m.m108592e(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            r10 = r15[r6]
            java.lang.String r11 = "null cannot be cast to non-null type java.util.concurrent.Executor"
            gy3.C87412m.m108592e(r10, r11)
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10
            r11 = r15[r4]
            gy3.C87412m.m108592e(r11, r1)
            android.hardware.camera2.CameraDevice$StateCallback r11 = (android.hardware.camera2.CameraDevice.StateCallback) r11
            r14.openCamera(r9, r10, r11)
        L_0x0181:
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x0183:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C104139c.mo109570a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[]):java.lang.Object");
    }
}
