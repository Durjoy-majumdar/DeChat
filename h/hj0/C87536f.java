package hj0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hj0.f */
public class C87536f {

    /* renamed from: a */
    public C87532b f253593a;

    /* renamed from: b */
    public Map<String, C87531a> f253594b;

    public C87536f(boolean z) {
        if (z) {
            this.f253593a = new C87532b();
            this.f253594b = new HashMap();
        }
    }

    public String toString() {
        return "UPnPMessage{headers=" + this.f253593a + ", bodes=" + this.f253594b + '}';
    }
}
