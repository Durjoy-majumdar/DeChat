package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.pluginsdk.model.app.C72693u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.List;
import p156gj.C87203t;
import p823sg.C101614i;

/* renamed from: com.tencent.mm.pluginsdk.model.app.v1 */
public class C72702v1 {

    /* renamed from: a */
    public static final C101614i<String, C72693u1> f211542a = new C101614i<>(10);

    /* renamed from: b */
    public static final HashMap<String, List<String>> f211543b = new HashMap<>();

    /* renamed from: a */
    public static C72693u1.C72694a m85089a(String str, String str2, C72693u1 u1Var) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token is null");
            return C72693u1.C72694a.TOKEN_EMPTY;
        } else if (u1Var == null || !u1Var.f211524e) {
            Log.m105924i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult tokenData null");
            return C72693u1.C72694a.TOKEN_DATA_NOT_MATCH;
        } else {
            String nullAs = Util.nullAs(u1Var.f211521b, "");
            if (nullAs.equals(str2)) {
                Log.m105924i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token check success");
                return C72693u1.C72694a.OK;
            }
            Log.m105929w("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token check fail %s/%s", nullAs, str2);
            return C72693u1.C72694a.PACKAGE_NAME_INVALID;
        }
    }

    /* renamed from: b */
    public static String m85090b() {
        return "-" + C87203t.m108273i().hashCode() + "-";
    }
}
