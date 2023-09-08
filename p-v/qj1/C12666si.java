package qj1;

import a14.C53973z1;
import gy3.C87412m;
import ig1.C8916d;
import java.util.ArrayList;
import te3.C50923q71;

/* renamed from: qj1.si */
public final class C12666si {

    /* renamed from: a */
    public final C12360e8 f36267a;

    /* renamed from: b */
    public final String f36268b = "Finder.RandomGiftSendProcessor";

    /* renamed from: c */
    public final ArrayList<C12667a> f36269c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<C12667a> f36270d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<C53973z1> f36271e = new ArrayList<>();

    /* renamed from: f */
    public int f36272f;

    /* renamed from: qj1.si$a */
    public static final class C12667a {

        /* renamed from: a */
        public final C8916d f36273a;

        /* renamed from: b */
        public C50923q71 f36274b;

        public C12667a(C8916d dVar, C50923q71 q712) {
            C87412m.m108594g(dVar, "giftInfo");
            this.f36273a = dVar;
            this.f36274b = q712;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12667a)) {
                return false;
            }
            C12667a aVar = (C12667a) obj;
            return C87412m.m108589b(this.f36273a, aVar.f36273a) && C87412m.m108589b(this.f36274b, aVar.f36274b);
        }

        public int hashCode() {
            int hashCode = this.f36273a.hashCode() * 31;
            C50923q71 q712 = this.f36274b;
            return hashCode + (q712 == null ? 0 : q712.hashCode());
        }

        public String toString() {
            return "RandomGiftInfo(giftInfo=" + this.f36273a + ", prepareResp=" + this.f36274b + ')';
        }
    }

    public C12666si(C12360e8 e8Var) {
        C87412m.m108594g(e8Var, "giftSendPlugin");
        this.f36267a = e8Var;
    }
}
