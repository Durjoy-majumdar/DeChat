package com.tencent.p014mm.network;

/* renamed from: com.tencent.mm.network.o0 */
public final class C40383o0 {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if ((r1 instanceof com.tencent.p014mm.network.C81038d0) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ac, code lost:
        if ((r1 instanceof com.tencent.p014mm.network.C81038d0) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ae, code lost:
        ((com.tencent.p014mm.network.C81038d0) r1).getClass();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m43567a(java.lang.Object r1, java.lang.Object r2, fy3.C32226l r3) {
        /*
            r0 = 0
            java.lang.Object r2 = r3.invoke(r1)     // Catch:{ all -> 0x0051 }
            boolean r3 = r1 instanceof java.net.URLConnection     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0011
            r3 = r1
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ all -> 0x001f }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x001f }
            goto L_0x0038
        L_0x0011:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C40376e0     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0021
            r3 = r1
            com.tencent.mm.network.e0 r3 = (com.tencent.p014mm.network.C40376e0) r3     // Catch:{ all -> 0x001f }
            javax.net.ssl.HttpsURLConnection r3 = r3.f108504a     // Catch:{ all -> 0x001f }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x001f }
            goto L_0x0038
        L_0x001f:
            goto L_0x003d
        L_0x0021:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81034b0     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x002d
            r3 = r1
            com.tencent.mm.network.b0 r3 = (com.tencent.p014mm.network.C81034b0) r3     // Catch:{ all -> 0x001f }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x001f }
            goto L_0x0038
        L_0x002d:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81038d0     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0038
            r3 = r1
            com.tencent.mm.network.d0 r3 = (com.tencent.p014mm.network.C81038d0) r3     // Catch:{ all -> 0x001f }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x001f }
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ all -> 0x001f }
        L_0x003d:
            boolean r3 = r1 instanceof java.net.HttpURLConnection
            if (r3 == 0) goto L_0x0042
            goto L_0x0090
        L_0x0042:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C40376e0
            if (r3 == 0) goto L_0x0047
            goto L_0x009a
        L_0x0047:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81034b0
            if (r3 == 0) goto L_0x004c
            goto L_0x00a4
        L_0x004c:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81038d0
            if (r3 == 0) goto L_0x00b3
            goto L_0x00ae
        L_0x0051:
            r3 = move-exception
            if (r2 == 0) goto L_0x00b4
            boolean r3 = r1 instanceof java.net.URLConnection     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0060
            r3 = r1
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ all -> 0x006e }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x006e }
            goto L_0x0087
        L_0x0060:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C40376e0     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0070
            r3 = r1
            com.tencent.mm.network.e0 r3 = (com.tencent.p014mm.network.C40376e0) r3     // Catch:{ all -> 0x006e }
            javax.net.ssl.HttpsURLConnection r3 = r3.f108504a     // Catch:{ all -> 0x006e }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x006e }
            goto L_0x0087
        L_0x006e:
            goto L_0x008c
        L_0x0070:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81034b0     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x007c
            r3 = r1
            com.tencent.mm.network.b0 r3 = (com.tencent.p014mm.network.C81034b0) r3     // Catch:{ all -> 0x006e }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x006e }
            goto L_0x0087
        L_0x007c:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81038d0     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0087
            r3 = r1
            com.tencent.mm.network.d0 r3 = (com.tencent.p014mm.network.C81038d0) r3     // Catch:{ all -> 0x006e }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x006e }
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()     // Catch:{ all -> 0x006e }
        L_0x008c:
            boolean r3 = r1 instanceof java.net.HttpURLConnection
            if (r3 == 0) goto L_0x0096
        L_0x0090:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.disconnect()
            goto L_0x00b3
        L_0x0096:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C40376e0
            if (r3 == 0) goto L_0x00a0
        L_0x009a:
            com.tencent.mm.network.e0 r1 = (com.tencent.p014mm.network.C40376e0) r1
            r1.mo63087a()
            goto L_0x00b3
        L_0x00a0:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81034b0
            if (r3 == 0) goto L_0x00aa
        L_0x00a4:
            com.tencent.mm.network.b0 r1 = (com.tencent.p014mm.network.C81034b0) r1
            r1.disconnect()
            goto L_0x00b3
        L_0x00aa:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81038d0
            if (r3 == 0) goto L_0x00b3
        L_0x00ae:
            com.tencent.mm.network.d0 r1 = (com.tencent.p014mm.network.C81038d0) r1
            r1.getClass()
        L_0x00b3:
            return r2
        L_0x00b4:
            throw r3     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r2 = move-exception
            boolean r3 = r1 instanceof java.net.URLConnection     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00c2
            r3 = r1
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ all -> 0x00d0 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x00d0 }
            goto L_0x00e9
        L_0x00c2:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C40376e0     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00d2
            r3 = r1
            com.tencent.mm.network.e0 r3 = (com.tencent.p014mm.network.C40376e0) r3     // Catch:{ all -> 0x00d0 }
            javax.net.ssl.HttpsURLConnection r3 = r3.f108504a     // Catch:{ all -> 0x00d0 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x00d0 }
            goto L_0x00e9
        L_0x00d0:
            goto L_0x00ee
        L_0x00d2:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81034b0     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00de
            r3 = r1
            com.tencent.mm.network.b0 r3 = (com.tencent.p014mm.network.C81034b0) r3     // Catch:{ all -> 0x00d0 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x00d0 }
            goto L_0x00e9
        L_0x00de:
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81038d0     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00e9
            r3 = r1
            com.tencent.mm.network.d0 r3 = (com.tencent.p014mm.network.C81038d0) r3     // Catch:{ all -> 0x00d0 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x00d0 }
        L_0x00e9:
            if (r0 == 0) goto L_0x00ee
            r0.close()     // Catch:{ all -> 0x00d0 }
        L_0x00ee:
            boolean r3 = r1 instanceof java.net.HttpURLConnection
            if (r3 != 0) goto L_0x0110
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C40376e0
            if (r3 != 0) goto L_0x010a
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81034b0
            if (r3 != 0) goto L_0x0104
            boolean r3 = r1 instanceof com.tencent.p014mm.network.C81038d0
            if (r3 == 0) goto L_0x0115
            com.tencent.mm.network.d0 r1 = (com.tencent.p014mm.network.C81038d0) r1
            r1.getClass()
            goto L_0x0115
        L_0x0104:
            com.tencent.mm.network.b0 r1 = (com.tencent.p014mm.network.C81034b0) r1
            r1.disconnect()
            goto L_0x0115
        L_0x010a:
            com.tencent.mm.network.e0 r1 = (com.tencent.p014mm.network.C40376e0) r1
            r1.mo63087a()
            goto L_0x0115
        L_0x0110:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.disconnect()
        L_0x0115:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C40383o0.m43567a(java.lang.Object, java.lang.Object, fy3.l):java.lang.Object");
    }
}
