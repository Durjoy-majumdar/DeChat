package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.x1 */
public final class C6579x1 implements C86297n {
    /* renamed from: a */
    public void mo1541a(int i, String str) {
        Log.m105924i("MicroMsg.prerenderMiniProgram", "prerender mini pro fail,errCode:" + i + ",errMsg:" + str);
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.prerenderMiniProgram", "prerender mini pro success!");
    }
}
