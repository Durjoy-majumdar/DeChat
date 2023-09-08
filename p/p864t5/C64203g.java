package p864t5;

import gy3.C8480h;

/* renamed from: t5.g */
public final class C64203g {

    /* renamed from: a */
    public final boolean f181929a;

    /* renamed from: b */
    public final boolean f181930b;

    /* renamed from: c */
    public final boolean f181931c;

    public C64203g() {
        this(false, false, false, 7, (C8480h) null);
    }

    public C64203g(boolean z, boolean z2, boolean z3, int i, C8480h hVar) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? true : z3;
        this.f181929a = z;
        this.f181930b = z2;
        this.f181931c = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64203g)) {
            return false;
        }
        C64203g gVar = (C64203g) obj;
        return this.f181929a == gVar.f181929a && this.f181930b == gVar.f181930b && this.f181931c == gVar.f181931c;
    }

    public int hashCode() {
        boolean z = this.f181929a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f181930b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f181931c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ImageLoaderOptions(addLastModifiedToFileCacheKey=" + this.f181929a + ", launchInterceptorChainOnMainThread=" + this.f181930b + ", networkObserverEnabled=" + this.f181931c + ')';
    }
}
