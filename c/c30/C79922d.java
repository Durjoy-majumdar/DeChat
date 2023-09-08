package c30;

import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c30.d */
public class C79922d implements C104288c {

    /* renamed from: a */
    public JSONObject f234147a;

    public C79922d() {
        this.f234147a = new JSONObject();
    }

    /* renamed from: a */
    public C104288c mo110093a(String str) {
        try {
            JSONObject jSONObject = this.f234147a.getJSONObject(str);
            if (jSONObject == null) {
                return null;
            }
            return new C79922d(jSONObject);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: b */
    public C104288c mo110094b(String str, Object obj) {
        try {
            if (obj instanceof C79922d) {
                this.f234147a.putOpt(str, ((C79922d) obj).f234147a);
            } else {
                this.f234147a.putOpt(str, obj);
            }
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: c */
    public C104288c mo110095c(String str) {
        JSONObject optJSONObject = this.f234147a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new C79922d(optJSONObject);
    }

    /* renamed from: d */
    public C104288c mo110096d(String str, boolean z) {
        try {
            this.f234147a.put(str, z);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: e */
    public C104288c mo110097e(String str, double d) {
        try {
            this.f234147a.put(str, d);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: f */
    public C26826a mo110098f(String str) {
        JSONArray optJSONArray = this.f234147a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new C104287b(optJSONArray);
    }

    /* renamed from: g */
    public String mo110099g(String str) {
        if (str != null) {
            return str;
        }
        throw new C79923f("Names must be non-null");
    }

    public Object get(String str) {
        try {
            Object obj = this.f234147a.get(str);
            return obj instanceof JSONObject ? new C79922d((JSONObject) obj) : obj instanceof JSONArray ? new C104287b((JSONArray) obj) : obj;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public boolean getBoolean(String str) {
        try {
            return this.f234147a.getBoolean(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public double getDouble(String str) {
        try {
            return this.f234147a.getDouble(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public int getInt(String str) {
        try {
            return this.f234147a.getInt(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public long getLong(String str) {
        try {
            return this.f234147a.getLong(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public String getString(String str) {
        try {
            return this.f234147a.getString(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: h */
    public C104288c mo110106h(String str, Object obj) {
        try {
            if (obj instanceof C79922d) {
                this.f234147a.put(str, ((C79922d) obj).f234147a);
            } else {
                this.f234147a.put(str, obj);
            }
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public boolean has(String str) {
        return this.f234147a.has(str);
    }

    /* renamed from: i */
    public C26826a mo110108i(String str) {
        try {
            JSONArray jSONArray = this.f234147a.getJSONArray(str);
            if (jSONArray == null) {
                return null;
            }
            return new C104287b(jSONArray);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public boolean isNull(String str) {
        return this.f234147a.isNull(str);
    }

    public Iterator<String> keys() {
        return this.f234147a.keys();
    }

    public int length() {
        return this.f234147a.length();
    }

    public Object opt(String str) {
        try {
            Object obj = this.f234147a.get(str);
            return obj instanceof JSONObject ? new C79922d((JSONObject) obj) : obj instanceof JSONArray ? new C104287b((JSONArray) obj) : obj;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean optBoolean(String str, boolean z) {
        return this.f234147a.optBoolean(str, z);
    }

    public double optDouble(String str, double d) {
        return this.f234147a.optDouble(str, d);
    }

    public int optInt(String str, int i) {
        return this.f234147a.optInt(str, i);
    }

    public long optLong(String str, long j) {
        return this.f234147a.optLong(str, j);
    }

    public String optString(String str) {
        return this.f234147a.optString(str);
    }

    public C104288c put(String str, int i) {
        try {
            this.f234147a.put(str, i);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public Object remove(String str) {
        return this.f234147a.remove(str);
    }

    public String toString() {
        return this.f234147a.toString();
    }

    public String optString(String str, String str2) {
        return this.f234147a.optString(str, str2);
    }

    public C79922d(Map map) {
        this.f234147a = new JSONObject(map);
    }

    public C104288c put(String str, long j) {
        try {
            this.f234147a.put(str, j);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public C79922d(String str) {
        try {
            this.f234147a = new JSONObject(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public C79922d(JSONObject jSONObject) {
        Assert.assertNotNull(jSONObject);
        this.f234147a = jSONObject;
    }
}
