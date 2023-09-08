package oy1;

import gy3.C87412m;
import java.util.HashMap;
import sw1.C48478n;

/* renamed from: oy1.b */
public final class C11782b {

    /* renamed from: a */
    public static HashMap<String, C11783a> f34475a;

    /* renamed from: oy1.b$a */
    public static final class C11783a {

        /* renamed from: a */
        public final C48478n.C13793h f34476a;

        /* renamed from: b */
        public final String f34477b;

        /* renamed from: c */
        public final String f34478c;

        public C11783a(C48478n.C13793h hVar, String str, String str2) {
            C87412m.m108594g(hVar, "videoInfo");
            C87412m.m108594g(str, "shareUrl");
            C87412m.m108594g(str2, "shareThumbUrl");
            this.f34476a = hVar;
            this.f34477b = str;
            this.f34478c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11783a)) {
                return false;
            }
            C11783a aVar = (C11783a) obj;
            return C87412m.m108589b(this.f34476a, aVar.f34476a) && C87412m.m108589b(this.f34477b, aVar.f34477b) && C87412m.m108589b(this.f34478c, aVar.f34478c);
        }

        public int hashCode() {
            return (((this.f34476a.hashCode() * 31) + this.f34477b.hashCode()) * 31) + this.f34478c.hashCode();
        }

        public String toString() {
            return "VideoShareInfo(videoInfo=" + this.f34476a + ", shareUrl=" + this.f34477b + ", shareThumbUrl=" + this.f34478c + ')';
        }
    }
}
