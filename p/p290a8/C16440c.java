package p290a8;

import java.util.Collections;
import java.util.List;
import p333e8.C20528a;
import p383t7.C22439a;
import p383t7.C22442d;

/* renamed from: a8.c */
public final class C16440c implements C22442d {

    /* renamed from: d */
    public final List<C22439a> f43866d;

    public C16440c(List<C22439a> list) {
        this.f43866d = Collections.unmodifiableList(list);
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
        return j >= 0 ? this.f43866d : Collections.emptyList();
    }
}
