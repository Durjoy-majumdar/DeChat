package cp0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: cp0.e */
public final class C86083e {

    /* renamed from: a */
    public static final C86083e f250564a = new C86083e();

    /* renamed from: b */
    public static final SparseArray<C86085g> f250565b = new SparseArray<>();

    /* renamed from: c */
    public static int f250566c;

    /* renamed from: a */
    public final boolean mo120505a(int i) {
        C86085g b = mo120506b(i);
        if (b == null) {
            return false;
        }
        Context context = b.f250569a;
        Intent intent = b.f250570b;
        Log.m105924i("MicroMsg.AppBrand.PendingIntentPoster", "execPendingIntent: ctx = " + b.f250569a);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/loading/PendingIntentPoster", "execPendingIntent", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/loading/PendingIntentPoster", "execPendingIntent", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (!(context instanceof Activity)) {
            return true;
        }
        ((Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    /* renamed from: b */
    public final C86085g mo120506b(int i) {
        C86085g gVar;
        synchronized (this) {
            SparseArray<C86085g> sparseArray = f250565b;
            gVar = sparseArray.get(i);
            if (gVar == null) {
                Log.m105924i("MicroMsg.AppBrand.PendingIntentPoster", "getPendingIntentAndRemoveAtomic: get a null task by intentKey = " + i);
            } else {
                Log.m105924i("MicroMsg.AppBrand.PendingIntentPoster", "getPendingIntentAndRemoveAtomic: brandName = " + gVar.f250571c.f239363e);
            }
            sparseArray.remove(i);
        }
        return gVar;
    }
}
