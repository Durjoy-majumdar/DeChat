package com.tencent.p014mm.pluginsdk.model.app;

import android.app.Activity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.tencent.mm.pluginsdk.model.app.i0 */
public class C6649i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f23960d;

    /* renamed from: e */
    public final /* synthetic */ String f23961e;

    public C6649i0(Activity activity, String str) {
        this.f23960d = activity;
        this.f23961e = str;
    }

    public void run() {
        String str;
        Activity activity = this.f23960d;
        if (activity != null && !activity.isFinishing()) {
            Log.m105926v("MicroMsg.AppUtil", "reportLaunchWechat");
            try {
                String c = C72688j0.m85017c(this.f23960d);
                if (!Util.isNullOrNil(c) || !Util.isNullOrNil(this.f23961e)) {
                    if (!Util.isNullOrNil(this.f23961e)) {
                        try {
                            str = URLEncoder.encode(this.f23961e, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                            Log.m105920e("MicroMsg.AppUtil", "reportLaunchWechat parse fail");
                        }
                        C115669n.INSTANCE.mo160131h(17591, "", c, str, 0);
                        Boolean bool = Boolean.FALSE;
                        Log.m105925i("MicroMsg.AppUtil", "reportLaunchWechat callPackage=%s, isCategoryHome = %b, url=%s, isCategoryHome= %b", c, bool, str, bool);
                    }
                    str = "";
                    C115669n.INSTANCE.mo160131h(17591, "", c, str, 0);
                    Boolean bool2 = Boolean.FALSE;
                    Log.m105925i("MicroMsg.AppUtil", "reportLaunchWechat callPackage=%s, isCategoryHome = %b, url=%s, isCategoryHome= %b", c, bool2, str, bool2);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppUtil", "reportLaunchWechat ex:%s", e.getMessage());
            }
        }
    }
}
