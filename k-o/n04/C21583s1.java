package n04;

import fy3.C32226l;
import ty3.C26343l;
import vz3.C22826c;

/* renamed from: n04.s1 */
public final class C21583s1 implements C32226l<C22826c, Boolean> {
    public Object invoke(Object obj) {
        C22826c cVar = (C22826c) obj;
        if (cVar != null) {
            return Boolean.valueOf(!cVar.equals(C26343l.C26344a.f73436z));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
    }
}
