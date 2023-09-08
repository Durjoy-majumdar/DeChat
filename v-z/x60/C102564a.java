package x60;

/* renamed from: x60.a */
public final class C102564a<T> {

    /* renamed from: a */
    public T f301995a;

    /* renamed from: b */
    public C102565b f301996b;

    public C102564a(String str) {
        this.f301995a = str;
        this.f301996b = C102565b.URI;
    }

    public boolean equals(Object obj) {
        T t = this.f301995a;
        if (t != null) {
            if ((t instanceof C15627c) && (obj instanceof C102564a)) {
                C102564a aVar = (C102564a) obj;
                if (aVar.f301995a instanceof C15627c) {
                    return ((C15627c) t).mo11841b().equals(((C15627c) aVar.f301995a).mo11841b());
                }
            }
            if (obj instanceof C102564a) {
                return t.equals(((C102564a) obj).f301995a);
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        T t = this.f301995a;
        return t != null ? t.hashCode() : super.hashCode();
    }

    public String toString() {
        T t = this.f301995a;
        return t == null ? "" : t instanceof C15627c ? ((C15627c) t).mo11841b() : t.toString();
    }

    public C102564a(C15627c cVar) {
        this.f301995a = cVar;
        this.f301996b = C102565b.URI;
    }

    public C102564a(String str, C102565b bVar) {
        this.f301995a = str;
        this.f301996b = bVar;
    }

    public C102564a(C15627c cVar, C102565b bVar) {
        this.f301995a = cVar;
        this.f301996b = bVar;
    }
}
