package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import d62.C7240a;
import ke3.C88144b;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.chatroom.ui.e0 */
public class C1213e0 extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ ChatroomInfoUI f10244e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1213e0(ChatroomInfoUI chatroomInfoUI, int i, C53155r0 r0Var) {
        super(i, r0Var);
        this.f10244e = chatroomInfoUI;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/newreadtemplate?t=work_wechat/about_group");
        C88144b.m109791i(this.f10244e, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
