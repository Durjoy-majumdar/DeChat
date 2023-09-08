package nl2;

import ql2.C22095a;

/* renamed from: nl2.c */
public final class C21665c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21656b f61318d;

    public C21665c(C21656b bVar) {
        this.f61318d = bVar;
    }

    public final void run() {
        for (C22095a b : this.f61318d.f61291e) {
            b.mo35185b();
        }
        this.f61318d.f61291e.clear();
        for (C22095a b2 : this.f61318d.f61290d) {
            b2.mo35185b();
        }
        this.f61318d.f61290d.clear();
    }
}
