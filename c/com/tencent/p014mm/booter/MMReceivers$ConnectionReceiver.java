package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;

@Deprecated
/* renamed from: com.tencent.mm.booter.MMReceivers$ConnectionReceiver */
public class MMReceivers$ConnectionReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Process.myPid();
        Log.m105924i("MicroMsg.ConnectionReceiver", "onReceive threadID: " + Thread.currentThread().getId());
        if (context != null) {
            if (!C80811b.m98664a(context, "connection", true)) {
                MMReceivers$AlarmReceiver.m161348b(context);
                Log.appenderFlush();
            } else if (!((ArrayList) C114781l0.m161562i().f344166e).isEmpty()) {
                NetworkInfo networkInfo = null;
                try {
                    networkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.ConnectionReceiver", "getActiveNetworkInfo failed. exception: %s", e.getMessage());
                }
                if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                    Object[] objArr = new Object[1];
                    objArr[0] = networkInfo == null ? "null" : networkInfo.getState();
                    Log.m105925i("MicroMsg.ConnectionReceiver", "NetworkAvailable: false, state:%s", objArr);
                    String str = "none";
                    String typeName = networkInfo == null ? str : networkInfo.getTypeName();
                    if (networkInfo != null) {
                        str = networkInfo.getSubtypeName();
                    }
                    C114781l0.m161563j(context, false, typeName, str);
                    return;
                }
                Log.m105924i("MicroMsg.ConnectionReceiver", "NetworkAvailable: true");
                C114781l0.m161563j(context, true, networkInfo.getTypeName(), networkInfo.getSubtypeName());
            }
        }
    }
}
