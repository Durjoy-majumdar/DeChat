package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.u3 */
public final class C40805u3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineSettingUI f109675d;

    public C40805u3(BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f109675d = bizTimeLineSettingUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f109675d.mo63584I7();
    }
}
