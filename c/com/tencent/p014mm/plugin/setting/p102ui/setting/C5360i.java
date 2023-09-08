package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.MenuItem;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.NewPersionalQRCodeReportStruct;
import eb0.C31543z5;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.i */
public final class C5360i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ColorfulSelfQRCodeUI f21003d;

    public C5360i(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
        this.f21003d = colorfulSelfQRCodeUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i3 = ((C5380o) C39818r.f106831a.mo62444c(this.f21003d).mo75002a(C5380o.class)).mo6356i3();
        NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
        newPersionalQRCodeReportStruct.f10019d = (long) 21;
        newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
        newPersionalQRCodeReportStruct.f10021f = (long) i3;
        newPersionalQRCodeReportStruct.mo86054n();
        ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f21003d;
        colorfulSelfQRCodeUI.f20688w.mo8548b();
        C77407n nVar = colorfulSelfQRCodeUI.f20688w.f25508d;
        if (nVar == null) {
            return true;
        }
        nVar.mo107573q();
        return true;
    }
}
