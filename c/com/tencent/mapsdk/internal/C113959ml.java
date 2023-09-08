package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;

/* renamed from: com.tencent.mapsdk.internal.ml */
public final class C113959ml {

    /* renamed from: a */
    public static final String f340846a = "data/";

    /* renamed from: f */
    private static final String f340847f = "/tencentmapsdk/";

    /* renamed from: g */
    private static C113959ml f340848g;

    /* renamed from: b */
    public String f340849b;

    /* renamed from: c */
    public String f340850c;

    /* renamed from: d */
    public String f340851d;

    /* renamed from: e */
    public String f340852e;

    /* renamed from: h */
    private Context f340853h;

    /* renamed from: i */
    private String f340854i;

    /* renamed from: j */
    private String f340855j;

    /* renamed from: k */
    private String f340856k;

    /* renamed from: l */
    private String f340857l;

    /* renamed from: m */
    private String f340858m;

    /* renamed from: n */
    private String f340859n;

    /* renamed from: o */
    private String f340860o;

    /* renamed from: p */
    private String f340861p;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C113959ml(android.content.Context r5, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r6) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L_0x0195
            android.content.Context r5 = r5.getApplicationContext()
            r4.f340853h = r5
            if (r6 == 0) goto L_0x003f
            java.lang.String r5 = r6.getCustomCacheRootPath()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x003a
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r6.canRead()
            if (r0 == 0) goto L_0x003a
            boolean r6 = r6.canWrite()
            if (r6 == 0) goto L_0x003a
            long r0 = m157970e(r5)
            r2 = 5
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 == 0) goto L_0x003f
            r4.f340861p = r5
        L_0x003f:
            android.content.Context r5 = r4.f340853h
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r5 = r5.getAbsolutePath()
            r4.f340859n = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340859n
            r5.append(r6)
            java.lang.String r6 = "/tencentMapSdk/config/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340856k = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340856k
            r5.append(r6)
            java.lang.String r6 = "temp/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340860o = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340859n
            r5.append(r6)
            java.lang.String r6 = "/tencentMapSdk/assets/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340857l = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340859n
            r5.append(r6)
            java.lang.String r6 = "/tencentMapSdk/dynamicAssets/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340858m = r5
            android.content.Context r5 = r4.f340853h
            com.tencent.mapsdk.internal.mk r6 = com.tencent.mapsdk.internal.C113958mk.m157962a(r5)
            java.lang.String r0 = "sdkVersion"
            java.lang.String r6 = r6.mo172391a((java.lang.String) r0)
            com.tencent.mapsdk.internal.mk r1 = com.tencent.mapsdk.internal.C113958mk.m157962a(r5)
            java.lang.String r0 = r1.mo172391a((java.lang.String) r0)
            boolean r0 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r0)
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = "4.1.0"
            int r6 = com.tencent.mapsdk.internal.C113798hb.m157079b(r0, r6)
            if (r6 <= 0) goto L_0x00f3
            com.tencent.mapsdk.internal.C113957mj.m157959a(r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r4.f340856k
            r5.<init>(r6)
            com.tencent.mapsdk.internal.C113884kf.m157508f(r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r4.f340857l
            r5.<init>(r6)
            com.tencent.mapsdk.internal.C113884kf.m157508f(r5)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r4.f340859n
            r6.append(r0)
            java.lang.String r0 = "/tencentMapSdk/subKey/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            com.tencent.mapsdk.internal.C113884kf.m157508f(r5)
        L_0x00f3:
            java.lang.String r5 = r4.mo172401a()
            android.content.Context r6 = r4.f340853h
            java.lang.String r6 = com.tencent.mapsdk.internal.C113884kf.m157486a((android.content.Context) r6)
            boolean r0 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r6)
            java.lang.String r1 = "/tencentmapsdk/"
            if (r0 == 0) goto L_0x0117
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.f340854i = r5
            goto L_0x012b
        L_0x0117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            r4.f340854i = r5
        L_0x012b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340854i
            r5.append(r6)
            java.lang.String r6 = "/data/v4/render/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340855j = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340854i
            r5.append(r6)
            java.lang.String r6 = "/sat/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340849b = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340855j
            r5.append(r6)
            java.lang.String r6 = "closeRoadDatas/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340850c = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340855j
            r5.append(r6)
            java.lang.String r6 = "events/icons"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340851d = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f340855j
            r5.append(r6)
            java.lang.String r6 = "offlineMaps/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f340852e = r5
            return
        L_0x0195:
            java.lang.Error r5 = new java.lang.Error
            java.lang.String r6 = "context can not be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113959ml.<init>(android.content.Context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    /* renamed from: a */
    private static C113959ml m157964a(Context context) {
        return m157965a(context, (TencentMapOptions) null);
    }

    /* renamed from: b */
    private static String m157968b(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return context.getFilesDir().getPath();
    }

    /* renamed from: d */
    private static boolean m157969d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory() || !file.canRead() || !file.canWrite() || m157970e(str) <= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static long m157970e(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024) / 1024;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private void m157971f() {
        this.f340859n = this.f340853h.getFilesDir().getAbsolutePath();
        this.f340856k = this.f340859n + "/tencentMapSdk/config/";
        this.f340860o = this.f340856k + "temp/";
        this.f340857l = this.f340859n + "/tencentMapSdk/assets/";
        this.f340858m = this.f340859n + "/tencentMapSdk/dynamicAssets/";
        Context context = this.f340853h;
        String a = C113958mk.m157962a(context).mo172391a(C0939el.f2175e);
        if (!C40002he.m42805a(C113958mk.m157962a(context).mo172391a(C0939el.f2175e)) && C113798hb.m157079b("4.1.0", a) > 0) {
            C113957mj.m157959a(context);
            C113884kf.m157508f(new File(this.f340856k));
            C113884kf.m157508f(new File(this.f340857l));
            C113884kf.m157508f(new File(this.f340859n + "/tencentMapSdk/subKey/"));
        }
    }

    /* renamed from: g */
    private void m157972g() {
        String a = mo172401a();
        String a2 = C113884kf.m157486a(this.f340853h);
        if (C40002he.m42805a(a2)) {
            this.f340854i = a + f340847f;
        } else {
            this.f340854i = a + f340847f + a2;
        }
        this.f340855j = this.f340854i + "/data/v4/render/";
        this.f340849b = this.f340854i + "/sat/";
        this.f340850c = this.f340855j + "closeRoadDatas/";
        this.f340851d = this.f340855j + "events/icons";
        this.f340852e = this.f340855j + "offlineMaps/";
    }

    /* renamed from: h */
    private String m157973h() {
        C113886kg.m157518a(this.f340849b);
        return this.f340849b;
    }

    /* renamed from: i */
    private String m157974i() {
        C113886kg.m157518a(this.f340850c);
        return this.f340850c;
    }

    /* renamed from: j */
    private String m157975j() {
        C113886kg.m157518a(this.f340851d);
        return this.f340851d;
    }

    /* renamed from: k */
    private String m157976k() {
        C113886kg.m157518a(this.f340852e);
        return this.f340852e;
    }

    /* renamed from: c */
    public final File mo172405c() {
        return new File(this.f340854i);
    }

    /* renamed from: a */
    public static C113959ml m157965a(Context context, TencentMapOptions tencentMapOptions) {
        if (f340848g == null) {
            f340848g = new C113959ml(context, tencentMapOptions);
        }
        return f340848g;
    }

    /* renamed from: c */
    public final String mo172406c(String str) {
        String str2;
        if (C40002he.m42805a(str)) {
            str2 = this.f340860o;
        } else {
            str2 = mo172402a(str) + "temp/";
        }
        C113886kg.m157518a(str2);
        return str2;
    }

    /* renamed from: b */
    public final File mo172403b() {
        return new File(this.f340854i + "/data/");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m157967a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0034
            java.lang.String r6 = r6.getCustomCacheRootPath()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002f
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0.canRead()
            if (r1 == 0) goto L_0x002f
            boolean r0 = r0.canWrite()
            if (r0 == 0) goto L_0x002f
            long r0 = m157970e(r6)
            r2 = 5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0034
            r5.f340861p = r6
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113959ml.m157967a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    /* renamed from: b */
    public final String mo172404b(String str) {
        String str2;
        if (C40002he.m42805a(str)) {
            str2 = this.f340857l;
        } else {
            str2 = this.f340859n + "/tencentMapSdk/subKey/" + str + "/assets/";
        }
        C113886kg.m157518a(str2);
        return str2;
    }

    /* renamed from: e */
    public final String mo172408e() {
        C113886kg.m157518a(this.f340858m);
        return this.f340858m;
    }

    /* renamed from: d */
    public final String mo172407d() {
        C113886kg.m157518a(this.f340855j);
        return this.f340855j;
    }

    /* renamed from: a */
    private void m157966a(Context context, String str) {
        if (!C40002he.m42805a(C113958mk.m157962a(context).mo172391a(C0939el.f2175e)) && C113798hb.m157079b("4.1.0", str) > 0) {
            C113957mj.m157959a(context);
            C113884kf.m157508f(new File(this.f340856k));
            C113884kf.m157508f(new File(this.f340857l));
            C113884kf.m157508f(new File(this.f340859n + "/tencentMapSdk/subKey/"));
        }
    }

    /* renamed from: a */
    public final String mo172401a() {
        if (!TextUtils.isEmpty(this.f340861p)) {
            return this.f340861p;
        }
        Context context = this.f340853h;
        String b = m157968b(context);
        if (m157970e(b) >= 5) {
            return b;
        }
        String path = context.getFilesDir().getPath();
        return m157970e(path) < 5 ? m157968b(context) : path;
    }

    /* renamed from: a */
    public final String mo172402a(String str) {
        String str2;
        if (C40002he.m42805a(str)) {
            str2 = this.f340856k;
        } else {
            str2 = this.f340859n + "/tencentMapSdk/subKey/" + str + "/config/";
        }
        C113886kg.m157518a(str2);
        return str2;
    }
}
