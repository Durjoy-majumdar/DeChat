package w70;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w70.b */
public final class C111740b {

    /* renamed from: a */
    public long f334639a = System.currentTimeMillis();

    /* renamed from: b */
    public C111741a f334640b = new C111741a(System.currentTimeMillis(), 0, 1000, "available", 0, 16, (C8480h) null);

    /* renamed from: c */
    public long f334641c;

    /* renamed from: w70.b$a */
    public static final class C111741a {

        /* renamed from: a */
        public long f334642a;

        /* renamed from: b */
        public long f334643b;

        /* renamed from: c */
        public long f334644c;

        /* renamed from: d */
        public String f334645d;

        /* renamed from: e */
        public long f334646e;

        public C111741a(long j, long j2, long j3, String str, long j4, int i, C8480h hVar) {
            j4 = (i & 16) != 0 ? 0 : j4;
            this.f334642a = j;
            this.f334643b = j2;
            this.f334644c = j3;
            this.f334645d = str;
            this.f334646e = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C111741a)) {
                return false;
            }
            C111741a aVar = (C111741a) obj;
            return this.f334642a == aVar.f334642a && this.f334643b == aVar.f334643b && this.f334644c == aVar.f334644c && C87412m.m108589b(this.f334645d, aVar.f334645d) && this.f334646e == aVar.f334646e;
        }

        public int hashCode() {
            long j = this.f334642a;
            long j2 = this.f334643b;
            long j3 = this.f334644c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            String str = this.f334645d;
            int hashCode = str == null ? 0 : str.hashCode();
            long j4 = this.f334646e;
            return ((i + hashCode) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        public String toString() {
            return "CameraAnalyseStruct(startTime=" + this.f334642a + ", count=" + this.f334643b + ", interval=" + this.f334644c + ", tag=" + this.f334645d + ", average=" + this.f334646e + ')';
        }
    }
}
