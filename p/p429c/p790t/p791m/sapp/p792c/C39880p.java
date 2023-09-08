package p429c.p790t.p791m.sapp.p792c;

import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: c.t.m.sapp.c.p */
public class C39880p {

    /* renamed from: a */
    public static int f106940a = 20000;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|(1:30)|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        f106940a = 20000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r7 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r7.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r1 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m42653a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 20000(0x4e20, float:2.8026E-41)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            r2.<init>(r7)     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            java.net.URLConnection r7 = r2.openConnection()     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            int r2 = f106940a     // Catch:{ IOException -> 0x0071 }
            r7.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0071 }
            int r2 = f106940a     // Catch:{ IOException -> 0x0071 }
            r7.setReadTimeout(r2)     // Catch:{ IOException -> 0x0071 }
            r2 = 1
            r7.setDoInput(r2)     // Catch:{ IOException -> 0x0071 }
            r7.setDoOutput(r2)     // Catch:{ IOException -> 0x0071 }
            java.lang.String r2 = "POST"
            r7.setRequestMethod(r2)     // Catch:{ IOException -> 0x0071 }
            r2 = 0
            r7.setUseCaches(r2)     // Catch:{ IOException -> 0x0071 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0071 }
            java.lang.String r3 = "Content-Length"
            int r4 = r8.length     // Catch:{ IOException -> 0x0071 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x0071 }
            r7.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0071 }
            java.io.OutputStream r3 = r7.getOutputStream()     // Catch:{ IOException -> 0x0071 }
            r3.write(r8)     // Catch:{ IOException -> 0x0071 }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x0071 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 != r3) goto L_0x0068
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ IOException -> 0x0071 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0071 }
            r3.<init>()     // Catch:{ IOException -> 0x0071 }
            r4 = 128(0x80, float:1.794E-43)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0071 }
        L_0x0055:
            int r5 = r8.read(r4)     // Catch:{ IOException -> 0x0071 }
            r6 = -1
            if (r5 == r6) goto L_0x0060
            r3.write(r4, r2, r5)     // Catch:{ IOException -> 0x0071 }
            goto L_0x0055
        L_0x0060:
            byte[] r8 = r3.toByteArray()     // Catch:{ IOException -> 0x0071 }
            r7.disconnect()
            return r8
        L_0x0068:
            r7.disconnect()
            f106940a = r0
            return r1
        L_0x006e:
            r7 = move-exception
            goto L_0x007c
        L_0x0070:
            r7 = r1
        L_0x0071:
            f106940a = r0     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x0078
            r7.disconnect()
        L_0x0078:
            return r1
        L_0x0079:
            r8 = move-exception
            r1 = r7
            r7 = r8
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.disconnect()
        L_0x0081:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C39880p.m42653a(java.lang.String, byte[]):byte[]");
    }

    /* renamed from: a */
    public static byte[] m42652a(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.connect();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openConnection.getInputStream().read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
