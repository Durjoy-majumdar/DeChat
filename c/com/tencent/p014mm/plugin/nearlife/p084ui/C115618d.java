package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.d */
public class C115618d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearLifeCreatePoiUI f346843d;

    public C115618d(NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f346843d = nearLifeCreatePoiUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(11138, "3", "0", this.f346843d.f346800s);
        this.f346843d.setResult(0, new Intent());
        this.f346843d.finish();
    }
}
