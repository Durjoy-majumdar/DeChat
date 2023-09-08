package com.tencent.p014mm.plugin.api.recordView;

/* renamed from: com.tencent.mm.plugin.api.recordView.g */
public class C104731g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f311021d;

    /* renamed from: e */
    public final /* synthetic */ int f311022e;

    /* renamed from: f */
    public final /* synthetic */ C104729f f311023f;

    public C104731g(C104729f fVar, byte[] bArr, int i) {
        this.f311023f = fVar;
        this.f311021d = bArr;
        this.f311022e = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076 A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            com.tencent.mm.plugin.api.recordView.f r0 = r15.f311023f
            com.tencent.mm.plugin.api.recordView.i r1 = r0.f311007c
            byte[] r2 = r15.f311021d
            int r3 = r0.f311009e
            int r4 = r0.f311010f
            int r0 = r0.f311011g
            int r5 = r15.f311022e
            r1.getClass()
            java.lang.String r6 = "MicroMsg.YUVDateRenderToRGBBufferRenderer"
            r7 = 0
            r8 = 1
            int r9 = r1.f311031e     // Catch:{ Exception -> 0x00c6 }
            if (r9 != r4) goto L_0x0028
            int r9 = r1.f311030d     // Catch:{ Exception -> 0x00c6 }
            if (r9 != r3) goto L_0x0028
            int r9 = r1.f311032f     // Catch:{ Exception -> 0x00c6 }
            if (r9 != r0) goto L_0x0028
            int r9 = r1.f311046t     // Catch:{ Exception -> 0x00c6 }
            if (r9 == r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r9 = 0
            goto L_0x0029
        L_0x0028:
            r9 = 1
        L_0x0029:
            r10 = 2
            if (r9 == 0) goto L_0x0059
            java.lang.String r11 = "setDrawFrame, frameData: %s, frameWidth: %s, frameHeight: %s, rotate: %s, isLandScape, frameSizeChange: %s, this %s"
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00c6 }
            r12[r7] = r2     // Catch:{ Exception -> 0x00c6 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00c6 }
            r12[r8] = r13     // Catch:{ Exception -> 0x00c6 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00c6 }
            r12[r10] = r13     // Catch:{ Exception -> 0x00c6 }
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00c6 }
            r12[r13] = r14     // Catch:{ Exception -> 0x00c6 }
            r13 = 4
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00c6 }
            r12[r13] = r14     // Catch:{ Exception -> 0x00c6 }
            r13 = 5
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x00c6 }
            r12[r13] = r14     // Catch:{ Exception -> 0x00c6 }
            r13 = 6
            r12[r13] = r1     // Catch:{ Exception -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r11, r12)     // Catch:{ Exception -> 0x00c6 }
        L_0x0059:
            byte[] r11 = r1.f311029c     // Catch:{ Exception -> 0x00c6 }
            if (r11 == 0) goto L_0x0061
            int r11 = r11.length     // Catch:{ Exception -> 0x00c6 }
            int r12 = r2.length     // Catch:{ Exception -> 0x00c6 }
            if (r11 == r12) goto L_0x0066
        L_0x0061:
            int r11 = r2.length     // Catch:{ Exception -> 0x00c6 }
            byte[] r11 = new byte[r11]     // Catch:{ Exception -> 0x00c6 }
            r1.f311029c = r11     // Catch:{ Exception -> 0x00c6 }
        L_0x0066:
            byte[] r11 = r1.f311029c     // Catch:{ Exception -> 0x00c6 }
            int r12 = r2.length     // Catch:{ Exception -> 0x00c6 }
            java.lang.System.arraycopy(r2, r7, r11, r7, r12)     // Catch:{ Exception -> 0x00c6 }
            r1.f311030d = r3     // Catch:{ Exception -> 0x00c6 }
            r1.f311031e = r4     // Catch:{ Exception -> 0x00c6 }
            r1.f311032f = r0     // Catch:{ Exception -> 0x00c6 }
            r1.f311046t = r5     // Catch:{ Exception -> 0x00c6 }
            if (r9 == 0) goto L_0x00a3
            int r0 = r4 * r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x00c6 }
            r1.f311033g = r2     // Catch:{ Exception -> 0x00c6 }
            int r0 = r0 / r10
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x00c6 }
            r1.f311034h = r0     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteBuffer r0 = r1.f311033g     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x00c6 }
            r0.order(r2)     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteBuffer r0 = r1.f311034h     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x00c6 }
            r0.order(r2)     // Catch:{ Exception -> 0x00c6 }
            float[] r0 = com.tencent.p014mm.plugin.api.recordView.C104733i.f311025x     // Catch:{ Exception -> 0x00c6 }
            java.nio.FloatBuffer r2 = r1.f311043q     // Catch:{ Exception -> 0x00c6 }
            r2.put(r0)     // Catch:{ Exception -> 0x00c6 }
            java.nio.FloatBuffer r0 = r1.f311043q     // Catch:{ Exception -> 0x00c6 }
            r0.position(r7)     // Catch:{ Exception -> 0x00c6 }
        L_0x00a3:
            java.nio.ByteBuffer r0 = r1.f311033g     // Catch:{ Exception -> 0x00c6 }
            if (r0 == 0) goto L_0x00d5
            java.nio.ByteBuffer r2 = r1.f311034h     // Catch:{ Exception -> 0x00c6 }
            if (r2 == 0) goto L_0x00d5
            byte[] r2 = r1.f311029c     // Catch:{ Exception -> 0x00c6 }
            int r3 = r3 * r4
            r0.put(r2, r7, r3)     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteBuffer r0 = r1.f311033g     // Catch:{ Exception -> 0x00c6 }
            r0.position(r7)     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteBuffer r0 = r1.f311034h     // Catch:{ Exception -> 0x00c6 }
            byte[] r2 = r1.f311029c     // Catch:{ Exception -> 0x00c6 }
            int r4 = r3 / 2
            r0.put(r2, r3, r4)     // Catch:{ Exception -> 0x00c6 }
            java.nio.ByteBuffer r0 = r1.f311034h     // Catch:{ Exception -> 0x00c6 }
            r0.position(r7)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00d5
        L_0x00c6:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getMessage()
            r1[r7] = r0
            java.lang.String r0 = "setDrawFrame error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r1)
        L_0x00d5:
            com.tencent.mm.plugin.api.recordView.f r0 = r15.f311023f
            com.tencent.mm.plugin.api.recordView.i r0 = r0.f311007c
            r1 = 0
            r0.onDrawFrame(r1)
            com.tencent.mm.plugin.api.recordView.f r0 = r15.f311023f
            com.tencent.mm.plugin.api.recordView.i$a r0 = r0.f311008d
            if (r0 == 0) goto L_0x00e6
            r0.mo148407a()
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.api.recordView.C104731g.run():void");
    }
}
