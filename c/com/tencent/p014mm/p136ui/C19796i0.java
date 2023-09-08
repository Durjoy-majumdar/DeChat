package com.tencent.p014mm.p136ui;

import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.i0 */
public class C19796i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f56324d;

    /* renamed from: e */
    public final /* synthetic */ FindMoreFriendsUI f56325e;

    public C19796i0(FindMoreFriendsUI findMoreFriendsUI, Intent intent) {
        this.f56325e = findMoreFriendsUI;
        this.f56324d = intent;
    }

    public void run() {
        C88144b.m109791i(this.f56325e.getContext(), "webview", ".ui.tools.WebViewUI", this.f56324d, (Bundle) null);
    }
}
