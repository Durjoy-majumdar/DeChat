package b13;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lu3.C88656g;
import zt3.C119157j;

/* renamed from: b13.c */
public class C79659c {

    /* renamed from: b13.c$a */
    public static class C79660a implements C88656g {

        /* renamed from: d */
        public List<Object> f233566d;

        /* renamed from: e */
        public String[] f233567e;

        public C79660a(String[] strArr, List<Object> list) {
            this.f233567e = strArr;
            this.f233566d = list;
        }

        public String getKey() {
            return "MMTraceRouteCMDExecutor_watcher";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Process} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Process} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.ProcessBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.ProcessBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Process} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.ProcessBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.ProcessBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Process} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Process} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                java.lang.String r0 = "MicroMsg.MMTraceRoute"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder
                java.lang.String[] r3 = r12.f233567e
                r2.<init>(r3)
                r3 = 1
                r2.redirectErrorStream(r3)
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r7 = 0
                java.lang.Process r2 = r2.start()     // Catch:{ IOException -> 0x00a4, InterruptedException -> 0x0086, Exception -> 0x0068, all -> 0x0064 }
                java.io.OutputStream r8 = r2.getOutputStream()     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                java.io.InputStream r10 = r2.getInputStream()     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                r9.<init>(r10)     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
                r10 = 8096(0x1fa0, float:1.1345E-41)
                r8.<init>(r9, r10)     // Catch:{ IOException -> 0x005f, InterruptedException -> 0x005a, Exception -> 0x0055, all -> 0x0050 }
            L_0x003a:
                java.lang.String r7 = r8.readLine()     // Catch:{ IOException -> 0x004d, InterruptedException -> 0x004b, Exception -> 0x0049 }
                if (r7 == 0) goto L_0x0044
                r1.append(r7)     // Catch:{ IOException -> 0x004d, InterruptedException -> 0x004b, Exception -> 0x0049 }
                goto L_0x003a
            L_0x0044:
                r2.waitFor()     // Catch:{ IOException -> 0x004d, InterruptedException -> 0x004b, Exception -> 0x0049 }
                goto L_0x00c1
            L_0x0049:
                r7 = move-exception
                goto L_0x006c
            L_0x004b:
                r7 = move-exception
                goto L_0x008a
            L_0x004d:
                r7 = move-exception
                goto L_0x00a8
            L_0x0050:
                r0 = move-exception
                r8 = r7
            L_0x0052:
                r7 = r2
                goto L_0x00f4
            L_0x0055:
                r8 = move-exception
                r11 = r8
                r8 = r7
                r7 = r11
                goto L_0x006c
            L_0x005a:
                r8 = move-exception
                r11 = r8
                r8 = r7
                r7 = r11
                goto L_0x008a
            L_0x005f:
                r8 = move-exception
                r11 = r8
                r8 = r7
                r7 = r11
                goto L_0x00a8
            L_0x0064:
                r0 = move-exception
                r8 = r7
                goto L_0x00f4
            L_0x0068:
                r2 = move-exception
                r8 = r7
                r7 = r2
                r2 = r8
            L_0x006c:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
                r9.<init>()     // Catch:{ all -> 0x00f1 }
                java.lang.String r10 = "run cmd err: "
                r9.append(r10)     // Catch:{ all -> 0x00f1 }
                java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00f1 }
                r9.append(r7)     // Catch:{ all -> 0x00f1 }
                java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x00f1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x00f1 }
                goto L_0x00c1
            L_0x0086:
                r2 = move-exception
                r8 = r7
                r7 = r2
                r2 = r8
            L_0x008a:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
                r9.<init>()     // Catch:{ all -> 0x00f1 }
                java.lang.String r10 = "run cmd err, interruptedexception: "
                r9.append(r10)     // Catch:{ all -> 0x00f1 }
                java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00f1 }
                r9.append(r7)     // Catch:{ all -> 0x00f1 }
                java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x00f1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x00f1 }
                goto L_0x00c1
            L_0x00a4:
                r2 = move-exception
                r8 = r7
                r7 = r2
                r2 = r8
            L_0x00a8:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
                r9.<init>()     // Catch:{ all -> 0x00f1 }
                java.lang.String r10 = "run cmd err, io exception: "
                r9.append(r10)     // Catch:{ all -> 0x00f1 }
                java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00f1 }
                r9.append(r7)     // Catch:{ all -> 0x00f1 }
                java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x00f1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x00f1 }
            L_0x00c1:
                b13.C79659c.m96753a(r2, r8)
                java.util.List<java.lang.Object> r2 = r12.f233566d
                java.lang.String r7 = r1.toString()
                r2.add(r7)
                java.util.List<java.lang.Object> r2 = r12.f233566d
                long r5 = r5 - r3
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2.add(r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "stringbuilder: "
                r2.append(r3)
                java.lang.String r1 = r1.toString()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            L_0x00f1:
                r0 = move-exception
                goto L_0x0052
            L_0x00f4:
                b13.C79659c.m96753a(r7, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b13.C79659c.C79660a.run():void");
        }
    }

    /* renamed from: a */
    public static void m96753a(Process process, BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MMTraceRoute", th, "close reader failed", new Object[0]);
            }
        }
        if (process != null) {
            try {
                process.destroy();
            } catch (Throwable th4) {
                Log.printErrStackTrace("MicroMsg.MMTraceRoute", th4, "destroy process failed", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static String m96754b(String str, boolean z) {
        int i;
        int indexOf;
        int i2;
        int indexOf2;
        Log.m105924i("MicroMsg.MMTraceRoute", "output string: " + str);
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z) {
            int indexOf3 = str.indexOf("time=");
            if (indexOf3 >= 0 && (indexOf2 = str.indexOf(" ", i2)) >= 0) {
                return str.substring((i2 = indexOf3 + 5), indexOf2);
            }
            return null;
        }
        int indexOf4 = str.indexOf("time ");
        if (indexOf4 < 0 || (indexOf = str.indexOf(LocaleUtil.MALAY, i)) < 0) {
            return null;
        }
        String substring = str.substring((i = indexOf4 + 5), indexOf);
        return substring.equalsIgnoreCase("0") ? "<1" : substring;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0 + 4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m96755c(java.lang.String r3) {
        /*
            java.lang.String r0 = "ttl="
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 >= 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r0 + 4
            java.lang.String r2 = " "
            int r2 = r3.indexOf(r2, r0)
            if (r2 >= 0) goto L_0x0016
            return r1
        L_0x0016:
            java.lang.String r3 = r3.substring(r0, r2)
            r0 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b13.C79659c.m96755c(java.lang.String):int");
    }

    /* renamed from: d */
    public static List<Object> m96756d(String[] strArr) {
        String str = " ";
        for (String str2 : strArr) {
            str = str + str2 + " ";
        }
        Log.m105924i("MicroMsg.MMTraceRoute", str);
        ArrayList arrayList = new ArrayList();
        C79660a aVar = new C79660a(strArr, arrayList);
        C119157j jVar = (C119157j) C119157j.f356862d;
        jVar.getClass();
        try {
            jVar.mo183878i(aVar, 0).get(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, TimeUnit.MILLISECONDS);
            Log.m105924i("MicroMsg.MMTraceRoute", "watcher thread stopped" + str);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
        return arrayList;
    }
}
