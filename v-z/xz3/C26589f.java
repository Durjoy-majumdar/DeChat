package xz3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xz3.C26593h;

/* renamed from: xz3.f */
public class C26589f {

    /* renamed from: b */
    public static final /* synthetic */ int f73999b = 0;

    /* renamed from: a */
    public final Map<C26590a, C26593h.C26600f<?, ?>> f74000a;

    /* renamed from: xz3.f$a */
    public static final class C26590a {

        /* renamed from: a */
        public final Object f74001a;

        /* renamed from: b */
        public final int f74002b;

        public C26590a(Object obj, int i) {
            this.f74001a = obj;
            this.f74002b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C26590a)) {
                return false;
            }
            C26590a aVar = (C26590a) obj;
            return this.f74001a == aVar.f74001a && this.f74002b == aVar.f74002b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f74001a) * 65535) + this.f74002b;
        }
    }

    static {
        new C26589f(true);
    }

    public C26589f() {
        this.f74000a = new HashMap();
    }

    /* renamed from: a */
    public final void mo53551a(C26593h.C26600f<?, ?> fVar) {
        this.f74000a.put(new C26590a(fVar.f74018a, fVar.f74021d.f74014d), fVar);
    }

    public C26589f(boolean z) {
        this.f74000a = Collections.emptyMap();
    }
}
