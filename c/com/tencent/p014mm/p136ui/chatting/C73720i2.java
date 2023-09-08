package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.storage.C72963f4;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.i2 */
public class C73720i2 extends C73684f2 {
    public C73720i2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        Intent intent = new Intent();
        intent.putExtra("geta8key_username", bVar.mo91577r());
        intent.putExtra("rawUrl", ((C74243t8) view.getTag()).f217988v);
        C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
