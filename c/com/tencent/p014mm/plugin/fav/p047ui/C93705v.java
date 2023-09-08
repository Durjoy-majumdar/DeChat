package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.fav.ui.v */
public class C93705v implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f270501d;

    public C93705v(DialogInterface.OnClickListener onClickListener) {
        this.f270501d = onClickListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        DialogInterface.OnClickListener onClickListener = this.f270501d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
