package p170ic;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: ic.d */
public final class C87690d {

    /* renamed from: ic.d$a */
    public interface C87691a {
        /* renamed from: l */
        String mo63320l();
    }

    /* renamed from: a */
    public static final <R> R m109090a(String str, C32224a<? extends R> aVar) {
        String str2;
        C87412m.m108594g(str, "logName");
        C87412m.m108594g(aVar, "block");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        R invoke = aVar.invoke();
        if (invoke instanceof C87691a) {
            str2 = ((C87691a) invoke).mo63320l();
        } else if (invoke == null || (str2 = invoke.toString()) == null) {
            str2 = "";
        }
        boolean a = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a) {
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + str + " cost " + elapsedRealtime2 + " ms result:" + str2 + " isMainThread: " + a + ' ');
        } else {
            Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / ((long) 16))) + " frames! runProfiled:log:" + str + " cost " + elapsedRealtime2 + " ms result:" + str2 + " isMainThread: " + a + ' ');
        }
        return invoke;
    }

    /* renamed from: b */
    public static final String m109091b(String str, Runnable runnable) {
        String str2;
        C87412m.m108594g(str, "logName");
        C87412m.m108594g(runnable, "run");
        C87412m.m108594g(C8878e.f28146d, "profileFunc");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        if ("" instanceof C87691a) {
            str2 = "".mo63320l();
        } else {
            str2 = "".toString();
            if (str2 == null) {
                str2 = "";
            }
        }
        boolean a = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a) {
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + str + " cost " + elapsedRealtime2 + " ms result:" + str2 + " isMainThread: " + a + ' ');
        } else {
            Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / ((long) 16))) + " frames! runProfiled:log:" + str + " cost " + elapsedRealtime2 + " ms result:" + str2 + " isMainThread: " + a + ' ');
        }
        return "";
    }
}
