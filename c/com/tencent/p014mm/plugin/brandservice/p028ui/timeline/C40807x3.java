package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.x3 */
public final class C40807x3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineSettingUI f109677d;

    public C40807x3(BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f109677d = bizTimeLineSettingUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f109677d.finish();
    }
}
