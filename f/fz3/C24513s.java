package fz3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Set;
import mz3.C25055g;
import mz3.C25068t;
import vz3.C22826c;
import vz3.C26408b;

/* renamed from: fz3.s */
public interface C24513s {

    /* renamed from: fz3.s$a */
    public static final class C20766a {

        /* renamed from: a */
        public final C26408b f58675a;

        /* renamed from: b */
        public final byte[] f58676b;

        /* renamed from: c */
        public final C25055g f58677c;

        public C20766a(C26408b bVar, byte[] bArr, C25055g gVar, int i, C8480h hVar) {
            bArr = (i & 2) != 0 ? null : bArr;
            gVar = (i & 4) != 0 ? null : gVar;
            C87412m.m108594g(bVar, "classId");
            this.f58675a = bVar;
            this.f58676b = bArr;
            this.f58677c = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20766a)) {
                return false;
            }
            C20766a aVar = (C20766a) obj;
            return C87412m.m108589b(this.f58675a, aVar.f58675a) && C87412m.m108589b(this.f58676b, aVar.f58676b) && C87412m.m108589b(this.f58677c, aVar.f58677c);
        }

        public int hashCode() {
            int hashCode = this.f58675a.hashCode() * 31;
            byte[] bArr = this.f58676b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            C25055g gVar = this.f58677c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Request(classId=" + this.f58675a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f58676b) + ", outerClass=" + this.f58677c + ')';
        }
    }

    /* renamed from: a */
    C25068t mo37220a(C22826c cVar, boolean z);

    /* renamed from: b */
    Set<String> mo37221b(C22826c cVar);

    /* renamed from: c */
    C25055g mo37222c(C20766a aVar);
}
