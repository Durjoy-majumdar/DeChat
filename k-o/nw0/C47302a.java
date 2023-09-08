package nw0;

import java.io.Serializable;

/* renamed from: nw0.a */
public abstract class C47302a implements Serializable {

    /* renamed from: g */
    public static final String f126956g = C47302a.class.getName();

    /* renamed from: d */
    public long f126957d;

    /* renamed from: e */
    public String f126958e;

    /* renamed from: f */
    public int f126959f;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC, Splitter:B:27:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a A[SYNTHETIC, Splitter:B:40:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d1 A[SYNTHETIC, Splitter:B:53:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fc A[SYNTHETIC, Splitter:B:71:0x00fc] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0042=Splitter:B:24:0x0042, B:50:0x00b2=Splitter:B:50:0x00b2, B:37:0x007b=Splitter:B:37:0x007b} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static nw0.C47302a m52606b(byte[] r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0111
            int r1 = r9.length
            if (r1 > 0) goto L_0x0008
            goto L_0x0111
        L_0x0008:
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.exdevice.Util"
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ StreamCorruptedException -> 0x00af, IOException -> 0x0078, ClassNotFoundException -> 0x003f, all -> 0x003c }
            r4.<init>(r3)     // Catch:{ StreamCorruptedException -> 0x00af, IOException -> 0x0078, ClassNotFoundException -> 0x003f, all -> 0x003c }
            java.lang.Object r5 = r4.readObject()     // Catch:{ StreamCorruptedException -> 0x0039, IOException -> 0x0037, ClassNotFoundException -> 0x0035 }
            r4.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0025
        L_0x001f:
            r4 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r1, r6)
        L_0x0025:
            r3.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x00e6
        L_0x002a:
            r3 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r1, r9)
            goto L_0x00e6
        L_0x0032:
            r0 = move-exception
            goto L_0x00f7
        L_0x0035:
            r5 = move-exception
            goto L_0x0042
        L_0x0037:
            r5 = move-exception
            goto L_0x007b
        L_0x0039:
            r5 = move-exception
            goto L_0x00b2
        L_0x003c:
            r4 = move-exception
            goto L_0x00fa
        L_0x003f:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x0042:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r6.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "bytes2object ClassNotFoundException:"
            r6.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r5.getMessage()     // Catch:{ all -> 0x0032 }
            r6.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0032 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0032 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r1, r6)     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x006b
            r4.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x006b
        L_0x0065:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r1, r5)
        L_0x006b:
            r3.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x00e5
        L_0x0070:
            r3 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r1, r9)
            goto L_0x00e5
        L_0x0078:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x007b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r6.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "bytes2object IOException:"
            r6.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r5.getMessage()     // Catch:{ all -> 0x0032 }
            r6.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0032 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0032 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r1, r6)     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x00a4
            r4.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x00a4
        L_0x009e:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r1, r5)
        L_0x00a4:
            r3.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00e5
        L_0x00a8:
            r3 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r1, r9)
            goto L_0x00e5
        L_0x00af:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r6.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "bytes2object StreamCorruptedException:"
            r6.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r5.getMessage()     // Catch:{ all -> 0x0032 }
            r6.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0032 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0032 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r1, r6)     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x00db
            r4.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00db
        L_0x00d5:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r1, r5)
        L_0x00db:
            r3.close()     // Catch:{ IOException -> 0x00df }
            goto L_0x00e5
        L_0x00df:
            r3 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r1, r9)
        L_0x00e5:
            r5 = r0
        L_0x00e6:
            if (r5 == 0) goto L_0x00ef
            boolean r9 = r5 instanceof nw0.C47302a
            if (r9 == 0) goto L_0x00ef
            nw0.a r5 = (nw0.C47302a) r5
            return r5
        L_0x00ef:
            java.lang.String r9 = f126956g
            java.lang.String r1 = "bytes2object is not instanceof BaseProfileParser"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r1)
            return r0
        L_0x00f7:
            r8 = r4
            r4 = r0
            r0 = r8
        L_0x00fa:
            if (r0 == 0) goto L_0x0106
            r0.close()     // Catch:{ IOException -> 0x0100 }
            goto L_0x0106
        L_0x0100:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r1, r5)
        L_0x0106:
            r3.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x0110
        L_0x010a:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r1, r9)
        L_0x0110:
            throw r4
        L_0x0111:
            java.lang.String r9 = f126956g
            java.lang.String r1 = "data input error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nw0.C47302a.m52606b(byte[]):nw0.a");
    }

    /* renamed from: a */
    public abstract byte[] mo33979a();

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[SYNTHETIC, Splitter:B:25:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c A[SYNTHETIC, Splitter:B:35:0x007c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo72344c() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.exdevice.Util"
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0042 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0042 }
            r5.writeObject(r10)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r5.flush()     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            byte[] r2 = r3.toByteArray()     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            if (r2 != 0) goto L_0x0021
            java.lang.String r6 = "object2bytes result is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
        L_0x0021:
            r5.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x002b
        L_0x0025:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0079
        L_0x002f:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r0, r4)
            goto L_0x0079
        L_0x0036:
            r2 = move-exception
            goto L_0x007a
        L_0x0038:
            r6 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
            goto L_0x0045
        L_0x003d:
            r5 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
            goto L_0x007a
        L_0x0042:
            r5 = move-exception
            r6 = r5
            r5 = r2
        L_0x0045:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r7.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r8 = "object2bytes IOException:"
            r7.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r8 = r6.getMessage()     // Catch:{ all -> 0x003d }
            r7.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x003d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x003d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r0, r7)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            r2 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r6)
        L_0x006e:
            r3.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0078
        L_0x0072:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0078:
            r2 = r5
        L_0x0079:
            return r2
        L_0x007a:
            if (r5 == 0) goto L_0x0086
            r5.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r6)
        L_0x0086:
            r3.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0090
        L_0x008a:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r0, r4)
        L_0x0090:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nw0.C47302a.mo72344c():byte[]");
    }
}
