package com.tencent.liteav.videobase.videobase;

/* renamed from: com.tencent.liteav.videobase.videobase.f */
public abstract class C17259f implements IVideoReporter {
    private static final String TAG = "NativeVideoReporter";
    public long mNativeVideoReporter;

    public abstract void nativeNotifyError(long j, int i, String str);

    public abstract void nativeNotifyEvent(long j, int i, String str);

    public abstract void nativeNotifyWarning(long j, int i, String str);

    public abstract void nativeUpdateKeyStatus(long j, int i, int i2, double d);

    public abstract void nativeUpdateKeyStatusObject(long j, int i, int i2, Object obj);

    public abstract void nativeUpdateStatus(long j, int i, double d);

    public abstract void nativeUpdateStatusObject(long j, int i, Object obj);

    public abstract void nativeUpdateStatusString(long j, int i, String str);

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void notifyError(com.tencent.liteav.videobase.videobase.C17263h.C17268a r6, java.lang.String r7, java.lang.Object... r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mNativeVideoReporter     // Catch:{ all -> 0x0050 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x004e
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x0026
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x0050 }
            r1.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0050 }
        L_0x0026:
            int r7 = com.tencent.liteav.videobase.videobase.C17263h.m17162a((com.tencent.liteav.videobase.videobase.C17263h.C17268a) r6)     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x0033
            long r1 = r5.mNativeVideoReporter     // Catch:{ all -> 0x0050 }
            r5.nativeNotifyError(r1, r7, r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)
            return
        L_0x0033:
            java.lang.String r8 = "NativeVideoReporter"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "notifyError error code:"
            r0.<init>(r1)     // Catch:{ all -> 0x0050 }
            r0.append(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = ", do not need transfer to LiteAvCode:"
            r0.append(r6)     // Catch:{ all -> 0x0050 }
            r0.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0050 }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r8, r6)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r5)
            return
        L_0x0050:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17259f.notifyError(com.tencent.liteav.videobase.videobase.h$a, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void notifyEvent(com.tencent.liteav.videobase.videobase.C17263h.C17269b r6, java.lang.String r7, java.lang.Object... r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mNativeVideoReporter     // Catch:{ all -> 0x004e }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x004c
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x0017
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x004e }
        L_0x0017:
            int r7 = com.tencent.liteav.videobase.videobase.C17263h.m17163a((com.tencent.liteav.videobase.videobase.C17263h.C17269b) r6)     // Catch:{ all -> 0x004e }
            if (r7 == 0) goto L_0x0031
            boolean r6 = com.tencent.liteav.videobase.videobase.C17263h.m17165b(r6)     // Catch:{ all -> 0x004e }
            if (r6 == 0) goto L_0x002a
            long r1 = r5.mNativeVideoReporter     // Catch:{ all -> 0x004e }
            r5.nativeNotifyWarning(r1, r7, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r5)
            return
        L_0x002a:
            long r1 = r5.mNativeVideoReporter     // Catch:{ all -> 0x004e }
            r5.nativeNotifyEvent(r1, r7, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r5)
            return
        L_0x0031:
            java.lang.String r8 = "NativeVideoReporter"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "notifyEvent event code:"
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
            r0.append(r6)     // Catch:{ all -> 0x004e }
            java.lang.String r6 = ", do not need transfer to LiteAvCode:"
            r0.append(r6)     // Catch:{ all -> 0x004e }
            r0.append(r7)     // Catch:{ all -> 0x004e }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x004e }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r8, r6)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r5)
            return
        L_0x004e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17259f.notifyEvent(com.tencent.liteav.videobase.videobase.h$b, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void notifyWarning(com.tencent.liteav.videobase.videobase.C17263h.C17270c r6, java.lang.String r7, java.lang.Object... r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mNativeVideoReporter     // Catch:{ all -> 0x0050 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x004e
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x0026
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x0050 }
            r1.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0050 }
        L_0x0026:
            int r7 = com.tencent.liteav.videobase.videobase.C17263h.m17164a((com.tencent.liteav.videobase.videobase.C17263h.C17270c) r6)     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x0033
            long r1 = r5.mNativeVideoReporter     // Catch:{ all -> 0x0050 }
            r5.nativeNotifyWarning(r1, r7, r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)
            return
        L_0x0033:
            java.lang.String r8 = "NativeVideoReporter"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "notifyWarning warning code:"
            r0.<init>(r1)     // Catch:{ all -> 0x0050 }
            r0.append(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = ", do not need transfer to LiteAvCode:"
            r0.append(r6)     // Catch:{ all -> 0x0050 }
            r0.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0050 }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r8, r6)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r5)
            return
        L_0x0050:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17259f.notifyWarning(com.tencent.liteav.videobase.videobase.h$c, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.C17271i r9, java.lang.Object r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mNativeVideoReporter     // Catch:{ all -> 0x0076 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0074
            int r2 = r9.value     // Catch:{ all -> 0x0076 }
            com.tencent.liteav.videobase.videobase.i r3 = com.tencent.liteav.videobase.videobase.C17271i.STATUS_VIDEO_CAPTURE_FRAME     // Catch:{ all -> 0x0076 }
            int r3 = r3.value     // Catch:{ all -> 0x0076 }
            if (r2 >= r3) goto L_0x0013
            monitor-exit(r8)
            return
        L_0x0013:
            boolean r3 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0027
            java.lang.Double r10 = (java.lang.Double) r10     // Catch:{ all -> 0x0076 }
            double r4 = r10.doubleValue()     // Catch:{ all -> 0x0076 }
            long r1 = r8.mNativeVideoReporter     // Catch:{ all -> 0x0076 }
            int r3 = r9.value     // Catch:{ all -> 0x0076 }
            r0 = r8
            r0.nativeUpdateStatus(r1, r3, r4)     // Catch:{ all -> 0x0076 }
            monitor-exit(r8)
            return
        L_0x0027:
            boolean r3 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x003c
            java.lang.Float r10 = (java.lang.Float) r10     // Catch:{ all -> 0x0076 }
            float r10 = r10.floatValue()     // Catch:{ all -> 0x0076 }
            double r4 = (double) r10     // Catch:{ all -> 0x0076 }
            long r1 = r8.mNativeVideoReporter     // Catch:{ all -> 0x0076 }
            int r3 = r9.value     // Catch:{ all -> 0x0076 }
            r0 = r8
            r0.nativeUpdateStatus(r1, r3, r4)     // Catch:{ all -> 0x0076 }
            monitor-exit(r8)
            return
        L_0x003c:
            boolean r3 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0051
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0076 }
            long r0 = r10.longValue()     // Catch:{ all -> 0x0076 }
            double r6 = (double) r0     // Catch:{ all -> 0x0076 }
            long r3 = r8.mNativeVideoReporter     // Catch:{ all -> 0x0076 }
            int r5 = r9.value     // Catch:{ all -> 0x0076 }
            r2 = r8
            r2.nativeUpdateStatus(r3, r5, r6)     // Catch:{ all -> 0x0076 }
            monitor-exit(r8)
            return
        L_0x0051:
            boolean r3 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0066
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0076 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0076 }
            double r4 = (double) r10     // Catch:{ all -> 0x0076 }
            long r1 = r8.mNativeVideoReporter     // Catch:{ all -> 0x0076 }
            int r3 = r9.value     // Catch:{ all -> 0x0076 }
            r0 = r8
            r0.nativeUpdateStatus(r1, r3, r4)     // Catch:{ all -> 0x0076 }
            monitor-exit(r8)
            return
        L_0x0066:
            boolean r9 = r10 instanceof java.lang.String     // Catch:{ all -> 0x0076 }
            if (r9 == 0) goto L_0x0071
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0076 }
            r8.nativeUpdateStatusString(r0, r2, r10)     // Catch:{ all -> 0x0076 }
            monitor-exit(r8)
            return
        L_0x0071:
            r8.nativeUpdateStatusObject(r0, r2, r10)     // Catch:{ all -> 0x0076 }
        L_0x0074:
            monitor-exit(r8)
            return
        L_0x0076:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17259f.updateStatus(com.tencent.liteav.videobase.videobase.i, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.C17271i r10, int r11, java.lang.Object r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.mNativeVideoReporter     // Catch:{ all -> 0x0072 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            int r3 = r10.value     // Catch:{ all -> 0x0072 }
            com.tencent.liteav.videobase.videobase.i r0 = com.tencent.liteav.videobase.videobase.C17271i.STATUS_VIDEO_CAPTURE_FRAME     // Catch:{ all -> 0x0072 }
            int r0 = r0.value     // Catch:{ all -> 0x0072 }
            if (r3 >= r0) goto L_0x0013
            monitor-exit(r9)
            return
        L_0x0013:
            boolean r0 = r12 instanceof java.lang.Double     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0028
            java.lang.Double r12 = (java.lang.Double) r12     // Catch:{ all -> 0x0072 }
            double r5 = r12.doubleValue()     // Catch:{ all -> 0x0072 }
            long r1 = r9.mNativeVideoReporter     // Catch:{ all -> 0x0072 }
            int r3 = r10.value     // Catch:{ all -> 0x0072 }
            r0 = r9
            r4 = r11
            r0.nativeUpdateKeyStatus(r1, r3, r4, r5)     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            return
        L_0x0028:
            boolean r0 = r12 instanceof java.lang.Float     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x003e
            java.lang.Float r12 = (java.lang.Float) r12     // Catch:{ all -> 0x0072 }
            float r12 = r12.floatValue()     // Catch:{ all -> 0x0072 }
            double r5 = (double) r12     // Catch:{ all -> 0x0072 }
            long r1 = r9.mNativeVideoReporter     // Catch:{ all -> 0x0072 }
            int r3 = r10.value     // Catch:{ all -> 0x0072 }
            r0 = r9
            r4 = r11
            r0.nativeUpdateKeyStatus(r1, r3, r4, r5)     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            return
        L_0x003e:
            boolean r0 = r12 instanceof java.lang.Integer     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0054
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0072 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0072 }
            double r5 = (double) r12     // Catch:{ all -> 0x0072 }
            long r1 = r9.mNativeVideoReporter     // Catch:{ all -> 0x0072 }
            int r3 = r10.value     // Catch:{ all -> 0x0072 }
            r0 = r9
            r4 = r11
            r0.nativeUpdateKeyStatus(r1, r3, r4, r5)     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            return
        L_0x0054:
            boolean r0 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0072 }
            long r0 = r12.longValue()     // Catch:{ all -> 0x0072 }
            double r7 = (double) r0     // Catch:{ all -> 0x0072 }
            long r3 = r9.mNativeVideoReporter     // Catch:{ all -> 0x0072 }
            int r5 = r10.value     // Catch:{ all -> 0x0072 }
            r2 = r9
            r6 = r11
            r2.nativeUpdateKeyStatus(r3, r5, r6, r7)     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            return
        L_0x006a:
            r0 = r9
            r4 = r11
            r5 = r12
            r0.nativeUpdateKeyStatusObject(r1, r3, r4, r5)     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r9)
            return
        L_0x0072:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17259f.updateStatus(com.tencent.liteav.videobase.videobase.i, int, java.lang.Object):void");
    }
}
