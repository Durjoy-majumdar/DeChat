package com.tencent.p014mm.sdk.system;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.sdk.system.AndroidContextUtil */
public class AndroidContextUtil {
    private static final String TAG = "Luggage.AndroidContextUtil";

    public static Activity castActivityOrNull(Context context) {
        Context baseContext;
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return castActivityOrNull(baseContext);
    }

    public static void fixInputMethodManagerLeak(Context context) {
        InputMethodManager inputMethodManager;
        if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
            String[] strArr = {"mCurRootView", "mServedView", "mNextServedView", "mLastSrvView"};
            for (int i = 0; i < 4; i++) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        View view = (View) obj;
                        if (view.getContext() == context || isContextReferencedByOtherContext(context, view.getContext())) {
                            declaredField.set(inputMethodManager, (Object) null);
                        }
                    }
                } catch (Throwable th) {
                    Log.m105929w(TAG, "fixInputMethodManagerLeak %s", th.getMessage());
                }
            }
        }
    }

    private static boolean isContextReferencedByOtherContext(Context context, Context context2) {
        if (context == context2) {
            return true;
        }
        if (context2 instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context2).getBaseContext();
            while (context != baseContext) {
                if (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    if (baseContext == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
