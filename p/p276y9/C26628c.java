package p276y9;

import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1224z9.C119087b;
import p291aa.C23628g;

/* renamed from: y9.c */
public class C26628c extends C26632h implements Comparable<C26628c> {

    /* renamed from: h */
    public final String f74070h;

    /* renamed from: i */
    public final long f74071i;

    /* renamed from: j */
    public long f74072j;

    /* renamed from: n */
    public C23280d[] f74073n;

    /* renamed from: o */
    public C23280d[] f74074o;

    /* renamed from: p */
    public int f74075p;

    /* renamed from: q */
    public C23628g<C26629a> f74076q = new C23628g<>();

    /* renamed from: r */
    public Set<C26628c> f74077r = new HashSet();

    /* renamed from: y9.c$a */
    public static class C26629a {

        /* renamed from: a */
        public List<C26632h> f74078a = new ArrayList();
    }

    public C26628c(long j, C26636m mVar, String str, long j2) {
        super(j, mVar);
        this.f74070h = str;
        this.f74071i = j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C26628c) && compareTo((C26628c) obj) == 0;
    }

    /* renamed from: g */
    public final int compareTo(C26628c cVar) {
        if (this.f74093d == cVar.f74093d) {
            return 0;
        }
        int compareTo = this.f74070h.compareTo(cVar.f74070h);
        return compareTo != 0 ? compareTo : this.f74093d - cVar.f74093d > 0 ? 1 : -1;
    }

    /* renamed from: h */
    public Map<C23280d, Object> mo53615h() {
        HashMap hashMap = new HashMap();
        ((C119087b) mo53630a()).f356638f = this.f74071i;
        short f = ((C119087b) mo53630a()).mo183760f() & 65535;
        for (int i = 0; i < f; i++) {
            C23280d dVar = this.f74074o[i];
            mo53631e();
            ((C119087b) mo53630a()).mo183757c();
            hashMap.put(dVar, mo53632f(dVar.f66911a));
        }
        return hashMap;
    }

    public int hashCode() {
        return this.f74070h.hashCode();
    }

    /* renamed from: i */
    public C26628c mo53617i() {
        return this.f74095f.f74087i.mo53635b(this.f74072j);
    }

    public final String toString() {
        return this.f74070h.replace(XVFSFile.SEPARATOR_CHAR, '.');
    }
}
