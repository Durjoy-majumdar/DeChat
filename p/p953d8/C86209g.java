package p953d8;

import java.io.File;

/* renamed from: d8.g */
public class C86209g implements Comparable<C86209g> {

    /* renamed from: d */
    public final String f250753d;

    /* renamed from: e */
    public final long f250754e;

    /* renamed from: f */
    public final long f250755f;

    /* renamed from: g */
    public final boolean f250756g;

    /* renamed from: h */
    public final File f250757h;

    /* renamed from: i */
    public final long f250758i;

    public C86209g(String str, long j, long j2, long j3, File file) {
        this.f250753d = str;
        this.f250754e = j;
        this.f250755f = j2;
        this.f250756g = file != null;
        this.f250757h = file;
        this.f250758i = j3;
    }

    /* renamed from: a */
    public int compareTo(C86209g gVar) {
        if (!this.f250753d.equals(gVar.f250753d)) {
            return this.f250753d.compareTo(gVar.f250753d);
        }
        int i = ((this.f250754e - gVar.f250754e) > 0 ? 1 : ((this.f250754e - gVar.f250754e) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}
