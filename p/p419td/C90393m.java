package p419td;

/* renamed from: td.m */
public final class C90393m {

    /* renamed from: a */
    public static final C90393m f259402a = new C90393m();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r1 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo124604a(java.io.RandomAccessFile r17) {
        /*
            r16 = this;
            r0 = r17
            short r1 = r17.readShort()
            short r2 = r17.readShort()
            short r3 = r17.readShort()
            r4 = 0
            r5 = 1
            if (r1 != r5) goto L_0x00ce
            if (r2 == 0) goto L_0x0016
            goto L_0x00ce
        L_0x0016:
            r1 = 12
            r0.seek(r1)
            r1 = 4
            byte[] r1 = new byte[r1]
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x0021:
            if (r6 >= r3) goto L_0x0053
            r0.read(r1)
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = z04.C119027c.f356488a
            r7.<init>(r1, r8)
            r17.readInt()
            int r8 = r17.readInt()
            r17.readInt()
            java.lang.String r9 = "name"
            boolean r9 = z04.C112551y.m153809i(r9, r7, r5)
            if (r9 == 0) goto L_0x0042
            r7 = r8
            r1 = 1
            goto L_0x0054
        L_0x0042:
            int r7 = r7.length()
            if (r7 != 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x004f
            r7 = r8
            goto L_0x0053
        L_0x004f:
            int r6 = r6 + 1
            r7 = r8
            goto L_0x0021
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 != 0) goto L_0x0057
            return r4
        L_0x0057:
            long r8 = (long) r7
            r0.seek(r8)
            r17.readShort()
            short r1 = r17.readShort()
            short r3 = r17.readShort()
            r6 = r4
            r8 = r6
        L_0x0068:
            if (r2 >= r1) goto L_0x00c8
            r17.readShort()
            r17.readShort()
            r17.readShort()
            short r9 = r17.readShort()
            short r10 = r17.readShort()
            short r11 = r17.readShort()
            long r12 = r17.getFilePointer()
            if (r10 <= 0) goto L_0x00c7
            r14 = 32767(0x7fff, float:4.5916E-41)
            if (r10 < r14) goto L_0x008a
            goto L_0x00c7
        L_0x008a:
            r14 = 6
            if (r9 == r5) goto L_0x0090
            if (r9 == r14) goto L_0x0090
            goto L_0x00c4
        L_0x0090:
            int r11 = r11 + r7
            int r11 = r11 + r3
            long r14 = (long) r11
            r0.seek(r14)
            byte[] r10 = new byte[r10]
            r0.read(r10)
            r0.seek(r12)
            java.lang.String r11 = "forName(\"utf-16\")"
            java.lang.String r12 = "utf-16"
            if (r9 == r5) goto L_0x00b7
            r13 = 6
            if (r9 == r13) goto L_0x00a9
            goto L_0x00c4
        L_0x00a9:
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r12)
            gy3.C87412m.m108593f(r8, r11)
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10, r8)
            r8 = r9
            goto L_0x00c4
        L_0x00b7:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r12)
            gy3.C87412m.m108593f(r6, r11)
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10, r6)
            r6 = r9
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x0068
        L_0x00c7:
            return r4
        L_0x00c8:
            if (r6 == 0) goto L_0x00cb
            return r6
        L_0x00cb:
            if (r8 == 0) goto L_0x00ce
            return r8
        L_0x00ce:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p419td.C90393m.mo124604a(java.io.RandomAccessFile):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo124605b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ttfparse error"
            java.lang.String r1 = "TTFParser"
            java.lang.String r2 = "fileName"
            gy3.C87412m.m108594g(r7, r2)
            r2 = 0
            r3 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0026 }
            java.lang.String r5 = "r"
            r4.<init>(r7, r5)     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = r6.mo124604a(r4)     // Catch:{ all -> 0x0023 }
            r4.close()     // Catch:{ Exception -> 0x001c }
            goto L_0x0022
        L_0x001c:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p416qd.C89598h.m112046c(r1, r3, r0, r2)
        L_0x0022:
            return r7
        L_0x0023:
            r7 = move-exception
            r3 = r4
            goto L_0x0027
        L_0x0026:
            r7 = move-exception
        L_0x0027:
            if (r3 == 0) goto L_0x0033
            r3.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x0033
        L_0x002d:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p416qd.C89598h.m112046c(r1, r3, r0, r2)
        L_0x0033:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p419td.C90393m.mo124605b(java.lang.String):java.lang.String");
    }
}
