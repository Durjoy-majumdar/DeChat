package com.tencent.matrix.iocanary.core;

import com.tencent.p014mm.matrix.C80993l;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p361me.C88727a;
import p723vf.C118672d;
import p994ke.C88142a;

public class IOCanaryJniBridge {
    private static final String TAG = "Matrix.IOCanaryJniBridge";
    private static boolean sIsLoadJniLib;
    private static boolean sIsTryInstall;
    private static OnJniIssuePublishListener sOnIssuePublishListener;
    private byte _hellAccFlag_;

    public static final class ConfigKey {
        public static final int MAIN_THREAD_THRESHOLD = 0;
        public static final int REPEAT_READ_THRESHOLD = 2;
        public static final int SMALL_BUFFER_THRESHOLD = 1;

        private ConfigKey() {
        }
    }

    public static final class DetectorType {
        public static final int MAIN_THREAD_IO = 0;
        public static final int REPEAT_READ = 2;
        public static final int SMALL_BUFFER = 1;

        private DetectorType() {
        }
    }

    public static final class JavaContext {
        private final String stack;
        private String threadName;

        private JavaContext() {
            this.stack = C88727a.m110690a(new Throwable());
            if (Thread.currentThread() != null) {
                this.threadName = Thread.currentThread().getName();
            }
        }
    }

    private static native boolean doHook();

    private static native boolean doUnHook();

    private static native void enableDetector(int i);

    private static JavaContext getJavaContext() {
        try {
            return new JavaContext();
        } catch (Throwable th) {
            C118672d.m167354d(TAG, th, "get javacontext exception", new Object[0]);
            return null;
        }
    }

    public static void install(C88142a aVar, OnJniIssuePublishListener onJniIssuePublishListener) {
        C118672d.m167355e(TAG, "install sIsTryInstall:%b", Boolean.valueOf(sIsTryInstall));
        if (!sIsTryInstall) {
            if (!loadJni()) {
                C118672d.m167352b(TAG, "install loadJni failed", new Object[0]);
                return;
            }
            sOnIssuePublishListener = onJniIssuePublishListener;
            if (aVar != null) {
                try {
                    if (((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_file_io_main_thread_enable", true)) {
                        enableDetector(0);
                        setConfig(0, ((long) ((C80993l) aVar.f254910a).mo112814a("clicfg_matrix_io_main_thread_enable_threshold", 500)) * 1000);
                    }
                    if (((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_small_buffer_enable", true)) {
                        enableDetector(1);
                        setConfig(1, (long) ((C80993l) aVar.f254910a).mo112814a("clicfg_matrix_io_small_buffer_threshold", 4096));
                    }
                    if (((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_repeated_read_enable", true)) {
                        enableDetector(2);
                        setConfig(2, (long) ((C80993l) aVar.f254910a).mo112814a("clicfg_matrix_io_repeated_read_threshold", 5));
                    }
                } catch (Error e) {
                    C118672d.m167354d(TAG, e, "call jni method error", new Object[0]);
                    return;
                }
            }
            doHook();
            sIsTryInstall = true;
        }
    }

    private static boolean loadJni() {
        if (sIsLoadJniLib) {
            return true;
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("io-canary");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/iocanary/core/IOCanaryJniBridge", "loadJni", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/matrix/iocanary/core/IOCanaryJniBridge", "loadJni", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            sIsLoadJniLib = true;
            return true;
        } catch (Exception e) {
            C118672d.m167352b(TAG, "hook: e: %s", e.getLocalizedMessage());
            sIsLoadJniLib = false;
            return false;
        }
    }

    public static void onIssuePublish(ArrayList<IOIssue> arrayList) {
        OnJniIssuePublishListener onJniIssuePublishListener = sOnIssuePublishListener;
        if (onJniIssuePublishListener != null) {
            onJniIssuePublishListener.onIssuePublish(arrayList);
        }
    }

    private static native void setConfig(int i, long j);

    public static void uninstall() {
        if (sIsTryInstall) {
            doUnHook();
            sIsTryInstall = false;
        }
    }
}
