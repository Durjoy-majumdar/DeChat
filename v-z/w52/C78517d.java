package w52;

import android.database.Cursor;

/* renamed from: w52.d */
public class C78517d {

    /* renamed from: a */
    public String f229975a = "";

    /* renamed from: b */
    public int f229976b = 0;

    /* renamed from: c */
    public long f229977c = 0;

    /* renamed from: d */
    public long f229978d = 0;

    /* renamed from: e */
    public String f229979e = "";

    /* renamed from: f */
    public String f229980f = "";

    /* renamed from: g */
    public String f229981g = "";

    /* renamed from: h */
    public int f229982h = 0;

    /* renamed from: i */
    public int f229983i = 0;

    /* renamed from: j */
    public int f229984j = 0;

    /* renamed from: k */
    public int f229985k = 0;

    /* renamed from: l */
    public int f229986l = 0;

    /* renamed from: m */
    public int f229987m = 0;

    /* renamed from: n */
    public int f229988n = 0;

    /* renamed from: o */
    public int f229989o = 0;

    /* renamed from: p */
    public int f229990p = 0;

    /* renamed from: q */
    public String f229991q = "";

    /* renamed from: r */
    public String f229992r = "";

    /* renamed from: s */
    public int f229993s = -1;

    /* renamed from: a */
    public void mo108462a(Cursor cursor) {
        this.f229975a = cursor.getString(0);
        this.f229976b = cursor.getInt(1);
        this.f229977c = cursor.getLong(2);
        this.f229978d = cursor.getLong(3);
        this.f229979e = cursor.getString(4);
        this.f229980f = cursor.getString(5);
        this.f229981g = cursor.getString(6);
        this.f229982h = cursor.getInt(7);
        this.f229983i = cursor.getInt(8);
        this.f229984j = cursor.getInt(9);
        this.f229985k = cursor.getInt(10);
        this.f229986l = cursor.getInt(11);
        this.f229987m = cursor.getInt(12);
        this.f229988n = cursor.getInt(13);
        this.f229989o = cursor.getInt(14);
        this.f229990p = cursor.getInt(15);
        this.f229991q = cursor.getString(16);
        this.f229992r = cursor.getString(17);
    }

    /* renamed from: b */
    public String mo108463b() {
        String str = this.f229975a;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public String mo108464c() {
        String str = this.f229979e;
        return str == null ? "" : str;
    }

    /* renamed from: d */
    public int mo108465d() {
        return this.f229984j;
    }

    /* renamed from: e */
    public int mo108466e() {
        return this.f229983i;
    }

    /* renamed from: f */
    public String mo108467f() {
        String str = this.f229981g;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public int mo108468g() {
        return this.f229982h;
    }

    /* renamed from: h */
    public int mo108469h() {
        return this.f229989o;
    }

    /* renamed from: i */
    public void mo108470i(String str) {
        this.f229975a = str;
    }

    /* renamed from: j */
    public void mo108471j(long j) {
        this.f229977c = j;
    }

    /* renamed from: k */
    public void mo108472k(int i) {
        this.f229986l = i;
    }

    /* renamed from: l */
    public void mo108473l(int i) {
        this.f229990p = i;
    }

    /* renamed from: m */
    public void mo108474m(int i) {
        this.f229976b = i;
    }

    /* renamed from: n */
    public void mo108475n(int i) {
        this.f229988n = i;
    }
}
