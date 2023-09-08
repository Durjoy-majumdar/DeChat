package com.tencent.matrix.mallctl;

import com.tencent.tinker.loader.shareutil.ShareConstants;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k20.C9556a;
import p723vf.C118672d;

public class MallCtl {

    /* renamed from: a */
    public static boolean f235504a = true;

    /* renamed from: com.tencent.matrix.mallctl.MallCtl$a */
    public static class C28672a implements C28673b {
        /* renamed from: a */
        public boolean mo56261a(String str, String str2) {
            if (str.endsWith(" (deleted)")) {
                str = str.substring(0, str.length() - 10);
            } else if (str.endsWith("]")) {
                str = str.substring(0, str.length() - 1);
            }
            return !str2.contains("w") && (str.endsWith(".so") || str.endsWith(ShareConstants.DEX_SUFFIX) || str.endsWith(".apk") || str.endsWith(ShareConstants.VDEX_SUFFIX) || str.endsWith(ShareConstants.ODEX_SUFFIX) || str.endsWith(".oat") || str.endsWith(".art") || str.endsWith(".ttf") || str.endsWith(".otf") || str.endsWith(ShareConstants.JAR_SUFFIX));
        }
    }

    /* renamed from: com.tencent.matrix.mallctl.MallCtl$b */
    public interface C28673b {
        /* renamed from: a */
        boolean mo56261a(String str, String str2);
    }

    static {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("matrix-mallctl");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/mallctl/MallCtl", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/matrix/mallctl/MallCtl", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            initNative();
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.JeCtl", th, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized void m98068a(C28673b bVar) {
        BufferedReader bufferedReader;
        Throwable th;
        String str;
        synchronized (MallCtl.class) {
            C28672a aVar = bVar == null ? new C28672a() : bVar;
            Pattern compile = Pattern.compile("^([0-9a-f]+)-([0-9a-f]+)\\s+([rwxps-]{4})\\s+[0-9a-f]+\\s+[0-9a-f]+:[0-9a-f]+\\s+\\d+\\s*(.*)$");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/maps")));
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    Matcher matcher = compile.matcher(readLine);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        String group3 = matcher.group(3);
                        String group4 = matcher.group(4);
                        if (group4 == null || group4.isEmpty()) {
                            group4 = "[no-name]";
                        }
                        String str2 = group4;
                        if (!(!aVar.mo56261a(str2, group3) || group == null || group2 == null)) {
                            try {
                                long parseLong = Long.parseLong(group, 16);
                                str = group3;
                                try {
                                    flushReadOnlyFilePagesNative(parseLong, Long.parseLong(group2, 16) - parseLong);
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str = group3;
                                C118672d.m167354d("Matrix.JeCtl", th, "%s-%s %s %s", group, group2, str, str2);
                            }
                        }
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                C118672d.m167354d("Matrix.JeCtl", e, "", new Object[0]);
            } catch (Throwable th6) {
                th.addSuppressed(th6);
            }
        }
        return;
        throw th;
    }

    /* renamed from: b */
    public static synchronized boolean m98069b(boolean z) {
        boolean retainNative;
        synchronized (MallCtl.class) {
            try {
                retainNative = setRetainNative(z);
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.JeCtl", th, "set retain failed", new Object[0]);
                return false;
            }
        }
        return retainNative;
    }

    /* renamed from: c */
    public static synchronized String m98070c() {
        synchronized (MallCtl.class) {
            if (!f235504a) {
                C118672d.m167352b("Matrix.JeCtl", "JeCtl init failed! check if so exists", new Object[0]);
                return "VER_UNKNOWN";
            }
            String versionNative = getVersionNative();
            return versionNative;
        }
    }

    /* renamed from: d */
    public static synchronized int m98071d() {
        int malloptNative;
        synchronized (MallCtl.class) {
            try {
                malloptNative = malloptNative();
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.JeCtl", th, "mallopt failed", new Object[0]);
                return -2;
            }
        }
        return malloptNative;
    }

    private static native int flushReadOnlyFilePagesNative(long j, long j2);

    private static native String getVersionNative();

    private static native void initNative();

    private static native int malloptNative();

    private static native boolean setRetainNative(boolean z);
}
