package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.q2 */
public class C104490q2 extends RuntimeException {

    /* renamed from: d */
    public final List<String> f309658d;

    public C104490q2(C23845j1 j1Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104490q2(java.util.List<java.lang.String> r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Message missing required fields: "
            r0.<init>(r1)
            java.util.Iterator r1 = r6.iterator()
            r2 = 1
        L_0x000c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L_0x001c
            r2 = 0
            goto L_0x0021
        L_0x001c:
            java.lang.String r4 = ", "
            r0.append(r4)
        L_0x0021:
            r0.append(r3)
            goto L_0x000c
        L_0x0025:
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r5.f309658d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C104490q2.<init>(java.util.List):void");
    }
}
