package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUIDeclarePromptIPC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$h */
public class AppBrandUI$$h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeAppOpenDeclarePromptBundle f246520d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$h$a */
    public class C84458a implements C1256g<IPCVoid> {
        public C84458a(AppBrandUI$$h appBrandUI$$h) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i("MicroMsg.AppBrandUI", "handleDeclarePrompt_onClick: AppBrandUIDeclarePromptIPC onCallback");
        }
    }

    public AppBrandUI$$h(AppBrandUI appBrandUI, WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle) {
        this.f246520d = weAppOpenDeclarePromptBundle;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.AppBrandUI", "handleDeclarePrompt: onClick");
        String mainProcessName = MMApplicationContext.getMainProcessName();
        WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = this.f246520d;
        C80907o.m98781d(mainProcessName, new AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam(weAppOpenDeclarePromptBundle.f157919d, false, weAppOpenDeclarePromptBundle.f157920e), AppBrandUIDeclarePromptIPC.class, new C84458a(this));
    }
}
