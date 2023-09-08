package l34;

import m34.C117527b;
import m34.C117530e;
import n34.C117604b;
import n34.C117605d;
import n34.C88900c;
import o34.C117659e;
import o34.C117668n;
import p34.C117932b;
import q34.C118150a;
import q34.C118157g;
import q34.C118162i;
import q34.C118164k;
import q34.C89453l;
import s34.C118265a;
import t34.C118366d;
import t34.C118370h;
import t34.C118375m;
import t34.C118378p;

/* renamed from: l34.e */
public class C117453e<T> {

    /* renamed from: d */
    public final C88376a<T> f351515d;

    /* renamed from: l34.e$a */
    public interface C88376a<T> extends C117604b<C117458j<? super T>> {
    }

    /* renamed from: l34.e$b */
    public interface C88377b<R, T> extends C117605d<C117458j<? super R>, C117458j<? super T>> {
    }

    /* renamed from: l34.e$c */
    public interface C88378c<T, R> extends C117605d<C117453e<T>, C117453e<R>> {
    }

    public C117453e(C88376a<T> aVar) {
        this.f351515d = aVar;
    }

    /* renamed from: c */
    public static <T> C117453e<T> m165660c(C88376a<T> aVar) {
        C117605d<C88376a, C88376a> dVar = C118375m.f353770b;
        if (dVar != null) {
            aVar = (C88376a) ((C118366d) dVar).call(aVar);
        }
        return new C117453e<>(aVar);
    }

    /* renamed from: d */
    public final <R> C117453e<R> mo182153d(C88377b<? extends R, ? super T> bVar) {
        return m165660c(new C117659e(this.f351515d, bVar));
    }

    /* renamed from: e */
    public final C117453e<T> mo182154e(C117456i iVar) {
        int i = C118157g.f353187e;
        if (!(this instanceof C89453l)) {
            return mo182153d(new C117668n(iVar, false, i));
        }
        C89453l lVar = (C89453l) this;
        return m165660c(new C89453l.C89454a(null, iVar instanceof C117932b ? new C118162i(lVar, (C117932b) iVar) : new C118164k(lVar, iVar)));
    }

    /* renamed from: f */
    public final C117459k mo182155f(C117458j<? super T> jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (this.f351515d != null) {
            jVar.mo182167f();
            if (!(jVar instanceof C118265a)) {
                jVar = new C118265a<>(jVar);
            }
            try {
                C88376a<T> aVar = this.f351515d;
                if (C118375m.f353772d != null) {
                    C118378p.f353781e.mo183168c().getClass();
                }
                aVar.call(jVar);
                C117605d<C117459k, C117459k> dVar = C118375m.f353776h;
                return dVar != null ? (C117459k) ((C118370h) dVar).call(jVar) : jVar;
            } catch (Throwable th) {
                C117527b.m165774b(th);
                C117530e eVar = new C117530e("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C118375m.m166986b(eVar);
                throw eVar;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    /* renamed from: g */
    public final C117459k mo182156g(C117604b<? super T> bVar, C117604b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (bVar2 != null) {
            return mo182155f(new C118150a(bVar, bVar2, C88900c.f256399a));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: h */
    public final C117459k mo182157h(C117458j<? super T> jVar) {
        try {
            jVar.mo182167f();
            C88376a<T> aVar = this.f351515d;
            if (C118375m.f353772d != null) {
                C118378p.f353781e.mo183168c().getClass();
            }
            aVar.call(jVar);
            C117605d<C117459k, C117459k> dVar = C118375m.f353776h;
            return dVar != null ? (C117459k) ((C118370h) dVar).call(jVar) : jVar;
        } catch (Throwable th) {
            C117527b.m165774b(th);
            C117530e eVar = new C117530e("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
            C118375m.m166986b(eVar);
            throw eVar;
        }
    }
}
