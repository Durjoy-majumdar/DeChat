package o34;

import l34.C117453e;
import l34.C117458j;
import m34.C117527b;
import n34.C117605d;
import t34.C118374l;
import t34.C118375m;

/* renamed from: o34.e */
public final class C117659e<T, R> implements C117453e.C88376a<R> {

    /* renamed from: d */
    public final C117453e.C88376a<T> f351926d;

    /* renamed from: e */
    public final C117453e.C88377b<? extends R, ? super T> f351927e;

    public C117659e(C117453e.C88376a<T> aVar, C117453e.C88377b<? extends R, ? super T> bVar) {
        this.f351926d = aVar;
        this.f351927e = bVar;
    }

    public void call(Object obj) {
        C117458j jVar;
        C117458j jVar2 = (C117458j) obj;
        try {
            C117453e.C88377b<? extends R, ? super T> bVar = this.f351927e;
            C117605d<C117453e.C88377b, C117453e.C88377b> dVar = C118375m.f353779k;
            if (dVar != null) {
                bVar = (C117453e.C88377b) ((C118374l) dVar).call(bVar);
            }
            jVar = (C117458j) bVar.call(jVar2);
            jVar.mo182167f();
            this.f351926d.call(jVar);
        } catch (Throwable th) {
            C117527b.m165774b(th);
            jVar2.onError(th);
        }
    }
}
