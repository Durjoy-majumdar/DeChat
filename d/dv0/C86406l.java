package dv0;

/* renamed from: dv0.l */
public class C86406l {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090 A[SYNTHETIC, Splitter:B:25:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[SYNTHETIC, Splitter:B:29:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m107073a(byte[] r5, int r6, short r7, com.tencent.p014mm.pointers.PByteArray r8, int r9) {
        /*
            r0 = 0
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0084 }
            r2.<init>()     // Catch:{ IOException -> 0x0084 }
            java.lang.String r1 = "GSMW"
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r6 = p823sg.C90196p.m112888e(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r6 = 2
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r1[r0] = r0     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r3 = 1
            r1[r3] = r3     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            int r4 = r7 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r1[r0] = r4     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r4 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r1[r3] = r4     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            if (r7 == r3) goto L_0x003e
            if (r7 != r6) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            byte[] r6 = yu0.C102910f.f303739h     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r5 = p823sg.C90194m.m112882c(r5, r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
        L_0x003e:
            int r6 = r5.length     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            int r6 = r6 + 20
            byte[] r6 = p823sg.C90196p.m112888e(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r6 = p823sg.C90196p.m112888e(r0)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r2.write(r5)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r5 = r2.toByteArray()     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r8.value = r5     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            if (r9 != r3) goto L_0x0075
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r5.<init>()     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r6 = r8.value     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r5.update(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            long r5 = r5.getValue()     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            int r6 = (int) r5     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r5 = p823sg.C90196p.m112888e(r6)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            byte[] r6 = r8.value     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            r7 = 16
            r8 = 4
            java.lang.System.arraycopy(r5, r0, r6, r7, r8)     // Catch:{ IOException -> 0x007f, all -> 0x007c }
        L_0x0075:
            r2.reset()     // Catch:{ IOException -> 0x0096 }
            r2.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x0096
        L_0x007c:
            r5 = move-exception
            r1 = r2
            goto L_0x0097
        L_0x007f:
            r5 = move-exception
            r1 = r2
            goto L_0x0085
        L_0x0082:
            r5 = move-exception
            goto L_0x0097
        L_0x0084:
            r5 = move-exception
        L_0x0085:
            java.lang.String r6 = "MicroMsg.BackupPacker"
            java.lang.String r7 = "BackupPacker pack err."
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x0082 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r5, r7, r8)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0096
            r1.reset()     // Catch:{ IOException -> 0x0096 }
            r1.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            return
        L_0x0097:
            if (r1 == 0) goto L_0x009f
            r1.reset()     // Catch:{ IOException -> 0x009f }
            r1.close()     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.C86406l.m107073a(byte[], int, short, com.tencent.mm.pointers.PByteArray, int):void");
    }
}
