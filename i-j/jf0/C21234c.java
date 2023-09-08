package jf0;

import kf0.C21331a;
import kf0.C21332b;

/* renamed from: jf0.c */
public class C21234c implements C21332b<Integer> {

    /* renamed from: a */
    public int f60031a;

    /* renamed from: b */
    public int f60032b;

    /* renamed from: c */
    public C21331a f60033c;

    /* renamed from: jf0.c$a */
    public class C21235a implements C21331a {
        public C21235a(C21234c cVar) {
        }

        /* renamed from: a */
        public String mo33229a(String str) {
            return str;
        }
    }

    public C21234c(int i, int i2, C21331a aVar) {
        this.f60033c = aVar;
        if (aVar == null) {
            this.f60033c = new C21235a(this);
        }
        this.f60031a = i;
        this.f60032b = i2;
    }

    /* renamed from: a */
    public String mo33223a(int i) {
        Integer b = getItem(i);
        return this.f60033c.mo33229a(b == null ? "" : b.toString());
    }

    /* renamed from: b */
    public Integer getItem(int i) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        return Integer.valueOf(this.f60031a + i);
    }

    /* renamed from: c */
    public int mo33227c() {
        return this.f60032b;
    }

    /* renamed from: d */
    public int mo33228d() {
        return this.f60031a;
    }

    public int getItemsCount() {
        return (this.f60032b - this.f60031a) + 1;
    }

    public C21234c(int i, int i2) {
        this.f60033c = new C21235a(this);
        this.f60031a = i;
        this.f60032b = i2;
    }
}
