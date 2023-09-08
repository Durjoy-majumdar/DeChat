package com.tencent.p014mm.vfs;

import android.os.ParcelFileDescriptor;
import com.tencent.stubs.logger.Log;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.tencent.mm.vfs.VFSNativeAPI */
final class VFSNativeAPI {
    private VFSNativeAPI() {
    }

    public static int openFd(String str, int i) {
        String str2;
        if ((i & -1604) == 0) {
            int i2 = i & 3;
            if (i2 == 0) {
                str2 = "r";
            } else if (i2 == 1) {
                str2 = "w";
            } else if (i2 == 2) {
                str2 = "rw";
            } else {
                throw new IllegalArgumentException("Invalid access mode: " + i);
            }
            if ((i & 512) != 0) {
                str2 = str2 + "t";
            }
            if ((i & 1024) != 0) {
                str2 = str2 + "a";
            }
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                parcelFileDescriptor = C86013q1.m106465z(str, str2);
                if (parcelFileDescriptor != null) {
                    int detachFd = parcelFileDescriptor.detachFd();
                    C116299g2.m163847c(parcelFileDescriptor);
                    return detachFd;
                }
            } catch (IOException e) {
                Log.m106499e("VFS.VFSNativeAPI", (Throwable) e, "Failed to open file descriptor for file: " + str);
            } catch (Throwable th) {
                C116299g2.m163847c((Closeable) null);
                throw th;
            }
            C116299g2.m163847c(parcelFileDescriptor);
            return -1;
        }
        throw new IllegalArgumentException("Flags unsupported: " + i);
    }
}
