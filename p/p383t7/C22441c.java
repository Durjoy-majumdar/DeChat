package p383t7;

/* renamed from: t7.c */
public final class C22441c extends C22448i {

    /* renamed from: h */
    public final C22440b f63568h;

    public C22441c(C22440b bVar) {
        this.f63568h = bVar;
    }

    /* renamed from: i */
    public final void mo35589i() {
        C22440b bVar = this.f63568h;
        synchronized (bVar.f67265b) {
            bVar.mo36915e(this);
            if (!bVar.f67266c.isEmpty() && bVar.f67271h > 0) {
                bVar.f67265b.notify();
            }
        }
    }
}
