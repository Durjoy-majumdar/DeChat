package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$r */
public class ContactInfoUI$$r implements Runnable {

    /* renamed from: d */
    public WeakReference<ContactInfoUI> f202562d;

    /* renamed from: e */
    public C44673z4 f202563e;

    public ContactInfoUI$$r(ContactInfoUI contactInfoUI, C44673z4 z4Var) {
        this.f202562d = new WeakReference<>(contactInfoUI);
        this.f202563e = z4Var;
    }

    public void run() {
        ContactInfoUI contactInfoUI = this.f202562d.get();
        Log.m105925i("MicroMsg.ContactInfoUI", "onNotifyChange stranger %s", this.f202563e);
        if (contactInfoUI != null && !contactInfoUI.isFinishing() && !contactInfoUI.isDestroyed()) {
            Log.m105925i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", Boolean.valueOf(contactInfoUI.f202533h), contactInfoUI.f202536n.getUsername(), this.f202563e);
            C72996z1 z1Var = contactInfoUI.f202536n;
            if (z1Var != null && this.f202563e != null && !Util.isNullOrNil(z1Var.getUsername()) && contactInfoUI.f202536n.getUsername().equals(this.f202563e.field_encryptUsername) && !C45628s0.m50751P(contactInfoUI.f202536n.getUsername())) {
                contactInfoUI.f202536n.mo62860K2(this.f202563e.field_conRemark);
                contactInfoUI.getIntent().putExtra("Contact_User", contactInfoUI.f202536n.getUsername());
                C67027a aVar = contactInfoUI.f202530e;
                if (aVar != null) {
                    aVar.onDetach();
                    contactInfoUI.f202529d.removeAll();
                }
                contactInfoUI.initView();
            }
        }
    }
}
