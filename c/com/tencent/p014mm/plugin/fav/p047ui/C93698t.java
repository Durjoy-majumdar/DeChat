package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.fav.ui.t */
public class C93698t implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f270494d;

    public C93698t(DialogInterface.OnClickListener onClickListener) {
        this.f270494d = onClickListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        DialogInterface.OnClickListener onClickListener = this.f270494d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
