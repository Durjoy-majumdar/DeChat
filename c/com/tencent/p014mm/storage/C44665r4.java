package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: com.tencent.mm.storage.r4 */
public class C44665r4 {

    /* renamed from: a */
    public int f121094a;

    /* renamed from: b */
    public String f121095b;

    /* renamed from: c */
    public C44666a f121096c;

    /* renamed from: d */
    public int f121097d;

    /* renamed from: e */
    public int f121098e;

    /* renamed from: com.tencent.mm.storage.r4$a */
    public static class C44666a {

        /* renamed from: a */
        public String f121099a;

        public C44666a(String str) {
            int indexOf = str.indexOf("@");
            if (indexOf >= 0) {
                str.substring(0, indexOf);
                this.f121099a = str.substring(indexOf);
                return;
            }
            this.f121099a = "";
        }
    }

    public C44665r4() {
        this.f121094a = 135;
        this.f121096c = null;
        this.f121095b = "";
        this.f121097d = 0;
        this.f121098e = 0;
    }

    /* renamed from: a */
    public void mo69812a(Cursor cursor) {
        if ((this.f121094a & 2) != 0) {
            String string = cursor.getString(1);
            this.f121095b = string;
            if (this.f121096c == null) {
                this.f121096c = new C44666a(string);
            }
        }
        if ((this.f121094a & 4) != 0) {
            this.f121097d = cursor.getInt(2);
        }
        if ((this.f121094a & 128) != 0) {
            this.f121098e = cursor.getInt(7);
        }
    }

    /* renamed from: b */
    public ContentValues mo69813b() {
        ContentValues contentValues = new ContentValues();
        if ((this.f121094a & 2) != 0) {
            contentValues.put("name", this.f121095b);
        }
        if ((this.f121094a & 4) != 0) {
            contentValues.put("status", Integer.valueOf(this.f121097d));
        }
        if ((this.f121094a & 128) != 0) {
            contentValues.put("int_reserved1", Integer.valueOf(this.f121098e));
        }
        return contentValues;
    }

    /* renamed from: c */
    public boolean mo69814c() {
        return (this.f121097d & 1) != 0;
    }

    /* renamed from: d */
    public void mo69815d(boolean z) {
        if (z) {
            this.f121097d = z | this.f121097d ? 1 : 0;
        } else {
            this.f121097d &= -2;
        }
    }

    public C44665r4(String str, boolean z, boolean z2, int i) {
        this.f121094a = 135;
        this.f121095b = "";
        this.f121096c = null;
        this.f121096c = new C44666a(str);
        this.f121095b = str;
        this.f121097d = (z2 ? (char) 2 : 0) | z ? 1 : 0;
        this.f121098e = i;
    }
}
