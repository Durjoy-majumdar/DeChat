package ci2;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: ci2.c */
public final class C104379c {

    /* renamed from: a */
    public C104379c f309013a;

    /* renamed from: b */
    public final LinkedList<C104379c> f309014b;

    /* renamed from: c */
    public long f309015c;

    /* renamed from: d */
    public long f309016d;

    /* renamed from: e */
    public boolean f309017e;

    public C104379c() {
        this(0, 1, (C8480h) null);
    }

    public C104379c(long j, int i, C8480h hVar) {
        j = (i & 1) != 0 ? 0 : j;
        this.f309014b = new LinkedList<>();
        this.f309016d = j;
        this.f309017e = true;
    }

    /* renamed from: a */
    public final long mo146044a() {
        if (this.f309017e) {
            C104379c cVar = this.f309013a;
            this.f309016d = (cVar != null ? cVar.mo146044a() : 0) + this.f309015c;
            mo146045b(false);
        }
        return this.f309016d;
    }

    /* renamed from: b */
    public final void mo146045b(boolean z) {
        if (this.f309017e != z) {
            this.f309017e = z;
            if (z) {
                for (C104379c b : this.f309014b) {
                    b.mo146045b(z);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo146046c(long j) {
        if (this.f309015c != j) {
            this.f309015c = j;
            mo146045b(true);
        }
    }

    /* renamed from: d */
    public final void mo146047d(C104379c cVar) {
        LinkedList<C104379c> linkedList;
        LinkedList<C104379c> linkedList2;
        if (!C87412m.m108589b(this.f309013a, cVar)) {
            C104379c cVar2 = this.f309013a;
            if (!(cVar2 == null || (linkedList2 = cVar2.f309014b) == null)) {
                linkedList2.remove(this);
            }
            this.f309013a = cVar;
            if (!(cVar == null || (linkedList = cVar.f309014b) == null)) {
                linkedList.add(this);
            }
            mo146045b(true);
        }
    }
}
