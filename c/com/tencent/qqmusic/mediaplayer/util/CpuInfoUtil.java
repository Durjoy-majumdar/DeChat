package com.tencent.qqmusic.mediaplayer.util;

public class CpuInfoUtil {
    private static final String CUR_CPU_FREQ = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
    private static final String TAG = "CpuInfoUtil";
    private static OutputCpuThread mCurrThread;

    public static class OutputCpuThread extends Thread {
        public boolean isStop = false;

        public OutputCpuThread(String str) {
            super(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            r2 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
            r1 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
            r2 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0026] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0074 A[SYNTHETIC, Splitter:B:36:0x0074] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0085 A[SYNTHETIC, Splitter:B:44:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = "CpuInfoUtil"
                super.run()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 0
                java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                java.lang.String r4 = "top -m 10 -s cpu -t"
                java.lang.Process r3 = r3.exec(r4)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0068 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0068 }
                java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x0068 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0068 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0068 }
                r2 = 0
            L_0x0025:
                r5 = 0
            L_0x0026:
                java.lang.String r6 = r4.readLine()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
                if (r6 == 0) goto L_0x0059
                boolean r7 = r8.isStop     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
                if (r7 != 0) goto L_0x0059
                int r5 = r5 + 1
                r1.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
                java.lang.String r6 = "\n"
                r1.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
                r6 = 15
                if (r5 <= r6) goto L_0x0026
                java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0054, all -> 0x0062 }
                com.tencent.qqmusic.mediaplayer.util.Logger.m21786d(r0, r6)     // Catch:{ Exception -> 0x0054, all -> 0x0062 }
                int r6 = r1.length()     // Catch:{ Exception -> 0x0054, all -> 0x0062 }
                int r6 = r6 + -1
                r1.delete(r2, r6)     // Catch:{ Exception -> 0x0054, all -> 0x0062 }
                r6 = 5000(0x1388, double:2.4703E-320)
                java.lang.Thread.sleep(r6)     // Catch:{ Exception -> 0x0054, all -> 0x0062 }
                goto L_0x0025
            L_0x0054:
                r6 = move-exception
                com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
                goto L_0x0026
            L_0x0059:
                r4.close()     // Catch:{ IOException -> 0x005d }
                goto L_0x007e
            L_0x005d:
                r1 = move-exception
                com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r1)
                goto L_0x007e
            L_0x0062:
                r1 = move-exception
                r2 = r4
                goto L_0x0083
            L_0x0065:
                r1 = move-exception
                r2 = r4
                goto L_0x006f
            L_0x0068:
                r1 = move-exception
                goto L_0x006f
            L_0x006a:
                r1 = move-exception
                r3 = r2
                goto L_0x0083
            L_0x006d:
                r1 = move-exception
                r3 = r2
            L_0x006f:
                com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0082 }
                if (r2 == 0) goto L_0x007c
                r2.close()     // Catch:{ IOException -> 0x0078 }
                goto L_0x007c
            L_0x0078:
                r1 = move-exception
                com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r1)
            L_0x007c:
                if (r3 == 0) goto L_0x0081
            L_0x007e:
                r3.destroy()
            L_0x0081:
                return
            L_0x0082:
                r1 = move-exception
            L_0x0083:
                if (r2 == 0) goto L_0x008d
                r2.close()     // Catch:{ IOException -> 0x0089 }
                goto L_0x008d
            L_0x0089:
                r2 = move-exception
                com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x008d:
                if (r3 == 0) goto L_0x0092
                r3.destroy()
            L_0x0092:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.OutputCpuThread.run():void");
        }
    }

    public static void outputCpuHZToLog() {
    }

    public static void outputThreadInfoToLog() {
    }

    public static synchronized void startProcessInfoOutput() {
        synchronized (CpuInfoUtil.class) {
        }
    }

    public static synchronized void stopProcessInfoOutput() {
        synchronized (CpuInfoUtil.class) {
            mCurrThread = null;
        }
    }
}
