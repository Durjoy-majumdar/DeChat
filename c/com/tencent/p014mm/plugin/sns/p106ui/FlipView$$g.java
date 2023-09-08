package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import av2.C92126r;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$g */
public class FlipView$$g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f276822d;

    /* renamed from: e */
    public final /* synthetic */ String f276823e;

    /* renamed from: f */
    public final /* synthetic */ FlipView f276824f;

    public FlipView$$g(FlipView flipView, String str, String str2) {
        this.f276824f = flipView;
        this.f276822d = str;
        this.f276823e = str2;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView$4");
        FlipView flipView = this.f276824f;
        String str = this.f276822d;
        String str2 = this.f276823e;
        int i2 = FlipView.f276772S;
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView.getClass();
        SnsMethodCalculate.markStartTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        Log.m105924i("MicroMsg.FlipView", "request deal QBAR string");
        C92126r rVar = flipView.f276803t;
        if (rVar != null && rVar.mo126104g()) {
            flipView.f276803t.mo126101d().mo107572p();
        }
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN == null) {
            Log.m105924i("MicroMsg.FlipView", "error beacause info null");
            SnsMethodCalculate.markEndTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        } else {
            if (flipView.f276808y.size() > 0) {
                C94468m.m119494b(flipView.f276797n, flipView.getCurrentImageView(), flipView.f276808y, 0, new C96078n0(flipView, DN, str2));
            }
            SnsMethodCalculate.markEndTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        }
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView$4");
    }
}
