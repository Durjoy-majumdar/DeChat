package com.eclipsesource.mmv8;

import j20.C117292a;
import java.io.File;
import k20.C9556a;

class LibraryLoader {
    public static final String DELIMITER = System.getProperty("line.separator");
    public static final String SEPARATOR = System.getProperty("file.separator");
    public static final String SWT_LIB_DIR = ".j2v8";
    private byte _hellAccFlag_;

    public static void chmod(String str, String str2) {
        if (!isWindows()) {
            try {
                Runtime.getRuntime().exec(new String[]{"chmod", str, str2}).waitFor();
            } catch (Throwable unused) {
            }
        }
    }

    private static String computeLibraryFullName() {
        return "lib" + computeLibraryShortName() + "." + getOSFileExtension();
    }

    private static String computeLibraryShortName() {
        String os = getOS();
        String archSuffix = getArchSuffix();
        return "j2v8" + "_" + os + "_" + archSuffix;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[SYNTHETIC, Splitter:B:23:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC, Splitter:B:27:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean extract(java.lang.String r7, java.lang.String r8, java.lang.StringBuffer r9) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r1 = 1
            r2 = 0
            r3 = 0
            boolean r4 = r0.exists()     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x0011
            r0.delete()     // Catch:{ all -> 0x0052 }
        L_0x0011:
            java.lang.Class<com.eclipsesource.mmv8.LibraryLoader> r4 = com.eclipsesource.mmv8.LibraryLoader.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r5.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch:{ all -> 0x0052 }
            r5.append(r8)     // Catch:{ all -> 0x0052 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0052 }
            java.io.InputStream r8 = r4.getResourceAsStream(r8)     // Catch:{ all -> 0x0052 }
            if (r8 == 0) goto L_0x006d
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0054 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0054 }
            r5.<init>(r7)     // Catch:{ all -> 0x0054 }
        L_0x0033:
            int r2 = r8.read(r4)     // Catch:{ all -> 0x0050 }
            r6 = -1
            if (r2 == r6) goto L_0x003e
            r5.write(r4, r3, r2)     // Catch:{ all -> 0x0050 }
            goto L_0x0033
        L_0x003e:
            r5.close()     // Catch:{ all -> 0x0050 }
            r8.close()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "755"
            chmod(r2, r7)     // Catch:{ all -> 0x0050 }
            boolean r7 = load(r7, r9)     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x006d
            return r1
        L_0x0050:
            r2 = r5
            goto L_0x0054
        L_0x0052:
            r8 = r2
            r1 = 0
        L_0x0054:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005b
        L_0x005a:
        L_0x005b:
            if (r8 == 0) goto L_0x0062
            r8.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            if (r1 == 0) goto L_0x006d
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x006d
            r0.delete()
        L_0x006d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.LibraryLoader.extract(java.lang.String, java.lang.String, java.lang.StringBuffer):boolean");
    }

    public static String getArchSuffix() {
        String property = System.getProperty("os.arch");
        return property.equals("i686") ? "x86" : property.equals("amd64") ? "x86_64" : (!property.equals(Platform.NATIVE_CLIENT) && !property.equals("aarch64")) ? property : "armv7l";
    }

    public static String getOS() {
        if (isWindows()) {
            return "win32";
        }
        if (isMac()) {
            return Platform.MACOSX;
        }
        if (isLinux() && !isAndroid()) {
            return Platform.LINUX;
        }
        if (isAndroid()) {
            return Platform.ANDROID;
        }
        throw new UnsatisfiedLinkError("Unsupported platform: " + getOsName());
    }

    public static String getOSFileExtension() {
        if (isWindows()) {
            return "dll";
        }
        if (isMac()) {
            return "dylib";
        }
        if (isLinux() || isNativeClient()) {
            return "so";
        }
        throw new UnsatisfiedLinkError("Unsupported platform: " + getOsName());
    }

    public static String getOsName() {
        return System.getProperty("os.name") + System.getProperty("java.specification.vendor");
    }

    public static boolean isAndroid() {
        return getOsName().contains("Android");
    }

    public static boolean isLinux() {
        return getOsName().startsWith("Linux");
    }

    public static boolean isMac() {
        return getOsName().startsWith("Mac");
    }

    public static boolean isNativeClient() {
        return getOsName().startsWith(Platform.NATIVE_CLIENT);
    }

    public static boolean isWindows() {
        return getOsName().startsWith("Windows");
    }

    public static boolean load(String str, StringBuffer stringBuffer) {
        try {
            if (str.indexOf(SEPARATOR) != -1) {
                System.load(str);
                return true;
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/eclipsesource/mmv8/LibraryLoader", "load", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/eclipsesource/mmv8/LibraryLoader", "load", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        } catch (UnsatisfiedLinkError e) {
            if (stringBuffer.length() == 0) {
                stringBuffer.append(DELIMITER);
            }
            stringBuffer.append(9);
            stringBuffer.append(e.getMessage());
            stringBuffer.append(DELIMITER);
            return false;
        }
    }

    public static void loadLibrary(String str) {
        if (isAndroid()) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("mmj2v8");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/eclipsesource/mmv8/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/eclipsesource/mmv8/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        String computeLibraryShortName = computeLibraryShortName();
        String computeLibraryFullName = computeLibraryFullName();
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("user.dir"));
        String str2 = SEPARATOR;
        sb.append(str2);
        sb.append("jni");
        sb.append(str2);
        sb.append(computeLibraryFullName());
        String sb4 = sb.toString();
        if (load(computeLibraryFullName, stringBuffer) || load(computeLibraryShortName, stringBuffer)) {
            return;
        }
        if (!new File(sb4).exists() || !load(sb4, stringBuffer)) {
            if (str == null) {
                str = System.getProperty("java.io.tmpdir");
            }
            if (!extract(str + str2 + computeLibraryFullName, computeLibraryFullName, stringBuffer)) {
                throw new UnsatisfiedLinkError("Could not load J2V8 library. Reasons: " + stringBuffer.toString());
            }
        }
    }
}
