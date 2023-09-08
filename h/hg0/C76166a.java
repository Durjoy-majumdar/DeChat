package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: hg0.a */
public class C76166a {

    /* renamed from: A */
    public String f223098A = "";

    /* renamed from: B */
    public int f223099B = 0;

    /* renamed from: C */
    public int f223100C = 0;

    /* renamed from: D */
    public String f223101D = "";

    /* renamed from: E */
    public String f223102E = "";

    /* renamed from: F */
    public String f223103F = "";

    /* renamed from: G */
    public int f223104G = -1;

    /* renamed from: H */
    public String f223105H = "";

    /* renamed from: I */
    public long f223106I = -1;

    /* renamed from: J */
    public int f223107J = -1;

    /* renamed from: K */
    public String f223108K = "";

    /* renamed from: L */
    public String f223109L = "";

    /* renamed from: M */
    public String f223110M = "";

    /* renamed from: N */
    public long f223111N = 0;

    /* renamed from: O */
    public int f223112O = -1;

    /* renamed from: a */
    public int f223113a = 0;

    /* renamed from: b */
    public String f223114b = "";

    /* renamed from: c */
    public String f223115c = "";

    /* renamed from: d */
    public long f223116d = 0;

    /* renamed from: e */
    public String f223117e = "";

    /* renamed from: f */
    public String f223118f = "";

    /* renamed from: g */
    public String f223119g = "";

    /* renamed from: h */
    public String f223120h = "";

    /* renamed from: i */
    public String f223121i = "";

    /* renamed from: j */
    public String f223122j = "";

    /* renamed from: k */
    public String f223123k = "";

    /* renamed from: l */
    public int f223124l = 0;

    /* renamed from: m */
    public String f223125m = "";

    /* renamed from: n */
    public String f223126n = "";

    /* renamed from: o */
    public int f223127o = 0;

    /* renamed from: p */
    public String f223128p = "";

    /* renamed from: q */
    public int f223129q = 0;

    /* renamed from: r */
    public byte[] f223130r;

    /* renamed from: s */
    public int f223131s = 0;

    /* renamed from: t */
    public int f223132t;

    /* renamed from: u */
    public String f223133u = "";

    /* renamed from: v */
    public int f223134v = 0;

    /* renamed from: w */
    public String f223135w = "";

    /* renamed from: x */
    public String f223136x = "";

    /* renamed from: y */
    public String f223137y = "";

    /* renamed from: z */
    public int f223138z = 0;

    /* renamed from: d */
    public static int m91467d(String str) {
        try {
            return Util.getHex("0x" + str.substring(0, 8), 0);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AddrUpload", e, "md5: %s", str);
            return 0;
        }
    }

    /* renamed from: a */
    public int mo106382a() {
        char c;
        String str = this.f223118f;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!Util.isNullOrNil(str)) {
            String str3 = this.f223118f;
            if (str3 != null) {
                str2 = str3;
            }
            c = str2.charAt(0);
        } else {
            String str4 = this.f223119g;
            if (str4 == null) {
                str4 = str2;
            }
            if (!Util.isNullOrNil(str4)) {
                String str5 = this.f223119g;
                if (str5 != null) {
                    str2 = str5;
                }
                c = str2.charAt(0);
            } else {
                c = ' ';
            }
        }
        if (c >= 'a' && c <= 'z') {
            return (char) (c - ' ');
        }
        if (c < 'A' || c > 'Z') {
            return 123;
        }
        return c;
    }

    /* renamed from: b */
    public void mo106383b(Cursor cursor) {
        String string = cursor.getString(1);
        this.f223114b = string;
        this.f223113a = m91467d(string);
        this.f223115c = cursor.getString(2);
        this.f223116d = cursor.getLong(3);
        this.f223117e = cursor.getString(4);
        this.f223118f = cursor.getString(5);
        this.f223119g = cursor.getString(6);
        this.f223120h = cursor.getString(7);
        this.f223121i = cursor.getString(8);
        this.f223122j = cursor.getString(9);
        this.f223123k = cursor.getString(10);
        this.f223124l = cursor.getInt(11);
        this.f223125m = cursor.getString(12);
        this.f223126n = cursor.getString(13);
        int i = cursor.getInt(14);
        if (i == 65536) {
            this.f223127o = 0;
        } else {
            this.f223127o = i;
        }
        this.f223129q = cursor.getInt(17);
        this.f223128p = cursor.getString(15);
        this.f223131s = cursor.getInt(18);
        byte[] blob = cursor.getBlob(19);
        this.f223130r = blob;
        if (!Util.isNullOrNil(blob)) {
            byte[] bArr = this.f223130r;
            try {
                LVBuffer lVBuffer = new LVBuffer();
                int initParse = lVBuffer.initParse(bArr);
                if (initParse != 0) {
                    Log.m105920e("MicroMsg.AddrUpload", "parse LVBuffer error:" + initParse);
                } else {
                    this.f223133u = lVBuffer.getString();
                    this.f223134v = lVBuffer.getInt();
                    this.f223135w = lVBuffer.getString();
                    this.f223136x = lVBuffer.getString();
                    this.f223137y = lVBuffer.getString();
                    this.f223138z = lVBuffer.getInt();
                    this.f223098A = lVBuffer.getString();
                    this.f223099B = lVBuffer.getInt();
                    this.f223100C = lVBuffer.getInt();
                    this.f223101D = lVBuffer.getString();
                    this.f223102E = lVBuffer.getString();
                    this.f223103F = lVBuffer.getString();
                    this.f223104G = lVBuffer.getInt();
                    this.f223105H = lVBuffer.getString();
                    this.f223106I = lVBuffer.getLong();
                    this.f223107J = lVBuffer.getInt();
                    this.f223108K = lVBuffer.getString();
                    this.f223109L = lVBuffer.getString();
                    this.f223110M = lVBuffer.getString();
                    this.f223111N = lVBuffer.getLong();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AddrUpload", e, "", new Object[0]);
            }
        }
        this.f223132t = cursor.getInt(20);
    }

    /* renamed from: c */
    public ContentValues mo106384c() {
        byte[] bArr;
        ContentValues contentValues = new ContentValues();
        if ((this.f223112O & 1) != 0) {
            contentValues.put("id", Integer.valueOf(this.f223113a));
        }
        if ((this.f223112O & 2) != 0) {
            contentValues.put("md5", mo106385e());
        }
        if ((this.f223112O & 4) != 0) {
            String str = this.f223115c;
            if (str == null) {
                str = "";
            }
            contentValues.put("peopleid", str);
        }
        if ((this.f223112O & 8) != 0) {
            contentValues.put("uploadtime", Long.valueOf(this.f223116d));
        }
        if ((this.f223112O & 16) != 0) {
            contentValues.put("realname", mo106388h());
        }
        if ((this.f223112O & 32) != 0) {
            String str2 = this.f223118f;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("realnamepyinitial", str2);
        }
        if ((this.f223112O & 64) != 0) {
            String str3 = this.f223119g;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("realnamequanpin", str3);
        }
        if ((this.f223112O & 128) != 0) {
            contentValues.put("username", mo106389i());
        }
        if ((this.f223112O & 256) != 0) {
            contentValues.put("nickname", mo106387g());
        }
        if ((this.f223112O & 512) != 0) {
            String str4 = this.f223122j;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("nicknamepyinitial", str4);
        }
        if ((this.f223112O & 1024) != 0) {
            String str5 = this.f223123k;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("nicknamequanpin", str5);
        }
        if ((this.f223112O & 2048) != 0) {
            contentValues.put("type", Integer.valueOf(this.f223124l));
        }
        if ((this.f223112O & 4096) != 0) {
            contentValues.put("moblie", mo106386f());
        }
        if ((this.f223112O & 8192) != 0) {
            String str6 = this.f223126n;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put(Scopes.EMAIL, str6);
        }
        if ((this.f223112O & 16384) != 0) {
            int i = this.f223127o;
            if (i == 0) {
                contentValues.put("status", 65536);
            } else {
                contentValues.put("status", Integer.valueOf(i));
            }
        }
        if ((this.f223112O & 32768) != 0) {
            contentValues.put("reserved1", this.f223128p);
        }
        if ((this.f223112O & 131072) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.f223129q));
        }
        if ((this.f223112O & 262144) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.f223131s));
        }
        if ((this.f223112O & 524288) != 0) {
            try {
                LVBuffer lVBuffer = new LVBuffer();
                lVBuffer.initBuild();
                lVBuffer.putString(this.f223133u);
                lVBuffer.putInt(this.f223134v);
                lVBuffer.putString(this.f223135w);
                lVBuffer.putString(this.f223136x);
                lVBuffer.putString(this.f223137y);
                lVBuffer.putInt(this.f223138z);
                lVBuffer.putString(this.f223098A);
                lVBuffer.putInt(this.f223099B);
                lVBuffer.putInt(this.f223100C);
                lVBuffer.putString(this.f223101D);
                lVBuffer.putString(this.f223102E);
                lVBuffer.putString(this.f223103F);
                lVBuffer.putInt(this.f223104G);
                lVBuffer.putString(this.f223105H);
                lVBuffer.putLong(this.f223106I);
                lVBuffer.putInt(this.f223107J);
                lVBuffer.putString(this.f223108K);
                lVBuffer.putString(this.f223109L);
                lVBuffer.putString(this.f223110M);
                lVBuffer.putLong(this.f223111N);
                bArr = lVBuffer.buildFinish();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AddrUpload", e, "", new Object[0]);
                bArr = null;
            }
            this.f223130r = bArr;
            contentValues.put("lvbuf", bArr);
        }
        if ((this.f223112O & 1048576) != 0) {
            contentValues.put("showhead", Integer.valueOf(this.f223132t));
        }
        return contentValues;
    }

    /* renamed from: e */
    public String mo106385e() {
        String str = this.f223114b;
        return str == null ? "" : str;
    }

    /* renamed from: f */
    public String mo106386f() {
        String str = this.f223125m;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo106387g() {
        String str = this.f223121i;
        return str == null ? "" : str;
    }

    /* renamed from: h */
    public String mo106388h() {
        String str = this.f223117e;
        return str == null ? "" : str;
    }

    /* renamed from: i */
    public String mo106389i() {
        String str = this.f223120h;
        return str == null ? "" : str;
    }

    /* renamed from: j */
    public void mo106390j(int i) {
        this.f223112O = i;
    }

    /* renamed from: k */
    public void mo106391k(String str) {
        this.f223121i = str;
    }

    /* renamed from: l */
    public void mo106392l(String str) {
        this.f223122j = str;
    }

    /* renamed from: m */
    public void mo106393m(String str) {
        this.f223123k = str;
    }

    /* renamed from: n */
    public void mo106394n(int i) {
        this.f223132t = i;
    }

    /* renamed from: o */
    public void mo106395o(int i) {
        this.f223127o = i;
    }

    /* renamed from: p */
    public void mo106396p(String str) {
        this.f223120h = str;
    }
}
