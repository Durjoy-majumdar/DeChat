package x91;

import gy3.C8480h;
import gy3.C87412m;
import te3.C110962fr1;
import te3.C118429er1;

/* renamed from: x91.c */
public final class C23068c {

    /* renamed from: a */
    public static final C23069a f66279a = new C23069a((C8480h) null);

    /* renamed from: x91.c$a */
    public static final class C23069a {
        public C23069a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo36469a(C110962fr1 fr12, long j) {
            if (fr12 != null && !fr12.f331975g.isEmpty()) {
                C118429er1 last = fr12.f331975g.getLast();
                long j2 = j - last.f353986e;
                if (j2 < 0) {
                    j2 = 0;
                }
                last.f353987f = j2;
                if (fr12.f331975g.size() != 1) {
                    for (int size = fr12.f331975g.size() - 1; size > 0; size--) {
                        C118429er1 er12 = fr12.f331975g.get(size - 1);
                        C87412m.m108593f(er12, "fuzzyPath.pages[i - 1]");
                        C118429er1 er13 = er12;
                        if (er13.f353987f <= 0) {
                            long j3 = fr12.f331975g.get(size).f353986e - er13.f353986e;
                            if (j3 < 0) {
                                j3 = 0;
                            }
                            er13.f353987f = j3;
                        }
                    }
                }
            }
        }
    }
}
