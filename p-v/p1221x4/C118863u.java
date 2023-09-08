package p1221x4;

import android.os.Build;
import p1014o4.C109940q;
import p1014o4.C117681a;
import p1014o4.C117695n;
import p1014o4.C117705u;

/* renamed from: x4.u */
public class C118863u {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|(0)|23|24|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC, Splitter:B:21:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A[SYNTHETIC, Splitter:B:29:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1014o4.C117684d m167582a(byte[] r6) {
        /*
            o4.d r0 = new o4.d
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            r2.<init>(r1)     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
        L_0x0017:
            if (r6 <= 0) goto L_0x0034
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            o4.d$a r5 = new o4.d$a     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            java.util.Set<o4.d$a> r3 = r0.f352004a     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r3.add(r5)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x0034:
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x003b:
            r6 = move-exception
            goto L_0x0042
        L_0x003d:
            r6 = r2
            goto L_0x004b
        L_0x003f:
            r0 = move-exception
            r2 = r6
            r6 = r0
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r6
        L_0x004b:
            if (r6 == 0) goto L_0x0037
            r6.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0037
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1221x4.C118863u.m167582a(byte[]):o4.d");
    }

    /* renamed from: b */
    public static C117681a m167583b(int i) {
        if (i == 0) {
            return C117681a.EXPONENTIAL;
        }
        if (i == 1) {
            return C117681a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    /* renamed from: c */
    public static C117695n m167584c(int i) {
        if (i == 0) {
            return C117695n.NOT_REQUIRED;
        }
        if (i == 1) {
            return C117695n.CONNECTED;
        }
        if (i == 2) {
            return C117695n.UNMETERED;
        }
        if (i == 3) {
            return C117695n.NOT_ROAMING;
        }
        if (i == 4) {
            return C117695n.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return C117695n.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    /* renamed from: d */
    public static C109940q m167585d(int i) {
        if (i == 0) {
            return C109940q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return C109940q.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    /* renamed from: e */
    public static C117705u m167586e(int i) {
        if (i == 0) {
            return C117705u.ENQUEUED;
        }
        if (i == 1) {
            return C117705u.RUNNING;
        }
        if (i == 2) {
            return C117705u.SUCCEEDED;
        }
        if (i == 3) {
            return C117705u.FAILED;
        }
        if (i == 4) {
            return C117705u.BLOCKED;
        }
        if (i == 5) {
            return C117705u.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    /* renamed from: f */
    public static int m167587f(C117705u uVar) {
        int ordinal = uVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + uVar + " to int");
                    }
                }
            }
        }
        return i;
    }
}
