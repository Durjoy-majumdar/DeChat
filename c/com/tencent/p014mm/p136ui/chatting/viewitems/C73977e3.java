package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C7240a;
import ke3.C88144b;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.e3 */
public class C73977e3 extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ C67391b f217097e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73977e3(C73921a3 a3Var, int i, C53155r0 r0Var, C67391b bVar) {
        super(i, r0Var);
        this.f217097e = bVar;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        if (getTag() != null && (getTag() instanceof String)) {
            String str = (String) getTag();
            Log.m105925i("MicroMsg.ChattingItemAppMsgPat", "click %s", str);
            Intent putExtra = new Intent().putExtra("Contact_User", str);
            putExtra.putExtra("Contact_ChatRoomId", this.f217097e.mo91577r());
            putExtra.putExtra("CONTACT_INFO_UI_SOURCE", 21);
            putExtra.putExtra("Contact_Scene", 14);
            C88144b.m109791i(this.f217097e.mo91565f(), Scopes.PROFILE, ".ui.ContactInfoUI", putExtra, (Bundle) null);
        }
    }
}
