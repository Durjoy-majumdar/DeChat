package q34;

import l34.C117458j;
import n34.C117603a;
import n34.C117604b;

/* renamed from: q34.a */
public final class C118150a<T> extends C117458j<T> {

    /* renamed from: h */
    public final C117604b<? super T> f353171h;

    /* renamed from: i */
    public final C117604b<Throwable> f353172i;

    /* renamed from: j */
    public final C117603a f353173j;

    public C118150a(C117604b<? super T> bVar, C117604b<Throwable> bVar2, C117603a aVar) {
        this.f353171h = bVar;
        this.f353172i = bVar2;
        this.f353173j = aVar;
    }

    /* renamed from: a */
    public void mo122780a() {
        this.f353173j.call();
    }

    /* renamed from: b */
    public void mo122781b(T t) {
        this.f353171h.call(t);
    }

    public void onError(Throwable th) {
        this.f353172i.call(th);
    }
}
