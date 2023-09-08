package oc2;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Util;
import mc2.C46992a;
import p156gj.C87203t;

/* renamed from: oc2.b */
public class C47362b implements Runnable {
    public C47362b(C47363c cVar) {
    }

    public void run() {
        SharedPreferences sharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "system_config_prefs", 4);
        if (Util.ticksToNow(sharedPreferences.getLong("NFC_REPORT_TIME", 0)) > 86400000) {
            int a = C46992a.m52304c().mo72179a(MMApplicationContext.getContext());
            int i = a == 0 ? 0 : 1;
            boolean hasSystemFeature = MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
            Log.m105925i("MicroMsg.SubCoreCpuCard", "alvinluo NFC report isSupportNFC: %d, isSupportHCE: %d", Integer.valueOf(i), Integer.valueOf(hasSystemFeature ? 1 : 0));
            C115669n.INSTANCE.mo160131h(12779, C87203t.m108270f(true), Integer.valueOf(i), Integer.valueOf(hasSystemFeature));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("NFC_REPORT_TIME", Util.currentTicks());
            edit.commit();
            Log.m105924i("MicroMsg.SubCoreCpuCard", "doNFCReport status = " + a);
        }
    }
}
