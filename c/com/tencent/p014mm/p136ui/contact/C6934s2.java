package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.contact.s2 */
public class C6934s2 implements MMSlideDelView.C73187h {

    /* renamed from: a */
    public final /* synthetic */ OpenIMAddressUI.OpenIMAddressUIFragment f24622a;

    public C6934s2(OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f24622a = openIMAddressUIFragment;
    }

    /* renamed from: a */
    public void mo7896a(Object obj) {
        if (obj == null) {
            Log.m105920e("MicroMsg.OpenIMAddressUI", "onItemDel object null");
        } else {
            OpenIMAddressUI.OpenIMAddressUIFragment.m88910K(this.f24622a, obj.toString(), true);
        }
    }
}
