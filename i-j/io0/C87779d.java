package io0;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p823sg.C90193h;

/* renamed from: io0.d */
public class C87779d {

    /* renamed from: a */
    public static ConcurrentMap<String, Boolean> f254140a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map<String, List<C87780a>> f254141b = new HashMap();

    /* renamed from: c */
    public static final String f254142c;

    /* renamed from: io0.d$a */
    public interface C87780a {
        /* renamed from: a */
        void mo122230a(String str);
    }

    static {
        String C = C112760b.m154195C();
        if (!C.endsWith("/")) {
            C = C + "/";
        }
        String str = C + "wxacache/";
        f254142c = str;
        FilePathGenerator.checkMkdir(str);
    }

    /* renamed from: a */
    public static void m109214a(String str, C86009m1 m1Var) {
        BufferedInputStream bufferedInputStream;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        Exception e;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                inputStream = httpURLConnection.getInputStream();
                outputStream = C86013q1.m106426H(m1Var);
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
                bufferedInputStream = null;
                e = e;
                try {
                    m1Var.mo119966f();
                    Log.printErrStackTrace("MicroMsg.AppBrandLiveFileLoadHelper", e, "download file url %s ", str);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (Exception e3) {
                        e = e3;
                    }
                    Util.qualityClose(outputStream);
                    Util.qualityClose(bufferedInputStream);
                    httpURLConnection.disconnect();
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    try {
                        httpURLConnection2.getInputStream().close();
                    } catch (Exception e4) {
                        Log.m105920e("MicroMsg.AppBrandLiveFileLoadHelper", e4.getMessage());
                    }
                    Util.qualityClose(outputStream);
                    Util.qualityClose(bufferedInputStream);
                    httpURLConnection2.disconnect();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
                bufferedInputStream = null;
                httpURLConnection2 = httpURLConnection;
                httpURLConnection2.getInputStream().close();
                Util.qualityClose(outputStream);
                Util.qualityClose(bufferedInputStream);
                httpURLConnection2.disconnect();
                throw th;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    m1Var.mo119966f();
                    Log.printErrStackTrace("MicroMsg.AppBrandLiveFileLoadHelper", e, "download file url %s ", str);
                    httpURLConnection.getInputStream().close();
                    Util.qualityClose(outputStream);
                    Util.qualityClose(bufferedInputStream);
                    httpURLConnection.disconnect();
                }
            } catch (Exception e7) {
                e = e7;
                bufferedInputStream = null;
                e = e;
                m1Var.mo119966f();
                Log.printErrStackTrace("MicroMsg.AppBrandLiveFileLoadHelper", e, "download file url %s ", str);
                httpURLConnection.getInputStream().close();
                Util.qualityClose(outputStream);
                Util.qualityClose(bufferedInputStream);
                httpURLConnection.disconnect();
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
                httpURLConnection2 = httpURLConnection;
                httpURLConnection2.getInputStream().close();
                Util.qualityClose(outputStream);
                Util.qualityClose(bufferedInputStream);
                httpURLConnection2.disconnect();
                throw th;
            }
        } catch (Exception e8) {
            outputStream = null;
            bufferedInputStream = null;
            e = e8;
            httpURLConnection = null;
            m1Var.mo119966f();
            Log.printErrStackTrace("MicroMsg.AppBrandLiveFileLoadHelper", e, "download file url %s ", str);
            httpURLConnection.getInputStream().close();
            Util.qualityClose(outputStream);
            Util.qualityClose(bufferedInputStream);
            httpURLConnection.disconnect();
        } catch (Throwable th6) {
            th = th6;
            outputStream = null;
            bufferedInputStream = null;
            httpURLConnection2.getInputStream().close();
            Util.qualityClose(outputStream);
            Util.qualityClose(bufferedInputStream);
            httpURLConnection2.disconnect();
            throw th;
        }
        Util.qualityClose(outputStream);
        Util.qualityClose(bufferedInputStream);
        httpURLConnection.disconnect();
        Log.m105920e("MicroMsg.AppBrandLiveFileLoadHelper", e.getMessage());
        Util.qualityClose(outputStream);
        Util.qualityClose(bufferedInputStream);
        httpURLConnection.disconnect();
    }

    /* renamed from: b */
    public static AppBrandRuntime m109215b(C82381f fVar) {
        if (fVar == null) {
            Log.m105924i("MicroMsg.AppBrandLiveFileLoadHelper", "getRuntime, component is null");
            return null;
        } else if (!(fVar instanceof C82554k)) {
            Log.m105924i("MicroMsg.AppBrandLiveFileLoadHelper", "getRuntime, can not get runtime from component");
            return null;
        } else {
            AppBrandRuntime runtime = ((C82554k) fVar).getRuntime();
            if (runtime == null) {
                Log.m105924i("MicroMsg.AppBrandLiveFileLoadHelper", "getRuntime, runtime is null");
            }
            return runtime;
        }
    }

    /* renamed from: c */
    public static boolean m109216c(String str, InputStream inputStream) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid target nil, no check");
            return true;
        }
        String b = C90193h.m112874b(inputStream, 4096);
        Log.m105925i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid file:%s target:%s", b, str);
        return str.equals(b);
    }

    /* renamed from: d */
    public static boolean m109217d(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid target nil, no check");
            return true;
        }
        String d = C90193h.m112876d(str2);
        Log.m105925i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid file:%s target:%s", d, str);
        return str.equals(d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.util.zip.ZipInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0268, code lost:
        if (r5 != null) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0145, code lost:
        if (r5 != null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015e, code lost:
        if (r5 != null) goto L_0x0160;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0169  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m109218e(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r8, java.lang.String r9, boolean r10, java.lang.String r11, io0.C87779d.C87780a r12) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r12 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = "wxfile://"
            boolean r0 = r9.startsWith(r0)
            java.lang.String r1 = "MicroMsg.AppBrandLiveFileLoadHelper"
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00bf
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r9
            java.lang.String r5 = "handleWxfile, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r0)
            if (r8 != 0) goto L_0x002a
            java.lang.String r8 = "handleWxfile, component is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            goto L_0x00b8
        L_0x002a:
            if (r10 == 0) goto L_0x008e
            io0.h r10 = io0.C33371h.f90436a
            com.tencent.mm.vfs.m1 r0 = r10.mo59110a(r8, r9)
            if (r0 != 0) goto L_0x0036
            goto L_0x00b6
        L_0x0036:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r5 = r8.getFileSystem()     // Catch:{ all -> 0x0087 }
            java.io.InputStream r5 = r5.readStream(r9)     // Catch:{ all -> 0x0087 }
            if (r5 != 0) goto L_0x0041
            goto L_0x0062
        L_0x0041:
            boolean r11 = m109216c(r11, r5)     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x004d
            java.lang.String r8 = "handleWxfileZip, md5 is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ all -> 0x0084 }
            goto L_0x0062
        L_0x004d:
            io0.f r11 = io0.C33370f.f90435a     // Catch:{ all -> 0x0084 }
            boolean r11 = r11.mo59107a(r0)     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x0079
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)     // Catch:{ all -> 0x0084 }
            com.tencent.mm.plugin.appbrand.appstorage.h0 r8 = r8.getFileSystem()     // Catch:{ all -> 0x0084 }
            java.io.InputStream r5 = r8.readStream(r9)     // Catch:{ all -> 0x0084 }
            if (r5 != 0) goto L_0x0066
        L_0x0062:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            goto L_0x00b6
        L_0x0066:
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0084 }
            r8.<init>(r5)     // Catch:{ all -> 0x0084 }
            com.tencent.mm.vfs.m1 r9 = r10.mo59111b(r8, r0)     // Catch:{ all -> 0x0077 }
            if (r9 != 0) goto L_0x0075
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
            goto L_0x00b6
        L_0x0075:
            r5 = r8
            goto L_0x0079
        L_0x0077:
            r9 = move-exception
            goto L_0x008a
        L_0x0079:
            java.lang.String r8 = r0.mo119971i()     // Catch:{ all -> 0x0084 }
            r12.mo122230a(r8)     // Catch:{ all -> 0x0084 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            goto L_0x00b7
        L_0x0084:
            r8 = move-exception
            r3 = r5
            goto L_0x0088
        L_0x0087:
            r8 = move-exception
        L_0x0088:
            r9 = r8
            r8 = r3
        L_0x008a:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
            throw r9
        L_0x008e:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r8 = r8.getFileSystem()
            com.tencent.mm.vfs.m1 r8 = r8.getAbsoluteFile(r9)
            if (r8 != 0) goto L_0x0099
            goto L_0x00b6
        L_0x0099:
            boolean r9 = r8.mo119967g()
            if (r9 == 0) goto L_0x00b6
            java.lang.String r8 = r8.mo119971i()
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r4] = r8
            java.lang.String r10 = "handleWxfile, localPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r9)
            boolean r9 = m109217d(r11, r8)
            if (r9 == 0) goto L_0x00b6
            r12.mo122230a(r8)
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            r4 = r2
        L_0x00b8:
            if (r4 != 0) goto L_0x02b3
            r12.mo122230a(r3)
            goto L_0x02b3
        L_0x00bf:
            java.lang.String r0 = "http://"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x0298
            java.lang.String r0 = "https://"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x00d1
            goto L_0x0298
        L_0x00d1:
            if (r10 == 0) goto L_0x016d
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r4] = r9
            java.lang.String r0 = "handlePackageZip, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r10)
            io0.h r10 = io0.C33371h.f90436a
            com.tencent.mm.vfs.m1 r0 = r10.mo59110a(r8, r9)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0287
        L_0x00e6:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = m109215b(r8)
            if (r8 != 0) goto L_0x00f3
            java.lang.String r8 = "handlePackageZip, runtime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            goto L_0x0287
        L_0x00f3:
            java.io.InputStream r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99557m(r8, r9)
            if (r5 == 0) goto L_0x0140
            int r6 = r5.available()     // Catch:{ Exception -> 0x0148 }
            if (r6 > 0) goto L_0x0100
            goto L_0x0140
        L_0x0100:
            boolean r11 = m109216c(r11, r5)     // Catch:{ Exception -> 0x0148 }
            if (r11 != 0) goto L_0x010c
            java.lang.String r8 = "handlePackageZip, md5 is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ Exception -> 0x0148 }
            goto L_0x0160
        L_0x010c:
            io0.f r11 = io0.C33370f.f90435a     // Catch:{ Exception -> 0x0148 }
            boolean r11 = r11.mo59107a(r0)     // Catch:{ Exception -> 0x0148 }
            if (r11 != 0) goto L_0x0132
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)     // Catch:{ Exception -> 0x0148 }
            java.io.InputStream r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99557m(r8, r9)     // Catch:{ Exception -> 0x0148 }
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0148 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0148 }
            com.tencent.mm.vfs.m1 r9 = r10.mo59111b(r8, r0)     // Catch:{ Exception -> 0x012f, all -> 0x012d }
            if (r9 != 0) goto L_0x012b
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
            goto L_0x0287
        L_0x012b:
            r5 = r8
            goto L_0x0132
        L_0x012d:
            r9 = move-exception
            goto L_0x0167
        L_0x012f:
            r9 = move-exception
            r5 = r8
            goto L_0x014a
        L_0x0132:
            java.lang.String r8 = r0.mo119971i()     // Catch:{ Exception -> 0x0148 }
            r12.mo122230a(r8)     // Catch:{ Exception -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            goto L_0x0292
        L_0x013e:
            r8 = move-exception
            goto L_0x0165
        L_0x0140:
            java.lang.String r8 = "handlePackageZip, stream is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ Exception -> 0x0148 }
            if (r5 == 0) goto L_0x0287
            goto L_0x0160
        L_0x0148:
            r8 = move-exception
            r9 = r8
        L_0x014a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r8.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r10 = "handlePackageZip, fail since "
            r8.append(r10)     // Catch:{ all -> 0x013e }
            r8.append(r9)     // Catch:{ all -> 0x013e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)     // Catch:{ all -> 0x013e }
            if (r5 == 0) goto L_0x0287
        L_0x0160:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            goto L_0x0287
        L_0x0165:
            r9 = r8
            r8 = r5
        L_0x0167:
            if (r8 == 0) goto L_0x016c
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
        L_0x016c:
            throw r9
        L_0x016d:
            java.lang.String r10 = "bitmap recycle %s"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r9
            java.lang.String r5 = "handlePackageImage, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = m109215b(r8)
            if (r8 != 0) goto L_0x0185
            java.lang.String r8 = "handlePackageImage, runtime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            goto L_0x0287
        L_0x0185:
            java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99874h(r9)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x0196
            java.lang.String r8 = "handlePackageImage, url is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            goto L_0x0287
        L_0x0196:
            java.lang.String r0 = m109219f(r9)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = f254142c
            r5[r4] = r6
            r5[r2] = r0
            java.lang.String r0 = "%s%s"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r0
            java.lang.String r6 = "handlePackageImage, localPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r6 = r5.getPath()
            if (r6 == 0) goto L_0x01d6
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r4, r4)
            java.lang.String r7 = r5.getPath()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x01d6
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
        L_0x01d6:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r3)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x01e4
            r5 = 0
            goto L_0x01ec
        L_0x01e4:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r6.mo119948x(r5)
        L_0x01ec:
            if (r5 != 0) goto L_0x028f
            java.io.InputStream r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99557m(r8, r9)
            if (r5 == 0) goto L_0x0263
            int r6 = r5.available()     // Catch:{ Exception -> 0x026d }
            if (r6 > 0) goto L_0x01fb
            goto L_0x0263
        L_0x01fb:
            boolean r11 = m109216c(r11, r5)     // Catch:{ Exception -> 0x026d }
            if (r11 != 0) goto L_0x0208
            java.lang.String r8 = "handlePackageImage, md5 is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ Exception -> 0x026d }
            goto L_0x0284
        L_0x0208:
            android.graphics.Bitmap r8 = com.tencent.p014mm.plugin.appbrand.page.C83762b1.m102898b(r8, r9)     // Catch:{ Exception -> 0x026d }
            if (r8 == 0) goto L_0x025d
            boolean r9 = r8.isRecycled()     // Catch:{ Exception -> 0x026d }
            if (r9 != 0) goto L_0x025d
            r9 = 100
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0231 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r8, r9, r11, r0, r2)     // Catch:{ IOException -> 0x0231 }
            boolean r9 = r8.isRecycled()     // Catch:{ Exception -> 0x026d }
            if (r9 != 0) goto L_0x022b
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x026d }
            r9[r4] = r8     // Catch:{ Exception -> 0x026d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r9)     // Catch:{ Exception -> 0x026d }
            r8.recycle()     // Catch:{ Exception -> 0x026d }
        L_0x022b:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            goto L_0x028f
        L_0x022f:
            r9 = move-exception
            goto L_0x024c
        L_0x0231:
            r9 = move-exception
            java.lang.String r11 = "handlePackageImage, fail to compress bitmap to file"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x022f }
            r0[r4] = r9     // Catch:{ all -> 0x022f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r11, r0)     // Catch:{ all -> 0x022f }
            boolean r9 = r8.isRecycled()     // Catch:{ Exception -> 0x026d }
            if (r9 != 0) goto L_0x0284
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x026d }
            r9[r4] = r8     // Catch:{ Exception -> 0x026d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r9)     // Catch:{ Exception -> 0x026d }
            r8.recycle()     // Catch:{ Exception -> 0x026d }
            goto L_0x0284
        L_0x024c:
            boolean r11 = r8.isRecycled()     // Catch:{ Exception -> 0x026d }
            if (r11 != 0) goto L_0x025c
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x026d }
            r11[r4] = r8     // Catch:{ Exception -> 0x026d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r11)     // Catch:{ Exception -> 0x026d }
            r8.recycle()     // Catch:{ Exception -> 0x026d }
        L_0x025c:
            throw r9     // Catch:{ Exception -> 0x026d }
        L_0x025d:
            java.lang.String r8 = "handlePackageImage, no bitmap in the given url"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)     // Catch:{ Exception -> 0x026d }
            goto L_0x0284
        L_0x0263:
            java.lang.String r8 = "handlePackageImage, stream is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ Exception -> 0x026d }
            if (r5 == 0) goto L_0x0287
            goto L_0x0284
        L_0x026b:
            r8 = move-exception
            goto L_0x0289
        L_0x026d:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x026b }
            r9.<init>()     // Catch:{ all -> 0x026b }
            java.lang.String r10 = "handlePackageImage, fail since "
            r9.append(r10)     // Catch:{ all -> 0x026b }
            r9.append(r8)     // Catch:{ all -> 0x026b }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x026b }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)     // Catch:{ all -> 0x026b }
            if (r5 == 0) goto L_0x0287
        L_0x0284:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
        L_0x0287:
            r2 = 0
            goto L_0x0292
        L_0x0289:
            if (r5 == 0) goto L_0x028e
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
        L_0x028e:
            throw r8
        L_0x028f:
            r12.mo122230a(r0)
        L_0x0292:
            if (r2 != 0) goto L_0x02b3
            r12.mo122230a(r3)
            goto L_0x02b3
        L_0x0298:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r9
            java.lang.String r2 = "handleNetworkFile, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            io0.a r0 = new io0.a
            r0.<init>(r9, r12)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            io0.b r12 = new io0.b
            r12.<init>(r10, r8, r9, r11)
            java.lang.String r8 = "AppBrandLiveFileLoadHelperThread"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r12, r8)
        L_0x02b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io0.C87779d.m109218e(com.tencent.mm.plugin.appbrand.jsapi.f, java.lang.String, boolean, java.lang.String, io0.d$a):void");
    }

    /* renamed from: f */
    public static String m109219f(String str) {
        if (!Util.isNullOrNil(str)) {
            return C90193h.m112878f(str.getBytes());
        }
        return null;
    }
}
