package com.tencent.p014mm.modelimage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: com.tencent.mm.modelimage.k */
public class C92836k {

    /* renamed from: A */
    public boolean f267358A;

    /* renamed from: B */
    public boolean f267359B;

    /* renamed from: C */
    public boolean f267360C;

    /* renamed from: D */
    public boolean f267361D;

    /* renamed from: E */
    public boolean f267362E;

    /* renamed from: F */
    public boolean f267363F;

    /* renamed from: G */
    public boolean f267364G;

    /* renamed from: H */
    public boolean f267365H;

    /* renamed from: I */
    public boolean f267366I;

    /* renamed from: J */
    public boolean f267367J;

    /* renamed from: K */
    public boolean f267368K;

    /* renamed from: L */
    public boolean f267369L;

    /* renamed from: M */
    public boolean f267370M;

    /* renamed from: N */
    public boolean f267371N;

    /* renamed from: O */
    public boolean f267372O;

    /* renamed from: P */
    public boolean f267373P;

    /* renamed from: a */
    public long f267374a;

    /* renamed from: b */
    public long f267375b;

    /* renamed from: c */
    public int f267376c;

    /* renamed from: d */
    public int f267377d;

    /* renamed from: e */
    public String f267378e = "";

    /* renamed from: f */
    public String f267379f = "";

    /* renamed from: g */
    public String f267380g = "";

    /* renamed from: h */
    public int f267381h;

    /* renamed from: i */
    public int f267382i;

    /* renamed from: j */
    public String f267383j = "";

    /* renamed from: k */
    public int f267384k = 0;

    /* renamed from: l */
    public String f267385l = "";

    /* renamed from: m */
    public int f267386m;

    /* renamed from: n */
    public long f267387n;

    /* renamed from: o */
    public int f267388o;

    /* renamed from: p */
    public int f267389p;

    /* renamed from: q */
    public int f267390q = 0;

    /* renamed from: r */
    public int f267391r;

    /* renamed from: s */
    public int f267392s = 0;

    /* renamed from: t */
    public String f267393t = "";

    /* renamed from: u */
    public int f267394u = 1;

    /* renamed from: v */
    public boolean f267395v;

    /* renamed from: w */
    public boolean f267396w;

    /* renamed from: x */
    public boolean f267397x;

    /* renamed from: y */
    public boolean f267398y;

    /* renamed from: z */
    public boolean f267399z;

    /* renamed from: A */
    public void mo127124A(long j) {
        this.f267387n = j;
        this.f267361D = true;
    }

    /* renamed from: B */
    public void mo127125B(long j) {
        if (this.f267375b != j) {
            this.f267396w = true;
        }
        this.f267375b = j;
    }

    /* renamed from: C */
    public void mo127126C(int i) {
        int i2 = 1;
        if (this.f267376c != i) {
            this.f267397x = true;
        }
        this.f267376c = i;
        Log.m105921e("MicroMsg.Imgfo", "set offset : %d  id:%d total:%d", Integer.valueOf(i), Long.valueOf(this.f267387n), Integer.valueOf(this.f267377d));
        if (i < this.f267377d) {
            i2 = 0;
        }
        mo127153x(i2);
    }

    /* renamed from: D */
    public void mo127127D(int i) {
        this.f267388o = i;
        this.f267362E = true;
    }

    /* renamed from: E */
    public void mo127128E(String str) {
        this.f267380g = str;
        this.f267359B = true;
    }

    /* renamed from: F */
    public void mo127129F(int i) {
        this.f267377d = i;
        this.f267398y = true;
    }

    /* renamed from: a */
    public void mo127130a() {
        this.f267395v = false;
        this.f267396w = false;
        this.f267397x = false;
        this.f267398y = false;
        this.f267399z = false;
        this.f267358A = false;
        this.f267359B = false;
        this.f267360C = false;
        this.f267361D = false;
        this.f267362E = false;
        this.f267363F = false;
        this.f267364G = false;
        this.f267365H = false;
        this.f267366I = false;
        this.f267367J = false;
        this.f267368K = false;
        this.f267369L = false;
        this.f267370M = false;
        this.f267371N = false;
        this.f267372O = false;
        this.f267373P = false;
    }

    /* renamed from: b */
    public void mo127131b(Cursor cursor) {
        this.f267374a = (long) cursor.getInt(0);
        this.f267375b = cursor.getLong(1);
        this.f267376c = cursor.getInt(2);
        this.f267377d = cursor.getInt(3);
        this.f267378e = cursor.getString(4);
        this.f267380g = cursor.getString(5);
        this.f267386m = cursor.getInt(6);
        this.f267387n = (long) cursor.getInt(7);
        this.f267388o = cursor.getInt(8);
        this.f267389p = cursor.getInt(9);
        this.f267390q = cursor.getInt(10);
        this.f267391r = cursor.getInt(11);
        this.f267393t = cursor.getString(12);
        this.f267392s = cursor.getInt(14);
        this.f267394u = cursor.getInt(15);
        this.f267385l = cursor.getString(16);
        this.f267381h = cursor.getInt(17);
        this.f267379f = cursor.getString(18);
        this.f267382i = cursor.getInt(19);
        this.f267383j = cursor.getString(20);
        this.f267384k = cursor.getInt(21);
    }

    /* renamed from: c */
    public ContentValues mo127132c() {
        ContentValues contentValues = new ContentValues();
        if (this.f267395v) {
            contentValues.put("id", Long.valueOf(this.f267374a));
        }
        if (this.f267396w) {
            contentValues.put("msgSvrId", Long.valueOf(this.f267375b));
        }
        if (this.f267397x) {
            contentValues.put("offset", Integer.valueOf(this.f267376c));
        }
        if (this.f267398y) {
            contentValues.put("totalLen", Integer.valueOf(this.f267377d));
        }
        if (this.f267399z) {
            contentValues.put("bigImgPath", this.f267378e);
        }
        if (this.f267358A) {
            contentValues.put("midImgPath", this.f267379f);
        }
        if (this.f267359B) {
            contentValues.put("thumbImgPath", this.f267380g);
        }
        if (this.f267360C) {
            contentValues.put("createtime", Integer.valueOf(this.f267386m));
        }
        if (this.f267361D) {
            contentValues.put("msglocalid", Long.valueOf(this.f267387n));
        }
        if (this.f267362E) {
            contentValues.put("status", Integer.valueOf(this.f267388o));
        }
        if (this.f267363F) {
            contentValues.put("nettimes", Integer.valueOf(this.f267389p));
        }
        if (this.f267364G) {
            contentValues.put("reserved1", Integer.valueOf(this.f267390q));
        }
        if (this.f267365H) {
            contentValues.put("reserved2", Integer.valueOf(this.f267391r));
        }
        if (this.f267366I) {
            contentValues.put("reserved3", this.f267393t);
        }
        if (this.f267367J) {
            contentValues.put("hashdthumb", Integer.valueOf(this.f267392s));
        }
        if (this.f267368K) {
            contentValues.put("iscomplete", Integer.valueOf(this.f267376c < this.f267377d ? 0 : 1));
        }
        if (this.f267369L) {
            contentValues.put("origImgMD5", this.f267385l);
        }
        if (this.f267370M) {
            contentValues.put("compressType", Integer.valueOf(this.f267381h));
        }
        if (this.f267371N) {
            contentValues.put("forwardType", Integer.valueOf(this.f267382i));
        }
        if (this.f267372O) {
            contentValues.put("hevcPath", this.f267383j);
        }
        if (this.f267373P) {
            contentValues.put("sendImgType", Integer.valueOf(this.f267384k));
        }
        return contentValues;
    }

    /* renamed from: d */
    public String mo127133d() {
        Map<String, String> parseXml = XmlParser.parseXml(this.f267393t, "msg", (String) null);
        if (parseXml != null) {
            return parseXml.get(".msg.img.$aeskey");
        }
        return null;
    }

    /* renamed from: e */
    public String mo127134e() {
        return this.f267378e;
    }

    /* renamed from: f */
    public int mo127135f() {
        return this.f267381h;
    }

    /* renamed from: g */
    public String mo127136g() {
        int i = this.f267381h;
        Map<String, String> parseXml = XmlParser.parseXml(this.f267393t, "msg", (String) null);
        if (parseXml == null) {
            return null;
        }
        return i != 1 ? parseXml.get(".msg.img.$cdnmidimgurl") : parseXml.get(".msg.img.$cdnbigimgurl");
    }

    /* renamed from: h */
    public int mo127137h() {
        return this.f267382i;
    }

    /* renamed from: i */
    public int mo127138i() {
        return this.f267390q;
    }

    /* renamed from: j */
    public String mo127139j() {
        return this.f267383j;
    }

    /* renamed from: k */
    public long mo127140k() {
        return this.f267374a;
    }

    /* renamed from: l */
    public long mo127141l() {
        return this.f267387n;
    }

    /* renamed from: m */
    public int mo127142m() {
        return this.f267376c;
    }

    /* renamed from: n */
    public int mo127143n() {
        return this.f267391r;
    }

    /* renamed from: o */
    public int mo127144o() {
        return this.f267377d;
    }

    /* renamed from: p */
    public boolean mo127145p() {
        return this.f267390q > 0;
    }

    /* renamed from: q */
    public boolean mo127146q() {
        int i = this.f267377d;
        return i != 0 && i == this.f267376c;
    }

    /* renamed from: r */
    public void mo127147r(String str) {
        this.f267378e = str;
        this.f267399z = true;
    }

    /* renamed from: s */
    public void mo127148s(String str) {
        String str2 = this.f267393t;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            this.f267366I = true;
        }
        this.f267393t = str;
    }

    /* renamed from: t */
    public void mo127149t(int i) {
        this.f267381h = i;
        this.f267370M = true;
    }

    /* renamed from: u */
    public void mo127150u(int i) {
        this.f267386m = i;
        this.f267360C = true;
    }

    /* renamed from: v */
    public void mo127151v(int i) {
        this.f267390q = i;
        this.f267364G = true;
    }

    /* renamed from: w */
    public void mo127152w(String str) {
        this.f267383j = str;
        this.f267372O = true;
    }

    /* renamed from: x */
    public void mo127153x(int i) {
        if (this.f267394u != i) {
            this.f267368K = true;
        }
        this.f267394u = i;
    }

    /* renamed from: y */
    public void mo127154y(long j) {
        this.f267374a = j;
        this.f267395v = true;
    }

    /* renamed from: z */
    public void mo127155z(String str) {
        this.f267379f = str;
        this.f267358A = true;
    }
}
