package q34;

import java.util.concurrent.atomic.AtomicBoolean;
import l34.C117453e;
import l34.C117454g;
import l34.C117458j;
import l34.C117459k;
import m34.C117527b;
import n34.C117603a;
import n34.C117605d;

/* renamed from: q34.l */
public final class C89453l<T> extends C117453e<T> {

    /* renamed from: q34.l$a */
    public static final class C89454a<T> implements C117453e.C88376a<T> {

        /* renamed from: d */
        public final C117605d<C117603a, C117459k> f257495d;

        public C89454a(T t, C117605d<C117603a, C117459k> dVar) {
            this.f257495d = dVar;
        }

        public void call(Object obj) {
            C117458j jVar = (C117458j) obj;
            jVar.mo182169h(new C89455b(jVar, null, this.f257495d));
        }
    }

    /* renamed from: q34.l$b */
    public static final class C89455b<T> extends AtomicBoolean implements C117454g, C117603a {

        /* renamed from: d */
        public final C117458j<? super T> f257496d;

        /* renamed from: e */
        public final T f257497e;

        /* renamed from: f */
        public final C117605d<C117603a, C117459k> f257498f;

        public C89455b(C117458j<? super T> jVar, T t, C117605d<C117603a, C117459k> dVar) {
            this.f257496d = jVar;
            this.f257497e = t;
            this.f257498f = dVar;
        }

        public void call() {
            C117458j<? super T> jVar = this.f257496d;
            if (!jVar.f351524d.f353197e) {
                T t = this.f257497e;
                try {
                    jVar.mo122781b(t);
                    if (!jVar.f351524d.f353197e) {
                        jVar.mo122780a();
                    }
                } catch (Throwable th) {
                    C117527b.m165776d(th, jVar, t);
                }
            }
        }

        /* renamed from: h */
        public void mo123768h(long j) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (i != 0 && compareAndSet(false, true)) {
                this.f257496d.mo182166e(this.f257498f.call(this));
            }
        }

        public String toString() {
            return "ScalarAsyncProducer[" + this.f257497e + ", " + get() + "]";
        }
    }

    static {
        Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    }
}
