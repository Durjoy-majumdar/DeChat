package com.tencent.p014mm.plugin.dbbackup;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86312j;
import h81.C32735h;
import java.io.File;

/* renamed from: com.tencent.mm.plugin.dbbackup.SubCoreDBBackup$7 */
class SubCoreDBBackup$7 extends IListener<ConfigUpdatedEvent> {

    /* renamed from: d */
    public final /* synthetic */ boolean f345830d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubCoreDBBackup$7(C0125s sVar, boolean z) {
        super(sVar);
        this.f345830d = z;
        this.__eventId = 320120113;
    }

    public boolean callback(IEvent iEvent) {
        ConfigUpdatedEvent configUpdatedEvent = (ConfigUpdatedEvent) iEvent;
        Class cls = C32735h.class;
        if ("clicfg_vfs_db_protect".equals(configUpdatedEvent.f9044d.f9045a)) {
            String str = (this.f345830d || !"0".equals(((C32735h) C86312j.m106911c(cls)).mo58776F5("clicfg_vfs_db_protect", "0"))) ? "lt-t-t-ttt" : "ll-l-l-lll";
            C116281f0.C116283b b = C116281f0.C116289i.f348994a.mo177789b();
            b.mo177806f("dbProtect", str);
            b.mo177801a();
            return true;
        } else if (!"clicfg_vfs_db_protect_assert".equals(configUpdatedEvent.f9044d.f9045a)) {
            return false;
        } else {
            if (!"0".equals(((C32735h) C86312j.m106911c(cls)).mo58776F5("clicfg_vfs_db_protect_assert", "0"))) {
                C116299g2.m163864t("vfs_db_protect_assert");
                return true;
            }
            new File(MMApplicationContext.getContext().getCacheDir().getParentFile(), ".vfs/vfs_db_protect_assert.timestamp").delete();
            return true;
        }
    }
}
