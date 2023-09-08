package k24;

import java.io.File;
import java.io.IOException;

/* renamed from: k24.a */
public interface C117371a {

    /* renamed from: a */
    public static final C117371a f351376a = new C117372a();

    /* renamed from: k24.a$a */
    public class C117372a implements C117371a {
        /* renamed from: a */
        public void mo182049a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        /* renamed from: b */
        public void mo182050b(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo182050b(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        /* renamed from: c */
        public void mo182051c(File file, File file2) {
            mo182049a(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }
    }
}
