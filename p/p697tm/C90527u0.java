package p697tm;

import com.tencent.p014mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import f40.C86709a0;

/* renamed from: tm.u0 */
public class C90527u0 extends IStaticListener<AppBrandVoipCheckIsDeviceUsingEvent> {
    public boolean callback(IEvent iEvent) {
        AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = (AppBrandVoipCheckIsDeviceUsingEvent) iEvent;
        if (C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.SubCoreAppBrand", "callback AppBrandVoipCheckIsDeviceUsingEvent true");
            Class cls = C81591s.class;
            if (C86312j.m106916h(cls)) {
                for (AppBrandBackgroundRunningApp next : ((C81591s) C86312j.m106911c(cls)).mo113854fA()) {
                    if (C81583j.m100070b(next.f239209f, 16)) {
                        Log.m105925i("MicroMsg.SubCoreAppBrand", "checkVoIPDeviceOccupy, already exist wxa using VOIP 1v1, appId:%s", next.f239207d);
                        appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b = true;
                        if (MultiProcessMMKV.getMMKV("" + next.f239207d + "_wxa_voip").getBoolean("isCameraStart", false)) {
                            Log.m105924i("MicroMsg.SubCoreAppBrand", "isCameraStart true");
                            appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a = true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
