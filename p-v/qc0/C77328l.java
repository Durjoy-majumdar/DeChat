package qc0;

import android.telephony.TelephonyManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.TimeZone;
import lc3.C10485b;

/* renamed from: qc0.l */
public class C77328l {
    /* renamed from: a */
    public static boolean m93192a() {
        if (TimeZone.getDefault().getRawOffset() != TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        if (telephonyManager == null) {
            return true;
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        return Util.isNullOrNil(networkCountryIso) || networkCountryIso.equalsIgnoreCase("cn");
    }

    /* renamed from: b */
    public static boolean m93193b() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ShakeMusicGlobalSwitch", 0);
        Log.m105925i("MicroMsg.Music.MusicHelperUtils", "isShakeMusicGlobalUser: %d", Integer.valueOf(b));
        return b != 0;
    }

    /* renamed from: c */
    public static boolean m93194c() {
        return m93192a() || m93193b();
    }
}
