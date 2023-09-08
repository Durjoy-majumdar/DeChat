package b93;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: b93.a */
public final class C39745a {

    /* renamed from: a */
    public static final C39745a f106634a = new C39745a();

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0176 A[SYNTHETIC, Splitter:B:50:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0196 A[SYNTHETIC, Splitter:B:57:0x0196] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5 A[Catch:{ all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0277 A[Catch:{ all -> 0x019f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.xweb.WebResourceResponse mo62374a(java.lang.String r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r3 = "url"
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r5 = ", url="
            java.lang.String r6 = "AdH5ContentFetcher"
            long r7 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1951(0x79f, float:2.734E-42)
            r10 = 3
            r0.mo175911u(r9, r10)
            r12 = 0
            if (r2 == 0) goto L_0x0025
            int r0 = r23.length()
            if (r0 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            r13 = 0
            if (r0 == 0) goto L_0x002a
            return r13
        L_0x002a:
            java.lang.String r15 = "https://review.ugdtimg.com/page/api/get_html"
            java.lang.String r20 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r23)     // Catch:{ Exception -> 0x003e }
            java.lang.String r14 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r14)     // Catch:{ Exception -> 0x003e }
            java.lang.String r14 = "encode(Util.nullAsNil(value), \"UTF-8\")"
            gy3.C87412m.m108593f(r0, r14)     // Catch:{ Exception -> 0x003e }
            goto L_0x005d
        L_0x003e:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r10 = "appendUrlParamsWithUrlEncode exp:"
            r14.append(r10)
            r14.append(r0)
            java.lang.String r0 = ", "
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r0 = r20
        L_0x005d:
            r10 = 2
            java.lang.String r16 = "#"
            r17 = 0
            r18 = 0
            r19 = 6
            r21 = 0
            r14 = r15
            r11 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r21
            int r14 = z04.C112550d0.m153769E(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00dd }
            if (r14 < 0) goto L_0x008b
            java.lang.String r15 = r11.substring(r12, r14)     // Catch:{ Exception -> 0x00dd }
            gy3.C87412m.m108593f(r15, r4)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r14 = r11.substring(r14)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r9 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r14, r9)     // Catch:{ Exception -> 0x00dd }
            goto L_0x008e
        L_0x008b:
            r15 = r11
            r14 = r20
        L_0x008e:
            java.lang.String r9 = "?"
            boolean r9 = z04.C112550d0.m153803w(r15, r9, r12, r10, r13)     // Catch:{ Exception -> 0x00dd }
            r13 = 61
            if (r9 == 0) goto L_0x00b3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r9.<init>()     // Catch:{ Exception -> 0x00dd }
            r9.append(r15)     // Catch:{ Exception -> 0x00dd }
            r15 = 38
            r9.append(r15)     // Catch:{ Exception -> 0x00dd }
            r9.append(r3)     // Catch:{ Exception -> 0x00dd }
            r9.append(r13)     // Catch:{ Exception -> 0x00dd }
            r9.append(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00cd
        L_0x00b3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r9.<init>()     // Catch:{ Exception -> 0x00dd }
            r9.append(r15)     // Catch:{ Exception -> 0x00dd }
            r15 = 63
            r9.append(r15)     // Catch:{ Exception -> 0x00dd }
            r9.append(r3)     // Catch:{ Exception -> 0x00dd }
            r9.append(r13)     // Catch:{ Exception -> 0x00dd }
            r9.append(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x00dd }
        L_0x00cd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r9.<init>()     // Catch:{ Exception -> 0x00dd }
            r9.append(r0)     // Catch:{ Exception -> 0x00dd }
            r9.append(r14)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r15 = r9.toString()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00f6
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e1
        L_0x00df:
            r0 = move-exception
            r11 = r15
        L_0x00e1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "appendUrlParams exp:"
            r9.append(r13)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r15 = r11
        L_0x00f6:
            java.lang.String r9 = "fetchUrlContent, disconnect exp="
            gy3.C87412m.m108594g(r15, r3)
            java.net.HttpURLConnection r3 = r1.mo62375b(r15)     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x014b
            int r0 = r3.getResponseCode()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            r11.<init>()     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = "fetchUrlContent, retCode="
            r11.append(r13)     // Catch:{ all -> 0x0149 }
            r11.append(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0149 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)     // Catch:{ all -> 0x0149 }
            r11 = 200(0xc8, float:2.8E-43)
            if (r0 != r11) goto L_0x014b
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0149 }
            java.io.InputStream r11 = r3.getInputStream()     // Catch:{ all -> 0x0149 }
            r0.<init>(r11)     // Catch:{ all -> 0x0149 }
            java.lang.String r11 = r1.mo62377d(r0)     // Catch:{ all -> 0x0149 }
            r3.disconnect()     // Catch:{ all -> 0x012e }
            goto L_0x0194
        L_0x012e:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r3)
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x0194
        L_0x0149:
            r0 = move-exception
            goto L_0x015a
        L_0x014b:
            if (r3 == 0) goto L_0x0193
            r3.disconnect()     // Catch:{ all -> 0x0151 }
            goto L_0x0193
        L_0x0151:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0180
        L_0x0158:
            r0 = move-exception
            r3 = 0
        L_0x015a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b5 }
            r11.<init>()     // Catch:{ all -> 0x02b5 }
            java.lang.String r13 = "fetchUrlContent, exp="
            r11.append(r13)     // Catch:{ all -> 0x02b5 }
            r11.append(r0)     // Catch:{ all -> 0x02b5 }
            r11.append(r5)     // Catch:{ all -> 0x02b5 }
            r11.append(r15)     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x02b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x02b5 }
            if (r3 == 0) goto L_0x0193
            r3.disconnect()     // Catch:{ all -> 0x017a }
            goto L_0x0193
        L_0x017a:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0180:
            r3.append(r9)
            r3.append(r0)
            r3.append(r5)
            r3.append(r15)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0193:
            r11 = 0
        L_0x0194:
            if (r11 == 0) goto L_0x01a2
            int r0 = r11.length()     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x019d
            goto L_0x01a2
        L_0x019d:
            r0 = 0
            goto L_0x01a3
        L_0x019f:
            r0 = move-exception
            goto L_0x0299
        L_0x01a2:
            r0 = 1
        L_0x01a3:
            if (r0 != 0) goto L_0x0277
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x019f }
            r3 = 4
            r9 = 1951(0x79f, float:2.734E-42)
            r0.mo175911u(r9, r3)     // Catch:{ all -> 0x019f }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x019f }
            r9.<init>(r11)     // Catch:{ all -> 0x019f }
            java.lang.String r11 = "code"
            r13 = -1
            int r11 = r9.optInt(r11, r13)     // Catch:{ all -> 0x019f }
            java.lang.String r13 = "message"
            java.lang.String r13 = r9.optString(r13)     // Catch:{ all -> 0x019f }
            java.lang.String r14 = "data"
            java.lang.String r9 = r9.optString(r14)     // Catch:{ all -> 0x019f }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019f }
            long r14 = r14 - r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            r7.<init>()     // Catch:{ all -> 0x019f }
            java.lang.String r8 = "fetchUrlResponse, [code="
            r7.append(r8)     // Catch:{ all -> 0x019f }
            r7.append(r11)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = ", msg="
            r7.append(r8)     // Catch:{ all -> 0x019f }
            r7.append(r13)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = ", data.len="
            r7.append(r8)     // Catch:{ all -> 0x019f }
            int r8 = r9.length()     // Catch:{ all -> 0x019f }
            r7.append(r8)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = "], costTime="
            r7.append(r8)     // Catch:{ all -> 0x019f }
            r7.append(r14)     // Catch:{ all -> 0x019f }
            r7.append(r5)     // Catch:{ all -> 0x019f }
            r7.append(r2)     // Catch:{ all -> 0x019f }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x019f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x019f }
            int r7 = r23.length()     // Catch:{ all -> 0x019f }
            r8 = 50
            if (r7 >= r8) goto L_0x020a
            r7 = r2
            goto L_0x0211
        L_0x020a:
            java.lang.String r7 = r2.substring(r12, r8)     // Catch:{ all -> 0x019f }
            gy3.C87412m.m108593f(r7, r4)     // Catch:{ all -> 0x019f }
        L_0x0211:
            r8 = 5
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x019f }
            java.lang.String r19 = "ad_h5_intercept_result"
            r4[r12] = r19     // Catch:{ all -> 0x019f }
            r19 = 1
            r4[r19] = r13     // Catch:{ all -> 0x019f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x019f }
            r4[r10] = r13     // Catch:{ all -> 0x019f }
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x019f }
            r13 = 3
            r4[r13] = r10     // Catch:{ all -> 0x019f }
            r4[r3] = r7     // Catch:{ all -> 0x019f }
            r3 = 19789(0x4d4d, float:2.773E-41)
            r0.mo160131h(r3, r4)     // Catch:{ all -> 0x019f }
            if (r11 == 0) goto L_0x0261
            r3 = 1
            if (r11 == r3) goto L_0x0259
            r3 = 101(0x65, float:1.42E-43)
            if (r11 == r3) goto L_0x0251
            r3 = 201(0xc9, float:2.82E-43)
            if (r11 == r3) goto L_0x0245
            r3 = 10
            r4 = 1951(0x79f, float:2.734E-42)
            r0.mo175911u(r4, r3)     // Catch:{ all -> 0x019f }
            goto L_0x02b3
        L_0x0245:
            b93.b r3 = b93.C0258b.f802a     // Catch:{ all -> 0x019f }
            r3.mo296a(r2)     // Catch:{ all -> 0x019f }
            r3 = 7
            r4 = 1951(0x79f, float:2.734E-42)
            r0.mo175911u(r4, r3)     // Catch:{ all -> 0x019f }
            goto L_0x02b3
        L_0x0251:
            r4 = 1951(0x79f, float:2.734E-42)
            r3 = 9
            r0.mo175911u(r4, r3)     // Catch:{ all -> 0x019f }
            goto L_0x02b3
        L_0x0259:
            r4 = 1951(0x79f, float:2.734E-42)
            r3 = 8
            r0.mo175911u(r4, r3)     // Catch:{ all -> 0x019f }
            goto L_0x02b3
        L_0x0261:
            r3 = 1
            r4 = 1951(0x79f, float:2.734E-42)
            r0.mo175911u(r4, r8)     // Catch:{ all -> 0x019f }
            int r0 = r9.length()     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x026f
            r11 = 1
            goto L_0x0270
        L_0x026f:
            r11 = 0
        L_0x0270:
            if (r11 != 0) goto L_0x02b3
            com.tencent.xweb.WebResourceResponse r0 = r1.mo62376c(r9)     // Catch:{ all -> 0x019f }
            return r0
        L_0x0277:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            r0.<init>()     // Catch:{ all -> 0x019f }
            java.lang.String r3 = "fetchUrlResponse, content empty, costTime="
            r0.append(r3)     // Catch:{ all -> 0x019f }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019f }
            long r3 = r3 - r7
            r0.append(r3)     // Catch:{ all -> 0x019f }
            java.lang.String r3 = ", reqUrl="
            r0.append(r3)     // Catch:{ all -> 0x019f }
            r0.append(r15)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x019f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x019f }
            goto L_0x02b3
        L_0x0299:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fetchUrlResponse, exp="
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x02b3:
            r2 = 0
            return r2
        L_0x02b5:
            r0 = move-exception
            r2 = r0
            if (r3 == 0) goto L_0x02d7
            r3.disconnect()     // Catch:{ all -> 0x02bd }
            goto L_0x02d7
        L_0x02bd:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r3)
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x02d7:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b93.C39745a.mo62374a(java.lang.String):com.tencent.xweb.WebResourceResponse");
    }

    /* renamed from: b */
    public final HttpURLConnection mo62375b(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            C87412m.m108592e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (Throwable th) {
            Log.m105920e("AdH5ContentFetcher", "getConnection, exp=" + th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0010 A[Catch:{ all -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.xweb.WebResourceResponse mo62376c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x000d
            int r0 = r6.length()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r0 = 0
            goto L_0x000e
        L_0x000b:
            r6 = move-exception
            goto L_0x002b
        L_0x000d:
            r0 = 1
        L_0x000e:
            if (r0 != 0) goto L_0x0041
            com.tencent.xweb.WebResourceResponse r0 = new com.tencent.xweb.WebResourceResponse     // Catch:{ all -> 0x000b }
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "utf-8"
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x000b }
            java.nio.charset.Charset r4 = z04.C119027c.f356488a     // Catch:{ all -> 0x000b }
            byte[] r6 = r6.getBytes(r4)     // Catch:{ all -> 0x000b }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r6, r4)     // Catch:{ all -> 0x000b }
            r3.<init>(r6)     // Catch:{ all -> 0x000b }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x000b }
            return r0
        L_0x002b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getResponse, exp="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "AdH5ContentFetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
        L_0x0041:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b93.C39745a.mo62376c(java.lang.String):com.tencent.xweb.WebResourceResponse");
    }

    /* renamed from: d */
    public final String mo62377d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Exception e) {
                    Log.m105920e("AdH5ContentFetcher", "readStringFromStream, bufferOs.close exp=" + e);
                }
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    Log.m105920e("AdH5ContentFetcher", "readStringFromStream, is.close exp=" + e2);
                }
                throw th;
            }
        }
        bufferedOutputStream.flush();
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        C87412m.m108593f(byteArrayOutputStream2, "byteOs.toString(\"UTF-8\")");
        try {
            bufferedOutputStream.close();
        } catch (Exception e3) {
            Log.m105920e("AdH5ContentFetcher", "readStringFromStream, bufferOs.close exp=" + e3);
        }
        try {
            inputStream.close();
        } catch (Exception e4) {
            Log.m105920e("AdH5ContentFetcher", "readStringFromStream, is.close exp=" + e4);
        }
        return byteArrayOutputStream2;
    }
}
