package com.tencent.xweb.util;

import org.xwalk.core.XWalkEnvironment;

public class AbiUtil {
    public static final String TAG = "AbiUtil";
    private static String sDeviceAbi;
    private static String sRuntimeAbi;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getDeviceAbi() {
        /*
            java.lang.String r0 = "AbiUtil"
            java.lang.String r1 = sDeviceAbi
            if (r1 != 0) goto L_0x008b
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS     // Catch:{ NoSuchFieldError -> 0x0019, all -> 0x0012 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ NoSuchFieldError -> 0x0019, all -> 0x0012 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ NoSuchFieldError -> 0x0019, all -> 0x0012 }
            sDeviceAbi = r1     // Catch:{ NoSuchFieldError -> 0x0019, all -> 0x0012 }
            goto L_0x002e
        L_0x0012:
            r1 = move-exception
            java.lang.String r2 = "getDeviceAbi failed, Build.SUPPORTED_ABIS error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r2, r1)
            goto L_0x002e
        L_0x0019:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getDeviceAbi failed, Build.SUPPORTED_ABIS NoSuchFieldError:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r0, r1)
        L_0x002e:
            java.lang.String r1 = sDeviceAbi
            if (r1 != 0) goto L_0x0075
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "getprop ro.product.cpu.abi"
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ all -> 0x005d }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x005d }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x005d }
            r3.<init>(r2)     // Catch:{ all -> 0x005d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0058 }
            r2.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x0056 }
            sDeviceAbi = r1     // Catch:{ all -> 0x0056 }
            goto L_0x0066
        L_0x0056:
            r1 = move-exception
            goto L_0x0061
        L_0x0058:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0061
        L_0x005d:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L_0x0061:
            java.lang.String r4 = "getDeviceAbi failed, error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r4, r1)     // Catch:{ all -> 0x006d }
        L_0x0066:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            goto L_0x0075
        L_0x006d:
            r0 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            throw r0
        L_0x0075:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Device ABI: "
            r1.append(r2)
            java.lang.String r2 = sDeviceAbi
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r0, r1)
        L_0x008b:
            java.lang.String r0 = sDeviceAbi
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = ""
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.AbiUtil.getDeviceAbi():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getRuntimeAbi() {
        /*
            java.lang.String r0 = "armeabi"
            java.lang.String r1 = "AbiUtil"
            java.lang.String r2 = "arm64-v8a"
            java.lang.String r3 = "x86_64"
            java.lang.String r4 = "x86"
            java.lang.String r5 = "armeabi-v7a"
            java.lang.String r6 = sRuntimeAbi
            if (r6 != 0) goto L_0x012c
            java.lang.String r6 = android.os.Build.CPU_ABI     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x0046 }
            boolean r7 = r0.equals(r6)     // Catch:{ all -> 0x0046 }
            if (r7 != 0) goto L_0x0043
            boolean r7 = r5.equals(r6)     // Catch:{ all -> 0x0046 }
            if (r7 == 0) goto L_0x0025
            goto L_0x0043
        L_0x0025:
            boolean r7 = r2.equals(r6)     // Catch:{ all -> 0x0046 }
            if (r7 == 0) goto L_0x002e
            sRuntimeAbi = r2     // Catch:{ all -> 0x0046 }
            goto L_0x004c
        L_0x002e:
            boolean r7 = r4.equals(r6)     // Catch:{ all -> 0x0046 }
            if (r7 == 0) goto L_0x0037
            sRuntimeAbi = r4     // Catch:{ all -> 0x0046 }
            goto L_0x004c
        L_0x0037:
            boolean r7 = r3.equals(r6)     // Catch:{ all -> 0x0046 }
            if (r7 == 0) goto L_0x0040
            sRuntimeAbi = r3     // Catch:{ all -> 0x0046 }
            goto L_0x004c
        L_0x0040:
            sRuntimeAbi = r6     // Catch:{ all -> 0x0046 }
            goto L_0x004c
        L_0x0043:
            sRuntimeAbi = r5     // Catch:{ all -> 0x0046 }
            goto L_0x004c
        L_0x0046:
            r6 = move-exception
            java.lang.String r7 = "get abi from cpu_abi failed, error"
            com.tencent.xweb.util.XWebLog.m21910e(r1, r7, r6)
        L_0x004c:
            java.lang.String r6 = sRuntimeAbi
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x00f5
            java.lang.String r6 = "os.arch"
            java.lang.String r6 = java.lang.System.getProperty(r6)     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00ef }
            boolean r7 = r4.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 != 0) goto L_0x00ec
            java.lang.String r7 = "i686"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 != 0) goto L_0x00ec
            java.lang.String r7 = "i386"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 != 0) goto L_0x00ec
            java.lang.String r7 = "ia32"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 == 0) goto L_0x007f
            goto L_0x00ec
        L_0x007f:
            java.lang.String r7 = "x64"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 != 0) goto L_0x00e0
            boolean r7 = r3.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 == 0) goto L_0x008f
            goto L_0x00e0
        L_0x008f:
            java.lang.String r7 = "armv7l"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r7 != 0) goto L_0x00dd
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r5.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00a4
            goto L_0x00dd
        L_0x00a4:
            java.lang.String r0 = "aarch64"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "armv8"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "arm64"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00bd
            goto L_0x00d1
        L_0x00bd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r0.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = "arch:"
            r0.append(r7)     // Catch:{ all -> 0x00ef }
            r0.append(r6)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ef }
            sRuntimeAbi = r0     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00d1:
            boolean r0 = is64bitDevice()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00da
            sRuntimeAbi = r2     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00da:
            sRuntimeAbi = r5     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00dd:
            sRuntimeAbi = r5     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00e0:
            boolean r0 = is64bitDevice()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e9
            sRuntimeAbi = r3     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00e9:
            sRuntimeAbi = r4     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00ec:
            sRuntimeAbi = r4     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00ef:
            r0 = move-exception
            java.lang.String r6 = "get abi from os.arch failed, error"
            com.tencent.xweb.util.XWebLog.m21910e(r1, r6, r0)
        L_0x00f5:
            java.lang.String r0 = sRuntimeAbi
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0106
            boolean r0 = isIaDevice()
            if (r0 == 0) goto L_0x0116
            sRuntimeAbi = r4
            goto L_0x0116
        L_0x0106:
            java.lang.String r0 = sRuntimeAbi
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0116
            boolean r0 = isIaDevice()
            if (r0 == 0) goto L_0x0116
            sRuntimeAbi = r3
        L_0x0116:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Runtime ABI: "
            r0.append(r2)
            java.lang.String r2 = sRuntimeAbi
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
        L_0x012c:
            java.lang.String r0 = sRuntimeAbi
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.AbiUtil.getRuntimeAbi():java.lang.String");
    }

    public static boolean is64bitApp() {
        String runtimeAbi = getRuntimeAbi();
        return runtimeAbi.equals(XWalkEnvironment.RUNTIME_ABI_ARM64_STR) || runtimeAbi.equals("x86_64");
    }

    public static boolean is64bitDevice() {
        String deviceAbi = getDeviceAbi();
        return deviceAbi.equals(XWalkEnvironment.RUNTIME_ABI_ARM64_STR) || deviceAbi.equals("x86_64");
    }

    public static boolean isIaDevice() {
        String deviceAbi = getDeviceAbi();
        return deviceAbi.equals("x86") || deviceAbi.equals("x86_64");
    }
}
