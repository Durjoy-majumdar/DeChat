package f40;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: f40.i0 */
public class C86739i0 {

    /* renamed from: a */
    public static long f251798a;

    /* renamed from: b */
    public static volatile C86740a f251799b;

    /* renamed from: f40.i0$a */
    public interface C86740a {
    }

    /* renamed from: a */
    public static void m107599a(String str, String str2, Object... objArr) {
        if (f251799b != null) {
            ((C86709a0.C86711b) f251799b).getClass();
            Log.m105925i(str, str2, objArr);
        }
    }

    /* renamed from: b */
    public static long m107600b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - f251798a;
        Log.m105925i("Blink-LOG", "since startup %s : %s", str, Long.valueOf(elapsedRealtime));
        String.format("since startup %s : %s", new Object[]{str, Long.valueOf(elapsedRealtime)});
        return elapsedRealtime;
    }
}
