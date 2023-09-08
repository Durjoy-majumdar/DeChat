package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

class SnsTextUtil {
    public static String getReceiverText(Context context, String str, String str2) {
        String r = C75228t.m90268r(str);
        if (r != null && r.length() > 10) {
            r = r.substring(0, 10) + context.getString(C0966R.string.l5s);
        }
        if (Util.isNullOrNil(str2)) {
            return r;
        }
        if (Util.isNullOrNil(r)) {
            return str2;
        }
        return r + "(" + C75228t.m90270s(str2) + ")";
    }
}
