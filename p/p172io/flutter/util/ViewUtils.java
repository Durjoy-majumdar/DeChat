package p172io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: io.flutter.util.ViewUtils */
public final class ViewUtils {
    public static boolean childHasFocus(View view) {
        if (view == null) {
            return false;
        }
        if (view.hasFocus()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (childHasFocus(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int generateViewId(int i) {
        return View.generateViewId();
    }

    public static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
