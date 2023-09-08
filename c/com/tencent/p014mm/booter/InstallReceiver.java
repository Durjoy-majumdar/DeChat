package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

@Deprecated
/* renamed from: com.tencent.mm.booter.InstallReceiver */
public class InstallReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (context != null && intent != null) {
            String action = intent.getAction();
            Log.m105925i("MicroMsg.InstallReceiver", "action:[%s]", action);
            if (Util.isNullOrNil(action) || !action.equals("com.android.vending.INSTALL_REFERRER")) {
                Log.m105920e("MicroMsg.InstallReceiver", "action is null or nil, or not the installed action");
                return;
            }
            try {
                str = intent.getStringExtra("referrer");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.InstallReceiver", "%s", Util.stackTraceToString(e));
                str = "";
            }
            Log.m105925i("MicroMsg.InstallReceiver", "get referer:[%s]", str);
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.InstallReceiver", "get referer is null or nil");
                return;
            }
            Log.m105918d("MicroMsg.InstallReceiver", "[PREF] write installreferer = " + str);
            context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putString("installreferer", str).commit();
        }
    }
}
