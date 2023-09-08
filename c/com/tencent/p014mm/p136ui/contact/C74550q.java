package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.p136ui.contact.C74599y2;

/* renamed from: com.tencent.mm.ui.contact.q */
public class C74550q implements C74599y2.C74600a {

    /* renamed from: a */
    public final /* synthetic */ AddressUI.AddressUIFragment f219150a;

    public C74550q(AddressUI.AddressUIFragment addressUIFragment) {
        this.f219150a = addressUIFragment;
    }

    /* renamed from: a */
    public void mo103608a(int i) {
        AddressUI.AddressUIFragment addressUIFragment = this.f219150a;
        C74599y2 y2Var = addressUIFragment.f218416F;
        if (y2Var != null && addressUIFragment.f218445z != null) {
            if (i <= 0) {
                y2Var.setVisibility(8);
                this.f219150a.f218445z.mo103321d(true);
                return;
            }
            y2Var.setVisibility(0);
            this.f219150a.f218445z.mo103321d(false);
        }
    }
}
