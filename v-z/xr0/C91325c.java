package xr0;

import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.plugin.appbrand.p026ui.collection.AppBrandCollectionDisplayVerticalList;
import zr0.C91931a;

/* renamed from: xr0.c */
public final class C91325c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandCollectionDisplayVerticalList f261945d;

    public C91325c(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f261945d = appBrandCollectionDisplayVerticalList;
    }

    public final void run() {
        FragmentActivity activity = this.f261945d.getActivity();
        C91931a aVar = activity instanceof C91931a ? (C91931a) activity : null;
        if (aVar != null) {
            aVar.mo117057A2(false);
        }
    }
}
