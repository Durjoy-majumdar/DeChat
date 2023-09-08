package gq0;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gq0.g */
public final class C76021g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C107869a f222887d;

    public C76021g(C107869a aVar) {
        this.f222887d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/openmaterial/AppBrandOpenMaterialBottomSheet$buildTitleView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "iv_close#onClick");
        this.f222887d.hide();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/openmaterial/AppBrandOpenMaterialBottomSheet$buildTitleView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
