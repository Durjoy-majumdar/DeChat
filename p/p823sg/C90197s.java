package p823sg;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: sg.s */
public class C90197s {
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[SYNTHETIC, Splitter:B:28:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077 A[SYNTHETIC, Splitter:B:35:0x0077] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m112889a(byte[] r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.Zlib"
            java.util.zip.Deflater r2 = new java.util.zip.Deflater
            r2.<init>()
            r2.reset()
            r2.setInput(r8)
            r2.finish()
            r3 = 0
            r4 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x005c, OutOfMemoryError -> 0x0044 }
            int r6 = r8.length     // Catch:{ Exception -> 0x005c, OutOfMemoryError -> 0x0044 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x005c, OutOfMemoryError -> 0x0044 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x003e }
        L_0x001e:
            boolean r6 = r2.finished()     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x003e }
            if (r6 != 0) goto L_0x002c
            int r6 = r2.deflate(r4)     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x003e }
            r5.write(r4, r3, r6)     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x003e }
            goto L_0x001e
        L_0x002c:
            byte[] r8 = r5.toByteArray()     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x003e }
            r5.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0071
        L_0x0034:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r0, r3)
            goto L_0x0071
        L_0x003b:
            r8 = move-exception
            r4 = r5
            goto L_0x0075
        L_0x003e:
            r4 = r5
            goto L_0x0044
        L_0x0040:
            r4 = move-exception
            goto L_0x0060
        L_0x0042:
            r8 = move-exception
            goto L_0x0075
        L_0x0044:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r5.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "crash upload data length:"
            r5.append(r6)     // Catch:{ all -> 0x0042 }
            int r8 = r8.length     // Catch:{ all -> 0x0042 }
            r5.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0042 }
            r2.<init>(r8)     // Catch:{ all -> 0x0042 }
            throw r2     // Catch:{ all -> 0x0042 }
        L_0x005c:
            r5 = move-exception
            r7 = r5
            r5 = r4
            r4 = r7
        L_0x0060:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x003b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r0, r6)     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0071
            r5.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r0, r3)
        L_0x0071:
            r2.end()
            return r8
        L_0x0075:
            if (r4 == 0) goto L_0x0081
            r4.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x0081
        L_0x007b:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0081:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p823sg.C90197s.m112889a(byte[]):byte[]");
    }

    @Deprecated
    /* renamed from: b */
    public static byte[] m112890b(byte[] bArr) {
        try {
            return m112891c(bArr);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Zlib", e, "decompress failed", new Object[0]);
            return bArr;
        }
    }

    /* renamed from: c */
    public static byte[] m112891c(byte[] bArr) {
        Exception exc;
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Zlib", e, "", new Object[0]);
            }
            exc = null;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Zlib", e2, "exception when loop read byte", new Object[0]);
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.printErrStackTrace("MicroMsg.Zlib", e3, "", new Object[0]);
            }
            exc = e2;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                Log.printErrStackTrace("MicroMsg.Zlib", e4, "", new Object[0]);
            }
            throw th;
        }
        inflater.end();
        if (exc == null) {
            return bArr;
        }
        throw new Exception(exc);
    }
}
