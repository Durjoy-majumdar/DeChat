package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.p136ui.contact.C74562t0;

/* renamed from: com.tencent.mm.ui.contact.c */
public class C74467c implements C74562t0.C74564b {

    /* renamed from: a */
    public final /* synthetic */ AddressUI.AddressUIFragment f218969a;

    public C74467c(AddressUI.AddressUIFragment addressUIFragment) {
        this.f218969a = addressUIFragment;
    }

    /* renamed from: a */
    public void mo103526a(int i) {
        C74562t0 t0Var = this.f218969a.f218417G;
        if (t0Var != null) {
            if (i <= 0) {
                t0Var.setVisibility(8);
            } else {
                t0Var.setVisibility(0);
            }
        }
    }
}
