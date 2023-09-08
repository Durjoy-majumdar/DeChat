package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.o */
public class C74533o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AddressUI.AddressUIFragment f219101d;

    /* renamed from: com.tencent.mm.ui.contact.o$a */
    public class C74534a implements Runnable {
        public C74534a() {
        }

        public void run() {
            C74533o.this.f219101d.f218414D.setVisible(true);
        }
    }

    public C74533o(AddressUI.AddressUIFragment addressUIFragment) {
        this.f219101d = addressUIFragment;
    }

    public void run() {
        C86709a0.m107528h();
        if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69671T3("@social.black.android", (String) null, (List<String>) null) > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, Boolean.TRUE);
            this.f219101d.f218414D.post(new C74534a());
        }
    }
}
