package nw3;

/* renamed from: nw3.a */
public class C109770a {

    /* renamed from: b */
    public static C109770a f328528b;

    /* renamed from: a */
    public C109782f f328529a = null;

    /* renamed from: a */
    public static C109782f m149092a() {
        Class<C109770a> cls = C109770a.class;
        if (f328528b == null) {
            synchronized (cls) {
                if (f328528b == null) {
                    f328528b = new C109770a();
                }
            }
        }
        C109770a aVar = f328528b;
        if (aVar.f328529a == null) {
            synchronized (cls) {
                if (aVar.f328529a == null) {
                    aVar.f328529a = new C109782f();
                }
            }
        }
        return aVar.f328529a;
    }
}
