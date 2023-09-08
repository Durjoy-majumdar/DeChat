package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import java.io.File;

/* renamed from: c.t.m.sapp.c.k */
public class C79908k {

    /* renamed from: a */
    public File f234102a;

    /* renamed from: b */
    public File f234103b;

    /* renamed from: c */
    public Context f234104c;

    public C79908k(Context context) {
        if (context != null) {
            this.f234104c = context.getApplicationContext();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getExternalFilesDir("data").getAbsolutePath());
                sb.append("/d_l");
                this.f234102a = new File(sb.toString());
            } catch (Throwable unused) {
                this.f234102a = null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:11|12|13|14|15|16|17|18|19|43) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|(3:26|27|37)(1:39)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|(2:32|33)|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.f234103b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0034, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003a, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003e A[SYNTHETIC, Splitter:B:32:0x003e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0041=Splitter:B:34:0x0041, B:18:0x002c=Splitter:B:18:0x002c} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110071a(byte[] r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0042
            int r0 = r6.length     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0006
            goto L_0x0042
        L_0x0006:
            java.io.File r0 = r5.f234103b     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0010
            java.io.File r0 = r5.mo110070a()     // Catch:{ all -> 0x0042 }
            r5.f234103b = r0     // Catch:{ all -> 0x0042 }
        L_0x0010:
            java.io.File r0 = r5.f234103b     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            java.io.File r3 = r5.f234103b     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            r4 = 1
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            r1.write(r6)     // Catch:{ IOException -> 0x0032 }
            r1.flush()     // Catch:{ IOException -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r5.f234103b = r0     // Catch:{ all -> 0x0042 }
            goto L_0x0042
        L_0x002f:
            r6 = move-exception
            goto L_0x003c
        L_0x0031:
            r1 = r0
        L_0x0032:
            r5.f234103b = r0     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return
        L_0x003a:
            r6 = move-exception
            r0 = r1
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r6     // Catch:{ all -> 0x0042 }
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C79908k.mo110071a(byte[]):void");
    }

    /* renamed from: a */
    public final File mo110070a() {
        try {
            File file = this.f234102a;
            if (!file.exists()) {
                file.mkdirs();
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append("");
            String c = C113233r.m155015c(sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("d_");
            sb4.append(c);
            return new File(file, sb4.toString());
        } catch (Throwable unused) {
            return null;
        }
    }
}
