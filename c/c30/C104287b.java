package c30;

import java.util.Collection;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c30.b */
public class C104287b implements C26826a {

    /* renamed from: a */
    public JSONArray f308642a;

    public C104287b() {
        this.f308642a = new JSONArray();
    }

    /* renamed from: a */
    public C26826a mo53794a(double d) {
        try {
            this.f308642a.put(d);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: b */
    public C26826a mo53795b(int i) {
        this.f308642a.put(i);
        return this;
    }

    /* renamed from: c */
    public C26826a mo53796c(long j) {
        this.f308642a.put(j);
        return this;
    }

    /* renamed from: d */
    public C26826a mo53797d(boolean z) {
        this.f308642a.put(z);
        return this;
    }

    /* renamed from: e */
    public C26826a mo53798e(int i) {
        JSONArray optJSONArray = this.f308642a.optJSONArray(i);
        if (optJSONArray == null) {
            return null;
        }
        return new C104287b(optJSONArray);
    }

    /* renamed from: f */
    public C104288c mo53799f(int i) {
        JSONObject optJSONObject = this.f308642a.optJSONObject(i);
        if (optJSONObject == null) {
            return null;
        }
        return new C79922d(optJSONObject);
    }

    /* renamed from: g */
    public C26826a mo53800g(int i, Object obj) {
        try {
            this.f308642a.put(i, obj);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public Object get(int i) {
        try {
            Object obj = this.f308642a.get(i);
            return obj instanceof JSONObject ? new C79922d((JSONObject) obj) : obj instanceof JSONArray ? new C104287b((JSONArray) obj) : obj;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public boolean getBoolean(int i) {
        try {
            return this.f308642a.getBoolean(i);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public double getDouble(int i) {
        try {
            return this.f308642a.getDouble(i);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public int getInt(int i) {
        try {
            return this.f308642a.getInt(i);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public long getLong(int i) {
        try {
            return this.f308642a.getLong(i);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public String getString(int i) {
        try {
            return this.f308642a.getString(i);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: h */
    public C26826a mo53807h(int i) {
        try {
            JSONArray jSONArray = this.f308642a.getJSONArray(i);
            if (jSONArray == null) {
                return null;
            }
            return new C104287b(jSONArray);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: i */
    public C26826a mo53808i(int i, double d) {
        try {
            this.f308642a.put(i, d);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public boolean isNull(int i) {
        return this.f308642a.isNull(i);
    }

    /* renamed from: j */
    public C26826a mo53810j(int i, int i2) {
        try {
            this.f308642a.put(i, i2);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: k */
    public C26826a mo53811k(int i, long j) {
        try {
            this.f308642a.put(i, j);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    /* renamed from: l */
    public C26826a mo53812l(int i, boolean z) {
        try {
            this.f308642a.put(i, z);
            return this;
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public int length() {
        return this.f308642a.length();
    }

    /* renamed from: m */
    public C104288c mo53814m(int i) {
        try {
            JSONObject jSONObject = this.f308642a.getJSONObject(i);
            if (jSONObject == null) {
                return null;
            }
            return new C79922d(jSONObject);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public Object opt(int i) {
        Object opt = this.f308642a.opt(i);
        return opt instanceof JSONObject ? new C79922d((JSONObject) opt) : opt instanceof JSONArray ? new C104287b((JSONArray) opt) : opt;
    }

    public boolean optBoolean(int i) {
        return this.f308642a.optBoolean(i);
    }

    public double optDouble(int i) {
        return this.f308642a.optDouble(i);
    }

    public int optInt(int i) {
        return this.f308642a.optInt(i);
    }

    public long optLong(int i) {
        return this.f308642a.optLong(i);
    }

    public String optString(int i) {
        return this.f308642a.optString(i);
    }

    public C26826a put(Object obj) {
        this.f308642a.put(obj);
        return this;
    }

    public Object remove(int i) {
        Object remove = this.f308642a.remove(i);
        return remove instanceof JSONObject ? new C79922d((JSONObject) remove) : remove instanceof JSONArray ? new C104287b((JSONArray) remove) : remove;
    }

    public String toString() {
        return this.f308642a.toString();
    }

    public boolean optBoolean(int i, boolean z) {
        return this.f308642a.optBoolean(i, z);
    }

    public double optDouble(int i, double d) {
        return this.f308642a.optDouble(i, d);
    }

    public int optInt(int i, int i2) {
        return this.f308642a.optInt(i, i2);
    }

    public long optLong(int i, long j) {
        return this.f308642a.optLong(i, j);
    }

    public String optString(int i, String str) {
        return this.f308642a.optString(i, str);
    }

    public String toString(int i) {
        try {
            return this.f308642a.toString(i);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public C104287b(Collection collection) {
        this.f308642a = new JSONArray(collection);
    }

    public C104287b(String str) {
        try {
            this.f308642a = new JSONArray(str);
        } catch (JSONException e) {
            throw new C79923f((Throwable) e);
        }
    }

    public C104287b(JSONArray jSONArray) {
        Assert.assertNotNull(jSONArray);
        this.f308642a = jSONArray;
    }
}
