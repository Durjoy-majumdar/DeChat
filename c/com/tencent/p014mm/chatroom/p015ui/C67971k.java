package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.chatroom.ui.k */
public class C67971k implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ ChatroomInfoUI f195099a;

    public C67971k(ChatroomInfoUI chatroomInfoUI) {
        this.f195099a = chatroomInfoUI;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.ChatroomInfoUI", "OpenLiteApp success");
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.ChatroomInfoUI", "OpenLiteApp fail");
        Intent intent = new Intent();
        intent.putExtra("k_username", this.f195099a.f194770B);
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{36}));
        C88144b.m109791i(this.f195099a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
