package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public final class IOUtils {

    public static final class zza extends ByteArrayOutputStream {
        private zza() {
        }

        public final void zza(byte[] bArr, int i) {
            System.arraycopy(this.buf, 0, bArr, i, this.count);
        }
    }

    public static final class zzb {
        private final File file;

        private zzb(File file2) {
            this.file = (File) Preconditions.checkNotNull(file2);
        }

        public final byte[] zzdd() {
            FileInputStream fileInputStream;
            Throwable th;
            try {
                fileInputStream = new FileInputStream(this.file);
                try {
                    byte[] zzb = IOUtils.zza((InputStream) fileInputStream, fileInputStream.getChannel().size());
                    IOUtils.closeQuietly((Closeable) fileInputStream);
                    return zzb;
                } catch (Throwable th4) {
                    th = th4;
                    IOUtils.closeQuietly((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                Throwable th6 = th5;
                fileInputStream = null;
                th = th6;
                IOUtils.closeQuietly((Closeable) fileInputStream);
                throw th;
            }
        }
    }

    private IOUtils() {
    }

    public static void close(Closeable closeable, String str, String str2) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, false);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z) {
        return copyStream(inputStream, outputStream, z, 1024);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    closeQuietly((Closeable) inputStream);
                    closeQuietly((Closeable) outputStream);
                }
            }
        }
        return j;
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & ExifInterface.MARKER) << 8) | (bArr[0] & ExifInterface.MARKER)) == 35615) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void lockAndTruncateFile(java.io.File r4) {
        /*
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0042
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x002d }
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch:{ all -> 0x002b }
            java.nio.channels.FileLock r0 = r4.lock()     // Catch:{ all -> 0x002b }
            r2 = 0
            r4.truncate(r2)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isValid()
            if (r4 == 0) goto L_0x0027
            r0.release()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            closeQuietly((java.io.Closeable) r1)
            return
        L_0x002b:
            r4 = move-exception
            goto L_0x002f
        L_0x002d:
            r4 = move-exception
            r1 = r0
        L_0x002f:
            if (r0 == 0) goto L_0x003c
            boolean r2 = r0.isValid()
            if (r2 == 0) goto L_0x003c
            r0.release()     // Catch:{ IOException -> 0x003b }
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            closeQuietly((java.io.Closeable) r1)
        L_0x0041:
            throw r4
        L_0x0042:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.IOUtils.lockAndTruncateFile(java.io.File):void");
    }

    public static byte[] readInputStreamFully(InputStream inputStream) {
        return readInputStreamFully(inputStream, true);
    }

    public static byte[] readInputStreamFully(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toByteArray(File file) {
        return new zzb(file).zzdd();
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zza(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static long zza(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* access modifiers changed from: private */
    public static byte[] zza(InputStream inputStream, long j) {
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("file is too large to fit in a byte array: ");
            sb.append(j);
            sb.append(" bytes");
            throw new OutOfMemoryError(sb.toString());
        } else if (j == 0) {
            return toByteArray(inputStream);
        } else {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            zza zza2 = new zza();
            zza2.write(read2);
            zza(inputStream, (OutputStream) zza2);
            byte[] copyOf = Arrays.copyOf(bArr, zza2.size() + i);
            zza2.zza(copyOf, i);
            return copyOf;
        }
    }
}
