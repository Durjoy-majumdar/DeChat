package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Intent;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ShellExecEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import p447aw.C103918d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/voip/ui/VoipAutomatedTestSetupShell$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ShellExecEvent;", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.ui.VoipAutomatedTestSetupShell$listener$1 */
public final class VoipAutomatedTestSetupShell$listener$1 extends IListener<ShellExecEvent> {
    public VoipAutomatedTestSetupShell$listener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        ShellExecEvent shellExecEvent = (ShellExecEvent) iEvent;
        C87412m.m108594g(shellExecEvent, "event");
        if (WeChatEnvironment.hasDebugger() && C87412m.m108589b(shellExecEvent.f78980d.f78982b, "wechat.shell.SET_VOIP_SETTING_CUSTOM")) {
            VoipAutomatedTestSetupShell voipAutomatedTestSetupShell = VoipAutomatedTestSetupShell.f82264a;
            Intent intent = shellExecEvent.f78980d.f78981a;
            C87412m.m108593f(intent, "event.data.intent");
            ((C103918d) C86312j.m106911c(C103918d.class)).M70(1, new C30538g0(intent.getStringExtra("config_path")), new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        return true;
    }
}
