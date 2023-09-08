package p451b2;

import gy3.C8480h;
import gy3.C87412m;
import p175j0.C60667k2;

/* renamed from: b2.d0 */
public interface C104010d0 extends C60667k2<Object> {
    /* renamed from: c */
    boolean mo145608c();

    /* renamed from: b2.d0$a */
    public static final class C104011a implements C104010d0 {

        /* renamed from: d */
        public final Object f307634d;

        /* renamed from: e */
        public final boolean f307635e;

        public C104011a(Object obj, boolean z) {
            C87412m.m108594g(obj, "value");
            this.f307634d = obj;
            this.f307635e = z;
        }

        /* renamed from: c */
        public boolean mo145608c() {
            return this.f307635e;
        }

        public Object getValue() {
            return this.f307634d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C104011a(Object obj, boolean z, int i, C8480h hVar) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
