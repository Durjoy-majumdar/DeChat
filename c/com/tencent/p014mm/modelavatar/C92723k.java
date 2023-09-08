package com.tencent.p014mm.modelavatar;

import android.content.ContentValues;

/* renamed from: com.tencent.mm.modelavatar.k */
public class C92723k {

    /* renamed from: a */
    public String f266843a = "";

    /* renamed from: b */
    public int f266844b = 0;

    /* renamed from: c */
    public int f266845c = 0;

    /* renamed from: d */
    public String f266846d = "";

    /* renamed from: e */
    public int f266847e = 0;

    /* renamed from: f */
    public int f266848f = 0;

    /* renamed from: g */
    public int f266849g = 0;

    /* renamed from: h */
    public String f266850h = "";

    /* renamed from: i */
    public String f266851i = "";

    /* renamed from: j */
    public int f266852j = 0;

    /* renamed from: k */
    public int f266853k = 0;

    /* renamed from: l */
    public int f266854l = -1;

    /* renamed from: a */
    public ContentValues mo126946a() {
        ContentValues contentValues = new ContentValues();
        String str = "";
        if ((this.f266854l & 1) != 0) {
            String str2 = this.f266843a;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("username", str2);
        }
        if ((this.f266854l & 2) != 0) {
            contentValues.put("imgwidth", Integer.valueOf(this.f266844b));
        }
        if ((this.f266854l & 4) != 0) {
            contentValues.put("imgheigth", Integer.valueOf(this.f266845c));
        }
        if ((this.f266854l & 8) != 0) {
            String str3 = this.f266846d;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("imgformat", str3);
        }
        if ((this.f266854l & 16) != 0) {
            contentValues.put("totallen", Integer.valueOf(this.f266847e));
        }
        if ((this.f266854l & 32) != 0) {
            contentValues.put("startpos", Integer.valueOf(this.f266848f));
        }
        if ((this.f266854l & 64) != 0) {
            contentValues.put("headimgtype", Integer.valueOf(this.f266849g));
        }
        if ((this.f266854l & 128) != 0) {
            String str4 = this.f266850h;
            if (str4 == null) {
                str4 = str;
            }
            contentValues.put("reserved1", str4);
        }
        if ((this.f266854l & 256) != 0) {
            String str5 = this.f266851i;
            if (str5 != null) {
                str = str5;
            }
            contentValues.put("reserved2", str);
        }
        if ((this.f266854l & 512) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.f266852j));
        }
        if ((this.f266854l & 1024) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.f266853k));
        }
        return contentValues;
    }
}
