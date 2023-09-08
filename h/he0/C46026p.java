package he0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: he0.p */
public class C46026p {

    /* renamed from: a */
    public int f124101a;

    /* renamed from: b */
    public String f124102b;

    /* renamed from: c */
    public String f124103c;

    /* renamed from: d */
    public boolean f124104d = false;

    /* renamed from: e */
    public boolean f124105e = false;

    /* renamed from: f */
    public byte[] f124106f = null;

    /* renamed from: g */
    public String f124107g = "";

    public C46026p(int i, String str, String str2) {
        this.f124101a = i;
        this.f124103c = str;
        this.f124102b = str2;
        this.f124107g = !Util.isNullOrNil(str) ? this.f124103c : Util.nullAs(str2, "");
    }
}
