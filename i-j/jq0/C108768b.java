package jq0;

import com.tencent.p014mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import iq0.C98783b;

/* renamed from: jq0.b */
public final class C108768b {
    /* renamed from: a */
    public static final C108762a m147579a(C98783b bVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        C108762a aVar = new C108762a(bVar, appBrandOpenMaterialCollection, (String) null, 4, (C8480h) null);
        Log.m105924i(aVar.f325670d, "onBottomSheetShow");
        WeChat_use_weapp_openStruct j = aVar.mo159781j();
        j.mo148158s(aVar.f325669c);
        j.f310544e = 1;
        j.f310545f = aVar.mo159779h(aVar.f325667a);
        j.f310546g = aVar.mo159780i();
        j.f310547h = 0;
        j.mo86054n();
        if (C98783b.ATTACH == aVar.f325667a) {
            WeChat_use_weapp_openStruct j2 = aVar.mo159781j();
            j2.mo148158s(aVar.f325669c);
            j2.f310544e = 5;
            j2.f310545f = aVar.mo159779h(aVar.f325667a);
            j2.f310546g = aVar.mo159780i();
            j2.f310547h = 0;
            j2.mo86054n();
        }
        return aVar;
    }
}
