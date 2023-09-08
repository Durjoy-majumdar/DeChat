package p386u7;

import java.util.Collections;
import java.util.List;
import p333e8.C20528a;
import p383t7.C22439a;
import p383t7.C22442d;

/* renamed from: u7.f */
public final class C22609f implements C22442d {

    /* renamed from: d */
    public final List<C22439a> f65022d;

    public C22609f(List<C22439a> list) {
        this.f65022d = list;
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
        return j >= 0 ? this.f65022d : Collections.emptyList();
    }
}
