package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.impl.OutArchiveImpl;
import j20.C117292a;
import java.security.AccessController;
import java.security.PrivilegedAction;
import k20.C9556a;

/* renamed from: com.tencent.mm.mm7zip.SevenZip */
public class SevenZip {
    private static boolean autoInitializationWillOccur = true;
    private static boolean initializationSuccessful;
    private static SevenZipNativeInitializationException lastInitializationException;
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.mm7zip.SevenZip$DummyOpenArchiveCallback */
    public static class DummyOpenArchiveCallback implements IArchiveOpenCallback {
        private DummyOpenArchiveCallback() {
        }

        public void setCompleted(Long l, Long l2) {
        }

        public void setTotal(Long l, Long l2) {
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.SevenZip$Version */
    public static class Version {
        public int build;
        public String copyright;
        public String date;
        public int major;
        public int minor;
        public String version;
    }

    private SevenZip() {
    }

    private static IInArchive callNativeOpenArchive(ArchiveFormat archiveFormat, IInStream iInStream, IArchiveOpenCallback iArchiveOpenCallback) {
        if (iInStream != null) {
            return nativeOpenArchive(archiveFormat, iInStream, iArchiveOpenCallback);
        }
        throw new NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
    }

    private static void ensureLibraryIsInitialized() {
        if (autoInitializationWillOccur) {
            autoInitializationWillOccur = false;
            try {
                initSevenZipFromPlatformJAR();
            } catch (SevenZipNativeInitializationException e) {
                lastInitializationException = e;
                throw new RuntimeException("SevenZipJBinding couldn't be initialized automaticly using initialization from platform depended JAR and the default temporary directory. Please, make sure the correct 'sevenzipjbinding-<Platform>.jar' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: 'com.tencent.mm.mm7zip.SevenZip.init*()'", e);
            }
        }
        if (!initializationSuccessful) {
            throw new RuntimeException("SevenZipJBinding wasn't initialized successfully last time.", lastInitializationException);
        }
    }

    public static void initSevenZipFromPlatformJAR() {
        initSevenZipFromPlatformJARIntern();
    }

    private static synchronized void initSevenZipFromPlatformJARIntern() {
        synchronized (SevenZip.class) {
            try {
                autoInitializationWillOccur = false;
                if (!initializationSuccessful) {
                    loadNativeLibraries("MM7Zip");
                    nativeInitialization();
                }
            } catch (SevenZipNativeInitializationException e) {
                lastInitializationException = e;
                throw e;
            }
        }
    }

    private static void loadNativeLibraries(String str) {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/mm7zip/SevenZip", "loadNativeLibraries", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/mm7zip/SevenZip", "loadNativeLibraries", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (Throwable unused) {
            throw new SevenZipNativeInitializationException();
        }
    }

    private static native void nativeCreateArchive(OutArchiveImpl<?> outArchiveImpl, ArchiveFormat archiveFormat);

    private static native int nativeGetVersionBuild();

    private static native String nativeGetVersionCopyright();

    private static native String nativeGetVersionDate();

    private static native int nativeGetVersionMajor();

    private static native int nativeGetVersionMinor();

    private static native String nativeGetVersionVersion();

    /* access modifiers changed from: private */
    public static native String nativeInitSevenZipLibrary();

    private static void nativeInitialization() {
        final String[] strArr = new String[1];
        final Throwable[] thArr = new Throwable[1];
        AccessController.doPrivileged(new PrivilegedAction<Void>() {
            public Void run() {
                try {
                    strArr[0] = SevenZip.nativeInitSevenZipLibrary();
                    return null;
                } catch (Throwable th) {
                    thArr[0] = th;
                    return null;
                }
            }
        });
        String str = strArr[0];
        if (str == null && thArr[0] == null) {
            initializationSuccessful = true;
            return;
        }
        if (str == null) {
            str = "No message";
        }
        SevenZipNativeInitializationException sevenZipNativeInitializationException = new SevenZipNativeInitializationException("Error initializing 7-Zip-JBinding: " + str, thArr[0]);
        lastInitializationException = sevenZipNativeInitializationException;
        throw sevenZipNativeInitializationException;
    }

    private static native IInArchive nativeOpenArchive(ArchiveFormat archiveFormat, IInStream iInStream, IArchiveOpenCallback iArchiveOpenCallback);

    public static IInArchive openInArchive(ArchiveFormat archiveFormat, IInStream iInStream, IArchiveOpenCallback iArchiveOpenCallback) {
        ensureLibraryIsInitialized();
        if (iArchiveOpenCallback == null) {
            iArchiveOpenCallback = new DummyOpenArchiveCallback();
        }
        if (archiveFormat != null) {
            return callNativeOpenArchive(archiveFormat, iInStream, iArchiveOpenCallback);
        }
        return callNativeOpenArchive((ArchiveFormat) null, iInStream, iArchiveOpenCallback);
    }

    public static IOutCreateArchive<IOutItemAllFormats> openOutArchive(ArchiveFormat archiveFormat) {
        return openOutArchiveIntern(archiveFormat);
    }

    public static IOutCreateArchive7z openOutArchive7z() {
        return (IOutCreateArchive7z) openOutArchiveIntern(ArchiveFormat.SEVEN_ZIP);
    }

    private static OutArchiveImpl<?> openOutArchiveIntern(ArchiveFormat archiveFormat) {
        ensureLibraryIsInitialized();
        if (archiveFormat.isOutArchiveSupported()) {
            try {
                OutArchiveImpl<?> outArchiveImpl = (OutArchiveImpl) archiveFormat.getOutArchiveImplementation().newInstance();
                nativeCreateArchive(outArchiveImpl, archiveFormat);
                return outArchiveImpl;
            } catch (Exception unused) {
                throw new IllegalStateException("Internal error: Can't create new instance of the class " + archiveFormat.getOutArchiveImplementation() + " using default constructor.");
            }
        } else {
            throw new IllegalStateException("Archive format '" + archiveFormat + "' doesn't support archive creation.");
        }
    }

    public static IOutCreateArchiveZip openOutArchiveZip() {
        return (IOutCreateArchiveZip) openOutArchiveIntern(ArchiveFormat.ZIP);
    }

    public static IInArchive openInArchive(ArchiveFormat archiveFormat, IInStream iInStream) {
        ensureLibraryIsInitialized();
        return callNativeOpenArchive(archiveFormat, iInStream, new DummyOpenArchiveCallback());
    }
}
