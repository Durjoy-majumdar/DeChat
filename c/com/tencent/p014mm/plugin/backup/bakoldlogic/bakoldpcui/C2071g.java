package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.g */
public class C2071g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f12022d;

    /* renamed from: e */
    public final /* synthetic */ BakWaitingUI f12023e;

    public C2071g(BakWaitingUI bakWaitingUI, int i) {
        this.f12023e = bakWaitingUI;
        this.f12022d = i;
    }

    public void run() {
        Log.m105919d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", Integer.valueOf(this.f12022d));
        if (this.f12022d == -1) {
            Log.m105918d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
            Intent intent = new Intent();
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f12023e.getString(C0966R.string.ad_));
            intent.putExtra("rawUrl", this.f12023e.getString(C0966R.string.ac6, new Object[]{LocaleUtil.getApplicationLanguage()}));
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            C88144b.m109791i(this.f12023e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
