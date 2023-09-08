package com.tencent.xweb.skia_canvas;

import j20.C117292a;
import k20.C9556a;

public class XWebLibraryLoader {
    private static IXWebLibraryLoader DEFAULT;
    private static IXWebLibraryLoader sXWebLibraryLoader;

    static {
        C243881 r0 = new IXWebLibraryLoader() {
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
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/skia_canvas/XWebLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/xweb/skia_canvas/XWebLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                } catch (Exception e) {
                    String.format("%s load fail %s", new Object[]{str, e});
                }
                return true;
            }
        };
        DEFAULT = r0;
        sXWebLibraryLoader = r0;
    }

    public static void afetrLoad() {
        sXWebLibraryLoader.afterLoad();
    }

    public static void beforeLoad() {
        sXWebLibraryLoader.beforeLoad();
    }

    public static void initXWebLibraryLoader(IXWebLibraryLoader iXWebLibraryLoader) {
        sXWebLibraryLoader = iXWebLibraryLoader;
    }

    public static boolean load(String str) {
        return sXWebLibraryLoader.load(str);
    }
}
