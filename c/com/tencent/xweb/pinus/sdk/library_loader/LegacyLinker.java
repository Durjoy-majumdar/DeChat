package com.tencent.xweb.pinus.sdk.library_loader;

import com.tencent.xweb.pinus.sdk.library_loader.Linker;
import com.tencent.xweb.util.XWebLog;

public class LegacyLinker extends Linker {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "LegacyLinker";

    private static native boolean nativeAddZipArchivePath(String str);

    private static native int nativeCreateMemoryFile(String str);

    private static native boolean nativeCreateSharedRelro(String str, long j, Linker.LibInfo libInfo);

    private static native boolean nativeLoadLibrary(String str, long j, Linker.LibInfo libInfo);

    private static native boolean nativeLoadLibraryByFd(String str, long j, int i, boolean z);

    private static native boolean nativeUseSharedRelro(String str, Linker.LibInfo libInfo);

    private static void useSharedRelrosLocked(Linker.LibInfo libInfo) {
        String str = libInfo.mLibFilePath;
        if (!nativeUseSharedRelro(str, libInfo)) {
            XWebLog.m21913w(TAG, String.format("Could not use shared RELRO section for %s", new Object[]{str}));
            return;
        }
        XWebLog.m21911i(TAG, String.format("Using shared RELRO section for %s", new Object[]{str}));
    }

    public int createMemroyFile(String str) {
        ensureInitializedLocked();
        return nativeCreateMemoryFile(str);
    }

    public void loadLibraryByFdImplLocked(String str, boolean z, int i, boolean z2) {
        ensureInitializedLocked();
        if (nativeLoadLibraryByFd(str, z ? this.mBaseLoadAddress : 0, i, z2)) {
            this.mState = 3;
            return;
        }
        String str2 = "Unable to load library: " + str;
        XWebLog.m21909e(TAG, str2);
        throw new UnsatisfiedLinkError(str2);
    }

    public void loadLibraryImplLocked(String str, boolean z) {
        ensureInitializedLocked();
        boolean z2 = this.mInBrowserProcess;
        long j = z ? this.mBaseLoadAddress : 0;
        Linker.LibInfo libInfo = new Linker.LibInfo();
        if (nativeLoadLibrary(str, j, libInfo)) {
            libInfo.mLibFilePath = str;
            if (z2) {
                if (!nativeCreateSharedRelro(str, this.mBaseLoadAddress, libInfo)) {
                    XWebLog.m21913w(TAG, String.format("Could not create shared RELRO for %s at %x", new Object[]{str, Long.valueOf(this.mBaseLoadAddress)}));
                    libInfo.mRelroFd = -1;
                } else {
                    XWebLog.m21911i(TAG, String.format("Created shared RELRO for %s at %x: %s", new Object[]{str, Long.valueOf(this.mBaseLoadAddress), libInfo}));
                }
                this.mLibInfo = libInfo;
                useSharedRelrosLocked(libInfo);
                this.mState = 2;
            } else if (this.mWaitForSharedRelros) {
                waitForSharedRelrosLocked();
                useSharedRelrosLocked(this.mLibInfo);
                this.mLibInfo.close();
                this.mLibInfo = null;
                this.mState = 3;
            } else {
                this.mState = 3;
            }
        } else {
            String str2 = "Unable to load library: " + str;
            XWebLog.m21909e(TAG, str2);
            throw new UnsatisfiedLinkError(str2);
        }
    }

    public void setApkFilePath(String str) {
        synchronized (Linker.sLock) {
            ensureInitializedLocked();
            nativeAddZipArchivePath(str);
        }
    }
}
