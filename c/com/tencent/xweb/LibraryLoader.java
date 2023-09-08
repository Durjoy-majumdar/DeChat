package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.util.XWebLog;
import j20.C117292a;
import java.io.File;
import k20.C9556a;

public class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private static ILibraryLoader sLibraryLoader;
    private byte _hellAccFlag_;

    public interface ILibraryLoader {
        String findLibrary(Context context, String str);

        void loadLibrary(String str);
    }

    public static String findLibrary(Context context, String str) {
        String findLibrary;
        ILibraryLoader iLibraryLoader = sLibraryLoader;
        if (iLibraryLoader == null || (findLibrary = iLibraryLoader.findLibrary(context, str)) == null) {
            if (context != null) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                File file = new File(str2, "lib" + str + ".so");
                if (file.isDirectory() || !file.canRead()) {
                    XWebLog.m21913w(TAG, "findLibrary, nativeLibraryDir:" + str2);
                } else {
                    String absolutePath = file.getAbsolutePath();
                    XWebLog.m21911i(TAG, "findLibrary, use system library loader, path:" + absolutePath);
                    return absolutePath;
                }
            } else {
                XWebLog.m21913w(TAG, "findLibrary, invalid context");
            }
            XWebLog.m21911i(TAG, "findLibrary, can not find library:" + str);
            return null;
        }
        XWebLog.m21911i(TAG, "findLibrary, use custom library loader, path:" + findLibrary);
        return findLibrary;
    }

    public static void loadLibrary(String str) {
        ILibraryLoader iLibraryLoader = sLibraryLoader;
        if (iLibraryLoader != null) {
            iLibraryLoader.loadLibrary(str);
            XWebLog.m21911i(TAG, "loadLibrary, use custom library loader, lib:" + str);
            return;
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(str);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/xweb/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        XWebLog.m21911i(TAG, "loadLibrary, use system library loader, lib:" + str);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        sLibraryLoader = iLibraryLoader;
    }
}
