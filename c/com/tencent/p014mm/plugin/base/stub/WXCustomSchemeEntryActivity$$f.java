package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$f */
public final /* synthetic */ class WXCustomSchemeEntryActivity$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WXCustomSchemeEntryActivity f247909d;

    public /* synthetic */ WXCustomSchemeEntryActivity$$f(WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity) {
        this.f247909d = wXCustomSchemeEntryActivity;
    }

    public final void run() {
        WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity = this.f247909d;
        int i = WXCustomSchemeEntryActivity.f247903e;
        wXCustomSchemeEntryActivity.getClass();
        Log.m105924i("MicroMsg.WXCustomSchemeEntryActivity", "onDeepLinkDone");
        wXCustomSchemeEntryActivity.finish();
    }
}
