package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30765p3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$q */
public class ContactInfoUI$$q implements Runnable {

    /* renamed from: d */
    public WeakReference<ContactInfoUI> f202560d;

    /* renamed from: e */
    public C30765p3 f202561e;

    public ContactInfoUI$$q(ContactInfoUI contactInfoUI, C30765p3 p3Var) {
        this.f202560d = new WeakReference<>(contactInfoUI);
        this.f202561e = p3Var;
    }

    public void run() {
        ContactInfoUI contactInfoUI = this.f202560d.get();
        Log.m105925i("MicroMsg.ContactInfoUI", "onNotifyFriendUserChange user: %s", this.f202561e);
        if (contactInfoUI != null && !contactInfoUI.isFinishing() && !contactInfoUI.isDestroyed()) {
            Object[] objArr = new Object[3];
            objArr[0] = contactInfoUI.f202536n.getUsername();
            C30765p3 p3Var = this.f202561e;
            objArr[1] = p3Var != null ? p3Var.field_encryptUsername : "";
            objArr[2] = p3Var.field_username;
            Log.m105925i("MicroMsg.ContactInfoUI", "onNotifyFriendUserChange contact.user:%s, notify.user:%s, friendUser:%s", objArr);
            C72996z1 z1Var = contactInfoUI.f202536n;
            if (z1Var != null && this.f202561e != null && !Util.isNullOrNil(z1Var.getUsername()) && contactInfoUI.f202536n.getUsername().equals(this.f202561e.field_encryptUsername) && !C45628s0.m50751P(contactInfoUI.f202536n.getUsername())) {
                String str = this.f202561e.field_username;
                if (!Util.isNullOrNil(str) && !str.equals(contactInfoUI.f202536n.getUsername())) {
                    C115669n.INSTANCE.mo175911u(1430, 4);
                }
                if (!Util.isNullOrNil(str)) {
                    contactInfoUI.f202536n = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                }
                contactInfoUI.getIntent().putExtra("Contact_User", contactInfoUI.f202536n.getUsername());
                Log.m105925i("MicroMsg.ContactInfoUI", "new contact user:%s", contactInfoUI.f202536n.getUsername());
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
