package j02;

import te3.C22526qf2;

/* renamed from: j02.a */
public class C21146a {

    /* renamed from: b */
    public static volatile C21146a f59784b;

    /* renamed from: a */
    public C22526qf2 f59785a = null;

    /* renamed from: b */
    public static C21146a m23560b() {
        C21146a aVar;
        if (f59784b != null) {
            return f59784b;
        }
        synchronized (C21146a.class) {
            if (f59784b == null) {
                f59784b = new C21146a();
            }
            aVar = f59784b;
        }
        return aVar;
    }

    /* renamed from: a */
    public C22526qf2 mo33104a() {
        if (this.f59785a == null) {
            this.f59785a = new C22526qf2();
        }
        return this.f59785a;
    }
}
