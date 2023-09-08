package p233s3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import sx3.C77813z;

/* renamed from: s3.p */
public final class C101526p {

    /* renamed from: a */
    public List<C101528b> f297254a = new ArrayList();

    /* renamed from: b */
    public List<C101528b> f297255b = new ArrayList();

    /* renamed from: c */
    public final List<C101528b> f297256c = new ArrayList();

    /* renamed from: d */
    public final List<Integer> f297257d = new ArrayList();

    /* renamed from: s3.p$a */
    public static final class C101527a {

        /* renamed from: a */
        public C101526p f297258a;
    }

    /* renamed from: s3.p$b */
    public static final class C101528b {

        /* renamed from: a */
        public long f297259a;

        /* renamed from: b */
        public long f297260b;

        /* renamed from: c */
        public C13617q f297261c;

        public C101528b(long j, long j2, C13617q qVar) {
            C87412m.m108594g(qVar, "state");
            this.f297259a = j;
            this.f297260b = j2;
            this.f297261c = qVar;
        }
    }

    public C101526p(C8480h hVar) {
    }

    /* renamed from: a */
    public final void mo141010a(long j, long j2, List<C13617q> list, List<C101528b> list2) {
        int size = list2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C101528b bVar = list2.get(size);
                long j3 = bVar.f297260b;
                if (j3 > 0 && j3 < j) {
                    list2.remove(size);
                } else if (bVar.f297259a < j2) {
                    ((ArrayList) this.f297256c).add(bVar);
                    if (C87412m.m108589b(list2, this.f297255b) && bVar.f297260b == -1) {
                        bVar.f297260b = System.nanoTime();
                    }
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        if (((ArrayList) this.f297256c).size() > 0) {
            int size2 = ((ArrayList) this.f297256c).size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!((ArrayList) this.f297257d).contains(Integer.valueOf(i2))) {
                    C101528b bVar2 = (C101528b) ((ArrayList) this.f297256c).get(i2);
                    int size3 = ((ArrayList) this.f297256c).size();
                    for (int i3 = i2 + 1; i3 < size3; i3++) {
                        C101528b bVar3 = (C101528b) ((ArrayList) this.f297256c).get(i3);
                        if (C87412m.m108589b(bVar2.f297261c.f38584a, bVar3.f297261c.f38584a)) {
                            if (bVar2.f297259a < bVar3.f297259a) {
                                ((ArrayList) this.f297257d).add(Integer.valueOf(i2));
                            } else {
                                ((ArrayList) this.f297257d).add(Integer.valueOf(i3));
                            }
                        }
                    }
                }
            }
            C77813z.m93908n(this.f297257d);
            for (int size4 = ((ArrayList) this.f297257d).size() - 1; -1 < size4; size4--) {
                ((ArrayList) this.f297256c).remove(((Number) ((ArrayList) this.f297257d).get(size4)).intValue());
            }
            int size5 = ((ArrayList) this.f297256c).size();
            for (int i4 = 0; i4 < size5; i4++) {
                list.add(((C101528b) ((ArrayList) this.f297256c).get(i4)).f297261c);
            }
            ((ArrayList) this.f297256c).clear();
            ((ArrayList) this.f297257d).clear();
        }
    }

    /* renamed from: b */
    public final void mo141011b() {
        synchronized (this.f297255b) {
            for (int size = ((ArrayList) this.f297255b).size() - 1; -1 < size; size--) {
                if (((C101528b) ((ArrayList) this.f297255b).get(size)).f297260b != -1) {
                    ((ArrayList) this.f297255b).remove(size);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public final List<C13617q> mo141012c(long j, long j2) {
        ArrayList arrayList;
        synchronized (this.f297255b) {
            arrayList = new ArrayList(((ArrayList) this.f297254a).size() + ((ArrayList) this.f297255b).size());
            mo141010a(j, j2, arrayList, this.f297254a);
            mo141010a(j, j2, arrayList, this.f297255b);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo141013d(String str, List<C101528b> list, long j) {
        synchronized (this.f297255b) {
            for (C101528b next : list) {
                if (C87412m.m108589b(next.f297261c.f38584a, str) && next.f297260b < 0) {
                    next.f297260b = j;
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
