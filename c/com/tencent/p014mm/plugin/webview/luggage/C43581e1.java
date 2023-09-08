package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import p200lx.C61416x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.e1 */
public class C43581e1 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117818d;

    public C43581e1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117818d = luggageWebViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String string = bundle.getString("result");
        int i = bundle.getInt("code_type");
        int i2 = bundle.getInt("code_version");
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = this.f117818d;
        luggageWebViewLongClickHelper.getClass();
        Log.m105924i("MicroMsg.LuggageWebViewLongClickHelper", "onGetQRCodeResult");
        if (!(luggageWebViewLongClickHelper.f117787i == null)) {
            luggageWebViewLongClickHelper.f117779a = string;
            luggageWebViewLongClickHelper.f117780b = i;
            luggageWebViewLongClickHelper.f117781c = i2;
            MMHandlerThread.postToMainThread(new C43590g1(luggageWebViewLongClickHelper));
            if (Util.isNullOrNil(luggageWebViewLongClickHelper.f117779a)) {
                Log.m105928w("MicroMsg.LuggageWebViewLongClickHelper", "processGetWXACodeNickName mResultOfImageUrl nil");
            } else if (((C61416x) C86312j.m106911c(C61416x.class)).mo72002rO(luggageWebViewLongClickHelper.f117780b, luggageWebViewLongClickHelper.f117779a)) {
                Log.m105924i("MicroMsg.LuggageWebViewLongClickHelper", "processGetWXACodeNickName");
                Bundle bundle2 = new Bundle();
                bundle2.putString("wxa_result", luggageWebViewLongClickHelper.f117779a);
                bundle2.putInt("wxa_code_type", luggageWebViewLongClickHelper.f117780b);
                bundle2.putInt("wxa_code_version", luggageWebViewLongClickHelper.f117781c);
                bundle2.putInt("type", 4);
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle2, LuggageWebViewLongClickHelper.QBarLogicTask.class, new C43583f1(luggageWebViewLongClickHelper));
            }
        }
    }
}
