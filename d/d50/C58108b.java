package d50;

import com.tencent.p014mm.sdk.platformtools.LruCache;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: d50.b */
public final class C58108b {

    /* renamed from: a */
    public static final LruCache<Integer, C58109a> f166185a = new LruCache<>(10);

    /* renamed from: d50.b$a */
    public static final class C58109a {

        /* renamed from: a */
        public int f166186a;

        /* renamed from: b */
        public boolean f166187b;

        /* renamed from: c */
        public String f166188c;

        /* renamed from: d */
        public boolean f166189d;

        public C58109a() {
            this(0, false, (String) null, false, 15, (C8480h) null);
        }

        public C58109a(int i, boolean z, String str, boolean z2) {
            C87412m.m108594g(str, "decryptString");
            this.f166186a = i;
            this.f166187b = z;
            this.f166188c = str;
            this.f166189d = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C58109a)) {
                return false;
            }
            C58109a aVar = (C58109a) obj;
            return this.f166186a == aVar.f166186a && this.f166187b == aVar.f166187b && C87412m.m108589b(this.f166188c, aVar.f166188c) && this.f166189d == aVar.f166189d;
        }

        public int hashCode() {
            int i = this.f166186a * 31;
            boolean z = this.f166187b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((i + (z ? 1 : 0)) * 31) + this.f166188c.hashCode()) * 31;
            boolean z3 = this.f166189d;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public String toString() {
            return "key:" + this.f166186a + ",haveDecrypt:" + this.f166187b + ",decryptString:" + this.f166188c + ",havePlay:" + this.f166189d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C58109a(int i, boolean z, String str, boolean z2, int i2, C8480h hVar) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z2);
        }
    }
}
