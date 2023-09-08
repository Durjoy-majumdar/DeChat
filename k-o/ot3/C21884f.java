package ot3;

/* renamed from: ot3.f */
public class C21884f {

    /* renamed from: b */
    public static volatile C21884f f61884b;

    /* renamed from: a */
    public String f61885a = C47400b.f127178a;

    /* renamed from: a */
    public static C21884f m25094a() {
        C21884f fVar;
        if (f61884b != null) {
            return f61884b;
        }
        synchronized (C21884f.class) {
            if (f61884b == null) {
                f61884b = new C21884f();
            }
            fVar = f61884b;
        }
        return fVar;
    }
}
