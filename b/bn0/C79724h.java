package bn0;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: bn0.h */
public class C79724h implements C79720d, Comparator<C79722f> {

    /* renamed from: d */
    public volatile long f233666d;

    /* renamed from: e */
    public final TreeSet<C79722f> f233667e = new TreeSet<>(this);

    /* renamed from: f */
    public long f233668f;

    public C79724h(long j) {
        this.f233666d = j;
    }

    /* renamed from: a */
    public void mo109827a(C79714a aVar, C79722f fVar) {
        this.f233667e.add(fVar);
        this.f233668f += fVar.f233660f;
        mo109849c(aVar, 0);
    }

    /* renamed from: b */
    public void mo109828b(C79714a aVar, C79722f fVar) {
        this.f233667e.remove(fVar);
        this.f233668f -= fVar.f233660f;
    }

    /* renamed from: c */
    public final void mo109849c(C79714a aVar, long j) {
        while (this.f233668f + j > this.f233666d && !this.f233667e.isEmpty()) {
            ((C79725i) aVar).mo109855f(this.f233667e.first());
        }
    }

    public int compare(Object obj, Object obj2) {
        C79722f fVar = (C79722f) obj;
        C79722f fVar2 = (C79722f) obj2;
        long j = fVar.f233665n;
        long j2 = fVar2.f233665n;
        return j - j2 == 0 ? fVar.compareTo(fVar2) : j < j2 ? -1 : 1;
    }
}
