package f82;

import gy3.C8480h;
import gy3.C87412m;
import q82.C110374a;

/* renamed from: f82.c */
public interface C107494c {

    /* renamed from: f82.c$a */
    public static final class C107495a {

        /* renamed from: a */
        public final String f321608a;

        /* renamed from: b */
        public final C110374a.C110375a f321609b;

        /* renamed from: c */
        public final int f321610c;

        /* renamed from: d */
        public final int f321611d;

        /* renamed from: e */
        public final boolean f321612e;

        /* renamed from: f */
        public final int f321613f;

        public C107495a(String str, C110374a.C110375a aVar, int i, int i2, boolean z, int i3) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(aVar, "dataBuffer");
            this.f321608a = str;
            this.f321609b = aVar;
            this.f321610c = i;
            this.f321611d = i2;
            this.f321612e = z;
            this.f321613f = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C107495a)) {
                return false;
            }
            C107495a aVar = (C107495a) obj;
            return C87412m.m108589b(this.f321608a, aVar.f321608a) && C87412m.m108589b(this.f321609b, aVar.f321609b) && this.f321610c == aVar.f321610c && this.f321611d == aVar.f321611d && this.f321612e == aVar.f321612e && this.f321613f == aVar.f321613f;
        }

        public int hashCode() {
            int hashCode = ((((((this.f321608a.hashCode() * 31) + this.f321609b.hashCode()) * 31) + this.f321610c) * 31) + this.f321611d) * 31;
            boolean z = this.f321612e;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f321613f;
        }

        public String toString() {
            return "DecodeResult(username=" + this.f321608a + ", dataBuffer=" + this.f321609b + ", w=" + this.f321610c + ", h=" + this.f321611d + ", screenFrame=" + this.f321612e + ", screenOri=" + this.f321613f + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C107495a(String str, C110374a.C110375a aVar, int i, int i2, boolean z, int i3, int i4, C8480h hVar) {
            this(str, aVar, i, i2, z, (i4 & 32) != 0 ? -1 : i3);
        }
    }

    /* renamed from: a */
    C107495a mo157919a();

    /* renamed from: b */
    void mo157920b(byte[] bArr, int i, int i2, int i3);

    /* renamed from: c */
    C107495a mo157921c(int i);
}
