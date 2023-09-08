package m42;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import gy3.C87412m;
import ke3.C88144b;
import yc3.C38992a;

/* renamed from: m42.a */
public final class C34467a implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        C87412m.m108594g(strArr, "args");
        String str2 = "";
        if (!C87412m.m108589b(strArr.length > 0 ? strArr[0] : str2, "//mb")) {
            return false;
        }
        if (strArr.length > 1) {
            str2 = strArr[1];
        }
        if (C87412m.m108589b(str2, "demo")) {
            C88144b.m109791i(context, "magicbrush", ".demo.ui.MagicBrushDemoActivity", new Intent(), (Bundle) null);
        } else if (!C87412m.m108589b(str2, "scl")) {
            return false;
        } else {
            C88144b.m109791i(context, "magicbrush", ".scldemo.ui.MagicBrushSclDemoUI", new Intent(), (Bundle) null);
        }
        return true;
    }
}
