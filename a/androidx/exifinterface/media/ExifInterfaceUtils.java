package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class ExifInterfaceUtils {
    private static final String TAG = "ExifInterfaceUtils";

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void close(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        public static FileDescriptor dup(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        public static long lseek(FileDescriptor fileDescriptor, long j, int i) {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    private ExifInterfaceUtils() {
    }

    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    public static void closeFileDescriptor(FileDescriptor fileDescriptor) {
        try {
            Api21Impl.close(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] convertToLongArray(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static long parseSubSeconds(String str) {
        try {
            int min = Math.min(str.length(), 3);
            long parseLong = Long.parseLong(str.substring(0, min));
            while (min < 3) {
                parseLong *= 10;
                min++;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }
}
