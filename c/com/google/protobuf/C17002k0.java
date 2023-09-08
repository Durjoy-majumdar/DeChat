package com.google.protobuf;

/* renamed from: com.google.protobuf.k0 */
public class C17002k0 implements C16992i1 {

    /* renamed from: a */
    public static final C17002k0 f46006a = new C17002k0();

    /* renamed from: a */
    public boolean mo18734a(Class<?> cls) {
        return C23861l0.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.protobuf.C23841h1 mo18735b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.protobuf.l0> r0 = com.google.protobuf.C23861l0.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0033 }
            com.google.protobuf.l0 r0 = com.google.protobuf.C23861l0.getDefaultInstance(r0)     // Catch:{ Exception -> 0x0033 }
            java.lang.Object r0 = r0.buildMessageInfo()     // Catch:{ Exception -> 0x0033 }
            com.google.protobuf.h1 r0 = (com.google.protobuf.C23841h1) r0     // Catch:{ Exception -> 0x0033 }
            return r0
        L_0x0033:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0047
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004c
        L_0x0047:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004c:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C17002k0.mo18735b(java.lang.Class):com.google.protobuf.h1");
    }
}
