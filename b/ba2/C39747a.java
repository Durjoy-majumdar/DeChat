package ba2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import z04.C112550d0;

/* renamed from: ba2.a */
public final class C39747a {

    /* renamed from: a */
    public static final C39747a f106638a = new C39747a();

    /* renamed from: b */
    public static String f106639b;

    /* renamed from: c */
    public static Boolean f106640c;

    /* renamed from: d */
    public static Integer f106641d;

    /* renamed from: b */
    public static final int m42530b(Context context) {
        if (!C85875k4.m106205t(context, false)) {
            return 0;
        }
        if (f106641d == null) {
            f106641d = Integer.valueOf(m42530b(context));
        }
        Integer num = f106641d;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public static final Rect m42531c(View view) {
        if (view == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* renamed from: a */
    public final boolean mo62383a(int i) {
        if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE) {
            if (f106639b == null) {
                try {
                    String LY = ((C105919k) C86312j.m106911c(C105919k.class)).mo151035LY();
                    f106639b = LY;
                    Log.m105925i("MicroMsg.BaseMultiTaskUtil", "disableMultiTaskTypeInfo: %s", LY);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BaseMultiTaskUtil", e, "disableMultiTaskTypeInfo", new Object[0]);
                }
            }
            String str = f106639b;
            if (str != null) {
                if (C112550d0.m153801u(str, "" + i, false)) {
                    Log.m105924i("MicroMsg.BaseMultiTaskUtil", "disableMultiTaskTypeInfo ture!!!");
                    return true;
                }
            }
        }
        return false;
    }
}
