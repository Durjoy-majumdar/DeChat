package com.tencent.map.tools.json;

import android.text.TextUtils;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.json.annotation.JsonType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class JsonComposer implements JsonEncoder, JsonParser {
    private static Map<Class, Map<Field, String>> sClassJsonMap = new ConcurrentHashMap();
    private boolean mAllowEmpty = true;
    private Map<Class, JsonParser.Deserializer> mClassDeserializer = new HashMap();
    private Map<Field, JsonParser.Deserializer> mFieldDeserializer = new HashMap();
    private String mFieldNamePrefix;
    private FieldNameStyle mFieldNameStyle = FieldNameStyle.HUMP;
    private Map<Field, String> mJsonFields;

    private synchronized void checkJsonComposerElements() {
        Collection<Field> collection;
        Class<? extends JsonParser.Deserializer> deserializer;
        Class<JsonParser.Deserializer> cls = JsonParser.Deserializer.class;
        synchronized (this) {
            JsonType jsonType = (JsonType) getClass().getAnnotation(JsonType.class);
            if (jsonType != null) {
                this.mAllowEmpty = jsonType.allowEmpty();
                this.mFieldNameStyle = jsonType.fieldNameStyle();
                this.mFieldNamePrefix = jsonType.fieldNamePrefix();
                Class<? extends JsonParser.Deserializer> deserializer2 = jsonType.deserializer();
                if (deserializer2 != cls) {
                    this.mClassDeserializer.put(getClass(), (JsonParser.Deserializer) Util.newInstance(deserializer2, new Object[0]));
                }
            }
            this.mJsonFields = sClassJsonMap.get(getClass());
            ArrayList arrayList = new ArrayList();
            Map map = this.mJsonFields;
            if (map == null) {
                this.mJsonFields = new ConcurrentHashMap();
                for (Class cls2 = getClass(); cls2 != JsonComposer.class; cls2 = cls2.getSuperclass()) {
                    arrayList.addAll(Arrays.asList(cls2.getDeclaredFields()));
                }
                sClassJsonMap.put(getClass(), this.mJsonFields);
                collection = arrayList;
            } else {
                collection = map.keySet();
            }
            for (Field field : collection) {
                if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !Modifier.isFinal(field.getModifiers())) {
                    JsonType jsonType2 = (JsonType) field.getType().getAnnotation(JsonType.class);
                    if (!(jsonType2 == null || (deserializer = jsonType2.deserializer()) == cls)) {
                        this.mFieldDeserializer.put(field, (JsonParser.Deserializer) Util.newInstance(deserializer, new Object[0]));
                    }
                    Json json = (Json) field.getAnnotation(Json.class);
                    if (json != null) {
                        if (!json.ignore()) {
                            if (TextUtils.isEmpty(json.name())) {
                                this.mJsonFields.put(field, translateFieldName(field.getName()));
                            } else {
                                this.mJsonFields.put(field, json.name());
                            }
                        }
                        Class<? extends JsonParser.Deserializer> deserializer3 = json.deserializer();
                        if (deserializer3 != cls) {
                            this.mFieldDeserializer.put(field, (JsonParser.Deserializer) Util.newInstance(deserializer3, new Object[0]));
                        }
                    } else if (!field.getName().contains("this")) {
                        this.mJsonFields.put(field, translateFieldName(field.getName()));
                    }
                }
            }
        }
    }

    private String pickString(String str) {
        while (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("<");
            int lastIndexOf = str.lastIndexOf(">");
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (lastIndexOf < 0) {
                lastIndexOf = str.length();
            }
            if (lastIndexOf > indexOf) {
                str = str.substring(indexOf + 1, lastIndexOf);
                if (str.contains("<")) {
                    if (!str.contains(">")) {
                    }
                }
            }
            return str;
        }
        return str;
    }

    private String translateFieldName(String str) {
        String str2 = this.mFieldNamePrefix;
        if (str2 != null && str.startsWith(str2)) {
            String substring = str.substring(this.mFieldNamePrefix.length(), this.mFieldNamePrefix.length() + 1);
            str = substring.toLowerCase() + str.substring(this.mFieldNamePrefix.length() + 1);
        }
        if (this.mFieldNameStyle != FieldNameStyle.UNDERLINE) {
            return str;
        }
        Matcher matcher = Pattern.compile("[A-Z]").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public Object getFieldValueByJsonName(String str) {
        Map<Field, String> map = this.mJsonFields;
        if (map == null) {
            return null;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((String) next.getValue()).equals(str)) {
                return ((Field) next.getKey()).get(this);
            }
        }
        return null;
    }

    public boolean onEachItemParse(String str, Object obj) {
        return false;
    }

    public boolean onEachItemToJson(JSONObject jSONObject, String str, Object obj) {
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ExcHandler: IllegalAccessException (unused java.lang.IllegalAccessException), SYNTHETIC, Splitter:B:48:0x0108] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parse(org.json.JSONObject r9) {
        /*
            r8 = this;
            r8.checkJsonComposerElements()
            java.util.Map<java.lang.Class, com.tencent.map.tools.json.JsonParser$Deserializer> r0 = r8.mClassDeserializer
            java.lang.Class r1 = r8.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.tencent.map.tools.json.JsonParser$Deserializer r0 = (com.tencent.map.tools.json.JsonParser.Deserializer) r0
            if (r0 == 0) goto L_0x001d
            java.lang.Class r1 = r8.getClass()     // Catch:{ JSONException -> 0x001d }
            java.lang.String r1 = r1.getName()     // Catch:{ JSONException -> 0x001d }
            r0.deserialize(r8, r1, r9)     // Catch:{ JSONException -> 0x001d }
            return
        L_0x001d:
            java.util.Map<java.lang.reflect.Field, java.lang.String> r0 = r8.mJsonFields
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0264
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 1
            r2.setAccessible(r3)
            java.lang.Class r4 = r2.getType()
            java.lang.Object r5 = r1.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r9.opt(r5)
            java.util.Map<java.lang.reflect.Field, com.tencent.map.tools.json.JsonParser$Deserializer> r6 = r8.mFieldDeserializer
            java.lang.Object r6 = r6.get(r2)
            com.tencent.map.tools.json.JsonParser$Deserializer r6 = (com.tencent.map.tools.json.JsonParser.Deserializer) r6
            if (r6 == 0) goto L_0x0064
            java.lang.Object r7 = r1.getValue()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r6 = r6.deserialize(r8, r7, r5)     // Catch:{ Exception -> 0x0063 }
            r2.set(r8, r6)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0027
        L_0x0063:
        L_0x0064:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r8.onEachItemParse(r1, r5)
            if (r1 != 0) goto L_0x0027
            boolean r1 = r5 instanceof org.json.JSONArray
            r6 = 0
            if (r1 == 0) goto L_0x00e6
            java.lang.reflect.Type r1 = r2.getGenericType()
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x00cf
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r8.pickString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{  }
            if (r3 != 0) goto L_0x0027
            java.lang.Class r3 = r8.getClass()     // Catch:{  }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{  }
            java.lang.Class r1 = com.tencent.map.tools.Util.findClass(r1, r3)     // Catch:{  }
            if (r1 == 0) goto L_0x0027
            r3 = 0
            java.lang.Class<java.util.Set> r4 = java.util.Set.class
            java.lang.Class r7 = r2.getType()     // Catch:{  }
            boolean r4 = r4.isAssignableFrom(r7)     // Catch:{  }
            if (r4 == 0) goto L_0x00b1
            java.lang.Class<java.util.HashSet> r3 = java.util.HashSet.class
            org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{  }
            java.util.Collection r3 = com.tencent.map.tools.json.JsonUtils.parseTo(r3, r5, r1, r4)     // Catch:{  }
            goto L_0x00c7
        L_0x00b1:
            java.lang.Class<java.util.List> r4 = java.util.List.class
            java.lang.Class r7 = r2.getType()     // Catch:{  }
            boolean r4 = r4.isAssignableFrom(r7)     // Catch:{  }
            if (r4 == 0) goto L_0x00c7
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{  }
            java.util.Collection r3 = com.tencent.map.tools.json.JsonUtils.parseTo(r3, r5, r1, r4)     // Catch:{  }
        L_0x00c7:
            r2.set(r8, r3)     // Catch:{  }
            goto L_0x0027
        L_0x00cc:
            goto L_0x0027
        L_0x00cf:
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r3 = r1.isArray()
            if (r3 == 0) goto L_0x0027
            java.lang.Class r1 = r1.getComponentType()
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            java.lang.Object r1 = com.tencent.map.tools.json.JsonUtils.parseToArray(r5, r1)
            r2.set(r8, r1)     // Catch:{  }
            goto L_0x0027
        L_0x00e6:
            boolean r1 = r5 instanceof org.json.JSONObject
            if (r1 == 0) goto L_0x00fb
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.Class r1 = r2.getType()
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Object r1 = com.tencent.map.tools.json.JsonUtils.parseToModel((org.json.JSONObject) r5, r1, (java.lang.Object[]) r3)
            r2.set(r8, r1)     // Catch:{  }
            goto L_0x0027
        L_0x00fb:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r4 != r1) goto L_0x0108
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{  }
            r2.set(r8, r1)     // Catch:{  }
            goto L_0x0027
        L_0x0108:
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x0139
            boolean r1 = r5 instanceof java.lang.Boolean     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x011b
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            boolean r1 = r5.booleanValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setBoolean(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x011b:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = "false"
            boolean r1 = r5.equals(r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x012c
            r2.setBoolean(r8, r6)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x012c:
            java.lang.String r1 = "true"
            boolean r1 = r5.equals(r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            r2.setBoolean(r8, r3)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x0139:
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x015b
            boolean r1 = r5 instanceof java.lang.Byte     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x014c
            java.lang.Byte r5 = (java.lang.Byte) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            byte r1 = r5.byteValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setByte(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x014c:
            boolean r1 = r5 instanceof java.lang.Number     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            byte r1 = r5.byteValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setByte(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x015b:
            java.lang.Class r1 = java.lang.Character.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x01b3
            boolean r1 = r5 instanceof java.lang.Character     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x016e
            java.lang.Character r5 = (java.lang.Character) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            char r1 = r5.charValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setChar(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x016e:
            boolean r1 = r5 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            r1 = r5
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            boolean r1 = java.lang.Character.isLetter(r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0190
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            char[] r1 = java.lang.Character.toChars(r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            char r1 = r1[r6]     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setChar(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x0190:
            r1 = r5
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r3 = 10
            if (r3 <= r1) goto L_0x0027
            r1 = r5
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 < 0) goto L_0x0027
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            char r1 = java.lang.Character.forDigit(r1, r3)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setChar(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x01b3:
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x01d5
            boolean r1 = r5 instanceof java.lang.Number     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x01c6
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            double r3 = r5.doubleValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setDouble(r8, r3)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x01c6:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            double r3 = java.lang.Double.parseDouble(r5)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setDouble(r8, r3)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x01d5:
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x01f7
            boolean r1 = r5 instanceof java.lang.Number     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x01e8
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            float r1 = r5.floatValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setFloat(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x01e8:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            float r1 = java.lang.Float.parseFloat(r5)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setFloat(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x01f7:
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x0219
            boolean r1 = r5 instanceof java.lang.Number     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x020a
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setInt(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x020a:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            int r1 = java.lang.Integer.parseInt(r5)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setInt(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x0219:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x023b
            boolean r1 = r5 instanceof java.lang.Number     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x022c
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            long r3 = r5.longValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setLong(r8, r3)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x022c:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            long r3 = java.lang.Long.parseLong(r5)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setLong(r8, r3)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x023b:
            java.lang.Class r1 = java.lang.Short.TYPE     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r4 != r1) goto L_0x025d
            boolean r1 = r5 instanceof java.lang.Number     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x024e
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            short r1 = r5.shortValue()     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setShort(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x024e:
            boolean r1 = r5 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            if (r1 == 0) goto L_0x0027
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            short r1 = java.lang.Short.parseShort(r5)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            r2.setShort(r8, r1)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x025d:
            if (r5 == 0) goto L_0x0027
            r2.set(r8, r5)     // Catch:{ IllegalAccessException -> 0x00cc, IllegalAccessException -> 0x00cc }
            goto L_0x0027
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.json.JsonComposer.parse(org.json.JSONObject):void");
    }

    public JSONObject toJson() {
        Object obj;
        checkJsonComposerElements();
        Set<Map.Entry<Field, String>> entrySet = this.mJsonFields.entrySet();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : entrySet) {
            Field field = (Field) next.getKey();
            field.setAccessible(true);
            Class<?> type = field.getType();
            JSONArray jSONArray = null;
            try {
                obj = field.get(this);
            } catch (IllegalAccessException unused) {
                obj = null;
            }
            if (!onEachItemToJson(jSONObject, (String) next.getValue(), obj)) {
                if (Collection.class.isAssignableFrom(type)) {
                    try {
                        Collection collection = (Collection) field.get(this);
                        JSONArray jSONArray2 = new JSONArray();
                        if (collection != null && !collection.isEmpty()) {
                            for (Object next2 : collection) {
                                if (next2 instanceof JsonEncoder) {
                                    jSONArray2.put(JsonUtils.modelToJson(next2));
                                }
                            }
                        }
                        String str = (String) next.getValue();
                        if (this.mAllowEmpty || (collection != null && !collection.isEmpty())) {
                            jSONArray = jSONArray2;
                        }
                        jSONObject.put(str, jSONArray);
                    } catch (IllegalAccessException | JSONException unused2) {
                    }
                } else {
                    Object obj2 = field.get(this);
                    if (obj2 instanceof Double) {
                        jSONObject.put((String) next.getValue(), ((Double) obj2).doubleValue());
                    } else if (obj2 instanceof Long) {
                        jSONObject.put((String) next.getValue(), ((Long) obj2).longValue());
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put((String) next.getValue(), ((Integer) obj2).intValue());
                    } else if (obj2 instanceof Boolean) {
                        jSONObject.put((String) next.getValue(), ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof JsonEncoder) {
                        jSONObject.put((String) next.getValue(), JsonUtils.modelToJson(obj2));
                    } else if (obj2 == null || !obj2.getClass().isArray()) {
                        String str2 = (String) next.getValue();
                        if (obj2 == null && this.mAllowEmpty) {
                            obj2 = "";
                        }
                        jSONObject.put(str2, obj2);
                    } else {
                        jSONObject.put((String) next.getValue(), new JSONArray(obj2));
                    }
                }
            }
        }
        return jSONObject;
    }
}
