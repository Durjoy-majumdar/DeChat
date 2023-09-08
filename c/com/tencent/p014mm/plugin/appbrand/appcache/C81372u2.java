package com.tencent.p014mm.plugin.appbrand.appcache;

import ei0.C86516a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.u2 */
public class C81372u2 extends C86516a {
    public C81372u2(String str, int i, int i2, String str2) {
        super(String.format("WxaPkg_%s_%d", new Object[]{str, Integer.valueOf(i2)}), m99809i(str, i2), str2, str, i2, i);
    }

    /* renamed from: i */
    public static String m99809i(String str, int i) {
        String d = C81355t2.m99778d(str);
        return d + String.format("_%d_%d.wxapkg", new Object[]{Integer.valueOf(str.hashCode()), Integer.valueOf(i)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r6).endsWith(".wxapkg") == false) goto L_0x0016;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m99810j(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.m99777c()
            boolean r0 = r0.startsWith(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r6 = r1
            goto L_0x006d
        L_0x0018:
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r2 = r0.getPath()
            r3 = 0
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r4 = r0.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x003d
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r2)
            android.net.Uri r0 = r0.build()
        L_0x003d:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r0 = r2.mo177799l(r0, r1)
            boolean r2 = r0.mo177810a()
            if (r2 != 0) goto L_0x004a
            goto L_0x0059
        L_0x004a:
            com.tencent.mm.vfs.FileSystem$c r2 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            com.tencent.mm.vfs.b0 r0 = r2.mo119945q(r0)
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.f250476f
            if (r0 == 0) goto L_0x0059
            r3 = 1
        L_0x0059:
            if (r3 == 0) goto L_0x005c
            goto L_0x0016
        L_0x005c:
            java.lang.String r6 = s24.C90124b.m112769d(r6)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r2 = ".wxapkg"
            boolean r0 = r0.endsWith(r2)
            if (r0 != 0) goto L_0x006d
            goto L_0x0016
        L_0x006d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 == 0) goto L_0x0074
            return r1
        L_0x0074:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.m99778d(r5)
            r0.<init>((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = r0.mo119971i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81372u2.m99810j(java.lang.String, java.lang.String):java.lang.String");
    }
}
