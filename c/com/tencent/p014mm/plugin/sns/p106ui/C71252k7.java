package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.k7 */
public class C71252k7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadConfigView f206195d;

    public C71252k7(SnsUploadConfigView snsUploadConfigView) {
        this.f206195d = snsUploadConfigView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$7");
        C88144b.m109791i(this.f206195d.getContext(), "account", ".ui.FacebookAuthUI", new Intent().putExtra("shake_music", true), (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$7");
    }
}
