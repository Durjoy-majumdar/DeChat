package si3;

import java.io.File;
import java.io.IOException;

/* renamed from: si3.b */
public final class C90200b {
    /* renamed from: a */
    public static void m112896a(File file) {
        if (file != null) {
            if (file.exists()) {
                m112897b(file);
            }
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!file.createNewFile()) {
                throw new IOException("Create file fail, file already exists.");
            }
            return;
        }
        throw new IOException("File is null.");
    }

    /* renamed from: b */
    public static boolean m112897b(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m112898c(file) : m112899d(file);
    }

    /* renamed from: c */
    public static boolean m112898c(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            m112899d(file);
            return true;
        } else if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return true;
        } else {
            for (File c : listFiles) {
                m112898c(c);
            }
            m112899d(file);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m112899d(File file) {
        boolean z = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            file.getPath();
            z = file.delete();
            if (!z) {
                file.getPath();
                file.deleteOnExit();
            }
        }
        return z;
    }
}
