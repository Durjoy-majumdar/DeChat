package p383t7;

import p404z6.C23455e;

/* renamed from: t7.h */
public final class C22447h extends C23455e implements Comparable<C22447h> {

    /* renamed from: i */
    public long f63570i;

    public C22447h() {
        super(1);
    }

    public int compareTo(Object obj) {
        C22447h hVar = (C22447h) obj;
        if (mo36910g(4) == hVar.mo36910g(4)) {
            int i = ((this.f67261g - hVar.f67261g) > 0 ? 1 : ((this.f67261g - hVar.f67261g) == 0 ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            if (i > 0) {
                return 1;
            }
        } else if (mo36910g(4)) {
            return 1;
        }
        return -1;
    }
}
