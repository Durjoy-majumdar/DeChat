package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$b */
public final /* synthetic */ class WXCustomSchemeEntryActivity$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WXCustomSchemeEntryActivity f247906d;

    public /* synthetic */ WXCustomSchemeEntryActivity$$b(WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity) {
        this.f247906d = wXCustomSchemeEntryActivity;
    }

    public final void run() {
        WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity = this.f247906d;
        int i = WXCustomSchemeEntryActivity.f247903e;
        wXCustomSchemeEntryActivity.getClass();
        Log.m105924i("MicroMsg.WXCustomSchemeEntryActivity", "onDeepLinkDone");
        wXCustomSchemeEntryActivity.finish();
    }
}
