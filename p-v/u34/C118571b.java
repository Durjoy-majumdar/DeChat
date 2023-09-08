package u34;

import java.util.ArrayList;
import l34.C117453e;
import m34.C117527b;
import o34.C117655d;
import u34.C118574e;

/* renamed from: u34.b */
public final class C118571b<T> extends C118572c<T, T> {

    /* renamed from: e */
    public final C118574e<T> f354853e;

    public C118571b(C117453e.C88376a<T> aVar, C118574e<T> eVar) {
        super(aVar);
        this.f354853e = eVar;
    }

    /* renamed from: a */
    public void mo122780a() {
        C118574e<T> eVar = this.f354853e;
        if (eVar.f354857e) {
            Object obj = C117655d.f351923b;
            for (C118574e.C118576b c : eVar.mo183330b(obj)) {
                c.mo183331c(obj, this.f354853e.f354861i);
            }
        }
    }

    /* renamed from: b */
    public void mo122781b(T t) {
        for (C118574e.C118576b b : ((C118574e.C118575a) this.f354853e.get()).f354866b) {
            b.mo122781b(t);
        }
    }

    public void onError(Throwable th) {
        C118574e<T> eVar = this.f354853e;
        if (eVar.f354857e) {
            C117655d.C117658c cVar = new C117655d.C117658c(th);
            ArrayList arrayList = null;
            for (C118574e.C118576b c : eVar.mo183330b(cVar)) {
                try {
                    c.mo183331c(cVar, this.f354853e.f354861i);
                } catch (Throwable th4) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th4);
                }
            }
            C117527b.m165773a(arrayList);
        }
    }
}
