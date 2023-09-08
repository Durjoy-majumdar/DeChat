package com.tencent.p014mm.modelcdntran;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import h81.C32735h;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.modelcdntran.x */
public class C1297x {
    /* renamed from: a */
    public static String m1386a(String str) {
        if (!Util.isNullOrNil(str)) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Util.isAlpha(charAt) && !Util.isNum(charAt)) {
                    return null;
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m1387b(String str, long j, String str2, String str3) {
        Log.m105919d("MicroMsg.CdnUtil", "cdntra genClientId prefix[%s] createtime:%d talker[%s] suffix:[%s] stack[%s]", str, Long.valueOf(j), str2, str3, Util.getStack());
        if (Util.isNullOrNil(m1386a(str)) || Util.isNullOrNil(str2) || j <= 0) {
            return null;
        }
        String nullAsNil = Util.nullAsNil(m1386a(str3));
        String f = C90193h.m112878f((C75592q0.m90789s() + "-" + str2).getBytes());
        String str4 = "a" + str + "_" + f.substring(0, 16) + "_" + j;
        if (Util.isNullOrNil(nullAsNil)) {
            return str4;
        }
        return str4 + "_" + nullAsNil;
    }

    /* renamed from: c */
    public static boolean m1388c() {
        boolean z = 1 == ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_cdn_upload_use_multi_socket, 1);
        Log.m105925i("MicroMsg.CdnUtil", "cdn UseMultiSocket(X-Lab):%s", Boolean.valueOf(z));
        return z;
    }
}
