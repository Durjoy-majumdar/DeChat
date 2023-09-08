package v04;

import com.google.android.gms.common.internal.Constants;
import g04.C20770i;
import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedHashSet;
import w04.C26413e;

/* renamed from: v04.a */
public final class C26381a {
    /* renamed from: a */
    public static final <T> Collection<T> m33959a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C87412m.m108594g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final C26413e<C20770i> m33960b(Iterable<? extends C20770i> iterable) {
        C87412m.m108594g(iterable, Constants.KEY_SCOPES);
        C26413e<C20770i> eVar = new C26413e<>();
        for (Object next : iterable) {
            C20770i iVar = (C20770i) next;
            if ((iVar == null || iVar == C20770i.C20773b.f58684b) ? false : true) {
                eVar.add(next);
            }
        }
        return eVar;
    }
}
