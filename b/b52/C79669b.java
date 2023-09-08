package b52;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import e42.C86432k;
import gy3.C87412m;

/* renamed from: b52.b */
public final class C79669b<T extends C7594e> extends C86432k<T> {
    /* renamed from: e */
    public String mo16e() {
        return "hideLoading";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: o */
    public C7596h mo62167o(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        Log.m105924i("MBJsApiHideLoading", "invoke");
        Log.m105918d("MBDialogCacheManager", "dismissCurrentDialog");
        Dialog dialog = C79668a.f233581a;
        if (dialog != null) {
            dialog.dismiss();
        }
        C79668a.f233581a = null;
        return mo120844i();
    }
}
