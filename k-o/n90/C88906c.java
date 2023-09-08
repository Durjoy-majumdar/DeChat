package n90;

import gy3.C87412m;
import java.util.concurrent.FutureTask;

/* renamed from: n90.c */
public final class C88906c {

    /* renamed from: a */
    public static FutureTask<Integer> f256403a;

    /* renamed from: n90.c$a */
    public static final class C11142a {

        /* renamed from: a */
        public int f32916a;

        /* renamed from: b */
        public String f32917b;

        /* renamed from: c */
        public String f32918c;

        public C11142a(int i, String str, String str2) {
            C87412m.m108594g(str, "lens");
            C87412m.m108594g(str2, "supportLevel");
            this.f32916a = i;
            this.f32917b = str;
            this.f32918c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11142a)) {
                return false;
            }
            C11142a aVar = (C11142a) obj;
            return this.f32916a == aVar.f32916a && C87412m.m108589b(this.f32917b, aVar.f32917b) && C87412m.m108589b(this.f32918c, aVar.f32918c);
        }

        public int hashCode() {
            return (((this.f32916a * 31) + this.f32917b.hashCode()) * 31) + this.f32918c.hashCode();
        }

        public String toString() {
            return "CameraInfo(id=" + this.f32916a + ", lens=" + this.f32917b + ", supportLevel=" + this.f32918c + ')';
        }
    }
}
