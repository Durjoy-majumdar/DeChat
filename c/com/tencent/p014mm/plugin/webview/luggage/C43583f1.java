package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.luggage.f1 */
public class C43583f1 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117820d;

    public C43583f1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117820d = luggageWebViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = this.f117820d;
        luggageWebViewLongClickHelper.getClass();
        Log.m105924i("MicroMsg.LuggageWebViewLongClickHelper", "onFetchQrCodeResp");
        ((ScanCodeSheetItemLogic) luggageWebViewLongClickHelper.f117786h).mo67084o(bundle.getInt("key_resp_ret", -1), bundle.getByteArray("key_resp_item_bytes"));
    }
}
