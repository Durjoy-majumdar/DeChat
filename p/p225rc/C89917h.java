package p225rc;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;

/* renamed from: rc.h */
public class C89917h {
    /* renamed from: a */
    public static boolean m112458a(Context context) {
        InputMethodManager inputMethodManager;
        Activity castActivityOrNull;
        View currentFocus;
        IBinder windowToken;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null || (castActivityOrNull = AndroidContextUtil.castActivityOrNull(context)) == null || (currentFocus = castActivityOrNull.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return false;
        }
        try {
            return inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return false;
        }
    }
}
