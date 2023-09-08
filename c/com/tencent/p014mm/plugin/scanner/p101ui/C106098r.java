package com.tencent.p014mm.plugin.scanner.p101ui;

import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.scanner.ui.r */
public class C106098r implements MMFlipper.C73164b {

    /* renamed from: a */
    public final /* synthetic */ SelectScanModePanel f315892a;

    public C106098r(SelectScanModePanel selectScanModePanel) {
        this.f315892a = selectScanModePanel;
    }

    /* renamed from: a */
    public void mo100336a(int i, int i2) {
        Log.m105926v("MicroMsg.scanner.SelectScanModePanel", "onMeasure width:" + i + " height:" + i2 + " isMeasured:" + this.f315892a.f315876s);
        SelectScanModePanel selectScanModePanel = this.f315892a;
        if (!selectScanModePanel.f315876s && i2 != 0 && i != 0) {
            selectScanModePanel.f315876s = true;
            selectScanModePanel.f315878u = i2;
            selectScanModePanel.f315877t = i;
            selectScanModePanel.mo151652a();
        }
    }
}
