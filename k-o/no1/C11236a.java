package no1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: no1.a */
public class C11236a<K, T extends View> {

    /* renamed from: a */
    public final Map<K, Set<C11237b<T>>> f33111a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo11312a(K k, Set<? extends C11237b<T>> set) {
        C87412m.m108594g(set, "handlers");
        for (C11237b bVar : set) {
            C87412m.m108594g(bVar, "handler");
            Log.m105924i("Finder.ProfileUiStyleConfig", "groupName:" + k + " handler:" + bVar);
            if (this.f33111a.containsKey(k)) {
                Set set2 = (Set) ((LinkedHashMap) this.f33111a).get(k);
                if (set2 != null) {
                    set2.add(bVar);
                }
            } else {
                Map<K, Set<C11237b<T>>> map = this.f33111a;
                HashSet hashSet = new HashSet();
                hashSet.add(bVar);
                map.put(k, hashSet);
            }
        }
    }
}
