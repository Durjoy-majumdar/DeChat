package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.k2 */
public class C73736k2 extends C73684f2 {
    public C73736k2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        int i = t8Var.f217981o;
        String str = t8Var.f217982p;
        String str2 = t8Var.f217983q;
        String str3 = t8Var.f217984r;
        String str4 = t8Var.f217985s;
        int i2 = t8Var.f217986t;
        if (i != 0) {
            Intent intent = new Intent();
            intent.putExtra("geta8key_username", bVar.mo91577r());
            intent.putExtra("rawUrl", t8Var.f217988v);
            intent.putExtra("set_id", i);
            intent.putExtra("set_title", str);
            intent.putExtra("set_iconURL", str3);
            intent.putExtra("set_desc", str2);
            intent.putExtra("headurl", str4);
            intent.putExtra("pageType", i2);
            C88144b.m109791i(bVar.mo91565f(), "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", intent, (Bundle) null);
            return;
        }
        Log.m105924i("MicroMsg.DesignerClickListener", "topic id is zero.");
    }
}
