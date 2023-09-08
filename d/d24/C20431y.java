package d24;

import d24.C20419r;
import e24.C20509c;
import h24.C20888f;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: d24.y */
public final class C20431y {

    /* renamed from: a */
    public final C20421s f57340a;

    /* renamed from: b */
    public final String f57341b;

    /* renamed from: c */
    public final C20419r f57342c;

    /* renamed from: d */
    public final Map<Class<?>, Object> f57343d;

    /* renamed from: e */
    public volatile C20397d f57344e;

    public C20431y(C20432a aVar) {
        this.f57340a = aVar.f57345a;
        this.f57341b = aVar.f57346b;
        C20419r.C20420a aVar2 = aVar.f57347c;
        aVar2.getClass();
        this.f57342c = new C20419r(aVar2);
        aVar.getClass();
        Map<Class<?>, Object> map = aVar.f57348d;
        byte[] bArr = C20509c.f57729a;
        this.f57343d = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: a */
    public String mo31967a(String str) {
        return this.f57342c.mo31926c(str);
    }

    public String toString() {
        return "Request{method=" + this.f57341b + ", url=" + this.f57340a + ", tags=" + this.f57343d + '}';
    }

    /* renamed from: d24.y$a */
    public static class C20432a {

        /* renamed from: a */
        public C20421s f57345a;

        /* renamed from: b */
        public String f57346b;

        /* renamed from: c */
        public C20419r.C20420a f57347c;

        /* renamed from: d */
        public Map<Class<?>, Object> f57348d;

        public C20432a() {
            this.f57348d = Collections.emptyMap();
            this.f57346b = "GET";
            this.f57347c = new C20419r.C20420a();
        }

        /* renamed from: a */
        public C20431y mo31969a() {
            if (this.f57345a != null) {
                return new C20431y(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public C20432a mo31970b(C20397d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                this.f57347c.mo31937d("Cache-Control");
                return this;
            }
            this.f57347c.mo31938e("Cache-Control", dVar2);
            return this;
        }

        /* renamed from: c */
        public C20432a mo31971c(String str, C20384a0 a0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (a0Var == null || C20888f.m22972b(str)) {
                if (a0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                }
                this.f57346b = str;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
        }

        /* renamed from: d */
        public C20432a mo31972d(String str) {
            this.f57347c.mo31937d(str);
            return this;
        }

        /* renamed from: e */
        public C20432a mo31973e(C20421s sVar) {
            if (sVar != null) {
                this.f57345a = sVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public C20432a(C20431y yVar) {
            Map<Class<?>, Object> map;
            this.f57348d = Collections.emptyMap();
            this.f57345a = yVar.f57340a;
            this.f57346b = yVar.f57341b;
            yVar.getClass();
            if (yVar.f57343d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(yVar.f57343d);
            }
            this.f57348d = map;
            this.f57347c = yVar.f57342c.mo31928e();
        }
    }
}
