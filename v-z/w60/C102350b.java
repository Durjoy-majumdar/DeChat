package w60;

import w60.C102355h;
import y60.C102802a;

/* renamed from: w60.b */
public class C102350b extends C102355h<String> {

    /* renamed from: b */
    public C102355h.C102356a f301450b;

    public C102350b(String str, String str2, C102355h.C102356a<String> aVar) {
        super(str);
        this.f301450b = aVar;
    }

    /* renamed from: a */
    public C102802a mo141918a() {
        return this.f301450b.mo141917a(this.f301455a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        cy3.C58003b.m67160a(r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141919b(java.io.OutputStream r12) {
        /*
            r11 = this;
            T r0 = r11.f301455a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "filePath"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "stream"
            gy3.C87412m.m108594g(r12, r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r2 = 0
            if (r1 == 0) goto L_0x005d
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x005d
            r3 = 0
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0030 }
        L_0x0021:
            int r5 = r1.read(r4)     // Catch:{ all -> 0x0030 }
            r6 = -1
            if (r5 != r6) goto L_0x002c
            cy3.C58003b.m67160a(r1, r3)     // Catch:{ all -> 0x0037 }
            goto L_0x005d
        L_0x002c:
            r12.write(r4, r2, r5)     // Catch:{ all -> 0x0030 }
            goto L_0x0021
        L_0x0030:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r3 = move-exception
            cy3.C58003b.m67160a(r1, r12)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r12 = move-exception
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1299(0x513, double:6.42E-321)
            r6 = 12
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "save failed. path:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "MicroMsg.Loader.DiskFunction"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r12, r0, r1)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w60.C102350b.mo141919b(java.io.OutputStream):void");
    }
}
