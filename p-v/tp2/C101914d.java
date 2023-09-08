package tp2;

import android.util.ArrayMap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import rq2.C101425k;

/* renamed from: tp2.d */
public class C101914d implements Map<String, Object> {

    /* renamed from: d */
    public final Map<String, Object> f300076d;

    public C101914d() {
        this.f300076d = new ArrayMap();
    }

    /* renamed from: a */
    public <T> T mo141403a(String str, T t) {
        SnsMethodCalculate.markStartTimeMs("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        try {
            T t2 = ((ArrayMap) this.f300076d).get(str);
            if (t2 != null) {
                SnsMethodCalculate.markEndTimeMs("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
                return t2;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return t;
    }

    /* renamed from: b */
    public Object mo141404b(String str, Object obj) {
        SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (str == null || obj == null) {
            SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return null;
        }
        Object put = ((ArrayMap) this.f300076d).put(str, obj);
        SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return put;
    }

    public void clear() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        ((ArrayMap) this.f300076d).clear();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
    }

    public boolean containsKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean z = false;
        if (obj instanceof String) {
            String str = (String) obj;
            SnsMethodCalculate.markStartTimeMs("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            if (str != null) {
                z = ((ArrayMap) this.f300076d).containsKey(str);
                SnsMethodCalculate.markEndTimeMs("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            } else {
                SnsMethodCalculate.markEndTimeMs("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            }
            SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return false;
    }

    public boolean containsValue(Object obj) {
        SnsMethodCalculate.markStartTimeMs("containsValue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean containsValue = ((ArrayMap) this.f300076d).containsValue(obj);
        SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return containsValue;
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        SnsMethodCalculate.markStartTimeMs("entrySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        Set<Map.Entry<String, Object>> entrySet = ((ArrayMap) this.f300076d).entrySet();
        SnsMethodCalculate.markEndTimeMs("entrySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return entrySet;
    }

    public Object get(Object obj) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (obj instanceof String) {
            Object obj2 = ((ArrayMap) this.f300076d).get(obj);
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return obj2;
        }
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return null;
    }

    public boolean isEmpty() {
        SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean isEmpty = ((ArrayMap) this.f300076d).isEmpty();
        SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return isEmpty;
    }

    public Set<String> keySet() {
        SnsMethodCalculate.markStartTimeMs("keySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        Set<String> keySet = ((ArrayMap) this.f300076d).keySet();
        SnsMethodCalculate.markEndTimeMs("keySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return keySet;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        Object b = mo141404b((String) obj, obj2);
        SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return b;
    }

    public void putAll(Map<? extends String, ?> map) {
        SnsMethodCalculate.markStartTimeMs("putAll", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (C101425k.m133101e(map)) {
            ((ArrayMap) this.f300076d).putAll(map);
        }
        SnsMethodCalculate.markEndTimeMs("putAll", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
    }

    public Object remove(Object obj) {
        SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (obj instanceof String) {
            ((ArrayMap) this.f300076d).remove(obj);
        }
        SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return null;
    }

    public int size() {
        SnsMethodCalculate.markStartTimeMs("size", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        int size = ((ArrayMap) this.f300076d).size();
        SnsMethodCalculate.markEndTimeMs("size", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return size;
    }

    public Collection<Object> values() {
        SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        Collection<Object> values = ((ArrayMap) this.f300076d).values();
        SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return values;
    }

    public C101914d(String str, Object obj) {
        ArrayMap arrayMap = new ArrayMap();
        this.f300076d = arrayMap;
        arrayMap.put(str, obj);
    }
}
