package com.tencent.p014mm.plugin.lite.logic;

import android.content.Intent;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.LiteAppTaskPreloadReceiver;
import com.tencent.p014mm.plugin.lite.api.C115476a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.lite.logic.m */
public class C115488m implements C115476a {

    /* renamed from: a */
    public final /* synthetic */ long f346234a;

    /* renamed from: b */
    public final /* synthetic */ WxaLiteAppBaselibInfo f346235b;

    /* renamed from: c */
    public final /* synthetic */ C115492q f346236c;

    public C115488m(C115492q qVar, long j, WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        this.f346236c = qVar;
        this.f346234a = j;
        this.f346235b = wxaLiteAppBaselibInfo;
    }

    /* renamed from: a */
    public void mo175450a(int i) {
        long currentTimeMillis = System.currentTimeMillis() - this.f346234a;
        if (currentTimeMillis > 10000 || currentTimeMillis < 0) {
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception fail errCode=%d start=%d now=%d", Integer.valueOf(i), Long.valueOf(this.f346234a), Long.valueOf(System.currentTimeMillis()));
        }
        this.f346236c.mo175479q(i, LiteAppCenter.LITE_APP_BASE_LIB, currentTimeMillis, 0, 0, 0, 2);
    }

    /* renamed from: b */
    public void mo175451b(WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo, int i) {
        WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo2 = wxaLiteAppBaselibInfo;
        long currentTimeMillis = System.currentTimeMillis() - this.f346234a;
        if (currentTimeMillis > 10000 || currentTimeMillis < 0) {
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception succ errCode=%d start=%d now=%d", Integer.valueOf(i), Long.valueOf(this.f346234a), Long.valueOf(System.currentTimeMillis()));
        }
        this.f346236c.mo175479q(i, LiteAppCenter.LITE_APP_BASE_LIB, currentTimeMillis, 0, 0, 0, 2);
        if (wxaLiteAppBaselibInfo2 != null) {
            WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo3 = this.f346235b;
            if (wxaLiteAppBaselibInfo3 == null || (!wxaLiteAppBaselibInfo3.f339285h.equals(wxaLiteAppBaselibInfo2.f339285h) && C115492q.m162360g().mo175474l(LiteAppCenter.LITE_APP_BASE_LIB, true))) {
                Intent intent = new Intent();
                intent.setClass(MMApplicationContext.getContext(), LiteAppTaskPreloadReceiver.class);
                intent.addFlags(268435456);
                intent.putExtra("task", "updateBaseLibPath");
                intent.putExtra("path", wxaLiteAppBaselibInfo2.f339285h);
                MMApplicationContext.getContext().sendBroadcast(intent);
            }
        }
    }
}
