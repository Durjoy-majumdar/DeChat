package p693t1;

import android.content.res.Resources;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p503e1.C107082c;

/* renamed from: t1.a */
public final class C36932a {

    /* renamed from: a */
    public final HashMap<C36934b, WeakReference<C36933a>> f97984a = new HashMap<>();

    /* renamed from: t1.a$a */
    public static final class C36933a {

        /* renamed from: a */
        public final C107082c f97985a;

        /* renamed from: b */
        public final int f97986b;

        public C36933a(C107082c cVar, int i) {
            C87412m.m108594g(cVar, "imageVector");
            this.f97985a = cVar;
            this.f97986b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36933a)) {
                return false;
            }
            C36933a aVar = (C36933a) obj;
            return C87412m.m108589b(this.f97985a, aVar.f97985a) && this.f97986b == aVar.f97986b;
        }

        public int hashCode() {
            return (this.f97985a.hashCode() * 31) + this.f97986b;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f97985a + ", configFlags=" + this.f97986b + ')';
        }
    }

    /* renamed from: t1.a$b */
    public static final class C36934b {

        /* renamed from: a */
        public final Resources.Theme f97987a;

        /* renamed from: b */
        public final int f97988b;

        public C36934b(Resources.Theme theme, int i) {
            C87412m.m108594g(theme, "theme");
            this.f97987a = theme;
            this.f97988b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36934b)) {
                return false;
            }
            C36934b bVar = (C36934b) obj;
            return C87412m.m108589b(this.f97987a, bVar.f97987a) && this.f97988b == bVar.f97988b;
        }

        public int hashCode() {
            return (this.f97987a.hashCode() * 31) + this.f97988b;
        }

        public String toString() {
            return "Key(theme=" + this.f97987a + ", id=" + this.f97988b + ')';
        }
    }
}
