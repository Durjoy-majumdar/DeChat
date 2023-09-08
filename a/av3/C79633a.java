package av3;

import java.io.Closeable;
import java.util.zip.ZipFile;

/* renamed from: av3.a */
public final class C79633a {
    /* renamed from: a */
    public static void m96712a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof AutoCloseable) {
                    ((AutoCloseable) obj).close();
                } else if (obj instanceof ZipFile) {
                    ((ZipFile) obj).close();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
