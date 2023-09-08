package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashSet;
import rx3.C13601g;
import rx3.C36570n;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.webview.model.z1 */
public final class C6071z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f22375d;

    /* renamed from: e */
    public final /* synthetic */ C6067y1 f22376e;

    public C6071z1(Bundle bundle, C6067y1 y1Var) {
        this.f22375d = bundle;
        this.f22376e = y1Var;
    }

    public final void run() {
        String string = this.f22375d.getString("host");
        C13601g<Boolean> gVar = C6067y1.f22367c;
        if (!C110818d0.m150903D((HashSet) ((C36570n) C6067y1.f22368d).getValue(), string)) {
            String string2 = this.f22375d.getString(TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP);
            String str = this.f22376e.f22369a + ',' + string + ',' + string2;
            if (!this.f22376e.f22370b.contains(str)) {
                Log.m105918d("MicroMsg.WebviewReporter", "doReportIp mRequestId: " + this.f22376e.f22369a + ", host: " + string + ", ip: " + string2);
                if (!(string == null || string.length() == 0)) {
                    if (!(string2 == null || string2.length() == 0)) {
                        C115669n.INSTANCE.mo160131h(26701, Long.valueOf(this.f22376e.f22369a), string, string2);
                        this.f22376e.f22370b.add(str);
                    }
                }
            }
        }
    }
}
