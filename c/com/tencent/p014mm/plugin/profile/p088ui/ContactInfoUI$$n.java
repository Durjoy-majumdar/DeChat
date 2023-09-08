package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$n */
public class ContactInfoUI$$n implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f202557d;

    public ContactInfoUI$$n(ContactInfoUI contactInfoUI) {
        this.f202557d = contactInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f202557d.getContext());
    }
}
