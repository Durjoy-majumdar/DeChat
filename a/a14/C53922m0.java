package a14;

import gy3.C8480h;
import gy3.C87412m;
import wx3.C66206a;
import wx3.C66212f;

/* renamed from: a14.m0 */
public final class C53922m0 extends C66206a {

    /* renamed from: e */
    public static final C53923a f151175e = new C53923a((C8480h) null);

    /* renamed from: d */
    public final String f151176d;

    /* renamed from: a14.m0$a */
    public static final class C53923a implements C66212f.C15602c<C53922m0> {
        public C53923a(C8480h hVar) {
        }
    }

    public C53922m0(String str) {
        super(f151175e);
        this.f151176d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C53922m0) && C87412m.m108589b(this.f151176d, ((C53922m0) obj).f151176d);
    }

    public int hashCode() {
        return this.f151176d.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f151176d + ')';
    }
}
