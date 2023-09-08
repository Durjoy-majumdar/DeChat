package gq0;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import qo3.C77407n;

/* renamed from: gq0.o */
public final class C98168o {
    /* renamed from: a */
    public static final boolean m126815a(Context context) {
        C87412m.m108594g(context, "<this>");
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return !activity.isFinishing() && !activity.isDestroyed();
    }

    /* renamed from: b */
    public static final void m126816b(C77407n nVar, Context context) {
        C87412m.m108594g(nVar, "<this>");
        C87412m.m108594g(context, "context");
        if (m126815a(context)) {
            try {
                nVar.mo107564i();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.OpenMaterial.Commons", e, "notifyChangeFixed, fail", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.AppBrand.OpenMaterial.Commons", "notifyChangeFixed, context is invalid, why?");
        }
    }
}
