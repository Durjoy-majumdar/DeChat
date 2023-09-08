package p288a6;

import android.p293os.HapticPlayer;

/* renamed from: a6.c */
public final /* synthetic */ class C16430c {
    /* renamed from: a */
    public static boolean m15255a(int i) {
        boolean z = true;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            try {
                return HapticPlayer.isAvailable();
            } catch (Throwable unused) {
                return false;
            }
        } else if (i != 2) {
            return false;
        } else {
            try {
                if (2 == ((Integer) Class.forName("android.os.RichTapVibrationEffect").getMethod("checkIfRichTapSupport", new Class[0]).invoke((Object) null, new Object[0])).intValue()) {
                    return false;
                }
            } catch (Exception unused2) {
                z = false;
            }
            return z;
        }
    }
}
