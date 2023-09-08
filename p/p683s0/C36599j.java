package p683s0;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p683s0.C110688i;
import sx3.C64197v;
import sx3.C90364q0;
import z04.C112551y;

/* renamed from: s0.j */
public final class C36599j implements C110688i {

    /* renamed from: a */
    public final C32226l<Object, Boolean> f97317a;

    /* renamed from: b */
    public final Map<String, List<Object>> f97318b;

    /* renamed from: c */
    public final Map<String, List<C32224a<Object>>> f97319c;

    /* renamed from: s0.j$a */
    public static final class C36600a implements C110688i.C110689a {

        /* renamed from: a */
        public final /* synthetic */ C36599j f97320a;

        /* renamed from: b */
        public final /* synthetic */ String f97321b;

        /* renamed from: c */
        public final /* synthetic */ C32224a<Object> f97322c;

        public C36600a(C36599j jVar, String str, C32224a<? extends Object> aVar) {
            this.f97320a = jVar;
            this.f97321b = str;
            this.f97322c = aVar;
        }

        /* renamed from: b */
        public void mo60748b() {
            List remove = this.f97320a.f97319c.remove(this.f97321b);
            if (remove != null) {
                remove.remove(this.f97322c);
            }
            if (remove != null && (!remove.isEmpty())) {
                this.f97320a.f97319c.put(this.f97321b, remove);
            }
        }
    }

    public C36599j(Map<String, ? extends List<? extends Object>> map, C32226l<Object, Boolean> lVar) {
        C87412m.m108594g(lVar, "canBeSaved");
        this.f97317a = lVar;
        Map<String, List<Object>> n = map == null ? null : C90364q0.m113155n(map);
        this.f97318b = n == null ? new LinkedHashMap<>() : n;
        this.f97319c = new LinkedHashMap();
    }

    /* renamed from: a */
    public boolean mo60744a(Object obj) {
        C87412m.m108594g(obj, "value");
        return this.f97317a.invoke(obj).booleanValue();
    }

    /* renamed from: b */
    public C110688i.C110689a mo60745b(String str, C32224a<? extends Object> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(aVar, "valueProvider");
        if (!C112551y.m153811k(str)) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f97319c;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(aVar);
            return new C36600a(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    /* renamed from: c */
    public Map<String, List<Object>> mo60746c() {
        Map<String, List<Object>> n = C90364q0.m113155n(this.f97318b);
        for (Map.Entry entry : ((LinkedHashMap) this.f97319c).entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((C32224a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (mo60744a(invoke)) {
                    n.put(str, C64197v.m75534c(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    int i2 = i + 1;
                    Object invoke2 = ((C32224a) list.get(i)).invoke();
                    if (invoke2 == null || mo60744a(invoke2)) {
                        arrayList.add(invoke2);
                        i = i2;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                n.put(str, arrayList);
            }
        }
        return n;
    }

    /* renamed from: d */
    public Object mo60747d(String str) {
        C87412m.m108594g(str, "key");
        List remove = this.f97318b.remove(str);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.f97318b.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }
}
