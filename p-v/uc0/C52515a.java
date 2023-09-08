package uc0;

import android.content.ContentValues;

/* renamed from: uc0.a */
public class C52515a {

    /* renamed from: a */
    public String f146671a = "";

    /* renamed from: b */
    public int f146672b = 0;

    /* renamed from: c */
    public String f146673c = "";

    /* renamed from: d */
    public String f146674d = "";

    /* renamed from: e */
    public String f146675e = "";

    /* renamed from: f */
    public int f146676f = 0;

    /* renamed from: g */
    public int f146677g = 0;

    /* renamed from: h */
    public int f146678h = -1;

    /* renamed from: a */
    public ContentValues mo73448a() {
        ContentValues contentValues = new ContentValues();
        if ((this.f146678h & 1) != 0) {
            contentValues.put("username", mo73449b());
        }
        if ((this.f146678h & 2) != 0) {
            contentValues.put("bgflag", Integer.valueOf(this.f146672b));
        }
        String str = "";
        if ((this.f146678h & 4) != 0) {
            String str2 = this.f146673c;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("path", str2);
        }
        if ((this.f146678h & 8) != 0) {
            String str3 = this.f146674d;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f146678h & 16) != 0) {
            String str4 = this.f146675e;
            if (str4 != null) {
                str = str4;
            }
            contentValues.put("reserved2", str);
        }
        if ((this.f146678h & 32) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.f146676f));
        }
        if ((this.f146678h & 64) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.f146677g));
        }
        return contentValues;
    }

    /* renamed from: b */
    public String mo73449b() {
        String str = this.f146671a;
        return str == null ? "" : str;
    }
}
