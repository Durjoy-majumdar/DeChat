package p1057w2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: w2.k */
public class C90886k {
    /* renamed from: a */
    public static void m114008a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m114009b(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean c = m114010c(file, inputStream);
                m114008a(inputStream);
                return c;
            } catch (Throwable th) {
                th = th;
                m114008a(inputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            m114008a(inputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public static boolean m114010c(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m114008a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    e.getMessage();
                    m114008a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m114008a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
                m114008a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            e.getMessage();
            m114008a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: d */
    public static File m114011d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static ByteBuffer m114012e(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
    }
}
