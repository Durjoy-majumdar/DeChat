package uf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.InputStream;

/* renamed from: uf0.b */
public class C102015b {

    /* renamed from: a */
    public long f300397a = -1;

    /* renamed from: b */
    public long f300398b = -1;

    /* renamed from: c */
    public C102014a f300399c = null;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[SYNTHETIC, Splitter:B:38:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC, Splitter:B:50:0x0092] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo141510a(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r3 = ""
            r0 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0013
            int r5 = r18.length()
            if (r5 > 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            r6 = -1
            java.lang.String r8 = "MicroMsg.AtomParsers"
            if (r5 == 0) goto L_0x0020
            java.lang.String r0 = "calc moov atom location but filepath is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return r6
        L_0x0020:
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            r5.<init>((java.lang.String) r2)
            r9 = 0
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r18)     // Catch:{ Exception -> 0x0089 }
            long r10 = r5.mo119980r()     // Catch:{ Exception -> 0x0089 }
            r1.f300398b = r10     // Catch:{ Exception -> 0x0089 }
            r10 = 0
            uf0.a r12 = r1.mo141511b(r9, r10)     // Catch:{ Exception -> 0x0089 }
            if (r12 != 0) goto L_0x003e
            java.lang.String r0 = "has no atom, this file may be not mp4"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0074
        L_0x003e:
            int r13 = r12.f300395c     // Catch:{ Exception -> 0x0089 }
            int r14 = uf0.C102014a.f300376f     // Catch:{ Exception -> 0x0089 }
            if (r13 != r14) goto L_0x0046
            r13 = 1
            goto L_0x0047
        L_0x0046:
            r13 = 0
        L_0x0047:
            if (r13 == 0) goto L_0x0052
            long r10 = r12.f300396d     // Catch:{ Exception -> 0x0089 }
            long r6 = r12.mo141508a()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0070
        L_0x0050:
            r0 = move-exception
            goto L_0x008b
        L_0x0052:
            int r13 = r12.f300393a     // Catch:{ Exception -> 0x0089 }
            if (r13 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "it is the final atom, but can not find moov atom."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0074
        L_0x0061:
            long r13 = r12.mo141508a()     // Catch:{ Exception -> 0x0089 }
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0074
            long r10 = r12.f300396d     // Catch:{ Exception -> 0x0089 }
            long r12 = r12.mo141508a()     // Catch:{ Exception -> 0x0089 }
            long r10 = r10 + r12
        L_0x0070:
            r15 = r6
            r6 = r10
            r10 = r15
            goto L_0x0075
        L_0x0074:
            r10 = r6
        L_0x0075:
            if (r9 == 0) goto L_0x0082
            r9.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x0082
        L_0x007b:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r9, r3, r0)
        L_0x0082:
            r15 = r6
            r6 = r10
            r10 = r15
            goto L_0x009d
        L_0x0086:
            r0 = move-exception
            r2 = r0
            goto L_0x00d5
        L_0x0089:
            r0 = move-exception
            r10 = r6
        L_0x008b:
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r12)     // Catch:{ all -> 0x0086 }
            if (r9 == 0) goto L_0x009d
            r9.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009d
        L_0x0096:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r9, r3, r0)
        L_0x009d:
            r1.f300397a = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "calc moov atom location moovAtomLocation : "
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = " moovSize : "
            r0.append(r3)
            long r3 = r1.f300397a
            r0.append(r3)
            java.lang.String r3 = " file length : "
            r0.append(r3)
            long r3 = r5.mo119980r()
            r5 = 1024(0x400, double:5.06E-321)
            long r3 = r3 / r5
            r0.append(r3)
            java.lang.String r3 = " K file path: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return r10
        L_0x00d5:
            if (r9 == 0) goto L_0x00e2
            r9.close()     // Catch:{ IOException -> 0x00db }
            goto L_0x00e2
        L_0x00db:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r5, r3, r0)
        L_0x00e2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102015b.mo141510a(java.lang.String):long");
    }

    /* renamed from: b */
    public final C102014a mo141511b(InputStream inputStream, long j) {
        long j2;
        C102015b bVar;
        long j3;
        InputStream inputStream2 = inputStream;
        C102014a aVar = null;
        if (inputStream2 == null || j < 0) {
            Log.m105928w("MicroMsg.AtomParsers", "find Moov Atom, but parameter is error.");
            return null;
        }
        int i = 0;
        try {
            if (inputStream.skip(j) < j) {
                return null;
            }
            int i2 = 8;
            byte[] bArr = new byte[8];
            int read = inputStream2.read(bArr, 0, 8);
            long j4 = j;
            while (read >= i2) {
                int e = C102016c.m134343e(bArr, i);
                int e2 = C102016c.m134343e(bArr, 4);
                if (e != 1) {
                    bVar = this;
                    j2 = 0;
                } else if (inputStream2.read(bArr, i, i2) < i2) {
                    return aVar;
                } else {
                    bVar = this;
                    j2 = C102016c.m134344f(bArr, i);
                }
                bVar.f300399c = aVar;
                int i3 = e2;
                C102014a aVar2 = new C102014a(e, j4, e2, j2);
                try {
                    if (!(i3 == C102014a.f300376f)) {
                        if (!(e == 0)) {
                            if (e > 1) {
                                j3 = (long) (e - 8);
                                j4 += (long) e;
                            } else if (j2 > 0) {
                                j3 = (j2 - 8) - 8;
                                j4 += j2;
                            }
                            if (inputStream2.skip(j3) >= j3) {
                                read = inputStream2.read(bArr, 0, 8);
                                aVar = aVar2;
                                i = 0;
                                i2 = 8;
                            }
                        }
                    }
                    return aVar2;
                } catch (Exception e3) {
                    e = e3;
                    aVar = aVar2;
                    Log.printErrStackTrace("MicroMsg.AtomParsers", e, "", new Object[0]);
                    return aVar;
                }
            }
            return aVar;
        } catch (Exception e4) {
            e = e4;
            Log.printErrStackTrace("MicroMsg.AtomParsers", e, "", new Object[0]);
            return aVar;
        }
    }
}
