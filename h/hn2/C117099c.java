package hn2;

/* renamed from: hn2.c */
public final class C117099c {
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0194, code lost:
        r18 = r3;
        r19 = r5;
        r3 = sx3.C64197v.m75536e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019d, code lost:
        if (-1 >= r3) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019f, code lost:
        r5 = (hn2.C32968a) r8.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ac, code lost:
        if ((r5.f89574c + r5.f89575d) <= 8) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ae, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ListFile", z04.C112551y.m153813m(r4, r3) + '[' + r5.f89573b + " bytes, " + r5.f89575d + " dirs, " + r5.f89574c + " files | " + r5.f89572a + ']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ed, code lost:
        r8.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f0, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f3, code lost:
        r3 = r18;
        r5 = r19;
        r4 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m165129a(android.os.CancellationSignal r28) {
        /*
            java.lang.String r0 = "fe.relPath"
            java.lang.String r1 = "MicroMsg.ListFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            java.util.Map r3 = r3.mo177791d()
            r4 = 0
            java.util.List<java.lang.String> r5 = hn2.C117100d.f350878a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0016:
            boolean r6 = r5.hasNext()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r7 = 1
            if (r6 == 0) goto L_0x01fa
            java.lang.Object r6 = r5.next()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.mm.vfs.NativeFileSystem r8 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r8.<init>((java.lang.String) r6)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.mm.vfs.FileSystem$c r6 = r8.mo177578v(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r8 = "NativeFileSystem(root).configure(env)"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r8 = ""
            r9 = 0
            java.lang.Iterable r6 = com.tencent.p014mm.vfs.C116299g2.m163860p(r6, r8, r4, r9)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r6 != 0) goto L_0x0043
            sx3.f0 r6 = sx3.C64186f0.f181907d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0043:
            hn2.a[] r8 = new hn2.C32968a[r7]     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            hn2.a r17 = new hn2.a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r10 = ""
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            r9 = r17
            r9.<init>(r10, r11, r13, r14, r15, r16)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r8[r4] = r17     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.util.List r8 = sx3.C64197v.m75539h(r8)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0060:
            boolean r9 = r6.hasNext()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r11 = " files | "
            java.lang.String r12 = " dirs, "
            java.lang.String r13 = " bytes, "
            java.lang.String r4 = "  "
            if (r9 == 0) goto L_0x0194
            java.lang.Object r9 = r6.next()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.mm.vfs.b0 r9 = (com.tencent.p014mm.vfs.C86001b0) r9     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r28 == 0) goto L_0x0079
            r28.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0079:
            java.lang.String r7 = r9.f250471a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r10 = 0
            r14 = 0
        L_0x0080:
            int r15 = r7.length()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r10 >= r15) goto L_0x009c
            char r15 = r7.charAt(r10)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r18 = r3
            r3 = 47
            if (r15 != r3) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x0097
            int r14 = r14 + 1
        L_0x0097:
            int r10 = r10 + 1
            r3 = r18
            goto L_0x0080
        L_0x009c:
            r18 = r3
            int r3 = sx3.C64197v.m75536e(r8)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r7 = r14 + 1
            if (r7 > r3) goto L_0x0102
        L_0x00a6:
            java.lang.Object r10 = r8.get(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            hn2.a r10 = (hn2.C32968a) r10     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r15 = r10.f89574c     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r19 = r5
            int r5 = r10.f89575d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r15 = r15 + r5
            r5 = 8
            if (r15 <= r5) goto L_0x00f4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.<init>()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r15 = z04.C112551y.m153813m(r4, r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r15)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r15 = 91
            r5.append(r15)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r20 = r14
            long r14 = r10.f89573b     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r14)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r13)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r14 = r10.f89575d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r14)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r12)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r14 = r10.f89574c     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r14)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r11)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r10 = r10.f89572a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5.append(r10)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r10 = 93
            r5.append(r10)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r5 = r5.toString()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            goto L_0x00f6
        L_0x00f4:
            r20 = r14
        L_0x00f6:
            r8.remove(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r3 == r7) goto L_0x0106
            int r3 = r3 + -1
            r5 = r19
            r14 = r20
            goto L_0x00a6
        L_0x0102:
            r19 = r5
            r20 = r14
        L_0x0106:
            java.util.Iterator r3 = r8.iterator()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x010a:
            boolean r5 = r3.hasNext()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r5 == 0) goto L_0x012f
            java.lang.Object r5 = r3.next()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            hn2.a r5 = (hn2.C32968a) r5     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            boolean r7 = r9.f250476f     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r7 == 0) goto L_0x0121
            int r7 = r5.f89575d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r10 = 1
            int r7 = r7 + r10
            r5.f89575d = r7     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            goto L_0x0127
        L_0x0121:
            int r7 = r5.f89574c     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r10 = 1
            int r7 = r7 + r10
            r5.f89574c = r7     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0127:
            long r10 = r5.f89573b     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            long r12 = r9.f250474d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            long r10 = r10 + r12
            r5.f89573b = r10     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            goto L_0x010a
        L_0x012f:
            r3 = 0
            r2.setLength(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r14 = r20
            java.lang.String r3 = z04.C112551y.m153813m(r4, r14)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            boolean r3 = r9.f250476f     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5 = 1
            if (r3 != r5) goto L_0x0144
            java.lang.String r4 = "* "
            goto L_0x0146
        L_0x0144:
            if (r3 != 0) goto L_0x018e
        L_0x0146:
            r2.append(r4)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r3 = r9.f250472b     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r3 = 9
            r2.append(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            long r4 = r9.f250473c     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r2.append(r4)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            long r3 = r9.f250474d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r3 = r2.toString()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            boolean r3 = r9.f250476f     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            if (r3 == 0) goto L_0x0186
            hn2.a r3 = new hn2.a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r4 = r9.f250471a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            gy3.C87412m.m108593f(r4, r0)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            r20 = r3
            r21 = r4
            r20.<init>(r21, r22, r24, r25, r26, r27)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r8.add(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0186:
            r3 = r18
            r5 = r19
            r4 = 0
            r7 = 1
            goto L_0x0060
        L_0x018e:
            rx3.j r0 = new rx3.j     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r0.<init>()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            throw r0     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x0194:
            r18 = r3
            r19 = r5
            int r3 = sx3.C64197v.m75536e(r8)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
        L_0x019c:
            r5 = -1
            if (r5 >= r3) goto L_0x01f3
            java.lang.Object r5 = r8.get(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            hn2.a r5 = (hn2.C32968a) r5     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r6 = r5.f89574c     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r7 = r5.f89575d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r6 = r6 + r7
            r7 = 8
            if (r6 <= r7) goto L_0x01e9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.<init>()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r9 = z04.C112551y.m153813m(r4, r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r9)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r9 = 91
            r6.append(r9)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            long r14 = r5.f89573b     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r14)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r13)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r10 = r5.f89575d     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r10)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r12)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r10 = r5.f89574c     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r10)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r11)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r5 = r5.f89572a     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r6.append(r5)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            r5 = 93
            r6.append(r5)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            java.lang.String r6 = r6.toString()     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            goto L_0x01ed
        L_0x01e9:
            r5 = 93
            r9 = 91
        L_0x01ed:
            r8.remove(r3)     // Catch:{ OperationCanceledException -> 0x01fe, Exception -> 0x01fc }
            int r3 = r3 + -1
            goto L_0x019c
        L_0x01f3:
            r3 = r18
            r5 = r19
            r4 = 0
            goto L_0x0016
        L_0x01fa:
            r0 = 1
            return r0
        L_0x01fc:
            r0 = move-exception
            goto L_0x0200
        L_0x01fe:
            r2 = 0
            goto L_0x0209
        L_0x0200:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "FILE LIST FAILED"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r3)
            goto L_0x020e
        L_0x0209:
            java.lang.String r0 = "FILE LIST CANCELLED"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x020e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hn2.C117099c.m165129a(android.os.CancellationSignal):boolean");
    }
}
