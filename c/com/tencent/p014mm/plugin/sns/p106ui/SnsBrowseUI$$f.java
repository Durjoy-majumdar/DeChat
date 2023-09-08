package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C43036f0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$f */
public class SnsBrowseUI$$f implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ SnsBrowseUI f277823d;

    public SnsBrowseUI$$f(SnsBrowseUI snsBrowseUI) {
        this.f277823d = snsBrowseUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$7");
        Log.m105925i("MicroMsg.SnsPopMediasUI", "onSceneEnd:%s errtype:%s errcode:%s", yVar, Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar instanceof C43036f0) {
            Log.m105924i("MicroMsg.SnsPopMediasUI", "onSceneEnd from NetSceneSnsObjectDetial");
            SnsObject k1 = ((C43036f0) yVar).mo67229k1();
            if (k1 == null || k1.f283891Id == 0) {
                Log.m105924i("MicroMsg.SnsPopMediasUI", "onSceneEnd: respObject nil, forbidAccess = true");
                SnsBrowseUI snsBrowseUI = this.f277823d;
                int i3 = SnsBrowseUI.f277783g1;
                SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI.f277804Z0 = true;
                SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
            SnsBrowseUI snsBrowseUI2 = this.f277823d;
            int i4 = SnsBrowseUI.f277783g1;
            SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI2.f277806b1 = false;
            SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            SnsBrowseUI snsBrowseUI3 = this.f277823d;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            boolean z = snsBrowseUI3.f277800X0;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (!z) {
                SnsBrowseUI snsBrowseUI4 = this.f277823d;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI4.mo132607d8();
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$7");
    }
}
