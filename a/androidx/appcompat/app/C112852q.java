package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: androidx.appcompat.app.q */
public class C112852q {

    /* renamed from: d */
    public static C112852q f337873d;

    /* renamed from: a */
    public final Context f337874a;

    /* renamed from: b */
    public final LocationManager f337875b;

    /* renamed from: c */
    public final C112853a f337876c = new C112853a();

    /* renamed from: androidx.appcompat.app.q$a */
    public static class C112853a {

        /* renamed from: a */
        public boolean f337877a;

        /* renamed from: b */
        public long f337878b;
    }

    public C112852q(Context context, LocationManager locationManager) {
        this.f337874a = context;
        this.f337875b = locationManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo164690a() {
        /*
            r22 = this;
            r0 = r22
            androidx.appcompat.app.q$a r1 = r0.f337876c
            long r2 = r1.f337878b
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0018
            boolean r1 = r1.f337877a
            return r1
        L_0x0018:
            android.content.Context r2 = r0.f337874a
            int r3 = android.os.Process.myPid()
            int r4 = android.os.Process.myUid()
            java.lang.String r5 = r2.getPackageName()
            java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = p385u2.C118562b.m167230b(r2, r8, r3, r4, r5)
            r3 = 0
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "network"
            android.location.LocationManager r4 = r0.f337875b     // Catch:{ Exception -> 0x0040 }
            boolean r4 = r4.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0040 }
            if (r4 == 0) goto L_0x0040
            android.location.LocationManager r4 = r0.f337875b     // Catch:{ Exception -> 0x0040 }
            android.location.Location r2 = r4.getLastKnownLocation(r2)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r2 = r3
        L_0x0041:
            android.content.Context r4 = r0.f337874a
            int r5 = android.os.Process.myPid()
            int r8 = android.os.Process.myUid()
            java.lang.String r9 = r4.getPackageName()
            java.lang.String r10 = "android.permission.ACCESS_FINE_LOCATION"
            int r4 = p385u2.C118562b.m167230b(r4, r10, r5, r8, r9)
            if (r4 != 0) goto L_0x0069
            java.lang.String r4 = "gps"
            android.location.LocationManager r5 = r0.f337875b     // Catch:{ Exception -> 0x0068 }
            boolean r5 = r5.isProviderEnabled(r4)     // Catch:{ Exception -> 0x0068 }
            if (r5 == 0) goto L_0x0069
            android.location.LocationManager r5 = r0.f337875b     // Catch:{ Exception -> 0x0068 }
            android.location.Location r3 = r5.getLastKnownLocation(r4)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            if (r3 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x007a
            long r4 = r3.getTime()
            long r8 = r2.getTime()
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x007d
            goto L_0x007c
        L_0x007a:
            if (r3 == 0) goto L_0x007d
        L_0x007c:
            r2 = r3
        L_0x007d:
            if (r2 == 0) goto L_0x00fe
            androidx.appcompat.app.q$a r3 = r0.f337876c
            long r4 = java.lang.System.currentTimeMillis()
            androidx.appcompat.app.p r8 = androidx.appcompat.app.C112851p.f337869d
            if (r8 != 0) goto L_0x0090
            androidx.appcompat.app.p r8 = new androidx.appcompat.app.p
            r8.<init>()
            androidx.appcompat.app.C112851p.f337869d = r8
        L_0x0090:
            androidx.appcompat.app.p r8 = androidx.appcompat.app.C112851p.f337869d
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r4 - r16
            double r12 = r2.getLatitude()
            double r14 = r2.getLongitude()
            r9 = r8
            r9.mo164689a(r10, r12, r14)
            double r11 = r2.getLatitude()
            double r13 = r2.getLongitude()
            r15 = r8
            r9 = r4
            r8.mo164689a(r9, r11, r13)
            int r8 = r15.f337872c
            if (r8 != r6) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            long r7 = r15.f337871b
            long r12 = r15.f337870a
            long r10 = r4 + r16
            double r16 = r2.getLatitude()
            double r18 = r2.getLongitude()
            r9 = r15
            r20 = r12
            r12 = r16
            r2 = r15
            r14 = r18
            r9.mo164689a(r10, r12, r14)
            long r9 = r2.f337871b
            r11 = 0
            r13 = -1
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00f2
            int r2 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00de
            goto L_0x00f2
        L_0x00de:
            int r2 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e4
            long r9 = r9 + r11
            goto L_0x00ed
        L_0x00e4:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00eb
            long r9 = r20 + r11
            goto L_0x00ed
        L_0x00eb:
            long r9 = r7 + r11
        L_0x00ed:
            r4 = 60000(0xea60, double:2.9644E-319)
            long r9 = r9 + r4
            goto L_0x00f7
        L_0x00f2:
            r7 = 43200000(0x2932e00, double:2.1343636E-316)
            long r9 = r4 + r7
        L_0x00f7:
            r3.f337877a = r6
            r3.f337878b = r9
            boolean r1 = r1.f337877a
            return r1
        L_0x00fe:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r1 = r1.get(r2)
            r2 = 6
            if (r1 < r2) goto L_0x0111
            r2 = 22
            if (r1 < r2) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r6 = 0
        L_0x0111:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C112852q.mo164690a():boolean");
    }
}
