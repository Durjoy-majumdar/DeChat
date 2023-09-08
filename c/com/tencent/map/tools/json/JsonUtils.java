package com.tencent.map.tools.json;

import android.text.TextUtils;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.annotation.JsonType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    public static <T> String collectionToJson(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (T next : collection) {
            if (next instanceof JsonEncoder) {
                jSONArray.put(((JsonEncoder) next).toJson());
            } else {
                jSONArray.put((Object) null);
            }
        }
        return jSONArray.toString();
    }

    public static <T> JSONObject modelToJson(T t) {
        if (t instanceof JsonEncoder) {
            return ((JsonEncoder) t).toJson();
        }
        return null;
    }

    public static <T> String modelToJsonString(T t) {
        JSONObject modelToJson = modelToJson(t);
        if (modelToJson != null) {
            return modelToJson.toString();
        }
        return null;
    }

    public static <C extends Collection> C parseTo(Class<C> cls, JSONArray jSONArray, Class cls2, Object... objArr) {
        Class<Long> cls3 = Long.class;
        Class<Integer> cls4 = Integer.class;
        Class<Double> cls5 = Double.class;
        Class<String> cls6 = String.class;
        Class<Float> cls7 = Float.class;
        C c = (Collection) Util.newInstance(cls, new Object[0]);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object opt = jSONArray.opt(i);
                if (opt instanceof JSONArray) {
                    c.add(parseTo(cls, (JSONArray) opt, cls2, objArr));
                } else if (opt instanceof JSONObject) {
                    c.add(parseToModel((JSONObject) opt, cls2, objArr));
                } else if (opt.getClass() == cls2) {
                    c.add(opt);
                } else if (opt instanceof Integer) {
                    if (cls2 == cls5) {
                        c.add(Double.valueOf(((Integer) opt).doubleValue()));
                    } else if (cls2 == cls3) {
                        c.add(Long.valueOf(((Integer) opt).longValue()));
                    } else if (cls2 == cls7) {
                        c.add(Float.valueOf(((Integer) opt).floatValue()));
                    } else if (cls2 == cls6) {
                        c.add(opt.toString());
                    }
                } else if (opt instanceof Double) {
                    if (cls2 == cls4) {
                        c.add(Integer.valueOf(((Double) opt).intValue()));
                    } else if (cls2 == cls3) {
                        c.add(Long.valueOf(((Double) opt).longValue()));
                    } else if (cls2 == cls7) {
                        c.add(Float.valueOf(((Double) opt).floatValue()));
                    } else if (cls2 == cls6) {
                        c.add(opt.toString());
                    }
                } else if (opt instanceof Long) {
                    if (cls2 == cls4) {
                        c.add(Integer.valueOf(((Long) opt).intValue()));
                    } else if (cls2 == cls5) {
                        c.add(Double.valueOf(((Long) opt).doubleValue()));
                    } else if (cls2 == cls7) {
                        c.add(Float.valueOf(((Long) opt).floatValue()));
                    } else if (cls2 == cls6) {
                        c.add(opt.toString());
                    }
                }
            }
        }
        return c;
    }

    public static Object parseToArray(JSONArray jSONArray, Class cls) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        Object newInstance = Array.newInstance(cls, length);
        for (int i = 0; i < length; i++) {
            try {
                Array.set(newInstance, i, jSONArray.get(i));
            } catch (JSONException unused) {
            }
        }
        return newInstance;
    }

    public static <T> List<T> parseToList(JSONArray jSONArray, Class<T> cls, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(parseToModel(jSONArray.optJSONObject(i), cls, objArr));
            }
        }
        return arrayList;
    }

    public static <T> T parseToModel(JSONObject jSONObject, Class<T> cls, Object... objArr) {
        Class<? extends JsonParser.Deserializer> deserializer;
        JsonType jsonType = (JsonType) cls.getAnnotation(JsonType.class);
        T t = null;
        if (!(jsonType == null || (deserializer = jsonType.deserializer()) == JsonParser.Deserializer.class)) {
            try {
                T deserialize = ((JsonParser.Deserializer) Util.newInstance(deserializer, new Object[0])).deserialize((Object) null, "", jSONObject);
                if (deserialize != null && cls.isAssignableFrom(deserialize.getClass())) {
                    t = deserialize;
                }
            } catch (JSONException unused) {
            }
        }
        if (t == null) {
            t = Util.newInstance(cls, objArr);
        }
        if (t instanceof JsonParser) {
            ((JsonParser) t).parse(jSONObject);
        }
        return t;
    }

    public static <T> T parseToModel(String str, Class<T> cls, Object... objArr) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return parseToModel(new JSONObject(str), cls, objArr);
        } catch (JSONException unused) {
            return null;
        }
    }
}
