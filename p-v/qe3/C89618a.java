package qe3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: qe3.a */
public class C89618a {
    /* renamed from: a */
    public static int m112051a(Context context) {
        int i = 0;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (activeNetworkInfo.getType() == 1) {
                i = 1;
            } else if (subtype == 13 || subtype == 15 || subtype == 14) {
                i = 4;
            } else if (subtype == 3 || subtype == 4 || subtype == 5 || subtype == 6 || subtype == 12) {
                i = 3;
            } else if (subtype == 1 || subtype == 2) {
                i = 2;
            }
            return i;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BgFgBase", "getNetType: %s", Util.stackTraceToString(e));
            return 1;
        }
    }
}
