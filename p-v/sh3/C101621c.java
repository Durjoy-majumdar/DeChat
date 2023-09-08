package sh3;

import o60.C100284b;

/* renamed from: sh3.c */
public final class C101621c extends C100284b<C101619a> {

    /* renamed from: a */
    public final String f297474a = "MicroMsg.LensIconDownloader";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95802a(x60.C102564a<sh3.C101619a> r9, t60.C101725g r10, o60.C100284b.C100285a r11) {
        /*
            r8 = this;
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "fileNameCreator"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r10 = "callback"
            gy3.C87412m.m108594g(r11, r10)
            T r9 = r9.f301995a
            sh3.a r9 = (sh3.C101619a) r9
            te3.mn2 r9 = r9.f297473d
            te3.ln2 r9 = r9.f298863e
            r10 = 0
            if (r9 == 0) goto L_0x001e
            java.lang.String r0 = r9.f184127d
            goto L_0x001f
        L_0x001e:
            r0 = r10
        L_0x001f:
            if (r9 == 0) goto L_0x0024
            java.lang.String r9 = r9.f184128e
            goto L_0x0025
        L_0x0024:
            r9 = r10
        L_0x0025:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x002f
            r11.mo129424a()
            return
        L_0x002f:
            com.tencent.mm.network.d$b r1 = new com.tencent.mm.network.d$b
            r1.<init>(r0)
            r2 = 0
            com.tencent.mm.network.b0 r0 = com.tencent.p014mm.network.C81035d.m98963d(r0, r1)     // Catch:{ Exception -> 0x00ad }
            int r1 = r0.mo112916a()     // Catch:{ Exception -> 0x00ad }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r4 = r0.getContentType()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            java.lang.String r5 = r8.f297474a     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r6.<init>()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            java.lang.String r7 = "http response: "
            r6.append(r7)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r6.append(r1)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            java.lang.String r7 = ", "
            r6.append(r7)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r6.append(r4)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 == r5) goto L_0x0073
            r0.disconnect()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r11.mo129424a()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            if (r3 == 0) goto L_0x0072
            r3.close()
        L_0x0072:
            return
        L_0x0073:
            if (r3 == 0) goto L_0x0079
            byte[] r10 = cy3.C86147a.m106661c(r3)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
        L_0x0079:
            r0.disconnect()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            if (r10 != 0) goto L_0x0087
            r11.mo129424a()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            if (r3 == 0) goto L_0x0086
            r3.close()
        L_0x0086:
            return
        L_0x0087:
            byte[] r9 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r9)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            byte[] r9 = p823sg.C90191a.m112871a(r10, r9)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            w60.d r10 = new w60.d     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            w60.c r0 = new w60.c     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r10.<init>(r9, r4, r0)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            r11.mo129425b(r10)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            if (r3 == 0) goto L_0x00bc
            r3.close()
            goto L_0x00bc
        L_0x00a6:
            r9 = move-exception
            goto L_0x00c1
        L_0x00a8:
            r9 = move-exception
            r10 = r3
            goto L_0x00ae
        L_0x00ab:
            r9 = move-exception
            goto L_0x00c0
        L_0x00ad:
            r9 = move-exception
        L_0x00ae:
            java.lang.String r0 = r8.f297474a     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = ""
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ab }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r1, r2)     // Catch:{ all -> 0x00ab }
            if (r10 == 0) goto L_0x00bc
            r10.close()
        L_0x00bc:
            r11.mo129424a()
            return
        L_0x00c0:
            r3 = r10
        L_0x00c1:
            if (r3 == 0) goto L_0x00c6
            r3.close()
        L_0x00c6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sh3.C101621c.mo95802a(x60.a, t60.g, o60.b$a):void");
    }
}
