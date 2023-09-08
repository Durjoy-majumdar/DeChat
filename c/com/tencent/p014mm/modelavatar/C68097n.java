package com.tencent.p014mm.modelavatar;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.modelavatar.n */
public class C68097n {

    /* renamed from: a */
    public String f195728a = "";

    /* renamed from: b */
    public int f195729b = 0;

    /* renamed from: c */
    public int f195730c = 0;

    /* renamed from: d */
    public String f195731d = "";

    /* renamed from: e */
    public String f195732e = "";

    /* renamed from: f */
    public int f195733f = 0;

    /* renamed from: g */
    public int f195734g = 0;

    /* renamed from: h */
    public int f195735h = 0;

    /* renamed from: i */
    public int f195736i = -1;

    /* renamed from: a */
    public void mo93592a(Cursor cursor) {
        this.f195728a = cursor.getString(0);
        this.f195729b = cursor.getInt(1);
        this.f195730c = cursor.getInt(2);
        this.f195732e = cursor.getString(3);
        this.f195731d = cursor.getString(4);
        this.f195733f = cursor.getInt(5);
        this.f195734g = cursor.getInt(6);
        this.f195735h = cursor.getInt(7);
    }

    /* renamed from: b */
    public ContentValues mo93593b() {
        ContentValues contentValues = new ContentValues();
        if ((this.f195736i & 1) != 0) {
            contentValues.put("username", mo93598g());
        }
        if ((this.f195736i & 2) != 0) {
            contentValues.put("imgflag", Integer.valueOf(this.f195729b));
        }
        if ((this.f195736i & 4) != 0) {
            contentValues.put("lastupdatetime", Integer.valueOf(this.f195730c));
        }
        if ((this.f195736i & 8) != 0) {
            contentValues.put("reserved1", mo93594c());
        }
        if ((this.f195736i & 16) != 0) {
            contentValues.put("reserved2", mo93597f());
        }
        if ((this.f195736i & 32) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.f195733f));
        }
        if ((this.f195736i & 64) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.f195734g));
        }
        if ((this.f195736i & 128) != 0) {
            contentValues.put("updateflag", Integer.valueOf(this.f195735h));
        }
        return contentValues;
    }

    /* renamed from: c */
    public String mo93594c() {
        String str = this.f195732e;
        return str == null ? "" : str;
    }

    /* renamed from: d */
    public int mo93595d() {
        return this.f195736i;
    }

    /* renamed from: e */
    public int mo93596e() {
        return this.f195729b;
    }

    /* renamed from: f */
    public String mo93597f() {
        String str = this.f195731d;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo93598g() {
        String str = this.f195728a;
        return str == null ? "" : str;
    }

    /* renamed from: h */
    public void mo93599h(String str) {
        this.f195732e = str;
    }

    /* renamed from: i */
    public void mo93600i(int i) {
        this.f195736i = i;
    }

    /* renamed from: j */
    public void mo93601j(boolean z) {
        this.f195733f = z ? 1 : 0;
    }

    /* renamed from: k */
    public void mo93602k(int i) {
        this.f195729b = i;
    }

    /* renamed from: l */
    public void mo93603l() {
        this.f195734g = (int) (Util.nowSecond() / 60);
        this.f195736i |= 64;
    }

    /* renamed from: m */
    public void mo93604m(int i) {
        this.f195730c = i;
    }

    /* renamed from: n */
    public void mo93605n(String str) {
        this.f195731d = str;
    }

    /* renamed from: o */
    public void mo93606o(String str) {
        this.f195728a = str;
    }
}
