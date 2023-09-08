package kn0;

/* renamed from: kn0.g */
public final class C88233g {

    /* renamed from: a */
    public static final C88233g f255048a = new C88233g();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        cy3.C58003b.m67160a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo122581a(ym0.C91509g r8, android.net.Uri r9) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.ExoContentTypeInferer"
            java.lang.String r1 = "inferer#get, useContentInferer: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "infer#ContentContentTypeInferer3, uri: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r1 = 3
            if (r9 != 0) goto L_0x001f
            goto L_0x0074
        L_0x001f:
            kn0.d r2 = new kn0.d
            r2.<init>(r8, r9)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "uri.toString()"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.Object r9 = r2.invoke(r8)
            java.io.InputStream r9 = (java.io.InputStream) r9
            if (r9 == 0) goto L_0x0059
            r2 = 0
            in0.b r3 = in0.C87758b.f254077a     // Catch:{ Exception -> 0x0040 }
            boolean r8 = r3.mo122162a(r9)     // Catch:{ Exception -> 0x0040 }
            goto L_0x004f
        L_0x003e:
            r8 = move-exception
            goto L_0x0053
        L_0x0040:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.AppBrand.ContainerFormatInferer"
            java.lang.String r5 = "judge isHls fail"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x003e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r6)     // Catch:{ all -> 0x003e }
            boolean r8 = fn0.C87002g.m108019m(r8)     // Catch:{ all -> 0x003e }
        L_0x004f:
            cy3.C58003b.m67160a(r9, r2)
            goto L_0x005d
        L_0x0053:
            throw r8     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            cy3.C58003b.m67160a(r9, r8)
            throw r0
        L_0x0059:
            boolean r8 = fn0.C87002g.m108019m(r8)
        L_0x005d:
            if (r8 == 0) goto L_0x0060
            r1 = 2
        L_0x0060:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "infer#ContentContentTypeInferer3, type: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.C88233g.mo122581a(ym0.g, android.net.Uri):int");
    }
}
