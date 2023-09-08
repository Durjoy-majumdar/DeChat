package cf0;

/* renamed from: cf0.c */
public class C80023c {
    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(1:2)(1:3)|4|(3:5|6|(8:7|8|(8:11|(1:13)|14|(1:16)(1:17)|18|(2:21|48)|44|9)|45|22|(1:24)|25|26))|27|28|42) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0094 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.List<cf0.C80030i<T>> m97312a(java.util.List<cf0.C80030i<java.lang.Void>> r17, java.io.File r18, java.io.OutputStream r19, boolean r20, int r21) {
        /*
            cf0.e$a r0 = cf0.C80025e.C80026a.COPY
            r1 = 0
            if (r20 == 0) goto L_0x000f
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r17.size()
            r2.<init>(r3)
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            cf0.e r3 = new cf0.e
            r4 = r19
            r5 = r21
            r3.<init>(r4, r5)
            cf0.g r4 = new cf0.g     // Catch:{ Exception -> 0x0094, all -> 0x008c }
            r5 = r18
            r4.<init>(r5)     // Catch:{ Exception -> 0x0094, all -> 0x008c }
            java.util.Iterator r1 = r17.iterator()     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r5 = 0
            r7 = r5
        L_0x0027:
            boolean r9 = r1.hasNext()     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            if (r9 == 0) goto L_0x0073
            java.lang.Object r9 = r1.next()     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            cf0.i r9 = (cf0.C80030i) r9     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            boolean r10 = r9.f234467g     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r11 = r9.f234464d     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r11 = r11 - r7
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x0042
            r4.mo110269a(r7, r11)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r3.mo110267a(r4, r0)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
        L_0x0042:
            long r7 = r9.f234464d     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r11 = r9.f234465e     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r4.mo110269a(r7, r11)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            cf0.a r7 = r3.f234451e     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r12 = r7.f234443d     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            if (r10 != 0) goto L_0x0053
            r3.mo110267a(r4, r0)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            goto L_0x0058
        L_0x0053:
            cf0.e$a r7 = cf0.C80025e.C80026a.UNCOMPRESS_NOWRAP     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r3.mo110267a(r4, r7)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
        L_0x0058:
            long r7 = r9.f234464d     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r14 = r9.f234465e     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r7 = r7 + r14
            if (r20 == 0) goto L_0x0027
            if (r10 == 0) goto L_0x0027
            cf0.a r9 = r3.f234451e     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r9 = r9.f234443d     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r14 = r9 - r12
            cf0.i r9 = new cf0.i     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r16 = 0
            r11 = r9
            r11.<init>(r12, r14, r16)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r2.add(r9)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            goto L_0x0027
        L_0x0073:
            long r9 = r4.f234462h     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r9 = r9 - r7
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0080
            r4.mo110269a(r7, r9)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r3.mo110267a(r4, r0)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
        L_0x0080:
            r4.close()     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            r3.close()     // Catch:{ Exception -> 0x0098 }
            goto L_0x0098
        L_0x0087:
            r0 = move-exception
            r1 = r4
            goto L_0x008d
        L_0x008a:
            r1 = r4
            goto L_0x0094
        L_0x008c:
            r0 = move-exception
        L_0x008d:
            r1.close()     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            r3.close()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            throw r0
        L_0x0094:
            r1.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0083
        L_0x0098:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cf0.C80023c.m97312a(java.util.List, java.io.File, java.io.OutputStream, boolean, int):java.util.List");
    }
}
