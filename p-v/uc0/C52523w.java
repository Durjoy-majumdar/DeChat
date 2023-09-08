package uc0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
import p749xh.C66261f3;

/* renamed from: uc0.w */
public class C52523w {

    /* renamed from: a */
    public int f146696a = 0;

    /* renamed from: b */
    public int f146697b = 0;

    /* renamed from: c */
    public String f146698c = "";

    /* renamed from: d */
    public int f146699d = 0;

    /* renamed from: e */
    public String f146700e = "";

    /* renamed from: f */
    public int f146701f = 0;

    /* renamed from: g */
    public int f146702g = 0;

    /* renamed from: h */
    public String f146703h = "";

    /* renamed from: i */
    public String f146704i = "";

    /* renamed from: j */
    public int f146705j = 0;

    /* renamed from: k */
    public int f146706k = 0;

    /* renamed from: l */
    public int f146707l = -1;

    /* renamed from: a */
    public void mo73456a(Cursor cursor) {
        this.f146697b = cursor.getInt(2);
        this.f146698c = cursor.getString(3);
        this.f146699d = cursor.getInt(4);
        this.f146700e = cursor.getString(5);
        this.f146701f = cursor.getInt(6);
        this.f146703h = cursor.getString(8);
        this.f146704i = cursor.getString(9);
        this.f146702g = cursor.getInt(7);
        this.f146706k = cursor.getInt(11);
        this.f146696a = cursor.getInt(1);
        this.f146705j = cursor.getInt(10);
        cursor.getString(0);
    }

    /* renamed from: b */
    public ContentValues mo73457b() {
        ContentValues contentValues = new ContentValues();
        if ((this.f146707l & 2) != 0) {
            contentValues.put("id", Integer.valueOf(this.f146696a));
        }
        if ((this.f146707l & 4) != 0) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.f146697b));
        }
        String str = "";
        if ((this.f146707l & 8) != 0) {
            String str2 = this.f146698c;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("name", str2);
        }
        if ((this.f146707l & 16) != 0) {
            contentValues.put("size", Integer.valueOf(this.f146699d));
        }
        if ((this.f146707l & 32) != 0) {
            String str3 = this.f146700e;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("packname", str3);
        }
        if ((this.f146707l & 64) != 0) {
            contentValues.put("status", Integer.valueOf(this.f146701f));
        }
        if ((this.f146707l & 128) != 0) {
            contentValues.put("type", Integer.valueOf(this.f146702g));
        }
        if ((this.f146707l & 256) != 0) {
            String str4 = this.f146703h;
            if (str4 == null) {
                str4 = str;
            }
            contentValues.put("reserved1", str4);
        }
        if ((this.f146707l & 512) != 0) {
            String str5 = this.f146704i;
            if (str5 != null) {
                str = str5;
            }
            contentValues.put("reserved2", str);
        }
        if ((this.f146707l & 1024) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.f146705j));
        }
        if ((this.f146707l & 2048) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.f146706k));
        }
        if ((this.f146707l & 1) != 0) {
            contentValues.put(C66261f3.COL_LOCALID, this.f146696a + "_" + this.f146702g);
        }
        return contentValues;
    }

    /* renamed from: c */
    public int mo73458c() {
        return this.f146696a;
    }

    /* renamed from: d */
    public int mo73459d() {
        return this.f146702g;
    }
}
