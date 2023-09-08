package com.eclipsesource.mmv8;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class PlatformDetector {

    public static class Arch {
        public static String getName() {
            String property = System.getProperty("os.arch");
            String access$000 = PlatformDetector.normalizeArch(property);
            if (!access$000.equals("unknown")) {
                return access$000;
            }
            throw new UnsatisfiedLinkError("Unsupported arch: " + property);
        }
    }

    /* renamed from: com.eclipsesource.mmv8.PlatformDetector$OS */
    public static class C80134OS {
        public static String getLibFileExtension() {
            if (isWindows()) {
                return "dll";
            }
            if (isMac()) {
                return "dylib";
            }
            if (isLinux() || isAndroid() || isNativeClient()) {
                return "so";
            }
            throw new UnsatisfiedLinkError("Unsupported platform library-extension for: " + getName());
        }

        public static String getName() {
            String property = System.getProperty("os.name");
            String access$100 = PlatformDetector.normalizeOs(property);
            String property2 = System.getProperty("java.specification.vendor");
            if (PlatformDetector.normalize(property2).contains(Platform.ANDROID) || access$100.contains(Platform.ANDROID)) {
                return Platform.ANDROID;
            }
            if (!access$100.equals("unknown")) {
                return access$100;
            }
            throw new UnsatisfiedLinkError("Unsupported platform/vendor: " + property + " / " + property2);
        }

        public static boolean isAndroid() {
            return getName().equals(Platform.ANDROID);
        }

        public static boolean isLinux() {
            return getName().equals(Platform.LINUX);
        }

        public static boolean isMac() {
            return getName().equals(Platform.MACOSX);
        }

        public static boolean isNativeClient() {
            return getName().equals(Platform.NATIVE_CLIENT);
        }

        public static boolean isWindows() {
            return getName().equals(Platform.WINDOWS);
        }
    }

    public static class Vendor {
        private static final String LINUX_ID_PREFIX = "ID=";
        private static final String[] LINUX_OS_RELEASE_FILES = {"/etc/os-release", "/usr/lib/os-release"};
        private static final String REDHAT_RELEASE_FILE = "/etc/redhat-release";

        private static void closeQuietly(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }

        private static String getLinuxOsReleaseId() {
            for (String file : LINUX_OS_RELEASE_FILES) {
                File file2 = new File(file);
                if (file2.exists()) {
                    return parseLinuxOsReleaseFile(file2);
                }
            }
            File file3 = new File(REDHAT_RELEASE_FILE);
            if (file3.exists()) {
                return parseLinuxRedhatReleaseFile(file3);
            }
            throw new UnsatisfiedLinkError("Unsupported linux vendor: " + getName());
        }

        public static String getName() {
            if (C80134OS.isWindows()) {
                return "microsoft";
            }
            if (C80134OS.isMac()) {
                return "apple";
            }
            if (C80134OS.isLinux()) {
                return getLinuxOsReleaseId();
            }
            if (C80134OS.isAndroid()) {
                return "google";
            }
            throw new UnsatisfiedLinkError("Unsupported vendor: " + getName());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String parseLinuxOsReleaseFile(java.io.File r4) {
            /*
                r0 = 0
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
                r3.<init>(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
                java.lang.String r4 = "utf-8"
                r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
                r1.<init>(r2)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            L_0x0013:
                java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x0037, all -> 0x002e }
                if (r4 == 0) goto L_0x002a
                java.lang.String r2 = "ID="
                boolean r2 = r4.startsWith(r2)     // Catch:{ IOException -> 0x0037, all -> 0x002e }
                if (r2 == 0) goto L_0x0013
                r2 = 3
                java.lang.String r4 = r4.substring(r2)     // Catch:{ IOException -> 0x0037, all -> 0x002e }
                java.lang.String r0 = com.eclipsesource.mmv8.PlatformDetector.normalizeOsReleaseValue(r4)     // Catch:{ IOException -> 0x0037, all -> 0x002e }
            L_0x002a:
                closeQuietly(r1)
                return r0
            L_0x002e:
                r4 = move-exception
                r0 = r1
                goto L_0x0032
            L_0x0031:
                r4 = move-exception
            L_0x0032:
                closeQuietly(r0)
                throw r4
            L_0x0036:
                r1 = r0
            L_0x0037:
                closeQuietly(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.PlatformDetector.Vendor.parseLinuxOsReleaseFile(java.io.File):java.lang.String");
        }

        private static String parseLinuxRedhatReleaseFile(File file) {
            BufferedReader bufferedReader;
            String str = "centos";
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String lowerCase = readLine.toLowerCase(Locale.US);
                        if (!lowerCase.contains(str)) {
                            if (lowerCase.contains("fedora")) {
                                str = "fedora";
                            } else if (lowerCase.contains("red hat enterprise linux")) {
                                str = "rhel";
                            } else {
                                closeQuietly(bufferedReader);
                                return null;
                            }
                        }
                        closeQuietly(bufferedReader);
                        return str;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                closeQuietly(bufferedReader2);
                throw th;
            }
            closeQuietly(bufferedReader);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static String normalize(String str) {
        return str == null ? "" : str.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    /* access modifiers changed from: private */
    public static String normalizeArch(String str) {
        String normalize = normalize(str);
        return normalize.matches("^(x8664|amd64|ia32e|em64t|x64)$") ? "x86_64" : normalize.matches("^(x8632|x86|i[3-6]86|ia32|x32)$") ? "x86_32" : normalize.matches("^(ia64|itanium64)$") ? "itanium_64" : normalize.matches("^(sparc|sparc32)$") ? "sparc_32" : normalize.matches("^(sparcv9|sparc64)$") ? "sparc_64" : normalize.matches("^(arm|arm32)$") ? "arm_32" : "aarch64".equals(normalize) ? "aarch_64" : normalize.matches("^(ppc|ppc32)$") ? "ppc_32" : "ppc64".equals(normalize) ? "ppc_64" : "ppc64le".equals(normalize) ? "ppcle_64" : "s390".equals(normalize) ? "s390_32" : "s390x".equals(normalize) ? "s390_64" : "unknown";
    }

    /* access modifiers changed from: private */
    public static String normalizeOs(String str) {
        String normalize = normalize(str);
        return normalize.startsWith("aix") ? "aix" : normalize.startsWith("hpux") ? "hpux" : (!normalize.startsWith("os400") || (normalize.length() > 5 && Character.isDigit(normalize.charAt(5)))) ? normalize.startsWith(Platform.ANDROID) ? Platform.ANDROID : normalize.startsWith(Platform.LINUX) ? Platform.LINUX : normalize.startsWith(Platform.NATIVE_CLIENT) ? Platform.NATIVE_CLIENT : (normalize.startsWith(Platform.MACOSX) || normalize.startsWith("osx")) ? Platform.MACOSX : normalize.startsWith("freebsd") ? "freebsd" : normalize.startsWith("openbsd") ? "openbsd" : normalize.startsWith("netbsd") ? "netbsd" : (normalize.startsWith("solaris") || normalize.startsWith("sunos")) ? "sunos" : normalize.startsWith(Platform.WINDOWS) ? Platform.WINDOWS : "unknown" : "os400";
    }

    /* access modifiers changed from: private */
    public static String normalizeOsReleaseValue(String str) {
        return str.trim().replace(FastJsonResponse.QUOTE, "");
    }
}
