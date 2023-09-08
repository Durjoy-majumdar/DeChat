package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.Scopes;

/* renamed from: hg0.o */
public class C76174o {

    /* renamed from: a */
    public long f223170a = 0;

    /* renamed from: b */
    public String f223171b = "";

    /* renamed from: c */
    public int f223172c = 0;

    /* renamed from: d */
    public int f223173d = 0;

    /* renamed from: e */
    public String f223174e = "";

    /* renamed from: f */
    public String f223175f = "";

    /* renamed from: g */
    public String f223176g = "";

    /* renamed from: h */
    public String f223177h = "";

    /* renamed from: i */
    public int f223178i = 0;

    /* renamed from: j */
    public int f223179j = 0;

    /* renamed from: k */
    public String f223180k = "";

    /* renamed from: l */
    public String f223181l = "";

    /* renamed from: m */
    public String f223182m = "";

    /* renamed from: n */
    public String f223183n = "";

    /* renamed from: o */
    public int f223184o = 0;

    /* renamed from: p */
    public String f223185p = "";

    /* renamed from: q */
    public int f223186q = -1;

    /* renamed from: a */
    public void mo106412a(Cursor cursor) {
        this.f223170a = cursor.getLong(0);
        this.f223171b = cursor.getString(1);
        this.f223172c = cursor.getInt(2);
        this.f223173d = cursor.getInt(3);
        this.f223174e = cursor.getString(4);
        this.f223175f = cursor.getString(5);
        this.f223176g = cursor.getString(6);
        this.f223177h = cursor.getString(7);
        this.f223178i = cursor.getInt(8);
        this.f223179j = cursor.getInt(9);
        this.f223180k = cursor.getString(10);
        this.f223181l = cursor.getString(11);
        this.f223182m = cursor.getString(12);
        this.f223183n = cursor.getString(13);
        this.f223184o = cursor.getInt(14);
        this.f223185p = cursor.getString(15);
    }

    /* renamed from: b */
    public ContentValues mo106413b() {
        ContentValues contentValues = new ContentValues();
        if ((this.f223186q & 1) != 0) {
            contentValues.put("fbid", Long.valueOf(this.f223170a));
        }
        String str = "";
        if ((this.f223186q & 2) != 0) {
            String str2 = this.f223171b;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("fbname", str2);
        }
        if ((this.f223186q & 4) != 0) {
            contentValues.put("fbimgkey", Integer.valueOf(this.f223172c));
        }
        if ((this.f223186q & 8) != 0) {
            contentValues.put("status", Integer.valueOf(this.f223173d));
        }
        if ((this.f223186q & 16) != 0) {
            String str3 = this.f223174e;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("username", str3);
        }
        if ((this.f223186q & 32) != 0) {
            String str4 = this.f223175f;
            if (str4 == null) {
                str4 = str;
            }
            contentValues.put("nickname", str4);
        }
        if ((this.f223186q & 64) != 0) {
            String str5 = this.f223176g;
            if (str5 == null) {
                str5 = str;
            }
            contentValues.put("nicknamepyinitial", str5);
        }
        if ((this.f223186q & 128) != 0) {
            String str6 = this.f223177h;
            if (str6 == null) {
                str6 = str;
            }
            contentValues.put("nicknamequanpin", str6);
        }
        if ((this.f223186q & 256) != 0) {
            contentValues.put("sex", Integer.valueOf(this.f223178i));
        }
        if ((this.f223186q & 512) != 0) {
            contentValues.put("personalcard", Integer.valueOf(this.f223179j));
        }
        if ((this.f223186q & 1024) != 0) {
            String str7 = this.f223180k;
            if (str7 == null) {
                str7 = str;
            }
            contentValues.put("province", str7);
        }
        if ((this.f223186q & 2048) != 0) {
            String str8 = this.f223181l;
            if (str8 == null) {
                str8 = str;
            }
            contentValues.put("city", str8);
        }
        if ((this.f223186q & 4096) != 0) {
            String str9 = this.f223182m;
            if (str9 == null) {
                str9 = str;
            }
            contentValues.put("signature", str9);
        }
        if ((this.f223186q & 8192) != 0) {
            String str10 = this.f223183n;
            if (str10 == null) {
                str10 = str;
            }
            contentValues.put("alias", str10);
        }
        if ((this.f223186q & 16384) != 0) {
            contentValues.put("type", Integer.valueOf(this.f223184o));
        }
        if ((this.f223186q & 32768) != 0) {
            String str11 = this.f223185p;
            if (str11 != null) {
                str = str11;
            }
            contentValues.put(Scopes.EMAIL, str);
        }
        return contentValues;
    }

    /* renamed from: c */
    public int mo106414c() {
        return this.f223186q;
    }

    /* renamed from: d */
    public long mo106415d() {
        return this.f223170a;
    }

    /* renamed from: e */
    public void mo106416e(String str) {
        this.f223183n = str;
    }

    /* renamed from: f */
    public void mo106417f(String str) {
        this.f223181l = str;
    }

    /* renamed from: g */
    public void mo106418g(long j) {
        this.f223170a = j;
    }

    /* renamed from: h */
    public void mo106419h(int i) {
        this.f223172c = i;
    }

    /* renamed from: i */
    public void mo106420i(String str) {
        this.f223171b = str;
    }

    /* renamed from: j */
    public void mo106421j(String str) {
        this.f223175f = str;
    }

    /* renamed from: k */
    public void mo106422k(String str) {
        this.f223176g = str;
    }

    /* renamed from: l */
    public void mo106423l(String str) {
        this.f223177h = str;
    }

    /* renamed from: m */
    public void mo106424m(int i) {
        this.f223179j = i;
    }

    /* renamed from: n */
    public void mo106425n(String str) {
        this.f223180k = str;
    }

    /* renamed from: o */
    public void mo106426o(int i) {
        this.f223178i = i;
    }

    /* renamed from: p */
    public void mo106427p(String str) {
        this.f223182m = str;
    }

    /* renamed from: q */
    public void mo106428q(int i) {
        this.f223173d = i;
    }

    /* renamed from: r */
    public void mo106429r(String str) {
        this.f223174e = str;
    }
}
