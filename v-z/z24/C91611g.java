package z24;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: z24.g */
public class C91611g implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f262455a;

    public C91611g(C91609f fVar, String str) {
        this.f262455a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f262455a);
    }
}
