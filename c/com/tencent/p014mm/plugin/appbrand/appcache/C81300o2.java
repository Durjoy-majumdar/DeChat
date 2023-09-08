package com.tencent.p014mm.plugin.appbrand.appcache;

import ei0.C86516a;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.o2 */
public final class C81300o2 extends C86516a {

    /* renamed from: q */
    public final int f238724q;

    /* renamed from: r */
    public final int f238725r;

    /* renamed from: s */
    public final m3$$b f238726s;

    public C81300o2(String str, int i, int i2, String str2, m3$$b m3__b) {
        super(m99699i(str, i, i2), C81355t2.m99778d(str) + String.format(Locale.US, "_%s_%d_%d.wxapkg.diff", new Object[]{Integer.valueOf(str.hashCode()), Integer.valueOf(i), Integer.valueOf(i2)}), str2, str, 0, i2);
        this.f238724q = i;
        this.f238725r = i2;
        this.f238726s = m3__b;
        this.f251360o = !"@LibraryAppId".equals(str);
    }

    /* renamed from: i */
    public static String m99699i(String str, int i, int i2) {
        return String.format(Locale.US, "WxaPkgDiff_%s_%d_%d", new Object[]{Integer.valueOf(str.hashCode()), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* renamed from: j */
    public String mo113571j() {
        return C81372u2.m99809i(this.f251357l, this.f238725r);
    }
}
