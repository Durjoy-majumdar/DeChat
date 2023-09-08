package p1014o4;

import android.os.Build;

/* renamed from: o4.c */
public final class C117682c {

    /* renamed from: i */
    public static final C117682c f351994i = new C117682c(new C117683a());

    /* renamed from: a */
    public C117695n f351995a;

    /* renamed from: b */
    public boolean f351996b;

    /* renamed from: c */
    public boolean f351997c;

    /* renamed from: d */
    public boolean f351998d;

    /* renamed from: e */
    public boolean f351999e;

    /* renamed from: f */
    public long f352000f;

    /* renamed from: g */
    public long f352001g;

    /* renamed from: h */
    public C117684d f352002h;

    /* renamed from: o4.c$a */
    public static final class C117683a {

        /* renamed from: a */
        public C117684d f352003a = new C117684d();
    }

    public C117682c() {
        this.f351995a = C117695n.NOT_REQUIRED;
        this.f352000f = -1;
        this.f352001g = -1;
        this.f352002h = new C117684d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C117682c.class != obj.getClass()) {
            return false;
        }
        C117682c cVar = (C117682c) obj;
        if (this.f351996b == cVar.f351996b && this.f351997c == cVar.f351997c && this.f351998d == cVar.f351998d && this.f351999e == cVar.f351999e && this.f352000f == cVar.f352000f && this.f352001g == cVar.f352001g && this.f351995a == cVar.f351995a) {
            return this.f352002h.equals(cVar.f352002h);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f352000f;
        long j2 = this.f352001g;
        return (((((((((((((this.f351995a.hashCode() * 31) + (this.f351996b ? 1 : 0)) * 31) + (this.f351997c ? 1 : 0)) * 31) + (this.f351998d ? 1 : 0)) * 31) + (this.f351999e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f352002h.hashCode();
    }

    public C117682c(C117683a aVar) {
        C117695n nVar = C117695n.NOT_REQUIRED;
        this.f351995a = nVar;
        this.f352000f = -1;
        this.f352001g = -1;
        this.f352002h = new C117684d();
        aVar.getClass();
        this.f351996b = false;
        int i = Build.VERSION.SDK_INT;
        this.f351997c = false;
        this.f351995a = nVar;
        this.f351998d = false;
        this.f351999e = false;
        if (i >= 24) {
            this.f352002h = aVar.f352003a;
            this.f352000f = -1;
            this.f352001g = -1;
        }
    }

    public C117682c(C117682c cVar) {
        this.f351995a = C117695n.NOT_REQUIRED;
        this.f352000f = -1;
        this.f352001g = -1;
        this.f352002h = new C117684d();
        this.f351996b = cVar.f351996b;
        this.f351997c = cVar.f351997c;
        this.f351995a = cVar.f351995a;
        this.f351998d = cVar.f351998d;
        this.f351999e = cVar.f351999e;
        this.f352002h = cVar.f352002h;
    }
}
