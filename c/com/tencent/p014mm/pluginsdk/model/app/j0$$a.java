package com.tencent.p014mm.pluginsdk.model.app;

import android.app.Activity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.pluginsdk.model.app.j0$$a */
public final /* synthetic */ class j0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f23962d;

    /* renamed from: e */
    public final /* synthetic */ String f23963e;

    public /* synthetic */ j0$$a(Activity activity, String str) {
        this.f23962d = activity;
        this.f23963e = str;
    }

    public final void run() {
        Activity activity = this.f23962d;
        String str = this.f23963e;
        Class cls = C32735h.class;
        if (activity != null && !activity.isFinishing()) {
            try {
                String c = C72688j0.m85017c(activity);
                if (Util.isEqual(c, MMApplicationContext.getApplicationId())) {
                    Log.m105924i("MicroMsg.AppUtilities", "checkLaunchWebViewSource callPackage in mm.");
                    return;
                }
                C115669n.INSTANCE.mo160131h(25864, str.replace(',', '.'), c);
                boolean z = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_webview_block_unknown_source, 0) == 1;
                Log.m105925i("MicroMsg.AppUtilities", "checkLaunchWebViewSource callPackage=%s, blockUnknownSource=%b", c, Boolean.valueOf(z));
                if (!z) {
                    String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_webview_block_open_source_list, "com.meizu.media.music");
                    if (!Util.isNullOrNil(Y60)) {
                        Log.m105925i("MicroMsg.AppUtilities", "checkLaunchWebViewSource blockList=%s", c);
                        for (String isEqual : Y60.split(";")) {
                            if (Util.isEqual(isEqual, c)) {
                                Log.m105924i("MicroMsg.AppUtilities", "checkLaunchWebViewSource callPackage in block list, just finish.");
                                activity.finish();
                                return;
                            }
                        }
                    }
                } else if (!Util.isNullOrNil(str)) {
                    activity.finish();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppUtilities", "checkLaunchWebViewSource ex:%s", e.getMessage());
            }
        }
    }
}
