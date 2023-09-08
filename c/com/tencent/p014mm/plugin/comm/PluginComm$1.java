package com.tencent.p014mm.plugin.comm;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tencent.mm.plugin.comm.PluginComm$1 */
class PluginComm$1 extends IListener<ConfigUpdatedEvent> {
    public PluginComm$1(C29829h hVar, C0125s sVar) {
        super(sVar);
        this.__eventId = 320120113;
    }

    public boolean callback(IEvent iEvent) {
        if (!"clicfg_vfs_file_provider".equals(((ConfigUpdatedEvent) iEvent).f9044d.f9045a)) {
            return false;
        }
        File file = new File(MMApplicationContext.getContext().getCacheDir().getParentFile(), ".vfs/use-vfs-provider");
        if (!"0".equals(((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_vfs_file_provider", "0"))) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        } else {
            file.delete();
        }
        return true;
    }
}
