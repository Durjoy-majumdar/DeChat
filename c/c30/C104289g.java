package c30;

import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

/* renamed from: c30.g */
public class C104289g extends JSONObject implements C104288c {

    /* renamed from: a */
    public final C104288c f308643a;

    public C104289g() {
        this.f308643a = new C79922d();
    }

    /* renamed from: b */
    public C104288c mo110094b(String str, Object obj) {
        this.f308643a.mo110094b(str, obj);
        return this;
    }

    /* renamed from: d */
    public C104288c mo110096d(String str, boolean z) {
        this.f308643a.mo110096d(str, z);
        return this;
    }

    /* renamed from: e */
    public C104288c mo110097e(String str, double d) {
        this.f308643a.mo110097e(mo110099g(str), d);
        return this;
    }

    /* renamed from: g */
    public String mo110099g(String str) {
        return this.f308643a.mo110099g(str);
    }

    public Object get(String str) {
        return this.f308643a.get(str);
    }

    public boolean getBoolean(String str) {
        return this.f308643a.getBoolean(str);
    }

    public double getDouble(String str) {
        return this.f308643a.getDouble(str);
    }

    public int getInt(String str) {
        return this.f308643a.getInt(str);
    }

    public long getLong(String str) {
        return this.f308643a.getLong(str);
    }

    public String getString(String str) {
        return this.f308643a.getString(str);
    }

    public boolean has(String str) {
        return this.f308643a.has(str);
    }

    public boolean isNull(String str) {
        return this.f308643a.isNull(str);
    }

    /* renamed from: j */
    public C26827e mo110108i(String str) {
        C26826a i = this.f308643a.mo110108i(str);
        if (i == null) {
            return null;
        }
        return new C26827e(i);
    }

    /* renamed from: k */
    public C104289g getJSONObject(String str) {
        C104288c a = this.f308643a.mo110093a(str);
        if (a == null) {
            return null;
        }
        return new C104289g(a);
    }

    public Iterator<String> keys() {
        return this.f308643a.keys();
    }

    /* renamed from: l */
    public C26827e optJSONArray(String str) {
        C26826a f = this.f308643a.mo110098f(str);
        if (f == null) {
            return null;
        }
        return new C26827e(f);
    }

    public int length() {
        return this.f308643a.length();
    }

    /* renamed from: m */
    public C104289g optJSONObject(String str) {
        C104288c c = this.f308643a.mo110095c(str);
        if (c == null) {
            return null;
        }
        return new C104289g(c);
    }

    /* renamed from: n */
    public C104289g mo145953n(String str, int i) {
        this.f308643a.put(mo110099g(str), i);
        return this;
    }

    /* renamed from: o */
    public C104289g mo145954o(String str, long j) {
        this.f308643a.put(mo110099g(str), j);
        return this;
    }

    public Object opt(String str) {
        return this.f308643a.opt(str);
    }

    public boolean optBoolean(String str) {
        return this.f308643a.optBoolean(str, false);
    }

    public double optDouble(String str) {
        return this.f308643a.optDouble(str, Double.NaN);
    }

    public int optInt(String str) {
        return this.f308643a.optInt(str, 0);
    }

    public long optLong(String str) {
        return this.f308643a.optLong(str, 0);
    }

    public String optString(String str) {
        return this.f308643a.optString(str, "");
    }

    /* renamed from: p */
    public C104289g put(String str, Object obj) {
        if (obj instanceof C104289g) {
            return put(str, ((C104289g) obj).f308643a);
        }
        this.f308643a.mo110106h(str, obj);
        return this;
    }

    public JSONObject putOpt(String str, Object obj) {
        this.f308643a.mo110094b(str, obj);
        return this;
    }

    /* renamed from: q */
    public C104289g mo145966q(String str, boolean z) {
        this.f308643a.mo110096d(str, z);
        return this;
    }

    /* renamed from: r */
    public C104289g mo145967r(String str, Object obj) {
        this.f308643a.mo110094b(str, obj);
        return this;
    }

    public Object remove(String str) {
        return this.f308643a.remove(str);
    }

    public String toString() {
        return this.f308643a.toString();
    }

    public boolean optBoolean(String str, boolean z) {
        return this.f308643a.optBoolean(str, z);
    }

    public double optDouble(String str, double d) {
        return this.f308643a.optDouble(str, d);
    }

    public int optInt(String str, int i) {
        return this.f308643a.optInt(str, i);
    }

    public long optLong(String str, long j) {
        return this.f308643a.optLong(str, j);
    }

    public String optString(String str, String str2) {
        return this.f308643a.optString(str, str2);
    }

    public C104289g(C104288c cVar) {
        Assert.assertNotNull(cVar);
        this.f308643a = cVar;
    }

    public JSONObject put(String str, boolean z) {
        this.f308643a.mo110096d(str, z);
        return this;
    }

    public C104289g(Map map) {
        this.f308643a = new C79922d(map);
    }

    public JSONObject put(String str, double d) {
        this.f308643a.mo110097e(mo110099g(str), d);
        return this;
    }

    public C104289g(String str) {
        this.f308643a = new C79922d(str);
    }
}
