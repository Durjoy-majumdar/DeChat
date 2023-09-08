package p429c.p790t.p791m.sapp.p792c;

import java.io.File;
import java.io.FileOutputStream;

/* renamed from: c.t.m.sapp.c.s */
public class C79911s {

    /* renamed from: a */
    public String f234108a = "WriterAndReader";

    /* renamed from: b */
    public File f234109b = null;

    public C79911s(String str) {
        this.f234109b = new File(str);
    }

    /* renamed from: a */
    public boolean mo110073a(byte[] bArr, boolean z) {
        FileOutputStream fileOutputStream = null;
        try {
            if (!this.f234109b.exists()) {
                File file = new File(this.f234109b.getParent());
                if (!file.exists()) {
                    file.mkdirs();
                    this.f234109b.createNewFile();
                }
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.f234109b, z);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileOutputStream.close();
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream.close();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:4|5|6|7|(2:8|(1:10)(1:45))|11|12|13|14|15|16) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:18|19|33|34|35|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:21|20|(4:29|30|31|32)|39|40|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        r6 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v3 java.io.FileInputStream) = (r1v0 java.io.FileInputStream), (r1v2 java.io.FileInputStream), (r1v2 java.io.FileInputStream), (r1v2 java.io.FileInputStream), (r1v2 java.io.FileInputStream) binds: [B:1:0x0006, B:29:0x004b, B:31:0x004e, B:32:?, B:30:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:29:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo110072a(java.lang.String r6) {
        /*
            r5 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.File r2 = r5.f234109b     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            if (r2 == 0) goto L_0x0044
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.io.File r3 = r5.f234109b     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r1 = 10240(0x2800, float:1.4349E-41)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0042, all -> 0x003f }
        L_0x001d:
            int r3 = r2.read(r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r4 = -1
            if (r3 == r4) goto L_0x0029
            r4 = 0
            r0.write(r1, r4, r3)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            goto L_0x001d
        L_0x0029:
            r0.close()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            byte[] r1 = r0.toByteArray()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r2.close()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r2.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            r0.close()     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            return r3
        L_0x003f:
            r6 = move-exception
            r1 = r2
            goto L_0x0052
        L_0x0042:
            r1 = r2
            goto L_0x004b
        L_0x0044:
            throw r1     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            r0.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            return r6
        L_0x0049:
            r6 = move-exception
            goto L_0x0052
        L_0x004b:
            r1.close()     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
        L_0x004e:
            r0.close()     // Catch:{ Exception -> 0x0059, all -> 0x0049 }
            goto L_0x0059
        L_0x0052:
            r1.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r0.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            throw r6
        L_0x0059:
            r1.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r0.close()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C79911s.mo110072a(java.lang.String):java.lang.String");
    }
}
