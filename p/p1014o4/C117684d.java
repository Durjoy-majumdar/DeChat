package p1014o4;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o4.d */
public final class C117684d {

    /* renamed from: a */
    public final Set<C117685a> f352004a = new HashSet();

    /* renamed from: o4.d$a */
    public static final class C117685a {

        /* renamed from: a */
        public final Uri f352005a;

        /* renamed from: b */
        public final boolean f352006b;

        public C117685a(Uri uri, boolean z) {
            this.f352005a = uri;
            this.f352006b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C117685a.class != obj.getClass()) {
                return false;
            }
            C117685a aVar = (C117685a) obj;
            return this.f352006b == aVar.f352006b && this.f352005a.equals(aVar.f352005a);
        }

        public int hashCode() {
            return (this.f352005a.hashCode() * 31) + (this.f352006b ? 1 : 0);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C117684d.class != obj.getClass()) {
            return false;
        }
        return this.f352004a.equals(((C117684d) obj).f352004a);
    }

    public int hashCode() {
        return this.f352004a.hashCode();
    }
}
