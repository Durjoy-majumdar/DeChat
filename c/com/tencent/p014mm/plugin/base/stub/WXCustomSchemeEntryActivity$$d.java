package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$d */
public final /* synthetic */ class WXCustomSchemeEntryActivity$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WXCustomSchemeEntryActivity f247907d;

    public /* synthetic */ WXCustomSchemeEntryActivity$$d(WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity) {
        this.f247907d = wXCustomSchemeEntryActivity;
    }

    public final void run() {
        WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity = this.f247907d;
        int i = WXCustomSchemeEntryActivity.f247903e;
        wXCustomSchemeEntryActivity.getClass();
        Log.m105924i("MicroMsg.WXCustomSchemeEntryActivity", "onDeepLinkDone");
        wXCustomSchemeEntryActivity.finish();
    }
}
