package com.tencent.youtu.sdkkitframework.common;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.xweb.file.XVFSFile;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeJson {
    private static final String EMPTY_ARR = "[]";
    private static final String EMPTY_MAP = "{}";

    private <T> T fromArr(JSONArray jSONArray, Class<T> cls) {
        Class<?> componentType = cls.getComponentType();
        T newInstance = Array.newInstance(componentType, jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Array.set(newInstance, i, fromJsonData(getObject(jSONArray, i), componentType, componentType));
        }
        return newInstance;
    }

    private <T> T fromJsonArr(JSONArray jSONArray, Class<T> cls, Class<?> cls2) {
        if (cls.equals(List.class)) {
            return fromList(jSONArray, cls, cls2);
        }
        if (cls.isArray()) {
            return fromArr(jSONArray, cls);
        }
        throw new WeJsonException("json 解析错误:不支持的类型:" + cls.getName());
    }

    private Object fromJsonData(Object obj, Class<?> cls, Class<?> cls2) {
        return obj instanceof JSONArray ? fromJsonArr((JSONArray) obj, cls, cls2) : obj instanceof JSONObject ? fromJsonObj((JSONObject) obj, cls, cls2) : obj;
    }

    private <T> T fromJsonObj(JSONObject jSONObject, Class<T> cls, Class<?> cls2) {
        return cls.equals(Map.class) ? fromMap(jSONObject, cls, cls2) : fromPojo(jSONObject, cls);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Class<java.util.List>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List fromList(org.json.JSONArray r5, java.lang.Class<java.util.List> r6, java.lang.Class<?> r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L_0x0052
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "java.util.List"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0014
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x001a
        L_0x0014:
            java.lang.Object r0 = r6.newInstance()     // Catch:{ Exception -> 0x0048 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0048 }
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r2 = r5.length()
            if (r1 >= r2) goto L_0x0047
            java.lang.Object r2 = r4.getObject((org.json.JSONArray) r5, (int) r1)
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0033
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            java.lang.Object r2 = r4.fromJsonArr(r2, r6, r7)
            r0.add(r2)
            goto L_0x0044
        L_0x0033:
            boolean r3 = r2 instanceof org.json.JSONObject
            if (r3 == 0) goto L_0x0041
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.Object r2 = r4.fromJsonObj(r2, r6, r7)
            r0.add(r2)
            goto L_0x0044
        L_0x0041:
            r0.add(r2)
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x0047:
            return r0
        L_0x0048:
            r5 = move-exception
            com.tencent.youtu.sdkkitframework.common.WeJsonException r6 = new com.tencent.youtu.sdkkitframework.common.WeJsonException
            java.lang.String r7 = "创建List类型失败,该列表不支持无参实例化"
            r6.<init>(r7, r5)
            throw r6
        L_0x0052:
            com.tencent.youtu.sdkkitframework.common.WeJsonException r5 = new com.tencent.youtu.sdkkitframework.common.WeJsonException
            java.lang.String r6 = "无法确定列表项的类型"
            r5.<init>((java.lang.String) r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.WeJson.fromList(org.json.JSONArray, java.lang.Class, java.lang.Class):java.util.List");
    }

    private Map fromMap(JSONObject jSONObject, Class<Map> cls, Class<?> cls2) {
        Map map;
        if (cls2 != null) {
            if (cls.getName().equals("java.util.Map")) {
                map = new HashMap();
            } else {
                try {
                    map = cls.newInstance();
                } catch (Exception e) {
                    throw new WeJsonException("创建Map类型失败,该Map不支持无参实例化", e);
                }
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = getObject(jSONObject, next);
                if (object != null) {
                    map.put(next, fromJsonData(object, cls, cls2));
                } else {
                    map.put(next, (Object) null);
                }
            }
            return map;
        }
        throw new WeJsonException("无法确定列表项的类型");
    }

    private <T> T fromPojo(JSONObject jSONObject, Class<T> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Class<? super T> superclass = cls.getSuperclass();
        Field[] fieldArr = new Field[0];
        if (superclass != null) {
            fieldArr = superclass.getDeclaredFields();
        }
        int length = declaredFields.length + fieldArr.length;
        Field[] fieldArr2 = new Field[length];
        for (int i = 0; i < declaredFields.length; i++) {
            fieldArr2[i] = declaredFields[i];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr2[length2] = fieldArr[length2 - declaredFields.length];
        }
        if (length == 0) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (int i2 = 0; i2 < length; i2++) {
                Field field = fieldArr2[i2];
                String name = field.getName();
                if (!name.contains("$")) {
                    int modifiers = field.getModifiers();
                    Object opt = jSONObject.opt(name);
                    if (opt != null) {
                        Object fromJsonData = fromJsonData(opt, getMemberType(cls, field), getSubType(cls, field, opt));
                        if (JSONObject.NULL.equals(fromJsonData)) {
                            fromJsonData = null;
                        }
                        if ((modifiers & 1) != 0) {
                            try {
                                field.set(newInstance, fromJsonData);
                            } catch (IllegalAccessException e) {
                                throw new WeJsonException("设置成员变量值失败.", e);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("set");
                            sb.append(name.substring(0, 1).toUpperCase());
                            sb.append(name.length() == 1 ? "" : name.substring(1));
                            try {
                                try {
                                    cls.getMethod(sb.toString(), new Class[]{field.getType()}).invoke(newInstance, new Object[]{fromJsonData});
                                } catch (Exception e2) {
                                    throw new WeJsonException("调用set方法失败.", e2);
                                }
                            } catch (NoSuchMethodException unused) {
                            }
                        }
                    }
                }
            }
            return newInstance;
        } catch (Exception e3) {
            throw new WeJsonException("必须为该类型提供一个无参构造方法:" + cls.getName(), e3);
        }
    }

    private <T> Class<?> getMemberType(Class<T> cls, Field field) {
        if (!(field.getGenericType() instanceof TypeVariable)) {
            return field.getType();
        }
        cls.getTypeParameters();
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return (Class) type;
            }
            throw new WeJsonException("不支持嵌套泛型");
        }
        throw new WeJsonException("缺少泛型信息:" + cls);
    }

    private Object getObject(JSONArray jSONArray, int i) {
        try {
            return jSONArray.get(i);
        } catch (JSONException e) {
            throw new WeJsonException("JSONArray.get() cause JSONException", e);
        }
    }

    private <T> Class<?> getSubType(Class<T> cls, Field field, Object obj) {
        if (field.getGenericType() instanceof TypeVariable) {
            cls.getTypeParameters();
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass instanceof ParameterizedType) {
                Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                if (type instanceof Class) {
                    return (Class) type;
                }
                throw new WeJsonException("不支持嵌套泛型");
            }
            throw new WeJsonException("缺少泛型信息:" + cls);
        } else if (field.getType().equals(List.class)) {
            Type genericType = field.getGenericType();
            if (genericType instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (Class) type2;
                }
                throw new WeJsonException("不支持嵌套泛型:" + field.getName());
            }
            throw new WeJsonException("缺少泛型类型声明:" + field.getName());
        } else if (!field.getType().equals(Map.class)) {
            return field.getType();
        } else {
            Type genericType2 = field.getGenericType();
            if (genericType2 instanceof ParameterizedType) {
                Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[1];
                if (type3 instanceof Class) {
                    return (Class) type3;
                }
                throw new WeJsonException("不支持嵌套泛型:" + field.getName());
            }
            throw new WeJsonException("缺少泛型类型声明:" + field.getName());
        }
    }

    private String getValidStr(String str) {
        return str.replace(FastJsonResponse.QUOTE, "\\\"").replace("\\", "\\\\").replace("\b", "\\b").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\t", "\\t");
    }

    private <T> boolean isPrimitivePackageType(T t) {
        return (t instanceof Integer) || (t instanceof Short) || (t instanceof Long) || (t instanceof Byte) || (t instanceof Boolean) || (t instanceof Float) || (t instanceof Double) || (t instanceof Character);
    }

    private <T> void process(StringBuilder sb, T t) {
        if (t.getClass().isPrimitive()) {
            sb.append(t);
        } else if (t instanceof String) {
            sb.append('\"');
            sb.append(getValidStr((String) t));
            sb.append('\"');
        } else if (isPrimitivePackageType(t)) {
            sb.append(t);
        } else if (t.getClass().isArray()) {
            processArr(sb, (Object[]) t);
        } else if (t instanceof Iterable) {
            processIterable(sb, (Iterable) t);
        } else if (t instanceof Map) {
            processMap(sb, (Map) t);
        } else {
            processObj(sb, t);
        }
    }

    private <T> void processArr(StringBuilder sb, Object[] objArr) {
        if (objArr.length == 0) {
            sb.append(EMPTY_ARR);
            return;
        }
        sb.append('[');
        for (int i = 0; i < objArr.length; i++) {
            process(sb, objArr[i]);
            if (i < objArr.length - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
    }

    private void processIterable(StringBuilder sb, Iterable iterable) {
        sb.append('[');
        int i = 0;
        for (Object process : iterable) {
            i++;
            process(sb, process);
            sb.append(',');
        }
        if (i > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(']');
    }

    private void processMap(StringBuilder sb, Map<String, Object> map) {
        if (map.size() == 0) {
            sb.append(EMPTY_MAP);
            return;
        }
        sb.append('{');
        int i = 0;
        int size = map.size();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if (!(str == null || str.equals("") || value == null)) {
                if (!(value instanceof String) || !next.equals("")) {
                    sb.append('\"');
                    sb.append(str);
                    sb.append('\"');
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    process(sb, value);
                    if (i < size - 1) {
                        sb.append(',');
                    }
                    i++;
                }
            }
        }
        sb.append('}');
    }

    private <T> void processObj(StringBuilder sb, T t) {
        String str;
        Object invoke;
        Field[] declaredFields = t.getClass().getDeclaredFields();
        Field[] declaredFields2 = t.getClass().getSuperclass().getDeclaredFields();
        int length = declaredFields.length + declaredFields2.length;
        Field[] fieldArr = new Field[length];
        int i = 0;
        for (int i2 = 0; i2 < declaredFields.length; i2++) {
            fieldArr[i2] = declaredFields[i2];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr[length2] = declaredFields2[length2 - declaredFields.length];
        }
        if (length == 0) {
            sb.append(EMPTY_MAP);
            return;
        }
        HashMap hashMap = new HashMap();
        int i3 = 0;
        while (true) {
            str = "";
            if (i3 >= length) {
                break;
            }
            try {
                Field field = fieldArr[i3];
                int modifiers = field.getModifiers();
                if ((modifiers & 8) == 0) {
                    String name = field.getName();
                    if (!name.contains("$")) {
                        if ((modifiers & 1) != 0) {
                            Object obj = field.get(t);
                            if (obj != null) {
                                hashMap.put(name, obj);
                            }
                        } else {
                            Class<?> cls = t.getClass();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("get");
                            sb4.append(name.substring(0, 1).toUpperCase());
                            if (name.length() != 1) {
                                str = name.substring(1);
                            }
                            sb4.append(str);
                            Method method = cls.getMethod(sb4.toString(), new Class[0]);
                            if (!(method == null || (invoke = method.invoke(t, new Object[0])) == null)) {
                                hashMap.put(name, invoke);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            i3++;
        }
        sb.append('{');
        int size = hashMap.size();
        for (Map.Entry entry : hashMap.entrySet()) {
            i++;
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof String) && value.equals(str)) {
                if (str2.equals("image")) {
                    value = str;
                }
            }
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            process(sb, value);
            if (i < size) {
                sb.append(',');
            }
        }
        sb.append('}');
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        if (cls != null) {
            String trim = str.trim();
            if (trim.startsWith("[")) {
                try {
                    T fromJsonArr = fromJsonArr(new JSONArray(trim), cls, (Class<?>) null);
                    if (fromJsonArr != null) {
                        return fromJsonArr;
                    }
                } catch (Exception e) {
                    throw new WeJsonException("json 解析错误" + e.getMessage(), e);
                }
            } else if (trim.startsWith("{")) {
                try {
                    return fromJsonObj(new JSONObject(trim), cls, (Class<?>) null);
                } catch (Exception e2) {
                    throw new WeJsonException("json 解析错误:" + e2.getMessage(), e2);
                }
            }
            throw new WeJsonException("classOfT 指定错误");
        }
        throw new WeJsonException("必须指定classOfT");
    }

    public <T> String toJson(T t) {
        return toJson(t, 0);
    }

    public <T> String toJson(T t, int i) {
        if (t == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        process(sb, t);
        return sb.toString();
    }

    private Object getObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get(str);
        } catch (JSONException e) {
            throw new WeJsonException("JSONObject.get() cause JSONException", e);
        }
    }
}
