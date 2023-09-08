package gq0;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gq0.C107885g0;
import gy3.C87412m;
import jq0.C108762a;
import rx3.C36570n;

/* renamed from: gq0.s */
public final class C107898s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C107895q f323070d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandOpenMaterialModel f323071e;

    public C107898s(C107895q qVar, AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        this.f323070d = qVar;
        this.f323071e = appBrandOpenMaterialModel;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C107885g0.C45943b bVar = C107885g0.C45943b.ENABLE;
        C107895q qVar = this.f323070d;
        if (bVar != qVar.f323061j.f323064a) {
            return false;
        }
        C108762a aVar = qVar.f323060i;
        AppBrandOpenMaterialModel appBrandOpenMaterialModel = this.f323071e;
        aVar.getClass();
        C87412m.m108594g(appBrandOpenMaterialModel, "openMaterialModel");
        Log.m105924i(aVar.f325670d, "onBottomSheetAppBrandClick");
        long indexOf = (long) (aVar.f325668b.f311216e.indexOf(appBrandOpenMaterialModel) + 1);
        String str = aVar.f325670d;
        Log.m105918d(str, "onBottomSheetAppBrandClick, index: " + indexOf);
        WeChat_use_weapp_openStruct j = aVar.mo159781j();
        j.mo148158s(aVar.f325669c);
        j.f310544e = 6;
        j.f310545f = aVar.mo159779h(aVar.f325667a);
        j.f310546g = aVar.mo159780i();
        j.f310547h = indexOf;
        j.f310548i = j.mo86045b("weapp_id", appBrandOpenMaterialModel.f311222d, true);
        String str2 = appBrandOpenMaterialModel.f311227i;
        if (str2 == null) {
            str2 = "";
        }
        j.f310549j = j.mo86045b("weapp_name", str2, true);
        j.mo86054n();
        ((C32226l) ((C36570n) this.f323070d.f323063o).getValue()).invoke(this.f323071e);
        return true;
    }
}
