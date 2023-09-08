package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.contact.n */
public class C6893n implements MMSlideDelView.C73187h {

    /* renamed from: a */
    public final /* synthetic */ AddressUI.AddressUIFragment f24529a;

    public C6893n(AddressUI.AddressUIFragment addressUIFragment) {
        this.f24529a = addressUIFragment;
    }

    /* renamed from: a */
    public void mo7896a(Object obj) {
        if (obj == null) {
            Log.m105920e("MicroMsg.AddressUI", "onItemDel object null");
        } else {
            AddressUI.AddressUIFragment.m88795X(this.f24529a, obj.toString(), true);
        }
    }
}
