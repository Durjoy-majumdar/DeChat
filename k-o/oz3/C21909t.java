package oz3;

import gy3.C8480h;
import gy3.C87412m;
import rx3.C13603j;
import uz3.C22710d;

/* renamed from: oz3.t */
public final class C21909t {

    /* renamed from: b */
    public static final C21910a f61965b = new C21910a((C8480h) null);

    /* renamed from: a */
    public final String f61966a;

    /* renamed from: oz3.t$a */
    public static final class C21910a {
        public C21910a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C21909t mo34952a(C22710d dVar) {
            C87412m.m108594g(dVar, "signature");
            if (dVar instanceof C22710d.C22712b) {
                return mo34953b(dVar.mo35802c(), dVar.mo35801b());
            }
            if (dVar instanceof C22710d.C22711a) {
                String c = dVar.mo35802c();
                String b = dVar.mo35801b();
                C87412m.m108594g(c, "name");
                C87412m.m108594g(b, "desc");
                return new C21909t(c + '#' + b, (C8480h) null);
            }
            throw new C13603j();
        }

        /* renamed from: b */
        public final C21909t mo34953b(String str, String str2) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "desc");
            return new C21909t(str + str2, (C8480h) null);
        }
    }

    public C21909t(String str, C8480h hVar) {
        this.f61966a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21909t) && C87412m.m108589b(this.f61966a, ((C21909t) obj).f61966a);
    }

    public int hashCode() {
        return this.f61966a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f61966a + ')';
    }
}
