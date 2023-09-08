package com.tencent.skyline.jni;

import j20.C117292a;
import k20.C9556a;

public class SkylineLibraryLoader {
    private static ISkylineLibraryLoader DEFAULT;
    private static ISkylineLibraryLoader sSkylineLibraryLoader;

    static {
        C308801 r0 = new ISkylineLibraryLoader() {
            private byte _hellAccFlag_;

            public boolean afterLoad() {
                return false;
            }

            public boolean beforeLoad() {
                return false;
            }

            public boolean load(String str) {
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(str);
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/skyline/jni/SkylineLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/skyline/jni/SkylineLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                } catch (Exception e) {
                    String.format("%s load fail %s", new Object[]{str, e});
                }
                return true;
            }
        };
        DEFAULT = r0;
        sSkylineLibraryLoader = r0;
    }

    public static void afterLoad() {
        sSkylineLibraryLoader.afterLoad();
    }

    public static void beforeLoad() {
        sSkylineLibraryLoader.beforeLoad();
    }

    public static void initXWebLibraryLoader(ISkylineLibraryLoader iSkylineLibraryLoader) {
        sSkylineLibraryLoader = iSkylineLibraryLoader;
    }

    public static boolean load(String str) {
        return sSkylineLibraryLoader.load(str);
    }
}
