package o40;

import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51163rv3;

/* renamed from: o40.h */
public final class C61937h {
    /* renamed from: a */
    public static final String m72702a(String str, HashMap<String, String> hashMap) {
        C87412m.m108594g(str, "originKey");
        if (hashMap == null || !hashMap.containsKey(str)) {
            return str;
        }
        String str2 = hashMap.get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public static final JSONObject m72703b(Object obj) {
        C87412m.m108594g(obj, "originObj");
        JSONObject jSONObject = new JSONObject();
        m72704c(obj, jSONObject);
        return jSONObject;
    }

    /* renamed from: c */
    public static final void m72704c(Object obj, JSONObject jSONObject) {
        C87412m.m108594g(obj, "originObj");
        C87412m.m108594g(jSONObject, "jsonObj");
        m72708g(m72706e(obj, obj.getClass(), (HashMap<String, String>) null), jSONObject);
    }

    /* renamed from: d */
    public static final LinkedList<Object> m72705d(LinkedList<?> linkedList, HashMap<String, String> hashMap) {
        C87412m.m108594g(linkedList, "list");
        Object obj = linkedList.size() > 0 ? linkedList.get(0) : null;
        C87412m.m108591d(obj);
        if (obj.getClass().isPrimitive() || (obj instanceof String)) {
            return linkedList;
        }
        if (obj instanceof C51163rv3) {
            LinkedList<Object> linkedList2 = new LinkedList<>();
            Iterator<?> it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(it.next().toString());
            }
            return linkedList2;
        } else if (!(obj instanceof C47465a)) {
            return null;
        } else {
            LinkedList<Object> linkedList3 = new LinkedList<>();
            Iterator<?> it4 = linkedList.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                C87412m.m108593f(next, "o");
                linkedList3.add(m72706e(next, next.getClass(), hashMap));
            }
            return linkedList3;
        }
    }

    /* renamed from: e */
    public static final HashMap<String, Object> m72706e(Object obj, Class<?> cls, HashMap<String, String> hashMap) {
        LinkedList<Object> d;
        C87412m.m108594g(obj, "obj");
        C87412m.m108594g(cls, "clazz");
        HashMap<String, Object> hashMap2 = new HashMap<>();
        Field[] fields = cls.getFields();
        C87412m.m108593f(fields, "fields");
        for (Field field : fields) {
            try {
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (!field.getType().isPrimitive()) {
                        if (!(obj2 instanceof String)) {
                            if (obj2 instanceof C47465a) {
                                Class<?> type = field.getType();
                                C87412m.m108593f(type, "field.type");
                                HashMap<String, Object> e = m72706e(obj2, type, hashMap);
                                String name = field.getName();
                                C87412m.m108593f(name, "field.name");
                                hashMap2.put(m72702a(name, hashMap), e);
                            } else if ((obj2 instanceof LinkedList) && (d = m72705d((LinkedList) obj2, hashMap)) != null) {
                                String name2 = field.getName();
                                C87412m.m108593f(name2, "field.name");
                                hashMap2.put(m72702a(name2, hashMap), d);
                            }
                        }
                    }
                    String name3 = field.getName();
                    C87412m.m108593f(name3, "field.name");
                    hashMap2.put(m72702a(name3, hashMap), obj2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap2;
    }

    /* renamed from: f */
    public static final void m72707f(List<? extends Object> list, JSONArray jSONArray) {
        C87412m.m108594g(list, "list");
        C87412m.m108594g(jSONArray, "array");
        for (Object next : list) {
            if (next instanceof LinkedList) {
                JSONArray jSONArray2 = new JSONArray();
                m72707f((List) next, jSONArray2);
                jSONArray.put(jSONArray2);
            } else if (next instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                m72708g((Map) next, jSONObject);
                jSONArray.put(jSONObject);
            } else {
                jSONArray.put(next);
            }
        }
    }

    /* renamed from: g */
    public static final void m72708g(Map<String, ? extends Object> map, JSONObject jSONObject) {
        C87412m.m108594g(map, "map");
        C87412m.m108594g(jSONObject, "obj");
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                m72708g((Map) value, jSONObject2);
                jSONObject.put(str, jSONObject2);
            } else if (value instanceof LinkedList) {
                JSONArray jSONArray = new JSONArray();
                m72707f((LinkedList) value, jSONArray);
                jSONObject.put(str, jSONArray);
            } else if (value instanceof Long) {
                jSONObject.put(str, value.toString());
            } else {
                jSONObject.put(str, value);
            }
        }
    }

    /* renamed from: h */
    public static final JSONObject m72709h(Object obj) {
        C87412m.m108594g(obj, "originObj");
        try {
            JSONObject jSONObject = new JSONObject();
            m72704c(obj, jSONObject);
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* renamed from: i */
    public static final C89349b m72710i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new C89349b(bArr, 0, bArr.length);
    }
}
