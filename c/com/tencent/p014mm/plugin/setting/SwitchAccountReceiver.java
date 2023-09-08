package com.tencent.p014mm.plugin.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Locale;
import lg3.C88494d;
import lg3.C88496e;
import lg3.C88500i;
import lg3.C88504k;

/* renamed from: com.tencent.mm.plugin.setting.SwitchAccountReceiver */
public class SwitchAccountReceiver extends BroadcastReceiver {

    /* renamed from: com.tencent.mm.plugin.setting.SwitchAccountReceiver$a */
    public class C85415a implements MMApplicationContext.IResourceProvider {

        /* renamed from: a */
        public final /* synthetic */ Context f248932a;

        /* renamed from: b */
        public final /* synthetic */ String f248933b;

        public C85415a(SwitchAccountReceiver switchAccountReceiver, Context context, String str) {
            this.f248932a = context;
            this.f248933b = str;
        }

        public Resources getResources() {
            Resources resources = this.f248932a.getApplicationContext().getResources();
            return new C88496e(resources, C88504k.m110378f(this.f248932a.getApplicationContext(), this.f248933b), new C88500i(), new C88494d(resources.getDisplayMetrics()));
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String stringExtra = intent.getStringExtra("switch_process_action_code_key");
            Log.m105925i("MicroMsg.SwitchAccountReceiver", "onReceive, action %s", stringExtra);
            if (!Util.isNullOrNil(stringExtra) && stringExtra.equals("action_reload_resources")) {
                String stringExtra2 = intent.getStringExtra("switch_language");
                Log.m105925i("MicroMsg.SwitchAccountReceiver", "onReceive, language %s", stringExtra2);
                Locale transLanguageToLocale = LocaleUtil.transLanguageToLocale(stringExtra2);
                if ("language_default".equalsIgnoreCase(stringExtra2)) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        transLanguageToLocale = LocaleUtil.sysDefaultLocale;
                        Locale.setDefault(transLanguageToLocale);
                    } else {
                        transLanguageToLocale = Locale.getDefault();
                    }
                }
                LocaleUtil.updateApplicationResourceLocale(context.getApplicationContext(), transLanguageToLocale);
                MMApplicationContext.setResourcesProvider(new C85415a(this, context, stringExtra2));
            }
        }
    }
}
