package qi3;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: qi3.e */
public class C89675e {
    /* renamed from: a */
    public static void m112124a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
