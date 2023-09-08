package com.tencent.p014mm.p136ui;

/* renamed from: com.tencent.mm.ui.a3 */
public class C6752a3 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r6 = r6.replace("+", r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7023a(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0077
            int r0 = r6.length()
            r1 = 4
            if (r0 <= r1) goto L_0x0077
            java.lang.String r0 = "+"
            boolean r1 = r6.startsWith(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0034
            java.lang.String r6 = r6.replace(r0, r2)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.PhoneFormater.extractCountryCode(r6)
            if (r1 == 0) goto L_0x0034
            int r2 = r1.length()
            java.lang.String r6 = r6.substring(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
        L_0x0034:
            int r0 = r6.length()
            r1 = 2
            int r0 = r0 - r1
            int r3 = r6.length()
            r4 = 10
            if (r3 < r4) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L_0x004a:
            int r5 = r6.length()
            if (r4 >= r5) goto L_0x0064
            char r5 = r6.charAt(r4)
            if (r4 <= r1) goto L_0x005e
            if (r4 >= r0) goto L_0x005e
            r5 = 42
            r3.append(r5)
            goto L_0x0061
        L_0x005e:
            r3.append(r5)
        L_0x0061:
            int r4 = r4 + 1
            goto L_0x004a
        L_0x0064:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = r3.toString()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
        L_0x0077:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C6752a3.m7023a(java.lang.String):java.lang.String");
    }
}
