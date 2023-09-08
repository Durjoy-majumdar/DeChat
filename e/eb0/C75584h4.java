package eb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import junit.framework.Assert;
import org.json.JSONObject;

/* renamed from: eb0.h4 */
public class C75584h4 {

    /* renamed from: a */
    public String f222036a = "";

    /* renamed from: b */
    public long f222037b = 0;

    /* renamed from: c */
    public int f222038c = 0;

    /* renamed from: d */
    public String f222039d = "";

    /* renamed from: e */
    public String f222040e = "";

    /* renamed from: f */
    public String f222041f = "";

    /* renamed from: g */
    public String f222042g = "";

    /* renamed from: h */
    public String f222043h = "";

    /* renamed from: i */
    public long f222044i = 0;

    /* renamed from: j */
    public String f222045j = "";

    /* renamed from: k */
    public String f222046k = "";

    /* renamed from: l */
    public int f222047l = 0;

    /* renamed from: m */
    public String f222048m = "";

    /* renamed from: n */
    public String f222049n = "";

    /* renamed from: o */
    public int f222050o = 0;

    /* renamed from: p */
    public long f222051p = 0;

    /* renamed from: q */
    public String f222052q = "";

    /* renamed from: r */
    public String f222053r = "";

    /* renamed from: s */
    public boolean f222054s = false;

    /* renamed from: t */
    public int f222055t = 0;

    /* renamed from: u */
    public int f222056u = 0;

    /* renamed from: v */
    public int f222057v = 0;

    /* renamed from: w */
    public String f222058w = "";

    /* renamed from: x */
    public int f222059x = -1;

    /* renamed from: e */
    public static String m90717e(int i) {
        if (i == 20) {
            return "newsapp";
        }
        if (i == 11) {
            return "blogapp";
        }
        Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
        return null;
    }

    /* renamed from: a */
    public void mo105920a(Cursor cursor) {
        this.f222036a = cursor.getString(0);
        this.f222037b = cursor.getLong(1);
        this.f222038c = cursor.getInt(2);
        this.f222039d = cursor.getString(3);
        this.f222040e = cursor.getString(4);
        this.f222041f = cursor.getString(5);
        this.f222042g = cursor.getString(6);
        this.f222043h = cursor.getString(7);
        this.f222044i = cursor.getLong(8);
        this.f222045j = cursor.getString(9);
        this.f222046k = cursor.getString(10);
        this.f222047l = cursor.getInt(11);
        this.f222048m = cursor.getString(12);
        this.f222049n = cursor.getString(13);
        this.f222050o = cursor.getInt(14);
        this.f222051p = cursor.getLong(15);
        this.f222052q = cursor.getString(16);
        this.f222053r = cursor.getString(17);
    }

    /* renamed from: b */
    public void mo105921b(int i, int i2, String str, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("videoLength", Integer.valueOf(i));
            jSONObject.putOpt("subType", Integer.valueOf(i2));
            jSONObject.putOpt("groupId", Util.nullAsNil(str));
            jSONObject.putOpt("tweetType", Integer.valueOf(i3));
            this.f222053r = jSONObject.toString();
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.split("\\|");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo105922c() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f222048m
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0015
            java.lang.String r2 = "\\|"
            java.lang.String[] r0 = r0.split(r2)
            if (r0 == 0) goto L_0x0015
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0015
            r1 = 0
            r0 = r0[r1]
            return r0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75584h4.mo105922c():java.lang.String");
    }

    /* renamed from: d */
    public String mo105923d() {
        String str = this.f222049n;
        return str == null ? "" : str;
    }

    /* renamed from: f */
    public String mo105924f() {
        String str = this.f222040e;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo105925g() {
        String str = this.f222036a;
        return str == null ? "" : str;
    }

    /* renamed from: h */
    public String mo105926h() {
        String str = this.f222041f;
        return str == null ? "" : str;
    }

    /* renamed from: i */
    public final void mo105927i() {
        if (!this.f222054s && !Util.isNullOrNil(this.f222053r)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f222053r);
                this.f222055t = jSONObject.optInt("videoLength", 0);
                int optInt = jSONObject.optInt("subType", 0);
                if (optInt == 1) {
                    this.f222056u = optInt;
                } else {
                    this.f222056u = 0;
                }
                this.f222058w = jSONObject.optString("groupId", "");
                this.f222057v = jSONObject.optInt("tweetType", 0);
            } catch (Exception unused) {
            }
            this.f222054s = true;
        }
    }
}
