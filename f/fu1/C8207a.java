package fu1;

import yc3.C38992a;

/* renamed from: fu1.a */
public class C8207a implements C38992a {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r6.equals(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN) == false) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r5, java.lang.String[] r6, java.lang.String r7) {
        /*
            r4 = this;
            int r7 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            r0 = 0
            r1 = 1
            if (r7 <= r1) goto L_0x0009
            return r0
        L_0x0009:
            int r7 = r6.length
            r2 = 2
            if (r7 >= r2) goto L_0x000e
            return r1
        L_0x000e:
            r6 = r6[r1]
            r6.getClass()
            r7 = -1
            int r3 = r6.hashCode()
            switch(r3) {
                case -2070196511: goto L_0x003d;
                case 94746185: goto L_0x0032;
                case 94921639: goto L_0x0029;
                case 1316811262: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r2 = -1
            goto L_0x0048
        L_0x001d:
            java.lang.String r2 = "startnew"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0027
            goto L_0x001b
        L_0x0027:
            r2 = 3
            goto L_0x0048
        L_0x0029:
            java.lang.String r3 = "crash"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0048
            goto L_0x001b
        L_0x0032:
            java.lang.String r2 = "clean"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x003b
            goto L_0x001b
        L_0x003b:
            r2 = 1
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "statusbar"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r2 = 0
        L_0x0048:
            switch(r2) {
                case 0: goto L_0x0065;
                case 1: goto L_0x004d;
                case 2: goto L_0x004c;
                case 3: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            return r0
        L_0x004c:
            return r1
        L_0x004d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r5 = r5.getCacheDir()
            r6.append(r5)
            java.lang.String r5 = "/flutter"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r5)
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fu1.C8207a.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
