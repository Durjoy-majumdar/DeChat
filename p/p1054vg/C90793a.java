package p1054vg;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: vg.a */
public class C90793a {

    /* renamed from: a */
    public C90794a f260723a;

    /* renamed from: b */
    public C90795b f260724b;

    /* renamed from: vg.a$a */
    public static class C90794a {

        /* renamed from: b */
        public static final long f260725b = ((long) -1600969123);

        /* renamed from: a */
        public int f260726a;

        public C90794a(int i) {
            this.f260726a = i;
        }

        /* renamed from: a */
        public static C90794a m113863a(byte[] bArr) {
            if (bArr.length == 8) {
                long j = 0;
                for (int i = 0; i < bArr.length; i++) {
                    j |= ((long) (bArr[i] & ExifInterface.MARKER)) << (i * 8);
                }
                if ((j >> 32) == f260725b) {
                    return new C90794a((int) j);
                }
            }
            return null;
        }
    }

    public C90793a(C90795b bVar) {
        this.f260724b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|(8:17|18|19|20|21|22|23|24)|40|41|42) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:26|27|(0)|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0072 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC, Splitter:B:31:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f A[SYNTHETIC, Splitter:B:38:0x006f] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x0072=Splitter:B:40:0x0072, B:33:0x006a=Splitter:B:33:0x006a} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113860a(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0010
            return r0
        L_0x0010:
            vg.a r2 = m113861b(r7)
            r3 = 1
            if (r2 == 0) goto L_0x0078
            vg.b r4 = r2.f260724b
            if (r4 == 0) goto L_0x0078
            r4 = 2
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0077 }
            r4[r0] = r0     // Catch:{ Exception -> 0x0077 }
            r4[r3] = r0     // Catch:{ Exception -> 0x0077 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0077 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0077 }
            boolean r7 = r3.exists()     // Catch:{ Exception -> 0x0077 }
            if (r7 == 0) goto L_0x0077
            vg.b r7 = r2.f260724b     // Catch:{ Exception -> 0x0077 }
            java.lang.String r7 = r7.f260727d     // Catch:{ Exception -> 0x0077 }
            long r5 = r1.length()     // Catch:{ Exception -> 0x0077 }
            vg.a$a r1 = r2.f260723a     // Catch:{ Exception -> 0x0077 }
            int r1 = r1.f260726a     // Catch:{ Exception -> 0x0077 }
            int r1 = r1 + 8
            long r1 = (long) r1     // Catch:{ Exception -> 0x0077 }
            long r5 = r5 - r1
            r1 = 2
            long r5 = r5 - r1
            int r1 = (int) r5     // Catch:{ Exception -> 0x0077 }
            r2 = 0
            boolean r5 = r3.exists()     // Catch:{ Exception -> 0x0077 }
            if (r5 == 0) goto L_0x0072
            if (r1 > 0) goto L_0x004b
            goto L_0x0072
        L_0x004b:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            r3 = 102400(0x19000, float:1.43493E-40)
            java.lang.String r1 = p1054vg.C90801g.m113875c(r5, r3, r0, r1, r4)     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            r5.close()     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            r2 = r1
            goto L_0x0072
        L_0x005f:
            r7 = move-exception
            r2 = r5
            goto L_0x0065
        L_0x0062:
            goto L_0x006d
        L_0x0064:
            r7 = move-exception
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r7     // Catch:{ Exception -> 0x0077 }
        L_0x006b:
            r5 = r2
        L_0x006d:
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            boolean r7 = r7.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x0077 }
            return r7
        L_0x0077:
            return r0
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1054vg.C90793a.m113860a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public static C90793a m113861b(String str) {
        C90794a a;
        int i = 0;
        if (str != null) {
            try {
                File file = new File(str);
                if (file.exists()) {
                    i = (int) file.length();
                }
            } catch (Exception unused) {
            }
        }
        if (i >= 8 && (a = C90794a.m113863a(m113862c(str, i - 8, 8))) != null && a.f260726a >= 0) {
            C90795b bVar = new C90795b();
            int i2 = a.f260726a;
            bVar.parseFrom(m113862c(str, (i - i2) - 8, i2));
            C90793a aVar = new C90793a(bVar);
            aVar.f260723a = a;
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public static byte[] m113862c(String str, int i, int i2) {
        byte[] bArr = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        if (i2 == -1) {
            i2 = (int) file.length();
        }
        if (i < 0 || i2 <= 0) {
            return null;
        }
        if (i + i2 > ((int) file.length())) {
            i2 = ((int) file.length()) - i;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            bArr = new byte[i2];
            randomAccessFile.seek((long) i);
            randomAccessFile.readFully(bArr);
            randomAccessFile.close();
            return bArr;
        } catch (Exception unused) {
            return bArr;
        }
    }
}
