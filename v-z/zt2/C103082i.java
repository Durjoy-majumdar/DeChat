package zt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: zt2.i */
public final class C103082i extends TreeMap<String, C103080g> {

    /* renamed from: d */
    public final int f304149d;

    /* renamed from: zt2.i$a */
    public static final class C103083a<T> implements Comparator {

        /* renamed from: d */
        public static final C103083a<T> f304150d = new C103083a<>();

        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
            String str = (String) obj;
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
            C87412m.m108593f(str, "o1");
            int compareTo = ((String) obj2).compareTo(str);
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
            return compareTo;
        }
    }

    public C103082i(int i) {
        super(C103083a.f304150d);
        this.f304149d = i;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean containsKey = super.containsKey((String) obj);
        SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return containsKey;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        SnsMethodCalculate.markStartTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof C103080g)) {
            SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean containsValue = super.containsValue((C103080g) obj);
        SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return containsValue;
    }

    public final /* bridge */ Set<Map.Entry<String, C103080g>> entrySet() {
        SnsMethodCalculate.markStartTimeMs("entrySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markStartTimeMs("getEntries", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        Set<Map.Entry<String, C103080g>> entrySet = super.entrySet();
        SnsMethodCalculate.markEndTimeMs("getEntries", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("entrySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return entrySet;
    }

    public final /* bridge */ Object get(Object obj) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        C103080g gVar = (C103080g) super.get((String) obj);
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return gVar;
    }

    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return obj2;
        }
        SnsMethodCalculate.markStartTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        C103080g gVar = (C103080g) super.getOrDefault((String) obj, (C103080g) obj2);
        SnsMethodCalculate.markEndTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return gVar;
    }

    public final /* bridge */ Set<String> keySet() {
        SnsMethodCalculate.markStartTimeMs("keySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markStartTimeMs("getKeys", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        Set<String> keySet = super.keySet();
        SnsMethodCalculate.markEndTimeMs("getKeys", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("keySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return keySet;
    }

    public Object put(Object obj, Object obj2) {
        C103080g gVar;
        SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        String str = (String) obj;
        C103080g gVar2 = (C103080g) obj2;
        SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        C87412m.m108594g(str, "key");
        C87412m.m108594g(gVar2, "value");
        if (C87412m.m108589b(str, "18446744073709551615") || C112550d0.m153801u(str, "*", false)) {
            gVar = null;
            SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        } else {
            gVar = (C103080g) super.put(str, gVar2);
            if (size() > this.f304149d) {
                Set<String> keySet = keySet();
                C87412m.m108593f(keySet, "this@UnreadMap.keys");
                remove(C110818d0.m150922T(keySet));
            }
            SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        }
        SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return gVar;
    }

    public final /* bridge */ Object remove(Object obj) {
        SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        C103080g gVar = (C103080g) super.remove((String) obj);
        SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return gVar;
    }

    public final /* bridge */ int size() {
        SnsMethodCalculate.markStartTimeMs("size", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markStartTimeMs("getSize", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        int size = super.size();
        SnsMethodCalculate.markEndTimeMs("getSize", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("size", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return size;
    }

    public final /* bridge */ Collection<C103080g> values() {
        SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markStartTimeMs("getValues", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        Collection<C103080g> values = super.values();
        SnsMethodCalculate.markEndTimeMs("getValues", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return values;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean z = true;
        if (!(obj == null ? true : obj instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        if (obj2 != null) {
            z = obj2 instanceof C103080g;
        }
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean remove = super.remove((String) obj, (C103080g) obj2);
        SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return remove;
    }
}
