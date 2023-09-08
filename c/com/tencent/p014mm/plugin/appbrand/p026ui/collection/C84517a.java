package com.tencent.p014mm.plugin.appbrand.p026ui.collection;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.HashSet;
import sx3.C110818d0;
import wi0.C90978e0;
import xr0.C91331k;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.a */
public final class C84517a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246655d;

    public C84517a(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f246655d = appBrandCollectionDisplayVerticalList;
    }

    public final void run() {
        AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f246655d;
        int i = AppBrandCollectionDisplayVerticalList.f246623t;
        appBrandCollectionDisplayVerticalList.getClass();
        if (this.f246655d.isAdded()) {
            AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList2 = this.f246655d;
            appBrandCollectionDisplayVerticalList2.getClass();
            MMHandler mMHandler = appBrandCollectionDisplayVerticalList2.f246627n;
            C87412m.m108591d(mMHandler);
            ((C81500i0) C81161g2.Bx0(C81500i0.class)).add(mMHandler.getSerial(), appBrandCollectionDisplayVerticalList2.f246631r);
            C90978e0 Cx0 = C81161g2.Cx0();
            MMHandler mMHandler2 = appBrandCollectionDisplayVerticalList2.f246627n;
            C87412m.m108591d(mMHandler2);
            Cx0.add(mMHandler2.getSerial(), appBrandCollectionDisplayVerticalList2.f246632s);
        }
        HashSet hashSet = new HashSet();
        C91331k kVar = this.f246655d.f246625i;
        C87412m.m108591d(kVar);
        for (LocalUsageInfo localUsageInfo : kVar.f261958d) {
            hashSet.add(localUsageInfo.f239040d);
        }
        C81662k.m100184c(C110818d0.m150953y0(hashSet), C81652f.C81653a.STAR_LIST, (C81662k.C81674j) null);
    }
}
