package com.google.android.gms.iid;

final /* synthetic */ class zzw implements Runnable {
    private final zzt zzch;

    public zzw(zzt zzt) {
        this.zzch = zzt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r3 = r0.zzcg.zzk;
        r4 = r0.zzcc;
        r5 = android.os.Message.obtain();
        r5.what = r1.what;
        r5.arg1 = r1.zzck;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.zzu());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.zzcm);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.zzcd;
        r3 = r1.zzab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r3 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        r1 = r1.zzcj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r1 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r1.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r0.zzd(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.iid.zzt r0 = r8.zzch
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.state     // Catch:{ all -> 0x00ae }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x000a:
            java.util.Queue<com.google.android.gms.iid.zzz<?>> r1 = r0.zzce     // Catch:{ all -> 0x00ae }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0017
            r0.zzs()     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x0017:
            java.util.Queue<com.google.android.gms.iid.zzz<?>> r1 = r0.zzce     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00ae }
            com.google.android.gms.iid.zzz r1 = (com.google.android.gms.iid.zzz) r1     // Catch:{ all -> 0x00ae }
            android.util.SparseArray<com.google.android.gms.iid.zzz<?>> r3 = r0.zzcf     // Catch:{ all -> 0x00ae }
            int r4 = r1.zzck     // Catch:{ all -> 0x00ae }
            r3.put(r4, r1)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.iid.zzr r3 = r0.zzcg     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledExecutorService r3 = r3.zzbz     // Catch:{ all -> 0x00ae }
            com.google.android.gms.iid.zzx r4 = new com.google.android.gms.iid.zzx     // Catch:{ all -> 0x00ae }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00ae }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ae }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0051
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
        L_0x0051:
            com.google.android.gms.iid.zzr r3 = r0.zzcg
            android.content.Context r3 = r3.zzk
            android.os.Messenger r4 = r0.zzcc
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.what
            r5.what = r6
            int r6 = r1.zzck
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.zzu()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.zzcm
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.android.gms.iid.zzy r1 = r0.zzcd     // Catch:{ RemoteException -> 0x00a4 }
            android.os.Messenger r3 = r1.zzab     // Catch:{ RemoteException -> 0x00a4 }
            if (r3 == 0) goto L_0x0093
            r3.send(r5)     // Catch:{ RemoteException -> 0x00a4 }
            goto L_0x0002
        L_0x0093:
            com.google.android.gms.iid.MessengerCompat r1 = r1.zzcj     // Catch:{ RemoteException -> 0x00a4 }
            if (r1 == 0) goto L_0x009c
            r1.send(r5)     // Catch:{ RemoteException -> 0x00a4 }
            goto L_0x0002
        L_0x009c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00a4 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00a4 }
            throw r1     // Catch:{ RemoteException -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.zzd(r2, r1)
            goto L_0x0002
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzw.run():void");
    }
}
