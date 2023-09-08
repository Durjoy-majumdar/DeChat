package hg0;

import android.content.ContentValues;

/* renamed from: hg0.x */
public class C46069x {

    /* renamed from: a */
    public String f124212a = "";

    /* renamed from: b */
    public int f124213b = 0;

    /* renamed from: c */
    public int f124214c = 0;

    /* renamed from: d */
    public String f124215d = "";

    /* renamed from: e */
    public String f124216e = "";

    /* renamed from: f */
    public int f124217f = -1;

    /* renamed from: a */
    public ContentValues mo71487a() {
        ContentValues contentValues = new ContentValues();
        String str = "";
        if ((this.f124217f & 1) != 0) {
            String str2 = this.f124212a;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("username", str2);
        }
        if ((this.f124217f & 2) != 0) {
            contentValues.put("friendtype", Integer.valueOf(this.f124213b));
        }
        if ((this.f124217f & 4) != 0) {
            contentValues.put("updatetime", Integer.valueOf(this.f124214c));
        }
        if ((this.f124217f & 8) != 0) {
            contentValues.put("reserved1", 0);
        }
        if ((this.f124217f & 16) != 0) {
            contentValues.put("reserved2", 0);
        }
        if ((this.f124217f & 32) != 0) {
            String str3 = this.f124215d;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("reserved3", str3);
        }
        if ((this.f124217f & 64) != 0) {
            String str4 = this.f124216e;
            if (str4 != null) {
                str = str4;
            }
            contentValues.put("reserved4", str);
        }
        return contentValues;
    }
}
