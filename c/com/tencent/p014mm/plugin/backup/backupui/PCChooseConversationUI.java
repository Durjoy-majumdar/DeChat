package com.tencent.p014mm.plugin.backup.backupui;

import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import ev0.C20612a;
import ev0.C20615b;
import ev0.C20633g;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import qv0.C101304e;
import yu0.C102912i;
import yu0.C102913k;
import yu0.C23368l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/backup/backupui/PCChooseConversationUI;", "Lcom/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.backup.backupui.PCChooseConversationUI */
public final class PCChooseConversationUI extends BackupMoveChooseUI {
    /* renamed from: N7 */
    public void mo22638N7() {
        LinkedList<C102912i> a = this.f49982e.mo31847a(new PLong(), new PInt());
        C20612a.m22480i().mo32276l().mo17698b(C102913k.m136056u(a));
        Log.m105925i("MicroMsg.ChooseConversationUI", "initView OnMenuItemClickListener startbackup choose records finish, selectedConversation size[%d], timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", Integer.valueOf(a.size()), Integer.valueOf(this.f49995u), Long.valueOf(this.f49997w), Long.valueOf(this.f49998x), Integer.valueOf(this.f49996v));
        mo22640P7().mo140772i(a);
        if (mo22758X7().f58031h) {
            mo22758X7().mo32281e(mo22758X7().mo32283g());
            C20612a.m22480i().mo142622e().mo142628f(12);
            C20612a.m22480i().mo32276l().mo32305c((long) a.size());
            mo22644T7(a);
        } else {
            C20612a.m22480i().mo142622e().mo142628f(12);
            C40359h0.m43530l1("weixin", 17);
        }
        finish();
    }

    /* renamed from: P7 */
    public C101304e mo22640P7() {
        C101304e m = C20612a.m22480i().mo32277m();
        C87412m.m108593f(m, "getBackupPcModel().moveChooseServer");
        return m;
    }

    /* renamed from: Q7 */
    public C23368l mo22641Q7() {
        C20633g l = C20612a.m22480i().mo32276l();
        C87412m.m108593f(l, "getBackupPcModel().backupPcServer");
        return l;
    }

    /* renamed from: T7 */
    public void mo22644T7(LinkedList<C102912i> linkedList) {
        C87412m.m108594g(linkedList, "selectedConversation");
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(400, 8, 1, false);
        nVar.mo160131h(13735, 10, Integer.valueOf(mo22758X7().f58038o));
        int i = this.f49995u;
        if (i == 1 && this.f49996v == 1) {
            C115669n nVar2 = nVar;
            nVar2.idkeyStat(400, 32, 1, false);
            nVar2.idkeyStat(400, 35, 1, false);
            nVar.mo160131h(13735, 13, Integer.valueOf(mo22758X7().f58038o));
        } else if (i == 1) {
            nVar.idkeyStat(400, 32, 1, false);
            nVar.mo160131h(13735, 11, Integer.valueOf(mo22758X7().f58038o));
        } else if (this.f49996v == 1) {
            nVar.idkeyStat(400, 35, 1, false);
            nVar.mo160131h(13735, 12, Integer.valueOf(mo22758X7().f58038o));
        }
    }

    /* renamed from: X7 */
    public final C20615b mo22758X7() {
        C20615b j = C20612a.m22480i().mo32274j();
        C87412m.m108593f(j, "getBackupPcModel().backupPcProcessMgr");
        return j;
    }
}
