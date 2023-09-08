package c30;

import java.util.Collection;
import junit.framework.Assert;
import org.json.JSONArray;

/* renamed from: c30.e */
public class C26827e extends JSONArray implements C26826a {

    /* renamed from: a */
    public final C26826a f74618a;

    public C26827e() {
        this.f74618a = new C104287b();
    }

    /* renamed from: a */
    public C26826a mo53794a(double d) {
        this.f74618a.mo53794a(d);
        return this;
    }

    /* renamed from: b */
    public C26826a mo53795b(int i) {
        this.f74618a.mo53795b(i);
        return this;
    }

    /* renamed from: c */
    public C26826a mo53796c(long j) {
        this.f74618a.mo53796c(j);
        return this;
    }

    /* renamed from: d */
    public C26826a mo53797d(boolean z) {
        this.f74618a.mo53797d(z);
        return this;
    }

    /* renamed from: e */
    public C26826a mo53798e(int i) {
        return new C26827e(this.f74618a.mo53798e(i));
    }

    /* renamed from: g */
    public C26826a mo53800g(int i, Object obj) {
        this.f74618a.mo53800g(i, obj);
        return this;
    }

    public Object get(int i) {
        return this.f74618a.get(i);
    }

    public boolean getBoolean(int i) {
        return this.f74618a.getBoolean(i);
    }

    public double getDouble(int i) {
        return this.f74618a.getDouble(i);
    }

    public int getInt(int i) {
        return this.f74618a.getInt(i);
    }

    public long getLong(int i) {
        return this.f74618a.getLong(i);
    }

    public String getString(int i) {
        return this.f74618a.getString(i);
    }

    /* renamed from: i */
    public C26826a mo53808i(int i, double d) {
        this.f74618a.mo53808i(i, d);
        return this;
    }

    public boolean isNull(int i) {
        return this.f74618a.isNull(i);
    }

    /* renamed from: j */
    public C26826a mo53810j(int i, int i2) {
        this.f74618a.mo53810j(i, i2);
        return this;
    }

    /* renamed from: k */
    public C26826a mo53811k(int i, long j) {
        this.f74618a.mo53811k(i, j);
        return this;
    }

    /* renamed from: l */
    public C26826a mo53812l(int i, boolean z) {
        this.f74618a.mo53812l(i, z);
        return this;
    }

    public int length() {
        return this.f74618a.length();
    }

    /* renamed from: n */
    public C26827e mo53807h(int i) {
        return new C26827e(this.f74618a.mo53807h(i));
    }

    /* renamed from: o */
    public C104289g mo53814m(int i) {
        return new C104289g(this.f74618a.mo53814m(i));
    }

    public Object opt(int i) {
        return this.f74618a.opt(i);
    }

    public boolean optBoolean(int i) {
        return this.f74618a.optBoolean(i);
    }

    public double optDouble(int i) {
        return this.f74618a.optDouble(i);
    }

    public int optInt(int i) {
        return this.f74618a.optInt(i);
    }

    public JSONArray optJSONArray(int i) {
        return new C26827e(this.f74618a.mo53798e(i));
    }

    public long optLong(int i) {
        return this.f74618a.optLong(i);
    }

    public String optString(int i) {
        return this.f74618a.optString(i);
    }

    /* renamed from: p */
    public C104289g optJSONObject(int i) {
        return new C104289g(this.f74618a.mo53799f(i));
    }

    public JSONArray put(boolean z) {
        this.f74618a.mo53797d(z);
        return this;
    }

    /* renamed from: q */
    public C26827e mo53846q(Object obj) {
        this.f74618a.put(obj);
        return this;
    }

    public Object remove(int i) {
        return this.f74618a.remove(i);
    }

    public String toString() {
        return this.f74618a.toString();
    }

    public boolean optBoolean(int i, boolean z) {
        return this.f74618a.optBoolean(i, z);
    }

    public double optDouble(int i, double d) {
        return this.f74618a.optDouble(i, d);
    }

    public int optInt(int i, int i2) {
        return this.f74618a.optInt(i, i2);
    }

    public long optLong(int i, long j) {
        return this.f74618a.optLong(i, j);
    }

    public String optString(int i, String str) {
        return this.f74618a.optString(i, str);
    }

    public JSONArray put(double d) {
        this.f74618a.mo53794a(d);
        return this;
    }

    public String toString(int i) {
        return this.f74618a.toString(i);
    }

    public JSONArray put(int i) {
        this.f74618a.mo53795b(i);
        return this;
    }

    public C26827e(Collection collection) {
        this.f74618a = new C104287b(collection);
    }

    public JSONArray put(long j) {
        this.f74618a.mo53796c(j);
        return this;
    }

    public C26826a put(Object obj) {
        this.f74618a.put(obj);
        return this;
    }

    /* renamed from: put  reason: collision with other method in class */
    public JSONArray m168875put(Object obj) {
        this.f74618a.put(obj);
        return this;
    }

    public C26827e(String str) {
        this.f74618a = new C104287b(str);
    }

    public JSONArray put(int i, boolean z) {
        this.f74618a.mo53812l(i, z);
        return this;
    }

    public JSONArray put(int i, double d) {
        this.f74618a.mo53808i(i, d);
        return this;
    }

    public JSONArray put(int i, int i2) {
        this.f74618a.mo53810j(i, i2);
        return this;
    }

    public C26827e(C26826a aVar) {
        Assert.assertNotNull(aVar);
        this.f74618a = aVar;
    }

    public JSONArray put(int i, long j) {
        this.f74618a.mo53811k(i, j);
        return this;
    }

    public JSONArray put(int i, Object obj) {
        this.f74618a.mo53800g(i, obj);
        return this;
    }
}
