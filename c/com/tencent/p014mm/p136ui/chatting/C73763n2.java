package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.n2 */
public class C73763n2 extends C73684f2 {
    public C73763n2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        String str = t8Var.f217982p;
        String str2 = t8Var.f217983q;
        String str3 = t8Var.f217984r;
        String str4 = t8Var.f217987u;
        if (!Util.isNullOrNil(str4)) {
            Intent intent = new Intent();
            intent.putExtra("extra_ip_set_key", str4);
            intent.putExtra("EXTRA_IP_SET_NAME", str);
            intent.putExtra("EXTRA_IP_SET_DESC", str2);
            intent.putExtra("EXTRA_IP_SET_URL", str3);
            C88144b.m109791i(bVar.mo91565f(), "emoji", ".ui.EmojiDesignerIPInfoUI", intent, (Bundle) null);
            return;
        }
        Log.m105924i("MicroMsg.EmotionSetClickListener", "setKey is null.");
    }
}
