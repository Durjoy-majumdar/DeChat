package o34;

import l34.C117453e;
import l34.C117454g;
import l34.C117458j;
import m34.C117527b;
import m34.C117531g;
import n34.C117605d;
import t34.C118375m;

/* renamed from: o34.f */
public final class C117660f<T, R> implements C117453e.C88376a<R> {

    /* renamed from: d */
    public final C117453e<T> f351928d;

    /* renamed from: e */
    public final C117605d<? super T, ? extends R> f351929e;

    /* renamed from: o34.f$a */
    public static final class C117661a<T, R> extends C117458j<T> {

        /* renamed from: h */
        public final C117458j<? super R> f351930h;

        /* renamed from: i */
        public final C117605d<? super T, ? extends R> f351931i;

        /* renamed from: j */
        public boolean f351932j;

        public C117661a(C117458j<? super R> jVar, C117605d<? super T, ? extends R> dVar) {
            this.f351930h = jVar;
            this.f351931i = dVar;
        }

        /* renamed from: a */
        public void mo122780a() {
            if (!this.f351932j) {
                this.f351930h.mo122780a();
            }
        }

        /* renamed from: b */
        public void mo122781b(T t) {
            try {
                this.f351930h.mo122781b(this.f351931i.call(t));
            } catch (Throwable th) {
                C117527b.m165774b(th);
                mo182165d();
                onError(C117531g.m165777a(th, t));
            }
        }

        /* renamed from: h */
        public void mo182169h(C117454g gVar) {
            this.f351930h.mo182169h(gVar);
        }

        public void onError(Throwable th) {
            if (this.f351932j) {
                C118375m.m166985a(th);
                return;
            }
            this.f351932j = true;
            this.f351930h.onError(th);
        }
    }

    public C117660f(C117453e<T> eVar, C117605d<? super T, ? extends R> dVar) {
        this.f351928d = eVar;
        this.f351929e = dVar;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117661a aVar = new C117661a(jVar, this.f351929e);
        jVar.mo182166e(aVar);
        this.f351928d.mo182157h(aVar);
    }
}
