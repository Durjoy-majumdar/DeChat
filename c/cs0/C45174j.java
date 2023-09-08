package cs0;

import gy3.C87412m;
import te3.w75;

/* renamed from: cs0.j */
public abstract class C45174j {

    /* renamed from: cs0.j$a */
    public static final class C45175a extends C45174j {

        /* renamed from: a */
        public final w75 f122481a;

        public C45175a(w75 w75) {
            C87412m.m108594g(w75, "appInfo");
            this.f122481a = w75;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C45175a) && C87412m.m108589b(this.f122481a, ((C45175a) obj).f122481a);
        }

        public int hashCode() {
            return this.f122481a.hashCode();
        }

        public String toString() {
            return "Header(appInfo=" + this.f122481a + ')';
        }
    }

    /* renamed from: cs0.j$b */
    public static final class C45176b extends C45174j {

        /* renamed from: a */
        public static final C45176b f122482a = new C45176b();
    }

    /* renamed from: cs0.j$c */
    public static final class C45177c extends C45174j {

        /* renamed from: a */
        public final String f122483a;

        public C45177c(String str) {
            C87412m.m108594g(str, "nickName");
            this.f122483a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C45177c) && C87412m.m108589b(this.f122483a, ((C45177c) obj).f122483a);
        }

        public int hashCode() {
            return this.f122483a.hashCode();
        }

        public String toString() {
            return "PluginTitle(nickName=" + this.f122483a + ')';
        }
    }

    /* renamed from: cs0.j$d */
    public static final class C45178d extends C45174j {

        /* renamed from: a */
        public final C45166g0 f122484a;

        public C45178d(C45166g0 g0Var) {
            C87412m.m108594g(g0Var, "usageInfoItem");
            this.f122484a = g0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C45178d) && C87412m.m108589b(this.f122484a, ((C45178d) obj).f122484a);
        }

        public int hashCode() {
            return this.f122484a.hashCode();
        }

        public String toString() {
            return "UserInfo(usageInfoItem=" + this.f122484a + ')';
        }
    }
}
