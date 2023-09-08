package os1;

import androidx.lifecycle.C39622i0;
import java.util.concurrent.ConcurrentHashMap;
import te3.C52112yg0;

/* renamed from: os1.r */
public final class C11752r extends C39622i0 {

    /* renamed from: d */
    public final ConcurrentHashMap<Integer, C11753a> f34408d = new ConcurrentHashMap<>();

    /* renamed from: os1.r$a */
    public static final class C11753a {

        /* renamed from: a */
        public final int f34409a;

        /* renamed from: b */
        public C52112yg0 f34410b = new C52112yg0();

        public C11753a(int i) {
            this.f34409a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11753a) && this.f34409a == ((C11753a) obj).f34409a;
        }

        public int hashCode() {
            return this.f34409a;
        }

        public String toString() {
            return "Cache(tabType=" + this.f34409a + ')';
        }
    }

    public void onCleared() {
        super.onCleared();
        this.f34408d.clear();
    }
}
