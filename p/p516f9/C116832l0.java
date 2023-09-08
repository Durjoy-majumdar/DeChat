package p516f9;

/* renamed from: f9.l0 */
public final /* synthetic */ class C116832l0 implements Runnable {

    /* renamed from: d */
    public final C116826i0 f350194d;

    public C116832l0(C116826i0 i0Var) {
        this.f350194d = i0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r3 = r0.f350186i.f350175a;
        r4 = r0.f350182e;
        r5 = android.os.Message.obtain();
        r5.what = r1.f350161c;
        r5.arg1 = r1.f350159a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo180801d());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f350162d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.f350183f;
        r3 = r1.f350206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r3 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        r1 = r1.f350207b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r1 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r1 = r1.f339239d;
        r1.getClass();
        r1.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r0.mo180818a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            f9.i0 r0 = r8.f350194d
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f350181d     // Catch:{ all -> 0x00b3 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x000a:
            java.util.Queue<f9.b<?>> r1 = r0.f350184g     // Catch:{ all -> 0x00b3 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0019
            r0.mo180820c()     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0019:
            java.util.Queue<f9.b<?>> r1 = r0.f350184g     // Catch:{ all -> 0x00b3 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00b3 }
            f9.b r1 = (p516f9.C116811b) r1     // Catch:{ all -> 0x00b3 }
            android.util.SparseArray<f9.b<?>> r3 = r0.f350185h     // Catch:{ all -> 0x00b3 }
            int r4 = r1.f350159a     // Catch:{ all -> 0x00b3 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00b3 }
            f9.g0 r3 = r0.f350186i     // Catch:{ all -> 0x00b3 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f350176b     // Catch:{ all -> 0x00b3 }
            f9.m0 r4 = new f9.m0     // Catch:{ all -> 0x00b3 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00b3 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00b3 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
        L_0x0053:
            f9.g0 r3 = r0.f350186i
            android.content.Context r3 = r3.f350175a
            android.os.Messenger r4 = r0.f350182e
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f350161c
            r5.what = r6
            int r6 = r1.f350159a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo180801d()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f350162d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            f9.n0 r1 = r0.f350183f     // Catch:{ RemoteException -> 0x00a9 }
            android.os.Messenger r3 = r1.f350206a     // Catch:{ RemoteException -> 0x00a9 }
            if (r3 == 0) goto L_0x0093
            r3.send(r5)     // Catch:{ RemoteException -> 0x00a9 }
            goto L_0x0002
        L_0x0093:
            com.google.firebase.iid.zzi r1 = r1.f350207b     // Catch:{ RemoteException -> 0x00a9 }
            if (r1 == 0) goto L_0x00a1
            android.os.Messenger r1 = r1.f339239d     // Catch:{ RemoteException -> 0x00a9 }
            r1.getClass()     // Catch:{ RemoteException -> 0x00a9 }
            r1.send(r5)     // Catch:{ RemoteException -> 0x00a9 }
            goto L_0x0002
        L_0x00a1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00a9 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00a9 }
            throw r1     // Catch:{ RemoteException -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo180818a(r2, r1)
            goto L_0x0002
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116832l0.run():void");
    }
}
