package cz3;

import e04.C20506e;
import gy3.C87412m;
import java.lang.reflect.Type;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25069u;
import sx3.C64186f0;
import ty3.C22558j;

/* renamed from: cz3.f0 */
public final class C24418f0 extends C24423h0 implements C25069u {

    /* renamed from: a */
    public final Class<?> f69866a;

    /* renamed from: b */
    public final Collection<C25048a> f69867b = C64186f0.f181907d;

    public C24418f0(Class<?> cls) {
        C87412m.m108594g(cls, "reflectType");
        this.f69866a = cls;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: P */
    public Type mo51055P() {
        return this.f69866a;
    }

    public Collection<C25048a> getAnnotations() {
        return this.f69867b;
    }

    public C22558j getType() {
        if (C87412m.m108589b(this.f69866a, Void.TYPE)) {
            return null;
        }
        return C20506e.m22188b(this.f69866a.getName()).mo32070e();
    }
}
