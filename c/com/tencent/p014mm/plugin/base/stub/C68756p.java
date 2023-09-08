package com.tencent.p014mm.plugin.base.stub;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.base.stub.p */
public class C68756p implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WXEntryActivity f197506d;

    public C68756p(WXEntryActivity wXEntryActivity) {
        this.f197506d = wXEntryActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        WXEntryActivity wXEntryActivity = this.f197506d;
        int i = WXEntryActivity.f197446w;
        wXEntryActivity.mo94566U7();
        this.f197506d.finish();
    }
}
