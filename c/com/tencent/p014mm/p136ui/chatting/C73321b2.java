package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.chatting.b2 */
public class C73321b2 extends C73326c2 {
    public C73321b2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo102139a(Intent intent, C74243t8 t8Var) {
        if (!Util.isNullOrNil(t8Var.f217990x)) {
            intent.putExtra("Contact_BIZ_KF_WORKER_ID", t8Var.f217990x);
        }
    }
}
