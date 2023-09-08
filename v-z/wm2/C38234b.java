package wm2;

import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C75707s0;
import h81.C32735h;
import ob0.C35136m;
import p244tt.C14088e;
import te3.C51163rv3;
import te3.C77949j3;

/* renamed from: wm2.b */
public class C38234b extends IStaticListener<ConfigUpdatedEvent> {
    public boolean callback(IEvent iEvent) {
        ConfigUpdatedEvent.C1000a aVar;
        ConfigUpdatedEvent configUpdatedEvent = (ConfigUpdatedEvent) iEvent;
        if (!(configUpdatedEvent == null || (aVar = configUpdatedEvent.f9044d) == null)) {
            if (!Util.isNullOrNil(aVar.f9045a) && configUpdatedEvent.f9044d.f9045a.startsWith("clicfg_settings_plugin_wetype_reddot")) {
                Log.m105924i("MicroMsg.SubCoreSetting", "receive clicfg_settings_plugin_wetype_reddot config.");
                String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_settings_plugin_wetype_reddot, "");
                if (!Util.isNullOrNil(Y60)) {
                    try {
                        C77949j3 j3Var = new C77949j3();
                        j3Var.f227630g = 10002;
                        C51163rv3 rv32 = new C51163rv3();
                        rv32.f141175d = Y60;
                        rv32.f141176e = true;
                        j3Var.f227631h = rv32;
                        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo56403Fg(new C35136m.C35137a(j3Var, false, false, false));
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SubCoreSetting", e, (String) null, new Object[0]);
                    }
                }
            }
            if (!Util.isNullOrNil(configUpdatedEvent.f9044d.f9045a) && configUpdatedEvent.f9044d.f9045a.startsWith("clicfg_settings_plugin_params")) {
                Log.m105924i("MicroMsg.SubCoreSetting", "receive clicfg_settings_plugin_params config.");
                ((C14088e) C86312j.m106911c(C14088e.class)).u50("wxalitebf3a88de4da873052ba340892dc97559", (C115477b) null);
            }
        }
        return false;
    }
}
