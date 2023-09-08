package org.webrtc;

import j20.C117292a;
import k20.C9556a;

class NativeLibrary {
    /* access modifiers changed from: private */
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        private byte _hellAccFlag_;

        public boolean load(String str) {
            String access$000 = NativeLibrary.TAG;
            Logging.m25022d(access$000, "Loading library: " + str);
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(str);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "org/webrtc/NativeLibrary$DefaultLoader", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "org/webrtc/NativeLibrary$DefaultLoader", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                return true;
            } catch (UnsatisfiedLinkError e) {
                String access$0002 = NativeLibrary.TAG;
                Logging.m25024e(access$0002, "Failed to load native library: " + str, e);
                return false;
            }
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.m25022d(TAG, "Native library has already been loaded.");
                return;
            }
            String str2 = TAG;
            Logging.m25022d(str2, "Loading native library: " + str);
            libraryLoaded = nativeLibraryLoader.load(str);
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
