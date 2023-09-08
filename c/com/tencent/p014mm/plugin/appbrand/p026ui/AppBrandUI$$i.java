package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUIDeclarePromptIPC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$i */
public class AppBrandUI$$i implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WeAppOpenDeclarePromptBundle f246521d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$i$a */
    public class C84459a implements C1256g<IPCVoid> {
        public C84459a(AppBrandUI$$i appBrandUI$$i) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i("MicroMsg.AppBrandUI", "handleDeclarePrompt_onCancel: AppBrandUIDeclarePromptIPC onCallback");
        }
    }

    public AppBrandUI$$i(AppBrandUI appBrandUI, WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle) {
        this.f246521d = weAppOpenDeclarePromptBundle;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.AppBrandUI", "handleDeclarePrompt: onCancel");
        String mainProcessName = MMApplicationContext.getMainProcessName();
        WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = this.f246521d;
        C80907o.m98781d(mainProcessName, new AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam(weAppOpenDeclarePromptBundle.f157919d, true, weAppOpenDeclarePromptBundle.f157920e), AppBrandUIDeclarePromptIPC.class, new C84459a(this));
    }
}
