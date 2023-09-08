package vn3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import gy3.C87412m;

/* renamed from: vn3.e */
public final class C111562e {
    /* renamed from: a */
    public static final boolean m152091a(Context context) {
        Intent intent;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        return intent.getBooleanExtra(VASActivity.KEY_IS_FRAGMENT_MODE, false);
    }

    /* renamed from: b */
    public static final boolean m152092b(Intent intent, int i) {
        String str;
        C87412m.m108594g(intent, "<this>");
        VASActivity.Companion.getClass();
        if (!VASActivity.vasController.mo162725d()) {
            return false;
        }
        try {
            if ((i & intent.getIntExtra(VASActivity.KEY_VAS_START_MODE, 3)) == 0) {
                return false;
            }
            ComponentName component = intent.getComponent();
            if (component == null || (str = component.getClassName()) == null) {
                str = "";
            }
            if (!VASActivity.vasController.mo162724c(str)) {
                return false;
            }
            for (Class cls = Class.forName(str); cls.getSuperclass() != null; cls = cls.getSuperclass()) {
                if (C87412m.m108589b(cls.getSuperclass(), VASActivity.class)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }
}
