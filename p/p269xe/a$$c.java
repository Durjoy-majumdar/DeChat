package p269xe;

import p981ie.C87705i;

/* renamed from: xe.a$$c */
public final /* synthetic */ class a$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ String f261429a;

    /* renamed from: b */
    public final /* synthetic */ Object[] f261430b;

    /* renamed from: c */
    public final /* synthetic */ StringBuilder f261431c;

    /* renamed from: d */
    public final /* synthetic */ String f261432d;

    /* renamed from: e */
    public final /* synthetic */ String f261433e;

    /* renamed from: f */
    public final /* synthetic */ String f261434f;

    /* renamed from: g */
    public final /* synthetic */ Object f261435g;

    public /* synthetic */ a$$c(String str, Object[] objArr, StringBuilder sb, String str2, String str3, String str4, Object obj) {
        this.f261429a = str;
        this.f261430b = objArr;
        this.f261431c = sb;
        this.f261432d = str2;
        this.f261433e = str3;
        this.f261434f = str4;
        this.f261435g = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = r13.f261429a
            java.lang.Object[] r1 = r13.f261430b
            java.lang.StringBuilder r2 = r13.f261431c
            java.lang.String r3 = r13.f261432d
            java.lang.String r4 = r13.f261433e
            java.lang.String r5 = r13.f261434f
            java.lang.Object r6 = r13.f261435g
            com.tencent.matrix.batterycanary.monitor.feature.q0 r14 = (com.tencent.matrix.batterycanary.monitor.feature.C114519q0) r14
            r0.getClass()
            int r7 = r0.hashCode()
            r8 = -1164222250(0xffffffffba9b60d6, float:-0.0011854421)
            r9 = 2
            r10 = 1
            r11 = -1
            r12 = 0
            if (r7 == r8) goto L_0x0042
            r8 = 1090594823(0x41012807, float:8.072272)
            if (r7 == r8) goto L_0x0036
            r8 = 1545258671(0x5c1ac6af, float:1.74262405E17)
            if (r7 == r8) goto L_0x002b
            goto L_0x004a
        L_0x002b:
            java.lang.String r7 = "newWakeLock"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0034
            goto L_0x004a
        L_0x0034:
            r0 = 2
            goto L_0x004d
        L_0x0036:
            java.lang.String r7 = "release"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0040
            goto L_0x004a
        L_0x0040:
            r0 = 1
            goto L_0x004d
        L_0x0042:
            java.lang.String r7 = "acquire"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r0 = -1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 == 0) goto L_0x012a
            if (r0 == r10) goto L_0x00eb
            if (r0 == r9) goto L_0x0055
            goto L_0x016a
        L_0x0055:
            if (r1 == 0) goto L_0x016a
            int r14 = r1.length
            if (r14 < r10) goto L_0x016a
            r14 = r1[r12]
            boolean r0 = r14 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x016a
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.String r0 = ", flag = "
            r2.append(r0)
            java.lang.String r0 = java.lang.Integer.toBinaryString(r14)
            r2.append(r0)
            boolean r0 = p212oe.C117750b.m166050h()
            if (r0 == 0) goto L_0x016a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            r1 = r14 & 26
            r2 = 26
            if (r1 != r2) goto L_0x0098
            int r1 = r0.length()
            if (r1 != 0) goto L_0x008e
            java.lang.String r1 = ""
            goto L_0x0090
        L_0x008e:
            java.lang.String r1 = "_"
        L_0x0090:
            r0.append(r1)
            java.lang.String r1 = "FULL"
            r0.append(r1)
        L_0x0098:
            r1 = r14 & 10
            r2 = 10
            if (r1 != r2) goto L_0x00b1
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00a7
            java.lang.String r1 = ""
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r1 = "_"
        L_0x00a9:
            r0.append(r1)
            java.lang.String r1 = "BRIGHT"
            r0.append(r1)
        L_0x00b1:
            r1 = 6
            r14 = r14 & r1
            if (r14 != r1) goto L_0x00c8
            int r14 = r0.length()
            if (r14 != 0) goto L_0x00be
            java.lang.String r14 = ""
            goto L_0x00c0
        L_0x00be:
            java.lang.String r14 = "_"
        L_0x00c0:
            r0.append(r14)
            java.lang.String r14 = "DIM"
            r0.append(r14)
        L_0x00c8:
            int r14 = r0.length()
            if (r14 <= 0) goto L_0x016a
            java.lang.String r14 = "WakeFlags"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            r2 = 0
            r6 = 4
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r12] = r3
            r6[r10] = r4
            r6[r9] = r5
            r3 = 3
            java.lang.String r0 = r0.toString()
            r6[r3] = r0
            p988jj.C87968a.C87969a.C87970a.m109467a(r14, r1, r2, r6)
            goto L_0x016a
        L_0x00eb:
            com.tencent.matrix.batterycanary.monitor.feature.q0$e r14 = r14.f343264d
            byte[] r0 = r14.f235253a
            monitor-enter(r0)
            int r1 = r14.f235257e     // Catch:{ all -> 0x0127 }
            int r1 = r1 + r11
            r14.f235257e = r1     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            boolean r14 = r6 instanceof android.os.PowerManager.WakeLock
            if (r14 == 0) goto L_0x0102
            r14 = r6
            android.os.PowerManager$WakeLock r14 = (android.os.PowerManager.WakeLock) r14
            java.lang.String r14 = p269xe.C91177a.m114418b(r14)
            goto L_0x010a
        L_0x0102:
            java.lang.Class r14 = r6.getClass()
            java.lang.String r14 = r14.getSimpleName()
        L_0x010a:
            java.lang.String r0 = ", tag = "
            r2.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x0117
            java.lang.String r14 = "null"
        L_0x0117:
            r2.append(r14)
            java.lang.String r14 = "@"
            r2.append(r14)
            int r14 = r6.hashCode()
            r2.append(r14)
            goto L_0x016a
        L_0x0127:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            throw r14
        L_0x012a:
            com.tencent.matrix.batterycanary.monitor.feature.q0$e r14 = r14.f343264d
            byte[] r0 = r14.f235253a
            monitor-enter(r0)
            int r1 = r14.f235256d     // Catch:{ all -> 0x016b }
            int r1 = r1 + r10
            r14.f235256d = r1     // Catch:{ all -> 0x016b }
            int r1 = r14.f235257e     // Catch:{ all -> 0x016b }
            int r1 = r1 + r10
            r14.f235257e = r1     // Catch:{ all -> 0x016b }
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            boolean r14 = r6 instanceof android.os.PowerManager.WakeLock
            if (r14 == 0) goto L_0x0146
            r14 = r6
            android.os.PowerManager$WakeLock r14 = (android.os.PowerManager.WakeLock) r14
            java.lang.String r14 = p269xe.C91177a.m114418b(r14)
            goto L_0x014e
        L_0x0146:
            java.lang.Class r14 = r6.getClass()
            java.lang.String r14 = r14.getSimpleName()
        L_0x014e:
            java.lang.String r0 = ", tag = "
            r2.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x015b
            java.lang.String r14 = "null"
        L_0x015b:
            r2.append(r14)
            java.lang.String r14 = "@"
            r2.append(r14)
            int r14 = r6.hashCode()
            r2.append(r14)
        L_0x016a:
            return
        L_0x016b:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.a$$c.accept(java.lang.Object):void");
    }
}
