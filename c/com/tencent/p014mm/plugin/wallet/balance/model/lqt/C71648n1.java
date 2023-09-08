package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.n1 */
public class C71648n1 {

    /* renamed from: a */
    public static String f207652a = "";

    /* renamed from: a */
    public static String m84123a(String str) {
        return Uri.parse(str).getQueryParameter("operate_id");
    }

    /* renamed from: b */
    public static void m84124b(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("trace_info");
        if (!Util.isNullOrNil(queryParameter)) {
            m84125c(queryParameter);
        }
    }

    /* renamed from: c */
    public static void m84125c(String str) {
        Log.m105925i("MicroMsg.LqtTraceInfoStore", "trace info: %s", str);
        f207652a = str;
    }
}
