package p1036t3;

import java.io.File;
import java.io.FileFilter;

/* renamed from: t3.b */
public class C90370b implements FileFilter {
    public C90370b(C90371c cVar) {
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
