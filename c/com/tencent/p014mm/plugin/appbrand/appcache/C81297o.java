package com.tencent.p014mm.plugin.appbrand.appcache;

import ei0.C86516a;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.o */
public class C81297o extends C86516a {

    /* renamed from: q */
    public final int f238715q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C81297o(java.lang.String r12, int r13, int r14, java.lang.String r15) {
        /*
            r11 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r5 = 1
            r2[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r6 = 2
            r2[r6] = r4
            java.lang.String r4 = "EncWxaPkg_%s_%d_%d"
            java.lang.String r2 = java.lang.String.format(r0, r4, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.m99778d(r12)
            r7.append(r8)
            java.lang.String r8 = "/enc/"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r7)
            r4.append(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r7 = r12.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r3] = r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r1[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r1[r6] = r3
            java.lang.String r3 = "%d_%d_%d.encwxapkg"
            java.lang.String r0 = java.lang.String.format(r0, r3, r1)
            r4.append(r0)
            java.lang.String r6 = r4.toString()
            r10 = 0
            r4 = r11
            r5 = r2
            r7 = r15
            r8 = r12
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.f238715q = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81297o.<init>(java.lang.String, int, int, java.lang.String):void");
    }

    /* renamed from: i */
    public String mo113570i() {
        return String.format(Locale.US, "EncryptPkgDownloadRequest[%s %d %d]", new Object[]{this.f251357l, Integer.valueOf(this.f238715q), Integer.valueOf(this.f251358m)});
    }
}
