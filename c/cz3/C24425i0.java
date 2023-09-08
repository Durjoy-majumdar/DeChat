package cz3;

import cz3.C24421h;
import gy3.C87412m;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25072x;
import sx3.C110818d0;
import sx3.C64186f0;
import vz3.C22826c;
import vz3.C22830f;

/* renamed from: cz3.i0 */
public final class C24425i0 extends C24439x implements C24421h, C25072x {

    /* renamed from: a */
    public final TypeVariable<?> f69870a;

    public C24425i0(TypeVariable<?> typeVariable) {
        C87412m.m108594g(typeVariable, "typeVariable");
        this.f69870a = typeVariable;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        return C24421h.C24422a.m30477a(this, cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24425i0) && C87412m.m108589b(this.f69870a, ((C24425i0) obj).f69870a);
    }

    public Collection getAnnotations() {
        return C24421h.C24422a.m30478b(this);
    }

    public C22830f getName() {
        return C22830f.m26794f(this.f69870a.getName());
    }

    public Collection getUpperBounds() {
        Type[] bounds = this.f69870a.getBounds();
        C87412m.m108593f(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type vVar : bounds) {
            arrayList.add(new C24437v(vVar));
        }
        C24437v vVar2 = (C24437v) C110818d0.m150940l0(arrayList);
        return C87412m.m108589b(vVar2 != null ? vVar2.f69888a : null, Object.class) ? C64186f0.f181907d : arrayList;
    }

    public int hashCode() {
        return this.f69870a.hashCode();
    }

    /* renamed from: i */
    public AnnotatedElement mo51029i() {
        TypeVariable<?> typeVariable = this.f69870a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return C24425i0.class.getName() + ": " + this.f69870a;
    }
}
