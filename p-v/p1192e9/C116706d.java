package p1192e9;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.MissingDependencyException;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: e9.d */
public final class C116706d implements ComponentContainer {

    /* renamed from: a */
    public final List<Component<?>> f350020a;

    /* renamed from: b */
    public final Map<Class<?>, C116708f<?>> f350021b = new HashMap();

    public C116706d(Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        C116707e eVar;
        ArrayList arrayList = new ArrayList();
        for (ComponentRegistrar components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, componentArr);
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            C116707e eVar2 = new C116707e(component);
            Iterator<Class<? super T>> it4 = component.f339203a.iterator();
            while (true) {
                if (it4.hasNext()) {
                    Class next = it4.next();
                    if (hashMap.put(next, eVar2) != null) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                    }
                }
            }
        }
        for (C116707e eVar3 : hashMap.values()) {
            for (Dependency next2 : eVar3.f350022a.f339204b) {
                if ((next2.f339213c == 0) && (eVar = (C116707e) hashMap.get(next2.f339211a)) != null) {
                    ((HashSet) eVar3.f350023b).add(eVar);
                    ((HashSet) eVar.f350024c).add(eVar3);
                }
            }
        }
        HashSet hashSet = new HashSet(hashMap.values());
        HashSet hashSet2 = new HashSet();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C116707e eVar4 = (C116707e) it5.next();
            if (((HashSet) eVar4.f350024c).isEmpty()) {
                hashSet2.add(eVar4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (!hashSet2.isEmpty()) {
            C116707e eVar5 = (C116707e) hashSet2.iterator().next();
            hashSet2.remove(eVar5);
            arrayList2.add(eVar5.f350022a);
            Iterator it6 = ((HashSet) eVar5.f350023b).iterator();
            while (it6.hasNext()) {
                C116707e eVar6 = (C116707e) it6.next();
                ((HashSet) eVar6.f350024c).remove(eVar5);
                if (((HashSet) eVar6.f350024c).isEmpty()) {
                    hashSet2.add(eVar6);
                }
            }
        }
        if (arrayList2.size() == arrayList.size()) {
            Collections.reverse(arrayList2);
            List<Component<?>> unmodifiableList = Collections.unmodifiableList(arrayList2);
            this.f350020a = unmodifiableList;
            for (Component next3 : unmodifiableList) {
                C116708f fVar = new C116708f(next3.f339206d, new C116710h(next3.f339204b, this));
                for (Class<? super T> put : next3.f339203a) {
                    ((HashMap) this.f350021b).put(put, fVar);
                }
            }
            for (Component next4 : this.f350020a) {
                Iterator<Dependency> it7 = next4.f339204b.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        Dependency next5 = it7.next();
                        if (next5.f339212b == 1) {
                            if (!((HashMap) this.f350021b).containsKey(next5.f339211a)) {
                                throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next4, next5.f339211a}));
                            }
                        }
                    }
                }
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            C116707e eVar7 = (C116707e) it8.next();
            if (!((HashSet) eVar7.f350024c).isEmpty() && !((HashSet) eVar7.f350023b).isEmpty()) {
                arrayList3.add(eVar7.f350022a);
            }
        }
        throw new DependencyCycleException(arrayList3);
    }

    public final Object get(Class cls) {
        return C116703a.get(this, cls);
    }

    public final <T> Provider<T> getProvider(Class<T> cls) {
        if (cls != null) {
            return (Provider) ((HashMap) this.f350021b).get(cls);
        }
        throw new NullPointerException("Null interface requested.");
    }
}
