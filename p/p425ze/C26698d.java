package p425ze;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p296bf.C79695b;

/* renamed from: ze.d */
public class C26698d implements Serializable {

    /* renamed from: d */
    public final Map<String, Map<String, C26702e>> f74230d;

    /* renamed from: e */
    public final Map<String, Map<String, C26702e>> f74231e;

    /* renamed from: f */
    public final Map<String, C26702e> f74232f;

    /* renamed from: g */
    public final Map<String, C26702e> f74233g;

    /* renamed from: ze.d$b */
    public static class C26699b implements C26701a {

        /* renamed from: a */
        public final Map<String, Map<String, C26700c>> f74234a = new LinkedHashMap();

        /* renamed from: b */
        public final Map<String, Map<String, C26700c>> f74235b = new LinkedHashMap();

        /* renamed from: c */
        public final Map<String, C26700c> f74236c = new LinkedHashMap();

        /* renamed from: d */
        public final Map<String, C26700c> f74237d = new LinkedHashMap();

        /* renamed from: e */
        public C26700c f74238e;

        /* renamed from: a */
        public C26699b mo53699a() {
            this.f74238e.f74240b = true;
            return this;
        }

        /* renamed from: b */
        public C26699b mo53700b(String str) {
            C79695b.m96813a(str, "mClassName");
            C26700c cVar = new C26700c("any subclass of " + str);
            this.f74238e = cVar;
            this.f74237d.put(str, cVar);
            return this;
        }

        /* renamed from: c */
        public C26699b mo53701c(String str, String str2) {
            C79695b.m96813a(str, "mClassName");
            C79695b.m96813a(str2, "fieldName");
            Map map = (Map) ((LinkedHashMap) this.f74234a).get(str);
            if (map == null) {
                map = new LinkedHashMap();
                this.f74234a.put(str, map);
            }
            C26700c cVar = new C26700c("field " + str + "#" + str2);
            this.f74238e = cVar;
            map.put(str2, cVar);
            return this;
        }

        /* renamed from: d */
        public C26699b mo53702d(String str, String str2) {
            C79695b.m96813a(str, "mClassName");
            C79695b.m96813a(str2, "fieldName");
            Map map = (Map) ((LinkedHashMap) this.f74235b).get(str);
            if (map == null) {
                map = new LinkedHashMap();
                this.f74235b.put(str, map);
            }
            C26700c cVar = new C26700c("static field " + str + "#" + str2);
            this.f74238e = cVar;
            map.put(str2, cVar);
            return this;
        }

        /* renamed from: e */
        public C26699b mo53703e(String str) {
            C79695b.m96813a(str, "threadName");
            C26700c cVar = new C26700c("any threads named " + str);
            this.f74238e = cVar;
            this.f74236c.put(str, cVar);
            return this;
        }
    }

    /* renamed from: ze.d$c */
    public static final class C26700c {

        /* renamed from: a */
        public String f74239a;

        /* renamed from: b */
        public boolean f74240b;

        /* renamed from: c */
        public final String f74241c;

        public C26700c(String str) {
            this.f74241c = str;
        }
    }

    /* renamed from: ze.d$a */
    public interface C26701a {
    }

    public C26698d(C26699b bVar) {
        this.f74230d = mo53697b(bVar.f74234a);
        this.f74231e = mo53697b(bVar.f74235b);
        this.f74232f = mo53696a(bVar.f74236c);
        this.f74233g = mo53696a(bVar.f74237d);
    }

    /* renamed from: a */
    public final Map<String, C26702e> mo53696a(Map<String, C26700c> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), new C26702e((C26700c) next.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: b */
    public final Map<String, Map<String, C26702e>> mo53697b(Map<String, Map<String, C26700c>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), mo53696a((Map) next.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = "";
        for (Map.Entry next : this.f74230d.entrySet()) {
            String str2 = (String) next.getKey();
            for (Map.Entry entry : ((Map) next.getValue()).entrySet()) {
                str = str + "| Field: " + str2 + "." + ((String) entry.getKey()) + (((C26702e) entry.getValue()).f74242d ? " (always)" : "") + "\n";
            }
        }
        for (Map.Entry next2 : this.f74231e.entrySet()) {
            String str3 = (String) next2.getKey();
            for (Map.Entry entry2 : ((Map) next2.getValue()).entrySet()) {
                str = str + "| Static field: " + str3 + "." + ((String) entry2.getKey()) + (((C26702e) entry2.getValue()).f74242d ? " (always)" : "") + "\n";
            }
        }
        for (Map.Entry next3 : this.f74232f.entrySet()) {
            str = str + "| Thread:" + ((String) next3.getKey()) + (((C26702e) next3.getValue()).f74242d ? " (always)" : "") + "\n";
        }
        for (Map.Entry next4 : this.f74233g.entrySet()) {
            str = str + "| Class:" + ((String) next4.getKey()) + (((C26702e) next4.getValue()).f74242d ? " (always)" : "") + "\n";
        }
        return str;
    }
}
