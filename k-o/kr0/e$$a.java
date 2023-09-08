package kr0;

import android.text.TextUtils;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineRuntime;
import p176jc.C87919d;

public final /* synthetic */ class e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88267e f255139d;

    /* renamed from: e */
    public final /* synthetic */ AppServiceSkylineExtensionImpl f255140e;

    public /* synthetic */ e$$a(C88267e eVar, AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        this.f255139d = eVar;
        this.f255140e = appServiceSkylineExtensionImpl;
    }

    public final void run() {
        C88267e eVar = this.f255139d;
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f255140e;
        String str = eVar.getRuntime().f238147j;
        SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl.f235027d;
        if (skylineRuntime != null) {
            if (str == null || TextUtils.isEmpty(str)) {
                Log.m105928w("MicroMsg.AppBrandServiceWC", "appId is null");
                return;
            }
            boolean z = (C87919d.f254463g && str.equals("wxb1320569c2a2b6d2")) || ((Boolean) C87919d.f254460d.mo124238b(C87919d.f254457a, C87919d.f254458b[0])).booleanValue();
            if (!BuildInfo.IS_ARM64) {
                z = false;
            }
            skylineRuntime.enableCronet(z);
            Log.m105919d("MicroMsg.AppBrandServiceWC", "enable cronet=[%b]", Boolean.valueOf(z));
        }
    }
}
