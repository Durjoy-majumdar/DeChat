package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.ui.chatting.component.y1 */
public class C30836y1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FootComponent f82853d;

    public C30836y1(FootComponent footComponent) {
        this.f82853d = footComponent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f82853d.f215752d.mo91565f());
    }
}
