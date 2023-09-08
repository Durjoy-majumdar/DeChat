package com.tenpay.ndk;

import j20.C117292a;
import k20.C9556a;

public class FitHkWxLibraryLoader {
    private static ILoader sLoaderImpl = ILoader.DEFAULT;

    public interface ILoader {
        public static final ILoader DEFAULT = new ILoader() {
            private byte _hellAccFlag_;

            public void loadLibrary(String str) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(str);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tenpay/ndk/FitHkWxLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tenpay/ndk/FitHkWxLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
        };

        void loadLibrary(String str);
    }

    public static void load(String str) {
        sLoaderImpl.loadLibrary(str);
    }

    public static void setLoader(ILoader iLoader) {
        if (iLoader == null) {
            sLoaderImpl = ILoader.DEFAULT;
        } else {
            sLoaderImpl = iLoader;
        }
    }
}
