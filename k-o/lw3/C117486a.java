package lw3;

import java.io.File;
import java.util.Comparator;

/* renamed from: lw3.a */
public class C117486a implements Comparator<File> {

    /* renamed from: d */
    public final /* synthetic */ C117487b f351590d;

    public C117486a(C117487b bVar) {
        this.f351590d = bVar;
    }

    public int compare(Object obj, Object obj2) {
        long a = C117487b.m165723a(this.f351590d, (File) obj);
        long a2 = C117487b.m165723a(this.f351590d, (File) obj2);
        if (a - a2 > 0) {
            return 1;
        }
        return a == a2 ? 0 : -1;
    }
}
