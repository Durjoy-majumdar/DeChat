package wi0;

import android.os.SystemClock;
import android.webkit.WebSettings;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReference;
import p170ic.C87690d;

/* renamed from: wi0.h */
public final class C53171h {

    /* renamed from: a */
    public static final AtomicReference<String> f148354a = new AtomicReference<>();

    /* renamed from: a */
    public static final String m59583a() {
        String str;
        String str2;
        AtomicReference<String> atomicReference;
        String str3;
        String str4;
        AtomicReference<String> atomicReference2;
        String str5;
        String str6;
        AtomicReference<String> atomicReference3 = f148354a;
        String str7 = atomicReference3.get();
        if (!(str7 == null || str7.length() == 0)) {
            Log.m105924i("Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper", "getSystemUserAgent by memory cache");
            C87412m.m108593f(str7, "this");
            return str7;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String decodeString = MultiProcessMMKV.getMMKV("AppBrandNetworkConfigUserAgentHelper", 2).decodeString("UserAgent");
        if (decodeString instanceof C87690d.C87691a) {
            str = ((C87690d.C87691a) decodeString).mo63320l();
        } else if (decodeString == null || (str = decodeString.toString()) == null) {
            str = "";
        }
        boolean a = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a) {
            atomicReference = atomicReference3;
            str2 = decodeString;
            str3 = "";
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + "Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent try mmkv" + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("block main thread and skip ");
            atomicReference = atomicReference3;
            str2 = decodeString;
            str3 = "";
            sb.append((int) (elapsedRealtime2 / ((long) 16)));
            sb.append(" frames! runProfiled:log:");
            sb.append("Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent try mmkv");
            sb.append(" cost ");
            sb.append(elapsedRealtime2);
            sb.append(" ms result:");
            sb.append(str);
            sb.append(" isMainThread: ");
            sb.append(a);
            sb.append(' ');
            Log.m105928w("Luggage.Utils.Profile", sb.toString());
        }
        if (!(str2 == null || str2.length() == 0)) {
            atomicReference2 = atomicReference;
            str4 = str2;
        } else {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            try {
                str5 = WebSettings.getDefaultUserAgent(MMApplicationContext.getContext());
                C87412m.m108593f(str5, "{\n            WebSetting…t.getContext())\n        }");
            } catch (Throwable unused) {
                str5 = System.getProperty("http.agent");
                if (str5 == null) {
                    str5 = str3;
                }
            }
            if (str5 instanceof C87690d.C87691a) {
                str6 = ((C87690d.C87691a) str5).mo63320l();
            } else {
                String obj = str5.toString();
                str6 = obj == null ? str3 : obj;
            }
            boolean a2 = C2039g2.m1987a();
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime3;
            if (elapsedRealtime4 <= 32 || !a2) {
                Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + "Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent by webkit" + " cost " + elapsedRealtime4 + " ms result:" + str6 + " isMainThread: " + a2 + ' ');
            } else {
                Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime4 / ((long) 16))) + " frames! runProfiled:log:" + "Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent by webkit" + " cost " + elapsedRealtime4 + " ms result:" + str6 + " isMainThread: " + a2 + ' ');
            }
            str4 = str5;
            atomicReference2 = atomicReference;
        }
        atomicReference2.set(str4);
        return str4;
    }
}
