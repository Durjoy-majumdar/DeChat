package hg0;

import android.content.ContentValues;

/* renamed from: hg0.r */
public class C76184r {

    /* renamed from: a */
    public String f223213a = "";

    /* renamed from: b */
    public int f223214b = 0;

    /* renamed from: c */
    public int f223215c = 0;

    /* renamed from: d */
    public String f223216d = "";

    /* renamed from: e */
    public String f223217e = "";

    /* renamed from: f */
    public String f223218f = "";

    /* renamed from: g */
    public int f223219g = -1;

    /* renamed from: a */
    public ContentValues mo106445a() {
        ContentValues contentValues = new ContentValues();
        String str = "";
        if ((this.f223219g & 1) != 0) {
            String str2 = this.f223213a;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("username", str2);
        }
        if ((this.f223219g & 2) != 0) {
            contentValues.put("sex", Integer.valueOf(this.f223214b));
        }
        if ((this.f223219g & 4) != 0) {
            contentValues.put("personalcard", Integer.valueOf(this.f223215c));
        }
        if ((this.f223219g & 8) != 0) {
            String str3 = this.f223216d;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("province", str3);
        }
        if ((this.f223219g & 16) != 0) {
            String str4 = this.f223217e;
            if (str4 == null) {
                str4 = str;
            }
            contentValues.put("city", str4);
        }
        if ((this.f223219g & 32) != 0) {
            String str5 = this.f223218f;
            if (str5 != null) {
                str = str5;
            }
            contentValues.put("signature", str);
        }
        return contentValues;
    }

    /* renamed from: b */
    public void mo106446b(String str) {
        this.f223217e = str;
    }

    /* renamed from: c */
    public void mo106447c(int i) {
        this.f223215c = i;
    }

    /* renamed from: d */
    public void mo106448d(String str) {
        this.f223216d = str;
    }

    /* renamed from: e */
    public void mo106449e(int i) {
        this.f223214b = i;
    }

    /* renamed from: f */
    public void mo106450f(String str) {
        this.f223218f = str;
    }

    /* renamed from: g */
    public void mo106451g(String str) {
        this.f223213a = str;
    }
}
