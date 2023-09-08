package com.tencent.p014mm.ipcinvoker;

import android.content.Context;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.ipcinvoker.n */
public class C80906n {

    /* renamed from: a */
    public static volatile Context f237749a;

    /* renamed from: b */
    public static volatile String f237750b;

    /* renamed from: c */
    public static volatile C80882c f237751c;

    /* renamed from: a */
    public static Context m98774a() {
        Assert.assertNotNull("IPCInvoker not initialize.", f237749a);
        return f237749a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        if (r5 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba A[SYNTHETIC, Splitter:B:61:0x00ba] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m98775b() {
        /*
            java.lang.String r0 = f237750b
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = f237750b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b3
        L_0x000c:
            android.content.Context r0 = f237749a
            int r1 = android.os.Process.myPid()
            r2 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x00b1
        L_0x0017:
            int r3 = android.os.Process.myPid()
            if (r3 != r1) goto L_0x0029
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x0029
            java.lang.String r2 = android.app.Application.getProcessName()
            goto L_0x00b1
        L_0x0029:
            java.lang.String r3 = "activity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0058
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0058
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0058
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            if (r3 == 0) goto L_0x0043
            int r4 = r3.pid
            if (r4 != r1) goto L_0x0043
            java.lang.String r2 = r3.processName
            goto L_0x00b1
        L_0x0058:
            r0 = 128(0x80, float:1.794E-43)
            byte[] r3 = new byte[r0]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r6.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r7 = "/proc/"
            r6.append(r7)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r6.append(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r1 = "/cmdline"
            r6.append(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r1 = r5.read(r3)     // Catch:{ Exception -> 0x0096 }
            if (r1 <= 0) goto L_0x00ae
            r6 = 0
        L_0x007f:
            if (r6 >= r1) goto L_0x008c
            byte r7 = r3[r6]     // Catch:{ Exception -> 0x0096 }
            if (r7 > r0) goto L_0x008b
            if (r7 > 0) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            int r6 = r6 + 1
            goto L_0x007f
        L_0x008b:
            r1 = r6
        L_0x008c:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0096 }
            r0.<init>(r3, r4, r1)     // Catch:{ Exception -> 0x0096 }
            r5.close()     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            r2 = r0
            goto L_0x00b1
        L_0x0096:
            r0 = move-exception
            goto L_0x009c
        L_0x0098:
            r0 = move-exception
            goto L_0x00b8
        L_0x009a:
            r0 = move-exception
            r5 = r2
        L_0x009c:
            java.lang.String r1 = "IPC.IPCInvokeLogic"
            java.lang.String r3 = "get running process error : %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x00b6 }
            r6[r4] = r0     // Catch:{ all -> 0x00b6 }
            v20.C90741c.m113808a(r1, r3, r6)     // Catch:{ all -> 0x00b6 }
            if (r5 == 0) goto L_0x00b1
        L_0x00ae:
            r5.close()     // Catch:{ Exception -> 0x00b1 }
        L_0x00b1:
            f237750b = r2
        L_0x00b3:
            java.lang.String r0 = f237750b
            return r0
        L_0x00b6:
            r0 = move-exception
            r2 = r5
        L_0x00b8:
            if (r2 == 0) goto L_0x00bd
            r2.close()     // Catch:{ Exception -> 0x00bd }
        L_0x00bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ipcinvoker.C80906n.m98775b():java.lang.String");
    }

    /* renamed from: c */
    public static boolean m98776c(String str) {
        return str != null && str.equals(m98775b());
    }

    /* renamed from: d */
    public static void m98777d(Context context) {
        f237749a = context;
    }
}
