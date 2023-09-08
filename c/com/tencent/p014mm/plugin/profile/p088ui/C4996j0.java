package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.profile.ui.j0 */
public class C4996j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactSocialInfoUI f20295d;

    public C4996j0(ContactSocialInfoUI contactSocialInfoUI) {
        this.f20295d = contactSocialInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ContactSocialInfoUI contactSocialInfoUI = this.f20295d;
        int i2 = ContactSocialInfoUI.f20186s;
        contactSocialInfoUI.mo5907I7();
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_ALERT_INT, 1);
    }
}
