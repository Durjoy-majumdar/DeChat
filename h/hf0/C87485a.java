package hf0;

import cf0.C80030i;

/* renamed from: hf0.a */
public class C87485a {

    /* renamed from: a */
    public final C80030i<Void> f253474a;

    /* renamed from: b */
    public final C80030i<Void> f253475b;

    /* renamed from: c */
    public final long f253476c;

    public C87485a(C80030i<Void> iVar, C80030i<Void> iVar2, long j) {
        this.f253474a = iVar;
        this.f253475b = iVar2;
        this.f253476c = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C87485a.class != obj.getClass()) {
            return false;
        }
        C87485a aVar = (C87485a) obj;
        C80030i<Void> iVar = this.f253475b;
        if (iVar == null) {
            if (aVar.f253475b != null) {
                return false;
            }
        } else if (!iVar.equals(aVar.f253475b)) {
            return false;
        }
        C80030i<Void> iVar2 = this.f253474a;
        if (iVar2 == null) {
            if (aVar.f253474a != null) {
                return false;
            }
        } else if (!iVar2.equals(aVar.f253474a)) {
            return false;
        }
        return this.f253476c == aVar.f253476c;
    }

    public int hashCode() {
        C80030i<Void> iVar = this.f253475b;
        int i = 0;
        int hashCode = ((iVar == null ? 0 : iVar.hashCode()) + 31) * 31;
        C80030i<Void> iVar2 = this.f253474a;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        long j = this.f253476c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
