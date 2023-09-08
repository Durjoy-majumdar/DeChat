package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;

/* renamed from: com.tencent.mm.plugin.lite.logic.v */
public class C115501v {
    /* renamed from: a */
    public static String m162389a(String str, String str2, String str3) {
        if (Util.isNullOrNil(str2)) {
            str2 = !Util.isNullOrNil(str3) ? str3 : "_";
        }
        return C72994y1.f212834c + "/pkg/" + LiteAppCenter.LITE_APP_BASE_LIB + "/" + str2 + "/" + str;
    }

    /* renamed from: b */
    public static String m162390b(String str, String str2, String str3) {
        if (Util.isNullOrNil(str2)) {
            str2 = !Util.isNullOrNil(str3) ? str3 : "_";
        }
        return C72994y1.f212834c + "/pkg/" + str + "/" + str2;
    }
}
