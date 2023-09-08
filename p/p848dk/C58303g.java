package p848dk;

import java.util.Comparator;

/* renamed from: dk.g */
public class C58303g<T> {

    /* renamed from: a */
    public final C58304a<T> f166941a;

    /* renamed from: b */
    public final Comparator<T> f166942b;

    /* renamed from: c */
    public final C58305b f166943c;

    /* renamed from: d */
    public int f166944d = 0;

    /* renamed from: dk.g$b */
    public interface C58305b<T> {
    }

    public C58303g(Comparator<T> comparator, C58305b<T> bVar) {
        this.f166943c = bVar;
        this.f166941a = new C58304a<>();
        this.f166942b = comparator;
    }

    /* renamed from: dk.g$a */
    public static final class C58304a<T> {

        /* renamed from: a */
        public final T f166945a;

        /* renamed from: b */
        public C58304a<T> f166946b;

        /* renamed from: c */
        public C58304a<T> f166947c;

        public C58304a() {
            this.f166945a = null;
            this.f166946b = this;
            this.f166947c = this;
        }

        public C58304a(T t, C58304a<T> aVar, C58304a<T> aVar2) {
            this.f166945a = t;
            this.f166946b = aVar;
            this.f166947c = aVar2;
        }
    }
}
