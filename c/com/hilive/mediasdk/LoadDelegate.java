package com.hilive.mediasdk;

import j20.C117292a;
import k20.C9556a;

public class LoadDelegate {
    private static final String TAG = "[hilive][java]";
    private static ILoadLibrary sInstance = new ILoadLibrary() {
        private byte _hellAccFlag_;

        private boolean loadSo(String str) {
            String str2 = str;
            int i = 0;
            while (i < 3) {
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(str2);
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/hilive/mediasdk/LoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/hilive/mediasdk/LoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    LogDelegate.m97523i(LoadDelegate.TAG, "loadSo " + str2 + " success!", new Object[0]);
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    String message = e.getMessage() == null ? "null" : e.getMessage();
                    LogDelegate.m97522e(LoadDelegate.TAG, "loadSo " + str2 + " failed UnsatisfiedLinkError " + message, new Object[0]);
                } catch (SecurityException e2) {
                    String message2 = e2.getMessage() == null ? "null" : e2.getMessage();
                    LogDelegate.m97522e(LoadDelegate.TAG, "loadSo " + str2 + " failed SecurityException " + message2, new Object[0]);
                } catch (NullPointerException e3) {
                    String message3 = e3.getMessage() == null ? "null" : e3.getMessage();
                    LogDelegate.m97522e(LoadDelegate.TAG, "loadSo " + str2 + " failed NullPointerException " + message3, new Object[0]);
                } catch (Throwable th) {
                    LogDelegate.printStackTrace(LoadDelegate.TAG, th, "loadSo", new Object[0]);
                }
            }
            return false;
            i++;
        }

        public void loadLibrary(String str) {
            loadSo(str);
        }

        public void loadLibrary(String str, ClassLoader classLoader) {
        }
    };
    private static boolean sLibraryLoaded;

    public interface ILoadLibrary {
        void loadLibrary(String str);

        void loadLibrary(String str, ClassLoader classLoader);
    }

    public static void loadLibraries() {
        if (!sLibraryLoaded) {
            sInstance.loadLibrary("c++_shared");
            sInstance.loadLibrary("xffmpeg");
            sInstance.loadLibrary("mmmedia");
            sInstance.loadLibrary("mmmediasdk");
        }
    }

    public static void loadLibrary(String str) {
        sInstance.loadLibrary(str);
    }

    public static void setInstance(ILoadLibrary iLoadLibrary) {
        if (iLoadLibrary != null) {
            sInstance = iLoadLibrary;
        }
    }

    public static void loadLibrary(String str, ClassLoader classLoader) {
        sInstance.loadLibrary(str, classLoader);
    }
}
