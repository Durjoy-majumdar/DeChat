package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.TrafficStats;
import zt3.C119157j;

/* renamed from: com.tencent.mm.booter.TrafficStatsReceiver */
public class TrafficStatsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public long f237572a = -1;

    /* renamed from: com.tencent.mm.booter.TrafficStatsReceiver$a */
    public class C80809a implements Runnable {
        public C80809a() {
        }

        public void run() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Build.VERSION.SDK_INT >= 28) {
                TrafficStats.updateNsm(MMApplicationContext.getContext());
            } else {
                TrafficStats.update();
            }
            long j = TrafficStatsReceiver.this.f237572a;
            if (j >= 0) {
                long j2 = elapsedRealtime - j;
                long mobileRx = TrafficStats.getMobileRx(0) + TrafficStats.getMobileTx(0);
                long wifiRx = TrafficStats.getWifiRx(0) + TrafficStats.getWifiTx(0);
                long wxMobileRx = TrafficStats.getWxMobileRx(0) + TrafficStats.getWxMobileTx(0);
                long wxMobileRx2 = TrafficStats.getWxMobileRx(0) + TrafficStats.getWxMobileTx(0);
                double d = (double) (j2 / 1000);
                Log.m105925i("MicroMsg.TrafficStats", "Time: %d ms, System - [Mobile: %d, Wifi: %d, Speed: %.2f], WeChat - [Mobile: %d, Wifi: %d, Speed: %.2f]", Long.valueOf(j2), Long.valueOf(mobileRx), Long.valueOf(wifiRx), Double.valueOf(((double) (mobileRx + wifiRx)) / d), Long.valueOf(wxMobileRx), Long.valueOf(wxMobileRx2), Double.valueOf(((double) (wxMobileRx + wxMobileRx2)) / d));
            }
            TrafficStatsReceiver.this.f237572a = elapsedRealtime;
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.m105918d("MicroMsg.TrafficStats", "onRecieve");
        ((C119157j) C119157j.f356862d).mo183876g(new C80809a(), "TrafficStats.onReceive");
    }
}
