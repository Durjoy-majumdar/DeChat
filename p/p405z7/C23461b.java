package p405z7;

import java.util.Collections;
import java.util.List;
import p333e8.C20528a;
import p383t7.C22439a;
import p383t7.C22442d;

/* renamed from: z7.b */
public final class C23461b implements C22442d {

    /* renamed from: e */
    public static final C23461b f67286e = new C23461b();

    /* renamed from: d */
    public final List<C22439a> f67287d;

    public C23461b(C22439a aVar) {
        this.f67287d = Collections.singletonList(aVar);
    }

    /* renamed from: a */
    public long mo14896a(int i) {
        C20528a.m22237a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public int mo14897b() {
        return 1;
    }

    /* renamed from: c */
    public int mo14898c(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: e */
    public List<C22439a> mo14899e(long j) {
        return j >= 0 ? this.f67287d : Collections.emptyList();
    }

    public C23461b() {
        this.f67287d = Collections.emptyList();
    }
}
