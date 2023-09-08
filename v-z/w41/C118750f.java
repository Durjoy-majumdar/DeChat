package w41;

/* renamed from: w41.f */
public final class C118750f {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m167443a(com.tencent.p014mm.vfs.C86009m1 r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r8.mo119976n()
            r2 = 0
            java.io.RandomAccessFile r1 = com.tencent.p014mm.vfs.C86013q1.m106420B(r1, r2)
            boolean r3 = r8.mo119967g()
            if (r3 == 0) goto L_0x004c
            boolean r3 = r8.mo119978p()
            if (r3 != 0) goto L_0x001a
            goto L_0x004c
        L_0x001a:
            java.lang.String r8 = r8.mo119976n()     // Catch:{ all -> 0x0042 }
            java.io.RandomAccessFile r8 = com.tencent.p014mm.vfs.C86013q1.m106420B(r8, r2)     // Catch:{ all -> 0x0042 }
            android.util.Pair r3 = w41.C118743a.m167437e(r8)     // Catch:{ all -> 0x0040 }
            java.lang.Object r4 = r3.second     // Catch:{ all -> 0x0040 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0040 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0040 }
            boolean r4 = w41.C118751g.m167446c(r8, r4)     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x0038
            r8.close()
            goto L_0x004d
        L_0x0038:
            w41.a$c r0 = new w41.a$c     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "ZIP64 APK not supported"
            r0.<init>(r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            goto L_0x0046
        L_0x0042:
            r8 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
        L_0x0046:
            if (r8 == 0) goto L_0x004b
            r8.close()
        L_0x004b:
            throw r0
        L_0x004c:
            r3 = r0
        L_0x004d:
            java.lang.Object r8 = r3.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r3 = r8.longValue()
            r5 = 22
            long r3 = r3 + r5
            r5 = 2
            long r3 = r3 - r5
            r1.seek(r3)
            r8 = 2
            byte[] r8 = new byte[r8]
            r1.readFully(r8)
            r3 = 1
            byte r3 = r8[r3]
            int r3 = r3 << 8
            r4 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r4
            byte r8 = r8[r2]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r8
            if (r3 != 0) goto L_0x0078
            r1.close()
            return r0
        L_0x0078:
            byte[] r8 = new byte[r3]
            r1.read(r8)
            r1.close()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w41.C118750f.m167443a(com.tencent.mm.vfs.m1):byte[]");
    }
}
