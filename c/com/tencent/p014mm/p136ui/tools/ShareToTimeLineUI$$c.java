package com.tencent.p014mm.p136ui.tools;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.tools.ShareToTimeLineUI$$c */
public class ShareToTimeLineUI$$c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ ShareToTimeLineUI f220056d;

    public ShareToTimeLineUI$$c(ShareToTimeLineUI shareToTimeLineUI) {
        this.f220056d = shareToTimeLineUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f220056d.finish();
    }
}
