package p1223z3;

import java.util.concurrent.atomic.AtomicBoolean;
import p1188d4.C116569f;
import p1191e4.C116683a;
import p1191e4.C116691f;

/* renamed from: z3.k */
public abstract class C119048k {

    /* renamed from: a */
    public final AtomicBoolean f356558a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C119038g f356559b;

    /* renamed from: c */
    public volatile C116569f f356560c;

    public C119048k(C119038g gVar) {
        this.f356559b = gVar;
    }

    /* renamed from: a */
    public C116569f mo183713a() {
        this.f356559b.mo183701a();
        if (this.f356558a.compareAndSet(false, true)) {
            if (this.f356560c == null) {
                String b = mo183531b();
                C119038g gVar = this.f356559b;
                gVar.mo183701a();
                gVar.mo183702b();
                this.f356560c = new C116691f(((C116683a) gVar.f356519c.mo180540K()).f349940d.compileStatement(b));
            }
            return this.f356560c;
        }
        String b2 = mo183531b();
        C119038g gVar2 = this.f356559b;
        gVar2.mo183701a();
        gVar2.mo183702b();
        return new C116691f(((C116683a) gVar2.f356519c.mo180540K()).f349940d.compileStatement(b2));
    }

    /* renamed from: b */
    public abstract String mo183531b();

    /* renamed from: c */
    public void mo183714c(C116569f fVar) {
        if (fVar == this.f356560c) {
            this.f356558a.set(false);
        }
    }
}
