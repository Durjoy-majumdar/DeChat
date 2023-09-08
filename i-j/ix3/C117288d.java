package ix3;

/* renamed from: ix3.d */
public final class C117288d {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m165353a(int r7, byte[] r8, byte[] r9) {
        /*
            if (r8 == 0) goto L_0x0061
            int r0 = r8.length
            r1 = 24
            r2 = 16
            r3 = 8
            if (r0 == r3) goto L_0x0011
            int r0 = r8.length
            if (r0 == r2) goto L_0x0011
            int r0 = r8.length
            if (r0 != r1) goto L_0x0061
        L_0x0011:
            if (r9 == 0) goto L_0x005b
            java.lang.String r0 = "DESede/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            byte[] r4 = new byte[r1]
            int r5 = r8.length
            r6 = 0
            if (r5 != r3) goto L_0x0029
            java.lang.System.arraycopy(r8, r6, r4, r6, r3)
            java.lang.System.arraycopy(r8, r6, r4, r3, r3)
        L_0x0025:
            java.lang.System.arraycopy(r8, r6, r4, r2, r3)
            goto L_0x0033
        L_0x0029:
            int r5 = r8.length
            if (r5 != r2) goto L_0x0030
            java.lang.System.arraycopy(r8, r6, r4, r6, r2)
            goto L_0x0025
        L_0x0030:
            java.lang.System.arraycopy(r8, r6, r4, r6, r1)
        L_0x0033:
            int r8 = r9.length
            int r8 = r8 % r3
            r1 = 1
            if (r8 == 0) goto L_0x0048
            int r8 = r9.length
            int r8 = r8 / r3
            int r8 = r8 + r1
            int r8 = r8 * 8
            byte[] r2 = new byte[r8]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r6, r2, r6, r3)
            int r9 = r9.length
            java.util.Arrays.fill(r2, r9, r8, r6)
            r9 = r2
        L_0x0048:
            if (r7 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r1 = 2
        L_0x004c:
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r8 = "DESede"
            r7.<init>(r4, r8)
            r0.init(r1, r7)
            byte[] r7 = r0.doFinal(r9)
            return r7
        L_0x005b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0061:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ix3.C117288d.m165353a(int, byte[], byte[]):byte[]");
    }
}
