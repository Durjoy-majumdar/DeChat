package p170ic;

import android.app.Activity;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ic.a */
public final class C87687a {

    /* renamed from: a */
    public static final C87687a f253966a = new C87687a();

    /* renamed from: a */
    public static final int m109085a(Object obj) {
        C87412m.m108594g(obj, "<this>");
        return obj.hashCode() & 65535;
    }

    /* renamed from: b */
    public static final boolean m109086b(Activity activity, int i) {
        C87412m.m108594g(activity, "<this>");
        if (activity instanceof AppCompatActivity) {
            return ((AppCompatActivity) activity).supportRequestWindowFeature(i);
        }
        Window window = activity.getWindow();
        if (!(window != null && !window.hasFeature(i))) {
            return true;
        }
        try {
            return activity.requestWindowFeature(i);
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.ActivityUtils", th, "safeRequestWindowFeature failed", new Object[0]);
            return false;
        }
    }
}
