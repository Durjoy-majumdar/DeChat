package p516f9;

import android.os.Handler;

/* renamed from: f9.j0 */
public final /* synthetic */ class C116828j0 implements Handler.Callback {

    /* renamed from: d */
    public final C116826i0 f350191d;

    public C116828j0(C116826i0 i0Var) {
        this.f350191d = i0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r2.mo180804b(new p516f9.C116813c(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r2.mo180800c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r5 = r5.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            f9.i0 r0 = r4.f350191d
            r0.getClass()
            int r1 = r5.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            android.util.Log.isLoggable(r2, r3)
            monitor-enter(r0)
            android.util.SparseArray<f9.b<?>> r2 = r0.f350185h     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0041 }
            f9.b r2 = (p516f9.C116811b) r2     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x003f
        L_0x001a:
            android.util.SparseArray<f9.b<?>> r3 = r0.f350185h     // Catch:{ all -> 0x0041 }
            r3.remove(r1)     // Catch:{ all -> 0x0041 }
            r0.mo180820c()     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x003c
            f9.c r5 = new f9.c
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r5.<init>(r0, r1)
            r2.mo180804b(r5)
            goto L_0x003f
        L_0x003c:
            r2.mo180800c(r5)
        L_0x003f:
            r5 = 1
            return r5
        L_0x0041:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116828j0.handleMessage(android.os.Message):boolean");
    }
}
