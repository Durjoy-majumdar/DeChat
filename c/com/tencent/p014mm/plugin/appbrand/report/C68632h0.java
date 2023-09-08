package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p206nj.C117627q;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.report.h0 */
public final class C68632h0 {
    /* renamed from: a */
    public static Object[] m80873a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[objArr.length];
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = objArr[i];
            if (str == null) {
                str = "";
            } else if (str instanceof String) {
                String str2 = str;
                if (str2.contains(",")) {
                    if (!Util.isNullOrNil(str2)) {
                        try {
                            str = Util.nullAsNil(C117627q.m165908a(str2));
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.AppBrand.ReportUtil", "safeEncode, given %s, e %s", str2, e);
                        }
                    }
                    str = "";
                }
                str = C90599h.m113522o(str, 0, 1024);
            }
            objArr2[i2] = String.valueOf(str);
            i++;
            i2++;
        }
        return objArr2;
    }
}
