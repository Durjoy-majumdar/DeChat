package p430d;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: d.c */
public final class C26973c {

    /* renamed from: a */
    public static final C26973c f74981a = new C26973c();

    /* renamed from: b */
    public static final HashMap<String, C26974a> f74982b = new HashMap<>();

    /* renamed from: d.c$a */
    public static final class C26974a {

        /* renamed from: a */
        public boolean f74983a;

        /* renamed from: b */
        public final long f74984b;

        /* renamed from: c */
        public long f74985c;

        public C26974a() {
            this(false, 0, 0, 7, (C8480h) null);
        }

        public C26974a(boolean z, long j, long j2, int i, C8480h hVar) {
            z = (i & 1) != 0 ? false : z;
            j = (i & 2) != 0 ? System.currentTimeMillis() : j;
            j2 = (i & 4) != 0 ? 0 : j2;
            this.f74983a = z;
            this.f74984b = j;
            this.f74985c = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26974a)) {
                return false;
            }
            C26974a aVar = (C26974a) obj;
            return this.f74983a == aVar.f74983a && this.f74984b == aVar.f74984b && this.f74985c == aVar.f74985c;
        }

        public int hashCode() {
            boolean z = this.f74983a;
            if (z) {
                z = true;
            }
            long j = this.f74984b;
            long j2 = this.f74985c;
            return ((((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "Info(reportedPreload=" + this.f74983a + ", initTime=" + this.f74984b + ", renderStartTime=" + this.f74985c + ')';
        }
    }

    /* renamed from: a */
    public final void mo54444a(String str) {
        C87412m.m108594g(str, "canvasId");
        C26974a aVar = new C26974a(false, 0, 0, 7, (C8480h) null);
        Log.m105924i("MicroMsg.WebCanvasRenderTimeReport", "markInitTime " + str + ' ' + aVar.f74984b);
        f74982b.put(str, aVar);
    }
}
