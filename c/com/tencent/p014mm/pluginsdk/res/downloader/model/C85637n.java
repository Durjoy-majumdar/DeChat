package com.tencent.p014mm.pluginsdk.res.downloader.model;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import qd3.C12157b;
import qd3.C89599a;
import qd3.C89601d;
import qd3.C89603f;
import qd3.C89604g;
import rd3.C48020a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.n */
public final class C85637n {

    /* renamed from: a */
    public static final Class[] f249578a = {InterruptedException.class};

    /* renamed from: b */
    public static final Class[] f249579b = {UnknownHostException.class, IllegalArgumentException.class, MalformedURLException.class, IOException.class, FileNotFoundException.class, C89599a.class, C89601d.class, C89604g.class};

    /* renamed from: c */
    public static final Class[] f249580c = {SocketException.class, SocketTimeoutException.class};

    /* renamed from: a */
    public final void mo119170a(C85631f fVar, HttpURLConnection httpURLConnection) {
        Set<String> keySet;
        C85640q.C85641a aVar = (C85640q.C85641a) fVar;
        Log.m105919d("MicroMsg.ResDownloader.NetworkPerformer", "%s: add http headers", aVar.mo119192f());
        C85638o oVar = (C85638o) aVar.mo113638c();
        LinkedList<C85629c> linkedList = null;
        Map<String, String> unmodifiableMap = ((HashMap) oVar.f249587g).size() == 0 ? null : Collections.unmodifiableMap(oVar.f249587g);
        if (!(unmodifiableMap == null || unmodifiableMap.size() == 0 || (keySet = unmodifiableMap.keySet()) == null || keySet.size() == 0)) {
            linkedList = new LinkedList<>();
            for (String next : keySet) {
                String str = unmodifiableMap.get(next);
                if (!Util.isNullOrNil(str)) {
                    linkedList.add(new C85629c(next, str));
                }
            }
        }
        if (linkedList != null && linkedList.size() > 0) {
            for (C85629c cVar : linkedList) {
                httpURLConnection.addRequestProperty(cVar.f249571a, cVar.f249572b);
            }
        }
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setConnectTimeout(((C85638o) aVar.mo113638c()).f249588h);
        httpURLConnection.setReadTimeout(((C85638o) aVar.mo113638c()).f249589i);
        httpURLConnection.setUseCaches(false);
        if (aVar instanceof C81355t2.C81360e) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        String property = System.getProperty("http.agent");
        if (!Util.isNullOrNil(property)) {
            httpURLConnection.setRequestProperty("User-agent", property);
        }
        httpURLConnection.setInstanceFollowRedirects(true);
    }

    /* renamed from: b */
    public final void mo119171b(C85631f fVar, HttpsURLConnection httpsURLConnection) {
        SSLContext sSLContext;
        SSLContext sSLContext2;
        try {
            sSLContext = SSLContext.getInstance("TLSv1.2");
        } catch (Exception unused) {
            sSLContext = null;
        }
        if (sSLContext == null) {
            try {
                sSLContext2 = SSLContext.getInstance("TLSv1");
            } catch (Exception unused2) {
                sSLContext2 = null;
            }
            if (sSLContext == null) {
                try {
                    sSLContext = SSLContext.getDefault();
                } catch (Exception unused3) {
                }
            }
        }
        if (sSLContext != null) {
            try {
                sSLContext.init((KeyManager[]) null, (TrustManager[]) null, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                return;
            } catch (Exception unused4) {
            }
        }
        httpsURLConnection.setSSLSocketFactory(SSLCertificateSocketFactory.getDefault(((C85638o) ((C85640q.C85641a) fVar).mo113638c()).f249590j, new SSLSessionCache(MMApplicationContext.getContext())));
    }

    /* renamed from: c */
    public final boolean mo119172c(C85631f fVar, HttpURLConnection httpURLConnection) {
        C85640q.C85641a aVar = (C85640q.C85641a) fVar;
        long c = C48020a.m53386c(aVar.mo119191e());
        Log.m105925i("MicroMsg.ResDownloader.NetworkPerformer", "%s: RangeOffset = %d", aVar.mo119192f(), Long.valueOf(c));
        if (c == 0) {
            return false;
        }
        httpURLConnection.addRequestProperty("Range", "bytes=" + c + "-");
        return true;
    }

    /* renamed from: d */
    public final void mo119173d() {
        if (Thread.interrupted()) {
            throw new InterruptedException(Thread.currentThread().getName() + " has interrupted by someone!");
        }
    }

    /* renamed from: e */
    public final OutputStream mo119174e(String str, String str2, boolean z) {
        Log.m105919d("MicroMsg.ResDownloader.NetworkPerformer", "%s: getOutputStream, filePath %s", str2, str);
        if (!Util.isNullOrNil(str)) {
            return new BufferedOutputStream(C86013q1.m106429K(str, z));
        }
        throw new FileNotFoundException(String.format("%s filePath is null or nil", new Object[]{str2}));
    }

    /* renamed from: f */
    public final C85639p mo119175f(C85631f fVar, Exception exc) {
        if (exc instanceof ProtocolException) {
            C85640q.C85641a aVar = (C85640q.C85641a) fVar;
            Log.m105921e("MicroMsg.ResDownloader.NetworkPerformer", "%s: Protocol not support, the protocol: %s", aVar.mo119192f(), "GET");
            return mo119177h(aVar, exc);
        } else if (exc instanceof C12157b) {
            C85640q.C85641a aVar2 = (C85640q.C85641a) fVar;
            Log.m105921e("MicroMsg.ResDownloader.NetworkPerformer", "%s: %s [%s]", aVar2.mo119192f(), exc.getClass().getSimpleName(), exc.getMessage());
            C48020a.m53384a(aVar2.mo119191e());
            return null;
        } else {
            Class[] clsArr = f249578a;
            for (int i = 0; i < 1; i++) {
                if (clsArr[i].equals(exc.getClass())) {
                    C85640q.C85641a aVar3 = (C85640q.C85641a) fVar;
                    Log.m105925i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download canceled, caused by %s", aVar3.mo119192f(), exc);
                    return new C85639p((C85631f) aVar3, exc, -1, 4);
                }
            }
            Class[] clsArr2 = f249580c;
            for (int i2 = 0; i2 < 2; i2++) {
                if (clsArr2[i2].equals(exc.getClass())) {
                    return null;
                }
            }
            Class[] clsArr3 = f249579b;
            for (int i3 = 0; i3 < 8; i3++) {
                if (clsArr3[i3].equals(exc.getClass())) {
                    return mo119177h(fVar, exc);
                }
            }
            return mo119177h(fVar, exc);
        }
    }

    /* renamed from: g */
    public final boolean mo119176g(HttpURLConnection httpURLConnection) {
        if (ByteRange.BYTES_UNIT.equals(httpURLConnection.getHeaderField("Accept-Ranges"))) {
            return true;
        }
        String headerField = httpURLConnection.getHeaderField("Content-Range");
        return headerField != null && headerField.startsWith(ByteRange.BYTES_UNIT);
    }

    /* renamed from: h */
    public final C85639p mo119177h(C85631f fVar, Exception exc) {
        int i;
        if (exc instanceof C89603f) {
            C89603f fVar2 = (C89603f) exc;
            i = fVar2.f257792d;
            exc = fVar2.f257793e;
        } else {
            i = -1;
        }
        C85640q.C85641a aVar = (C85640q.C85641a) fVar;
        Log.m105925i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download failed, caused by %s", aVar.mo119192f(), exc);
        return new C85639p((C85631f) aVar, exc, i, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5 A[Catch:{ all -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A[SYNTHETIC, Splitter:B:70:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0126 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p mo119178i(com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f r14) {
        /*
            r13 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.ResDownloader.NetworkPerformer"
            if (r14 != 0) goto L_0x000b
            java.lang.String r14 = "get null task, just skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r14)
            return r0
        L_0x000b:
            r2 = r14
            com.tencent.mm.pluginsdk.res.downloader.model.q$a r2 = (com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q.C85641a) r2
            java.lang.String r3 = r2.mo119191e()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0028
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.String r2 = r2.mo119192f()
            r14[r4] = r2
            java.lang.String r2 = "%s: filePath is null or nil, just return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r14)
            return r0
        L_0x0028:
            r3 = r14
            com.tencent.mm.pluginsdk.res.downloader.model.q$a r3 = (com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q.C85641a) r3     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81360e     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r3 = r3 ^ r5
            if (r3 != 0) goto L_0x0037
            java.lang.String r3 = r2.mo119191e()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            rd3.C48020a.m53384a(r3)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
        L_0x0037:
            r13.mo119173d()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r3 = r14.mo113636a()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r6.<init>(r3)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.net.URLConnection r3 = r6.openConnection()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r7 = "%s: connection opened, url = %s"
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r10 = r2.mo119192f()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r9[r4] = r10     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r10 = r14.mo113636a()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r9[r5] = r10     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r9)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r13.mo119173d()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r13.mo119170a(r14, r3)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r13.mo119173d()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            boolean r7 = r13.mo119172c(r14, r3)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r9 = "%s: hasRangerHeader=%b"
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r11 = r2.mo119192f()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r10[r4] = r11     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r10[r5] = r11     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r10)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r13.mo119173d()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r9 = "https"
            java.lang.String r6 = r6.getProtocol()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            boolean r6 = r9.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            if (r6 == 0) goto L_0x0092
            r6 = r3
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r13.mo119171b(r14, r6)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        L_0x0092:
            r13.mo119173d()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r6 = "%s: HttpMethod = %s"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r9 = r2.mo119192f()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r8[r4] = r9     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.lang.String r9 = "GET"
            r8[r5] = r9     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            r13.mo119173d()     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            com.tencent.mm.pluginsdk.res.downloader.model.p r14 = r13.mo119179j(r14, r3, r7)     // Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x00b5 }
            r0.close()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bd
        L_0x00b5:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x00c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x00c0 }
        L_0x00bd:
            r3.disconnect()     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            return r14
        L_0x00c1:
            r14 = move-exception
            r0 = r3
            goto L_0x013e
        L_0x00c5:
            r6 = move-exception
            r12 = r6
            r6 = r3
            r3 = r12
            goto L_0x00cf
        L_0x00ca:
            r14 = move-exception
            goto L_0x013e
        L_0x00cd:
            r3 = move-exception
            r6 = r0
        L_0x00cf:
            com.tencent.mm.pluginsdk.res.downloader.model.p r7 = r13.mo119175f(r14, r3)     // Catch:{ all -> 0x013c }
            if (r7 != 0) goto L_0x0126
            java.lang.String r7 = "%s: get null response in catch-block, may retry"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x013c }
            java.lang.String r9 = r2.mo119192f()     // Catch:{ all -> 0x013c }
            r8[r4] = r9     // Catch:{ all -> 0x013c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r8)     // Catch:{ all -> 0x013c }
            boolean r7 = r14.retry()     // Catch:{ all -> 0x013c }
            if (r7 != 0) goto L_0x010f
            java.lang.String r0 = "%s: retry times out"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x013c }
            java.lang.String r2 = r2.mo119192f()     // Catch:{ all -> 0x013c }
            r5[r4] = r2     // Catch:{ all -> 0x013c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r5)     // Catch:{ all -> 0x013c }
            com.tencent.mm.pluginsdk.res.downloader.model.p r14 = r13.mo119177h(r14, r3)     // Catch:{ all -> 0x013c }
            if (r6 == 0) goto L_0x010e
            java.io.InputStream r0 = r6.getInputStream()     // Catch:{ Exception -> 0x0103 }
            r0.close()     // Catch:{ Exception -> 0x0103 }
            goto L_0x010b
        L_0x0103:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x010e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x010e }
        L_0x010b:
            r6.disconnect()     // Catch:{ Exception -> 0x010e }
        L_0x010e:
            return r14
        L_0x010f:
            if (r6 == 0) goto L_0x0028
            java.io.InputStream r3 = r6.getInputStream()     // Catch:{ Exception -> 0x0119 }
            r3.close()     // Catch:{ Exception -> 0x0119 }
            goto L_0x0121
        L_0x0119:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()     // Catch:{ Exception -> 0x0028 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ Exception -> 0x0028 }
        L_0x0121:
            r6.disconnect()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0028
        L_0x0126:
            if (r6 == 0) goto L_0x013b
            java.io.InputStream r14 = r6.getInputStream()     // Catch:{ Exception -> 0x0130 }
            r14.close()     // Catch:{ Exception -> 0x0130 }
            goto L_0x0138
        L_0x0130:
            r14 = move-exception
            java.lang.String r14 = r14.getMessage()     // Catch:{ Exception -> 0x013b }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)     // Catch:{ Exception -> 0x013b }
        L_0x0138:
            r6.disconnect()     // Catch:{ Exception -> 0x013b }
        L_0x013b:
            return r7
        L_0x013c:
            r14 = move-exception
            r0 = r6
        L_0x013e:
            if (r0 == 0) goto L_0x0153
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ Exception -> 0x0148 }
            r2.close()     // Catch:{ Exception -> 0x0148 }
            goto L_0x0150
        L_0x0148:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x0153 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ Exception -> 0x0153 }
        L_0x0150:
            r0.disconnect()     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.C85637n.mo119178i(com.tencent.mm.pluginsdk.res.downloader.model.f):com.tencent.mm.pluginsdk.res.downloader.model.p");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v65, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v64 */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02ae, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02b8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02bc, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02be, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02bf, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02c0, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02c1, code lost:
        r5 = r0;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02c5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x02c7, code lost:
        r3 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x02f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x02f2, code lost:
        r3 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x02f7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x02f9, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x031d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x031f, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0339, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x033b, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0340, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0342, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0347, code lost:
        r0 = th;
        r15 = r15;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        r5 = r0;
        r14 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x007b, B:190:0x029a] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x007b, B:35:0x00b7] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a2 A[Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02aa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02ae A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02b0 A[ExcHandler: SocketException (e java.net.SocketException), Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02b2 A[ExcHandler: SSLHandshakeException (e javax.net.ssl.SSLHandshakeException), Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02b5 A[ExcHandler: UnknownHostException (e java.net.UnknownHostException), Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02b8 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02c5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x02f0 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x02f7 A[Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5, all -> 0x0347 }, ExcHandler: SocketException (e java.net.SocketException), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x031d A[Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5, all -> 0x0347 }, ExcHandler: SSLHandshakeException (e javax.net.ssl.SSLHandshakeException), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0339 A[Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5, all -> 0x0347 }, ExcHandler: UnknownHostException (e java.net.UnknownHostException), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0340 A[Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5, all -> 0x0347 }, ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0178 A[EDGE_INSN: B:255:0x0178->B:99:0x0178 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0147 A[SYNTHETIC, Splitter:B:83:0x0147] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p mo119179j(com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f r23, java.net.HttpURLConnection r24, boolean r25) {
        /*
            r22 = this;
            r1 = r22
            java.lang.Class<fp.f> r2 = p523fp.C87030f.class
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = r23
            com.tencent.mm.pluginsdk.res.downloader.model.q$a r11 = (com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q.C85641a) r11
            java.lang.String r5 = r11.mo119192f()
            r12 = 0
            r4[r12] = r5
            java.lang.String r13 = "MicroMsg.ResDownloader.NetworkPerformer"
            java.lang.String r5 = "%s: step4, start to read response"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r4)
            r15 = 2
            int r10 = r24.getResponseCode()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02cd, all -> 0x02c5 }
            int r5 = r24.getContentLength()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.String r6 = r24.getContentEncoding()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.String r16 = r24.getContentType()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r7 = r24
            boolean r8 = r1.mo119176g(r7)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.String r9 = "%s: received status code = %d, content-length = %d, content-encoding = %s, content-type = %s, isSupportRange = %b, \nresponseHeaders = %s"
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.String r17 = r11.mo119192f()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02bb, all -> 0x02c5 }
            r4[r12] = r17     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r4[r3] = r17     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r4[r15] = r17     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r15 = 3
            r4[r15] = r6     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r18 = 4
            r4[r18] = r16     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r18 = 5
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r8)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r4[r18] = r19     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r18 = 6
            java.util.Map r19 = r24.getHeaderFields()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.String r19 = rd3.C12981b.m12427a(r19)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            r4[r18] = r19     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r4)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            java.lang.String r4 = r11.mo119191e()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            long r14 = rd3.C48020a.m53386c(r4)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02be, all -> 0x02c5 }
            if (r5 != 0) goto L_0x00a5
            r4 = 206(0xce, float:2.89E-43)
            if (r4 != r10) goto L_0x00a5
            r19 = 0
            int r4 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a5
            java.lang.String r4 = "%s: file exists, return"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x009f, all -> 0x02aa }
            java.lang.String r6 = r11.mo119192f()     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x009f, all -> 0x02aa }
            r5[r12] = r6     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x009f, all -> 0x02aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r5)     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x009f, all -> 0x02aa }
            com.tencent.mm.pluginsdk.res.downloader.model.p r4 = new com.tencent.mm.pluginsdk.res.downloader.model.p     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x009f, all -> 0x02aa }
            r7 = 2
            r5 = r4
            r6 = r11
            r8 = r14
            r14 = r10
            r10 = r16
            r5.<init>((com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f) r6, (int) r7, (long) r8, (java.lang.String) r10)     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x009d, all -> 0x02aa }
            di3.d r2 = di3.C86312j.m106911c(r2)
            fp.f r2 = (p523fp.C87030f) r2
            r3 = -1
            r2.ll0(r3, r12)
            return r4
        L_0x009d:
            r0 = move-exception
            goto L_0x00a1
        L_0x009f:
            r0 = move-exception
            r14 = r10
        L_0x00a1:
            r5 = r0
        L_0x00a2:
            r3 = -1
            goto L_0x02c3
        L_0x00a5:
            r4 = r10
            r10 = 301(0x12d, float:4.22E-43)
            if (r10 == r4) goto L_0x00ac
            r10 = 302(0x12e, float:4.23E-43)
        L_0x00ac:
            if (r5 == 0) goto L_0x02a3
            boolean r10 = r11.mo119190d()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5 }
            if (r10 != 0) goto L_0x00bd
            if (r5 < 0) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            java.net.SocketException r5 = new java.net.SocketException     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
            r5.<init>()     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
            throw r5     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
        L_0x00bd:
            if (r5 <= 0) goto L_0x00d1
            long r9 = (long) r5     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
            boolean r9 = r11.mo113637b(r9)     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
            if (r9 == 0) goto L_0x00c7
            goto L_0x00d1
        L_0x00c7:
            qd3.a r5 = new qd3.a     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
            r5.<init>()     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
            throw r5     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x00cd, all -> 0x02aa }
        L_0x00cd:
            r0 = move-exception
            r5 = r0
            r14 = r4
            goto L_0x00a2
        L_0x00d1:
            r9 = 416(0x1a0, float:5.83E-43)
            if (r9 == r4) goto L_0x0299
            java.io.InputStream r7 = r24.getInputStream()     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5 }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5 }
            r9.<init>(r7)     // Catch:{ InterruptedException -> 0x0340, UnknownHostException -> 0x0339, SSLHandshakeException -> 0x031d, SocketException -> 0x02f7, SocketTimeoutException -> 0x02f0, IOException -> 0x02a1, all -> 0x02c5 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ InterruptedException -> 0x0293, UnknownHostException -> 0x028d, SSLHandshakeException -> 0x0287, SocketException -> 0x0281, SocketTimeoutException -> 0x027b, IOException -> 0x0274, all -> 0x026e }
            if (r7 != 0) goto L_0x010c
            java.lang.String r7 = "gzip"
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ InterruptedException -> 0x0109, UnknownHostException -> 0x0106, SSLHandshakeException -> 0x0103, SocketException -> 0x0100, SocketTimeoutException -> 0x00fd, IOException -> 0x00f6, all -> 0x00f3 }
            if (r6 == 0) goto L_0x010c
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ InterruptedException -> 0x0109, UnknownHostException -> 0x0106, SSLHandshakeException -> 0x0103, SocketException -> 0x0100, SocketTimeoutException -> 0x00fd, IOException -> 0x00f6, all -> 0x00f3 }
            r6.<init>(r9)     // Catch:{ InterruptedException -> 0x0109, UnknownHostException -> 0x0106, SSLHandshakeException -> 0x0103, SocketException -> 0x0100, SocketTimeoutException -> 0x00fd, IOException -> 0x00f6, all -> 0x00f3 }
            r14 = r6
            goto L_0x010d
        L_0x00f3:
            r0 = move-exception
            goto L_0x0270
        L_0x00f6:
            r0 = move-exception
            r5 = r0
            r14 = r4
            r4 = r9
            r3 = -1
            goto L_0x02d2
        L_0x00fd:
            r0 = move-exception
            goto L_0x027d
        L_0x0100:
            r0 = move-exception
            goto L_0x0283
        L_0x0103:
            r0 = move-exception
            goto L_0x0289
        L_0x0106:
            r0 = move-exception
            goto L_0x028f
        L_0x0109:
            r0 = move-exception
            goto L_0x0295
        L_0x010c:
            r14 = r9
        L_0x010d:
            java.lang.String r6 = r11.mo119191e()     // Catch:{ InterruptedException -> 0x0268, UnknownHostException -> 0x0262, SSLHandshakeException -> 0x025c, SocketException -> 0x0256, SocketTimeoutException -> 0x0250, IOException -> 0x0244, all -> 0x023e }
            java.lang.String r7 = r11.mo119192f()     // Catch:{ InterruptedException -> 0x0268, UnknownHostException -> 0x0262, SSLHandshakeException -> 0x025c, SocketException -> 0x0256, SocketTimeoutException -> 0x0250, IOException -> 0x0244, all -> 0x023e }
            if (r25 == 0) goto L_0x011b
            if (r8 == 0) goto L_0x011b
            r9 = 1
            goto L_0x011c
        L_0x011b:
            r9 = 0
        L_0x011c:
            java.io.OutputStream r15 = r1.mo119174e(r6, r7, r9)     // Catch:{ InterruptedException -> 0x0268, UnknownHostException -> 0x0262, SSLHandshakeException -> 0x025c, SocketException -> 0x0256, SocketTimeoutException -> 0x0250, IOException -> 0x0244, all -> 0x023e }
            java.lang.String r6 = "%s: append = %b, isSupportRange = %s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            java.lang.String r9 = r11.mo119192f()     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            r7[r12] = r9     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r25)     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            r7[r3] = r9     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            r9 = 2
            r7[r9] = r8     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r6, r7)     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            r6 = 16384(0x4000, float:2.2959E-41)
            byte[] r7 = new byte[r6]     // Catch:{ InterruptedException -> 0x0237, UnknownHostException -> 0x0230, SSLHandshakeException -> 0x0229, SocketException -> 0x0222, SocketTimeoutException -> 0x021b, IOException -> 0x0216, all -> 0x020f }
            r10 = 0
        L_0x0140:
            int r8 = r14.read(r7, r12, r6)     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r9 = -1
            if (r8 == r9) goto L_0x0178
            r15.write(r7, r12, r8)     // Catch:{ InterruptedException -> 0x0172, UnknownHostException -> 0x016c, SSLHandshakeException -> 0x0166, SocketException -> 0x0160, SocketTimeoutException -> 0x015a, IOException -> 0x0155, all -> 0x014f }
            int r10 = r10 + r8
            r22.mo119173d()     // Catch:{ InterruptedException -> 0x0172, UnknownHostException -> 0x016c, SSLHandshakeException -> 0x0166, SocketException -> 0x0160, SocketTimeoutException -> 0x015a, IOException -> 0x0155, all -> 0x014f }
            goto L_0x0140
        L_0x014f:
            r0 = move-exception
            r3 = r0
            r4 = r14
            r14 = r10
            goto L_0x0349
        L_0x0155:
            r0 = move-exception
            r5 = r0
            r3 = r10
            goto L_0x0249
        L_0x015a:
            r0 = move-exception
            r3 = r0
            r4 = r14
            r14 = r10
            goto L_0x02f6
        L_0x0160:
            r0 = move-exception
            r3 = r0
            r4 = r14
            r14 = r10
            goto L_0x02fd
        L_0x0166:
            r0 = move-exception
            r3 = r0
            r4 = r14
            r14 = r10
            goto L_0x0323
        L_0x016c:
            r0 = move-exception
            r3 = r0
            r4 = r14
            r14 = r10
            goto L_0x033f
        L_0x0172:
            r0 = move-exception
            r3 = r0
            r4 = r14
            r14 = r10
            goto L_0x0346
        L_0x0178:
            java.lang.String r6 = "%s: read count = %d"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            java.lang.String r7 = r11.mo119192f()     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r8[r12] = r7     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r8[r3] = r7     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r6, r8)     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r15.flush()     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            java.lang.String r6 = "%s: download complete, flush and send complete status"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            java.lang.String r8 = r11.mo119192f()     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r7[r12] = r8     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r6, r7)     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            boolean r6 = r11.mo119190d()     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            if (r6 == 0) goto L_0x01c6
            com.tencent.mm.pluginsdk.res.downloader.model.p r18 = new com.tencent.mm.pluginsdk.res.downloader.model.p     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r7 = 2
            java.lang.String r5 = r11.mo119191e()     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            long r8 = rd3.C48020a.m53386c(r5)     // Catch:{ InterruptedException -> 0x0208, UnknownHostException -> 0x0201, SSLHandshakeException -> 0x01fa, SocketException -> 0x01f3, SocketTimeoutException -> 0x01ec, IOException -> 0x01e7, all -> 0x01e2 }
            r5 = r18
            r6 = r11
            r3 = r10
            r10 = r16
            r5.<init>((com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f) r6, (int) r7, (long) r8, (java.lang.String) r10)     // Catch:{ InterruptedException -> 0x01e0, UnknownHostException -> 0x01de, SSLHandshakeException -> 0x01dc, SocketException -> 0x01da, SocketTimeoutException -> 0x01d8, IOException -> 0x01d6, all -> 0x01d4 }
        L_0x01b6:
            rd3.C48020a.m53388e(r14)
            rd3.C48020a.m53388e(r15)
            di3.d r2 = di3.C86312j.m106911c(r2)
            fp.f r2 = (p523fp.C87030f) r2
            r2.ll0(r3, r12)
            return r18
        L_0x01c6:
            r3 = r10
            com.tencent.mm.pluginsdk.res.downloader.model.p r18 = new com.tencent.mm.pluginsdk.res.downloader.model.p     // Catch:{ InterruptedException -> 0x01e0, UnknownHostException -> 0x01de, SSLHandshakeException -> 0x01dc, SocketException -> 0x01da, SocketTimeoutException -> 0x01d8, IOException -> 0x01d6, all -> 0x01d4 }
            r7 = 2
            long r8 = (long) r5     // Catch:{ InterruptedException -> 0x01e0, UnknownHostException -> 0x01de, SSLHandshakeException -> 0x01dc, SocketException -> 0x01da, SocketTimeoutException -> 0x01d8, IOException -> 0x01d6, all -> 0x01d4 }
            r5 = r18
            r6 = r11
            r10 = r16
            r5.<init>((com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f) r6, (int) r7, (long) r8, (java.lang.String) r10)     // Catch:{ InterruptedException -> 0x01e0, UnknownHostException -> 0x01de, SSLHandshakeException -> 0x01dc, SocketException -> 0x01da, SocketTimeoutException -> 0x01d8, IOException -> 0x01d6, all -> 0x01d4 }
            goto L_0x01b6
        L_0x01d4:
            r0 = move-exception
            goto L_0x01e4
        L_0x01d6:
            r0 = move-exception
            goto L_0x01e9
        L_0x01d8:
            r0 = move-exception
            goto L_0x01ee
        L_0x01da:
            r0 = move-exception
            goto L_0x01f5
        L_0x01dc:
            r0 = move-exception
            goto L_0x01fc
        L_0x01de:
            r0 = move-exception
            goto L_0x0203
        L_0x01e0:
            r0 = move-exception
            goto L_0x020a
        L_0x01e2:
            r0 = move-exception
            r3 = r10
        L_0x01e4:
            r4 = r14
            goto L_0x02ee
        L_0x01e7:
            r0 = move-exception
            r3 = r10
        L_0x01e9:
            r5 = r0
            goto L_0x0249
        L_0x01ec:
            r0 = move-exception
            r3 = r10
        L_0x01ee:
            r4 = r14
            r14 = r3
            r3 = r0
            goto L_0x02f6
        L_0x01f3:
            r0 = move-exception
            r3 = r10
        L_0x01f5:
            r4 = r14
            r14 = r3
            r3 = r0
            goto L_0x02fd
        L_0x01fa:
            r0 = move-exception
            r3 = r10
        L_0x01fc:
            r4 = r14
            r14 = r3
            r3 = r0
            goto L_0x0323
        L_0x0201:
            r0 = move-exception
            r3 = r10
        L_0x0203:
            r4 = r14
            r14 = r3
            r3 = r0
            goto L_0x033f
        L_0x0208:
            r0 = move-exception
            r3 = r10
        L_0x020a:
            r4 = r14
            r14 = r3
            r3 = r0
            goto L_0x0346
        L_0x020f:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            r14 = -1
            goto L_0x0349
        L_0x0216:
            r0 = move-exception
            r9 = -1
            r5 = r0
            r3 = -1
            goto L_0x0249
        L_0x021b:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            r14 = -1
            goto L_0x02f6
        L_0x0222:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            r14 = -1
            goto L_0x02fd
        L_0x0229:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            r14 = -1
            goto L_0x0323
        L_0x0230:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            r14 = -1
            goto L_0x033f
        L_0x0237:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            r14 = -1
            goto L_0x0346
        L_0x023e:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            goto L_0x02c9
        L_0x0244:
            r0 = move-exception
            r9 = -1
            r5 = r0
            r3 = -1
            r15 = 0
        L_0x0249:
            r21 = r14
            r14 = r4
            r4 = r21
            goto L_0x02d3
        L_0x0250:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            goto L_0x02f4
        L_0x0256:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            goto L_0x02fb
        L_0x025c:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            goto L_0x0321
        L_0x0262:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            goto L_0x033d
        L_0x0268:
            r0 = move-exception
            r9 = -1
            r3 = r0
            r4 = r14
            goto L_0x0344
        L_0x026e:
            r0 = move-exception
            r3 = -1
        L_0x0270:
            r3 = r0
            r4 = r9
            goto L_0x02c9
        L_0x0274:
            r0 = move-exception
            r3 = -1
            r5 = r0
            r14 = r4
            r4 = r9
            goto L_0x02d2
        L_0x027b:
            r0 = move-exception
            r3 = -1
        L_0x027d:
            r3 = r0
            r4 = r9
            goto L_0x02f4
        L_0x0281:
            r0 = move-exception
            r3 = -1
        L_0x0283:
            r3 = r0
            r4 = r9
            goto L_0x02fb
        L_0x0287:
            r0 = move-exception
            r3 = -1
        L_0x0289:
            r3 = r0
            r4 = r9
            goto L_0x0321
        L_0x028d:
            r0 = move-exception
            r3 = -1
        L_0x028f:
            r3 = r0
            r4 = r9
            goto L_0x033d
        L_0x0293:
            r0 = move-exception
            r3 = -1
        L_0x0295:
            r3 = r0
            r4 = r9
            goto L_0x0344
        L_0x0299:
            r3 = -1
            qd3.b r6 = new qd3.b     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
            long r7 = (long) r5     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
            r6.<init>(r7, r14)     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
            throw r6     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
        L_0x02a1:
            r0 = move-exception
            goto L_0x02c0
        L_0x02a3:
            r3 = -1
            qd3.g r5 = new qd3.g     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
            r5.<init>()     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
            throw r5     // Catch:{ InterruptedException -> 0x02b8, UnknownHostException -> 0x02b5, SSLHandshakeException -> 0x02b2, SocketException -> 0x02b0, SocketTimeoutException -> 0x02ae, IOException -> 0x02ac, all -> 0x02aa }
        L_0x02aa:
            r0 = move-exception
            goto L_0x02c7
        L_0x02ac:
            r0 = move-exception
            goto L_0x02c1
        L_0x02ae:
            r0 = move-exception
            goto L_0x02f2
        L_0x02b0:
            r0 = move-exception
            goto L_0x02f9
        L_0x02b2:
            r0 = move-exception
            goto L_0x031f
        L_0x02b5:
            r0 = move-exception
            goto L_0x033b
        L_0x02b8:
            r0 = move-exception
            goto L_0x0342
        L_0x02bb:
            r0 = move-exception
            r4 = r10
            goto L_0x02c0
        L_0x02be:
            r0 = move-exception
            r4 = r10
        L_0x02c0:
            r3 = -1
        L_0x02c1:
            r5 = r0
            r14 = r4
        L_0x02c3:
            r4 = 0
            goto L_0x02d2
        L_0x02c5:
            r0 = move-exception
            r3 = -1
        L_0x02c7:
            r3 = r0
            r4 = 0
        L_0x02c9:
            r14 = -1
            r15 = 0
            goto L_0x0349
        L_0x02cd:
            r0 = move-exception
            r3 = -1
            r5 = r0
            r4 = 0
            r14 = -1
        L_0x02d2:
            r15 = 0
        L_0x02d3:
            rd3.C48020a.m53388e(r4)     // Catch:{ all -> 0x02ed }
            java.lang.String r6 = "%s: HttpUrlConnection getInputStream failed! %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x02ed }
            java.lang.String r8 = r11.mo119192f()     // Catch:{ all -> 0x02ed }
            r7[r12] = r8     // Catch:{ all -> 0x02ed }
            r8 = 1
            r7[r8] = r5     // Catch:{ all -> 0x02ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r6, r7)     // Catch:{ all -> 0x02ed }
            qd3.f r6 = new qd3.f     // Catch:{ all -> 0x02ed }
            r6.<init>(r14, r5)     // Catch:{ all -> 0x02ed }
            throw r6     // Catch:{ all -> 0x02ed }
        L_0x02ed:
            r0 = move-exception
        L_0x02ee:
            r14 = r3
            goto L_0x0348
        L_0x02f0:
            r0 = move-exception
            r3 = -1
        L_0x02f2:
            r3 = r0
            r4 = 0
        L_0x02f4:
            r14 = -1
            r15 = 0
        L_0x02f6:
            throw r3     // Catch:{ all -> 0x0347 }
        L_0x02f7:
            r0 = move-exception
            r3 = -1
        L_0x02f9:
            r3 = r0
            r4 = 0
        L_0x02fb:
            r14 = -1
            r15 = 0
        L_0x02fd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0347 }
            r5.<init>()     // Catch:{ all -> 0x0347 }
            java.lang.String r6 = r11.mo119192f()     // Catch:{ all -> 0x0347 }
            r5.append(r6)     // Catch:{ all -> 0x0347 }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ all -> 0x0347 }
            java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x0347 }
            r5.append(r6)     // Catch:{ all -> 0x0347 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0347 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r5)     // Catch:{ all -> 0x0347 }
            throw r3     // Catch:{ all -> 0x0347 }
        L_0x031d:
            r0 = move-exception
            r3 = -1
        L_0x031f:
            r3 = r0
            r4 = 0
        L_0x0321:
            r14 = -1
            r15 = 0
        L_0x0323:
            java.lang.String r5 = "%s: HttpUrlConnection SSLHandshakeException!"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0347 }
            java.lang.String r7 = r11.mo119192f()     // Catch:{ all -> 0x0347 }
            r6[r12] = r7     // Catch:{ all -> 0x0347 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r5, r6)     // Catch:{ all -> 0x0347 }
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x0347 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r3, r5, r6)     // Catch:{ all -> 0x0347 }
            throw r3     // Catch:{ all -> 0x0347 }
        L_0x0339:
            r0 = move-exception
            r3 = -1
        L_0x033b:
            r3 = r0
            r4 = 0
        L_0x033d:
            r14 = -1
            r15 = 0
        L_0x033f:
            throw r3     // Catch:{ all -> 0x0347 }
        L_0x0340:
            r0 = move-exception
            r3 = -1
        L_0x0342:
            r3 = r0
            r4 = 0
        L_0x0344:
            r14 = -1
            r15 = 0
        L_0x0346:
            throw r3     // Catch:{ all -> 0x0347 }
        L_0x0347:
            r0 = move-exception
        L_0x0348:
            r3 = r0
        L_0x0349:
            rd3.C48020a.m53388e(r4)
            rd3.C48020a.m53388e(r15)
            di3.d r2 = di3.C86312j.m106911c(r2)
            fp.f r2 = (p523fp.C87030f) r2
            r2.ll0(r14, r12)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.C85637n.mo119179j(com.tencent.mm.pluginsdk.res.downloader.model.f, java.net.HttpURLConnection, boolean):com.tencent.mm.pluginsdk.res.downloader.model.p");
    }
}
