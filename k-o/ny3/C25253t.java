package ny3;

import gy3.C87412m;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import rx3.C48096k;
import sx3.C36907w;

/* renamed from: ny3.t */
public final class C25253t implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: a */
    public final C25246o f71722a;

    public C25253t(C25246o oVar) {
        C87412m.m108594g(oVar, "typeParameter");
        this.f71722a = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !C87412m.m108589b(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    public Type[] getBounds() {
        List<C25245n> upperBounds = this.f71722a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(upperBounds, 10));
        for (C25245n b : upperBounds) {
            arrayList.add(C25254u.m32180b(b, true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[]) array;
    }

    public GenericDeclaration getGenericDeclaration() {
        throw new C48096k("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f71722a));
    }

    public String getName() {
        return this.f71722a.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public String toString() {
        return getName();
    }
}
