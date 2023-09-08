package hg0;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: hg0.a1 */
public class C76167a1 {

    /* renamed from: a */
    public long f223139a = 0;

    /* renamed from: b */
    public int f223140b = 0;

    /* renamed from: c */
    public int f223141c = 0;

    /* renamed from: d */
    public String f223142d = "";

    /* renamed from: e */
    public String f223143e = "";

    /* renamed from: f */
    public String f223144f = "";

    /* renamed from: g */
    public String f223145g = "";

    /* renamed from: h */
    public String f223146h = "";

    /* renamed from: i */
    public String f223147i = "";

    /* renamed from: j */
    public String f223148j = "";

    /* renamed from: k */
    public String f223149k = "";

    /* renamed from: l */
    public String f223150l = "";

    /* renamed from: m */
    public String f223151m = "";

    /* renamed from: n */
    public String f223152n = "";

    /* renamed from: o */
    public int f223153o = 0;

    /* renamed from: p */
    public int f223154p = 0;

    /* renamed from: q */
    public int f223155q = -1;

    /* renamed from: a */
    public void mo106397a(Cursor cursor) {
        this.f223139a = cursor.getLong(0);
        int i = cursor.getInt(1);
        if (i == 65536) {
            this.f223140b = 0;
        } else {
            this.f223140b = i;
        }
        this.f223141c = cursor.getInt(2);
        this.f223142d = cursor.getString(3);
        this.f223143e = cursor.getString(4);
        this.f223144f = cursor.getString(5);
        this.f223145g = cursor.getString(6);
        this.f223146h = cursor.getString(7);
        this.f223147i = cursor.getString(8);
        this.f223148j = cursor.getString(9);
        this.f223149k = cursor.getString(10);
        this.f223150l = cursor.getString(11);
        this.f223151m = cursor.getString(12);
        cursor.getString(13);
        this.f223152n = cursor.getString(14);
        this.f223153o = cursor.getInt(15);
        this.f223154p = cursor.getInt(16);
    }

    /* renamed from: b */
    public ContentValues mo106398b() {
        ContentValues contentValues = new ContentValues();
        if ((this.f223155q & 1) != 0) {
            contentValues.put("qq", Long.valueOf(this.f223139a));
        }
        if ((this.f223155q & 2) != 0) {
            int i = this.f223140b;
            if (i == 0) {
                contentValues.put("wexinstatus", 65536);
            } else {
                contentValues.put("wexinstatus", Integer.valueOf(i));
            }
        }
        if ((this.f223155q & 4) != 0) {
            contentValues.put("groupid", Integer.valueOf(this.f223141c));
        }
        String str = "";
        if ((this.f223155q & 8) != 0) {
            String str2 = this.f223142d;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("username", str2);
        }
        if ((this.f223155q & 16) != 0) {
            String str3 = this.f223143e;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("nickname", str3);
        }
        if ((this.f223155q & 32) != 0) {
            String str4 = this.f223144f;
            if (str4 == null) {
                str4 = str;
            }
            contentValues.put("pyinitial", str4);
        }
        if ((this.f223155q & 64) != 0) {
            String str5 = this.f223145g;
            if (str5 == null) {
                str5 = str;
            }
            contentValues.put("quanpin", str5);
        }
        if ((this.f223155q & 128) != 0) {
            String str6 = this.f223146h;
            if (str6 == null) {
                str6 = str;
            }
            contentValues.put("qqnickname", str6);
        }
        if ((this.f223155q & 256) != 0) {
            String str7 = this.f223147i;
            if (str7 == null) {
                str7 = str;
            }
            contentValues.put("qqpyinitial", str7);
        }
        if ((this.f223155q & 512) != 0) {
            String str8 = this.f223148j;
            if (str8 == null) {
                str8 = str;
            }
            contentValues.put("qqquanpin", str8);
        }
        if ((this.f223155q & 1024) != 0) {
            String str9 = this.f223149k;
            if (str9 == null) {
                str9 = str;
            }
            contentValues.put("qqremark", str9);
        }
        if ((this.f223155q & 2048) != 0) {
            String str10 = this.f223150l;
            if (str10 == null) {
                str10 = str;
            }
            contentValues.put("qqremarkpyinitial", str10);
        }
        if ((this.f223155q & 4096) != 0) {
            String str11 = this.f223151m;
            if (str11 == null) {
                str11 = str;
            }
            contentValues.put("qqremarkquanpin", str11);
        }
        if ((this.f223155q & 16384) != 0) {
            String str12 = this.f223152n;
            if (str12 != null) {
                str = str12;
            }
            contentValues.put("reserved2", str);
        }
        if ((this.f223155q & 32768) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.f223153o));
        }
        if ((this.f223155q & 65536) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.f223154p));
        }
        return contentValues;
    }

    /* renamed from: c */
    public String mo106399c() {
        String str = this.f223149k;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            String str2 = this.f223146h;
            return str2 == null ? "" : str2;
        }
        String str3 = this.f223149k;
        return str3 == null ? "" : str3;
    }

    public String toString() {
        return "groupID\t:" + this.f223141c + "\n" + "qq\t:" + this.f223139a + "\n" + "username\t:" + this.f223142d + "\n" + "nickname\t:" + this.f223143e + "\n" + "wexinStatus\t:" + this.f223140b + "\n" + "reserved3\t:" + this.f223153o + "\n" + "reserved4\t:" + this.f223154p + "\n";
    }
}
