package com.tencent.p014mm.plugin.lite;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.C115472a;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import i22.C46162a;
import kotlin.Metadata;
import tw3.C118552d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/LiteAppTaskPreloadReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.LiteAppTaskPreloadReceiver */
public final class LiteAppTaskPreloadReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.WxaLiteAppTaskPreloadReceiver", "onReceive NULL intent.");
            return;
        }
        C115478f.initLib();
        C115472a.C115473a aVar = C115472a.f346202a;
        aVar.mo175446b(6, new WxaLiteAppStartReport());
        if (intent.hasExtra("task") && intent.hasExtra("appId") && C87412m.m108589b(intent.getStringExtra("task"), "prelogin")) {
            String stringExtra = intent.getStringExtra("appId");
            WxaLiteAppInfo j = C115492q.m162360g().mo175472j(stringExtra);
            if (j == null) {
                Log.m105928w("MicroMsg.WxaLiteAppTaskPreloadReceiver", stringExtra + " is not existed");
            } else {
                C46162a.INSTANCE.mo71600a(LiteAppCenter.getAuthUrl(j.f339295i, j.f339290d, j.f339294h), true, new C42489e(j));
            }
        }
        if (intent.hasExtra("task") && C87412m.m108589b(intent.getStringExtra("task"), "updateBaseLibPath")) {
            Log.m105924i("MicroMsg.WxaLiteAppTaskPreloadReceiver", "receive set baselib path");
            aVar.mo175447c();
        }
        if (intent.hasExtra("task") && C87412m.m108589b(intent.getStringExtra("task"), "preloadLiteApp") && intent.hasExtra("appId")) {
            String stringExtra2 = intent.getStringExtra("appId");
            Log.m105924i("MicroMsg.WxaLiteAppTaskPreloadReceiver", "receive preload liteapp: " + stringExtra2);
            WxaLiteAppInfo j2 = C115492q.m162360g().mo175472j(stringExtra2);
            if (j2 == null) {
                Log.m105928w("MicroMsg.WxaLiteAppTaskPreloadReceiver", stringExtra2 + " is not existed");
                return;
            }
            int j3 = C118552d.m167207g().mo183270j(Boolean.TRUE);
            if (intent.hasExtra("path")) {
                LiteAppCenter.preloadView(stringExtra2, intent.getStringExtra("path"), C86013q1.m106448i(j2.f339295i, true), j2.f339294h, j3);
            } else {
                LiteAppCenter.preloadIndexView(stringExtra2, C86013q1.m106448i(j2.f339295i, true), j2.f339294h, j3);
            }
        }
    }
}
