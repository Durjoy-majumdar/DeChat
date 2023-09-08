package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;

/* renamed from: com.tencent.mm.plugin.webview.luggage.d1 */
public class C43579d1 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117816a;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.d1$a */
    public class C43580a implements C1256g<Bundle> {
        public C43580a() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            MMHandlerThread.postToMainThread(new C43576c1(this, (Bundle) obj));
        }
    }

    public C43579d1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117816a = luggageWebViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("image_path", str);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, LuggageWebViewLongClickHelper.C5868g.class, new C43580a());
    }
}
