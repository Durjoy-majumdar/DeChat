package p957e6;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

/* renamed from: e6.d */
public class C86446d {

    /* renamed from: e6.d$b */
    public static final class C86448b implements Comparator<File> {
        public C86448b(C86447a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }
    }

    /* renamed from: a */
    public static void m107124a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " is not directory!");
            }
        } else if (!file.mkdirs()) {
            throw new IOException(String.format("Directory %s can't be created", new Object[]{file.getAbsolutePath()}));
        }
    }
}
