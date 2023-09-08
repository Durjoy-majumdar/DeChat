package com.tencent.p014mm.plugin.multitask;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import hc0.C20937c;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.multitask.p */
public final class C56887p {

    /* renamed from: a */
    public static final C56887p f162956a = new C56887p();

    /* renamed from: b */
    public static final String m65608b(String str, int i) {
        String format = String.format(Locale.US, "%s#%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        C87412m.m108593f(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final String m65609c(String str) {
        String format = String.format("%s", Arrays.copyOf(new Object[]{str}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        String mD5String = MD5Util.getMD5String(format);
        C87412m.m108593f(mD5String, "getMD5String(String.format(\"%s\", filePath))");
        return mD5String;
    }

    /* renamed from: d */
    public static final String m65610d(String str) {
        String format = String.format("%s", Arrays.copyOf(new Object[]{str}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        String mD5String = MD5Util.getMD5String(format);
        C87412m.m108593f(mD5String, "getMD5String(String.format(\"%s\", rawUrl))");
        return mD5String;
    }

    /* renamed from: a */
    public final String mo80309a(String str, C20937c cVar) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(cVar, "imageLoaderOptions");
        if (cVar.f59338v) {
            str = str + "round" + cVar.f59339w;
        }
        if (!Util.isNullOrNil(cVar.f59336t)) {
            str = str + cVar.f59336t;
        }
        return str + "size" + cVar.f59325i + cVar.f59326j;
    }
}
