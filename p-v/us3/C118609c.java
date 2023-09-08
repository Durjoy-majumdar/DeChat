package us3;

import android.content.Context;
import android.content.pm.PackageInfo;
import vs3.C118697c;

/* renamed from: us3.c */
public class C118609c {

    /* renamed from: a */
    public C118697c f354939a = null;

    /* renamed from: b */
    public String f354940b = null;

    /* renamed from: c */
    public int f354941c = -1;

    /* renamed from: d */
    public Context f354942d;

    public C118609c(Context context) {
        this.f354942d = context;
        String str = "0.0.0";
        int i = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            str = packageInfo.versionName;
            i = packageInfo.versionCode;
        } catch (Throwable unused) {
        }
        this.f354940b = str;
        this.f354941c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        if (ft3.C116892c.m164883c(r8.f354942d) == ft3.C116892c.C116893a.f350310d) goto L_0x009d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final vs3.C118697c mo183353a(bt3.C113206a r9) {
        /*
            r8 = this;
            vs3.c r0 = r8.f354939a
            r1 = 1
            r2 = 2
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x0091
            vs3.c r0 = new vs3.c
            r0.<init>()
            r8.f354939a = r0
            r4 = 82
            r0.f355189o = r4
            int r4 = r8.f354941c
            r0.f355196v = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            int r5 = r9.f338721i
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.f355186i = r4
            vs3.c r0 = r8.f354939a
            java.lang.String r9 = r9.f338720h
            r0.f355185h = r9
            r9 = 0
            java.lang.String r0 = r8.f354940b     // Catch:{ Exception -> 0x006c }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "[\\.]"
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ Exception -> 0x006c }
            if (r0 == 0) goto L_0x0056
            int r4 = r0.length     // Catch:{ Exception -> 0x006c }
            r5 = 3
            if (r4 < r5) goto L_0x0056
            r4 = r0[r9]     // Catch:{ Exception -> 0x006c }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x006c }
            r5 = r0[r1]     // Catch:{ Exception -> 0x006c }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x006c }
            r0 = r0[r2]     // Catch:{ Exception -> 0x006c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x006c }
            goto L_0x0059
        L_0x0056:
            r0 = 0
            r4 = 0
            r5 = 0
        L_0x0059:
            vs3.c r6 = r8.f354939a     // Catch:{ Exception -> 0x006c }
            vs3.b r7 = new vs3.b     // Catch:{ Exception -> 0x006c }
            r7.<init>()     // Catch:{ Exception -> 0x006c }
            r6.f355190p = r7     // Catch:{ Exception -> 0x006c }
            vs3.c r6 = r8.f354939a     // Catch:{ Exception -> 0x006c }
            vs3.b r6 = r6.f355190p     // Catch:{ Exception -> 0x006c }
            r6.f355170d = r4     // Catch:{ Exception -> 0x006c }
            r6.f355171e = r5     // Catch:{ Exception -> 0x006c }
            r6.f355172f = r0     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            vs3.c r0 = r8.f354939a
            r0.f355193s = r9
            int r4 = ft3.C116892c.m164885e()
            r0.f355195u = r4
            vs3.c r0 = r8.f354939a
            java.lang.String r4 = "1234567890ABCDEF"
            r0.f355181d = r4
            r0.f355192r = r3
            java.lang.String r4 = p156gj.C87203t.m108275k()
            if (r4 != 0) goto L_0x0085
            r4 = r3
        L_0x0085:
            r0.f355187j = r4
            vs3.c r0 = r8.f354939a
            r0.f355178E = r3
            r0.f355179F = r3
            r0.f355180G = r3
            r0.f355194t = r9
        L_0x0091:
            vs3.c r9 = r8.f354939a
            android.content.Context r0 = r8.f354942d     // Catch:{ all -> 0x009d }
            ft3.c$a r0 = ft3.C116892c.m164883c(r0)     // Catch:{ all -> 0x009d }
            ft3.c$a r4 = ft3.C116892c.C116893a.CONN_WIFI     // Catch:{ all -> 0x009d }
            if (r0 != r4) goto L_0x009e
        L_0x009d:
            r1 = 2
        L_0x009e:
            r9.f355188n = r1
            vs3.c r9 = r8.f354939a
            r9.f355191q = r3
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: us3.C118609c.mo183353a(bt3.a):vs3.c");
    }
}
