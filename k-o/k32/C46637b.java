package k32;

import hp3.C87581a;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import te3.C101820nt3;
import te3.C49335eu3;

/* renamed from: k32.b */
public abstract class C46637b<Req extends C101820nt3, Resp extends C49335eu3> {

    /* renamed from: a */
    public C89132b f125571a;

    /* renamed from: b */
    public Req f125572b;

    /* renamed from: c */
    public Resp f125573c;

    /* renamed from: a */
    public <T> C89059e<T> mo71901a(C87581a<T, C89132b.C89134c<Resp>> aVar) {
        mo71906f();
        this.f125573c = mo71902b();
        C89132b bVar = new C89132b();
        this.f125571a = bVar;
        Req req = this.f125572b;
        Resp resp = this.f125573c;
        if (req == null || resp == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("CgiBase called withoud req or resp req?[");
            boolean z = false;
            sb.append(req == null);
            sb.append("] resp?[");
            if (resp == null) {
                z = true;
            }
            sb.append(z);
            sb.append("]");
            throw new IllegalStateException(sb.toString());
        }
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = mo71903c();
        bVar2.f127068c = mo71904d();
        bVar2.f127066a = req;
        bVar2.f127067b = resp;
        bVar.mo123453j(bVar2.mo72403a());
        C89059e i = this.f125571a.mo9225i();
        i.mo123420E(new C46636a(this));
        return i.mo123062e(aVar);
    }

    /* renamed from: b */
    public abstract Resp mo71902b();

    /* renamed from: c */
    public abstract int mo71903c();

    /* renamed from: d */
    public abstract String mo71904d();

    /* renamed from: e */
    public void mo71905e() {
    }

    /* renamed from: f */
    public void mo71906f() {
    }
}
