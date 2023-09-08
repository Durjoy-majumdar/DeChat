package com.tencent.luggage.sdk.customize.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.WebView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;

public class FullSdkExternalToolsHelper implements C40469j0 {

    public static class SimpleWebViewActivity extends BaseActivity {

        /* renamed from: z */
        public WebView f78572z;

        public int getLayoutId() {
            return C0966R.C0971layout.b_i;
        }

        public Resources getResources() {
            return MMApplicationContext.getResources();
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.f78572z = (WebView) findViewById(C0966R.C0970id.lm8);
            String stringExtra = getIntent().getStringExtra("_url_");
            this.f78572z.stopLoading();
            this.f78572z.loadUrl(stringExtra);
        }

        public void onNewIntent(Intent intent) {
            super.onNewIntent(intent);
            String stringExtra = intent.getStringExtra("_url_");
            this.f78572z.stopLoading();
            this.f78572z.loadUrl(stringExtra);
        }
    }

    /* renamed from: JF */
    public void mo56167JF(Context context, String str, String str2, C40469j0.C40470a aVar) {
        Log.m105919d("Luggage.FullSdkExternalToolsHelper", "open webview activity url: %s", str);
        Intent intent = new Intent(context, SimpleWebViewActivity.class);
        intent.putExtra("_url_", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/luggage/sdk/customize/impl/FullSdkExternalToolsHelper", "openWebViewActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/IExternalToolsHelper$SimpleWebViewLaunchParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/luggage/sdk/customize/impl/FullSdkExternalToolsHelper", "openWebViewActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/IExternalToolsHelper$SimpleWebViewLaunchParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
