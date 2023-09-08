package ai3;

import ai3.C112789a;
import ai3.C112793f;

/* renamed from: ai3.g */
public abstract class C67051g<K, T extends C112789a> {

    /* renamed from: a */
    public C67047d f192598a;

    /* renamed from: b */
    public boolean f192599b;

    /* renamed from: ai3.g$a */
    public class C67052a implements C112793f.C67050c {
        public C67052a() {
        }
    }

    public C67051g(C67047d dVar, int i, boolean z) {
        this.f192598a = dVar;
        this.f192599b = z;
        dVar.mo91041v0(true);
        this.f192598a.mo91040u0(new C67052a());
        if (i != 0) {
            this.f192598a.mo91033K0(i);
        }
        if (!z) {
            mo91064a();
        }
    }

    /* renamed from: a */
    public int mo91064a() {
        return this.f192598a.getCount();
    }
}
