package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.e0 */
public final class C82959e0 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C82975k0, C13598b0> f242584d;

    public C82959e0(C32226l<? super C82975k0, C13598b0> lVar) {
        this.f242584d = lVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i != C82961f0.f242592b) {
            Log.m105924i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, requestCode: " + i + " is not match");
        } else if (i2 != -1) {
            Log.m105924i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, resultCode is not RESULT_OK: " + i2);
            this.f242584d.invoke(C82975k0.CANCEL);
        } else {
            this.f242584d.invoke(C82975k0.SUCCESS);
        }
    }
}
