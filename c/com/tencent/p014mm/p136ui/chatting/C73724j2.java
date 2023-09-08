package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.storage.C72963f4;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.j2 */
public class C73724j2 extends C73684f2 {
    public C73724j2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        int i = t8Var.f217978l;
        String str = t8Var.f217979m;
        String str2 = t8Var.f217980n;
        if (i != 0) {
            Intent intent = new Intent();
            intent.putExtra("geta8key_username", bVar.mo91577r());
            intent.putExtra("rawUrl", t8Var.f217988v);
            intent.putExtra("uin", i);
            intent.putExtra("name", str);
            intent.putExtra("rediret_url", str2);
            intent.putExtra("extra_scence", 22);
            C88144b.m109791i(bVar.mo91565f(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", intent, (Bundle) null);
        }
    }
}
