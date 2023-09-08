package com.tencent.p014mm.plugin.game.luggage;

import android.os.PowerManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.plugin.game.luggage.page.C41962j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import js0.C88016e;
import ky1.C46803a;
import p826uc.C52512c;

/* renamed from: com.tencent.mm.plugin.game.luggage.f */
public class C41902f implements C52512c {

    /* renamed from: a */
    public C41962j f112899a;

    public C41902f(C41962j jVar) {
        this.f112899a = jVar;
    }

    /* renamed from: a */
    public WebResourceResponse mo25133a(String str) {
        String str2;
        Log.m105925i("MicroMsg.LuggageGameJsResourceProvider", "onResourceRequest, url = %s", str);
        boolean z = this.f112899a.getWePkgPlugin() != null ? this.f112899a.getWePkgPlugin().f125651d : false;
        Log.m105924i("MicroMsg.GameScriptManager", "getGameScriptResponse");
        String e = C88016e.m109548e("game.js");
        if (!Util.isNullOrNil(e)) {
            String replaceFirst = e.replaceFirst("#__usewepkg__#", String.valueOf(z));
            PowerManager powerManager = (PowerManager) MMApplicationContext.getContext().getSystemService("power");
            String replaceFirst2 = replaceFirst.replaceFirst("#__lowPowerMode__#", String.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false)).replaceFirst("#__lowPower__#", String.valueOf(false));
            if (C46803a.m52100d() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(FastJsonResponse.QUOTE);
                int ordinal = C46803a.m52100d().f125932h.ordinal();
                sb.append(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "none" : "destroyed" : "stopped" : StateEvent.ProcessResult.FAILED : "inited" : "initing");
                sb.append(FastJsonResponse.QUOTE);
                str2 = replaceFirst2.replaceFirst("#__jscore_state__#", sb.toString());
            } else {
                str2 = replaceFirst2.replaceFirst("#__jscore_state__#", "\"none\"");
            }
            try {
                WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", "utf-8", new ByteArrayInputStream(str2.getBytes("UTF-8")));
                HashMap hashMap = new HashMap();
                hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
                hashMap.put("Pragma", "no-cache");
                hashMap.put("Expires", "0");
                webResourceResponse.setResponseHeaders(hashMap);
                Log.m105924i("MicroMsg.GameScriptManager", "getGameScriptResponse end");
                return webResourceResponse;
            } catch (Exception e2) {
                Log.printDebugStack("MicroMsg.GameScriptManager", "", e2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public String mo25134b() {
        return "weixin://game.js";
    }
}
