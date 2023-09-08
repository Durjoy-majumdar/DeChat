package ea3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;

/* renamed from: ea3.d */
public class C45587d {

    /* renamed from: ea3.d$a */
    public static class C7609a {

        /* renamed from: a */
        public int f25879a;

        /* renamed from: b */
        public Map<String, String> f25880b = new HashMap();

        /* renamed from: c */
        public String f25881c = "";

        /* renamed from: d */
        public byte[] f25882d = null;
    }

    /* renamed from: a */
    public static boolean m50632a(C7609a aVar) {
        String lowerCase = ((String) ((HashMap) aVar.f25880b).get("Content-Type")).toLowerCase();
        return lowerCase.startsWith("image/") || lowerCase.startsWith("video/") || lowerCase.startsWith("audio/");
    }

    /* renamed from: b */
    public static void m50633b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.printInfoStack("MicroMsg.RequestUtil", "", e);
            } catch (Exception e2) {
                Log.printInfoStack("MicroMsg.RequestUtil", "", e2);
            }
        }
    }

    /* renamed from: c */
    public static byte[] m50634c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 16384);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    Util.qualityClose(inputStream);
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RequestUtil", "convertStreamToBytes: " + e);
                Util.qualityClose(inputStream);
                return null;
            } catch (Throwable th) {
                Util.qualityClose(inputStream);
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static String m50635d(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 512);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    m50633b(inputStreamReader);
                    m50633b(bufferedReader);
                    return sb.toString();
                }
            } catch (IOException e) {
                Log.printInfoStack("MicroMsg.RequestUtil", "", e);
                m50633b(inputStreamReader);
                m50633b(bufferedReader);
                return null;
            } catch (Exception e2) {
                Log.printInfoStack("MicroMsg.RequestUtil", "", e2);
                m50633b(inputStreamReader);
                m50633b(bufferedReader);
                return null;
            } catch (Throwable th) {
                m50633b(inputStreamReader);
                m50633b(bufferedReader);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f2 A[SYNTHETIC, Splitter:B:70:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0107 A[SYNTHETIC, Splitter:B:78:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011c A[SYNTHETIC, Splitter:B:86:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0134 A[SYNTHETIC, Splitter:B:95:0x0134] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:83:0x0113=Splitter:B:83:0x0113, B:67:0x00e9=Splitter:B:67:0x00e9, B:75:0x00fe=Splitter:B:75:0x00fe} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ea3.C45587d.C7609a m50636e(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            java.lang.String r10 = ""
            java.lang.String r0 = "MicroMsg.RequestUtil"
            r1 = 1
            r2 = 0
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0111, IOException -> 0x00fc, Exception -> 0x00e7, all -> 0x00e5 }
            r4.<init>(r8)     // Catch:{ MalformedURLException -> 0x0111, IOException -> 0x00fc, Exception -> 0x00e7, all -> 0x00e5 }
            java.net.URLConnection r8 = r4.openConnection()     // Catch:{ MalformedURLException -> 0x0111, IOException -> 0x00fc, Exception -> 0x00e7, all -> 0x00e5 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ MalformedURLException -> 0x0111, IOException -> 0x00fc, Exception -> 0x00e7, all -> 0x00e5 }
            if (r8 != 0) goto L_0x002a
            if (r8 == 0) goto L_0x0029
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x001e }
            r9.close()     // Catch:{ Exception -> 0x001e }
            goto L_0x0026
        L_0x001e:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x0026:
            r8.disconnect()
        L_0x0029:
            return r3
        L_0x002a:
            r4 = 30000(0x7530, float:4.2039E-41)
            r8.setConnectTimeout(r4)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r8.setReadTimeout(r4)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.lang.String r4 = "GET"
            r8.setRequestMethod(r4)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r8.setUseCaches(r2)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            if (r9 == 0) goto L_0x0060
            int r4 = r9.size()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            if (r4 <= 0) goto L_0x0060
            java.util.Set r4 = r9.keySet()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
        L_0x004a:
            boolean r5 = r4.hasNext()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r4.next()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.lang.Object r6 = r9.get(r5)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r8.setRequestProperty(r5, r6)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            goto L_0x004a
        L_0x0060:
            ea3.d$a r9 = new ea3.d$a     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r9.<init>()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            int r4 = r8.getResponseCode()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r9.f25879a = r4     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r4 = 0
        L_0x006c:
            java.lang.String r5 = r8.getHeaderFieldKey(r4)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.lang.String r6 = r8.getHeaderField(r4)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            if (r5 != 0) goto L_0x00d5
            if (r6 != 0) goto L_0x00d5
            boolean r4 = m50632a(r9)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            int r5 = r9.f25879a     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00c1
            java.io.InputStream r5 = r8.getInputStream()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.lang.String r6 = r8.getContentEncoding()     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.io.InputStream r5 = m50639h(r6, r5)     // Catch:{ IOException -> 0x00a9, all -> 0x00a3 }
            if (r4 == 0) goto L_0x0097
            byte[] r4 = m50634c(r5)     // Catch:{ IOException -> 0x00aa, all -> 0x00a1 }
            r9.f25882d = r4     // Catch:{ IOException -> 0x00aa, all -> 0x00a1 }
            goto L_0x009d
        L_0x0097:
            java.lang.String r4 = m50635d(r5)     // Catch:{ IOException -> 0x00aa, all -> 0x00a1 }
            r9.f25881c = r4     // Catch:{ IOException -> 0x00aa, all -> 0x00a1 }
        L_0x009d:
            m50633b(r5)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            goto L_0x00c1
        L_0x00a1:
            r9 = move-exception
            goto L_0x00a5
        L_0x00a3:
            r9 = move-exception
            r5 = r3
        L_0x00a5:
            m50633b(r5)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            throw r9     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
        L_0x00a9:
            r5 = r3
        L_0x00aa:
            m50633b(r5)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x00b5 }
            r9.close()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bd
        L_0x00b5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x00bd:
            r8.disconnect()
            return r3
        L_0x00c1:
            java.io.InputStream r10 = r8.getInputStream()     // Catch:{ Exception -> 0x00c9 }
            r10.close()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d1
        L_0x00c9:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r10)
        L_0x00d1:
            r8.disconnect()
            return r9
        L_0x00d5:
            java.util.Map<java.lang.String, java.lang.String> r7 = r9.f25880b     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            r7.put(r5, r6)     // Catch:{ MalformedURLException -> 0x00e3, IOException -> 0x00e1, Exception -> 0x00df }
            int r4 = r4 + 1
            goto L_0x006c
        L_0x00df:
            r9 = move-exception
            goto L_0x00e9
        L_0x00e1:
            r9 = move-exception
            goto L_0x00fe
        L_0x00e3:
            r9 = move-exception
            goto L_0x0113
        L_0x00e5:
            r9 = move-exception
            goto L_0x0132
        L_0x00e7:
            r9 = move-exception
            r8 = r3
        L_0x00e9:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0130 }
            r1[r2] = r9     // Catch:{ all -> 0x0130 }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r10, r1)     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x012f
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x00fa }
            r9.close()     // Catch:{ Exception -> 0x00fa }
            goto L_0x012c
        L_0x00fa:
            r9 = move-exception
            goto L_0x0125
        L_0x00fc:
            r9 = move-exception
            r8 = r3
        L_0x00fe:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0130 }
            r1[r2] = r9     // Catch:{ all -> 0x0130 }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r10, r1)     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x012f
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x010f }
            r9.close()     // Catch:{ Exception -> 0x010f }
            goto L_0x012c
        L_0x010f:
            r9 = move-exception
            goto L_0x0125
        L_0x0111:
            r9 = move-exception
            r8 = r3
        L_0x0113:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0130 }
            r1[r2] = r9     // Catch:{ all -> 0x0130 }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r10, r1)     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x012f
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x0124 }
            r9.close()     // Catch:{ Exception -> 0x0124 }
            goto L_0x012c
        L_0x0124:
            r9 = move-exception
        L_0x0125:
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x012c:
            r8.disconnect()
        L_0x012f:
            return r3
        L_0x0130:
            r9 = move-exception
            r3 = r8
        L_0x0132:
            if (r3 == 0) goto L_0x0147
            java.io.InputStream r8 = r3.getInputStream()     // Catch:{ Exception -> 0x013c }
            r8.close()     // Catch:{ Exception -> 0x013c }
            goto L_0x0144
        L_0x013c:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
        L_0x0144:
            r3.disconnect()
        L_0x0147:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.C45587d.m50636e(java.lang.String, java.util.Map, java.lang.String):ea3.d$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0159 A[SYNTHETIC, Splitter:B:101:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fa A[SYNTHETIC, Splitter:B:67:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0119 A[SYNTHETIC, Splitter:B:78:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0138 A[SYNTHETIC, Splitter:B:89:0x0138] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0110=Splitter:B:75:0x0110, B:64:0x00f1=Splitter:B:64:0x00f1, B:86:0x012f=Splitter:B:86:0x012f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:93:0x0148=Splitter:B:93:0x0148, B:82:0x0129=Splitter:B:82:0x0129, B:71:0x010a=Splitter:B:71:0x010a} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ea3.C45587d.C7609a m50637f(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.RequestUtil"
            r2 = 0
            r3 = 0
            r4 = 1
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x012d, IOException -> 0x010e, Exception -> 0x00ef, all -> 0x00ec }
            r5.<init>(r8)     // Catch:{ MalformedURLException -> 0x012d, IOException -> 0x010e, Exception -> 0x00ef, all -> 0x00ec }
            java.net.URLConnection r8 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x012d, IOException -> 0x010e, Exception -> 0x00ef, all -> 0x00ec }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ MalformedURLException -> 0x012d, IOException -> 0x010e, Exception -> 0x00ef, all -> 0x00ec }
            r5 = 30000(0x7530, float:4.2039E-41)
            r8.setConnectTimeout(r5)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r8.setReadTimeout(r5)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.lang.String r5 = "POST"
            r8.setRequestMethod(r5)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r8.setDoOutput(r4)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r8.setDoInput(r4)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r8.setUseCaches(r3)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            if (r9 == 0) goto L_0x004e
            int r5 = r9.size()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            if (r5 <= 0) goto L_0x004e
            java.util.Set r5 = r9.keySet()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
        L_0x0038:
            boolean r6 = r5.hasNext()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            if (r6 == 0) goto L_0x004e
            java.lang.Object r6 = r5.next()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r8.setRequestProperty(r6, r7)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            goto L_0x0038
        L_0x004e:
            byte[] r9 = r10.getBytes()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r8.connect()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.io.DataOutputStream r10 = new java.io.DataOutputStream     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.io.OutputStream r5 = r8.getOutputStream()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r10.<init>(r5)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r10.write(r9)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r10.flush()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            ea3.d$a r9 = new ea3.d$a     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r9.<init>()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            int r10 = r8.getResponseCode()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r9.f25879a = r10     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r10 != r5) goto L_0x00b2
            java.io.InputStream r10 = r8.getInputStream()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.lang.String r5 = r8.getContentEncoding()     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.io.InputStream r10 = m50639h(r5, r10)     // Catch:{ IOException -> 0x0091, all -> 0x008b }
            java.lang.String r5 = m50635d(r10)     // Catch:{ IOException -> 0x0092, all -> 0x0089 }
            r9.f25881c = r5     // Catch:{ IOException -> 0x0092, all -> 0x0089 }
            m50633b(r10)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            goto L_0x00b2
        L_0x0089:
            r9 = move-exception
            goto L_0x008d
        L_0x008b:
            r9 = move-exception
            r10 = r2
        L_0x008d:
            m50633b(r10)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            throw r9     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
        L_0x0091:
            r10 = r2
        L_0x0092:
            m50633b(r10)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x009d }
            r9.close()     // Catch:{ Exception -> 0x009d }
            goto L_0x00a5
        L_0x009d:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x00a5:
            r8.disconnect()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x00b1:
            return r2
        L_0x00b2:
            r10 = 0
        L_0x00b3:
            java.lang.String r5 = r8.getHeaderFieldKey(r10)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.lang.String r6 = r8.getHeaderField(r10)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            if (r5 != 0) goto L_0x00dc
            if (r6 != 0) goto L_0x00dc
            java.io.InputStream r10 = r8.getInputStream()     // Catch:{ Exception -> 0x00c7 }
            r10.close()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00cf
        L_0x00c7:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
        L_0x00cf:
            r8.disconnect()     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00db
        L_0x00d3:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x00db:
            return r9
        L_0x00dc:
            java.util.Map<java.lang.String, java.lang.String> r7 = r9.f25880b     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            r7.put(r5, r6)     // Catch:{ MalformedURLException -> 0x00ea, IOException -> 0x00e8, Exception -> 0x00e6 }
            int r10 = r10 + 1
            goto L_0x00b3
        L_0x00e6:
            r9 = move-exception
            goto L_0x00f1
        L_0x00e8:
            r9 = move-exception
            goto L_0x0110
        L_0x00ea:
            r9 = move-exception
            goto L_0x012f
        L_0x00ec:
            r9 = move-exception
            goto L_0x0157
        L_0x00ef:
            r9 = move-exception
            r8 = r2
        L_0x00f1:
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0155 }
            r10[r3] = r9     // Catch:{ all -> 0x0155 }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r1, r0, r10)     // Catch:{ all -> 0x0155 }
            if (r8 == 0) goto L_0x0154
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x0102 }
            r9.close()     // Catch:{ Exception -> 0x0102 }
            goto L_0x010a
        L_0x0102:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x010a:
            r8.disconnect()     // Catch:{ Exception -> 0x014c }
            goto L_0x0154
        L_0x010e:
            r9 = move-exception
            r8 = r2
        L_0x0110:
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0155 }
            r10[r3] = r9     // Catch:{ all -> 0x0155 }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r1, r0, r10)     // Catch:{ all -> 0x0155 }
            if (r8 == 0) goto L_0x0154
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x0121 }
            r9.close()     // Catch:{ Exception -> 0x0121 }
            goto L_0x0129
        L_0x0121:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x0129:
            r8.disconnect()     // Catch:{ Exception -> 0x014c }
            goto L_0x0154
        L_0x012d:
            r9 = move-exception
            r8 = r2
        L_0x012f:
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0155 }
            r10[r3] = r9     // Catch:{ all -> 0x0155 }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r1, r0, r10)     // Catch:{ all -> 0x0155 }
            if (r8 == 0) goto L_0x0154
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x0140 }
            r9.close()     // Catch:{ Exception -> 0x0140 }
            goto L_0x0148
        L_0x0140:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x0148:
            r8.disconnect()     // Catch:{ Exception -> 0x014c }
            goto L_0x0154
        L_0x014c:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x0154:
            return r2
        L_0x0155:
            r9 = move-exception
            r2 = r8
        L_0x0157:
            if (r2 == 0) goto L_0x0175
            java.io.InputStream r8 = r2.getInputStream()     // Catch:{ Exception -> 0x0161 }
            r8.close()     // Catch:{ Exception -> 0x0161 }
            goto L_0x0169
        L_0x0161:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x0169:
            r2.disconnect()     // Catch:{ Exception -> 0x016d }
            goto L_0x0175
        L_0x016d:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x0175:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.C45587d.m50637f(java.lang.String, java.util.Map, java.lang.String):ea3.d$a");
    }

    /* renamed from: g */
    public static void m50638g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof Map)) {
                Map map2 = (Map) value;
                m50638g(map2);
                map.put(key, new JSONObject(map2));
            }
        }
    }

    /* renamed from: h */
    public static InputStream m50639h(String str, InputStream inputStream) {
        if (str == null || "identity".equalsIgnoreCase(str)) {
            return inputStream;
        }
        if ("gzip".equalsIgnoreCase(str)) {
            return new GZIPInputStream(inputStream);
        }
        if ("deflate".equalsIgnoreCase(str)) {
            return new InflaterInputStream(inputStream, new Inflater(false), 512);
        }
        throw new RuntimeException("unsupported content-encoding: " + str);
    }
}
