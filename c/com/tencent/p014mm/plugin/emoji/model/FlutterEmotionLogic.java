package com.tencent.p014mm.plugin.emoji.model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ob0.C11385n;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C51163rv3;

/* renamed from: com.tencent.mm.plugin.emoji.model.FlutterEmotionLogic */
public class FlutterEmotionLogic implements C11385n {
    /* renamed from: a */
    public static final LinkedList<Object> m63235a(LinkedList linkedList) {
        Object obj = linkedList.size() > 0 ? linkedList.get(0) : null;
        if (obj.getClass().isPrimitive() || (obj instanceof String)) {
            return linkedList;
        }
        if (obj instanceof C51163rv3) {
            LinkedList<Object> linkedList2 = new LinkedList<>();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(it.next().toString());
            }
            return linkedList2;
        } else if (!(obj instanceof C47465a)) {
            return null;
        } else {
            LinkedList<Object> linkedList3 = new LinkedList<>();
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                linkedList3.add(m63236b(next, next.getClass()));
            }
            return linkedList3;
        }
    }

    /* renamed from: b */
    public static final HashMap<String, Object> m63236b(Object obj, Class cls) {
        LinkedList<Object> a;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (!field.getType().isPrimitive()) {
                        if (!(obj2 instanceof String)) {
                            if (obj2 instanceof C47465a) {
                                hashMap.put(field.getName(), m63236b(obj2, field.getType()));
                            } else if ((obj2 instanceof LinkedList) && (a = m63235a((LinkedList) obj2)) != null) {
                                hashMap.put(field.getName(), a);
                            }
                        }
                    }
                    hashMap.put(field.getName(), obj2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public static final void m63237c(LinkedList<? extends Object> linkedList, JSONArray jSONArray) {
        Iterator<? extends Object> it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof LinkedList) {
                JSONArray jSONArray2 = new JSONArray();
                m63237c((LinkedList) next, jSONArray2);
                jSONArray.put(jSONArray2);
            } else if (next instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                m63238d((Map) next, jSONObject);
                jSONArray.put(jSONObject);
            } else {
                jSONArray.put(next);
            }
        }
    }

    /* renamed from: d */
    public static final void m63238d(Map<String, ? extends Object> map, JSONObject jSONObject) {
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                m63238d((Map) next.getValue(), jSONObject2);
                jSONObject.put((String) next.getKey(), jSONObject2);
            } else if (next.getValue() instanceof LinkedList) {
                JSONArray jSONArray = new JSONArray();
                m63237c((LinkedList) next.getValue(), jSONArray);
                jSONObject.put((String) next.getKey(), jSONArray);
            } else {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }
}
