package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.k0 */
public final class C19183k0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SettingManageFindMoreDetailUI f53987d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19183k0(SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        super(1);
        this.f53987d = settingManageFindMoreDetailUI;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f53987d;
        int i = SettingManageFindMoreDetailUI.f53904w;
        settingManageFindMoreDetailUI.getClass();
        if (WeChatBrands.Business.Entries.MeSetDiscoveryNearbyLiveFriendsPerson.checkAvailable(settingManageFindMoreDetailUI)) {
            settingManageFindMoreDetailUI.mo24558N7(booleanValue, 512);
            long j = booleanValue ? 1 : 0;
            DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct = new DiscoverViewEntranceSettingStruct();
            discoverViewEntranceSettingStruct.f48274d = 13;
            discoverViewEntranceSettingStruct.f48275e = j;
            discoverViewEntranceSettingStruct.f48276f = 1;
            discoverViewEntranceSettingStruct.mo86054n();
            Log.m105924i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct.mo1006q());
        }
        this.f53987d.f53907f = booleanValue;
        return C13598b0.f38549a;
    }
}
