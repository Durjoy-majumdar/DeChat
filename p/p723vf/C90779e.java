package p723vf;

import android.content.Context;
import com.tencent.xweb.file.XVFSFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: vf.e */
public final class C90779e {

    /* renamed from: a */
    public static String f260689a;

    /* renamed from: b */
    public static String f260690b;

    /* renamed from: c */
    public static char[] f260691c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d */
    public static final ThreadLocal<MessageDigest> f260692d = new C90780a();

    /* renamed from: vf.e$a */
    public class C90780a extends ThreadLocal<MessageDigest> {
        public Object initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Initialize MD5 failed.", e);
            }
        }
    }

    /* renamed from: vf.e$b */
    public class C90781b extends ThreadLocal<MessageDigest> {
        public Object initialValue() {
            try {
                return MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Initialize SHA256-DIGEST failed.", e);
            }
        }
    }

    static {
        new C90781b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a A[SYNTHETIC, Splitter:B:49:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6 A[SYNTHETIC, Splitter:B:55:0x00a6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m113846a(android.content.Context r6) {
        /*
            java.lang.String r0 = f260689a
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x00af
            if (r0 > 0) goto L_0x0011
            goto L_0x00af
        L_0x0011:
            java.lang.String r2 = "activity"
            java.lang.Object r6 = r6.getSystemService(r2)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            r2 = 0
            if (r6 == 0) goto L_0x0042
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L_0x0042
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0037 }
        L_0x0026:
            boolean r3 = r6.hasNext()     // Catch:{ Exception -> 0x0037 }
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r6.next()     // Catch:{ Exception -> 0x0037 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ Exception -> 0x0037 }
            int r4 = r3.pid     // Catch:{ Exception -> 0x0037 }
            if (r4 != r0) goto L_0x0026
            goto L_0x003c
        L_0x0037:
            r6 = move-exception
            r6.getMessage()
        L_0x003b:
            r3 = r2
        L_0x003c:
            if (r3 == 0) goto L_0x0042
            java.lang.String r1 = r3.processName
            goto L_0x00af
        L_0x0042:
            r6 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r6]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0094 }
            r4.<init>()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ Exception -> 0x0094 }
            r4.append(r0)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0094 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0094 }
            int r0 = r3.read(r6)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            if (r0 <= 0) goto L_0x0089
            r2 = 0
            r4 = 0
        L_0x0069:
            if (r4 >= r0) goto L_0x0074
            byte r5 = r6[r4]     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            if (r5 > 0) goto L_0x0071
            r0 = r4
            goto L_0x0074
        L_0x0071:
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0074:
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r4.<init>(r6, r2, r0, r5)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r3.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r6 = move-exception
            r6.getMessage()
        L_0x0087:
            r1 = r4
            goto L_0x00af
        L_0x0089:
            r3.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00af
        L_0x008d:
            r6 = move-exception
            goto L_0x00a4
        L_0x008f:
            r6 = move-exception
            r2 = r3
            goto L_0x0095
        L_0x0092:
            r6 = move-exception
            goto L_0x00a3
        L_0x0094:
            r6 = move-exception
        L_0x0095:
            r6.getMessage()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x00af
            r2.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00af
        L_0x009e:
            r6 = move-exception
            r6.getMessage()
            goto L_0x00af
        L_0x00a3:
            r3 = r2
        L_0x00a4:
            if (r3 == 0) goto L_0x00ae
            r3.close()     // Catch:{ Exception -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r0 = move-exception
            r0.getMessage()
        L_0x00ae:
            throw r6
        L_0x00af:
            f260689a = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90779e.m113846a(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m113847b(Context context) {
        String packageName = context.getPackageName();
        String a = m113846a(context);
        if (a == null || a.length() == 0) {
            a = "";
        }
        return packageName.equals(a);
    }

    /* renamed from: c */
    public static long m113848c(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return str.length() <= 0 ? j : Long.decode(str).longValue();
        } catch (NumberFormatException e) {
            C118672d.m167356f("Matrix.MatrixUtil", "parseLong error: " + e.getMessage(), new Object[0]);
            return j;
        }
    }

    /* renamed from: d */
    public static String m113849d(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(exc.toString());
        for (int i = 2; i < stackTrace.length; i++) {
            sb.append('[');
            sb.append(stackTrace[i].getClassName());
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(stackTrace[i].getMethodName());
            sb.append("(" + stackTrace[i].getLineNumber() + ")]");
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m113850e(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002b }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x002b }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x002b }
            r5.<init>(r7)     // Catch:{ all -> 0x002b }
            r4.<init>(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r7 = "UTF-8"
            r3.<init>(r4, r7)     // Catch:{ all -> 0x002b }
            r2.<init>(r3)     // Catch:{ all -> 0x002b }
        L_0x0018:
            java.lang.String r7 = r2.readLine()     // Catch:{ all -> 0x0028 }
            if (r7 == 0) goto L_0x0024
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0028 }
            p723vf.C118672d.m167353c(r6, r7, r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0018
        L_0x0024:
            r2.close()
            goto L_0x004c
        L_0x0028:
            r7 = move-exception
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r7 = move-exception
        L_0x002c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r2.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r3 = "printFileByLine failed e : "
            r2.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x004d }
            r2.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x004d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x004d }
            p723vf.C118672d.m167352b(r6, r7, r0)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x004c
            r1.close()
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            if (r1 == 0) goto L_0x0053
            r1.close()
        L_0x0053:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90779e.m113850e(java.lang.String, java.lang.String):void");
    }
}
