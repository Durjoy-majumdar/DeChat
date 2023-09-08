package lv1;

import android.database.Cursor;

/* renamed from: lv1.m */
public class C99680m {

    /* renamed from: a */
    public long f292137a = 0;

    /* renamed from: b */
    public String f292138b = "";

    /* renamed from: c */
    public long f292139c = 0;

    /* renamed from: d */
    public long f292140d = 0;

    /* renamed from: e */
    public String f292141e = "";

    /* renamed from: f */
    public long f292142f = 0;

    /* renamed from: g */
    public int f292143g = 0;

    /* renamed from: h */
    public int f292144h = 0;

    /* renamed from: i */
    public long f292145i = 0;

    /* renamed from: j */
    public String f292146j = "";

    /* renamed from: a */
    public void mo139047a(Cursor cursor) {
        this.f292137a = cursor.getLong(0);
        this.f292138b = cursor.getString(1);
        this.f292140d = cursor.getLong(2);
        this.f292139c = cursor.getLong(3);
        this.f292141e = cursor.getString(4);
        this.f292142f = cursor.getLong(5);
        this.f292143g = cursor.getInt(6);
        this.f292144h = cursor.getInt(7);
        this.f292145i = cursor.getLong(8);
        this.f292146j = cursor.getString(9);
    }
}
