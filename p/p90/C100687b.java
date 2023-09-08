package p90;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import p823sg.C101611g;
import p823sg.C101614i;
import q90.C101060a;
import q90.C101069i;
import q90.C101070j;
import q90.C62585c;

/* renamed from: p90.b */
public class C100687b {

    /* renamed from: c */
    public static volatile C100687b f295005c;

    /* renamed from: d */
    public static final C101060a f295006d;

    /* renamed from: a */
    public C100692b f295007a = null;

    /* renamed from: b */
    public ConcurrentHashMap<String, C100692b> f295008b = new ConcurrentHashMap<>();

    /* renamed from: p90.b$a */
    public static class C100688a implements C100692b {

        /* renamed from: a */
        public C62585c<String, C100686a> f295009a = null;

        /* renamed from: b */
        public C101070j<String, Object> f295010b = null;

        /* renamed from: c */
        public C101060a f295011c;

        /* renamed from: p90.b$a$a */
        public class C100689a implements C101611g.C101612b<String, C100686a> {
            public C100689a(C100688a aVar) {
            }

            public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
                WeakReference<C101611g.C101612b> weakReference;
                C101611g.C101612b bVar;
                String str = (String) obj;
                C100686a aVar = (C100686a) obj2;
                C100686a aVar2 = (C100686a) obj3;
                if (aVar != null && (weakReference = aVar.f295001d) != null && weakReference.get() != null && (bVar = aVar.f295001d.get()) != null) {
                    bVar.preRemoveCallback(str, aVar, aVar2);
                }
            }
        }

        /* renamed from: p90.b$a$b */
        public class C100690b implements C101611g.C101613c<String, C100686a> {
            public C100690b(C100688a aVar) {
            }

            /* renamed from: a */
            public int mo139576a(Object obj, Object obj2) {
                String str = (String) obj;
                C100686a aVar = (C100686a) obj2;
                if (aVar != null) {
                    return aVar.f295002e;
                }
                return 0;
            }
        }

        /* renamed from: p90.b$a$c */
        public class C100691c extends C101069i<String, C100686a> {
            public C100691c(C100688a aVar, C101060a aVar2, C101611g.C101612b bVar, C101611g.C101613c cVar) {
                super(aVar2, bVar, cVar);
            }

            /* renamed from: b */
            public Object mo140123b(Object obj, Object obj2) {
                return ((String) obj) + "@" + ((String) obj2);
            }
        }

        public C100688a(C101060a aVar) {
            this.f295011c = aVar;
            this.f295009a = new C100691c(this, aVar, new C100689a(this), new C100690b(this));
            this.f295010b = new C101070j<>(10);
        }

        /* renamed from: a */
        public C62585c mo140119a() {
            return this.f295009a;
        }

        /* renamed from: b */
        public C101611g mo140120b() {
            return this.f295010b;
        }

        /* renamed from: c */
        public C101060a mo140121c() {
            return this.f295011c;
        }

        public void onTrimMemory(int i) {
            C101069i iVar = (C101069i) this.f295009a;
            iVar.f295881a.clear();
            ((C101614i) iVar.f295882b).clear();
        }
    }

    /* renamed from: p90.b$b */
    public interface C100692b<T> {
        /* renamed from: a */
        C62585c<String, T> mo140119a();

        /* renamed from: b */
        C101611g<String, T> mo140120b();

        /* renamed from: c */
        C101060a mo140121c();

        void onTrimMemory(int i);
    }

    static {
        C101060a aVar = C101060a.f295868c;
        f295006d = aVar;
        C100687b b = m131711b();
        C100688a aVar2 = new C100688a(aVar);
        b.f295008b.put(aVar.f295870b, aVar2);
        if (aVar.equals(aVar)) {
            b.f295007a = aVar2;
        }
    }

    /* renamed from: a */
    public static C62585c<String, C100686a> m131710a(C101060a aVar) {
        if (aVar == null || aVar.equals("")) {
            return null;
        }
        if (f295006d.equals(aVar)) {
            return m131711b().f295007a.mo140119a();
        }
        m131711b().getClass();
        return m131711b().f295008b.get(aVar.f295870b).mo140119a();
    }

    /* renamed from: b */
    public static C100687b m131711b() {
        if (f295005c == null) {
            synchronized (C100687b.class) {
                if (f295005c == null) {
                    f295005c = new C100687b();
                }
            }
        }
        return f295005c;
    }
}
