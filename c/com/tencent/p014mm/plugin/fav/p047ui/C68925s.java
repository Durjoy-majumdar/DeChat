package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import pb1.C100734q;

/* renamed from: com.tencent.mm.plugin.fav.ui.s */
public class C68925s implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f198039d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterface.OnClickListener f198040e;

    public C68925s(Context context, DialogInterface.OnClickListener onClickListener) {
        this.f198039d = context;
        this.f198040e = onClickListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra("key_enter_fav_cleanui_from", 3);
        C100734q.m131875t0(this.f198039d, ".ui.FavCleanUI", intent, (Bundle) null);
        dialogInterface.dismiss();
        DialogInterface.OnClickListener onClickListener = this.f198040e;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }
}
