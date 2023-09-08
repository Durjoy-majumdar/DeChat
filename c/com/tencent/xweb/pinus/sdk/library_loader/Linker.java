package com.tencent.xweb.pinus.sdk.library_loader;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import com.tencent.xweb.util.XWebLog;
import j20.C117292a;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k20.C9556a;

public abstract class Linker {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean DEBUG = true;
    public static final String EXTRA_LINKER_SHARED_RELROS = "org.chromium.base.android.linker.shared_relros";
    public static final String LINKER_JNI_LIBRARY = "xweb_linker";
    private static final String TAG = "Linker";
    public static final Object sLock = new Object();
    private static Linker sSingleton;
    private byte _hellAccFlag_;
    public long mBaseLoadAddress = -1;
    public boolean mInBrowserProcess = true;
    public LibInfo mLibInfo;
    public int mState = 0;
    public boolean mWaitForSharedRelros;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int DONE = 3;
        public static final int DONE_PROVIDE_RELRO = 2;
        public static final int INITIALIZED = 1;
        public static final int UNINITIALIZED = 0;
    }

    public static Linker getInstance() {
        Linker linker;
        synchronized (sLock) {
            if (sSingleton == null) {
                sSingleton = new LegacyLinker();
            }
            linker = sSingleton;
        }
        return linker;
    }

    public static long getRandomBaseLoadAddress() {
        long nativeGetRandomBaseLoadAddress = nativeGetRandomBaseLoadAddress();
        XWebLog.m21911i(TAG, String.format("Random native base load address: 0x%x", new Object[]{Long.valueOf(nativeGetRandomBaseLoadAddress)}));
        return nativeGetRandomBaseLoadAddress;
    }

    private void loadLinkerJniLibraryLocked() {
        XWebLog.m21911i(TAG, String.format("Loading lib%s.so", new Object[]{LINKER_JNI_LIBRARY}));
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(LINKER_JNI_LIBRARY);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/pinus/sdk/library_loader/Linker", "loadLinkerJniLibraryLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/xweb/pinus/sdk/library_loader/Linker", "loadLinkerJniLibraryLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private static native long nativeGetRandomBaseLoadAddress();

    private void setupBaseLoadAddressLocked() {
        if (this.mBaseLoadAddress == -1) {
            long randomBaseLoadAddress = getRandomBaseLoadAddress();
            this.mBaseLoadAddress = randomBaseLoadAddress;
            if (randomBaseLoadAddress == 0) {
                XWebLog.m21913w(TAG, "Disabling shared RELROs due address space pressure");
                this.mWaitForSharedRelros = false;
            }
        }
    }

    public abstract int createMemroyFile(String str);

    public final void disableSharedRelros() {
        XWebLog.m21911i(TAG, "disableSharedRelros() called");
        synchronized (sLock) {
            this.mInBrowserProcess = false;
            ensureInitializedLocked();
            this.mWaitForSharedRelros = false;
        }
    }

    public final void ensureInitializedLocked() {
        if (this.mState == 0) {
            loadLinkerJniLibraryLocked();
            if (this.mInBrowserProcess) {
                setupBaseLoadAddressLocked();
            }
            this.mState = 1;
        }
    }

    public final long getBaseLoadAddress() {
        long j;
        synchronized (sLock) {
            ensureInitializedLocked();
            setupBaseLoadAddressLocked();
            XWebLog.m21911i(TAG, String.format("getBaseLoadAddress() returns 0x%x", new Object[]{Long.valueOf(this.mBaseLoadAddress)}));
            j = this.mBaseLoadAddress;
        }
        return j;
    }

    public final Bundle getSharedRelros() {
        synchronized (sLock) {
            if (this.mState == 2) {
                Bundle bundle = this.mLibInfo.toBundle();
                XWebLog.m21911i(TAG, String.format("getSharedRelros() = %s", new Object[]{bundle.toString()}));
                return bundle;
            }
            XWebLog.m21911i(TAG, "getSharedRelros() = null");
            return null;
        }
    }

    public final void initServiceProcess(long j) {
        XWebLog.m21911i(TAG, String.format("initServiceProcess(0x%x) called", new Object[]{Long.valueOf(j)}));
        synchronized (sLock) {
            ensureInitializedLocked();
            this.mInBrowserProcess = false;
            this.mWaitForSharedRelros = true;
            this.mBaseLoadAddress = j;
        }
    }

    public final void loadLibrary(String str, boolean z) {
        XWebLog.m21911i(TAG, String.format("loadLibrary: %s", new Object[]{str}));
        synchronized (sLock) {
            loadLibraryImplLocked(str, z);
        }
    }

    public final void loadLibraryByFd(String str, boolean z, int i, boolean z2) {
        XWebLog.m21911i(TAG, String.format("loadLibrary: %s, fd: %d", new Object[]{str, Integer.valueOf(i)}));
        synchronized (sLock) {
            loadLibraryByFdImplLocked(str, z, i, z2);
        }
    }

    public abstract void loadLibraryByFdImplLocked(String str, boolean z, int i, boolean z2);

    public abstract void loadLibraryImplLocked(String str, boolean z);

    public final void provideSharedRelros(Bundle bundle) {
        XWebLog.m21911i(TAG, String.format("provideSharedRelros() called with %s", new Object[]{bundle}));
        Object obj = sLock;
        synchronized (obj) {
            this.mLibInfo = LibInfo.fromBundle(bundle);
            obj.notifyAll();
        }
    }

    public void setApkFilePath(String str) {
    }

    public final void waitForSharedRelrosLocked() {
        XWebLog.m21911i(TAG, "waitForSharedRelros() called");
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.mLibInfo == null) {
            try {
                sLock.wait();
            } catch (InterruptedException unused) {
            }
        }
        XWebLog.m21911i(TAG, String.format("Time to wait for shared RELRO: %d ms", new Object[]{Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)}));
    }

    public static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new Parcelable.Creator<LibInfo>() {
            public LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }

            public LibInfo[] newArray(int i) {
                return new LibInfo[i];
            }
        };
        private static final String EXTRA_LINKER_LIB_INFO = "libinfo";
        public String mLibFilePath;
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd = -1;
        public long mRelroSize;
        public long mRelroStart;

        public LibInfo() {
        }

        public static void closeQuietly(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }

        public static LibInfo fromBundle(Bundle bundle) {
            return (LibInfo) bundle.getParcelable(EXTRA_LINKER_LIB_INFO);
        }

        public void close() {
            int i = this.mRelroFd;
            if (i >= 0) {
                closeQuietly(ParcelFileDescriptor.adoptFd(i));
                this.mRelroFd = -1;
            }
        }

        public int describeContents() {
            return 1;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(EXTRA_LINKER_LIB_INFO, this);
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mLibFilePath);
            parcel.writeLong(this.mLoadAddress);
            parcel.writeLong(this.mLoadSize);
            parcel.writeLong(this.mRelroStart);
            parcel.writeLong(this.mRelroSize);
            parcel.writeInt(this.mRelroFd >= 0 ? 1 : 0);
            int i2 = this.mRelroFd;
            if (i2 >= 0) {
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i2);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e) {
                    XWebLog.m21910e(Linker.TAG, "Can't write LibInfo file descriptor to parcel", e);
                }
            }
        }

        public LibInfo(Parcel parcel) {
            this.mLibFilePath = parcel.readString();
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            if (parcel.readInt() != 0) {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                if (parcelFileDescriptor != null) {
                    this.mRelroFd = parcelFileDescriptor.detachFd();
                    return;
                }
                return;
            }
            this.mRelroFd = -1;
        }
    }
}
